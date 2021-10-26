/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.sql;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import java.util.regex.Pattern;

// line 14 "../../../../../UmpleTLTemplates/sqlClassGenerator.ump"
public class SqlClassGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "-- PLEASE DO NOT EDIT THIS CODE" + NL + "-- This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL;
  public static final String TEXT_3 = NL;
  public static final String TEXT_4 = NL + "CREATE TABLE IF NOT EXISTS ";
  public static final String TEXT_5 = NL + "(";
  public static final String TEXT_6 = "  ";
  public static final String TEXT_7 = NL + ");" + NL;
  public static final String TEXT_8 = "";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SqlClassGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 24 "../../../../../UmpleTLTemplates/sqlClassGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 31 "../../../../../UmpleTLTemplates/sqlClassGenerator.ump"
   private void append(StringBuilder buffer, String input, Object... variables){
    buffer.append(StringFormatter.format(input,variables));
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getCode(Integer numSpaces, StringBuilder sb, UmpleModel model, UmpleElement uElement){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    /*sqlClassGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  UmpleClass uClass = (UmpleClass) uElement;
  GeneratedClass gClass = uClass.getGeneratedClass();
  SqlGenerator gen = new SqlGenerator();
  gen.setModel(model);
  
  appendln(realSb, gen.translate("beforeCode", uClass));

  HashMap<String,String> codeInjectionMap = new HashMap<String,String>();
  for (CodeInjection inject : uClass.getCodeInjections())
  {
    String operation = StringFormatter.toUnderscore(inject.getOperation());
    String key = inject.getType() + ":" + operation;
    String newCodeToInject = "";
    if (codeInjectionMap.containsKey(key))
    {
      newCodeToInject = StringFormatter.format("{0}\n    {1}",codeInjectionMap.get(key),inject.getCode());
    }
    else
    {
      newCodeToInject = inject.getCode();
    }
    codeInjectionMap.put(key,newCodeToInject);
  }
  boolean isFirst = true;

    realSb.append(TEXT_2);
    realSb.append(gen.translate("packageDefinition",uClass));
    realSb.append(TEXT_3);
     if (uClass.numberOfComments() > 0) { if(!uClass.getComments().get(0).getIsInline()) {append(realSb, "\n{0}", Comment.format("Multiline",uClass.getComments()));} else { append(realSb, "\n{0}", Comment.format("Multiline",uClass.getComments()));} } 
    realSb.append(TEXT_4);
    realSb.append(gen.translate("typeWithPackage", uClass));
    realSb.append(TEXT_5);
    /*members_AllAssociations*/
    
/*
This file creates the necessary attributes that the class will need for a successful foreign key to another class (association)
It creates local copies of the foreign class' private key attributes. 
Note: The foreign key constraint is not defined here, as the associated class may not be defined yet. See the members_AllForeignKeys.jet file for those.
*/
  appendln(realSb, "");
  appendln(realSb, "  /*------------------------*/");
  appendln(realSb, "  /* MEMBER VARIABLES       */");
  appendln(realSb, "  /*------------------------*/");
  
  isFirst = true;
  
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
    if (!av.getIsNavigable())
    {
      continue;
    }
    
    String attribute = av.isOne() ? gen.translate("attributeOne",av) : gen.translate("attributeMany",av);
 
    if ((av.isOptionalOne() || av.isOnlyOne() || av.isN()) && av.hasRelatedAssociation())
    { 
      UmpleClass associatedUClass = av.getRelatedAssociation().getUmpleClass();
      gen.toggleReadyToSetRootClass();
      List<Attribute> foreignPKList = gen.resolvePrimaryKey(associatedUClass);
      if (isFirst && foreignPKList.size()>0)
      {
        appendln(realSb, "");
        appendln(realSb,"  /*{0} Associations*/", gen.translate("type", uClass));
        isFirst = false;
      }
      for(int i = 1; i <= av.getMultiplicity().getUpperBound(); i += 1)
      { 
	    for(Attribute foreignPK : foreignPKList)
	    {
	      appendln(realSb, "  {0}_{1}{2} {3},", gen.translate("type", associatedUClass),
	                                                     gen.translate("attributeOne", foreignPK), 
	                                                     av.isN() ? "_" + i : "", 
	                                                     gen.translate("type", foreignPK));
	    }
      }
    }
  }

    realSb.append(TEXT_6);
    /*members_AllStatics*/
    
  /*
  This file declares constant attributes for tables. 
  The "constant" requirement is enforced with a check statement.
  */
  
  isFirst = true;
  for(Attribute av : uClass.getAttributes())
  {
  
    if (!av.isConstant())
    {
      continue;
    }

    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb,"  /*{0} Constants*/", gen.translate("type", uClass));      
      isFirst = false;
    }
  
    appendln(realSb, "  {0} {1} DEFAULT {2} CHECK ({0} = {2}),", gen.translate("attributeConstant",av), gen.translate("type",av), gen.translate("parameterValueQuoted",av));
  }

    /*members_AllStateMachines*/
    
  //This file declares the state machines of the class as Sql ENUM types.

  isFirst = true;
  for(StateMachine sm : uClass.getStateMachines())
  {
    List<StateMachine> allNested = sm.getNestedStateMachines();

    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb,"  /*{0} State Machines*/", uClass.getName());
      isFirst = false;
    }
  
    appendln(realSb, "  {0} ENUM({1}),", gen.translate("type",sm), gen.translate("listStates",sm));

    for (StateMachine nestedSm : allNested)
    {
      appendln(realSb, "  {0} ENUM({1}),", gen.translate("type",nestedSm), gen.translate("listStates",nestedSm));
    }
  }

    /*members_AllAttributes*/
    
/*
This file generates Sql attributes for a given class. Once all the attributes have been defined, it generates the Sql Primary Key for the table.
*/

  isFirst = true;
  for(Attribute av : uClass.getAttributes())
  {
    if (av.isConstant() || av.getModifier().equals("internal"))
    {
      continue;
    }
    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb,"  /*{0} Attributes*/", gen.translate("type", uClass));      
      isFirst = false;
    }
     
    String type = gen.translate("type",av);
    String attribute = gen.translate("attributeOne",av);
    if (av.getIsList())
    {
      attribute = gen.translate("attributeMany",av);
      type = StringFormatter.format("List<{0}>",gen.translate("typeMany",av));
    }
    
    append(realSb, "  {0} {1}", attribute, type);
    
    if (av.getIsAutounique())
    {
   	  append(realSb, " AUTO_INCREMENT");
    }
    if (gen.translate("parameterValue",av).compareToIgnoreCase("null") != 0)
    {
   	  append(realSb, " DEFAULT {0}", gen.translate("parameterValueQuoted",av));
    }
    /* Unique not implemented yet.
    if (av.getIsUnique())
    {
   	  append(realSb, " UNIQUE");
    }
    */
        
    appendln(realSb, ",");
  }
  
  
  //Primary Key Generation
  String tKey = "";
  gen.toggleReadyToSetRootClass();
  List<Attribute> PKList = gen.resolvePrimaryKey(uClass);
  for(Attribute PK : PKList)
  {
    tKey += gen.translate("attributeOne", PK) + ", ";
  }
  //Remove trailing comma
  if (tKey.length() > 0)
  {
    tKey = tKey.substring(0, tKey.length()-2);
  }
  else
  {
    tKey = "/*No Possible Primary Key*/";
  }
  appendln(realSb, "  PRIMARY KEY({0})", tKey);

    realSb.append(TEXT_7);
    realSb.append(gen.translate("packageDefinitionEnd",uClass));
    /*members_AllConstantTriggers*/
    
{
  /*
  This file declares constant attributes for tables. 
  The "constant" requirement is enforced with a check statement.
  */
  
  isFirst = true;
  String triggerContents = "";
  for(Attribute av : uClass.getAttributes())
  {
  
    if (!av.isConstant())
    {
      continue;
    }

    if (isFirst)
    {  
      isFirst = false;
    }
    else
    {
      triggerContents += "\n";
    }

    triggerContents += "  IF NEW." + gen.translate("attributeConstantQuoted",av) + " <> " +gen.translate("parameterValueQuoted",av) + " THEN" + "\n";
    triggerContents += "    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'ERROR: Attempt to modify constant attribute " + gen.translate("attributeConstantQuoted",av) + " in  " + gen.translate("typeQuoted",uClass) + "';" + "\n";
    triggerContents += "  END IF;";
  }
  if (!isFirst)
  {      
    appendln(realSb, "");
    appendln(realSb, "/*{0} Constant Enforcement*/", gen.translate("type", uClass));   
    appendln(realSb, "DELIMITER //");   
    appendln(realSb, "CREATE TRIGGER `const_insert` BEFORE insert ON {0}", gen.translate("typeWithPackage",uClass));
    appendln(realSb, "FOR EACH ROW BEGIN");
    appendln(realSb, triggerContents);
    appendln(realSb, "END;");
    appendln(realSb, "//");
    appendln(realSb, "CREATE TRIGGER `const_update` BEFORE update ON {0}", gen.translate("typeWithPackage",uClass));
    appendln(realSb, "FOR EACH ROW BEGIN");
    appendln(realSb, triggerContents);
    appendln(realSb, "END;");
    appendln(realSb, "//");
    appendln(realSb, "DELIMITER ;");
  }
}

    realSb.append(TEXT_8);
     appendln(realSb, gen.translate("afterCode", uClass));
    /*members_AllForeignKeys*/
    
//This is the declaration of the foreign key constraints. This should appear after all classes have already been output (currently not the case).
/* Argument 6 is added to ensure no two constraints end up having the same name. Often constraints do not have the same name
but sometimes when two tables have a foreign key referring to the same table */
  for (AssociationVariable av : uClass.getAssociationVariables())
  {

    if (av.getIsNavigable() && (av.isOptionalOne() || av.isOnlyOne() || av.isN()) && av.hasRelatedAssociation())
    { 
      UmpleClass associatedUClass = av.getRelatedAssociation().getUmpleClass();
      gen.toggleReadyToSetRootClass();
      List<Attribute> foreignPKList = gen.resolvePrimaryKey(associatedUClass);
      for(int i = 1; i <= av.getMultiplicity().getUpperBound(); i += 1)
      { 
        String allAttributesOne = "";
        String allAttributesOneQuoted = "";
        String allAttributesOneWithoutClassName = "";
        for(Attribute foreignPK : foreignPKList)
        {
          if (av.isTwoDirectionalAssociation(av.getRelatedAssociation())){
            appendln(realSb, "ALTER TABLE {0} ADD CONSTRAINT `fk_{6}_{2}_{3}{5}` FOREIGN KEY (`{2}_{3}{5}`) REFERENCES {1}({4});", gen.translate("typeWithPackage", uClass),
                                                                                                                                   gen.translate("typeWithPackage", associatedUClass), 
                                                                                                                                   gen.translate("type", associatedUClass), 
                                                                                                                                   gen.translate("attributeOne", foreignPK), 
                                                                                                                                   gen.translate("attributeOneQuoted", foreignPK),
                                                                                                                                   av.isN() ? "_" + i : "", uClass.getName().toLowerCase());
          }
          else{
            allAttributesOneWithoutClassName += gen.translate("attributeOne", foreignPK) + (av.isN() ? "_" + i : "") + "_";
            allAttributesOne += gen.translate("type", associatedUClass) + "_" + gen.translate("attributeOne", foreignPK) + (av.isN() ? "_" + i : "") + "`, `";
            allAttributesOneQuoted += gen.translate("attributeOneQuoted", foreignPK) + ", ";
          }
        }

        if (!av.isTwoDirectionalAssociation(av.getRelatedAssociation())){
          appendln(realSb, "ALTER TABLE {0} ADD CONSTRAINT `fk_{5}_{2}_{6}` FOREIGN KEY (`{3}`) REFERENCES {1}({4});", gen.translate("typeWithPackage", uClass),
                                                                                                                          gen.translate("typeWithPackage", associatedUClass), 
                                                                                                                          gen.translate("type", associatedUClass), 
                                                                                                                          allAttributesOne.substring(0, allAttributesOne.length()-4), 
                                                                                                                          allAttributesOneQuoted.substring(0, allAttributesOneQuoted.length()-2),
                                                                                                                          uClass.getName().toLowerCase(),
                                                                                                                          allAttributesOneWithoutClassName.substring(0, allAttributesOneWithoutClassName.length()-1));
          
        }

      }
    }
  }


    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getCode(UmpleModel model, UmpleElement uElement){
        StringBuilder sb = new StringBuilder();
    return this._getCode(0,sb,model,uElement).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}
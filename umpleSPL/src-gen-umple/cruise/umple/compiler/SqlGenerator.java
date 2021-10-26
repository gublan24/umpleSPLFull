/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;
import java.io.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.compiler.sql.*;

// line 12 "../../../../src/Generator_CodeSql.ump"
public class SqlGenerator extends SuperCodeGenerator implements CodeTranslator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SqlGenerator()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 108 "../../../../src/Generator_CodeSql.ump"
   public void prepare(){
    List<UmpleClass> allClasses = new ArrayList<UmpleClass>(getModel().getUmpleClasses());
    for (UmpleClass aClass : allClasses)
    {
      prepare(aClass);
    }
    
    for (UmpleClass aClass : getModel().getUmpleClasses())
    {
      GeneratedClass genClass = aClass.getGeneratedClass();
      generateSecondaryConstructorSignatures(genClass);
      generateNullableConstructorSignature(genClass);
      addImports(aClass,genClass);
    }

    addRelatedImports();
    
    //Add internal association class to replace M..N or * associations
    for (int i = 0; i < getModel().numberOfUmpleClasses(); i++)
    {
      UmpleClass aClass = getModel().getUmpleClass(i);
      if (aClass instanceof AssociationClass)
      {
        continue;
      }
      for (AssociationVariable av : aClass.getAssociationVariables())
      {
        if (av.hasRelatedAssociation() && getModel().indexOfUmpleClass(av.getRelatedAssociation().getUmpleClass()) >= i)
        {
          continue;
        }
        if (av.hasRelatedAssociation() && ((av.isMN() && !av.isOptionalOne()) || (av.getRelatedAssociation().isMN() && !av.getRelatedAssociation().isOptionalOne())))
        {
          //ToDo: Create new internal association class that replaces the association described by av and av.getRelatedAssociaiton()
          /*
          AssociationClass ac = new AssociationClass(aClass.getName() + "To" + av.getRelatedAssociation().getUmpleClass().getName());
          ac.setIsInternal(true);
          ac.addAssociatedTo(Association aAssociatedTo); //Association to aClass
          ac.addAssociatedTo(Association aAssociatedTo); //Association to av.getRelatedAssociation().getUmpleClass()
          Key k = new Key();
          k.addMember(String name); //Name of first association
          k.addMember(String name); //Name of second association
          ac.setKey(k);
          */
        }
      }
    }
  }

  // line 158 "../../../../src/Generator_CodeSql.ump"
   public void setRootClass(UmpleClass aClass){
    rootClass = aClass.getName();
  }

  // line 162 "../../../../src/Generator_CodeSql.ump"
   public boolean matchesRootClass(UmpleClass aClass){
    if (rootClass == null) return false;
     return aClass.getName() == rootClass;
  }

  // line 167 "../../../../src/Generator_CodeSql.ump"
   public void toggleReadyToSetRootClass(){
    if (readyToSetRootClass)
    {
      readyToSetRootClass=false;
    } 
    else readyToSetRootClass = true;
  }

  // line 177 "../../../../src/Generator_CodeSql.ump"
   public List<Attribute> resolvePrimaryKey(UmpleClass aClass){
    List<Attribute> result = new ArrayList<Attribute>();
    
    //Check for Primary Key
    String[] keyMembers = aClass.getKey().getMembers();

    if (keyMembers.length > 0)
    {
      for (String m : keyMembers)
      {
        Attribute attr = aClass.getAttribute(m);
        AssociationVariable av = aClass.getAssociationVariable(m);
        StateMachine sm = aClass.getStateMachine(m);
        
        if (attr != null)
        {
          UmpleClass foreignClass = getModel().getUmpleClass(attr.getType());
          if (foreignClass != null)
          {
            List<Attribute> foreignClassAttributeList = resolvePrimaryKey(foreignClass);
            for (Attribute FK : foreignClassAttributeList)
            {
              result.add(attributePsudoCopy(FK, m + "_", ""));
            }
          }
          else
          {
            result.add(attr);
          }
        }
        else if (av != null && av.getIsNavigable() && (av.isOptionalOne() || av.isOnlyOne() || av.isN()))
        {
          UmpleClass foreignClass = av.getRelatedAssociation().getUmpleClass();
          if (foreignClass != null)
          {
            int maxMultiplicity = av.getMultiplicity().getUpperBound();
            List<Attribute> FK = resolvePrimaryKey(foreignClass);
            for (int i = 1; i <= maxMultiplicity; i++)
            {
              for (Attribute fk : FK)
              {
                result.add(attributePsudoCopy(fk, m + "_", ((maxMultiplicity > 1) ? "_"+ i : "")));
              }
            }
          }
        }
        else if (sm != null)
        {
          result.add(makeFakeAttribute(m, aClass));
        }
        else
        {
          //Error: Key name does not refer to anything.
        }
      }
    }

    if (readyToSetRootClass) // first call from outside
    {
      setRootClass(aClass);
      toggleReadyToSetRootClass();
    }
    
    if (result.isEmpty())
    {
      if (aClass.numberOfAttributes() > 0)
      {
        result.add(aClass.getAttribute(0));
      }
      else if (aClass.numberOfAssociations() > 0)
      {
        int maxAssoc = aClass.numberOfAssociations();
        int i = 0;
        while (result.isEmpty() && i < maxAssoc)
        {
          AssociationVariable av = aClass.getAssociationVariable(i);
          if (av != null && av.getIsNavigable() && (av.isOptionalOne() || av.isOnlyOne() || av.isN()))
          {
            UmpleClass foreignClass = av.getRelatedAssociation().getUmpleClass();
            if (foreignClass != null && !matchesRootClass(foreignClass))
            {
              int maxMultiplicity = av.getMultiplicity().getUpperBound();
              List<Attribute> FK = resolvePrimaryKey(foreignClass);
              for (int p = 1; p <= maxMultiplicity; p++)
              {
                for (Attribute fk : FK)
                {
                  result.add(attributePsudoCopy(fk, foreignClass.getName() + "_", ((maxMultiplicity > 1) ? "_"+ p : "")));
                }
              }
            }
            else{
              // did a loop in recursion
            }
          }
          i++;
        }
      }
      else if (aClass.numberOfStateMachines() > 0)
      {
        result.add(makeFakeAttribute(aClass.getStateMachine(0).getName(), aClass));
      }
    }
    
    if (result.isEmpty())
    {
      //Error: Class is empty
    }
    return result;
  }

  // line 289 "../../../../src/Generator_CodeSql.ump"
   private Attribute attributePsudoCopy(Attribute a, String prefix, String suffix){
    Attribute aCopy = new Attribute(prefix + a.getName() + suffix, a.getType(), a.getModifier(), a.getValue(), a.getIsAutounique(), a.getUmpleClass());
    aCopy.setIsList(a.getIsList());
    aCopy.setIsDerived(a.getIsDerived());
    aCopy.setIsLazy(a.getIsLazy());
    return aCopy;
  }

  // line 298 "../../../../src/Generator_CodeSql.ump"
   private Attribute makeFakeAttribute(String name, UmpleClass parent){
    return new Attribute(name, "", "", "", false, parent);
  }

  // line 303 "../../../../src/Generator_CodeSql.ump"
   public String getType(UmpleVariable av){
    String myType = av.getType();
    
    if (myType == null || myType.length() == 0) //No type specified.
    {
      return "BLOB";
    }
    else if (UmpleToPrimitiveMap.containsKey(myType)) //Type is an Umple Primitive.
    {
      return UmpleToPrimitiveMap.get(myType);
    }
    //Check if type is an Sql primitive
    for (String primitiveType : SqlPrimitives)
    {
      if (myType.toUpperCase().equals(primitiveType) || (myType.toUpperCase().startsWith(primitiveType + "(") && myType.endsWith(")")))
      {
        return primitiveType + myType.substring(primitiveType.length());
      }
    }
    //Check if type is that of another class.
    if (av instanceof AssociationVariable)
    {
      //What to do in this case?
    }
    
    //Unknown type
    return "BLOB";
  }

  // line 333 "../../../../src/Generator_CodeSql.ump"
   public boolean isNullable(UmpleVariable av){
    return true;
  }

  // line 338 "../../../../src/Generator_CodeSql.ump"
   public String translate(String format, ConstraintTree constraint){
    return "{0}";
  }

  // line 343 "../../../../src/Generator_CodeSql.ump"
   public String relatedTranslate(String name, AssociationVariable av){
    return translate(name,av.getRelatedAssociation());
  }

  // line 348 "../../../../src/Generator_CodeSql.ump"
   public ILang getLanguageFor(UmpleElement aElement){
    if (aElement instanceof UmpleInterface)
    {
      return new SqlInterfaceGenerator();
    }
    else if (aElement instanceof UmpleClass)
    {
      return new SqlClassGenerator();
    } 
    else{
    	return null;    	
    }
  }

  // line 363 "../../../../src/Generator_CodeSql.ump"
   public String translate(String name, UmpleInterface aInterface){
    String result = "";
    if ("packageDefinition".equals(name) && aInterface.getPackageName().length() > 0)
    {
      String moduleName = StringFormatter.toUnderscore(aInterface.getPackageName());
      result += "CREATE DATABASE IF NOT EXISTS `" + moduleName +"`;\n";
      result += "USE `" + moduleName +"`;";
      return result;
    }
    return result;
  }

  // line 376 "../../../../src/Generator_CodeSql.ump"
   public String translate(String name, UmpleClass aClass){
    if ("constructorMandatory".equals(name))
    {
      return aClass.getGeneratedClass().getLookup("constructorSignature_mandatory");
    }
    else if ("packageName".equals(name))
    {
      String moduleName = StringFormatter.toUnderscore(aClass.getPackageName());
      return aClass.getPackageName().length() == 0 ? "" : moduleName; 
    }
    else if ("packageNameQuoted".equals(name))
    {
      String moduleName = StringFormatter.toUnderscore(aClass.getPackageName());
      return aClass.getPackageName().length() == 0 ? "" : "`" + moduleName + "`"; 
    }
    else if ("packageDefinition".equals(name))
    {
      String moduleName = translate("packageNameQuoted", aClass);
      return aClass.getPackageName().length() == 0 ? "" : "CREATE DATABASE IF NOT EXISTS " + moduleName +";\nUSE " + moduleName +";";
    }
    else if ("packageDefinitionEnd".equals(name))
    {
      return "\n";
    }
    else if ("type".equals(name))
    {
      return StringFormatter.toUnderscore(aClass.getName());
    } 
    else if ("typeQuoted".equals(name))
    {
      return "`" + StringFormatter.toUnderscore(aClass.getName()) + "`";
    } 
    else if ("typeWithPackage".equals(name))
    {
      String result = translate("packageNameQuoted", aClass);
      result = result.length() == 0 ? "" : result + ".";
      result += translate("typeQuoted", aClass);
      return result;
    } 
    else if ("isA".equals(name))
    {
       return getExtendAndImplements(aClass);
    }
    else if ("beforeCode".equals(name))
    {
       return beforeCode;
    }
    else if ("afterCode".equals(name))
    {
       return afterCode;
    }
    return "UNKNOWN ID: " + name;
  }

  // line 431 "../../../../src/Generator_CodeSql.ump"
   private String getExtendAndImplements(UmpleClass uClass){
    String extendsString = "";
	  String implementsString = "";
	  
	  extendsString = getExtendClassesNames(uClass);
	  implementsString = getImplementsInterfacesNames(uClass);
	  
	  return extendsString + implementsString;
  }

  // line 442 "../../../../src/Generator_CodeSql.ump"
   private String getImplementsInterfacesNames(UmpleClass uClass){
    if (uClass.hasParentInterface() == false){
		  return "";
	  }
	  else{
		 return " < " +  uClass.getParentInterface().get(0).getName();
	  }
  }

  // line 452 "../../../../src/Generator_CodeSql.ump"
   private String getExtendClassesNames(UmpleClass uClass){
    UmpleClass parent = uClass.getExtendsClass();
	  if (parent == null)
	  {
		  return "";
	  }
	  else{
		  return   " < " + parent.getName();
	  }
  }

  // line 464 "../../../../src/Generator_CodeSql.ump"
   public String translate(String keyName, Attribute av){
    boolean isMany = av.getIsList();
    return translate(keyName,av,isMany);
  }

  // line 470 "../../../../src/Generator_CodeSql.ump"
   public String translate(String keyName, TraceItem ti){
    return "";
  }

  // line 475 "../../../../src/Generator_CodeSql.ump"
   public String translate(String keyName, AssociationVariable av){
    boolean isMany = av.isMany();
    return translate(keyName,av,isMany);
  }


  /**
   * Translates Date, Time and String const to SQL value, has to be used for interfaces as they do not use attributes.
   */
  // line 482 "../../../../src/Generator_CodeSql.ump"
   public String translateInterfaceValue(String value, String type){
    if (value == null)
    {
      return "null";
    }
      
    boolean isString = value.startsWith("\"") && value.endsWith("\"");
    if (isString && "Date".equals(type))
    {
      return StringFormatter.format("Date.parse({0})", value);
    }
    else if (isString && "Time".equals(type))
    {
      return StringFormatter.format("Time.parse({0})", value);
    }
    else if (isString)
    {
      return value.substring(1, value.length() - 1);
    }
    else
    {
      return value;
    }
  }


  /**
   * Translates primitive data types to their SQL equivalent. Used for interfaces as they do not use attributes.
   */
  // line 509 "../../../../src/Generator_CodeSql.ump"
   public String translateInterfaceType(String type){
    return typeOf(type);
  }

  // line 514 "../../../../src/Generator_CodeSql.ump"
   private String translate(String keyName, UmpleVariable av, boolean isMany){
    if (OneOrManyLookup.contains(keyName))
    {
      String realKeyName = isMany ? keyName + "Many" : keyName + "One";
      return translate(realKeyName,av,isMany);
    }
  
    String singularName = isMany ? getModel().getGlossary().getSingular(av.getName()) : av.getName();
    String pluralName = isMany ? av.getName() : getModel().getGlossary().getPlural(av.getName());

    if (UpperCasePluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCasePluralLookupMap.get(keyName),getUpperCaseName(pluralName));
    }
    else if (UpperCaseSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCaseSingularLookupMap.get(keyName),getUpperCaseName(singularName));
    }
    else if (AsIsPluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsPluralLookupMap.get(keyName),StringFormatter.toUnderscore(pluralName));
    }
    else if (AsIsSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsSingularLookupMap.get(keyName),StringFormatter.toUnderscore(singularName));
    }
    else if ("parameterValue".equals(keyName))
    {
      if (av.getValue() == null)
      {
        return "null";
      }
      
      boolean isString = av.getValue().startsWith("\"") && av.getValue().endsWith("\"");
      if (isString && "Date".equals(av.getType()))
      {
        return StringFormatter.format("Date.parse({0})",av.getValue());
      }
      else if (isString && "Time".equals(av.getType()))
      {
        return StringFormatter.format("Time.parse({0})",av.getValue());
      }
      else if (isString)
      {
        return av.getValue().substring(1, av.getValue().length() - 1);
      }
      else
      {
        return av.getValue();
      }
    }
    else if ("parameterValueQuoted".equals(keyName))
    {
      return "'" + translate("parameterValue", av, isMany) + "'";
    }
    else if ("type".equals(keyName))
    {
      if (av instanceof Attribute)
      {
        return getType(av).toUpperCase();
      }
      return StringFormatter.toUnderscore(getType(av));
    }
    else if ("typeMany".equals(keyName))
    {
      if (av instanceof Attribute)
      {
        return isNullable(av) ? getType(av).toUpperCase() : av.getType().toUpperCase();
      }
      return StringFormatter.toUnderscore(isNullable(av) ? getType(av) : av.getType());
    }
    
    if (av instanceof AssociationVariable)
    {
      AssociationVariable assVar = (AssociationVariable)av;
      if ("callerArgumentsExcept".equals(keyName))
      {
        UmpleClass classToRemove = getModel().getUmpleClass(getType(assVar.getRelatedAssociation()));
        GeneratedClass generatedClassToRemove = classToRemove.getGeneratedClass();
        String   callerNameToRemove = StringFormatter.format("{0}",translate("parameterOne",assVar));
        return StringFormatter.replaceParameter(generatedClassToRemove.getLookup("constructorSignature_caller"), callerNameToRemove, "self");
      }
      else if ("methodArgumentsExcept".equals(keyName))
      {
        UmpleClass classToRemove = getModel().getUmpleClass(getType(assVar.getRelatedAssociation()));
        GeneratedClass generatedClassToRemove = classToRemove.getGeneratedClass();
        String parameterNameToRemove = StringFormatter.format("{0}", translate("parameterOne",assVar));
        return StringFormatter.replaceParameter(generatedClassToRemove.getLookup("constructorSignature"), parameterNameToRemove, ""); 
      }
      else if ("associationCanSet".equals(keyName))
      {
        String actualLookup = assVar.isMany() ? "associationCanSetMany" : "associationCanSetOne";
        return translate(actualLookup,av,isMany);
      }
      else if ("callerArgumentsForMandatory".equals(keyName))
      {
        UmpleClass classToLookup = getModel().getUmpleClass(getType(av));
        String lookup = "constructorSignature_mandatory_" + assVar.getRelatedAssociation().getName();
        String parameters = classToLookup.getGeneratedClass().getLookup(lookup);
        return parameters;
      }
    }
    else if (av instanceof Attribute)
    {
      Attribute attVar = (Attribute)av;
      if ("attributeCanSet".equals(keyName))
      {
        String actualLookup = attVar.getIsList() ? "attributeCanSetMany" : "attributeCanSetOne";
        return translate(actualLookup,av,isMany);
      }
    }    
    return "UNKNOWN ID: " + keyName;
  }

  // line 629 "../../../../src/Generator_CodeSql.ump"
   public String translate(String keyName, State state){
    String singularName = StringFormatter.toUnderscore(state.getName());
    String pluralName = getModel().getGlossary().getPlural(singularName);
    String stateMachinePlusState = StringFormatter.format("{0}_{1}",StringFormatter.toUnderscore(state.getStateMachine().getName()),singularName);
  
    if (UpperCasePluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCasePluralLookupMap.get(keyName),getUpperCaseName(pluralName));
    }
    else if (UpperCaseSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCaseSingularLookupMap.get(keyName),getUpperCaseName(singularName));
    }
    else if (AsIsPluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsPluralLookupMap.get(keyName),pluralName);
    }
    else if (AsIsSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsSingularLookupMap.get(keyName),singularName);
    }
    else if ("stateOne".equals(keyName))
    {
      return singularName;
    }
    else if ("stateOneQuoted".equals(keyName))
    {
      return "'" + singularName + "'";
    }
    else if ("stateString".equals(keyName))
    {
      return "\"" + stateMachinePlusState + "\"";
    }
    else if ("doActivityMethod".equals(keyName))
    {
      return StringFormatter.format("doActivity{0}",stateMachinePlusState); 
    }
    
    return "UNKNOWN ID: " + keyName;
  }

  // line 671 "../../../../src/Generator_CodeSql.ump"
   public String translate(String keyName, StateMachine sm){
    String singularName = StringFormatter.toUnderscore(sm.getFullName());
    String pluralName = getModel().getGlossary().getPlural(singularName);
  
    if (UpperCasePluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCasePluralLookupMap.get(keyName),getUpperCaseName(pluralName));
    }
    else if (UpperCaseSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCaseSingularLookupMap.get(keyName),getUpperCaseName(singularName));
    }
    else if (AsIsPluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsPluralLookupMap.get(keyName),pluralName);
    }
    else if (AsIsSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsSingularLookupMap.get(keyName),singularName);
    }
    else if ("type".equals(keyName))
    {
      return singularName;
    }
    else if ("listStates".equals(keyName))
    {
      String allEnums = "";
      for(State state : sm.getStates())
      {
        if (allEnums.length() > 0)
        {
          allEnums += ", ";
        }
        allEnums += translate("stateOneQuoted",state);
      }
      return allEnums;
    }
    return "UNKNOWN ID: " + keyName;
  }

  // line 712 "../../../../src/Generator_CodeSql.ump"
   public String translate(String keyName, Event event){
    String singularName = event.getName();
    String pluralName = getModel().getGlossary().getPlural(singularName);

    if (UpperCasePluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCasePluralLookupMap.get(keyName),getUpperCaseName(pluralName));
    }
    else if (UpperCaseSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCaseSingularLookupMap.get(keyName),getUpperCaseName(singularName));
    }
    else if (AsIsPluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsPluralLookupMap.get(keyName),pluralName);
    }
    else if (AsIsSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsSingularLookupMap.get(keyName),singularName);
    }
    
    return "UNKNOWN ID: " + keyName;
  }

  // line 737 "../../../../src/Generator_CodeSql.ump"
   public void generate(){
    prepare();
    writeFile();
    postpare();
  }

  // line 744 "../../../../src/Generator_CodeSql.ump"
   public String nameOf(String name, boolean hasMultiple){
    if (name == null)
    {
      return null;
    }
    else if (hasMultiple)
    {
      //String pluralName = getModel().getGlossary().getPlural(name);
      return "all_" + name;
    }
    else
    {
      //String singularName = getModel().getGlossary().getSingular(name);
      return "a_" + name;
    }
  }

  // line 762 "../../../../src/Generator_CodeSql.ump"
   public static  String typeOf(String aType){
    if (aType == null || aType.length() == 0)
    {
      return "String";
    }
    else if (aType.equals("Integer"))
    {
      return "int";
    }
    else if (aType.equals("Double"))
    {
      return "double";
    }
    else if(aType.equals("Float"))
    {
      return "float";
    }
    else if (aType.equals("Boolean"))
    {
      return "boolean";
    }
    else
    {
      return aType;
    }
  }

  // line 790 "../../../../src/Generator_CodeSql.ump"
   private void writeFile(){
    try //Output all elements in a single file
    {
      String path = StringFormatter.addPathOrAbsolute( 
    						  getModel().getUmpleFile().getPath(), 
        	                  getOutput());
      
      File file = new File(path);
      file.mkdirs();

      String sqlName = getModel().getUmpleFile().getFileName();
      if (sqlName.endsWith(".ump"))
      {
        sqlName = sqlName.substring(0, sqlName.length() - 4);
      }
      String filename = path + File.separator + sqlName + ".sql";
      BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
      
      /*
      The following outputs all classes together in a single file. 
      Also, since all classes should be declared before the foreign key constraints are added, the following divides the generated code of each class into three groups
      and then outputs each group in order.
      */
      String[] contents = new String[3];
      boolean isFirst = true;
      
      for (UmpleElement currentElement : getModel().getUmpleElements())
      {
        ILang language = getLanguageFor(currentElement);
        
        if ("external".equals(currentElement.getModifier()))
        {
          continue;
        }
        String returnedContents = language.getCode(getModel(), currentElement);
        String elementContents;
        
        int index = 0;
        int prevIndex = 0;
        
        index = returnedContents.indexOf(beforeCode);        
        if (isFirst)
        {
          for (int i = 0; i < contents.length; i++)
          {
            contents[i] = "";
          }
          contents[0] += returnedContents.substring(prevIndex, index);
          isFirst = false;
        }
        elementContents = returnedContents.substring(prevIndex, index);
        prevIndex = index + beforeCode.length();
        index = returnedContents.indexOf(afterCode, prevIndex);
        contents[1] += returnedContents.substring(prevIndex, index);
        elementContents += returnedContents.substring(prevIndex, index);
        prevIndex = index + afterCode.length();
        contents[2] += returnedContents.substring(prevIndex);
        elementContents += returnedContents.substring(prevIndex);
        getModel().getGeneratedCode().put(currentElement.getName(), elementContents);
        
      }
      String finalResult = "";
      for (String s : contents)
      {
        finalResult += s;
      }
      bw.write(finalResult);
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating classes. " + e, e);
    }
  }

  // line 867 "../../../../src/Generator_CodeSql.ump"
   private String getUpperCaseName(String name){
    if (name == null || name.length() == 0)
    {
      return name;
    }
    else if (name.length() == 1)
    {
      return name.toUpperCase();
    }
    else
    {
      return name.toUpperCase().charAt(0) + name.substring(1);
    }
  }

  // line 883 "../../../../src/Generator_CodeSql.ump"
   private void prepare(UmpleClass aClass){
    accountForInheritance(aClass);

    if (aClass.getGeneratedClass() != null)
    {
      return;
    }
    else if (aClass.isRoot())
    {
      GeneratedClass genClass = aClass.createGeneratedClass(getModel());
      generateConstructorSignature(genClass);
    }
    else
    {
      UmpleClass parent = getModel().getUmpleClass(aClass.getExtendsClass().getName());
      prepare(parent);
      GeneratedClass genClass = aClass.createGeneratedClass(getModel());
      genClass.setParentClass(parent.getGeneratedClass());
      generateConstructorSignature(genClass);
    }
    
    if (aClass.getIsSingleton())
    {
      aClass.addDepend(new Depend("singleton"));
    }
    

    
    for(Attribute av : aClass.getAttributes())
    {
      if (av.isImmutable() || aClass.getKey().isMember(av))
      {
        String code = StringFormatter.format("return false unless @{0}",translate("attributeCanSet",av));
        CodeInjection set = new CodeInjection("before",translate("setMethod",av) , code, aClass);
        set.setIsInternal(true);
        aClass.addCodeInjection(set);
      }
    
      if (aClass.getKey().isMember(av))
      {
        String code = StringFormatter.format("return false unless @{0}",translate("attributeCanSet",av));
        String methods = StringFormatter.format("{0},{1},{2},{3}",translate("addMethod",av),translate("removeMethod",av),translate("setManyMethod",av),translate("resetMethod",av));
        CodeInjection inject = new CodeInjection("before", methods, code, aClass);
        inject.setIsInternal(true);
        aClass.addCodeInjection(inject);
      }
    }
    
    for(AssociationVariable av : aClass.getAssociationVariables())
    {
      if (aClass.getKey().isMember(av))
      {
        String code = StringFormatter.format("return false unless @{0}",translate("associationCanSet",av));
        String methods = StringFormatter.format("{0},{1},{2},{3},{4}",translate("addMethod",av),translate("removeMethod",av),translate("setManyMethod",av),translate("setMethod",av),translate("resetMethod",av));
        CodeInjection inject = new CodeInjection("before", methods, code, aClass);
        inject.setIsInternal(true);
        aClass.addCodeInjection(inject);
      }
      
      if (av.getIsNavigable()  && av.isMandatoryOne() && av.getRelatedAssociation().isMandatory())
      {
        String code = StringFormatter.format("raise \"Mandatory relationship with {0} not satisfied\" if (@initialized and !@deleted and @{1}.nil?)",av.getName(),translate("associationOne",av));
        CodeInjection injection = new CodeInjection("before","!constructor",code, aClass);
        injection.setIsInternal(true);
        aClass.addCodeInjection(injection);
      }
      
      if (av.isMany())
      {
        String code = StringFormatter.format("return false if {0}({1}) != -1",translate("indexOfMethod",av),translate("parameterOne",av));
        CodeInjection set = new CodeInjection("before",translate("addMethod",av) , code, aClass);
        set.setIsInternal(true);
        aClass.addCodeInjection(set);
      }
      
    } 
    
    Map<String,String> lookups = new HashMap<String,String>();
    String executeMethods = "def self.execute(message)\n  self.getInstance().addTrace(message)\nend\n";
    executeMethods += "def reset\n  self.getInstance().traces = []\nend";
    lookups.put("consoleTemplate","puts \"{0}=#{{1}}\"");
    lookups.put("stringTemplate","StringTracer::execute(\"{0}=#{{1}}\")");
    lookups.put("executeMethods",executeMethods);
    //GeneratorHelper.prepareAllStringTracers(this,getModel(),aClass,lookups);
  }

  // line 970 "../../../../src/Generator_CodeSql.ump"
   private void generateConstructorSignature(GeneratedClass genClass){
    StringBuffer signature = new StringBuffer();
    StringBuffer signatureCaller = new StringBuffer();
    
    UmpleClass uClass = genClass.getUClass();
    
    if (uClass.getExtendsClass() != null) 
    {
      GeneratedClass parent = genClass.getParentClass();
      signature.append(parent.getLookup("constructorSignature"));
      signatureCaller.append(parent.getLookup("constructorSignature_caller"));
    }    
    
    for (Attribute av : uClass.getAttributes()) 
    {
      if (av.getIsAutounique() || av.getIsList() || "defaulted".equals(av.getModifier()) || av.getIsLazy() || av.getValue() != null)
      {
        continue;
      }

      if (signature.length() > 0) 
      {
        signature.append(", ");
        signatureCaller.append(", ");
      }
        
      signature.append(StringFormatter.format("{0}",nameOf(av)));
      signatureCaller.append(StringFormatter.format("{0}",nameOf(av)));
    }

    for (AssociationVariable av : uClass.getAssociationVariables()) 
    {
      AssociationVariable relatedAv = av.getRelatedAssociation();

      if (av.getMultiplicity().getLowerBound() == 0 || !av.getIsNavigable())
      {
        continue;
      }
      
      if (relatedAv.getIsNavigable())
      {
        if (av.isMandatoryMany() && relatedAv.isMandatory())
        {
          continue;
        }
        
        if ((av.isMN() || av.isN()) && relatedAv.isOptionalN())
        {
          continue;
        }
      }
      
      if (signature.length() > 0) 
      {
        signature.append(", ");
        signatureCaller.append(", ");
      }
      
      signature.append(StringFormatter.format("{0}",nameOf(av)));
      signatureCaller.append(StringFormatter.format("{0}",nameOf(av)));      
    }

    genClass.setLookup("constructorSignature", signature.toString());
    genClass.setLookup("constructorSignature_caller", signatureCaller.toString());
  }

  // line 1036 "../../../../src/Generator_CodeSql.ump"
   private Key accountForInheritance(UmpleClass uClass){
    UmpleClass parent = uClass.getExtendsClass();
    if (uClass == null){
      return null;
    }

    if (parent == null){
      if (!uClass.getIsSingleton() && uClass.getAttributes().size() > 0){ 	//not a lone class = top of heirarchy [ or num od associations ]
        return createNewIntPK(uClass);
      }
      else {				// is a lone class
        return null;
      }
    }
    else{			// has parent
      Key parent_pk = accountForInheritance(parent);
      if (parent_pk == null){
        return null;
      }
      else{ 
        String pkNames="";
        String pkTypes="";
        for (String parentPkMember : parent_pk.getMembers()){
          pkNames += parentPkMember+", ";
        }
        //trim pkNames and pkTypes
        pkNames = pkNames.substring(0, pkNames.length() - 2);

        if (uClass.getAssociationVariable(pkNames) == null){
          for (String parentPkMember : parent_pk.getMembers()){
            pkTypes += parent.getAttribute(parentPkMember).getType() + ", ";
          }
          pkTypes = pkTypes.substring(0, pkTypes.length() - 2); 

          Multiplicity optionalToOne = new Multiplicity();
          optionalToOne.setBound("1");
          AssociationVariable newAssoc = new AssociationVariable (pkNames, pkTypes, "", "", optionalToOne, true);
          uClass.addAssociationVariable(newAssoc);
          AssociationVariable avFromParent = parent.getAssociationVariable(pkNames);
          newAssoc.setOneDirectionalRelatedAssociation(avFromParent);
        }
        return createNewIntPK(uClass);
        }
    }
  }

  // line 1082 "../../../../src/Generator_CodeSql.ump"
   private Key createNewIntPK(UmpleClass uClass){
    Multiplicity optionalToOne = new Multiplicity();
    optionalToOne.setBound("1");

    if (uClass.getKey().getMembers().length == 0 && uClass.getAttributes().size() == 0){ //if there are no key members, no attributes, etc.
      AssociationVariable old_pk = new AssociationVariable (uClass.getExtendsClass().getName()+"_id", "INT", "", "", optionalToOne, false);
      uClass.addAssociationVariable(old_pk);
      Key k = new Key();
      k.addMember(uClass.getExtendsClass().getName()+"_id");
      uClass.setKey(k);

      return k;
    }
    else {
      Key preexistKey = uClass.getKey();
      Attribute old_pk;
      if (uClass.getKey().getMembers().length > 0){
          if (uClass.getAssociationVariable(preexistKey.getMember(0)) == null){
            String pkNames = "";
            String pkTypes = "";
            for (String PkMember : preexistKey.getMembers()){
              pkNames += PkMember+", ";
              pkTypes += uClass.getAttribute(PkMember).getType() + ", ";
              old_pk = uClass.getAttribute(PkMember);
              uClass.removeAttribute(old_pk);
            }
            //trim pkNames and pkTypes
            pkNames = pkNames.substring(0, pkNames.length() - 2);
            pkTypes = pkTypes.substring(0, pkTypes.length() - 2);
            
            AssociationVariable newAssocPK = new AssociationVariable(pkNames, pkTypes, "", "", optionalToOne, false);
            uClass.addAssociationVariable(newAssocPK);
          }
      } 
      else{
        if (uClass.getAttributes().size() == 0 && uClass.getAssociationVariables().size() == 0)
          return null;
        old_pk = uClass.getAttribute(0);
        uClass.removeAttribute(old_pk);
        AssociationVariable newAssocPK = new AssociationVariable(old_pk.getName(), old_pk.getType(), "", "", optionalToOne, false);
        uClass.addAssociationVariable(newAssocPK);
        preexistKey.addMember(old_pk.getName());
      }
      return preexistKey;
    }
  }

  // line 1131 "../../../../src/Generator_CodeSql.ump"
   public String nameOf(Attribute av){
    return nameOf(av.getName(),false);
  }

  // line 1136 "../../../../src/Generator_CodeSql.ump"
   public String nameOf(AssociationVariable av){
    boolean hasMultiple = av.isMany();
    return nameOf(av.getName(),hasMultiple);
  }

  // line 1142 "../../../../src/Generator_CodeSql.ump"
   private void generateSecondaryConstructorSignatures(GeneratedClass genClass){
    UmpleClass uClass = genClass.getUClass();
    
    String mandatorySignature = genClass.getLookup("constructorSignature");
    
    for (AssociationVariable av : uClass.getAssociationVariables()) 
    {
      AssociationVariable relatedAv = av.getRelatedAssociation();
      if (relatedAv != null && av.isOnlyOne() && relatedAv.isOnlyOne() && av.getIsNavigable() && relatedAv.getIsNavigable())
      {
        UmpleClass relatedClass = getModel().getUmpleClass(av.getType());
        GeneratedClass relatedGen = relatedClass.getGeneratedClass();
        
        String selfParameter = StringFormatter.format("{0}",nameOf(relatedAv));
        String selfFor = StringFormatter.format("For{0}",av.getUpperCaseName());
        String newParameters = relatedGen.getLookup("constructorSignature");
        newParameters = StringFormatter.replaceParameter(newParameters, selfParameter, null);
        newParameters = StringFormatter.appendParameter(newParameters, selfFor);

        String relatedParameter = StringFormatter.format("{0}",nameOf(av));
        
        mandatorySignature = StringFormatter.replaceParameter(mandatorySignature, relatedParameter, newParameters);
        genClass.setLookup("constructorSignature_mandatory", mandatorySignature);
        
        String relatedFor = StringFormatter.format("For{0}",relatedAv.getUpperCaseName());
        String relatedCaller = genClass.getLookup("constructorSignature_caller");
        String relatedCallerParameter = StringFormatter.format("{0}",nameOf(av));
        String mandatorySignatureCaller = StringFormatter.replaceParameter(relatedCaller, relatedCallerParameter, "_THIS_");
        mandatorySignatureCaller = StringFormatter.appendParameter(mandatorySignatureCaller, relatedFor);
        mandatorySignatureCaller = StringFormatter.replaceParameter(mandatorySignatureCaller, "_THIS_" + relatedFor, "thisInstance");
        
        String mandatoryCallerId = "constructorSignature_mandatory_" + relatedAv.getName();
        relatedGen.setLookup(mandatoryCallerId, mandatorySignatureCaller);
      }
    }
  }

  // line 1180 "../../../../src/Generator_CodeSql.ump"
   private void generateNullableConstructorSignature(GeneratedClass genClass){
    String currentConstructor = genClass.getLookup("constructorSignature");
    genClass.setLookup("constructorSignature_nulled", StringFormatter.appendParameter(currentConstructor, " = null"));
  }

  // line 1187 "../../../../src/Generator_CodeSql.ump"
   private void addImports(UmpleClass aClass, GeneratedClass genClass){
    addAttributeImports(aClass,genClass);
    addAssociationImports(aClass,genClass);
  }

  // line 1194 "../../../../src/Generator_CodeSql.ump"
   private void addAssociationImports(UmpleClass aClass, GeneratedClass genClass){
    
  }

  // line 1198 "../../../../src/Generator_CodeSql.ump"
   private void addAttributeImports(UmpleClass aClass, GeneratedClass genClass){
    String timeImport = "time";
    String dateImport = "date";
    
    for (Attribute av : aClass.getAttributes()) 
    {
      
      if ("Time".equals(av.getType()))
      {
        genClass.addMultiLookup("import", timeImport);
      }
      else if ("Date".equals(av.getType()))
      {
        genClass.addMultiLookup("import", dateImport);
      }
    }
  }

  // line 1217 "../../../../src/Generator_CodeSql.ump"
   private void addRelatedImports(){
    for (UmpleClass aClass : getModel().getUmpleClasses())
    {
      GeneratedClass genClass = aClass.getGeneratedClass();
      
      if (aClass.getExtendsClass() != null)
      {
        if (!aClass.getPackageName().equals(aClass.getExtendsClass().getPackageName()))
        {
          genClass.addMultiLookup("import", aClass.getExtendsClass().getPackageName() + ".*");  
        }
        addImports(aClass.getExtendsClass(),genClass);
      }
      
      for (AssociationVariable av : aClass.getAssociationVariables()) 
      {
        if (!av.getIsNavigable())
        {
          continue;
        }
        
        AssociationVariable relatedAssociation = av.getRelatedAssociation();
        if (relatedAssociation != null && relatedAssociation.isOnlyOne())
        { 
          UmpleClass relatedClass = getModel().getUmpleClass(av.getType());
          while (relatedClass != null)
          {
            relatedClass = relatedClass.getExtendsClass();
          }
        }
      }
    }
  }

  // line 1251 "../../../../src/Generator_CodeSql.ump"
   public void initializeLangaugeBasedVariables(){
    UmpleToPrimitiveMap.put("Integer","INT");
	    UmpleToPrimitiveMap.put("Float","FLOAT");
	    UmpleToPrimitiveMap.put("Double","DOUBLE");
	    UmpleToPrimitiveMap.put("String","VARCHAR(255)");
	    UmpleToPrimitiveMap.put("Boolean","BIT");
	    UmpleToPrimitiveMap.put("Date","DATE");
	    UmpleToPrimitiveMap.put("Time","TIME");
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 23 "../../../../src/Generator_CodeSql.ump"
  private static Map<String,String> UpperCaseSingularLookupMap ;
// line 24 "../../../../src/Generator_CodeSql.ump"
  private static Map<String,String> UpperCasePluralLookupMap ;
// line 25 "../../../../src/Generator_CodeSql.ump"
  private static Map<String,String> AsIsSingularLookupMap ;
// line 26 "../../../../src/Generator_CodeSql.ump"
  private static Map<String,String> AsIsPluralLookupMap ;
// line 27 "../../../../src/Generator_CodeSql.ump"
  private static List<String> OneOrManyLookup ;
// line 28 "../../../../src/Generator_CodeSql.ump"
  private static List<String> SqlPrimitives ;
// line 29 "../../../../src/Generator_CodeSql.ump"
  private static String beforeCode ;
// line 30 "../../../../src/Generator_CodeSql.ump"
  private static String afterCode ;
// line 31 "../../../../src/Generator_CodeSql.ump"
  private static String rootClass ;
// line 32 "../../../../src/Generator_CodeSql.ump"
  private static boolean readyToSetRootClass=false ;

// line 34 "../../../../src/Generator_CodeSql.ump"
  static 
  {
    UpperCaseSingularLookupMap = new HashMap<String, String>();

    UpperCasePluralLookupMap = new HashMap<String, String>();

    AsIsSingularLookupMap = new HashMap<String, String>();
    AsIsSingularLookupMap.put("attributeOne", "{0}");
    AsIsSingularLookupMap.put("attributeOneQuoted", "`{0}`");
    AsIsSingularLookupMap.put("attributeConstant", "{0}");
    AsIsSingularLookupMap.put("attributeConstantQuoted", "`{0}`");

    AsIsPluralLookupMap = new HashMap<String, String>();

    OneOrManyLookup = new ArrayList<String>();
    OneOrManyLookup.add("attribute");
    OneOrManyLookup.add("parameter");
    
    SqlPrimitives = new ArrayList<String>();
    //MySQL types
    SqlPrimitives.add("CHAR");
    SqlPrimitives.add("VARCHAR");
    SqlPrimitives.add("TINYTEXT");
    SqlPrimitives.add("TEXT");
    SqlPrimitives.add("BLOB");
    SqlPrimitives.add("MEDIUMTEXT");
    SqlPrimitives.add("MEDIUMBLOB");
    SqlPrimitives.add("LONGTEXT");
    SqlPrimitives.add("LONGBLOB");
    SqlPrimitives.add("ENUM");
    SqlPrimitives.add("SET");
    SqlPrimitives.add("TINYINT");
    SqlPrimitives.add("SMALLINT");
    SqlPrimitives.add("MEDIUMINT");
    SqlPrimitives.add("INT");
    SqlPrimitives.add("BIGINT");
    SqlPrimitives.add("FLOAT");
    SqlPrimitives.add("DOUBLE");
    SqlPrimitives.add("DECIMAL");
    SqlPrimitives.add("DATE");
    SqlPrimitives.add("DATETIME");
    SqlPrimitives.add("TIMESTAMP");
    SqlPrimitives.add("TIME");
    SqlPrimitives.add("YEAR");
    //Additional Sql Server types
    SqlPrimitives.add("NCHAR");
    SqlPrimitives.add("NVARCHAR");
    SqlPrimitives.add("NTEXT");
    SqlPrimitives.add("BIT");
    SqlPrimitives.add("BINARY");
    SqlPrimitives.add("VARBINARY");
    SqlPrimitives.add("IMAGE");
    SqlPrimitives.add("NUMERIC");
    SqlPrimitives.add("SMALLMONEY");
    SqlPrimitives.add("MONEY");
    SqlPrimitives.add("REAL");
    SqlPrimitives.add("DATETIME2");
    SqlPrimitives.add("SMALLDATETIME");
    SqlPrimitives.add("DATETIMEOFFSET");
    //Other types
    SqlPrimitives.add("SQL_VARIANT");
    SqlPrimitives.add("UNIQUEIDENTIFIER");
    SqlPrimitives.add("XML");
    SqlPrimitives.add("CURSOR");
    SqlPrimitives.add("TABLE");
    
    //Codes used to break the generated code into groups
    beforeCode = "@BEFORE_CODE@";
    afterCode = "@AFTER_CODE@";
  }

  
}
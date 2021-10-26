/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.java;
import cruise.umple.parser.Position;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import java.util.regex.Pattern;

// line 11 "../../../../../UmpleTLTemplates/JavaInterfaceGenerator.ump"
public class JavaInterfaceGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "/*PLEASE DO NOT EDIT THIS CODE*/" + NL + "/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL;
  public static final String TEXT_3 = "";
  public static final String TEXT_4 = "";
  public static final String TEXT_5 = "";
  public static final String TEXT_6 = "";
  public static final String TEXT_7 = NL + "// line ";
  public static final String TEXT_8 = " \"";
  public static final String TEXT_9 = "\"";
  public static final String TEXT_10 = NL + "public interface ";
  public static final String TEXT_11 = NL + "{" + NL + "  ";
  public static final String TEXT_12 = "";
  public static final String TEXT_13 = "";
  public static final String TEXT_14 = "";
  public static final String TEXT_15 = "";
  public static final String TEXT_16 = NL + "}";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JavaInterfaceGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 22 "../../../../../UmpleTLTemplates/JavaInterfaceGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 29 "../../../../../UmpleTLTemplates/JavaInterfaceGenerator.ump"
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
    
    /*JavaInterfaceGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  UmpleInterface uInterface = (UmpleInterface) uElement;
  //GeneratedInterface gInterface = uInterface.getGeneratedInterface();
  JavaGenerator gen = new JavaGenerator();
  gen.setModel(model);

  String extraCode = "";
  if (uInterface.getExtraCode() != null)
  {
    extraCode = uInterface.getExtraCode();
  }


    realSb.append(TEXT_2);
    realSb.append(gen.translate("packageDefinition",uInterface));
    /*import_packages_interface*/
    
  for (Depend depend : uInterface.getDepends())
  {
    appendln(realSb, "");
    append(realSb, "import {0};",depend.getName());
  }
/* code for distributable interfaces.
    if(uInterface.getIsDistributed()==true)
    { if(uInterface.getDistributeTechnology().equals("RMI"))
      {
        appendln(realSb, "");
        append(realSb,"import {0};", "java.rmi.Remote");
        appendln(realSb, "");
        append(realSb,"import {0};", "java.rmi.RemoteException");
      }
    }
*/
  Boolean hasDate = false;
  Boolean hasTime = false;
  for(Constant aConstant : uInterface.getConstants())
  {
    if(aConstant.getType().equals("Time"))
    {
      hasTime = true;
    }
    else if(aConstant.getType().equals("Date"))
    {
      hasDate = true;
    }
  }

  if(hasDate == true)
  {
    appendln(realSb, "");
    append(realSb, "import java.sql.Date;");
  }

  if(hasTime == true)
  {
    appendln(realSb, "");
    append(realSb, "import java.sql.Time;");
  }
  
  // TODO: No test failed from removing this
  // for (String anImport : gInterface.getMultiLookup("import"))
  // {
  //  appendln(realSb, "");
  //  append(realSb, "import {0};",anImport);
  // }

    realSb.append(TEXT_3);
     if (uInterface.numberOfComments() > 0 && uInterface.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(uInterface.getComments()); toComment.addAll(Requirement.convertToComment(uInterface.getRequirements())); append(realSb, "\n{0}", Comment.format("Javadoc", toComment)); } 
    realSb.append(TEXT_4);
     if (uInterface.numberOfComments() > 0 && uInterface.numberOfRequirements() == 0) { append(realSb, "\n{0}", Comment.format("Javadoc",uInterface.getComments())); } 
    realSb.append(TEXT_5);
     if (uInterface.numberOfComments() == 0 && uInterface.numberOfRequirements() > 0) { append(realSb, "\n{0}", Requirement.format("Javadoc",uInterface.getRequirements())); } 
    realSb.append(TEXT_6);
     for (Position p : uInterface.getPositions()) { 
    realSb.append(TEXT_7);
    realSb.append(p.getLineNumber());
    realSb.append(TEXT_8);
    realSb.append(uInterface.getRelativePath(p.getFilename(),"Java"));
    realSb.append(TEXT_9);
     } 
    realSb.append(TEXT_10);
    realSb.append(uInterface.getName());
    realSb.append(gen.translate("isA",uInterface));
    realSb.append(TEXT_11);
    realSb.append(extraCode);
    realSb.append(TEXT_12);
     if (uInterface.hasConstants()) { 
    /*interface_constantDeclaration*/
    
appendln(realSb, "");
appendln(realSb,"  // CONSTANT MEMBERS  ");
 for (Constant aConstant : uInterface.getConstants()) 
 {
 	String constantName = aConstant.getName();
 	String constantModifier = "public static final";
    String constantType =  gen.translateInterfaceType(aConstant.getType());
 	String constantValue =  gen.translateInterfaceValue(aConstant.getValue(), constantType);

 
 if (!(constantValue.equals(""))){
 	appendln(realSb, "");
 	append(realSb, " {0} {1} {2} = {3};", constantModifier, constantType, constantName, constantValue);
 }
 else{
 	appendln(realSb, "");
 	append(realSb, " {0} {1} {2};", constantModifier, constantType, constantName);
 }
 }

    realSb.append(TEXT_13);
     } 
    realSb.append(TEXT_14);
     if (uInterface.hasMethods()) { 
    /*interface_AbstractMethodDeclaration*/
    
	 appendln(realSb, "");
     appendln(realSb,"  // ABSTRACT METHODS ");
    	for (Method aMethod : uInterface.getMethods()) 
    	{
    		String methodModifier = aMethod.getModifier().equals("") ? "public" : aMethod.getModifier();
    		String methodName = aMethod.getName();
    		String methodType = aMethod.getType();
    		String paramName="";
    		String paramType="";
    		String aSingleParameter="";
    		String isList="";
    	    String parameters = "";
    		if (aMethod.hasMethodParameters())
    		{
    			for (MethodParameter aMethodParam : aMethod.getMethodParameters()) 
    			{
    				paramName = aMethodParam.getName();
    				paramType = aMethodParam.getType();
        			isList = aMethodParam.getIsList() ? " [] " : " ";
    				aSingleParameter = paramType + isList + paramName;
        			parameters += aSingleParameter + ", ";
    			}
    			String finalParams = parameters.substring(0, parameters.length()-2);
    			appendln(realSb, "");
    			append(realSb, " {0} {1} {2}({3});", methodModifier, methodType, methodName, finalParams);	
    		}
    		else{
    			appendln(realSb, "");
    			append(realSb, " {0} {1} {2}();", methodModifier, methodType, methodName);
    		}
    	}

    realSb.append(TEXT_15);
     } 
    realSb.append(TEXT_16);

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
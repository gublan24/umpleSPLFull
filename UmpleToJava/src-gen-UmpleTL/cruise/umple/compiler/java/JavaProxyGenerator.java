/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.java;
import cruise.umple.parser.Position;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import java.util.regex.Pattern;

// line 9 "../../../../../UmpleTLTemplates/JavaProxyGenerator.ump"
public class JavaProxyGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = "";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JavaProxyGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 20 "../../../../../UmpleTLTemplates/JavaProxyGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 27 "../../../../../UmpleTLTemplates/JavaProxyGenerator.ump"
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
    
    /*JavaProxyGenerator*/
    realSb.append(TEXT_0);
    
  UmpleInterface uInterface = (UmpleInterface) uElement;
  //GeneratedInterface gInterface = uInterface.getGeneratedInterface();
  JavaGenerator gen = new JavaGenerator();
  gen.setModel(model);

  String extraCode = "";
  if (uInterface.getExtraCode() != null)
  {
    extraCode = uInterface.getExtraCode();
  }


    realSb.append(TEXT_1);
     if (uInterface.hasMethods()) { 
    /*proxy_AbstractMethodDeclaration*/
    
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

    realSb.append(TEXT_2);
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
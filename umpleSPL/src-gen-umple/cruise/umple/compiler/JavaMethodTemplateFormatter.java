/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.regex.Pattern;

// line 336 "../../../../src/Template.ump"
public class JavaMethodTemplateFormatter implements MethodTemplateFormatter
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "String spaces=\"\";" + NL + "    StringBuilder newCode = new StringBuilder();" + NL + "    StringBuilder realSb = sb;" + NL + "    if(numSpaces > 0) {" + NL + "        realSb = newCode;" + NL + "        spaces = _createSpacesString(numSpaces);" + NL + "        newCode.append(spaces);" + NL + "    }" + NL + "    " + NL;
  public static final String TEXT_1 = NL + "    if(numSpaces > 0) {" + NL + "        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));" + NL + "        sb.append(newCode);" + NL + "    }" + NL + "    return sb; ";
  public static final String TEXT_2 = "    StringBuilder sb = new StringBuilder();" + NL + "    return this.";
  public static final String TEXT_3 = "(";
  public static final String TEXT_4 = ").toString(); ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JavaMethodTemplateFormatter()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 340 "../../../../src/Template.ump"
  public String getPrimaryEmitMethodBody(String methodName, String params){
    return getJavaPrimaryEmitMethodBody(methodName, params);
  }

  // line 343 "../../../../src/Template.ump"
  public String getSecondaryEmitMethodBody(EmitResponse emitResp){
    return getJavaSecondaryEmitMethodBody(emitResp);
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getJavaSecondaryEmitMethodBody(Integer numSpaces, StringBuilder sb, EmitResponse emitResp){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(emitResp.getCode("Java"));
    realSb.append(TEXT_1);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getJavaSecondaryEmitMethodBody(EmitResponse emitResp){
        StringBuilder sb = new StringBuilder();
    return this._getJavaSecondaryEmitMethodBody(0,sb,emitResp).toString(); 
  }

  public StringBuilder _getJavaPrimaryEmitMethodBody(Integer numSpaces, StringBuilder sb, String methodName, String params){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_2);
    realSb.append(methodName);
    realSb.append(TEXT_3);
    realSb.append(params);
    realSb.append(TEXT_4);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getJavaPrimaryEmitMethodBody(String methodName, String params){
        StringBuilder sb = new StringBuilder();
    return this._getJavaPrimaryEmitMethodBody(0,sb,methodName,params).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}
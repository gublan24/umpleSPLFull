/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.regex.Pattern;

// line 368 "../../../../src/Template.ump"
public class CppMethodTemplateFormatter implements MethodTemplateFormatter
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "string spaces = \"\";" + NL + "  string newCode = \"\";" + NL + "  string *realSb = &sb;" + NL + "  if(numSpaces > 0) {" + NL + "        realSb = &newCode;" + NL + "        spaces = _createSpacesString(numSpaces);" + NL + "        newCode+=spaces;" + NL + "    }" + NL + "    " + NL;
  public static final String TEXT_1 = NL + "    if(numSpaces > 0) {" + NL + "        string replacement = NL + spaces;" + NL + "        for(string::size_type _szIdx_ = 0; (_szIdx_ = newCode.find(NL, _szIdx_)) != string::npos;newCode.replace(_szIdx_, NL.length(), replacement),_szIdx_ += replacement.length() - NL.length() + 1);" + NL + "        sb+=newCode;" + NL + "    }" + NL + "    return sb; ";
  public static final String TEXT_2 = "    string sb;" + NL + "    return this->";
  public static final String TEXT_3 = "(";
  public static final String TEXT_4 = "); ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CppMethodTemplateFormatter()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 372 "../../../../src/Template.ump"
  public String getPrimaryEmitMethodBody(String methodName, String params){
    return getCppPrimaryEmitMethodBody(methodName, params);
  }

  // line 375 "../../../../src/Template.ump"
  public String getSecondaryEmitMethodBody(EmitResponse emitResp){
    return getCppSecondaryEmitMethodBody(emitResp);
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getCppSecondaryEmitMethodBody(Integer numSpaces, StringBuilder sb, EmitResponse emitResp){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(emitResp.getCode("Cpp"));
    realSb.append(TEXT_1);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getCppSecondaryEmitMethodBody(EmitResponse emitResp){
        StringBuilder sb = new StringBuilder();
    return this._getCppSecondaryEmitMethodBody(0,sb,emitResp).toString(); 
  }

  public StringBuilder _getCppPrimaryEmitMethodBody(Integer numSpaces, StringBuilder sb, String methodName, String params){
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

  public String getCppPrimaryEmitMethodBody(String methodName, String params){
        StringBuilder sb = new StringBuilder();
    return this._getCppPrimaryEmitMethodBody(0,sb,methodName,params).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}
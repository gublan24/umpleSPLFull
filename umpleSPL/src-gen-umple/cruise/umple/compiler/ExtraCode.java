/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * 
 */
// line 339 "../../../../src/Umple_CodeMethod.ump"
// line 563 "../../../../src/Umple.ump"
public class ExtraCode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ExtraCode Attributes
  private List<CodeBlock> code;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ExtraCode()
  {
    code = new ArrayList<CodeBlock>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 343 "../../../../src/Umple_CodeMethod.ump"
   public void appendExtraCode(String newCode){
    code.add(new CodeBlock(newCode));
  }

  // line 348 "../../../../src/Umple_CodeMethod.ump"
   public void appendExtraCode(CodeBlock cb){
    code.add(cb);
  }

  // line 353 "../../../../src/Umple_CodeMethod.ump"
   public String getExtraCode(){
    String returnCode = "";
    if(getHasCode())
    {
      for(CodeBlock cb : code)
      {
        String temp = cb.getCode();
        returnCode += (temp == null ? "" : temp);
      }
    }
    return returnCode;
  }

  // line 367 "../../../../src/Umple_CodeMethod.ump"
   public boolean getHasCode(){
    return code.size() > 0;
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}
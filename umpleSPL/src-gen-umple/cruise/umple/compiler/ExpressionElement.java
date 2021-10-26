/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * Expression segment in a template
 */
// line 158 "../../../../src/Template.ump"
public class ExpressionElement extends TemplateElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ExpressionElement(Position aPosition, String aContent)
  {
    super(aPosition, aContent);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 164 "../../../../src/Template.ump"
  public void emit(EmitResponse responseBuffer, UmpleClass template) throws TemplateException{
    EmitResponse resetValue = computeContent();
    responseBuffer.getJavaCode().append("    ");      
    Utils.getStringAppend("Java", responseBuffer.getJavaCode(), getEmitResponse().getJavaCode().toString());
    responseBuffer.getJavaCode().append(System.getProperty("line.separator"));

    responseBuffer.getCppCode().append("    ");
    Utils.getStringAppend("Cpp", responseBuffer.getCppCode(), getEmitResponse().getCppCode().toString());
    responseBuffer.getCppCode().append(System.getProperty("line.separator"));
    resetContent(resetValue);
  }

}
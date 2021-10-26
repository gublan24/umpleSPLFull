/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Token;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * Scriplet segment in a template
 */
// line 177 "../../../../src/Template.ump"
public class CodeBlockElement extends TemplateElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CodeBlockElement(Position aPosition, String aContent)
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

  // line 185 "../../../../src/Template.ump"
  public void emit(EmitResponse responseBuffer, UmpleClass template) throws TemplateException{
    EmitResponse resetValue = computeContent();
	
	responseBuffer.getJavaCode().append("    ");
	responseBuffer.getJavaCode().append(getEmitResponse().getJavaCode());
	responseBuffer.getJavaCode().append(System.getProperty("line.separator"));
		
		
	responseBuffer.getCppCode().append("    ");
	responseBuffer.getCppCode().append(getEmitResponse().getCppCode());
	responseBuffer.getCppCode().append(System.getProperty("line.separator"));
		
    resetContent(resetValue);
  }

}
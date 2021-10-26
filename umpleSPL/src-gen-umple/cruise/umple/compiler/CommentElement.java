/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * Comment segment for a template contents
 */
// line 235 "../../../../src/Template.ump"
public class CommentElement extends TemplateElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CommentElement(Position aPosition, String aContent)
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

  // line 242 "../../../../src/Template.ump"
  public void emit(EmitResponse responseBuffer, UmpleClass template) throws TemplateException{
    String javaContent = getEmitResponse().getJavaCode().toString();		
	  javaContent = "/*" + javaContent + "*/";
	  
	  String cppContent = getEmitResponse().getCppCode().toString();
	  cppContent = "/*" + cppContent + "*/";
	  
	  responseBuffer.getJavaCode().append("    ");	
	  responseBuffer.getJavaCode().append(javaContent);
	  responseBuffer.getJavaCode().append(System.getProperty("line.separator"));
	  
	  responseBuffer.getCppCode().append("    ");		
	  responseBuffer.getCppCode().append(cppContent);
	  responseBuffer.getCppCode().append(System.getProperty("line.separator"));
  }

}
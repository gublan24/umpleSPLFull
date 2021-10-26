/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

// line 297 "../../../../src/Template.ump"
public class VariableElement extends TemplateElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VariableElement Attributes
  private int index;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public VariableElement(Position aPosition, String aContent, int aIndex)
  {
    super(aPosition, aContent);
    index = aIndex;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIndex(int aIndex)
  {
    boolean wasSet = false;
    index = aIndex;
    wasSet = true;
    return wasSet;
  }

  public int getIndex()
  {
    return index;
  }

  public void delete()
  {
    super.delete();
  }

  // line 307 "../../../../src/Template.ump"
  public void emit(EmitResponse responseBuffer, UmpleClass template){
    String fieldId = TemplateField.TEMPLATE_TEXT_FIELD + template.numberOfTemplateFields();
    EmitResponse fieldValue = new EmitResponse();
    String javaContent = getEmitResponse().getJavaCode().toString();
    String cppContent = getEmitResponse().getCppCode().toString();	
		
    fieldValue.getJavaCode().append(Utils.nlize("Java", javaContent));
    fieldValue.getCppCode().append(Utils.nlize("Cpp", cppContent));
				
    if(numberOfFields()>0)
    {
      removeField(getField(0));
    }
    template.addTemplateField(new TemplateField(fieldId, fieldValue));
		
    responseBuffer.getJavaCode().append("    ");		
    Utils.getStringAppend("Java", responseBuffer.getJavaCode(), fieldId);
    responseBuffer.getJavaCode().append(System.getProperty("line.separator"));

    responseBuffer.getCppCode().append("    ");		
    Utils.getStringAppend("Cpp", responseBuffer.getCppCode(), fieldId);
    responseBuffer.getCppCode().append(System.getProperty("line.separator"));
  }


  public String toString()
  {
    return super.toString() + "["+
            "index" + ":" + getIndex()+ "]";
  }
}
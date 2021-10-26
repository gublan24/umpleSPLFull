/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import cruise.umple.parser.ErrorMessage;
import java.util.*;

/**
 * Include segment in a template
 */
// line 201 "../../../../src/Template.ump"
public class IncludeTemplateElement extends TemplateElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //IncludeTemplateElement Attributes
  private TemplateName templateName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public IncludeTemplateElement(Position aPosition, String aContent, TemplateName aTemplateName)
  {
    super(aPosition, aContent);
    templateName = aTemplateName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTemplateName(TemplateName aTemplateName)
  {
    boolean wasSet = false;
    templateName = aTemplateName;
    wasSet = true;
    return wasSet;
  }

  public TemplateName getTemplateName()
  {
    return templateName;
  }

  public void delete()
  {
    super.delete();
  }

  // line 210 "../../../../src/Template.ump"
  public void emit(EmitResponse responseBuffer, UmpleClass template) throws TemplateException{
    String classname = getTemplateName().getClassName();
		String key = getTemplateName().getName();
		UmpleClass referenceTemplate = getTemplateName().getClassName()==null?template:template.getSourceModel().getUmpleClass(getTemplateName().getClassName());		
		if(referenceTemplate!=null)
		{
			TemplateAttributeParser val = null;
			val = referenceTemplate.getTemplateEmitStringMap().get(key);
			if(val !=null)
			{
				for (TemplateElement templateElement : val.getElements())
				{	  
					templateElement.emit(responseBuffer,template);
				}
			} else {
				String refTemplateFullName = key;
				if(classname != null && classname.length() > 0) {
					refTemplateFullName = classname + "." + refTemplateFullName;
				}
				throw new TemplateException(getPosition(), new ErrorMessage(3504, getPosition(),refTemplateFullName));
			}
		}
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "templateName" + "=" + (getTemplateName() != null ? !getTemplateName().equals(this)  ? getTemplateName().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Method rpesentations in a template
 */
// line 68 "../../../../src/Template.ump"
public class TemplateMethod
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TemplateMethod Attributes
  private Method method;
  private List<TemplateMethodBlock> templates;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TemplateMethod(Method aMethod)
  {
    method = aMethod;
    templates = new ArrayList<TemplateMethodBlock>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMethod(Method aMethod)
  {
    boolean wasSet = false;
    method = aMethod;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addTemplate(TemplateMethodBlock aTemplate)
  {
    boolean wasAdded = false;
    wasAdded = templates.add(aTemplate);
    return wasAdded;
  }

  public boolean removeTemplate(TemplateMethodBlock aTemplate)
  {
    boolean wasRemoved = false;
    wasRemoved = templates.remove(aTemplate);
    return wasRemoved;
  }

  public Method getMethod()
  {
    return method;
  }
  /* Code from template attribute_GetMany */
  public TemplateMethodBlock getTemplate(int index)
  {
    TemplateMethodBlock aTemplate = templates.get(index);
    return aTemplate;
  }

  public TemplateMethodBlock[] getTemplates()
  {
    TemplateMethodBlock[] newTemplates = templates.toArray(new TemplateMethodBlock[templates.size()]);
    return newTemplates;
  }

  public int numberOfTemplates()
  {
    int number = templates.size();
    return number;
  }

  public boolean hasTemplates()
  {
    boolean has = templates.size() > 0;
    return has;
  }

  public int indexOfTemplate(TemplateMethodBlock aTemplate)
  {
    int index = templates.indexOf(aTemplate);
    return index;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "method" + "=" + (getMethod() != null ? !getMethod().equals(this)  ? getMethod().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
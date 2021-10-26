/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

// line 59 "../../../../src/Template.ump"
public class TemplateMethodBlock
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TemplateMethodBlock Attributes
  private Position position;
  private TemplateName template;
  private List<String> parameters;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TemplateMethodBlock(Position aPosition, TemplateName aTemplate)
  {
    position = aPosition;
    template = aTemplate;
    parameters = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setTemplate(TemplateName aTemplate)
  {
    boolean wasSet = false;
    template = aTemplate;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addParameter(String aParameter)
  {
    boolean wasAdded = false;
    wasAdded = parameters.add(aParameter);
    return wasAdded;
  }

  public boolean removeParameter(String aParameter)
  {
    boolean wasRemoved = false;
    wasRemoved = parameters.remove(aParameter);
    return wasRemoved;
  }

  public Position getPosition()
  {
    return position;
  }

  public TemplateName getTemplate()
  {
    return template;
  }
  /* Code from template attribute_GetMany */
  public String getParameter(int index)
  {
    String aParameter = parameters.get(index);
    return aParameter;
  }

  public String[] getParameters()
  {
    String[] newParameters = parameters.toArray(new String[parameters.size()]);
    return newParameters;
  }

  public int numberOfParameters()
  {
    int number = parameters.size();
    return number;
  }

  public boolean hasParameters()
  {
    boolean has = parameters.size() > 0;
    return has;
  }

  public int indexOfParameter(String aParameter)
  {
    int index = parameters.indexOf(aParameter);
    return index;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "template" + "=" + (getTemplate() != null ? !getTemplate().equals(this)  ? getTemplate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
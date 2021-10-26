/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;

// line 46 "../../../../src/Parser.ump"
public class RulePartValue
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RulePartValue Attributes
  private String name;
  private String value;

  //RulePartValue Associations
  private Position position;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RulePartValue()
  {
    name = null;
    value = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getValue()
  {
    return value;
  }
  /* Code from template association_GetOne */
  public Position getPosition()
  {
    return position;
  }

  public boolean hasPosition()
  {
    boolean has = position != null;
    return has;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setPosition(Position aNewPosition)
  {
    boolean wasSet = false;
    position = aNewPosition;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    position = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "value" + ":" + getValue()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position = "+(getPosition()!=null?Integer.toHexString(System.identityHashCode(getPosition())):"null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import cruise.umple.util.*;
import java.util.*;

/**
 * Represents an enumeration
 */
// line 582 "../../../../src/Umple.ump"
// line 1 "../../../../src/UmpleEnumeration_Code.ump"
public class UmpleEnumeration
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleEnumeration Attributes
  private String name;
  private List<String> enumValues;

  //UmpleEnumeration Associations
  private Position position;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleEnumeration(String aName)
  {
    name = aName;
    enumValues = new ArrayList<String>();
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
  /* Code from template attribute_SetMany */
  public boolean addEnumValue(String aEnumValue)
  {
    boolean wasAdded = false;
    wasAdded = enumValues.add(aEnumValue);
    return wasAdded;
  }

  public boolean removeEnumValue(String aEnumValue)
  {
    boolean wasRemoved = false;
    wasRemoved = enumValues.remove(aEnumValue);
    return wasRemoved;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template attribute_GetMany */
  public String getEnumValue(int index)
  {
    String aEnumValue = enumValues.get(index);
    return aEnumValue;
  }

  public String[] getEnumValues()
  {
    String[] newEnumValues = enumValues.toArray(new String[enumValues.size()]);
    return newEnumValues;
  }

  public int numberOfEnumValues()
  {
    int number = enumValues.size();
    return number;
  }

  public boolean hasEnumValues()
  {
    boolean has = enumValues.size() > 0;
    return has;
  }

  public int indexOfEnumValue(String aEnumValue)
  {
    int index = enumValues.indexOf(aEnumValue);
    return index;
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

  // line 5 "../../../../src/UmpleEnumeration_Code.ump"
   public boolean hasSameName(String comparison){
    return this.name.equals(comparison) || StringFormatter.toPascalCase(this.name).equals(StringFormatter.toPascalCase(comparison));
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position = "+(getPosition()!=null?Integer.toHexString(System.identityHashCode(getPosition())):"null");
  }
}
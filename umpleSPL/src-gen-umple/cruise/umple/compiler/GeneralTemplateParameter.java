/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * This class is used to specify parameters for traits.
 * TODO : when can also apply this to support formal template concepts for classes.
 */
// line 828 "../../../../src/Umple.ump"
public class GeneralTemplateParameter
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GeneralTemplateParameter Attributes
  private String name;
  private String type;
  private List<String> interfacesAndClass;
  private String defaultValue;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GeneralTemplateParameter(String aName, String aType)
  {
    name = aName;
    type = aType;
    interfacesAndClass = new ArrayList<String>();
    defaultValue = "";
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

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addInterfacesAndClass(String aInterfacesAndClass)
  {
    boolean wasAdded = false;
    wasAdded = interfacesAndClass.add(aInterfacesAndClass);
    return wasAdded;
  }

  public boolean removeInterfacesAndClass(String aInterfacesAndClass)
  {
    boolean wasRemoved = false;
    wasRemoved = interfacesAndClass.remove(aInterfacesAndClass);
    return wasRemoved;
  }

  public boolean setDefaultValue(String aDefaultValue)
  {
    boolean wasSet = false;
    defaultValue = aDefaultValue;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getType()
  {
    return type;
  }
  /* Code from template attribute_GetMany */
  public String getInterfacesAndClass(int index)
  {
    String aInterfacesAndClass = interfacesAndClass.get(index);
    return aInterfacesAndClass;
  }

  public String[] getInterfacesAndClass()
  {
    String[] newInterfacesAndClass = interfacesAndClass.toArray(new String[interfacesAndClass.size()]);
    return newInterfacesAndClass;
  }

  public int numberOfInterfacesAndClass()
  {
    int number = interfacesAndClass.size();
    return number;
  }

  public boolean hasInterfacesAndClass()
  {
    boolean has = interfacesAndClass.size() > 0;
    return has;
  }

  public int indexOfInterfacesAndClass(String aInterfacesAndClass)
  {
    int index = interfacesAndClass.indexOf(aInterfacesAndClass);
    return index;
  }

  public String getDefaultValue()
  {
    return defaultValue;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "type" + ":" + getType()+ "," +
            "defaultValue" + ":" + getDefaultValue()+ "]";
  }
}
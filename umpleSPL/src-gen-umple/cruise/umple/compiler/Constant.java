/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Represents a constant.
 */
// line 311 "../../../../src/Umple.ump"
public class Constant
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Constant Attributes
  private String name;
  private String type;
  private String modifier;
  private String value;
  private boolean isInternal;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Constant(String aName, String aType, String aModifier, String aValue)
  {
    name = aName;
    type = aType;
    modifier = aModifier;
    value = aValue;
    isInternal = false;
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

  public boolean setModifier(String aModifier)
  {
    boolean wasSet = false;
    modifier = aModifier;
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

  public boolean setIsInternal(boolean aIsInternal)
  {
    boolean wasSet = false;
    isInternal = aIsInternal;
    wasSet = true;
    return wasSet;
  }

  /**
   * The name of the constant.
   */
  public String getName()
  {
    return name;
  }

  /**
   * The type of the constant.
   */
  public String getType()
  {
    return type;
  }

  /**
   * The modifier of the constant.
   */
  public String getModifier()
  {
    return modifier;
  }

  /**
   * The value of the constant.
   */
  public String getValue()
  {
    return value;
  }

  /**
   * Issue 322 - by default set internal to false
   */
  public boolean getIsInternal()
  {
    return isInternal;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInternal()
  {
    return isInternal;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "type" + ":" + getType()+ "," +
            "modifier" + ":" + getModifier()+ "," +
            "value" + ":" + getValue()+ "," +
            "isInternal" + ":" + getIsInternal()+ "]";
  }
}
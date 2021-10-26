/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * The assertion within the method or class.
 */
// line 242 "../../../../src/Umple.ump"
public class UmpleAssertion
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleAssertion Attributes
  private String name;
  private String type;
  private String level;
  private String action;
  private String assertCode;
  private int locOrder;
  private boolean isTimed;

  //UmpleAssertion Associations
  private UmpleTestCase umpleTestCase;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleAssertion(String aName, String aType, String aLevel, String aAction, String aAssertCode, int aLocOrder)
  {
    name = aName;
    type = aType;
    level = aLevel;
    action = aAction;
    assertCode = aAssertCode;
    locOrder = aLocOrder;
    isTimed = false;
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

  public boolean setLevel(String aLevel)
  {
    boolean wasSet = false;
    level = aLevel;
    wasSet = true;
    return wasSet;
  }

  public boolean setAction(String aAction)
  {
    boolean wasSet = false;
    action = aAction;
    wasSet = true;
    return wasSet;
  }

  public boolean setAssertCode(String aAssertCode)
  {
    boolean wasSet = false;
    assertCode = aAssertCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setLocOrder(int aLocOrder)
  {
    boolean wasSet = false;
    locOrder = aLocOrder;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsTimed(boolean aIsTimed)
  {
    boolean wasSet = false;
    isTimed = aIsTimed;
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

  public String getLevel()
  {
    return level;
  }

  public String getAction()
  {
    return action;
  }

  public String getAssertCode()
  {
    return assertCode;
  }

  public int getLocOrder()
  {
    return locOrder;
  }

  public boolean getIsTimed()
  {
    return isTimed;
  }
  /* Code from template association_GetOne */
  public UmpleTestCase getUmpleTestCase()
  {
    return umpleTestCase;
  }

  public boolean hasUmpleTestCase()
  {
    boolean has = umpleTestCase != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    boolean wasSet = false;
    UmpleTestCase existingUmpleTestCase = umpleTestCase;
    umpleTestCase = aUmpleTestCase;
    if (existingUmpleTestCase != null && !existingUmpleTestCase.equals(aUmpleTestCase))
    {
      existingUmpleTestCase.removeUmpleAssertion(this);
    }
    if (aUmpleTestCase != null)
    {
      aUmpleTestCase.addUmpleAssertion(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (umpleTestCase != null)
    {
      UmpleTestCase placeholderUmpleTestCase = umpleTestCase;
      this.umpleTestCase = null;
      placeholderUmpleTestCase.removeUmpleAssertion(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "type" + ":" + getType()+ "," +
            "level" + ":" + getLevel()+ "," +
            "action" + ":" + getAction()+ "," +
            "assertCode" + ":" + getAssertCode()+ "," +
            "locOrder" + ":" + getLocOrder()+ "," +
            "isTimed" + ":" + getIsTimed()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleTestCase = "+(getUmpleTestCase()!=null?Integer.toHexString(System.identityHashCode(getUmpleTestCase())):"null");
  }
}
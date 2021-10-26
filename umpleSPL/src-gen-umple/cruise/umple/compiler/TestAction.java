/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * test action statements
 */
// line 272 "../../../../src/Umple.ump"
public class TestAction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TestAction Attributes
  private String name;
  private String actionCode;
  private String type;
  private int locOrder;

  //TestAction Associations
  private UmpleTestCase umpleTestCase;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TestAction(String aName, String aActionCode, String aType, int aLocOrder)
  {
    name = aName;
    actionCode = aActionCode;
    type = aType;
    locOrder = aLocOrder;
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

  public boolean setActionCode(String aActionCode)
  {
    boolean wasSet = false;
    actionCode = aActionCode;
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

  public boolean setLocOrder(int aLocOrder)
  {
    boolean wasSet = false;
    locOrder = aLocOrder;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getActionCode()
  {
    return actionCode;
  }

  public String getType()
  {
    return type;
  }

  public int getLocOrder()
  {
    return locOrder;
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
      existingUmpleTestCase.removeTestAction(this);
    }
    if (aUmpleTestCase != null)
    {
      aUmpleTestCase.addTestAction(this);
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
      placeholderUmpleTestCase.removeTestAction(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "actionCode" + ":" + getActionCode()+ "," +
            "type" + ":" + getType()+ "," +
            "locOrder" + ":" + getLocOrder()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleTestCase = "+(getUmpleTestCase()!=null?Integer.toHexString(System.identityHashCode(getUmpleTestCase())):"null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 281 "../../../../src/Umple.ump"
public class TestParameter
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TestParameter Attributes
  private String value;
  private String type;
  private String name;

  //TestParameter Associations
  private TestInit testInit;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TestParameter(String aValue, String aType, String aName)
  {
    value = aValue;
    type = aType;
    name = aName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
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

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public String getValue()
  {
    return value;
  }

  public String getType()
  {
    return type;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template association_GetOne */
  public TestInit getTestInit()
  {
    return testInit;
  }

  public boolean hasTestInit()
  {
    boolean has = testInit != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setTestInit(TestInit aTestInit)
  {
    boolean wasSet = false;
    TestInit existingTestInit = testInit;
    testInit = aTestInit;
    if (existingTestInit != null && !existingTestInit.equals(aTestInit))
    {
      existingTestInit.removeTestParameter(this);
    }
    if (aTestInit != null)
    {
      aTestInit.addTestParameter(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (testInit != null)
    {
      TestInit placeholderTestInit = testInit;
      this.testInit = null;
      placeholderTestInit.removeTestParameter(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "value" + ":" + getValue()+ "," +
            "type" + ":" + getType()+ "," +
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "testInit = "+(getTestInit()!=null?Integer.toHexString(System.identityHashCode(getTestInit())):"null");
  }
}
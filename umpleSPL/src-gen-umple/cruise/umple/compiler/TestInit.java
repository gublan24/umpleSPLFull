/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * initialization statements in test that holds
 * identifier objectname (parameters);
 */
// line 297 "../../../../src/Umple.ump"
public class TestInit
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TestInit Attributes
  private String identifier;
  private String objectName;
  private String code;

  //TestInit Associations
  private List<TestParameter> testParameters;
  private UmpleTestCase umpleTestCase;
  private UmpleClass umpleClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TestInit(String aIdentifier, String aObjectName, String aCode)
  {
    identifier = aIdentifier;
    objectName = aObjectName;
    code = aCode;
    testParameters = new ArrayList<TestParameter>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIdentifier(String aIdentifier)
  {
    boolean wasSet = false;
    identifier = aIdentifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setObjectName(String aObjectName)
  {
    boolean wasSet = false;
    objectName = aObjectName;
    wasSet = true;
    return wasSet;
  }

  public boolean setCode(String aCode)
  {
    boolean wasSet = false;
    code = aCode;
    wasSet = true;
    return wasSet;
  }

  public String getIdentifier()
  {
    return identifier;
  }

  public String getObjectName()
  {
    return objectName;
  }

  public String getCode()
  {
    return code;
  }
  /* Code from template association_GetMany */
  public TestParameter getTestParameter(int index)
  {
    TestParameter aTestParameter = testParameters.get(index);
    return aTestParameter;
  }

  public List<TestParameter> getTestParameters()
  {
    List<TestParameter> newTestParameters = Collections.unmodifiableList(testParameters);
    return newTestParameters;
  }

  public int numberOfTestParameters()
  {
    int number = testParameters.size();
    return number;
  }

  public boolean hasTestParameters()
  {
    boolean has = testParameters.size() > 0;
    return has;
  }

  public int indexOfTestParameter(TestParameter aTestParameter)
  {
    int index = testParameters.indexOf(aTestParameter);
    return index;
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
  /* Code from template association_GetOne */
  public UmpleClass getUmpleClass()
  {
    return umpleClass;
  }

  public boolean hasUmpleClass()
  {
    boolean has = umpleClass != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTestParameters()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addTestParameter(TestParameter aTestParameter)
  {
    boolean wasAdded = false;
    if (testParameters.contains(aTestParameter)) { return false; }
    TestInit existingTestInit = aTestParameter.getTestInit();
    if (existingTestInit == null)
    {
      aTestParameter.setTestInit(this);
    }
    else if (!this.equals(existingTestInit))
    {
      existingTestInit.removeTestParameter(aTestParameter);
      addTestParameter(aTestParameter);
    }
    else
    {
      testParameters.add(aTestParameter);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTestParameter(TestParameter aTestParameter)
  {
    boolean wasRemoved = false;
    if (testParameters.contains(aTestParameter))
    {
      testParameters.remove(aTestParameter);
      aTestParameter.setTestInit(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTestParameterAt(TestParameter aTestParameter, int index)
  {  
    boolean wasAdded = false;
    if(addTestParameter(aTestParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTestParameters()) { index = numberOfTestParameters() - 1; }
      testParameters.remove(aTestParameter);
      testParameters.add(index, aTestParameter);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTestParameterAt(TestParameter aTestParameter, int index)
  {
    boolean wasAdded = false;
    if(testParameters.contains(aTestParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTestParameters()) { index = numberOfTestParameters() - 1; }
      testParameters.remove(aTestParameter);
      testParameters.add(index, aTestParameter);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTestParameterAt(aTestParameter, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    boolean wasSet = false;
    UmpleTestCase existingUmpleTestCase = umpleTestCase;
    umpleTestCase = aUmpleTestCase;
    if (existingUmpleTestCase != null && !existingUmpleTestCase.equals(aUmpleTestCase))
    {
      existingUmpleTestCase.removeTestInit(this);
    }
    if (aUmpleTestCase != null)
    {
      aUmpleTestCase.addTestInit(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeTestInit(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addTestInit(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !testParameters.isEmpty() )
    {
      testParameters.get(0).setTestInit(null);
    }
    if (umpleTestCase != null)
    {
      UmpleTestCase placeholderUmpleTestCase = umpleTestCase;
      this.umpleTestCase = null;
      placeholderUmpleTestCase.removeTestInit(this);
    }
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeTestInit(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "identifier" + ":" + getIdentifier()+ "," +
            "objectName" + ":" + getObjectName()+ "," +
            "code" + ":" + getCode()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleTestCase = "+(getUmpleTestCase()!=null?Integer.toHexString(System.identityHashCode(getUmpleTestCase())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null");
  }
}
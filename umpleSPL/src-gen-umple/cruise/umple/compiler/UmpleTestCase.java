/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Test Case  at the  Class level .
 */
// line 256 "../../../../src/Umple.ump"
public class UmpleTestCase
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleTestCase Attributes
  private String name;
  private int locOrder;
  private boolean isTimed;
  private boolean isOverride;
  private boolean isConcrete;
  private String concreteLang;
  private Map<Integer,String> bodyCode;

  //UmpleTestCase Associations
  private List<UmpleAssertion> umpleAssertions;
  private List<TestAction> testActions;
  private List<TestInit> testInits;
  private MethodBody methodBody;
  private UmpleInterface umpleInterface;
  private UmpleClass umpleClass;
  private UmpleTrait umpleTrait;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleTestCase(String aName, int aLocOrder)
  {
    name = aName;
    locOrder = aLocOrder;
    isTimed = false;
    isOverride = false;
    isConcrete = false;
    concreteLang = "";
    bodyCode = new HashMap<Integer,String>();
    umpleAssertions = new ArrayList<UmpleAssertion>();
    testActions = new ArrayList<TestAction>();
    testInits = new ArrayList<TestInit>();
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

  public boolean setIsOverride(boolean aIsOverride)
  {
    boolean wasSet = false;
    isOverride = aIsOverride;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsConcrete(boolean aIsConcrete)
  {
    boolean wasSet = false;
    isConcrete = aIsConcrete;
    wasSet = true;
    return wasSet;
  }

  public boolean setConcreteLang(String aConcreteLang)
  {
    boolean wasSet = false;
    concreteLang = aConcreteLang;
    wasSet = true;
    return wasSet;
  }

  public boolean setBodyCode(Map<Integer,String> aBodyCode)
  {
    boolean wasSet = false;
    bodyCode = aBodyCode;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public int getLocOrder()
  {
    return locOrder;
  }

  public boolean getIsTimed()
  {
    return isTimed;
  }

  public boolean getIsOverride()
  {
    return isOverride;
  }

  public boolean getIsConcrete()
  {
    return isConcrete;
  }

  public String getConcreteLang()
  {
    return concreteLang;
  }

  public Map<Integer,String> getBodyCode()
  {
    return bodyCode;
  }
  /* Code from template association_GetMany */
  public UmpleAssertion getUmpleAssertion(int index)
  {
    UmpleAssertion aUmpleAssertion = umpleAssertions.get(index);
    return aUmpleAssertion;
  }

  public List<UmpleAssertion> getUmpleAssertions()
  {
    List<UmpleAssertion> newUmpleAssertions = Collections.unmodifiableList(umpleAssertions);
    return newUmpleAssertions;
  }

  public int numberOfUmpleAssertions()
  {
    int number = umpleAssertions.size();
    return number;
  }

  public boolean hasUmpleAssertions()
  {
    boolean has = umpleAssertions.size() > 0;
    return has;
  }

  public int indexOfUmpleAssertion(UmpleAssertion aUmpleAssertion)
  {
    int index = umpleAssertions.indexOf(aUmpleAssertion);
    return index;
  }
  /* Code from template association_GetMany */
  public TestAction getTestAction(int index)
  {
    TestAction aTestAction = testActions.get(index);
    return aTestAction;
  }

  public List<TestAction> getTestActions()
  {
    List<TestAction> newTestActions = Collections.unmodifiableList(testActions);
    return newTestActions;
  }

  public int numberOfTestActions()
  {
    int number = testActions.size();
    return number;
  }

  public boolean hasTestActions()
  {
    boolean has = testActions.size() > 0;
    return has;
  }

  public int indexOfTestAction(TestAction aTestAction)
  {
    int index = testActions.indexOf(aTestAction);
    return index;
  }
  /* Code from template association_GetMany */
  public TestInit getTestInit(int index)
  {
    TestInit aTestInit = testInits.get(index);
    return aTestInit;
  }

  public List<TestInit> getTestInits()
  {
    List<TestInit> newTestInits = Collections.unmodifiableList(testInits);
    return newTestInits;
  }

  public int numberOfTestInits()
  {
    int number = testInits.size();
    return number;
  }

  public boolean hasTestInits()
  {
    boolean has = testInits.size() > 0;
    return has;
  }

  public int indexOfTestInit(TestInit aTestInit)
  {
    int index = testInits.indexOf(aTestInit);
    return index;
  }
  /* Code from template association_GetOne */
  public MethodBody getMethodBody()
  {
    return methodBody;
  }

  public boolean hasMethodBody()
  {
    boolean has = methodBody != null;
    return has;
  }
  /* Code from template association_GetOne */
  public UmpleInterface getUmpleInterface()
  {
    return umpleInterface;
  }

  public boolean hasUmpleInterface()
  {
    boolean has = umpleInterface != null;
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
  /* Code from template association_GetOne */
  public UmpleTrait getUmpleTrait()
  {
    return umpleTrait;
  }

  public boolean hasUmpleTrait()
  {
    boolean has = umpleTrait != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleAssertions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addUmpleAssertion(UmpleAssertion aUmpleAssertion)
  {
    boolean wasAdded = false;
    if (umpleAssertions.contains(aUmpleAssertion)) { return false; }
    UmpleTestCase existingUmpleTestCase = aUmpleAssertion.getUmpleTestCase();
    if (existingUmpleTestCase == null)
    {
      aUmpleAssertion.setUmpleTestCase(this);
    }
    else if (!this.equals(existingUmpleTestCase))
    {
      existingUmpleTestCase.removeUmpleAssertion(aUmpleAssertion);
      addUmpleAssertion(aUmpleAssertion);
    }
    else
    {
      umpleAssertions.add(aUmpleAssertion);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleAssertion(UmpleAssertion aUmpleAssertion)
  {
    boolean wasRemoved = false;
    if (umpleAssertions.contains(aUmpleAssertion))
    {
      umpleAssertions.remove(aUmpleAssertion);
      aUmpleAssertion.setUmpleTestCase(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleAssertionAt(UmpleAssertion aUmpleAssertion, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleAssertion(aUmpleAssertion))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleAssertions()) { index = numberOfUmpleAssertions() - 1; }
      umpleAssertions.remove(aUmpleAssertion);
      umpleAssertions.add(index, aUmpleAssertion);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleAssertionAt(UmpleAssertion aUmpleAssertion, int index)
  {
    boolean wasAdded = false;
    if(umpleAssertions.contains(aUmpleAssertion))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleAssertions()) { index = numberOfUmpleAssertions() - 1; }
      umpleAssertions.remove(aUmpleAssertion);
      umpleAssertions.add(index, aUmpleAssertion);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleAssertionAt(aUmpleAssertion, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTestActions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addTestAction(TestAction aTestAction)
  {
    boolean wasAdded = false;
    if (testActions.contains(aTestAction)) { return false; }
    UmpleTestCase existingUmpleTestCase = aTestAction.getUmpleTestCase();
    if (existingUmpleTestCase == null)
    {
      aTestAction.setUmpleTestCase(this);
    }
    else if (!this.equals(existingUmpleTestCase))
    {
      existingUmpleTestCase.removeTestAction(aTestAction);
      addTestAction(aTestAction);
    }
    else
    {
      testActions.add(aTestAction);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTestAction(TestAction aTestAction)
  {
    boolean wasRemoved = false;
    if (testActions.contains(aTestAction))
    {
      testActions.remove(aTestAction);
      aTestAction.setUmpleTestCase(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTestActionAt(TestAction aTestAction, int index)
  {  
    boolean wasAdded = false;
    if(addTestAction(aTestAction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTestActions()) { index = numberOfTestActions() - 1; }
      testActions.remove(aTestAction);
      testActions.add(index, aTestAction);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTestActionAt(TestAction aTestAction, int index)
  {
    boolean wasAdded = false;
    if(testActions.contains(aTestAction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTestActions()) { index = numberOfTestActions() - 1; }
      testActions.remove(aTestAction);
      testActions.add(index, aTestAction);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTestActionAt(aTestAction, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTestInits()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addTestInit(TestInit aTestInit)
  {
    boolean wasAdded = false;
    if (testInits.contains(aTestInit)) { return false; }
    UmpleTestCase existingUmpleTestCase = aTestInit.getUmpleTestCase();
    if (existingUmpleTestCase == null)
    {
      aTestInit.setUmpleTestCase(this);
    }
    else if (!this.equals(existingUmpleTestCase))
    {
      existingUmpleTestCase.removeTestInit(aTestInit);
      addTestInit(aTestInit);
    }
    else
    {
      testInits.add(aTestInit);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTestInit(TestInit aTestInit)
  {
    boolean wasRemoved = false;
    if (testInits.contains(aTestInit))
    {
      testInits.remove(aTestInit);
      aTestInit.setUmpleTestCase(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTestInitAt(TestInit aTestInit, int index)
  {  
    boolean wasAdded = false;
    if(addTestInit(aTestInit))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTestInits()) { index = numberOfTestInits() - 1; }
      testInits.remove(aTestInit);
      testInits.add(index, aTestInit);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTestInitAt(TestInit aTestInit, int index)
  {
    boolean wasAdded = false;
    if(testInits.contains(aTestInit))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTestInits()) { index = numberOfTestInits() - 1; }
      testInits.remove(aTestInit);
      testInits.add(index, aTestInit);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTestInitAt(aTestInit, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setMethodBody(MethodBody aMethodBody)
  {
    boolean wasSet = false;
    MethodBody existingMethodBody = methodBody;
    methodBody = aMethodBody;
    if (existingMethodBody != null && !existingMethodBody.equals(aMethodBody))
    {
      existingMethodBody.removeUmpleTestCase(this);
    }
    if (aMethodBody != null)
    {
      aMethodBody.addUmpleTestCase(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleInterface(UmpleInterface aUmpleInterface)
  {
    boolean wasSet = false;
    UmpleInterface existingUmpleInterface = umpleInterface;
    umpleInterface = aUmpleInterface;
    if (existingUmpleInterface != null && !existingUmpleInterface.equals(aUmpleInterface))
    {
      existingUmpleInterface.removeUmpleTestCase(this);
    }
    if (aUmpleInterface != null)
    {
      aUmpleInterface.addUmpleTestCase(this);
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
      existingUmpleClass.removeUmpleTestCase(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addUmpleTestCase(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleTrait(UmpleTrait aUmpleTrait)
  {
    boolean wasSet = false;
    UmpleTrait existingUmpleTrait = umpleTrait;
    umpleTrait = aUmpleTrait;
    if (existingUmpleTrait != null && !existingUmpleTrait.equals(aUmpleTrait))
    {
      existingUmpleTrait.removeUmpleTestCase(this);
    }
    if (aUmpleTrait != null)
    {
      aUmpleTrait.addUmpleTestCase(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !umpleAssertions.isEmpty() )
    {
      umpleAssertions.get(0).setUmpleTestCase(null);
    }
    while( !testActions.isEmpty() )
    {
      testActions.get(0).setUmpleTestCase(null);
    }
    while( !testInits.isEmpty() )
    {
      testInits.get(0).setUmpleTestCase(null);
    }
    if (methodBody != null)
    {
      MethodBody placeholderMethodBody = methodBody;
      this.methodBody = null;
      placeholderMethodBody.removeUmpleTestCase(this);
    }
    if (umpleInterface != null)
    {
      UmpleInterface placeholderUmpleInterface = umpleInterface;
      this.umpleInterface = null;
      placeholderUmpleInterface.removeUmpleTestCase(this);
    }
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeUmpleTestCase(this);
    }
    if (umpleTrait != null)
    {
      UmpleTrait placeholderUmpleTrait = umpleTrait;
      this.umpleTrait = null;
      placeholderUmpleTrait.removeUmpleTestCase(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "locOrder" + ":" + getLocOrder()+ "," +
            "isTimed" + ":" + getIsTimed()+ "," +
            "isOverride" + ":" + getIsOverride()+ "," +
            "isConcrete" + ":" + getIsConcrete()+ "," +
            "concreteLang" + ":" + getConcreteLang()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "bodyCode" + "=" + (getBodyCode() != null ? !getBodyCode().equals(this)  ? getBodyCode().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "methodBody = "+(getMethodBody()!=null?Integer.toHexString(System.identityHashCode(getMethodBody())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleInterface = "+(getUmpleInterface()!=null?Integer.toHexString(System.identityHashCode(getUmpleInterface())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleTrait = "+(getUmpleTrait()!=null?Integer.toHexString(System.identityHashCode(getUmpleTrait())):"null");
  }
}
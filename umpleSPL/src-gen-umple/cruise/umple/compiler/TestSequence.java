/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 288 "../../../../src/Umple.ump"
public class TestSequence
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TestSequence Attributes
  private String name;
  private List<String> tests;

  //TestSequence Associations
  private UmpleClass umpleClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TestSequence(String aName)
  {
    name = aName;
    tests = new ArrayList<String>();
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
  public boolean addTest(String aTest)
  {
    boolean wasAdded = false;
    wasAdded = tests.add(aTest);
    return wasAdded;
  }

  public boolean removeTest(String aTest)
  {
    boolean wasRemoved = false;
    wasRemoved = tests.remove(aTest);
    return wasRemoved;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template attribute_GetMany */
  public String getTest(int index)
  {
    String aTest = tests.get(index);
    return aTest;
  }

  public String[] getTests()
  {
    String[] newTests = tests.toArray(new String[tests.size()]);
    return newTests;
  }

  public int numberOfTests()
  {
    int number = tests.size();
    return number;
  }

  public boolean hasTests()
  {
    boolean has = tests.size() > 0;
    return has;
  }

  public int indexOfTest(String aTest)
  {
    int index = tests.indexOf(aTest);
    return index;
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
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeTestSequence(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addTestSequence(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeTestSequence(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null");
  }
}
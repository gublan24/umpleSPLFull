/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 13 "../../../../src/TestHarnessCompositionsLeft.ump"
public class XM_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //XM_1 Attributes
  private int num;

  //XM_1 Associations
  private List<YM_1> ym_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public XM_1(int aNum)
  {
    num = aNum;
    ym_1 = new ArrayList<YM_1>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNum(int aNum)
  {
    boolean wasSet = false;
    num = aNum;
    wasSet = true;
    return wasSet;
  }

  public int getNum()
  {
    return num;
  }
  /* Code from template association_GetMany */
  public YM_1 getYm_1(int index)
  {
    YM_1 aYm_1 = ym_1.get(index);
    return aYm_1;
  }

  public List<YM_1> getYm_1()
  {
    List<YM_1> newYm_1 = Collections.unmodifiableList(ym_1);
    return newYm_1;
  }

  public int numberOfYm_1()
  {
    int number = ym_1.size();
    return number;
  }

  public boolean hasYm_1()
  {
    boolean has = ym_1.size() > 0;
    return has;
  }

  public int indexOfYm_1(YM_1 aYm_1)
  {
    int index = ym_1.indexOf(aYm_1);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfYm_1Valid()
  {
    boolean isValid = numberOfYm_1() >= minimumNumberOfYm_1() && numberOfYm_1() <= maximumNumberOfYm_1();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfYm_1()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfYm_1()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfYm_1()
  {
    return 3;
  }
  /* Code from template association_AddMNToOnlyOne */
  public YM_1 addYm_1()
  {
    if (numberOfYm_1() >= maximumNumberOfYm_1())
    {
      return null;
    }
    else
    {
      return new YM_1(this);
    }
  }

  public boolean addYm_1(YM_1 aYm_1)
  {
    boolean wasAdded = false;
    if (ym_1.contains(aYm_1)) { return false; }
    if (numberOfYm_1() >= maximumNumberOfYm_1())
    {
      return wasAdded;
    }

    XM_1 existingXVar = aYm_1.getXVar();
    boolean isNewXVar = existingXVar != null && !this.equals(existingXVar);

    if (isNewXVar && existingXVar.numberOfYm_1() <= minimumNumberOfYm_1())
    {
      return wasAdded;
    }

    if (isNewXVar)
    {
      aYm_1.setXVar(this);
    }
    else
    {
      ym_1.add(aYm_1);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeYm_1(YM_1 aYm_1)
  {
    boolean wasRemoved = false;
    //Unable to remove aYm_1, as it must always have a xVar
    if (this.equals(aYm_1.getXVar()))
    {
      return wasRemoved;
    }

    //xVar already at minimum (3)
    if (numberOfYm_1() <= minimumNumberOfYm_1())
    {
      return wasRemoved;
    }
    ym_1.remove(aYm_1);
    wasRemoved = true;
    return wasRemoved;
  }

  public void delete()
  {
    while (ym_1.size() > 0)
    {
      YM_1 aYm_1 = ym_1.get(ym_1.size() - 1);
      aYm_1.delete();
      ym_1.remove(aYm_1);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
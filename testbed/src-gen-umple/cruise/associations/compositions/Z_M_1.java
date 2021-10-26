/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 11 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_M_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_M_1 Attributes
  private int num;

  //Z_M_1 Associations
  private List<YR_M_1> y_m_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_M_1(int aNum)
  {
    num = aNum;
    y_m_1 = new ArrayList<YR_M_1>();
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
  public YR_M_1 getY_m_1(int index)
  {
    YR_M_1 aY_m_1 = y_m_1.get(index);
    return aY_m_1;
  }

  public List<YR_M_1> getY_m_1()
  {
    List<YR_M_1> newY_m_1 = Collections.unmodifiableList(y_m_1);
    return newY_m_1;
  }

  public int numberOfY_m_1()
  {
    int number = y_m_1.size();
    return number;
  }

  public boolean hasY_m_1()
  {
    boolean has = y_m_1.size() > 0;
    return has;
  }

  public int indexOfY_m_1(YR_M_1 aY_m_1)
  {
    int index = y_m_1.indexOf(aY_m_1);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfY_m_1Valid()
  {
    boolean isValid = numberOfY_m_1() >= minimumNumberOfY_m_1() && numberOfY_m_1() <= maximumNumberOfY_m_1();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfY_m_1()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_m_1()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY_m_1()
  {
    return 3;
  }
  /* Code from template association_AddMNToOnlyOne */
  public YR_M_1 addY_m_1()
  {
    if (numberOfY_m_1() >= maximumNumberOfY_m_1())
    {
      return null;
    }
    else
    {
      return new YR_M_1(this);
    }
  }

  public boolean addY_m_1(YR_M_1 aY_m_1)
  {
    boolean wasAdded = false;
    if (y_m_1.contains(aY_m_1)) { return false; }
    if (numberOfY_m_1() >= maximumNumberOfY_m_1())
    {
      return wasAdded;
    }

    Z_M_1 existingZVar = aY_m_1.getZVar();
    boolean isNewZVar = existingZVar != null && !this.equals(existingZVar);

    if (isNewZVar && existingZVar.numberOfY_m_1() <= minimumNumberOfY_m_1())
    {
      return wasAdded;
    }

    if (isNewZVar)
    {
      aY_m_1.setZVar(this);
    }
    else
    {
      y_m_1.add(aY_m_1);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeY_m_1(YR_M_1 aY_m_1)
  {
    boolean wasRemoved = false;
    //Unable to remove aY_m_1, as it must always have a zVar
    if (this.equals(aY_m_1.getZVar()))
    {
      return wasRemoved;
    }

    //zVar already at minimum (3)
    if (numberOfY_m_1() <= minimumNumberOfY_m_1())
    {
      return wasRemoved;
    }
    y_m_1.remove(aY_m_1);
    wasRemoved = true;
    return wasRemoved;
  }

  public void delete()
  {
    while (y_m_1.size() > 0)
    {
      YR_M_1 aY_m_1 = y_m_1.get(y_m_1.size() - 1);
      aY_m_1.delete();
      y_m_1.remove(aY_m_1);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
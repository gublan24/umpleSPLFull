/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 36 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_m_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_m_n__1 Attributes
  private int num;

  //Z_m_n__1 Associations
  private List<YR_m_n__1> y_m_n__1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_m_n__1(int aNum)
  {
    num = aNum;
    y_m_n__1 = new ArrayList<YR_m_n__1>();
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
  public YR_m_n__1 getY_m_n__1(int index)
  {
    YR_m_n__1 aY_m_n__1 = y_m_n__1.get(index);
    return aY_m_n__1;
  }

  public List<YR_m_n__1> getY_m_n__1()
  {
    List<YR_m_n__1> newY_m_n__1 = Collections.unmodifiableList(y_m_n__1);
    return newY_m_n__1;
  }

  public int numberOfY_m_n__1()
  {
    int number = y_m_n__1.size();
    return number;
  }

  public boolean hasY_m_n__1()
  {
    boolean has = y_m_n__1.size() > 0;
    return has;
  }

  public int indexOfY_m_n__1(YR_m_n__1 aY_m_n__1)
  {
    int index = y_m_n__1.indexOf(aY_m_n__1);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfY_m_n__1Valid()
  {
    boolean isValid = numberOfY_m_n__1() >= minimumNumberOfY_m_n__1() && numberOfY_m_n__1() <= maximumNumberOfY_m_n__1();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_m_n__1()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY_m_n__1()
  {
    return 3;
  }
  /* Code from template association_AddMNToOnlyOne */
  public YR_m_n__1 addY_m_n__1()
  {
    if (numberOfY_m_n__1() >= maximumNumberOfY_m_n__1())
    {
      return null;
    }
    else
    {
      return new YR_m_n__1(this);
    }
  }

  public boolean addY_m_n__1(YR_m_n__1 aY_m_n__1)
  {
    boolean wasAdded = false;
    if (y_m_n__1.contains(aY_m_n__1)) { return false; }
    if (numberOfY_m_n__1() >= maximumNumberOfY_m_n__1())
    {
      return wasAdded;
    }

    Z_m_n__1 existingZVar = aY_m_n__1.getZVar();
    boolean isNewZVar = existingZVar != null && !this.equals(existingZVar);

    if (isNewZVar && existingZVar.numberOfY_m_n__1() <= minimumNumberOfY_m_n__1())
    {
      return wasAdded;
    }

    if (isNewZVar)
    {
      aY_m_n__1.setZVar(this);
    }
    else
    {
      y_m_n__1.add(aY_m_n__1);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeY_m_n__1(YR_m_n__1 aY_m_n__1)
  {
    boolean wasRemoved = false;
    //Unable to remove aY_m_n__1, as it must always have a zVar
    if (this.equals(aY_m_n__1.getZVar()))
    {
      return wasRemoved;
    }

    //zVar already at minimum (2)
    if (numberOfY_m_n__1() <= minimumNumberOfY_m_n__1())
    {
      return wasRemoved;
    }
    y_m_n__1.remove(aY_m_n__1);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY_m_n__1At(YR_m_n__1 aY_m_n__1, int index)
  {  
    boolean wasAdded = false;
    if(addY_m_n__1(aY_m_n__1))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_m_n__1()) { index = numberOfY_m_n__1() - 1; }
      y_m_n__1.remove(aY_m_n__1);
      y_m_n__1.add(index, aY_m_n__1);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY_m_n__1At(YR_m_n__1 aY_m_n__1, int index)
  {
    boolean wasAdded = false;
    if(y_m_n__1.contains(aY_m_n__1))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_m_n__1()) { index = numberOfY_m_n__1() - 1; }
      y_m_n__1.remove(aY_m_n__1);
      y_m_n__1.add(index, aY_m_n__1);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY_m_n__1At(aY_m_n__1, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (y_m_n__1.size() > 0)
    {
      YR_m_n__1 aY_m_n__1 = y_m_n__1.get(y_m_n__1.size() - 1);
      aY_m_n__1.delete();
      y_m_n__1.remove(aY_m_n__1);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
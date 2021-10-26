/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 59 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X0_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_n__1 Attributes
  private int num;

  //X0_n__1 Associations
  private List<Y0_n__1> y0_n__1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X0_n__1(int aNum)
  {
    num = aNum;
    y0_n__1 = new ArrayList<Y0_n__1>();
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
  public Y0_n__1 getY0_n__1(int index)
  {
    Y0_n__1 aY0_n__1 = y0_n__1.get(index);
    return aY0_n__1;
  }

  public List<Y0_n__1> getY0_n__1()
  {
    List<Y0_n__1> newY0_n__1 = Collections.unmodifiableList(y0_n__1);
    return newY0_n__1;
  }

  public int numberOfY0_n__1()
  {
    int number = y0_n__1.size();
    return number;
  }

  public boolean hasY0_n__1()
  {
    boolean has = y0_n__1.size() > 0;
    return has;
  }

  public int indexOfY0_n__1(Y0_n__1 aY0_n__1)
  {
    int index = y0_n__1.indexOf(aY0_n__1);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY0_n__1()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY0_n__1()
  {
    return 3;
  }
  /* Code from template association_AddOptionalNToOne */
  public Y0_n__1 addY0_n__1()
  {
    if (numberOfY0_n__1() >= maximumNumberOfY0_n__1())
    {
      return null;
    }
    else
    {
      return new Y0_n__1(this);
    }
  }

  public boolean addY0_n__1(Y0_n__1 aY0_n__1)
  {
    boolean wasAdded = false;
    if (y0_n__1.contains(aY0_n__1)) { return false; }
    if (numberOfY0_n__1() >= maximumNumberOfY0_n__1())
    {
      return wasAdded;
    }

    X0_n__1 existingXVar = aY0_n__1.getXVar();
    boolean isNewXVar = existingXVar != null && !this.equals(existingXVar);
    if (isNewXVar)
    {
      aY0_n__1.setXVar(this);
    }
    else
    {
      y0_n__1.add(aY0_n__1);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeY0_n__1(Y0_n__1 aY0_n__1)
  {
    boolean wasRemoved = false;
    //Unable to remove aY0_n__1, as it must always have a xVar
    if (!this.equals(aY0_n__1.getXVar()))
    {
      y0_n__1.remove(aY0_n__1);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY0_n__1At(Y0_n__1 aY0_n__1, int index)
  {  
    boolean wasAdded = false;
    if(addY0_n__1(aY0_n__1))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY0_n__1()) { index = numberOfY0_n__1() - 1; }
      y0_n__1.remove(aY0_n__1);
      y0_n__1.add(index, aY0_n__1);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY0_n__1At(Y0_n__1 aY0_n__1, int index)
  {
    boolean wasAdded = false;
    if(y0_n__1.contains(aY0_n__1))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY0_n__1()) { index = numberOfY0_n__1() - 1; }
      y0_n__1.remove(aY0_n__1);
      y0_n__1.add(index, aY0_n__1);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY0_n__1At(aY0_n__1, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (y0_n__1.size() > 0)
    {
      Y0_n__1 aY0_n__1 = y0_n__1.get(y0_n__1.size() - 1);
      aY0_n__1.delete();
      y0_n__1.remove(aY0_n__1);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
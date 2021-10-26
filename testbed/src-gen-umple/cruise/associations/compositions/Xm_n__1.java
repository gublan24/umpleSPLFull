/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 38 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Xm_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xm_n__1 Attributes
  private int num;

  //Xm_n__1 Associations
  private List<Ym_n__1> ym_n__1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xm_n__1(int aNum)
  {
    num = aNum;
    ym_n__1 = new ArrayList<Ym_n__1>();
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
  public Ym_n__1 getYm_n__1(int index)
  {
    Ym_n__1 aYm_n__1 = ym_n__1.get(index);
    return aYm_n__1;
  }

  public List<Ym_n__1> getYm_n__1()
  {
    List<Ym_n__1> newYm_n__1 = Collections.unmodifiableList(ym_n__1);
    return newYm_n__1;
  }

  public int numberOfYm_n__1()
  {
    int number = ym_n__1.size();
    return number;
  }

  public boolean hasYm_n__1()
  {
    boolean has = ym_n__1.size() > 0;
    return has;
  }

  public int indexOfYm_n__1(Ym_n__1 aYm_n__1)
  {
    int index = ym_n__1.indexOf(aYm_n__1);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfYm_n__1Valid()
  {
    boolean isValid = numberOfYm_n__1() >= minimumNumberOfYm_n__1() && numberOfYm_n__1() <= maximumNumberOfYm_n__1();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfYm_n__1()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfYm_n__1()
  {
    return 3;
  }
  /* Code from template association_AddMNToOnlyOne */
  public Ym_n__1 addYm_n__1()
  {
    if (numberOfYm_n__1() >= maximumNumberOfYm_n__1())
    {
      return null;
    }
    else
    {
      return new Ym_n__1(this);
    }
  }

  public boolean addYm_n__1(Ym_n__1 aYm_n__1)
  {
    boolean wasAdded = false;
    if (ym_n__1.contains(aYm_n__1)) { return false; }
    if (numberOfYm_n__1() >= maximumNumberOfYm_n__1())
    {
      return wasAdded;
    }

    Xm_n__1 existingXVar = aYm_n__1.getXVar();
    boolean isNewXVar = existingXVar != null && !this.equals(existingXVar);

    if (isNewXVar && existingXVar.numberOfYm_n__1() <= minimumNumberOfYm_n__1())
    {
      return wasAdded;
    }

    if (isNewXVar)
    {
      aYm_n__1.setXVar(this);
    }
    else
    {
      ym_n__1.add(aYm_n__1);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeYm_n__1(Ym_n__1 aYm_n__1)
  {
    boolean wasRemoved = false;
    //Unable to remove aYm_n__1, as it must always have a xVar
    if (this.equals(aYm_n__1.getXVar()))
    {
      return wasRemoved;
    }

    //xVar already at minimum (2)
    if (numberOfYm_n__1() <= minimumNumberOfYm_n__1())
    {
      return wasRemoved;
    }
    ym_n__1.remove(aYm_n__1);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addYm_n__1At(Ym_n__1 aYm_n__1, int index)
  {  
    boolean wasAdded = false;
    if(addYm_n__1(aYm_n__1))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYm_n__1()) { index = numberOfYm_n__1() - 1; }
      ym_n__1.remove(aYm_n__1);
      ym_n__1.add(index, aYm_n__1);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveYm_n__1At(Ym_n__1 aYm_n__1, int index)
  {
    boolean wasAdded = false;
    if(ym_n__1.contains(aYm_n__1))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYm_n__1()) { index = numberOfYm_n__1() - 1; }
      ym_n__1.remove(aYm_n__1);
      ym_n__1.add(index, aYm_n__1);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addYm_n__1At(aYm_n__1, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (ym_n__1.size() > 0)
    {
      Ym_n__1 aYm_n__1 = ym_n__1.get(ym_n__1.size() - 1);
      aYm_n__1.delete();
      ym_n__1.remove(aYm_n__1);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
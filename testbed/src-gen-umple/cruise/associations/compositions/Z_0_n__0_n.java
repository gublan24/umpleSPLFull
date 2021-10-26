/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 76 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_0_n__0_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_n__0_n Attributes
  private int num;

  //Z_0_n__0_n Associations
  private List<YR_0_n__0_n> y_0_n__0_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_0_n__0_n(int aNum)
  {
    num = aNum;
    y_0_n__0_n = new ArrayList<YR_0_n__0_n>();
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
  public YR_0_n__0_n getY_0_n__0_n(int index)
  {
    YR_0_n__0_n aY_0_n__0_n = y_0_n__0_n.get(index);
    return aY_0_n__0_n;
  }

  public List<YR_0_n__0_n> getY_0_n__0_n()
  {
    List<YR_0_n__0_n> newY_0_n__0_n = Collections.unmodifiableList(y_0_n__0_n);
    return newY_0_n__0_n;
  }

  public int numberOfY_0_n__0_n()
  {
    int number = y_0_n__0_n.size();
    return number;
  }

  public boolean hasY_0_n__0_n()
  {
    boolean has = y_0_n__0_n.size() > 0;
    return has;
  }

  public int indexOfY_0_n__0_n(YR_0_n__0_n aY_0_n__0_n)
  {
    int index = y_0_n__0_n.indexOf(aY_0_n__0_n);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_0_n__0_n()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY_0_n__0_n()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY_0_n__0_n(YR_0_n__0_n aY_0_n__0_n)
  {
    boolean wasAdded = false;
    if (y_0_n__0_n.contains(aY_0_n__0_n)) { return false; }
    if (numberOfY_0_n__0_n() >= maximumNumberOfY_0_n__0_n())
    {
      return wasAdded;
    }

    y_0_n__0_n.add(aY_0_n__0_n);
    if (aY_0_n__0_n.indexOfZVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY_0_n__0_n.addZVar(this);
      if (!wasAdded)
      {
        y_0_n__0_n.remove(aY_0_n__0_n);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeY_0_n__0_n(YR_0_n__0_n aY_0_n__0_n)
  {
    boolean wasRemoved = false;
    if (!y_0_n__0_n.contains(aY_0_n__0_n))
    {
      return wasRemoved;
    }

    int oldIndex = y_0_n__0_n.indexOf(aY_0_n__0_n);
    y_0_n__0_n.remove(oldIndex);
    if (aY_0_n__0_n.indexOfZVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY_0_n__0_n.removeZVar(this);
      if (!wasRemoved)
      {
        y_0_n__0_n.add(oldIndex,aY_0_n__0_n);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY_0_n__0_nAt(YR_0_n__0_n aY_0_n__0_n, int index)
  {  
    boolean wasAdded = false;
    if(addY_0_n__0_n(aY_0_n__0_n))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_0_n__0_n()) { index = numberOfY_0_n__0_n() - 1; }
      y_0_n__0_n.remove(aY_0_n__0_n);
      y_0_n__0_n.add(index, aY_0_n__0_n);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY_0_n__0_nAt(YR_0_n__0_n aY_0_n__0_n, int index)
  {
    boolean wasAdded = false;
    if(y_0_n__0_n.contains(aY_0_n__0_n))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_0_n__0_n()) { index = numberOfY_0_n__0_n() - 1; }
      y_0_n__0_n.remove(aY_0_n__0_n);
      y_0_n__0_n.add(index, aY_0_n__0_n);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY_0_n__0_nAt(aY_0_n__0_n, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<YR_0_n__0_n> copyOfY_0_n__0_n = new ArrayList<YR_0_n__0_n>(y_0_n__0_n);
    y_0_n__0_n.clear();
    for(YR_0_n__0_n aY_0_n__0_n : copyOfY_0_n__0_n)
    {
      aY_0_n__0_n.removeZVar(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
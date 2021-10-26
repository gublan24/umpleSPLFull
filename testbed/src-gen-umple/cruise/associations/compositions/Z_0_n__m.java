/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 61 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_0_n__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_n__m Attributes
  private int num;

  //Z_0_n__m Associations
  private List<YR_0_n__m> y_0_n__m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_0_n__m(int aNum)
  {
    num = aNum;
    y_0_n__m = new ArrayList<YR_0_n__m>();
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
  public YR_0_n__m getY_0_n__m(int index)
  {
    YR_0_n__m aY_0_n__m = y_0_n__m.get(index);
    return aY_0_n__m;
  }

  public List<YR_0_n__m> getY_0_n__m()
  {
    List<YR_0_n__m> newY_0_n__m = Collections.unmodifiableList(y_0_n__m);
    return newY_0_n__m;
  }

  public int numberOfY_0_n__m()
  {
    int number = y_0_n__m.size();
    return number;
  }

  public boolean hasY_0_n__m()
  {
    boolean has = y_0_n__m.size() > 0;
    return has;
  }

  public int indexOfY_0_n__m(YR_0_n__m aY_0_n__m)
  {
    int index = y_0_n__m.indexOf(aY_0_n__m);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_0_n__m()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY_0_n__m()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY_0_n__m(YR_0_n__m aY_0_n__m)
  {
    boolean wasAdded = false;
    if (y_0_n__m.contains(aY_0_n__m)) { return false; }
    if (numberOfY_0_n__m() >= maximumNumberOfY_0_n__m())
    {
      return wasAdded;
    }

    y_0_n__m.add(aY_0_n__m);
    if (aY_0_n__m.indexOfZVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY_0_n__m.addZVar(this);
      if (!wasAdded)
      {
        y_0_n__m.remove(aY_0_n__m);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeY_0_n__m(YR_0_n__m aY_0_n__m)
  {
    boolean wasRemoved = false;
    if (!y_0_n__m.contains(aY_0_n__m))
    {
      return wasRemoved;
    }

    int oldIndex = y_0_n__m.indexOf(aY_0_n__m);
    y_0_n__m.remove(oldIndex);
    if (aY_0_n__m.indexOfZVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY_0_n__m.removeZVar(this);
      if (!wasRemoved)
      {
        y_0_n__m.add(oldIndex,aY_0_n__m);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY_0_n__mAt(YR_0_n__m aY_0_n__m, int index)
  {  
    boolean wasAdded = false;
    if(addY_0_n__m(aY_0_n__m))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_0_n__m()) { index = numberOfY_0_n__m() - 1; }
      y_0_n__m.remove(aY_0_n__m);
      y_0_n__m.add(index, aY_0_n__m);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY_0_n__mAt(YR_0_n__m aY_0_n__m, int index)
  {
    boolean wasAdded = false;
    if(y_0_n__m.contains(aY_0_n__m))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_0_n__m()) { index = numberOfY_0_n__m() - 1; }
      y_0_n__m.remove(aY_0_n__m);
      y_0_n__m.add(index, aY_0_n__m);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY_0_n__mAt(aY_0_n__m, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<YR_0_n__m> copyOfY_0_n__m = new ArrayList<YR_0_n__m>(y_0_n__m);
    y_0_n__m.clear();
    for(YR_0_n__m aY_0_n__m : copyOfY_0_n__m)
    {
      if (aY_0_n__m.numberOfZVar() <= YR_0_n__m.minimumNumberOfZVar())
      {
        aY_0_n__m.delete();
      }
      else
      {
        aY_0_n__m.removeZVar(this);
      }
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
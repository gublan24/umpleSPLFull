/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 64 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X0_n__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_n__m Attributes
  private int num;

  //X0_n__m Associations
  private List<Y0_n__m> y0_n__m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X0_n__m(int aNum)
  {
    num = aNum;
    y0_n__m = new ArrayList<Y0_n__m>();
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
  public Y0_n__m getY0_n__m(int index)
  {
    Y0_n__m aY0_n__m = y0_n__m.get(index);
    return aY0_n__m;
  }

  public List<Y0_n__m> getY0_n__m()
  {
    List<Y0_n__m> newY0_n__m = Collections.unmodifiableList(y0_n__m);
    return newY0_n__m;
  }

  public int numberOfY0_n__m()
  {
    int number = y0_n__m.size();
    return number;
  }

  public boolean hasY0_n__m()
  {
    boolean has = y0_n__m.size() > 0;
    return has;
  }

  public int indexOfY0_n__m(Y0_n__m aY0_n__m)
  {
    int index = y0_n__m.indexOf(aY0_n__m);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY0_n__m()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY0_n__m()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY0_n__m(Y0_n__m aY0_n__m)
  {
    boolean wasAdded = false;
    if (y0_n__m.contains(aY0_n__m)) { return false; }
    if (numberOfY0_n__m() >= maximumNumberOfY0_n__m())
    {
      return wasAdded;
    }

    y0_n__m.add(aY0_n__m);
    if (aY0_n__m.indexOfXVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY0_n__m.addXVar(this);
      if (!wasAdded)
      {
        y0_n__m.remove(aY0_n__m);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeY0_n__m(Y0_n__m aY0_n__m)
  {
    boolean wasRemoved = false;
    if (!y0_n__m.contains(aY0_n__m))
    {
      return wasRemoved;
    }

    int oldIndex = y0_n__m.indexOf(aY0_n__m);
    y0_n__m.remove(oldIndex);
    if (aY0_n__m.indexOfXVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY0_n__m.removeXVar(this);
      if (!wasRemoved)
      {
        y0_n__m.add(oldIndex,aY0_n__m);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY0_n__mAt(Y0_n__m aY0_n__m, int index)
  {  
    boolean wasAdded = false;
    if(addY0_n__m(aY0_n__m))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY0_n__m()) { index = numberOfY0_n__m() - 1; }
      y0_n__m.remove(aY0_n__m);
      y0_n__m.add(index, aY0_n__m);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY0_n__mAt(Y0_n__m aY0_n__m, int index)
  {
    boolean wasAdded = false;
    if(y0_n__m.contains(aY0_n__m))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY0_n__m()) { index = numberOfY0_n__m() - 1; }
      y0_n__m.remove(aY0_n__m);
      y0_n__m.add(index, aY0_n__m);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY0_n__mAt(aY0_n__m, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (y0_n__m.size() > 0)
    {
      Y0_n__m aY0_n__m = y0_n__m.get(y0_n__m.size() - 1);
      aY0_n__m.delete();
      y0_n__m.remove(aY0_n__m);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
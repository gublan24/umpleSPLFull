/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 79 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X0_n__0_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_n__0_n Attributes
  private int num;

  //X0_n__0_n Associations
  private List<Y0_n__0_n> y0_n__0_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X0_n__0_n(int aNum)
  {
    num = aNum;
    y0_n__0_n = new ArrayList<Y0_n__0_n>();
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
  public Y0_n__0_n getY0_n__0_n(int index)
  {
    Y0_n__0_n aY0_n__0_n = y0_n__0_n.get(index);
    return aY0_n__0_n;
  }

  public List<Y0_n__0_n> getY0_n__0_n()
  {
    List<Y0_n__0_n> newY0_n__0_n = Collections.unmodifiableList(y0_n__0_n);
    return newY0_n__0_n;
  }

  public int numberOfY0_n__0_n()
  {
    int number = y0_n__0_n.size();
    return number;
  }

  public boolean hasY0_n__0_n()
  {
    boolean has = y0_n__0_n.size() > 0;
    return has;
  }

  public int indexOfY0_n__0_n(Y0_n__0_n aY0_n__0_n)
  {
    int index = y0_n__0_n.indexOf(aY0_n__0_n);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY0_n__0_n()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY0_n__0_n()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY0_n__0_n(Y0_n__0_n aY0_n__0_n)
  {
    boolean wasAdded = false;
    if (y0_n__0_n.contains(aY0_n__0_n)) { return false; }
    if (numberOfY0_n__0_n() >= maximumNumberOfY0_n__0_n())
    {
      return wasAdded;
    }

    y0_n__0_n.add(aY0_n__0_n);
    if (aY0_n__0_n.indexOfXVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY0_n__0_n.addXVar(this);
      if (!wasAdded)
      {
        y0_n__0_n.remove(aY0_n__0_n);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeY0_n__0_n(Y0_n__0_n aY0_n__0_n)
  {
    boolean wasRemoved = false;
    if (!y0_n__0_n.contains(aY0_n__0_n))
    {
      return wasRemoved;
    }

    int oldIndex = y0_n__0_n.indexOf(aY0_n__0_n);
    y0_n__0_n.remove(oldIndex);
    if (aY0_n__0_n.indexOfXVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY0_n__0_n.removeXVar(this);
      if (!wasRemoved)
      {
        y0_n__0_n.add(oldIndex,aY0_n__0_n);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY0_n__0_nAt(Y0_n__0_n aY0_n__0_n, int index)
  {  
    boolean wasAdded = false;
    if(addY0_n__0_n(aY0_n__0_n))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY0_n__0_n()) { index = numberOfY0_n__0_n() - 1; }
      y0_n__0_n.remove(aY0_n__0_n);
      y0_n__0_n.add(index, aY0_n__0_n);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY0_n__0_nAt(Y0_n__0_n aY0_n__0_n, int index)
  {
    boolean wasAdded = false;
    if(y0_n__0_n.contains(aY0_n__0_n))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY0_n__0_n()) { index = numberOfY0_n__0_n() - 1; }
      y0_n__0_n.remove(aY0_n__0_n);
      y0_n__0_n.add(index, aY0_n__0_n);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY0_n__0_nAt(aY0_n__0_n, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (y0_n__0_n.size() > 0)
    {
      Y0_n__0_n aY0_n__0_n = y0_n__0_n.get(y0_n__0_n.size() - 1);
      aY0_n__0_n.delete();
      y0_n__0_n.remove(aY0_n__0_n);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
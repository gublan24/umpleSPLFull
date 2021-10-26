/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 41 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_m_n__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_m_n__m Attributes
  private int num;

  //Z_m_n__m Associations
  private List<YR_m_n__m> y_m_n__m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_m_n__m(int aNum)
  {
    num = aNum;
    y_m_n__m = new ArrayList<YR_m_n__m>();
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
  public YR_m_n__m getY_m_n__m(int index)
  {
    YR_m_n__m aY_m_n__m = y_m_n__m.get(index);
    return aY_m_n__m;
  }

  public List<YR_m_n__m> getY_m_n__m()
  {
    List<YR_m_n__m> newY_m_n__m = Collections.unmodifiableList(y_m_n__m);
    return newY_m_n__m;
  }

  public int numberOfY_m_n__m()
  {
    int number = y_m_n__m.size();
    return number;
  }

  public boolean hasY_m_n__m()
  {
    boolean has = y_m_n__m.size() > 0;
    return has;
  }

  public int indexOfY_m_n__m(YR_m_n__m aY_m_n__m)
  {
    int index = y_m_n__m.indexOf(aY_m_n__m);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfY_m_n__mValid()
  {
    boolean isValid = numberOfY_m_n__m() >= minimumNumberOfY_m_n__m() && numberOfY_m_n__m() <= maximumNumberOfY_m_n__m();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_m_n__m()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY_m_n__m()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY_m_n__m(YR_m_n__m aY_m_n__m)
  {
    boolean wasAdded = false;
    if (y_m_n__m.contains(aY_m_n__m)) { return false; }
    if (numberOfY_m_n__m() >= maximumNumberOfY_m_n__m())
    {
      return wasAdded;
    }

    y_m_n__m.add(aY_m_n__m);
    if (aY_m_n__m.indexOfZVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY_m_n__m.addZVar(this);
      if (!wasAdded)
      {
        y_m_n__m.remove(aY_m_n__m);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeY_m_n__m(YR_m_n__m aY_m_n__m)
  {
    boolean wasRemoved = false;
    if (!y_m_n__m.contains(aY_m_n__m))
    {
      return wasRemoved;
    }

    if (numberOfY_m_n__m() <= minimumNumberOfY_m_n__m())
    {
      return wasRemoved;
    }

    int oldIndex = y_m_n__m.indexOf(aY_m_n__m);
    y_m_n__m.remove(oldIndex);
    if (aY_m_n__m.indexOfZVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY_m_n__m.removeZVar(this);
      if (!wasRemoved)
      {
        y_m_n__m.add(oldIndex,aY_m_n__m);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setY_m_n__m(YR_m_n__m... newY_m_n__m)
  {
    boolean wasSet = false;
    ArrayList<YR_m_n__m> verifiedY_m_n__m = new ArrayList<YR_m_n__m>();
    for (YR_m_n__m aY_m_n__m : newY_m_n__m)
    {
      if (verifiedY_m_n__m.contains(aY_m_n__m))
      {
        continue;
      }
      verifiedY_m_n__m.add(aY_m_n__m);
    }

    if (verifiedY_m_n__m.size() != newY_m_n__m.length || verifiedY_m_n__m.size() < minimumNumberOfY_m_n__m() || verifiedY_m_n__m.size() > maximumNumberOfY_m_n__m())
    {
      return wasSet;
    }

    ArrayList<YR_m_n__m> oldY_m_n__m = new ArrayList<YR_m_n__m>(y_m_n__m);
    y_m_n__m.clear();
    for (YR_m_n__m aNewY_m_n__m : verifiedY_m_n__m)
    {
      y_m_n__m.add(aNewY_m_n__m);
      if (oldY_m_n__m.contains(aNewY_m_n__m))
      {
        oldY_m_n__m.remove(aNewY_m_n__m);
      }
      else
      {
        aNewY_m_n__m.addZVar(this);
      }
    }

    for (YR_m_n__m anOldY_m_n__m : oldY_m_n__m)
    {
      anOldY_m_n__m.removeZVar(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY_m_n__mAt(YR_m_n__m aY_m_n__m, int index)
  {  
    boolean wasAdded = false;
    if(addY_m_n__m(aY_m_n__m))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_m_n__m()) { index = numberOfY_m_n__m() - 1; }
      y_m_n__m.remove(aY_m_n__m);
      y_m_n__m.add(index, aY_m_n__m);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY_m_n__mAt(YR_m_n__m aY_m_n__m, int index)
  {
    boolean wasAdded = false;
    if(y_m_n__m.contains(aY_m_n__m))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_m_n__m()) { index = numberOfY_m_n__m() - 1; }
      y_m_n__m.remove(aY_m_n__m);
      y_m_n__m.add(index, aY_m_n__m);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY_m_n__mAt(aY_m_n__m, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<YR_m_n__m> copyOfY_m_n__m = new ArrayList<YR_m_n__m>(y_m_n__m);
    y_m_n__m.clear();
    for(YR_m_n__m aY_m_n__m : copyOfY_m_n__m)
    {
      if (aY_m_n__m.numberOfZVar() <= YR_m_n__m.minimumNumberOfZVar())
      {
        aY_m_n__m.delete();
      }
      else
      {
        aY_m_n__m.removeZVar(this);
      }
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
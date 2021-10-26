/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 51 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_m_n__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_m_n__m_n Attributes
  private int num;

  //Z_m_n__m_n Associations
  private List<YR_m_n__m_n> y_m_n__m_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_m_n__m_n(int aNum)
  {
    num = aNum;
    y_m_n__m_n = new ArrayList<YR_m_n__m_n>();
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
  public YR_m_n__m_n getY_m_n__m_n(int index)
  {
    YR_m_n__m_n aY_m_n__m_n = y_m_n__m_n.get(index);
    return aY_m_n__m_n;
  }

  public List<YR_m_n__m_n> getY_m_n__m_n()
  {
    List<YR_m_n__m_n> newY_m_n__m_n = Collections.unmodifiableList(y_m_n__m_n);
    return newY_m_n__m_n;
  }

  public int numberOfY_m_n__m_n()
  {
    int number = y_m_n__m_n.size();
    return number;
  }

  public boolean hasY_m_n__m_n()
  {
    boolean has = y_m_n__m_n.size() > 0;
    return has;
  }

  public int indexOfY_m_n__m_n(YR_m_n__m_n aY_m_n__m_n)
  {
    int index = y_m_n__m_n.indexOf(aY_m_n__m_n);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfY_m_n__m_nValid()
  {
    boolean isValid = numberOfY_m_n__m_n() >= minimumNumberOfY_m_n__m_n() && numberOfY_m_n__m_n() <= maximumNumberOfY_m_n__m_n();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_m_n__m_n()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY_m_n__m_n()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY_m_n__m_n(YR_m_n__m_n aY_m_n__m_n)
  {
    boolean wasAdded = false;
    if (y_m_n__m_n.contains(aY_m_n__m_n)) { return false; }
    if (numberOfY_m_n__m_n() >= maximumNumberOfY_m_n__m_n())
    {
      return wasAdded;
    }

    y_m_n__m_n.add(aY_m_n__m_n);
    if (aY_m_n__m_n.indexOfZVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY_m_n__m_n.addZVar(this);
      if (!wasAdded)
      {
        y_m_n__m_n.remove(aY_m_n__m_n);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeY_m_n__m_n(YR_m_n__m_n aY_m_n__m_n)
  {
    boolean wasRemoved = false;
    if (!y_m_n__m_n.contains(aY_m_n__m_n))
    {
      return wasRemoved;
    }

    if (numberOfY_m_n__m_n() <= minimumNumberOfY_m_n__m_n())
    {
      return wasRemoved;
    }

    int oldIndex = y_m_n__m_n.indexOf(aY_m_n__m_n);
    y_m_n__m_n.remove(oldIndex);
    if (aY_m_n__m_n.indexOfZVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY_m_n__m_n.removeZVar(this);
      if (!wasRemoved)
      {
        y_m_n__m_n.add(oldIndex,aY_m_n__m_n);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setY_m_n__m_n(YR_m_n__m_n... newY_m_n__m_n)
  {
    boolean wasSet = false;
    ArrayList<YR_m_n__m_n> verifiedY_m_n__m_n = new ArrayList<YR_m_n__m_n>();
    for (YR_m_n__m_n aY_m_n__m_n : newY_m_n__m_n)
    {
      if (verifiedY_m_n__m_n.contains(aY_m_n__m_n))
      {
        continue;
      }
      verifiedY_m_n__m_n.add(aY_m_n__m_n);
    }

    if (verifiedY_m_n__m_n.size() != newY_m_n__m_n.length || verifiedY_m_n__m_n.size() < minimumNumberOfY_m_n__m_n() || verifiedY_m_n__m_n.size() > maximumNumberOfY_m_n__m_n())
    {
      return wasSet;
    }

    ArrayList<YR_m_n__m_n> oldY_m_n__m_n = new ArrayList<YR_m_n__m_n>(y_m_n__m_n);
    y_m_n__m_n.clear();
    for (YR_m_n__m_n aNewY_m_n__m_n : verifiedY_m_n__m_n)
    {
      y_m_n__m_n.add(aNewY_m_n__m_n);
      if (oldY_m_n__m_n.contains(aNewY_m_n__m_n))
      {
        oldY_m_n__m_n.remove(aNewY_m_n__m_n);
      }
      else
      {
        aNewY_m_n__m_n.addZVar(this);
      }
    }

    for (YR_m_n__m_n anOldY_m_n__m_n : oldY_m_n__m_n)
    {
      anOldY_m_n__m_n.removeZVar(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY_m_n__m_nAt(YR_m_n__m_n aY_m_n__m_n, int index)
  {  
    boolean wasAdded = false;
    if(addY_m_n__m_n(aY_m_n__m_n))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_m_n__m_n()) { index = numberOfY_m_n__m_n() - 1; }
      y_m_n__m_n.remove(aY_m_n__m_n);
      y_m_n__m_n.add(index, aY_m_n__m_n);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY_m_n__m_nAt(YR_m_n__m_n aY_m_n__m_n, int index)
  {
    boolean wasAdded = false;
    if(y_m_n__m_n.contains(aY_m_n__m_n))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_m_n__m_n()) { index = numberOfY_m_n__m_n() - 1; }
      y_m_n__m_n.remove(aY_m_n__m_n);
      y_m_n__m_n.add(index, aY_m_n__m_n);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY_m_n__m_nAt(aY_m_n__m_n, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<YR_m_n__m_n> copyOfY_m_n__m_n = new ArrayList<YR_m_n__m_n>(y_m_n__m_n);
    y_m_n__m_n.clear();
    for(YR_m_n__m_n aY_m_n__m_n : copyOfY_m_n__m_n)
    {
      if (aY_m_n__m_n.numberOfZVar() <= YR_m_n__m_n.minimumNumberOfZVar())
      {
        aY_m_n__m_n.delete();
      }
      else
      {
        aY_m_n__m_n.removeZVar(this);
      }
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
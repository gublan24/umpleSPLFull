/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 16 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_M_M
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_M_M Attributes
  private int num;

  //Z_M_M Associations
  private List<YR_M_M> y_m_m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_M_M(int aNum)
  {
    num = aNum;
    y_m_m = new ArrayList<YR_M_M>();
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
  public YR_M_M getY_m_m(int index)
  {
    YR_M_M aY_m_m = y_m_m.get(index);
    return aY_m_m;
  }

  public List<YR_M_M> getY_m_m()
  {
    List<YR_M_M> newY_m_m = Collections.unmodifiableList(y_m_m);
    return newY_m_m;
  }

  public int numberOfY_m_m()
  {
    int number = y_m_m.size();
    return number;
  }

  public boolean hasY_m_m()
  {
    boolean has = y_m_m.size() > 0;
    return has;
  }

  public int indexOfY_m_m(YR_M_M aY_m_m)
  {
    int index = y_m_m.indexOf(aY_m_m);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfY_m_mValid()
  {
    boolean isValid = numberOfY_m_m() >= minimumNumberOfY_m_m() && numberOfY_m_m() <= maximumNumberOfY_m_m();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfY_m_m()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_m_m()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY_m_m()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY_m_m(YR_M_M aY_m_m)
  {
    boolean wasAdded = false;
    if (y_m_m.contains(aY_m_m)) { return false; }
    if (numberOfY_m_m() >= maximumNumberOfY_m_m())
    {
      return wasAdded;
    }

    y_m_m.add(aY_m_m);
    if (aY_m_m.indexOfZVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY_m_m.addZVar(this);
      if (!wasAdded)
      {
        y_m_m.remove(aY_m_m);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeY_m_m(YR_M_M aY_m_m)
  {
    boolean wasRemoved = false;
    if (!y_m_m.contains(aY_m_m))
    {
      return wasRemoved;
    }

    if (numberOfY_m_m() <= minimumNumberOfY_m_m())
    {
      return wasRemoved;
    }

    int oldIndex = y_m_m.indexOf(aY_m_m);
    y_m_m.remove(oldIndex);
    if (aY_m_m.indexOfZVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY_m_m.removeZVar(this);
      if (!wasRemoved)
      {
        y_m_m.add(oldIndex,aY_m_m);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setY_m_m(YR_M_M... newY_m_m)
  {
    boolean wasSet = false;
    ArrayList<YR_M_M> verifiedY_m_m = new ArrayList<YR_M_M>();
    for (YR_M_M aY_m_m : newY_m_m)
    {
      if (verifiedY_m_m.contains(aY_m_m))
      {
        continue;
      }
      verifiedY_m_m.add(aY_m_m);
    }

    if (verifiedY_m_m.size() != newY_m_m.length || verifiedY_m_m.size() < minimumNumberOfY_m_m() || verifiedY_m_m.size() > maximumNumberOfY_m_m())
    {
      return wasSet;
    }

    ArrayList<YR_M_M> oldY_m_m = new ArrayList<YR_M_M>(y_m_m);
    y_m_m.clear();
    for (YR_M_M aNewY_m_m : verifiedY_m_m)
    {
      y_m_m.add(aNewY_m_m);
      if (oldY_m_m.contains(aNewY_m_m))
      {
        oldY_m_m.remove(aNewY_m_m);
      }
      else
      {
        aNewY_m_m.addZVar(this);
      }
    }

    for (YR_M_M anOldY_m_m : oldY_m_m)
    {
      anOldY_m_m.removeZVar(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<YR_M_M> copyOfY_m_m = new ArrayList<YR_M_M>(y_m_m);
    y_m_m.clear();
    for(YR_M_M aY_m_m : copyOfY_m_m)
    {
      if (aY_m_m.numberOfZVar() <= YR_M_M.minimumNumberOfZVar())
      {
        aY_m_m.delete();
      }
      else
      {
        aY_m_m.removeZVar(this);
      }
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
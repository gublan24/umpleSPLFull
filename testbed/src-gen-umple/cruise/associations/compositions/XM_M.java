/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 18 "../../../../src/TestHarnessCompositionsLeft.ump"
public class XM_M
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //XM_M Attributes
  private int num;

  //XM_M Associations
  private List<YM_M> ym_m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public XM_M(int aNum)
  {
    num = aNum;
    ym_m = new ArrayList<YM_M>();
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
  public YM_M getYm_m(int index)
  {
    YM_M aYm_m = ym_m.get(index);
    return aYm_m;
  }

  public List<YM_M> getYm_m()
  {
    List<YM_M> newYm_m = Collections.unmodifiableList(ym_m);
    return newYm_m;
  }

  public int numberOfYm_m()
  {
    int number = ym_m.size();
    return number;
  }

  public boolean hasYm_m()
  {
    boolean has = ym_m.size() > 0;
    return has;
  }

  public int indexOfYm_m(YM_M aYm_m)
  {
    int index = ym_m.indexOf(aYm_m);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfYm_mValid()
  {
    boolean isValid = numberOfYm_m() >= minimumNumberOfYm_m() && numberOfYm_m() <= maximumNumberOfYm_m();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfYm_m()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfYm_m()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfYm_m()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addYm_m(YM_M aYm_m)
  {
    boolean wasAdded = false;
    if (ym_m.contains(aYm_m)) { return false; }
    if (numberOfYm_m() >= maximumNumberOfYm_m())
    {
      return wasAdded;
    }

    ym_m.add(aYm_m);
    if (aYm_m.indexOfXVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aYm_m.addXVar(this);
      if (!wasAdded)
      {
        ym_m.remove(aYm_m);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeYm_m(YM_M aYm_m)
  {
    boolean wasRemoved = false;
    if (!ym_m.contains(aYm_m))
    {
      return wasRemoved;
    }

    if (numberOfYm_m() <= minimumNumberOfYm_m())
    {
      return wasRemoved;
    }

    int oldIndex = ym_m.indexOf(aYm_m);
    ym_m.remove(oldIndex);
    if (aYm_m.indexOfXVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aYm_m.removeXVar(this);
      if (!wasRemoved)
      {
        ym_m.add(oldIndex,aYm_m);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setYm_m(YM_M... newYm_m)
  {
    boolean wasSet = false;
    ArrayList<YM_M> verifiedYm_m = new ArrayList<YM_M>();
    for (YM_M aYm_m : newYm_m)
    {
      if (verifiedYm_m.contains(aYm_m))
      {
        continue;
      }
      verifiedYm_m.add(aYm_m);
    }

    if (verifiedYm_m.size() != newYm_m.length || verifiedYm_m.size() < minimumNumberOfYm_m() || verifiedYm_m.size() > maximumNumberOfYm_m())
    {
      return wasSet;
    }

    ArrayList<YM_M> oldYm_m = new ArrayList<YM_M>(ym_m);
    ym_m.clear();
    for (YM_M aNewYm_m : verifiedYm_m)
    {
      ym_m.add(aNewYm_m);
      if (oldYm_m.contains(aNewYm_m))
      {
        oldYm_m.remove(aNewYm_m);
      }
      else
      {
        aNewYm_m.addXVar(this);
      }
    }

    for (YM_M anOldYm_m : oldYm_m)
    {
      anOldYm_m.removeXVar(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while (ym_m.size() > 0)
    {
      YM_M aYm_m = ym_m.get(ym_m.size() - 1);
      aYm_m.delete();
      ym_m.remove(aYm_m);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}
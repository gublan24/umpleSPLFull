/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [28]
 */
// line 304 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Er
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Er Associations
  private List<Rt> rt;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Er()
  {
    rt = new ArrayList<Rt>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Rt getRt(int index)
  {
    Rt aRt = rt.get(index);
    return aRt;
  }

  public List<Rt> getRt()
  {
    List<Rt> newRt = Collections.unmodifiableList(rt);
    return newRt;
  }

  public int numberOfRt()
  {
    int number = rt.size();
    return number;
  }

  public boolean hasRt()
  {
    boolean has = rt.size() > 0;
    return has;
  }

  public int indexOfRt(Rt aRt)
  {
    int index = rt.indexOf(aRt);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_rt()
  {
    rt.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRt()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addRt(Rt aRt)
  {
    boolean wasAdded = false;
    if (rt.contains(aRt)) { return false; }
    rt.add(aRt);
    if (aRt.indexOfEr(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aRt.addEr(this);
      if (!wasAdded)
      {
        rt.remove(aRt);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeRt(Rt aRt)
  {
    boolean wasRemoved = false;
    if (!rt.contains(aRt))
    {
      return wasRemoved;
    }

    int oldIndex = rt.indexOf(aRt);
    rt.remove(oldIndex);
    if (aRt.indexOfEr(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aRt.removeEr(this);
      if (!wasRemoved)
      {
        rt.add(oldIndex,aRt);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRtAt(Rt aRt, int index)
  {  
    boolean wasAdded = false;
    if(addRt(aRt))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRt()) { index = numberOfRt() - 1; }
      rt.remove(aRt);
      rt.add(index, aRt);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRtAt(Rt aRt, int index)
  {
    boolean wasAdded = false;
    if(rt.contains(aRt))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRt()) { index = numberOfRt() - 1; }
      rt.remove(aRt);
      rt.add(index, aRt);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRtAt(aRt, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Rt> copyOfRt = new ArrayList<Rt>(rt);
    rt.clear();
    for(Rt aRt : copyOfRt)
    {
      aRt.removeEr(this);
    }
  }

}
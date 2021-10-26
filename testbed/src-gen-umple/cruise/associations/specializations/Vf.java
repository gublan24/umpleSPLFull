/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 552 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Vf
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vf Associations
  private List<Ev> ev;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vf()
  {
    ev = new ArrayList<Ev>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ev getEv(int index)
  {
    Ev aEv = ev.get(index);
    return aEv;
  }

  public List<Ev> getEv()
  {
    List<Ev> newEv = Collections.unmodifiableList(ev);
    return newEv;
  }

  public int numberOfEv()
  {
    int number = ev.size();
    return number;
  }

  public boolean hasEv()
  {
    boolean has = ev.size() > 0;
    return has;
  }

  public int indexOfEv(Ev aEv)
  {
    int index = ev.indexOf(aEv);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_ev()
  {
    ev.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEv()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addEv(Ev aEv)
  {
    boolean wasAdded = false;
    if (ev.contains(aEv)) { return false; }
    ev.add(aEv);
    if (aEv.indexOfVf(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aEv.addVf(this);
      if (!wasAdded)
      {
        ev.remove(aEv);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeEv(Ev aEv)
  {
    boolean wasRemoved = false;
    if (!ev.contains(aEv))
    {
      return wasRemoved;
    }

    int oldIndex = ev.indexOf(aEv);
    ev.remove(oldIndex);
    if (aEv.indexOfVf(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aEv.removeVf(this);
      if (!wasRemoved)
      {
        ev.add(oldIndex,aEv);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEvAt(Ev aEv, int index)
  {  
    boolean wasAdded = false;
    if(addEv(aEv))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEv()) { index = numberOfEv() - 1; }
      ev.remove(aEv);
      ev.add(index, aEv);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEvAt(Ev aEv, int index)
  {
    boolean wasAdded = false;
    if(ev.contains(aEv))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEv()) { index = numberOfEv() - 1; }
      ev.remove(aEv);
      ev.add(index, aEv);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEvAt(aEv, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Ev> copyOfEv = new ArrayList<Ev>(ev);
    ev.clear();
    for(Ev aEv : copyOfEv)
    {
      aEv.removeVf(this);
    }
  }

}
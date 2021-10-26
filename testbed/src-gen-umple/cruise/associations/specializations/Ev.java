/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [57]
 */
// line 551 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ev
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ev Associations
  private List<Vf> vf;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ev()
  {
    vf = new ArrayList<Vf>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Vf getVf(int index)
  {
    Vf aVf = vf.get(index);
    return aVf;
  }

  public List<Vf> getVf()
  {
    List<Vf> newVf = Collections.unmodifiableList(vf);
    return newVf;
  }

  public int numberOfVf()
  {
    int number = vf.size();
    return number;
  }

  public boolean hasVf()
  {
    boolean has = vf.size() > 0;
    return has;
  }

  public int indexOfVf(Vf aVf)
  {
    int index = vf.indexOf(aVf);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_vf()
  {
    vf.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVf()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addVf(Vf aVf)
  {
    boolean wasAdded = false;
    if (vf.contains(aVf)) { return false; }
    vf.add(aVf);
    if (aVf.indexOfEv(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aVf.addEv(this);
      if (!wasAdded)
      {
        vf.remove(aVf);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeVf(Vf aVf)
  {
    boolean wasRemoved = false;
    if (!vf.contains(aVf))
    {
      return wasRemoved;
    }

    int oldIndex = vf.indexOf(aVf);
    vf.remove(oldIndex);
    if (aVf.indexOfEv(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aVf.removeEv(this);
      if (!wasRemoved)
      {
        vf.add(oldIndex,aVf);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addVfAt(Vf aVf, int index)
  {  
    boolean wasAdded = false;
    if(addVf(aVf))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVf()) { index = numberOfVf() - 1; }
      vf.remove(aVf);
      vf.add(index, aVf);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveVfAt(Vf aVf, int index)
  {
    boolean wasAdded = false;
    if(vf.contains(aVf))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVf()) { index = numberOfVf() - 1; }
      vf.remove(aVf);
      vf.add(index, aVf);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addVfAt(aVf, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Vf> copyOfVf = new ArrayList<Vf>(vf);
    vf.clear();
    for(Vf aVf : copyOfVf)
    {
      aVf.removeEv(this);
    }
  }

}
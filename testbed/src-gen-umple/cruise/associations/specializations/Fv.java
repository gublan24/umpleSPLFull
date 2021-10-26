/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [45]
 */
// line 448 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Fv
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Fv Associations
  private List<Vt> vt;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Fv()
  {
    vt = new ArrayList<Vt>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Vt getVt(int index)
  {
    Vt aVt = vt.get(index);
    return aVt;
  }

  public List<Vt> getVt()
  {
    List<Vt> newVt = Collections.unmodifiableList(vt);
    return newVt;
  }

  public int numberOfVt()
  {
    int number = vt.size();
    return number;
  }

  public boolean hasVt()
  {
    boolean has = vt.size() > 0;
    return has;
  }

  public int indexOfVt(Vt aVt)
  {
    int index = vt.indexOf(aVt);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_vt()
  {
    vt.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVt()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addVt(Vt aVt)
  {
    boolean wasAdded = false;
    if (vt.contains(aVt)) { return false; }
    vt.add(aVt);
    if (aVt.indexOfFv(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aVt.addFv(this);
      if (!wasAdded)
      {
        vt.remove(aVt);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeVt(Vt aVt)
  {
    boolean wasRemoved = false;
    if (!vt.contains(aVt))
    {
      return wasRemoved;
    }

    int oldIndex = vt.indexOf(aVt);
    vt.remove(oldIndex);
    if (aVt.indexOfFv(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aVt.removeFv(this);
      if (!wasRemoved)
      {
        vt.add(oldIndex,aVt);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addVtAt(Vt aVt, int index)
  {  
    boolean wasAdded = false;
    if(addVt(aVt))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVt()) { index = numberOfVt() - 1; }
      vt.remove(aVt);
      vt.add(index, aVt);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveVtAt(Vt aVt, int index)
  {
    boolean wasAdded = false;
    if(vt.contains(aVt))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVt()) { index = numberOfVt() - 1; }
      vt.remove(aVt);
      vt.add(index, aVt);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addVtAt(aVt, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Vt> copyOfVt = new ArrayList<Vt>(vt);
    vt.clear();
    for(Vt aVt : copyOfVt)
    {
      aVt.removeFv(this);
    }
  }

}
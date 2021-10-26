/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 129 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Supap
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Supap Associations
  private List<Suppa> suppa;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Supap()
  {
    suppa = new ArrayList<Suppa>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Suppa getSuppa(int index)
  {
    Suppa aSuppa = suppa.get(index);
    return aSuppa;
  }

  public List<Suppa> getSuppa()
  {
    List<Suppa> newSuppa = Collections.unmodifiableList(suppa);
    return newSuppa;
  }

  public int numberOfSuppa()
  {
    int number = suppa.size();
    return number;
  }

  public boolean hasSuppa()
  {
    boolean has = suppa.size() > 0;
    return has;
  }

  public int indexOfSuppa(Suppa aSuppa)
  {
    int index = suppa.indexOf(aSuppa);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_suppa()
  {
    suppa.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSuppa()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSuppa(Suppa aSuppa)
  {
    boolean wasAdded = false;
    if (suppa.contains(aSuppa)) { return false; }
    suppa.add(aSuppa);
    if (aSuppa.indexOfSupap(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSuppa.addSupap(this);
      if (!wasAdded)
      {
        suppa.remove(aSuppa);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSuppa(Suppa aSuppa)
  {
    boolean wasRemoved = false;
    if (!suppa.contains(aSuppa))
    {
      return wasRemoved;
    }

    int oldIndex = suppa.indexOf(aSuppa);
    suppa.remove(oldIndex);
    if (aSuppa.indexOfSupap(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSuppa.removeSupap(this);
      if (!wasRemoved)
      {
        suppa.add(oldIndex,aSuppa);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSuppaAt(Suppa aSuppa, int index)
  {  
    boolean wasAdded = false;
    if(addSuppa(aSuppa))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSuppa()) { index = numberOfSuppa() - 1; }
      suppa.remove(aSuppa);
      suppa.add(index, aSuppa);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSuppaAt(Suppa aSuppa, int index)
  {
    boolean wasAdded = false;
    if(suppa.contains(aSuppa))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSuppa()) { index = numberOfSuppa() - 1; }
      suppa.remove(aSuppa);
      suppa.add(index, aSuppa);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSuppaAt(aSuppa, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Suppa> copyOfSuppa = new ArrayList<Suppa>(suppa);
    suppa.clear();
    for(Suppa aSuppa : copyOfSuppa)
    {
      aSuppa.removeSupap(this);
    }
  }

}
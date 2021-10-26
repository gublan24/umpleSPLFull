/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * 
 * Case: Many down to MN
 * [10]
 */
// line 128 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Suppa
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Suppa Associations
  private List<Supap> supap;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Suppa()
  {
    supap = new ArrayList<Supap>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Supap getSupap(int index)
  {
    Supap aSupap = supap.get(index);
    return aSupap;
  }

  public List<Supap> getSupap()
  {
    List<Supap> newSupap = Collections.unmodifiableList(supap);
    return newSupap;
  }

  public int numberOfSupap()
  {
    int number = supap.size();
    return number;
  }

  public boolean hasSupap()
  {
    boolean has = supap.size() > 0;
    return has;
  }

  public int indexOfSupap(Supap aSupap)
  {
    int index = supap.indexOf(aSupap);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_supap()
  {
    supap.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSupap()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSupap(Supap aSupap)
  {
    boolean wasAdded = false;
    if (supap.contains(aSupap)) { return false; }
    supap.add(aSupap);
    if (aSupap.indexOfSuppa(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSupap.addSuppa(this);
      if (!wasAdded)
      {
        supap.remove(aSupap);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSupap(Supap aSupap)
  {
    boolean wasRemoved = false;
    if (!supap.contains(aSupap))
    {
      return wasRemoved;
    }

    int oldIndex = supap.indexOf(aSupap);
    supap.remove(oldIndex);
    if (aSupap.indexOfSuppa(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSupap.removeSuppa(this);
      if (!wasRemoved)
      {
        supap.add(oldIndex,aSupap);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSupapAt(Supap aSupap, int index)
  {  
    boolean wasAdded = false;
    if(addSupap(aSupap))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSupap()) { index = numberOfSupap() - 1; }
      supap.remove(aSupap);
      supap.add(index, aSupap);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSupapAt(Supap aSupap, int index)
  {
    boolean wasAdded = false;
    if(supap.contains(aSupap))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSupap()) { index = numberOfSupap() - 1; }
      supap.remove(aSupap);
      supap.add(index, aSupap);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSupapAt(aSupap, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Supap> copyOfSupap = new ArrayList<Supap>(supap);
    supap.clear();
    for(Supap aSupap : copyOfSupap)
    {
      aSupap.removeSuppa(this);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * Both ends don't start at 0..1                                  [9]
 */
// line 116 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Tree
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Tree Associations
  private List<Owl> hoots;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Tree()
  {
    hoots = new ArrayList<Owl>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Owl getHoot(int index)
  {
    Owl aHoot = hoots.get(index);
    return aHoot;
  }

  public List<Owl> getHoots()
  {
    List<Owl> newHoots = Collections.unmodifiableList(hoots);
    return newHoots;
  }

  public int numberOfHoots()
  {
    int number = hoots.size();
    return number;
  }

  public boolean hasHoots()
  {
    boolean has = hoots.size() > 0;
    return has;
  }

  public int indexOfHoot(Owl aHoot)
  {
    int index = hoots.indexOf(aHoot);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_hoots()
  {
    hoots.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfHoots()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfHoots()
  {
    return 5;
  }
  /* Code from template association_AddOptionalNToOptionalOne */
  public boolean addHoot(Owl aHoot)
  {
    boolean wasAdded = false;
    if (hoots.contains(aHoot)) { return false; }
    if (numberOfHoots() >= maximumNumberOfHoots())
    {
      return wasAdded;
    }

    Tree existingTrees = aHoot.getTrees();
    if (existingTrees == null)
    {
      aHoot.setTrees(this);
    }
    else if (!this.equals(existingTrees))
    {
      existingTrees.removeHoot(aHoot);
      addHoot(aHoot);
    }
    else
    {
      hoots.add(aHoot);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeHoot(Owl aHoot)
  {
    boolean wasRemoved = false;
    if (hoots.contains(aHoot))
    {
      hoots.remove(aHoot);
      aHoot.setTrees(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addHootAt(Owl aHoot, int index)
  {  
    boolean wasAdded = false;
    if(addHoot(aHoot))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHoots()) { index = numberOfHoots() - 1; }
      hoots.remove(aHoot);
      hoots.add(index, aHoot);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveHootAt(Owl aHoot, int index)
  {
    boolean wasAdded = false;
    if(hoots.contains(aHoot))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHoots()) { index = numberOfHoots() - 1; }
      hoots.remove(aHoot);
      hoots.add(index, aHoot);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addHootAt(aHoot, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !hoots.isEmpty() )
    {
      hoots.get(0).setTrees(null);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * Optional down to Optional and Optional down to Mandatory       [17]
 */
// line 199 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Uu
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Uu Associations
  private List<Ii> i;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Uu()
  {
    i = new ArrayList<Ii>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ii getI(int index)
  {
    Ii aI = i.get(index);
    return aI;
  }

  public List<Ii> getI()
  {
    List<Ii> newI = Collections.unmodifiableList(i);
    return newI;
  }

  public int numberOfI()
  {
    int number = i.size();
    return number;
  }

  public boolean hasI()
  {
    boolean has = i.size() > 0;
    return has;
  }

  public int indexOfI(Ii aI)
  {
    int index = i.indexOf(aI);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_i()
  {
    i.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfI()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfI()
  {
    return 4;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addI(Ii aI)
  {
    boolean wasAdded = false;
    if (i.contains(aI)) { return false; }
    if (numberOfI() >= maximumNumberOfI())
    {
      return wasAdded;
    }

    i.add(aI);
    if (aI.indexOfU(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aI.addU(this);
      if (!wasAdded)
      {
        i.remove(aI);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeI(Ii aI)
  {
    boolean wasRemoved = false;
    if (!i.contains(aI))
    {
      return wasRemoved;
    }

    int oldIndex = i.indexOf(aI);
    i.remove(oldIndex);
    if (aI.indexOfU(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aI.removeU(this);
      if (!wasRemoved)
      {
        i.add(oldIndex,aI);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addIAt(Ii aI, int index)
  {  
    boolean wasAdded = false;
    if(addI(aI))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfI()) { index = numberOfI() - 1; }
      i.remove(aI);
      i.add(index, aI);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveIAt(Ii aI, int index)
  {
    boolean wasAdded = false;
    if(i.contains(aI))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfI()) { index = numberOfI() - 1; }
      i.remove(aI);
      i.add(index, aI);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addIAt(aI, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Ii> copyOfI = new ArrayList<Ii>(i);
    i.clear();
    for(Ii aI : copyOfI)
    {
      aI.removeU(this);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [55]
 */
// line 533 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Sw
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Sw Associations
  private List<Wc> wc;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Sw()
  {
    wc = new ArrayList<Wc>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Wc getWc(int index)
  {
    Wc aWc = wc.get(index);
    return aWc;
  }

  public List<Wc> getWc()
  {
    List<Wc> newWc = Collections.unmodifiableList(wc);
    return newWc;
  }

  public int numberOfWc()
  {
    int number = wc.size();
    return number;
  }

  public boolean hasWc()
  {
    boolean has = wc.size() > 0;
    return has;
  }

  public int indexOfWc(Wc aWc)
  {
    int index = wc.indexOf(aWc);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_wc()
  {
    wc.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWc()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addWc(Wc aWc)
  {
    boolean wasAdded = false;
    if (wc.contains(aWc)) { return false; }
    wc.add(aWc);
    if (aWc.indexOfSw(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aWc.addSw(this);
      if (!wasAdded)
      {
        wc.remove(aWc);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeWc(Wc aWc)
  {
    boolean wasRemoved = false;
    if (!wc.contains(aWc))
    {
      return wasRemoved;
    }

    int oldIndex = wc.indexOf(aWc);
    wc.remove(oldIndex);
    if (aWc.indexOfSw(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aWc.removeSw(this);
      if (!wasRemoved)
      {
        wc.add(oldIndex,aWc);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWcAt(Wc aWc, int index)
  {  
    boolean wasAdded = false;
    if(addWc(aWc))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWc()) { index = numberOfWc() - 1; }
      wc.remove(aWc);
      wc.add(index, aWc);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWcAt(Wc aWc, int index)
  {
    boolean wasAdded = false;
    if(wc.contains(aWc))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWc()) { index = numberOfWc() - 1; }
      wc.remove(aWc);
      wc.add(index, aWc);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWcAt(aWc, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Wc> copyOfWc = new ArrayList<Wc>(wc);
    wc.clear();
    for(Wc aWc : copyOfWc)
    {
      aWc.removeSw(this);
    }
  }

}
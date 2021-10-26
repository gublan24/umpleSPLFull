/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [36]
 */
// line 374 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Lz
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Lz Associations
  private List<Zx> zx;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Lz()
  {
    zx = new ArrayList<Zx>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Zx getZx(int index)
  {
    Zx aZx = zx.get(index);
    return aZx;
  }

  public List<Zx> getZx()
  {
    List<Zx> newZx = Collections.unmodifiableList(zx);
    return newZx;
  }

  public int numberOfZx()
  {
    int number = zx.size();
    return number;
  }

  public boolean hasZx()
  {
    boolean has = zx.size() > 0;
    return has;
  }

  public int indexOfZx(Zx aZx)
  {
    int index = zx.indexOf(aZx);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_zx()
  {
    zx.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfZx()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addZx(Zx aZx)
  {
    boolean wasAdded = false;
    if (zx.contains(aZx)) { return false; }
    zx.add(aZx);
    if (aZx.indexOfLz(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aZx.addLz(this);
      if (!wasAdded)
      {
        zx.remove(aZx);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeZx(Zx aZx)
  {
    boolean wasRemoved = false;
    if (!zx.contains(aZx))
    {
      return wasRemoved;
    }

    int oldIndex = zx.indexOf(aZx);
    zx.remove(oldIndex);
    if (aZx.indexOfLz(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aZx.removeLz(this);
      if (!wasRemoved)
      {
        zx.add(oldIndex,aZx);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addZxAt(Zx aZx, int index)
  {  
    boolean wasAdded = false;
    if(addZx(aZx))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfZx()) { index = numberOfZx() - 1; }
      zx.remove(aZx);
      zx.add(index, aZx);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveZxAt(Zx aZx, int index)
  {
    boolean wasAdded = false;
    if(zx.contains(aZx))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfZx()) { index = numberOfZx() - 1; }
      zx.remove(aZx);
      zx.add(index, aZx);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addZxAt(aZx, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Zx> copyOfZx = new ArrayList<Zx>(zx);
    zx.clear();
    for(Zx aZx : copyOfZx)
    {
      aZx.removeLz(this);
    }
  }

}
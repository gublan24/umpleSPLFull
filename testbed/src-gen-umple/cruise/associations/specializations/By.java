/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [47]
 */
// line 465 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class By
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //By Associations
  private List<Gb> gb;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public By()
  {
    gb = new ArrayList<Gb>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Gb getGb(int index)
  {
    Gb aGb = gb.get(index);
    return aGb;
  }

  public List<Gb> getGb()
  {
    List<Gb> newGb = Collections.unmodifiableList(gb);
    return newGb;
  }

  public int numberOfGb()
  {
    int number = gb.size();
    return number;
  }

  public boolean hasGb()
  {
    boolean has = gb.size() > 0;
    return has;
  }

  public int indexOfGb(Gb aGb)
  {
    int index = gb.indexOf(aGb);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_gb()
  {
    gb.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGb()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addGb(Gb aGb)
  {
    boolean wasAdded = false;
    if (gb.contains(aGb)) { return false; }
    gb.add(aGb);
    if (aGb.indexOfBy(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aGb.addBy(this);
      if (!wasAdded)
      {
        gb.remove(aGb);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeGb(Gb aGb)
  {
    boolean wasRemoved = false;
    if (!gb.contains(aGb))
    {
      return wasRemoved;
    }

    int oldIndex = gb.indexOf(aGb);
    gb.remove(oldIndex);
    if (aGb.indexOfBy(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aGb.removeBy(this);
      if (!wasRemoved)
      {
        gb.add(oldIndex,aGb);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGbAt(Gb aGb, int index)
  {  
    boolean wasAdded = false;
    if(addGb(aGb))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGb()) { index = numberOfGb() - 1; }
      gb.remove(aGb);
      gb.add(index, aGb);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGbAt(Gb aGb, int index)
  {
    boolean wasAdded = false;
    if(gb.contains(aGb))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGb()) { index = numberOfGb() - 1; }
      gb.remove(aGb);
      gb.add(index, aGb);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGbAt(aGb, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Gb> copyOfGb = new ArrayList<Gb>(gb);
    gb.clear();
    for(Gb aGb : copyOfGb)
    {
      aGb.removeBy(this);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [46]
 */
// line 457 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Tg
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Tg Associations
  private List<Gb> gb;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Tg(Gb... allGb)
  {
    gb = new ArrayList<Gb>();
    boolean didAddGb = setGb(allGb);
    if (!didAddGb)
    {
      throw new RuntimeException("Unable to create Tg, must have 5 to 12 gb. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfGbValid()
  {
    boolean isValid = numberOfGb() >= minimumNumberOfGb() && numberOfGb() <= maximumNumberOfGb();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGb()
  {
    return 5;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfGb()
  {
    return 12;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addGb(Gb aGb)
  {
    boolean wasAdded = false;
    if (gb.contains(aGb)) { return false; }
    if (numberOfGb() >= maximumNumberOfGb())
    {
      return wasAdded;
    }

    gb.add(aGb);
    if (aGb.indexOfTg(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aGb.addTg(this);
      if (!wasAdded)
      {
        gb.remove(aGb);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeGb(Gb aGb)
  {
    boolean wasRemoved = false;
    if (!gb.contains(aGb))
    {
      return wasRemoved;
    }

    if (numberOfGb() <= minimumNumberOfGb())
    {
      return wasRemoved;
    }

    int oldIndex = gb.indexOf(aGb);
    gb.remove(oldIndex);
    if (aGb.indexOfTg(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aGb.removeTg(this);
      if (!wasRemoved)
      {
        gb.add(oldIndex,aGb);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setGb(Gb... newGb)
  {
    boolean wasSet = false;
    ArrayList<Gb> verifiedGb = new ArrayList<Gb>();
    for (Gb aGb : newGb)
    {
      if (verifiedGb.contains(aGb))
      {
        continue;
      }
      verifiedGb.add(aGb);
    }

    if (verifiedGb.size() != newGb.length || verifiedGb.size() < minimumNumberOfGb() || verifiedGb.size() > maximumNumberOfGb())
    {
      return wasSet;
    }

    ArrayList<Gb> oldGb = new ArrayList<Gb>(gb);
    gb.clear();
    for (Gb aNewGb : verifiedGb)
    {
      gb.add(aNewGb);
      if (oldGb.contains(aNewGb))
      {
        oldGb.remove(aNewGb);
      }
      else
      {
        aNewGb.addTg(this);
      }
    }

    for (Gb anOldGb : oldGb)
    {
      anOldGb.removeTg(this);
    }
    wasSet = true;
    return wasSet;
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
      aGb.removeTg(this);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [21]
 */
// line 239 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Gg
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Gg Associations
  private List<Hh> h;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Gg()
  {
    h = new ArrayList<Hh>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Hh getH(int index)
  {
    Hh aH = h.get(index);
    return aH;
  }

  public List<Hh> getH()
  {
    List<Hh> newH = Collections.unmodifiableList(h);
    return newH;
  }

  public int numberOfH()
  {
    int number = h.size();
    return number;
  }

  public boolean hasH()
  {
    boolean has = h.size() > 0;
    return has;
  }

  public int indexOfH(Hh aH)
  {
    int index = h.indexOf(aH);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_h()
  {
    h.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfH()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfH()
  {
    return 5;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addH(Hh aH)
  {
    boolean wasAdded = false;
    if (h.contains(aH)) { return false; }
    if (numberOfH() >= maximumNumberOfH())
    {
      return wasAdded;
    }

    h.add(aH);
    if (aH.indexOfG(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aH.addG(this);
      if (!wasAdded)
      {
        h.remove(aH);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeH(Hh aH)
  {
    boolean wasRemoved = false;
    if (!h.contains(aH))
    {
      return wasRemoved;
    }

    int oldIndex = h.indexOf(aH);
    h.remove(oldIndex);
    if (aH.indexOfG(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aH.removeG(this);
      if (!wasRemoved)
      {
        h.add(oldIndex,aH);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetOptionalNToMany */
  public boolean setH(Hh... newH)
  {
    boolean wasSet = false;
    ArrayList<Hh> verifiedH = new ArrayList<Hh>();
    for (Hh aH : newH)
    {
      if (verifiedH.contains(aH))
      {
        continue;
      }
      verifiedH.add(aH);
    }

    if (verifiedH.size() != newH.length || verifiedH.size() > maximumNumberOfH())
    {
      return wasSet;
    }

    ArrayList<Hh> oldH = new ArrayList<Hh>(h);
    h.clear();
    for (Hh aNewH : verifiedH)
    {
      h.add(aNewH);
      if (oldH.contains(aNewH))
      {
        oldH.remove(aNewH);
      }
      else
      {
        aNewH.addG(this);
      }
    }

    for (Hh anOldH : oldH)
    {
      anOldH.removeG(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addHAt(Hh aH, int index)
  {  
    boolean wasAdded = false;
    if(addH(aH))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfH()) { index = numberOfH() - 1; }
      h.remove(aH);
      h.add(index, aH);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveHAt(Hh aH, int index)
  {
    boolean wasAdded = false;
    if(h.contains(aH))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfH()) { index = numberOfH() - 1; }
      h.remove(aH);
      h.add(index, aH);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addHAt(aH, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Hh> copyOfH = new ArrayList<Hh>(h);
    h.clear();
    for(Hh aH : copyOfH)
    {
      aH.removeG(this);
    }
  }

}
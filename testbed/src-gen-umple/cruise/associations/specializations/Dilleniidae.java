/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 73 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Dilleniidae
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Dilleniidae Associations
  private List<Alteration> alts;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Dilleniidae()
  {
    alts = new ArrayList<Alteration>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Alteration getAlt(int index)
  {
    Alteration aAlt = alts.get(index);
    return aAlt;
  }

  public List<Alteration> getAlts()
  {
    List<Alteration> newAlts = Collections.unmodifiableList(alts);
    return newAlts;
  }

  public int numberOfAlts()
  {
    int number = alts.size();
    return number;
  }

  public boolean hasAlts()
  {
    boolean has = alts.size() > 0;
    return has;
  }

  public int indexOfAlt(Alteration aAlt)
  {
    int index = alts.indexOf(aAlt);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_alts()
  {
    alts.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAlts()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addAlt(Alteration aAlt)
  {
    boolean wasAdded = false;
    if (alts.contains(aAlt)) { return false; }
    alts.add(aAlt);
    if (aAlt.indexOfDill(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAlt.addDill(this);
      if (!wasAdded)
      {
        alts.remove(aAlt);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeAlt(Alteration aAlt)
  {
    boolean wasRemoved = false;
    if (!alts.contains(aAlt))
    {
      return wasRemoved;
    }

    int oldIndex = alts.indexOf(aAlt);
    alts.remove(oldIndex);
    if (aAlt.indexOfDill(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAlt.removeDill(this);
      if (!wasRemoved)
      {
        alts.add(oldIndex,aAlt);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAltAt(Alteration aAlt, int index)
  {  
    boolean wasAdded = false;
    if(addAlt(aAlt))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAlts()) { index = numberOfAlts() - 1; }
      alts.remove(aAlt);
      alts.add(index, aAlt);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAltAt(Alteration aAlt, int index)
  {
    boolean wasAdded = false;
    if(alts.contains(aAlt))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAlts()) { index = numberOfAlts() - 1; }
      alts.remove(aAlt);
      alts.add(index, aAlt);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAltAt(aAlt, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Alteration> copyOfAlts = new ArrayList<Alteration>(alts);
    alts.clear();
    for(Alteration aAlt : copyOfAlts)
    {
      aAlt.removeDill(this);
    }
  }

}
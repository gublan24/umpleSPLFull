/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * failing atm
 * [33]
 */
// line 350 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Df
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Df Associations
  private List<Fg> fg;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Df()
  {
    fg = new ArrayList<Fg>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Fg getFg(int index)
  {
    Fg aFg = fg.get(index);
    return aFg;
  }

  public List<Fg> getFg()
  {
    List<Fg> newFg = Collections.unmodifiableList(fg);
    return newFg;
  }

  public int numberOfFg()
  {
    int number = fg.size();
    return number;
  }

  public boolean hasFg()
  {
    boolean has = fg.size() > 0;
    return has;
  }

  public int indexOfFg(Fg aFg)
  {
    int index = fg.indexOf(aFg);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_fg()
  {
    fg.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFg()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addFg(Fg aFg)
  {
    boolean wasAdded = false;
    if (fg.contains(aFg)) { return false; }
    fg.add(aFg);
    if (aFg.indexOfDf(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aFg.addDf(this);
      if (!wasAdded)
      {
        fg.remove(aFg);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeFg(Fg aFg)
  {
    boolean wasRemoved = false;
    if (!fg.contains(aFg))
    {
      return wasRemoved;
    }

    int oldIndex = fg.indexOf(aFg);
    fg.remove(oldIndex);
    if (aFg.indexOfDf(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aFg.removeDf(this);
      if (!wasRemoved)
      {
        fg.add(oldIndex,aFg);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFgAt(Fg aFg, int index)
  {  
    boolean wasAdded = false;
    if(addFg(aFg))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFg()) { index = numberOfFg() - 1; }
      fg.remove(aFg);
      fg.add(index, aFg);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFgAt(Fg aFg, int index)
  {
    boolean wasAdded = false;
    if(fg.contains(aFg))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFg()) { index = numberOfFg() - 1; }
      fg.remove(aFg);
      fg.add(index, aFg);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFgAt(aFg, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Fg> copyOfFg = new ArrayList<Fg>(fg);
    fg.clear();
    for(Fg aFg : copyOfFg)
    {
      aFg.removeDf(this);
    }
  }

}
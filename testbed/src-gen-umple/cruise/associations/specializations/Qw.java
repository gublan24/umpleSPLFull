/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [27]
 */
// line 295 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Qw
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Qw Associations
  private List<We> we;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Qw()
  {
    we = new ArrayList<We>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public We getWe(int index)
  {
    We aWe = we.get(index);
    return aWe;
  }

  public List<We> getWe()
  {
    List<We> newWe = Collections.unmodifiableList(we);
    return newWe;
  }

  public int numberOfWe()
  {
    int number = we.size();
    return number;
  }

  public boolean hasWe()
  {
    boolean has = we.size() > 0;
    return has;
  }

  public int indexOfWe(We aWe)
  {
    int index = we.indexOf(aWe);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_we()
  {
    we.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWe()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addWe(We aWe)
  {
    boolean wasAdded = false;
    if (we.contains(aWe)) { return false; }
    we.add(aWe);
    if (aWe.indexOfQw(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aWe.addQw(this);
      if (!wasAdded)
      {
        we.remove(aWe);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeWe(We aWe)
  {
    boolean wasRemoved = false;
    if (!we.contains(aWe))
    {
      return wasRemoved;
    }

    int oldIndex = we.indexOf(aWe);
    we.remove(oldIndex);
    if (aWe.indexOfQw(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aWe.removeQw(this);
      if (!wasRemoved)
      {
        we.add(oldIndex,aWe);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWeAt(We aWe, int index)
  {  
    boolean wasAdded = false;
    if(addWe(aWe))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWe()) { index = numberOfWe() - 1; }
      we.remove(aWe);
      we.add(index, aWe);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWeAt(We aWe, int index)
  {
    boolean wasAdded = false;
    if(we.contains(aWe))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWe()) { index = numberOfWe() - 1; }
      we.remove(aWe);
      we.add(index, aWe);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWeAt(aWe, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<We> copyOfWe = new ArrayList<We>(we);
    we.clear();
    for(We aWe : copyOfWe)
    {
      aWe.removeQw(this);
    }
  }

}
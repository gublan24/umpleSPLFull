/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 507 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Pq
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Pq Associations
  private List<Lp> lp;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Pq()
  {
    lp = new ArrayList<Lp>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Lp getLp(int index)
  {
    Lp aLp = lp.get(index);
    return aLp;
  }

  public List<Lp> getLp()
  {
    List<Lp> newLp = Collections.unmodifiableList(lp);
    return newLp;
  }

  public int numberOfLp()
  {
    int number = lp.size();
    return number;
  }

  public boolean hasLp()
  {
    boolean has = lp.size() > 0;
    return has;
  }

  public int indexOfLp(Lp aLp)
  {
    int index = lp.indexOf(aLp);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_lp()
  {
    lp.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfLp()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addLp(Lp aLp)
  {
    boolean wasAdded = false;
    if (lp.contains(aLp)) { return false; }
    lp.add(aLp);
    if (aLp.indexOfPq(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aLp.addPq(this);
      if (!wasAdded)
      {
        lp.remove(aLp);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeLp(Lp aLp)
  {
    boolean wasRemoved = false;
    if (!lp.contains(aLp))
    {
      return wasRemoved;
    }

    int oldIndex = lp.indexOf(aLp);
    lp.remove(oldIndex);
    if (aLp.indexOfPq(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aLp.removePq(this);
      if (!wasRemoved)
      {
        lp.add(oldIndex,aLp);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addLpAt(Lp aLp, int index)
  {  
    boolean wasAdded = false;
    if(addLp(aLp))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLp()) { index = numberOfLp() - 1; }
      lp.remove(aLp);
      lp.add(index, aLp);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLpAt(Lp aLp, int index)
  {
    boolean wasAdded = false;
    if(lp.contains(aLp))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLp()) { index = numberOfLp() - 1; }
      lp.remove(aLp);
      lp.add(index, aLp);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLpAt(aLp, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Lp> copyOfLp = new ArrayList<Lp>(lp);
    lp.clear();
    for(Lp aLp : copyOfLp)
    {
      aLp.removePq(this);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [42]
 * Issue988 - this associations are no longer considered specialization
 * but ignored
 * class Sx {}
 * class Xe {}
 * class Sxx { isA Sx; }
 * association { * Sx sx -- * Xe xe; }
 * association { * Sxx sx -- * Xe xe; }
 * [43]
 */
// line 432 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ed
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ed Associations
  private List<Dc> dc;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ed()
  {
    dc = new ArrayList<Dc>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Dc getDc(int index)
  {
    Dc aDc = dc.get(index);
    return aDc;
  }

  public List<Dc> getDc()
  {
    List<Dc> newDc = Collections.unmodifiableList(dc);
    return newDc;
  }

  public int numberOfDc()
  {
    int number = dc.size();
    return number;
  }

  public boolean hasDc()
  {
    boolean has = dc.size() > 0;
    return has;
  }

  public int indexOfDc(Dc aDc)
  {
    int index = dc.indexOf(aDc);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_dc()
  {
    dc.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDc()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDc(Dc aDc)
  {
    boolean wasAdded = false;
    if (dc.contains(aDc)) { return false; }
    dc.add(aDc);
    if (aDc.indexOfEd(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDc.addEd(this);
      if (!wasAdded)
      {
        dc.remove(aDc);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDc(Dc aDc)
  {
    boolean wasRemoved = false;
    if (!dc.contains(aDc))
    {
      return wasRemoved;
    }

    int oldIndex = dc.indexOf(aDc);
    dc.remove(oldIndex);
    if (aDc.indexOfEd(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDc.removeEd(this);
      if (!wasRemoved)
      {
        dc.add(oldIndex,aDc);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDcAt(Dc aDc, int index)
  {  
    boolean wasAdded = false;
    if(addDc(aDc))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDc()) { index = numberOfDc() - 1; }
      dc.remove(aDc);
      dc.add(index, aDc);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDcAt(Dc aDc, int index)
  {
    boolean wasAdded = false;
    if(dc.contains(aDc))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDc()) { index = numberOfDc() - 1; }
      dc.remove(aDc);
      dc.add(index, aDc);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDcAt(aDc, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Dc> copyOfDc = new ArrayList<Dc>(dc);
    dc.clear();
    for(Dc aDc : copyOfDc)
    {
      aDc.removeEd(this);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [44]
 */
// line 440 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Cr
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Cr Associations
  private List<Rf> rf;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Cr()
  {
    rf = new ArrayList<Rf>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Rf getRf(int index)
  {
    Rf aRf = rf.get(index);
    return aRf;
  }

  public List<Rf> getRf()
  {
    List<Rf> newRf = Collections.unmodifiableList(rf);
    return newRf;
  }

  public int numberOfRf()
  {
    int number = rf.size();
    return number;
  }

  public boolean hasRf()
  {
    boolean has = rf.size() > 0;
    return has;
  }

  public int indexOfRf(Rf aRf)
  {
    int index = rf.indexOf(aRf);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_rf()
  {
    rf.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRf()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addRf(Rf aRf)
  {
    boolean wasAdded = false;
    if (rf.contains(aRf)) { return false; }
    rf.add(aRf);
    if (aRf.indexOfCr(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aRf.addCr(this);
      if (!wasAdded)
      {
        rf.remove(aRf);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeRf(Rf aRf)
  {
    boolean wasRemoved = false;
    if (!rf.contains(aRf))
    {
      return wasRemoved;
    }

    int oldIndex = rf.indexOf(aRf);
    rf.remove(oldIndex);
    if (aRf.indexOfCr(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aRf.removeCr(this);
      if (!wasRemoved)
      {
        rf.add(oldIndex,aRf);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRfAt(Rf aRf, int index)
  {  
    boolean wasAdded = false;
    if(addRf(aRf))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRf()) { index = numberOfRf() - 1; }
      rf.remove(aRf);
      rf.add(index, aRf);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRfAt(Rf aRf, int index)
  {
    boolean wasAdded = false;
    if(rf.contains(aRf))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRf()) { index = numberOfRf() - 1; }
      rf.remove(aRf);
      rf.add(index, aRf);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRfAt(aRf, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Rf> copyOfRf = new ArrayList<Rf>(rf);
    rf.clear();
    for(Rf aRf : copyOfRf)
    {
      aRf.removeCr(this);
    }
  }

}
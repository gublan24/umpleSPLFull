/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * 
 * Case: Multiplities Changed to One
 * 
 * Multiplicities changed down to one - same class right side     [1]
 */
// line 28 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Elephant
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Elephant Associations
  private List<Zebra> poodle;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Elephant()
  {
    poodle = new ArrayList<Zebra>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Zebra getPoodle(int index)
  {
    Zebra aPoodle = poodle.get(index);
    return aPoodle;
  }

  public List<Zebra> getPoodle()
  {
    List<Zebra> newPoodle = Collections.unmodifiableList(poodle);
    return newPoodle;
  }

  public int numberOfPoodle()
  {
    int number = poodle.size();
    return number;
  }

  public boolean hasPoodle()
  {
    boolean has = poodle.size() > 0;
    return has;
  }

  public int indexOfPoodle(Zebra aPoodle)
  {
    int index = poodle.indexOf(aPoodle);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_poodle()
  {
    poodle.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPoodle()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfPoodle()
  {
    return 2;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addPoodle(Zebra aPoodle)
  {
    boolean wasAdded = false;
    if (poodle.contains(aPoodle)) { return false; }
    if (numberOfPoodle() >= maximumNumberOfPoodle())
    {
      return wasAdded;
    }

    poodle.add(aPoodle);
    if (aPoodle.indexOfBob(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPoodle.addBob(this);
      if (!wasAdded)
      {
        poodle.remove(aPoodle);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removePoodle(Zebra aPoodle)
  {
    boolean wasRemoved = false;
    if (!poodle.contains(aPoodle))
    {
      return wasRemoved;
    }

    int oldIndex = poodle.indexOf(aPoodle);
    poodle.remove(oldIndex);
    if (aPoodle.indexOfBob(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPoodle.removeBob(this);
      if (!wasRemoved)
      {
        poodle.add(oldIndex,aPoodle);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPoodleAt(Zebra aPoodle, int index)
  {  
    boolean wasAdded = false;
    if(addPoodle(aPoodle))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPoodle()) { index = numberOfPoodle() - 1; }
      poodle.remove(aPoodle);
      poodle.add(index, aPoodle);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePoodleAt(Zebra aPoodle, int index)
  {
    boolean wasAdded = false;
    if(poodle.contains(aPoodle))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPoodle()) { index = numberOfPoodle() - 1; }
      poodle.remove(aPoodle);
      poodle.add(index, aPoodle);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPoodleAt(aPoodle, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Zebra> copyOfPoodle = new ArrayList<Zebra>(poodle);
    poodle.clear();
    for(Zebra aPoodle : copyOfPoodle)
    {
      aPoodle.removeBob(this);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 29 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Zebra
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Zebra Associations
  private List<Elephant> bob;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Zebra()
  {
    bob = new ArrayList<Elephant>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Elephant getBob(int index)
  {
    Elephant aBob = bob.get(index);
    return aBob;
  }

  public List<Elephant> getBob()
  {
    List<Elephant> newBob = Collections.unmodifiableList(bob);
    return newBob;
  }

  public int numberOfBob()
  {
    int number = bob.size();
    return number;
  }

  public boolean hasBob()
  {
    boolean has = bob.size() > 0;
    return has;
  }

  public int indexOfBob(Elephant aBob)
  {
    int index = bob.indexOf(aBob);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_bob()
  {
    bob.clear();
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public BigElephant getBob_OneBigElephant()
  {
    return (BigElephant)bob.get(0);
  } 
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBob()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfBob()
  {
    return 4;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addBob(Elephant aBob)
  {
    boolean wasAdded = false;
    if (bob.contains(aBob)) { return false; }
    if (numberOfBob() >= maximumNumberOfBob())
    {
      return wasAdded;
    }

    bob.add(aBob);
    if (aBob.indexOfPoodle(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aBob.addPoodle(this);
      if (!wasAdded)
      {
        bob.remove(aBob);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeBob(Elephant aBob)
  {
    boolean wasRemoved = false;
    if (!bob.contains(aBob))
    {
      return wasRemoved;
    }

    int oldIndex = bob.indexOf(aBob);
    bob.remove(oldIndex);
    if (aBob.indexOfPoodle(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aBob.removePoodle(this);
      if (!wasRemoved)
      {
        bob.add(oldIndex,aBob);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBobAt(Elephant aBob, int index)
  {  
    boolean wasAdded = false;
    if(addBob(aBob))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBob()) { index = numberOfBob() - 1; }
      bob.remove(aBob);
      bob.add(index, aBob);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBobAt(Elephant aBob, int index)
  {
    boolean wasAdded = false;
    if(bob.contains(aBob))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBob()) { index = numberOfBob() - 1; }
      bob.remove(aBob);
      bob.add(index, aBob);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBobAt(aBob, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOptionalOneToOptionalOne_relatedSpecialization */
  public boolean setBob_BigElephant(BigElephant aNewBob)
  {
    boolean wasSet = false;
    if (aNewBob == null)
    {
      BigElephant existingBob = getBob_OneBigElephant();
      clear_bob();
      
      if (existingBob != null && existingBob.getPoodle() != null)
      {
        existingBob.clear_poodle();
      }
      wasSet = true;
      return wasSet;
    }

    BigElephant currentBob = getBob_OneBigElephant();
    if (currentBob != null && !currentBob.equals(aNewBob))
    {
      currentBob.clear_poodle();
    }

    bob = new ArrayList<Elephant>();bob.add(aNewBob);
    Zebra existingPoodle = aNewBob.getPoodle_OneZebra();

    if (!equals(existingPoodle))
    { 
      for (Elephant orphan : bob)
      {
        setPoodle((BigElephant)orphan,this);
      }      
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setPoodle(BigElephant aBob, Zebra aPoodle)
  {
    try
    {
      java.lang.reflect.Field mentorField = aBob.getClass().getDeclaredField("poodle");
      mentorField.setAccessible(true);
      mentorField.set(aBob, aPoodle);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aPoodle to aBob", e);
    }
  }

  public void delete()
  {
    ArrayList<Elephant> copyOfBob = new ArrayList<Elephant>(bob);
    bob.clear();
    for(Elephant aBob : copyOfBob)
    {
      aBob.removePoodle(this);
    }
  }

}
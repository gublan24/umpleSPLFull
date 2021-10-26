/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * 
 * Case: MN down to N
 * With mandatory LHS                                       [4]
 * 
 */
// line 62 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Animal
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Animal Associations
  private List<Leg> legs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Animal()
  {
    legs = new ArrayList<Leg>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Leg getLeg(int index)
  {
    Leg aLeg = legs.get(index);
    return aLeg;
  }

  public List<Leg> getLegs()
  {
    List<Leg> newLegs = Collections.unmodifiableList(legs);
    return newLegs;
  }

  public int numberOfLegs()
  {
    int number = legs.size();
    return number;
  }

  public boolean hasLegs()
  {
    boolean has = legs.size() > 0;
    return has;
  }

  public int indexOfLeg(Leg aLeg)
  {
    int index = legs.indexOf(aLeg);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_legs()
  {
    legs.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfLegs()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Leg addLeg()
  {
    return new Leg(this);
  }

  public boolean addLeg(Leg aLeg)
  {
    boolean wasAdded = false;
    if (legs.contains(aLeg)) { return false; }
    Animal existingAnimal = aLeg.getAnimal();
    boolean isNewAnimal = existingAnimal != null && !this.equals(existingAnimal);
    if (isNewAnimal)
    {
      aLeg.setAnimal(this);
    }
    else
    {
      legs.add(aLeg);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeLeg(Leg aLeg)
  {
    boolean wasRemoved = false;
    //Unable to remove aLeg, as it must always have a animal
    if (!this.equals(aLeg.getAnimal()))
    {
      legs.remove(aLeg);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addLegAt(Leg aLeg, int index)
  {  
    boolean wasAdded = false;
    if(addLeg(aLeg))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLegs()) { index = numberOfLegs() - 1; }
      legs.remove(aLeg);
      legs.add(index, aLeg);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLegAt(Leg aLeg, int index)
  {
    boolean wasAdded = false;
    if(legs.contains(aLeg))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLegs()) { index = numberOfLegs() - 1; }
      legs.remove(aLeg);
      legs.add(index, aLeg);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLegAt(aLeg, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=legs.size(); i > 0; i--)
    {
      Leg aLeg = legs.get(i - 1);
      aLeg.delete();
    }
  }

}
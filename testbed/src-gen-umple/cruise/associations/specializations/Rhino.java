/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 64 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Rhino extends Animal
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Rhino()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Leg getLeg_Leg(int index)
  {
    Leg aLeg = (Leg)super.getLeg(index);
    return aLeg;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Leg> getLegs_Leg()
  {
    List<? extends Leg> newLegs = super.getLegs();
    return (List<Leg>)newLegs;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfLegsValid_Leg()
  {
    boolean isValid = numberOfLegs() >= minimumNumberOfLegs_Leg() && numberOfLegs() <= maximumNumberOfLegs_Leg();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod_specialization */
  public static int requiredNumberOfLegs_Leg()
  {
    return 4;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfLegs_Leg()
  {
    return 4;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfLegs_Leg()
  {
    return 4;
  }
  /* Code from template association_AddMNToOnlyOne_specialization */
  public Leg addLeg(Animal aAnimal)
  {
    if (numberOfLegs() >= maximumNumberOfLegs_Leg())
    {
      return null;
    }
    else
    {
      return new Leg(this);
    }
  }

  public boolean addLeg(Leg aLeg)
  {
    boolean wasAdded = false;
    List<Leg> legs = getLegs_Leg();
    if (legs.contains(aLeg)) { return false; }
    if (numberOfLegs() >= maximumNumberOfLegs_Leg())
    {
      return wasAdded;
    }

    Rhino existingAnimal = aLeg.getAnimal_OneRhino();
    boolean isNewAnimal = existingAnimal != null && !this.equals(existingAnimal);

    if (isNewAnimal && existingAnimal.numberOfLegs() <= minimumNumberOfLegs_Leg())
    {
      return wasAdded;
    }

    wasAdded = super.addLeg(aLeg);
    return wasAdded;
  }

  public boolean removeLeg(Leg aLeg)
  {
    boolean wasRemoved = false;
    //Unable to remove aLeg, as it must always have a animal
    if (this.equals(aLeg.getAnimal()))
    {
      return wasRemoved;
    }

    //animal already at minimum (4)
    if (numberOfLegs() <= minimumNumberOfLegs_Leg())
    {
      return wasRemoved;
    }
    
    wasRemoved = super.removeLeg(aLeg);
    return wasRemoved;
  }

  public void delete()
  {
    super.delete();
  }

}
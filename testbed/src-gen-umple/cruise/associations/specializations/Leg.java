/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 63 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Leg
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Leg Associations
  private Animal animal;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Leg(Animal aAnimal)
  {
    boolean didAddAnimal = setAnimal(aAnimal);
    if (!didAddAnimal)
    {
      throw new RuntimeException("Unable to create leg due to animal. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Animal getAnimal()
  {
    return animal;
  }
  /* Code from template association_GetOne_clear */
  protected void clear_animal()
  {
    animal = null;
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Rhino getAnimal_OneRhino()
  {
    return (Rhino)animal;
  } 
  /* Code from template association_SetOneToMany */
  public boolean setAnimal(Animal aAnimal)
  {
    boolean wasSet = false;
    if (aAnimal == null)
    {
      return wasSet;
    }

    Animal existingAnimal = animal;
    animal = aAnimal;
    if (existingAnimal != null && !existingAnimal.equals(aAnimal))
    {
      existingAnimal.removeLeg(this);
    }
    animal.addLeg(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOneToAtMostN_relatedSpecialization */
  public boolean setAnimal_Rhino(Rhino aAnimal)
  {
    boolean wasSet = false;
    //Must provide animal to leg
    if (aAnimal == null)
    {
      return wasSet;
    }

    //animal already at maximum (4)
    if (aAnimal.numberOfLegs() >= Rhino.maximumNumberOfLegs_Leg())
    {
      return wasSet;
    }
    
    Rhino existingAnimal = (Rhino)animal;
    animal = aAnimal;
    if (existingAnimal != null && !existingAnimal.equals(aAnimal))
    {
      boolean didRemove = existingAnimal.removeLeg(this);
      if (!didRemove)
      {
        animal = existingAnimal;
        return wasSet;
      }
    }
    aAnimal.addLeg(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Animal placeholderAnimal = animal;
    this.animal = null;
    if(placeholderAnimal != null)
    {
      placeholderAnimal.removeLeg(this);
    }
  }

}
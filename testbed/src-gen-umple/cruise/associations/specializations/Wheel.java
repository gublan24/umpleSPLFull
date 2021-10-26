/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 162 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Wheel
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Wheel Associations
  private Vehicle vehicle;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Wheel()
  {}

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Vehicle getVehicle()
  {
    return vehicle;
  }

  public boolean hasVehicle()
  {
    boolean has = vehicle != null;
    return has;
  }
  /* Code from template association_GetOne_clear */
  protected void clear_vehicle()
  {
    vehicle = null;
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Bicycle getVehicle_OneBicycle()
  {
    return (Bicycle)vehicle;
  } 
  /* Code from template association_GetOne_relatedSpecialization */
  public Unicycle getVehicle_OneUnicycle()
  {
    return (Unicycle)vehicle;
  } 
  /* Code from template association_SetOptionalOneToMany */
  public boolean setVehicle(Vehicle aVehicle)
  {
    boolean wasSet = false;
    Vehicle existingVehicle = vehicle;
    vehicle = aVehicle;
    if (existingVehicle != null && !existingVehicle.equals(aVehicle))
    {
      existingVehicle.removeWheel(this);
    }
    if (aVehicle != null)
    {
      aVehicle.addWheel(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOptionalOneToOptionalN_relatedSpecialization */
  public boolean setVehicle_Bicycle(Bicycle aVehicle)
  {
    boolean wasSet = false;
    if (aVehicle != null && aVehicle.numberOfWheel() >= Bicycle.maximumNumberOfWheel_Wheel())
    {
      return wasSet;
    }

    Bicycle existingVehicle = (Bicycle)vehicle;
    vehicle = aVehicle;
    if (existingVehicle != null && !existingVehicle.equals(aVehicle))
    {
      existingVehicle.removeWheel(this);
    }
    if (aVehicle != null)
    {
      aVehicle.addWheel(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOptionalOneToOptionalOne_relatedSpecialization */
  public boolean setVehicle_Unicycle(Unicycle aNewVehicle)
  {
    boolean wasSet = false;
    if (aNewVehicle == null)
    {
      Unicycle existingVehicle = (Unicycle)vehicle;
      clear_vehicle();
      
      if (existingVehicle != null && existingVehicle.getWheel() != null)
      {
        existingVehicle.clear_wheel();
      }
      wasSet = true;
      return wasSet;
    }

    Unicycle currentVehicle = getVehicle_OneUnicycle();
    if (currentVehicle != null && !currentVehicle.equals(aNewVehicle))
    {
      currentVehicle.clear_wheel();
    }

    vehicle = aNewVehicle;
    Wheel existingWheel = aNewVehicle.getWheel(0);

    if (!equals(existingWheel))
    {
        setWheel(aNewVehicle,this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setWheel(Unicycle aVehicle, Wheel aWheel)
  {
    try
    {
      java.lang.reflect.Field mentorField = aVehicle.getClass().getDeclaredField("wheel");
      mentorField.setAccessible(true);
      mentorField.set(aVehicle, aWheel);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aWheel to aVehicle", e);
    }
  }

  public void delete()
  {
    if (vehicle != null)
    {
      Vehicle placeholderVehicle = vehicle;
      this.vehicle = null;
      placeholderVehicle.removeWheel(this);
    }
  }

}
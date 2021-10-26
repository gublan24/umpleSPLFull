/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 160 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Bicycle extends Vehicle
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Bicycle()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Wheel getWheel_Wheel(int index)
  {
    Wheel aWheel = (Wheel)super.getWheel(index);
    return aWheel;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Wheel> getWheel_Wheel()
  {
    List<? extends Wheel> newWheel = super.getWheel();
    return (List<Wheel>)newWheel;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfWheel_Wheel()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfWheel_Wheel()
  {
    return 2;
  }
  /* Code from template association_AddOptionalNToOptionalOne_specialization */
  public boolean addWheel(Wheel aWheel)
  {
    boolean wasAdded = false;
    List<Wheel> wheel = getWheel_Wheel();
    if (wheel.contains(aWheel)) { return false; }
    if (numberOfWheel() >= maximumNumberOfWheel_Wheel())
    {
      return wasAdded;
    }

    wasAdded = super.addWheel(aWheel);
    return wasAdded;
  }
  public void delete()
  {
    for( Wheel orphan : getWheel_Wheel() )
    {
      orphan.clear_vehicle();
    }
    super.delete();
  }

}
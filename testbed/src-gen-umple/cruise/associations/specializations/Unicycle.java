/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 161 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Unicycle extends Vehicle
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Unicycle()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Wheel getWheel_OneWheel()
  {
    return super.getWheel(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getWheel_OneWheel() != null)
    {
      getWheel_OneWheel().clear_vehicle();
    }
    super.delete();
  }

}
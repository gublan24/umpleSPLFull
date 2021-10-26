/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 333 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Opp extends Op
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Opp()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Paa getPa_OnePaa()
  {
    return (Paa)super.getPa(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    Paa existingPa = getPa_OnePaa();
    super.clear_pa();
    if (existingPa != null)
    {
      existingPa.clear_op();
    }
    super.delete();
  }

}
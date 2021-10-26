/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 562 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Frr extends Fr
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Frr(Rbb aRb)
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Rbb getRb_OneRbb()
  {
    return (Rbb)super.getRb(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    Rbb existingRb = getRb_OneRbb();
    existingRb = null;
    super.delete();
  }

}
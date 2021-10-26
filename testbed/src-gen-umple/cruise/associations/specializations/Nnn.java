/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 289 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Nnn extends Nn
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Nnn()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Mmm getM_OneMmm()
  {
    return (Mmm)super.getM(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    Mmm existingM = getM_OneMmm();
    super.clear_m();
    if (existingM != null)
    {
      existingM.clear_n();
    }
    super.delete();
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 509 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Pqq extends Pq
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Pqq()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Lpp getLp_OneLpp()
  {
    return (Lpp)super.getLp(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getLp_OneLpp() != null)
    {
      Lpp placeholderLp = getLp_OneLpp();
      clear_lp();
      placeholderLp.removePq(this);
    }
    super.delete();
  }

}
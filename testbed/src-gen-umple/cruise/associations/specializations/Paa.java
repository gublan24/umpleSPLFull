/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 334 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Paa extends Pa
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Paa()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Opp getOp_OneOpp()
  {
    return (Opp)super.getOp(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    Opp existingOp = getOp_OneOpp();
    super.clear_op();
    if (existingOp != null)
    {
      existingOp.delete();
    }
    super.delete();
  }

}
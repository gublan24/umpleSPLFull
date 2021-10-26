/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 544 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Cdd extends Cd
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Cdd()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Dee getDe_OneDee()
  {
    return (Dee)super.getDe(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    Dee existingDe = getDe_OneDee();
    super.clear_de();
    if (existingDe != null)
    {
      existingDe.delete();
    }
    super.delete();
  }

}
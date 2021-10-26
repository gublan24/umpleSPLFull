/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 288 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Mmm extends Mm
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Mmm()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Nnn getN_OneNnn()
  {
    return (Nnn)super.getN(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    Nnn existingN = getN_OneNnn();
    super.clear_n();
    if (existingN != null)
    {
      existingN.delete();
    }
    super.delete();
  }

}
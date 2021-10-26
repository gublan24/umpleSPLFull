/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 526 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Qxx extends Qx
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Qxx()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Xssx getXsx_OneXssx()
  {
    return (Xssx)super.getXsx(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getXsx_OneXssx() != null)
    {
      getXsx_OneXssx().clear_qx();
    }
    super.delete();
  }

}
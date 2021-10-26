/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 527 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Xssx extends Xsx
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xssx()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Qxx getQx_OneQxx()
  {
    return (Qxx)super.getQx(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    Qxx existingQx = getQx_OneQxx();
    super.clear_qx();
    if (existingQx != null)
    {
      existingQx.delete();
      existingQx.clear_xsx();
    }
    super.delete();
  }

}
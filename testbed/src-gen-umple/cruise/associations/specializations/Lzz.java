/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 376 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Lzz extends Lz
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Lzz()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Zx getZx_OneZx()
  {
    return super.getZx(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getZx_OneZx() != null)
    {
      Zx placeholderZx = getZx_OneZx();
      clear_zx();
      placeholderZx.removeLz(this);
    }
    super.delete();
  }

}
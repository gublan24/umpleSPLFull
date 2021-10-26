/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 325 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ioo extends Io
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ioo()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Uii getUi_OneUii()
  {
    return (Uii)super.getUi(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getUi_OneUii() != null)
    {
      Uii placeholderUi = getUi_OneUii();
      clear_ui();
      placeholderUi.removeIo(this);
    }
    super.delete();
  }

}
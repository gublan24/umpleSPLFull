/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 271 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ccc extends Cc
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ccc()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Xxx getX_OneXxx()
  {
    return (Xxx)super.getX(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    Xxx placeholderX = getX_OneXxx();
    clear_x();
    placeholderX.removeC(this);
    super.delete();
  }

}
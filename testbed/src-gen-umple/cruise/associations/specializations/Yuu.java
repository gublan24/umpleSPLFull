/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 316 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Yuu extends Yu
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Yuu()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Tyy getTy_OneTyy()
  {
    return (Tyy)super.getTy(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getTy_OneTyy() != null)
    {
      if (getTy_OneTyy().numberOfYu() <= 3)
      {
        getTy_OneTyy().delete();
      }
      else
      {
        Tyy placeholderTy = getTy_OneTyy();
        clear_ty();
        placeholderTy.removeYu(this);
      }
    }
    super.delete();
  }

}
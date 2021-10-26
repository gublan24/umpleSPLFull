/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 241 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ggg extends Gg
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ggg()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Hhh getH_OneHhh()
  {
    return (Hhh)super.getH(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getH_OneHhh() != null)
    {
      getH_OneHhh().delete();
    }
    super.delete();
  }

}
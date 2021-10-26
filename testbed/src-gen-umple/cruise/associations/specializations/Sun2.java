/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 50 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Sun2 extends Sun
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Sun2()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Moon2 getMoon_OneMoon2()
  {
    return (Moon2)super.getMoon(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getMoon_OneMoon2() != null)
    {
      getMoon_OneMoon2().clear_sun();
    }
    super.delete();
  }

}
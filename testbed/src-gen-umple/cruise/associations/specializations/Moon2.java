/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 51 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Moon2 extends Moon
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Moon2()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Sun2 getSun_OneSun2()
  {
    return (Sun2)super.getSun(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getSun_OneSun2() != null)
    {
      getSun_OneSun2().clear_moon();
    }
    super.delete();
  }

}
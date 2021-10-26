/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 40 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Snapple extends Apple
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Snapple()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Spatula getSpat_OneSpatula()
  {
    return super.getSpat(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getSpat_OneSpatula() != null)
    {
      if (getSpat_OneSpatula().numberOfFruit() <= 2)
      {
        getSpat_OneSpatula().delete();
      }
      else
      {
        Spatula placeholderSpat = getSpat_OneSpatula();
        clear_spat();
        placeholderSpat.removeFruit(this);
      }
    }
    super.delete();
  }

}
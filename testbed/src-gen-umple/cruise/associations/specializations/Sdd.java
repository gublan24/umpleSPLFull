/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 343 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Sdd extends Sd
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Sdd()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Sassy getSass_OneSassy()
  {
    return (Sassy)super.getSass(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOptionalOneToOptionalN_specialization */
  public boolean setSass(Sassy aSass)
  {
    boolean wasSet = false;
    if (aSass != null && aSass.numberOfSd() >= Sassy.maximumNumberOfSd_Sdd())
    {
      return wasSet;
    }

    super.clear_sass();
    wasSet = addSass(aSass);
    return wasSet;
  }

  public void delete()
  {
    if (getSass_OneSassy() != null)
    {
      Sassy placeholderSass = getSass_OneSassy();
      clear_sass();
      placeholderSass.removeSd(this);
    }
    super.delete();
  }

}
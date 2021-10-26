/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 141 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Drummer extends Drama
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Drummer()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Spammer getSpam_OneSpammer()
  {
    return (Spammer)super.getSpam(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOneToAtMostN_specialization */
  public boolean setSpam(Spammer aSpam)
  {
    boolean wasSet = false;
    //Must provide spam to drama
    if (aSpam == null)
    {
      return wasSet;
    }

    //spam already at maximum (4)
    if (aSpam.numberOfDrama() >= Spammer.maximumNumberOfDrama_Drummer())
    {
      return wasSet;
    }

    super.clear_spam();
    wasSet = addSpam(aSpam);
    return wasSet;
  }

  public void delete()
  {
    Spammer placeholderSpam = getSpam_OneSpammer();
    clear_spam();
    placeholderSpam.removeDrama(this);
    super.delete();
  }

}
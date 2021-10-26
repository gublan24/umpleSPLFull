/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 518 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Aqq extends Aq
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Aqq()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Zaa getZa_OneZaa()
  {
    return (Zaa)super.getZa(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOptionalOneToOptionalN_specialization */
  public boolean setZa(Zaa aZa)
  {
    boolean wasSet = false;
    if (aZa != null && aZa.numberOfAq() >= Zaa.maximumNumberOfAq_Aqq())
    {
      return wasSet;
    }

    super.clear_za();
    wasSet = addZa(aZa);
    return wasSet;
  }

  public void delete()
  {
    Zaa existingZa = getZa_OneZaa();
    super.clear_za();
    if (existingZa != null)
    {
      existingZa.delete();
    }
    super.delete();
  }

}
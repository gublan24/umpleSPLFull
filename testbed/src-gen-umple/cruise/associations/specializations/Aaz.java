/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 151 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Aaz extends Az
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Aaz()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Bbz getB_OneBbz()
  {
    return (Bbz)super.getB(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOptionalOneToOptionalN_specialization */
  public boolean setB(Bbz aB)
  {
    boolean wasSet = false;
    if (aB != null && aB.numberOfA() >= Bbz.maximumNumberOfA_Aaz())
    {
      return wasSet;
    }

    super.clear_b();
    wasSet = addB(aB);
    return wasSet;
  }

  public void delete()
  {
    if (getB_OneBbz() != null)
    {
      Bbz placeholderB = getB_OneBbz();
      clear_b();
      placeholderB.removeA(this);
    }
    super.delete();
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 252 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Kkk extends Kk
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Kkk()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Jjj getJ_OneJjj()
  {
    return (Jjj)super.getJ(0);
  }
  /* Code from template association_GetOne_specialization */
  public Lll getL_OneLll()
  {
    return (Lll)super.getL(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOneToAtMostN_specialization */
  public boolean setJ(Jjj aJ)
  {
    boolean wasSet = false;
    //Must provide j to k
    if (aJ == null)
    {
      return wasSet;
    }

    //j already at maximum (6)
    if (aJ.numberOfK() >= Jjj.maximumNumberOfK_Kkk())
    {
      return wasSet;
    }

    super.clear_j();
    wasSet = addJ(aJ);
    return wasSet;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOneToMandatoryMany_specialization */
  public boolean setL(Lll aL)
  {
    boolean wasSet = false;
    //Must provide l to k
    if (aL == null)
    {
      return wasSet;
    }

    if (getL_OneLll() != null && getL_OneLll().numberOfK() <= Lll.minimumNumberOfK_Kkk())
    {
      return wasSet;
    }

    super.clear_l();
    wasSet = addL(aL);
    return wasSet;
  }

  public void delete()
  {
    Jjj placeholderJ = getJ_OneJjj();
    clear_j();
    placeholderJ.removeK(this);
    Lll placeholderL = getL_OneLll();
    clear_l();
    placeholderL.removeK(this);
    super.delete();
  }

}
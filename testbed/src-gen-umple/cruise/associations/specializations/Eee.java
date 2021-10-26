/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 181 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Eee extends Ee
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Eee()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Rrr getR_OneRrr()
  {
    return (Rrr)super.getR();
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOneToAtMostN_specialization */
  public boolean setR(Rrr aR)
  {
    boolean wasSet = false;
    //Must provide r to e
    if (aR == null)
    {
      return wasSet;
    }

    //r already at maximum (2)
    if (aR.numberOfE() >= Rrr.maximumNumberOfE_Eee())
    {
      return wasSet;
    }

    wasSet = super.setR(aR);
    return wasSet;
  }

  public void delete()
  {
    Rrr placeholderR = getR_OneRrr();
    clear_r();
    placeholderR.removeE(this);
    super.delete();
  }

}
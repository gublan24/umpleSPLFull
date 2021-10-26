/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 172 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Qqq extends Qq
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Qqq()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Ww getW_OneWw()
  {
    return super.getW();
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOneToAtMostN_specialization */
  public boolean setW(Ww aW)
  {
    boolean wasSet = false;
    //Must provide w to q
    if (aW == null)
    {
      return wasSet;
    }

    //w already at maximum (2)
    if (aW.numberOfQ() >= Ww.maximumNumberOfQ_Qqq())
    {
      return wasSet;
    }

    wasSet = super.setW(aW);
    return wasSet;
  }

  public void delete()
  {
    Ww placeholderW = getW_OneWw();
    clear_w();
    placeholderW.removeQ(this);
    super.delete();
  }

}
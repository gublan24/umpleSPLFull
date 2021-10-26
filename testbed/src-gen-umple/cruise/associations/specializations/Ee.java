/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

/**
 * Optional to Mandatory -- subclass                              [15]
 */
// line 179 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ee
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ee Associations
  private Rr r;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ee()
  {}

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Rr getR()
  {
    return r;
  }

  public boolean hasR()
  {
    boolean has = r != null;
    return has;
  }
  /* Code from template association_GetOne_clear */
  protected void clear_r()
  {
    r = null;
  }
  /* Code from template association_SetOptionalOneToOptionalN */
  public boolean setR(Rr aR)
  {
    boolean wasSet = false;
    if (aR != null && aR.numberOfE() >= Rr.maximumNumberOfE())
    {
      return wasSet;
    }

    Rr existingR = r;
    r = aR;
    if (existingR != null && !existingR.equals(aR))
    {
      existingR.removeE(this);
    }
    if (aR != null)
    {
      aR.addE(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (r != null)
    {
      Rr placeholderR = r;
      this.r = null;
      placeholderR.removeE(this);
    }
  }

}
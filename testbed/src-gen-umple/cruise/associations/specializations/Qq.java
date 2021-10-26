/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

/**
 * Optional to mandatory                                          [14]
 */
// line 170 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Qq
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Qq Associations
  private Ww w;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Qq()
  {}

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Ww getW()
  {
    return w;
  }

  public boolean hasW()
  {
    boolean has = w != null;
    return has;
  }
  /* Code from template association_GetOne_clear */
  protected void clear_w()
  {
    w = null;
  }
  /* Code from template association_SetOptionalOneToOptionalN */
  public boolean setW(Ww aW)
  {
    boolean wasSet = false;
    if (aW != null && aW.numberOfQ() >= Ww.maximumNumberOfQ())
    {
      return wasSet;
    }

    Ww existingW = w;
    w = aW;
    if (existingW != null && !existingW.equals(aW))
    {
      existingW.removeQ(this);
    }
    if (aW != null)
    {
      aW.addQ(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (w != null)
    {
      Ww placeholderW = w;
      this.w = null;
      placeholderW.removeQ(this);
    }
  }

}
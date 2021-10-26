/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

/**
 * Both ends are subclasses                                       [8]
 */
// line 105 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Repent1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Repent1 Associations
  private Serendipity1 seren;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Repent1()
  {}

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Serendipity1 getSeren()
  {
    return seren;
  }

  public boolean hasSeren()
  {
    boolean has = seren != null;
    return has;
  }
  /* Code from template association_GetOne_clear */
  protected void clear_seren()
  {
    seren = null;
  }
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setSeren(Serendipity1 aNewSeren)
  {
    boolean wasSet = false;
    if (aNewSeren == null)
    {
      Serendipity1 existingSeren = seren;
      seren = null;
      
      if (existingSeren != null && existingSeren.getRep() != null)
      {
        existingSeren.setRep(null);
      }
      wasSet = true;
      return wasSet;
    }

    Serendipity1 currentSeren = getSeren();
    if (currentSeren != null && !currentSeren.equals(aNewSeren))
    {
      currentSeren.setRep(null);
    }

    seren = aNewSeren;
    Repent1 existingRep = aNewSeren.getRep();

    if (!equals(existingRep))
    {
      aNewSeren.setRep(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (seren != null)
    {
      seren.setRep(null);
    }
  }

}
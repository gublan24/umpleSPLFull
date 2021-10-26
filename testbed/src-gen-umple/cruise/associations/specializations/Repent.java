/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

/**
 * 
 * Case: Optional 1 down to 1 both cases
 * [7]
 */
// line 95 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Repent
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Repent Associations
  private Serendipity seren;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Repent()
  {}

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Serendipity getSeren()
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
  public boolean setSeren(Serendipity aNewSeren)
  {
    boolean wasSet = false;
    if (aNewSeren == null)
    {
      Serendipity existingSeren = seren;
      seren = null;
      
      if (existingSeren != null && existingSeren.getRep() != null)
      {
        existingSeren.setRep(null);
      }
      wasSet = true;
      return wasSet;
    }

    Serendipity currentSeren = getSeren();
    if (currentSeren != null && !currentSeren.equals(aNewSeren))
    {
      currentSeren.setRep(null);
    }

    seren = aNewSeren;
    Repent existingRep = aNewSeren.getRep();

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
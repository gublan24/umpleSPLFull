/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 96 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Serendipity
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Serendipity Associations
  private Repent rep;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Serendipity()
  {}

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Repent getRep()
  {
    return rep;
  }

  public boolean hasRep()
  {
    boolean has = rep != null;
    return has;
  }
  /* Code from template association_GetOne_clear */
  protected void clear_rep()
  {
    rep = null;
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Repenter getRep_OneRepenter()
  {
    return (Repenter)rep;
  } 
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setRep(Repent aNewRep)
  {
    boolean wasSet = false;
    if (aNewRep == null)
    {
      Repent existingRep = rep;
      rep = null;
      
      if (existingRep != null && existingRep.getSeren() != null)
      {
        existingRep.setSeren(null);
      }
      wasSet = true;
      return wasSet;
    }

    Repent currentRep = getRep();
    if (currentRep != null && !currentRep.equals(aNewRep))
    {
      currentRep.setSeren(null);
    }

    rep = aNewRep;
    Serendipity existingSeren = aNewRep.getSeren();

    if (!equals(existingSeren))
    {
      aNewRep.setSeren(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_set_specialization_reqCommonCode */
  public void delete()
  {
    if (rep != null)
    {
      rep.setSeren(null);
    }
  }

}
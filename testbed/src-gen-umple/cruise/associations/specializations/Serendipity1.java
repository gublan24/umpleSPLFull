/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 106 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Serendipity1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Serendipity1 Associations
  private Repent1 rep;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Serendipity1()
  {}

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Repent1 getRep()
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
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setRep(Repent1 aNewRep)
  {
    boolean wasSet = false;
    if (aNewRep == null)
    {
      Repent1 existingRep = rep;
      rep = null;
      
      if (existingRep != null && existingRep.getSeren() != null)
      {
        existingRep.setSeren(null);
      }
      wasSet = true;
      return wasSet;
    }

    Repent1 currentRep = getRep();
    if (currentRep != null && !currentRep.equals(aNewRep))
    {
      currentRep.setSeren(null);
    }

    rep = aNewRep;
    Serendipity1 existingSeren = aNewRep.getSeren();

    if (!equals(existingSeren))
    {
      aNewRep.setSeren(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (rep != null)
    {
      rep.setSeren(null);
    }
  }

}
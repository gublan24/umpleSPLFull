/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 601 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Issue1238bC
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Issue1238bC Associations
  private Issue1238bA sth;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Issue1238bC(Issue1238bA aSth)
  {
    boolean didAddSth = setSth(aSth);
    if (!didAddSth)
    {
      throw new RuntimeException("Unable to create issue1238bC due to sth. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Issue1238bA getSth()
  {
    return sth;
  }
  /* Code from template association_GetOne_clear */
  protected void clear_sth()
  {
    sth = null;
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Issue1238bB getSth_OneIssue1238bB()
  {
    return (Issue1238bB)sth;
  } 
  /* Code from template association_SetOneToAtMostN */
  public boolean setSth(Issue1238bA aSth)
  {
    boolean wasSet = false;
    //Must provide sth to issue1238bC
    if (aSth == null)
    {
      return wasSet;
    }

    //sth already at maximum (3)
    if (aSth.numberOfIssue1238bCs() >= Issue1238bA.maximumNumberOfIssue1238bCs())
    {
      return wasSet;
    }
    
    Issue1238bA existingSth = sth;
    sth = aSth;
    if (existingSth != null && !existingSth.equals(aSth))
    {
      boolean didRemove = existingSth.removeIssue1238bC(this);
      if (!didRemove)
      {
        sth = existingSth;
        return wasSet;
      }
    }
    sth.addIssue1238bC(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOneToAtMostN_relatedSpecialization */
  public boolean setSth_Issue1238bB(Issue1238bB aSth)
  {
    boolean wasSet = false;
    //Must provide sth to issue1238bC
    if (aSth == null)
    {
      return wasSet;
    }

    //sth already at maximum (2)
    if (aSth.numberOfIssue1238bCs() >= Issue1238bB.maximumNumberOfIssue1238bCs_Issue1238bC())
    {
      return wasSet;
    }
    
    Issue1238bB existingSth = (Issue1238bB)sth;
    sth = aSth;
    if (existingSth != null && !existingSth.equals(aSth))
    {
      boolean didRemove = existingSth.removeIssue1238bC(this);
      if (!didRemove)
      {
        sth = existingSth;
        return wasSet;
      }
    }
    aSth.addIssue1238bC(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Issue1238bA placeholderSth = sth;
    this.sth = null;
    if(placeholderSth != null)
    {
      placeholderSth.removeIssue1238bC(this);
    }
  }

}
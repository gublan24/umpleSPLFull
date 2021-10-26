/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 586 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Issue1238aC
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Issue1238aC Associations
  private Issue1238aA sth;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Issue1238aC(Issue1238aA aSth)
  {
    boolean didAddSth = setSth(aSth);
    if (!didAddSth)
    {
      throw new RuntimeException("Unable to create csth due to sth. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Issue1238aA getSth()
  {
    return sth;
  }
  /* Code from template association_GetOne_clear */
  protected void clear_sth()
  {
    sth = null;
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Issue1238aB getSth_OneIssue1238aB()
  {
    return (Issue1238aB)sth;
  } 
  /* Code from template association_SetOneToAtMostN */
  public boolean setSth(Issue1238aA aSth)
  {
    boolean wasSet = false;
    //Must provide sth to csth
    if (aSth == null)
    {
      return wasSet;
    }

    //sth already at maximum (3)
    if (aSth.numberOfCsth() >= Issue1238aA.maximumNumberOfCsth())
    {
      return wasSet;
    }
    
    Issue1238aA existingSth = sth;
    sth = aSth;
    if (existingSth != null && !existingSth.equals(aSth))
    {
      boolean didRemove = existingSth.removeCsth(this);
      if (!didRemove)
      {
        sth = existingSth;
        return wasSet;
      }
    }
    sth.addCsth(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOneToAtMostN_relatedSpecialization */
  public boolean setSth_Issue1238aB(Issue1238aB aSth)
  {
    boolean wasSet = false;
    //Must provide sth to csth
    if (aSth == null)
    {
      return wasSet;
    }

    //sth already at maximum (2)
    if (aSth.numberOfCsth() >= Issue1238aB.maximumNumberOfCsth_Issue1238aC())
    {
      return wasSet;
    }
    
    Issue1238aB existingSth = (Issue1238aB)sth;
    sth = aSth;
    if (existingSth != null && !existingSth.equals(aSth))
    {
      boolean didRemove = existingSth.removeCsth(this);
      if (!didRemove)
      {
        sth = existingSth;
        return wasSet;
      }
    }
    aSth.addCsth(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Issue1238aA placeholderSth = sth;
    this.sth = null;
    if(placeholderSth != null)
    {
      placeholderSth.removeCsth(this);
    }
  }

}
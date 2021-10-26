/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 598 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Issue1238bB extends Issue1238bA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Issue1238bB()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Issue1238bC getIssue1238bC_Issue1238bC(int index)
  {
    Issue1238bC aIssue1238bC = (Issue1238bC)super.getIssue1238bC(index);
    return aIssue1238bC;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Issue1238bC> getIssue1238bCs_Issue1238bC()
  {
    List<? extends Issue1238bC> newIssue1238bCs = super.getIssue1238bCs();
    return (List<Issue1238bC>)newIssue1238bCs;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfIssue1238bCsValid_Issue1238bC()
  {
    boolean isValid = numberOfIssue1238bCs() >= minimumNumberOfIssue1238bCs_Issue1238bC() && numberOfIssue1238bCs() <= maximumNumberOfIssue1238bCs_Issue1238bC();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfIssue1238bCs_Issue1238bC()
  {
    return 1;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfIssue1238bCs_Issue1238bC()
  {
    return 2;
  }
  /* Code from template association_AddMNToOnlyOne_specialization */
  public Issue1238bC addIssue1238bC(Issue1238bA aSth)
  {
    if (numberOfIssue1238bCs() >= maximumNumberOfIssue1238bCs_Issue1238bC())
    {
      return null;
    }
    else
    {
      return new Issue1238bC(this);
    }
  }

  public boolean addIssue1238bC(Issue1238bC aIssue1238bC)
  {
    boolean wasAdded = false;
    List<Issue1238bC> issue1238bCs = getIssue1238bCs_Issue1238bC();
    if (issue1238bCs.contains(aIssue1238bC)) { return false; }
    if (numberOfIssue1238bCs() >= maximumNumberOfIssue1238bCs_Issue1238bC())
    {
      return wasAdded;
    }

    Issue1238bB existingSth = aIssue1238bC.getSth_OneIssue1238bB();
    boolean isNewSth = existingSth != null && !this.equals(existingSth);

    if (isNewSth && existingSth.numberOfIssue1238bCs() <= minimumNumberOfIssue1238bCs_Issue1238bC())
    {
      return wasAdded;
    }

    wasAdded = super.addIssue1238bC(aIssue1238bC);
    return wasAdded;
  }

  public boolean removeIssue1238bC(Issue1238bC aIssue1238bC)
  {
    boolean wasRemoved = false;
    //Unable to remove aIssue1238bC, as it must always have a sth
    if (this.equals(aIssue1238bC.getSth()))
    {
      return wasRemoved;
    }

    //sth already at minimum (1)
    if (numberOfIssue1238bCs() <= minimumNumberOfIssue1238bCs_Issue1238bC())
    {
      return wasRemoved;
    }
    
    wasRemoved = super.removeIssue1238bC(aIssue1238bC);
    return wasRemoved;
  }

  public void delete()
  {
    super.delete();
  }

}
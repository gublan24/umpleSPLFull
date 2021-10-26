/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 583 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Issue1238aB extends Issue1238aA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Issue1238aB()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Issue1238aC getCsth_Issue1238aC(int index)
  {
    Issue1238aC aCsth = (Issue1238aC)super.getCsth(index);
    return aCsth;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Issue1238aC> getCsth_Issue1238aC()
  {
    List<? extends Issue1238aC> newCsth = super.getCsth();
    return (List<Issue1238aC>)newCsth;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfCsthValid_Issue1238aC()
  {
    boolean isValid = numberOfCsth() >= minimumNumberOfCsth_Issue1238aC() && numberOfCsth() <= maximumNumberOfCsth_Issue1238aC();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfCsth_Issue1238aC()
  {
    return 1;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfCsth_Issue1238aC()
  {
    return 2;
  }
  /* Code from template association_AddMNToOnlyOne_specialization */
  public Issue1238aC addCsth(Issue1238aA aSth)
  {
    if (numberOfCsth() >= maximumNumberOfCsth_Issue1238aC())
    {
      return null;
    }
    else
    {
      return new Issue1238aC(this);
    }
  }

  public boolean addCsth(Issue1238aC aCsth)
  {
    boolean wasAdded = false;
    List<Issue1238aC> csth = getCsth_Issue1238aC();
    if (csth.contains(aCsth)) { return false; }
    if (numberOfCsth() >= maximumNumberOfCsth_Issue1238aC())
    {
      return wasAdded;
    }

    Issue1238aB existingSth = aCsth.getSth_OneIssue1238aB();
    boolean isNewSth = existingSth != null && !this.equals(existingSth);

    if (isNewSth && existingSth.numberOfCsth() <= minimumNumberOfCsth_Issue1238aC())
    {
      return wasAdded;
    }

    wasAdded = super.addCsth(aCsth);
    return wasAdded;
  }

  public boolean removeCsth(Issue1238aC aCsth)
  {
    boolean wasRemoved = false;
    //Unable to remove aCsth, as it must always have a sth
    if (this.equals(aCsth.getSth()))
    {
      return wasRemoved;
    }

    //sth already at minimum (1)
    if (numberOfCsth() <= minimumNumberOfCsth_Issue1238aC())
    {
      return wasRemoved;
    }
    
    wasRemoved = super.removeCsth(aCsth);
    return wasRemoved;
  }

  public void delete()
  {
    super.delete();
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * 
 * Case: issue 1238 parent and childrent class are not on the same side with only one side named [60]
 * 
 */
// line 596 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Issue1238bA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Issue1238bA Associations
  private List<Issue1238bC> issue1238bCs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Issue1238bA()
  {
    issue1238bCs = new ArrayList<Issue1238bC>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Issue1238bC getIssue1238bC(int index)
  {
    Issue1238bC aIssue1238bC = issue1238bCs.get(index);
    return aIssue1238bC;
  }

  public List<Issue1238bC> getIssue1238bCs()
  {
    List<Issue1238bC> newIssue1238bCs = Collections.unmodifiableList(issue1238bCs);
    return newIssue1238bCs;
  }

  public int numberOfIssue1238bCs()
  {
    int number = issue1238bCs.size();
    return number;
  }

  public boolean hasIssue1238bCs()
  {
    boolean has = issue1238bCs.size() > 0;
    return has;
  }

  public int indexOfIssue1238bC(Issue1238bC aIssue1238bC)
  {
    int index = issue1238bCs.indexOf(aIssue1238bC);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_issue1238bCs()
  {
    issue1238bCs.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfIssue1238bCs()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfIssue1238bCs()
  {
    return 3;
  }
  /* Code from template association_AddOptionalNToOne */
  public Issue1238bC addIssue1238bC()
  {
    if (numberOfIssue1238bCs() >= maximumNumberOfIssue1238bCs())
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
    if (issue1238bCs.contains(aIssue1238bC)) { return false; }
    if (numberOfIssue1238bCs() >= maximumNumberOfIssue1238bCs())
    {
      return wasAdded;
    }

    Issue1238bA existingSth = aIssue1238bC.getSth();
    boolean isNewSth = existingSth != null && !this.equals(existingSth);
    if (isNewSth)
    {
      aIssue1238bC.setSth(this);
    }
    else
    {
      issue1238bCs.add(aIssue1238bC);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeIssue1238bC(Issue1238bC aIssue1238bC)
  {
    boolean wasRemoved = false;
    //Unable to remove aIssue1238bC, as it must always have a sth
    if (!this.equals(aIssue1238bC.getSth()))
    {
      issue1238bCs.remove(aIssue1238bC);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addIssue1238bCAt(Issue1238bC aIssue1238bC, int index)
  {  
    boolean wasAdded = false;
    if(addIssue1238bC(aIssue1238bC))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfIssue1238bCs()) { index = numberOfIssue1238bCs() - 1; }
      issue1238bCs.remove(aIssue1238bC);
      issue1238bCs.add(index, aIssue1238bC);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveIssue1238bCAt(Issue1238bC aIssue1238bC, int index)
  {
    boolean wasAdded = false;
    if(issue1238bCs.contains(aIssue1238bC))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfIssue1238bCs()) { index = numberOfIssue1238bCs() - 1; }
      issue1238bCs.remove(aIssue1238bC);
      issue1238bCs.add(index, aIssue1238bC);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addIssue1238bCAt(aIssue1238bC, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=issue1238bCs.size(); i > 0; i--)
    {
      Issue1238bC aIssue1238bC = issue1238bCs.get(i - 1);
      aIssue1238bC.delete();
    }
  }

}
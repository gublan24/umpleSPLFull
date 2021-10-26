/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * 
 * Case: Optional 1 down to optional 1
 * [59]
 * Issue 988 - these associations are no longer considered specializations but ignored
 * class Supervisor {}
 * class Employee {}
 * class Janitor { isA Employee; }
 * association { 0..1 Employee emp -- 0..1 Supervisor supervisor; }
 * association { 0..1 Janitor emp -- 0..1 Supervisor supervisor; }
 * 
 * Case: issue 1238 parent and childrent class are not on the same side with names [60]
 * 
 */
// line 581 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Issue1238aA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Issue1238aA Associations
  private List<Issue1238aC> csth;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Issue1238aA()
  {
    csth = new ArrayList<Issue1238aC>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Issue1238aC getCsth(int index)
  {
    Issue1238aC aCsth = csth.get(index);
    return aCsth;
  }

  public List<Issue1238aC> getCsth()
  {
    List<Issue1238aC> newCsth = Collections.unmodifiableList(csth);
    return newCsth;
  }

  public int numberOfCsth()
  {
    int number = csth.size();
    return number;
  }

  public boolean hasCsth()
  {
    boolean has = csth.size() > 0;
    return has;
  }

  public int indexOfCsth(Issue1238aC aCsth)
  {
    int index = csth.indexOf(aCsth);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_csth()
  {
    csth.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCsth()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfCsth()
  {
    return 3;
  }
  /* Code from template association_AddOptionalNToOne */
  public Issue1238aC addCsth()
  {
    if (numberOfCsth() >= maximumNumberOfCsth())
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
    if (csth.contains(aCsth)) { return false; }
    if (numberOfCsth() >= maximumNumberOfCsth())
    {
      return wasAdded;
    }

    Issue1238aA existingSth = aCsth.getSth();
    boolean isNewSth = existingSth != null && !this.equals(existingSth);
    if (isNewSth)
    {
      aCsth.setSth(this);
    }
    else
    {
      csth.add(aCsth);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCsth(Issue1238aC aCsth)
  {
    boolean wasRemoved = false;
    //Unable to remove aCsth, as it must always have a sth
    if (!this.equals(aCsth.getSth()))
    {
      csth.remove(aCsth);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCsthAt(Issue1238aC aCsth, int index)
  {  
    boolean wasAdded = false;
    if(addCsth(aCsth))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCsth()) { index = numberOfCsth() - 1; }
      csth.remove(aCsth);
      csth.add(index, aCsth);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCsthAt(Issue1238aC aCsth, int index)
  {
    boolean wasAdded = false;
    if(csth.contains(aCsth))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCsth()) { index = numberOfCsth() - 1; }
      csth.remove(aCsth);
      csth.add(index, aCsth);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCsthAt(aCsth, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=csth.size(); i > 0; i--)
    {
      Issue1238aC aCsth = csth.get(i - 1);
      aCsth.delete();
    }
  }

}
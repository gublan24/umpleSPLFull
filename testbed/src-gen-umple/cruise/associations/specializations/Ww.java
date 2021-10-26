/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 171 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ww
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ww Associations
  private List<Qq> q;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ww()
  {
    q = new ArrayList<Qq>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Qq getQ(int index)
  {
    Qq aQ = q.get(index);
    return aQ;
  }

  public List<Qq> getQ()
  {
    List<Qq> newQ = Collections.unmodifiableList(q);
    return newQ;
  }

  public int numberOfQ()
  {
    int number = q.size();
    return number;
  }

  public boolean hasQ()
  {
    boolean has = q.size() > 0;
    return has;
  }

  public int indexOfQ(Qq aQ)
  {
    int index = q.indexOf(aQ);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_q()
  {
    q.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Qqq getQ_Qqq(int index)
  {
    Qqq aQ = (Qqq)q.get(index);
    return aQ;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Qqq> getQ_Qqq()
  {
    List<? extends Qq> newQ = Collections.unmodifiableList(q);
    return (List<Qqq>)newQ;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfQ()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfQ()
  {
    return 5;
  }
  /* Code from template association_AddOptionalNToOptionalOne */
  public boolean addQ(Qq aQ)
  {
    boolean wasAdded = false;
    if (q.contains(aQ)) { return false; }
    if (q.contains(aQ)) { return false; }
    if (numberOfQ() >= maximumNumberOfQ())
    {
      return wasAdded;
    }

    Ww existingW = aQ.getW();
    if (existingW == null)
    {
      aQ.setW(this);
    }
    else if (!this.equals(existingW))
    {
      existingW.removeQ(aQ);
      addQ(aQ);
    }
    else
    {
      q.add(aQ);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeQ(Qq aQ)
  {
    boolean wasRemoved = false;
    if (q.contains(aQ))
    {
      q.remove(aQ);
      aQ.setW(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addQAt(Qq aQ, int index)
  {  
    boolean wasAdded = false;
    if(addQ(aQ))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfQ()) { index = numberOfQ() - 1; }
      q.remove(aQ);
      q.add(index, aQ);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveQAt(Qq aQ, int index)
  {
    boolean wasAdded = false;
    if(q.contains(aQ))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfQ()) { index = numberOfQ() - 1; }
      q.remove(aQ);
      q.add(index, aQ);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addQAt(aQ, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_IsNumberOfValidMethod_relatedSpecialization */
  public boolean isNumberOfQValid_Qqq()
  {
    boolean isValid = numberOfQ() >= minimumNumberOfQ_Qqq() && numberOfQ() <= maximumNumberOfQ_Qqq();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod_relatedSpecialization */
  public static int requiredNumberOfQ_Qqq()
  {
    return 2;
  }
  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfQ_Qqq()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod_relatedSpecialization */
  public static int maximumNumberOfQ_Qqq()
  {
    return 2;
  }
  /* Code from template association_AddMNToOnlyOne_relatedSpecialization */
  public Qqq addQ()
  {
    if (numberOfQ() >= maximumNumberOfQ_Qqq())
    {
      return null;
    }
    else
    {
      return new Qqq();
    }
  }

  public boolean addQ(Qqq aQ)
  {
    boolean wasAdded = false;
    if (q.contains(aQ)) { return false; }
    if (q.contains(aQ)) { return false; }
    if (numberOfQ() >= maximumNumberOfQ_Qqq())
    {
      return wasAdded;
    }

    Ww existingW = aQ.getW();
    boolean isNewW = existingW != null && !this.equals(existingW);

    if (isNewW && existingW.numberOfQ() <= minimumNumberOfQ_Qqq())
    {
      return wasAdded;
    }

    if (isNewW)
    {
      aQ.setW(this);
    }
    else
    {
      q.add(aQ);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeQ(Qqq aQ)
  {
    boolean wasRemoved = false;
    //Unable to remove aQ, as it must always have a w
    if (this.equals(aQ.getW()))
    {
      return wasRemoved;
    }

    //w already at minimum (2)
    if (numberOfQ() <= minimumNumberOfQ_Qqq())
    {
      return wasRemoved;
    }
    q.remove(aQ);
    wasRemoved = true;
    return wasRemoved;
  }

  public void delete()
  {
    while( !q.isEmpty() )
    {
      q.get(0).setW(null);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [52]
 */
// line 506 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Lp
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Lp Associations
  private List<Pq> pq;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Lp()
  {
    pq = new ArrayList<Pq>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Pq getPq(int index)
  {
    Pq aPq = pq.get(index);
    return aPq;
  }

  public List<Pq> getPq()
  {
    List<Pq> newPq = Collections.unmodifiableList(pq);
    return newPq;
  }

  public int numberOfPq()
  {
    int number = pq.size();
    return number;
  }

  public boolean hasPq()
  {
    boolean has = pq.size() > 0;
    return has;
  }

  public int indexOfPq(Pq aPq)
  {
    int index = pq.indexOf(aPq);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_pq()
  {
    pq.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPq()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addPq(Pq aPq)
  {
    boolean wasAdded = false;
    if (pq.contains(aPq)) { return false; }
    pq.add(aPq);
    if (aPq.indexOfLp(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPq.addLp(this);
      if (!wasAdded)
      {
        pq.remove(aPq);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removePq(Pq aPq)
  {
    boolean wasRemoved = false;
    if (!pq.contains(aPq))
    {
      return wasRemoved;
    }

    int oldIndex = pq.indexOf(aPq);
    pq.remove(oldIndex);
    if (aPq.indexOfLp(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPq.removeLp(this);
      if (!wasRemoved)
      {
        pq.add(oldIndex,aPq);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPqAt(Pq aPq, int index)
  {  
    boolean wasAdded = false;
    if(addPq(aPq))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPq()) { index = numberOfPq() - 1; }
      pq.remove(aPq);
      pq.add(index, aPq);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePqAt(Pq aPq, int index)
  {
    boolean wasAdded = false;
    if(pq.contains(aPq))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPq()) { index = numberOfPq() - 1; }
      pq.remove(aPq);
      pq.add(index, aPq);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPqAt(aPq, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Pq> copyOfPq = new ArrayList<Pq>(pq);
    pq.clear();
    for(Pq aPq : copyOfPq)
    {
      aPq.removeLp(this);
    }
  }

}
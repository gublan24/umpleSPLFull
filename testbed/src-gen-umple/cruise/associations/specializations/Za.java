/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [53]
 */
// line 515 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Za
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Za Associations
  private List<Aq> aq;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Za()
  {
    aq = new ArrayList<Aq>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Aq getAq(int index)
  {
    Aq aAq = aq.get(index);
    return aAq;
  }

  public List<Aq> getAq()
  {
    List<Aq> newAq = Collections.unmodifiableList(aq);
    return newAq;
  }

  public int numberOfAq()
  {
    int number = aq.size();
    return number;
  }

  public boolean hasAq()
  {
    boolean has = aq.size() > 0;
    return has;
  }

  public int indexOfAq(Aq aAq)
  {
    int index = aq.indexOf(aAq);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_aq()
  {
    aq.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAq()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addAq(Aq aAq)
  {
    boolean wasAdded = false;
    if (aq.contains(aAq)) { return false; }
    aq.add(aAq);
    if (aAq.indexOfZa(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAq.addZa(this);
      if (!wasAdded)
      {
        aq.remove(aAq);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeAq(Aq aAq)
  {
    boolean wasRemoved = false;
    if (!aq.contains(aAq))
    {
      return wasRemoved;
    }

    int oldIndex = aq.indexOf(aAq);
    aq.remove(oldIndex);
    if (aAq.indexOfZa(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAq.removeZa(this);
      if (!wasRemoved)
      {
        aq.add(oldIndex,aAq);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAqAt(Aq aAq, int index)
  {  
    boolean wasAdded = false;
    if(addAq(aAq))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAq()) { index = numberOfAq() - 1; }
      aq.remove(aAq);
      aq.add(index, aAq);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAqAt(Aq aAq, int index)
  {
    boolean wasAdded = false;
    if(aq.contains(aAq))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAq()) { index = numberOfAq() - 1; }
      aq.remove(aAq);
      aq.add(index, aAq);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAqAt(aAq, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Aq> copyOfAq = new ArrayList<Aq>(aq);
    aq.clear();
    for(Aq aAq : copyOfAq)
    {
      aAq.removeZa(this);
    }
  }

}
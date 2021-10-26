/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [58]
 */
// line 560 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Fr
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Fr Associations
  private List<Rb> rb;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Fr()
  {
    rb = new ArrayList<Rb>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Rb getRb(int index)
  {
    Rb aRb = rb.get(index);
    return aRb;
  }

  public List<Rb> getRb()
  {
    List<Rb> newRb = Collections.unmodifiableList(rb);
    return newRb;
  }

  public int numberOfRb()
  {
    int number = rb.size();
    return number;
  }

  public boolean hasRb()
  {
    boolean has = rb.size() > 0;
    return has;
  }

  public int indexOfRb(Rb aRb)
  {
    int index = rb.indexOf(aRb);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_rb()
  {
    rb.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRb()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addRb(Rb aRb)
  {
    boolean wasAdded = false;
    if (rb.contains(aRb)) { return false; }
    rb.add(aRb);
    if (aRb.indexOfFr(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aRb.addFr(this);
      if (!wasAdded)
      {
        rb.remove(aRb);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeRb(Rb aRb)
  {
    boolean wasRemoved = false;
    if (!rb.contains(aRb))
    {
      return wasRemoved;
    }

    int oldIndex = rb.indexOf(aRb);
    rb.remove(oldIndex);
    if (aRb.indexOfFr(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aRb.removeFr(this);
      if (!wasRemoved)
      {
        rb.add(oldIndex,aRb);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRbAt(Rb aRb, int index)
  {  
    boolean wasAdded = false;
    if(addRb(aRb))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRb()) { index = numberOfRb() - 1; }
      rb.remove(aRb);
      rb.add(index, aRb);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRbAt(Rb aRb, int index)
  {
    boolean wasAdded = false;
    if(rb.contains(aRb))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRb()) { index = numberOfRb() - 1; }
      rb.remove(aRb);
      rb.add(index, aRb);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRbAt(aRb, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Rb> copyOfRb = new ArrayList<Rb>(rb);
    rb.clear();
    for(Rb aRb : copyOfRb)
    {
      aRb.removeFr(this);
    }
  }

}
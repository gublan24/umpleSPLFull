/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [39]
 */
// line 398 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Nm
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Nm Associations
  private List<Mq> mq;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Nm()
  {
    mq = new ArrayList<Mq>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Mq getMq(int index)
  {
    Mq aMq = mq.get(index);
    return aMq;
  }

  public List<Mq> getMq()
  {
    List<Mq> newMq = Collections.unmodifiableList(mq);
    return newMq;
  }

  public int numberOfMq()
  {
    int number = mq.size();
    return number;
  }

  public boolean hasMq()
  {
    boolean has = mq.size() > 0;
    return has;
  }

  public int indexOfMq(Mq aMq)
  {
    int index = mq.indexOf(aMq);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_mq()
  {
    mq.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMq()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addMq(Mq aMq)
  {
    boolean wasAdded = false;
    if (mq.contains(aMq)) { return false; }
    mq.add(aMq);
    if (aMq.indexOfNm(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aMq.addNm(this);
      if (!wasAdded)
      {
        mq.remove(aMq);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeMq(Mq aMq)
  {
    boolean wasRemoved = false;
    if (!mq.contains(aMq))
    {
      return wasRemoved;
    }

    int oldIndex = mq.indexOf(aMq);
    mq.remove(oldIndex);
    if (aMq.indexOfNm(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aMq.removeNm(this);
      if (!wasRemoved)
      {
        mq.add(oldIndex,aMq);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMqAt(Mq aMq, int index)
  {  
    boolean wasAdded = false;
    if(addMq(aMq))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMq()) { index = numberOfMq() - 1; }
      mq.remove(aMq);
      mq.add(index, aMq);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMqAt(Mq aMq, int index)
  {
    boolean wasAdded = false;
    if(mq.contains(aMq))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMq()) { index = numberOfMq() - 1; }
      mq.remove(aMq);
      mq.add(index, aMq);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMqAt(aMq, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Mq> copyOfMq = new ArrayList<Mq>(mq);
    mq.clear();
    for(Mq aMq : copyOfMq)
    {
      aMq.removeNm(this);
    }
  }

}
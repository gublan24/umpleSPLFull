/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 332 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Pa
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Pa Associations
  private List<Op> op;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Pa()
  {
    op = new ArrayList<Op>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Op getOp(int index)
  {
    Op aOp = op.get(index);
    return aOp;
  }

  public List<Op> getOp()
  {
    List<Op> newOp = Collections.unmodifiableList(op);
    return newOp;
  }

  public int numberOfOp()
  {
    int number = op.size();
    return number;
  }

  public boolean hasOp()
  {
    boolean has = op.size() > 0;
    return has;
  }

  public int indexOfOp(Op aOp)
  {
    int index = op.indexOf(aOp);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_op()
  {
    op.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfOp()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addOp(Op aOp)
  {
    boolean wasAdded = false;
    if (op.contains(aOp)) { return false; }
    op.add(aOp);
    if (aOp.indexOfPa(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aOp.addPa(this);
      if (!wasAdded)
      {
        op.remove(aOp);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeOp(Op aOp)
  {
    boolean wasRemoved = false;
    if (!op.contains(aOp))
    {
      return wasRemoved;
    }

    int oldIndex = op.indexOf(aOp);
    op.remove(oldIndex);
    if (aOp.indexOfPa(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aOp.removePa(this);
      if (!wasRemoved)
      {
        op.add(oldIndex,aOp);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addOpAt(Op aOp, int index)
  {  
    boolean wasAdded = false;
    if(addOp(aOp))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOp()) { index = numberOfOp() - 1; }
      op.remove(aOp);
      op.add(index, aOp);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOpAt(Op aOp, int index)
  {
    boolean wasAdded = false;
    if(op.contains(aOp))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOp()) { index = numberOfOp() - 1; }
      op.remove(aOp);
      op.add(index, aOp);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOpAt(aOp, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Op> copyOfOp = new ArrayList<Op>(op);
    op.clear();
    for(Op aOp : copyOfOp)
    {
      aOp.removePa(this);
    }
  }

}
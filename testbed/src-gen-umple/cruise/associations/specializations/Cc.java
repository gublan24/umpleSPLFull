/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 269 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Cc
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Cc Associations
  private List<Xx> x;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Cc()
  {
    x = new ArrayList<Xx>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Xx getX(int index)
  {
    Xx aX = x.get(index);
    return aX;
  }

  public List<Xx> getX()
  {
    List<Xx> newX = Collections.unmodifiableList(x);
    return newX;
  }

  public int numberOfX()
  {
    int number = x.size();
    return number;
  }

  public boolean hasX()
  {
    boolean has = x.size() > 0;
    return has;
  }

  public int indexOfX(Xx aX)
  {
    int index = x.indexOf(aX);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_x()
  {
    x.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfX()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addX(Xx aX)
  {
    boolean wasAdded = false;
    if (x.contains(aX)) { return false; }
    x.add(aX);
    if (aX.indexOfC(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aX.addC(this);
      if (!wasAdded)
      {
        x.remove(aX);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeX(Xx aX)
  {
    boolean wasRemoved = false;
    if (!x.contains(aX))
    {
      return wasRemoved;
    }

    int oldIndex = x.indexOf(aX);
    x.remove(oldIndex);
    if (aX.indexOfC(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aX.removeC(this);
      if (!wasRemoved)
      {
        x.add(oldIndex,aX);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addXAt(Xx aX, int index)
  {  
    boolean wasAdded = false;
    if(addX(aX))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfX()) { index = numberOfX() - 1; }
      x.remove(aX);
      x.add(index, aX);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveXAt(Xx aX, int index)
  {
    boolean wasAdded = false;
    if(x.contains(aX))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfX()) { index = numberOfX() - 1; }
      x.remove(aX);
      x.add(index, aX);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addXAt(aX, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Xx> copyOfX = new ArrayList<Xx>(x);
    x.clear();
    for(Xx aX : copyOfX)
    {
      aX.removeC(this);
    }
  }

}
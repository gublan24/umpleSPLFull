/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * Optional down to MN and Optional down to Mandatory N           [16]
 */
// line 189 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Tt
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Tt Associations
  private List<Yy> y;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Tt()
  {
    y = new ArrayList<Yy>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Yy getY(int index)
  {
    Yy aY = y.get(index);
    return aY;
  }

  public List<Yy> getY()
  {
    List<Yy> newY = Collections.unmodifiableList(y);
    return newY;
  }

  public int numberOfY()
  {
    int number = y.size();
    return number;
  }

  public boolean hasY()
  {
    boolean has = y.size() > 0;
    return has;
  }

  public int indexOfY(Yy aY)
  {
    int index = y.indexOf(aY);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_y()
  {
    y.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY()
  {
    return 4;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY(Yy aY)
  {
    boolean wasAdded = false;
    if (y.contains(aY)) { return false; }
    if (numberOfY() >= maximumNumberOfY())
    {
      return wasAdded;
    }

    y.add(aY);
    if (aY.indexOfT(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY.addT(this);
      if (!wasAdded)
      {
        y.remove(aY);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeY(Yy aY)
  {
    boolean wasRemoved = false;
    if (!y.contains(aY))
    {
      return wasRemoved;
    }

    int oldIndex = y.indexOf(aY);
    y.remove(oldIndex);
    if (aY.indexOfT(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY.removeT(this);
      if (!wasRemoved)
      {
        y.add(oldIndex,aY);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addYAt(Yy aY, int index)
  {  
    boolean wasAdded = false;
    if(addY(aY))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY()) { index = numberOfY() - 1; }
      y.remove(aY);
      y.add(index, aY);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveYAt(Yy aY, int index)
  {
    boolean wasAdded = false;
    if(y.contains(aY))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY()) { index = numberOfY() - 1; }
      y.remove(aY);
      y.add(index, aY);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addYAt(aY, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Yy> copyOfY = new ArrayList<Yy>(y);
    y.clear();
    for(Yy aY : copyOfY)
    {
      aY.removeT(this);
    }
  }

}
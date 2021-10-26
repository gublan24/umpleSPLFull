/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 190 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Yy
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Yy Associations
  private List<Tt> t;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Yy()
  {
    t = new ArrayList<Tt>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Tt getT(int index)
  {
    Tt aT = t.get(index);
    return aT;
  }

  public List<Tt> getT()
  {
    List<Tt> newT = Collections.unmodifiableList(t);
    return newT;
  }

  public int numberOfT()
  {
    int number = t.size();
    return number;
  }

  public boolean hasT()
  {
    boolean has = t.size() > 0;
    return has;
  }

  public int indexOfT(Tt aT)
  {
    int index = t.indexOf(aT);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_t()
  {
    t.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfT()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfT()
  {
    return 5;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addT(Tt aT)
  {
    boolean wasAdded = false;
    if (t.contains(aT)) { return false; }
    if (numberOfT() >= maximumNumberOfT())
    {
      return wasAdded;
    }

    t.add(aT);
    if (aT.indexOfY(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aT.addY(this);
      if (!wasAdded)
      {
        t.remove(aT);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeT(Tt aT)
  {
    boolean wasRemoved = false;
    if (!t.contains(aT))
    {
      return wasRemoved;
    }

    int oldIndex = t.indexOf(aT);
    t.remove(oldIndex);
    if (aT.indexOfY(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aT.removeY(this);
      if (!wasRemoved)
      {
        t.add(oldIndex,aT);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTAt(Tt aT, int index)
  {  
    boolean wasAdded = false;
    if(addT(aT))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfT()) { index = numberOfT() - 1; }
      t.remove(aT);
      t.add(index, aT);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTAt(Tt aT, int index)
  {
    boolean wasAdded = false;
    if(t.contains(aT))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfT()) { index = numberOfT() - 1; }
      t.remove(aT);
      t.add(index, aT);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTAt(aT, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Tt> copyOfT = new ArrayList<Tt>(t);
    t.clear();
    for(Tt aT : copyOfT)
    {
      aT.removeY(this);
    }
  }

}
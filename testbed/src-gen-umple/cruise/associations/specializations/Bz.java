/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 150 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Bz
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Bz Associations
  private List<Az> a;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Bz()
  {
    a = new ArrayList<Az>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Az getA(int index)
  {
    Az aA = a.get(index);
    return aA;
  }

  public List<Az> getA()
  {
    List<Az> newA = Collections.unmodifiableList(a);
    return newA;
  }

  public int numberOfA()
  {
    int number = a.size();
    return number;
  }

  public boolean hasA()
  {
    boolean has = a.size() > 0;
    return has;
  }

  public int indexOfA(Az aA)
  {
    int index = a.indexOf(aA);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_a()
  {
    a.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfA()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addA(Az aA)
  {
    boolean wasAdded = false;
    if (a.contains(aA)) { return false; }
    a.add(aA);
    if (aA.indexOfB(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aA.addB(this);
      if (!wasAdded)
      {
        a.remove(aA);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeA(Az aA)
  {
    boolean wasRemoved = false;
    if (!a.contains(aA))
    {
      return wasRemoved;
    }

    int oldIndex = a.indexOf(aA);
    a.remove(oldIndex);
    if (aA.indexOfB(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aA.removeB(this);
      if (!wasRemoved)
      {
        a.add(oldIndex,aA);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAAt(Az aA, int index)
  {  
    boolean wasAdded = false;
    if(addA(aA))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfA()) { index = numberOfA() - 1; }
      a.remove(aA);
      a.add(index, aA);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAAt(Az aA, int index)
  {
    boolean wasAdded = false;
    if(a.contains(aA))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfA()) { index = numberOfA() - 1; }
      a.remove(aA);
      a.add(index, aA);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAAt(aA, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Az> copyOfA = new ArrayList<Az>(a);
    a.clear();
    for(Az aA : copyOfA)
    {
      aA.removeB(this);
    }
  }

}
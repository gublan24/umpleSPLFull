/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [25]
 */
// line 277 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Vv
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vv Associations
  private List<Bb> b;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vv()
  {
    b = new ArrayList<Bb>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Bb getB(int index)
  {
    Bb aB = b.get(index);
    return aB;
  }

  public List<Bb> getB()
  {
    List<Bb> newB = Collections.unmodifiableList(b);
    return newB;
  }

  public int numberOfB()
  {
    int number = b.size();
    return number;
  }

  public boolean hasB()
  {
    boolean has = b.size() > 0;
    return has;
  }

  public int indexOfB(Bb aB)
  {
    int index = b.indexOf(aB);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_b()
  {
    b.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfB()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addB(Bb aB)
  {
    boolean wasAdded = false;
    if (b.contains(aB)) { return false; }
    b.add(aB);
    if (aB.indexOfV(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aB.addV(this);
      if (!wasAdded)
      {
        b.remove(aB);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeB(Bb aB)
  {
    boolean wasRemoved = false;
    if (!b.contains(aB))
    {
      return wasRemoved;
    }

    int oldIndex = b.indexOf(aB);
    b.remove(oldIndex);
    if (aB.indexOfV(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aB.removeV(this);
      if (!wasRemoved)
      {
        b.add(oldIndex,aB);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBAt(Bb aB, int index)
  {  
    boolean wasAdded = false;
    if(addB(aB))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfB()) { index = numberOfB() - 1; }
      b.remove(aB);
      b.add(index, aB);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBAt(Bb aB, int index)
  {
    boolean wasAdded = false;
    if(b.contains(aB))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfB()) { index = numberOfB() - 1; }
      b.remove(aB);
      b.add(index, aB);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBAt(aB, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Bb> copyOfB = new ArrayList<Bb>(b);
    b.clear();
    for(Bb aB : copyOfB)
    {
      aB.removeV(this);
    }
  }

}
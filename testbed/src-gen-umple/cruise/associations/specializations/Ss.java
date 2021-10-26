/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 220 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ss
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ss Associations
  private List<Aa> a;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ss()
  {
    a = new ArrayList<Aa>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Aa getA(int index)
  {
    Aa aA = a.get(index);
    return aA;
  }

  public List<Aa> getA()
  {
    List<Aa> newA = Collections.unmodifiableList(a);
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

  public int indexOfA(Aa aA)
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
  public boolean addA(Aa aA)
  {
    boolean wasAdded = false;
    if (a.contains(aA)) { return false; }
    a.add(aA);
    if (aA.indexOfS(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aA.addS(this);
      if (!wasAdded)
      {
        a.remove(aA);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeA(Aa aA)
  {
    boolean wasRemoved = false;
    if (!a.contains(aA))
    {
      return wasRemoved;
    }

    int oldIndex = a.indexOf(aA);
    a.remove(oldIndex);
    if (aA.indexOfS(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aA.removeS(this);
      if (!wasRemoved)
      {
        a.add(oldIndex,aA);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAAt(Aa aA, int index)
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

  public boolean addOrMoveAAt(Aa aA, int index)
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
    ArrayList<Aa> copyOfA = new ArrayList<Aa>(a);
    a.clear();
    for(Aa aA : copyOfA)
    {
      aA.removeS(this);
    }
  }

}
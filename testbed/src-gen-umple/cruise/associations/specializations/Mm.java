/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [26]
 */
// line 286 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Mm
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Mm Associations
  private List<Nn> n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Mm()
  {
    n = new ArrayList<Nn>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Nn getN(int index)
  {
    Nn aN = n.get(index);
    return aN;
  }

  public List<Nn> getN()
  {
    List<Nn> newN = Collections.unmodifiableList(n);
    return newN;
  }

  public int numberOfN()
  {
    int number = n.size();
    return number;
  }

  public boolean hasN()
  {
    boolean has = n.size() > 0;
    return has;
  }

  public int indexOfN(Nn aN)
  {
    int index = n.indexOf(aN);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_n()
  {
    n.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfN()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addN(Nn aN)
  {
    boolean wasAdded = false;
    if (n.contains(aN)) { return false; }
    n.add(aN);
    if (aN.indexOfM(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aN.addM(this);
      if (!wasAdded)
      {
        n.remove(aN);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeN(Nn aN)
  {
    boolean wasRemoved = false;
    if (!n.contains(aN))
    {
      return wasRemoved;
    }

    int oldIndex = n.indexOf(aN);
    n.remove(oldIndex);
    if (aN.indexOfM(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aN.removeM(this);
      if (!wasRemoved)
      {
        n.add(oldIndex,aN);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addNAt(Nn aN, int index)
  {  
    boolean wasAdded = false;
    if(addN(aN))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfN()) { index = numberOfN() - 1; }
      n.remove(aN);
      n.add(index, aN);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveNAt(Nn aN, int index)
  {
    boolean wasAdded = false;
    if(n.contains(aN))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfN()) { index = numberOfN() - 1; }
      n.remove(aN);
      n.add(index, aN);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addNAt(aN, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Nn> copyOfN = new ArrayList<Nn>(n);
    n.clear();
    for(Nn aN : copyOfN)
    {
      aN.removeM(this);
    }
  }

}
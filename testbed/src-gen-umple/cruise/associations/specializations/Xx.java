/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [24]
 */
// line 268 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Xx
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xx Associations
  private List<Cc> c;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xx()
  {
    c = new ArrayList<Cc>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Cc getC(int index)
  {
    Cc aC = c.get(index);
    return aC;
  }

  public List<Cc> getC()
  {
    List<Cc> newC = Collections.unmodifiableList(c);
    return newC;
  }

  public int numberOfC()
  {
    int number = c.size();
    return number;
  }

  public boolean hasC()
  {
    boolean has = c.size() > 0;
    return has;
  }

  public int indexOfC(Cc aC)
  {
    int index = c.indexOf(aC);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_c()
  {
    c.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfC()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addC(Cc aC)
  {
    boolean wasAdded = false;
    if (c.contains(aC)) { return false; }
    c.add(aC);
    if (aC.indexOfX(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aC.addX(this);
      if (!wasAdded)
      {
        c.remove(aC);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeC(Cc aC)
  {
    boolean wasRemoved = false;
    if (!c.contains(aC))
    {
      return wasRemoved;
    }

    int oldIndex = c.indexOf(aC);
    c.remove(oldIndex);
    if (aC.indexOfX(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aC.removeX(this);
      if (!wasRemoved)
      {
        c.add(oldIndex,aC);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCAt(Cc aC, int index)
  {  
    boolean wasAdded = false;
    if(addC(aC))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfC()) { index = numberOfC() - 1; }
      c.remove(aC);
      c.add(index, aC);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCAt(Cc aC, int index)
  {
    boolean wasAdded = false;
    if(c.contains(aC))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfC()) { index = numberOfC() - 1; }
      c.remove(aC);
      c.add(index, aC);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCAt(aC, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Cc> copyOfC = new ArrayList<Cc>(c);
    c.clear();
    for(Cc aC : copyOfC)
    {
      aC.removeX(this);
    }
  }

}
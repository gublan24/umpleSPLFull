/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [20]
 */
// line 229 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Dd
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Dd Associations
  private List<Ff> f;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Dd()
  {
    f = new ArrayList<Ff>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ff getF(int index)
  {
    Ff aF = f.get(index);
    return aF;
  }

  public List<Ff> getF()
  {
    List<Ff> newF = Collections.unmodifiableList(f);
    return newF;
  }

  public int numberOfF()
  {
    int number = f.size();
    return number;
  }

  public boolean hasF()
  {
    boolean has = f.size() > 0;
    return has;
  }

  public int indexOfF(Ff aF)
  {
    int index = f.indexOf(aF);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_f()
  {
    f.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfF()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addF(Ff aF)
  {
    boolean wasAdded = false;
    if (f.contains(aF)) { return false; }
    f.add(aF);
    if (aF.indexOfD(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aF.addD(this);
      if (!wasAdded)
      {
        f.remove(aF);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeF(Ff aF)
  {
    boolean wasRemoved = false;
    if (!f.contains(aF))
    {
      return wasRemoved;
    }

    int oldIndex = f.indexOf(aF);
    f.remove(oldIndex);
    if (aF.indexOfD(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aF.removeD(this);
      if (!wasRemoved)
      {
        f.add(oldIndex,aF);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFAt(Ff aF, int index)
  {  
    boolean wasAdded = false;
    if(addF(aF))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfF()) { index = numberOfF() - 1; }
      f.remove(aF);
      f.add(index, aF);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFAt(Ff aF, int index)
  {
    boolean wasAdded = false;
    if(f.contains(aF))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfF()) { index = numberOfF() - 1; }
      f.remove(aF);
      f.add(index, aF);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFAt(aF, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Ff> copyOfF = new ArrayList<Ff>(f);
    f.clear();
    for(Ff aF : copyOfF)
    {
      aF.removeD(this);
    }
  }

}
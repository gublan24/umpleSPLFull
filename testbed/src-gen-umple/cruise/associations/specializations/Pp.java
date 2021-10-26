/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 210 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Pp
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Pp Associations
  private List<Oo> o;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Pp()
  {
    o = new ArrayList<Oo>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Oo getO(int index)
  {
    Oo aO = o.get(index);
    return aO;
  }

  public List<Oo> getO()
  {
    List<Oo> newO = Collections.unmodifiableList(o);
    return newO;
  }

  public int numberOfO()
  {
    int number = o.size();
    return number;
  }

  public boolean hasO()
  {
    boolean has = o.size() > 0;
    return has;
  }

  public int indexOfO(Oo aO)
  {
    int index = o.indexOf(aO);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_o()
  {
    o.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfO()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addO(Oo aO)
  {
    boolean wasAdded = false;
    if (o.contains(aO)) { return false; }
    o.add(aO);
    if (aO.indexOfP(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aO.addP(this);
      if (!wasAdded)
      {
        o.remove(aO);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeO(Oo aO)
  {
    boolean wasRemoved = false;
    if (!o.contains(aO))
    {
      return wasRemoved;
    }

    int oldIndex = o.indexOf(aO);
    o.remove(oldIndex);
    if (aO.indexOfP(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aO.removeP(this);
      if (!wasRemoved)
      {
        o.add(oldIndex,aO);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addOAt(Oo aO, int index)
  {  
    boolean wasAdded = false;
    if(addO(aO))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfO()) { index = numberOfO() - 1; }
      o.remove(aO);
      o.add(index, aO);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOAt(Oo aO, int index)
  {
    boolean wasAdded = false;
    if(o.contains(aO))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfO()) { index = numberOfO() - 1; }
      o.remove(aO);
      o.add(index, aO);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOAt(aO, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Oo> copyOfO = new ArrayList<Oo>(o);
    o.clear();
    for(Oo aO : copyOfO)
    {
      if (aO.numberOfP() <= Oo.minimumNumberOfP())
      {
        aO.delete();
      }
      else
      {
        aO.removeP(this);
      }
    }
  }

}
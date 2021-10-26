/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 200 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ii
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ii Associations
  private List<Uu> u;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ii()
  {
    u = new ArrayList<Uu>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Uu getU(int index)
  {
    Uu aU = u.get(index);
    return aU;
  }

  public List<Uu> getU()
  {
    List<Uu> newU = Collections.unmodifiableList(u);
    return newU;
  }

  public int numberOfU()
  {
    int number = u.size();
    return number;
  }

  public boolean hasU()
  {
    boolean has = u.size() > 0;
    return has;
  }

  public int indexOfU(Uu aU)
  {
    int index = u.indexOf(aU);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_u()
  {
    u.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfU()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfU()
  {
    return 5;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addU(Uu aU)
  {
    boolean wasAdded = false;
    if (u.contains(aU)) { return false; }
    if (numberOfU() >= maximumNumberOfU())
    {
      return wasAdded;
    }

    u.add(aU);
    if (aU.indexOfI(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aU.addI(this);
      if (!wasAdded)
      {
        u.remove(aU);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeU(Uu aU)
  {
    boolean wasRemoved = false;
    if (!u.contains(aU))
    {
      return wasRemoved;
    }

    int oldIndex = u.indexOf(aU);
    u.remove(oldIndex);
    if (aU.indexOfI(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aU.removeI(this);
      if (!wasRemoved)
      {
        u.add(oldIndex,aU);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUAt(Uu aU, int index)
  {  
    boolean wasAdded = false;
    if(addU(aU))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfU()) { index = numberOfU() - 1; }
      u.remove(aU);
      u.add(index, aU);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUAt(Uu aU, int index)
  {
    boolean wasAdded = false;
    if(u.contains(aU))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfU()) { index = numberOfU() - 1; }
      u.remove(aU);
      u.add(index, aU);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUAt(aU, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Uu> copyOfU = new ArrayList<Uu>(u);
    u.clear();
    for(Uu aU : copyOfU)
    {
      aU.removeI(this);
    }
  }

}
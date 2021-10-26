/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 230 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ff
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ff Associations
  private List<Dd> d;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ff()
  {
    d = new ArrayList<Dd>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Dd getD(int index)
  {
    Dd aD = d.get(index);
    return aD;
  }

  public List<Dd> getD()
  {
    List<Dd> newD = Collections.unmodifiableList(d);
    return newD;
  }

  public int numberOfD()
  {
    int number = d.size();
    return number;
  }

  public boolean hasD()
  {
    boolean has = d.size() > 0;
    return has;
  }

  public int indexOfD(Dd aD)
  {
    int index = d.indexOf(aD);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_d()
  {
    d.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfD()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addD(Dd aD)
  {
    boolean wasAdded = false;
    if (d.contains(aD)) { return false; }
    d.add(aD);
    if (aD.indexOfF(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aD.addF(this);
      if (!wasAdded)
      {
        d.remove(aD);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeD(Dd aD)
  {
    boolean wasRemoved = false;
    if (!d.contains(aD))
    {
      return wasRemoved;
    }

    int oldIndex = d.indexOf(aD);
    d.remove(oldIndex);
    if (aD.indexOfF(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aD.removeF(this);
      if (!wasRemoved)
      {
        d.add(oldIndex,aD);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDAt(Dd aD, int index)
  {  
    boolean wasAdded = false;
    if(addD(aD))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfD()) { index = numberOfD() - 1; }
      d.remove(aD);
      d.add(index, aD);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDAt(Dd aD, int index)
  {
    boolean wasAdded = false;
    if(d.contains(aD))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfD()) { index = numberOfD() - 1; }
      d.remove(aD);
      d.add(index, aD);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDAt(aD, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Dd> copyOfD = new ArrayList<Dd>(d);
    d.clear();
    for(Dd aD : copyOfD)
    {
      aD.removeF(this);
    }
  }

}
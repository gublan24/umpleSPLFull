/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 516 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Aq
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Aq Associations
  private List<Za> za;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Aq()
  {
    za = new ArrayList<Za>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Za getZa(int index)
  {
    Za aZa = za.get(index);
    return aZa;
  }

  public List<Za> getZa()
  {
    List<Za> newZa = Collections.unmodifiableList(za);
    return newZa;
  }

  public int numberOfZa()
  {
    int number = za.size();
    return number;
  }

  public boolean hasZa()
  {
    boolean has = za.size() > 0;
    return has;
  }

  public int indexOfZa(Za aZa)
  {
    int index = za.indexOf(aZa);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_za()
  {
    za.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfZa()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addZa(Za aZa)
  {
    boolean wasAdded = false;
    if (za.contains(aZa)) { return false; }
    za.add(aZa);
    if (aZa.indexOfAq(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aZa.addAq(this);
      if (!wasAdded)
      {
        za.remove(aZa);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeZa(Za aZa)
  {
    boolean wasRemoved = false;
    if (!za.contains(aZa))
    {
      return wasRemoved;
    }

    int oldIndex = za.indexOf(aZa);
    za.remove(oldIndex);
    if (aZa.indexOfAq(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aZa.removeAq(this);
      if (!wasRemoved)
      {
        za.add(oldIndex,aZa);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addZaAt(Za aZa, int index)
  {  
    boolean wasAdded = false;
    if(addZa(aZa))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfZa()) { index = numberOfZa() - 1; }
      za.remove(aZa);
      za.add(index, aZa);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveZaAt(Za aZa, int index)
  {
    boolean wasAdded = false;
    if(za.contains(aZa))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfZa()) { index = numberOfZa() - 1; }
      za.remove(aZa);
      za.add(index, aZa);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addZaAt(aZa, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Za> copyOfZa = new ArrayList<Za>(za);
    za.clear();
    for(Za aZa : copyOfZa)
    {
      aZa.removeAq(this);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 498 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ol
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ol Associations
  private List<Ko> ko;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ol()
  {
    ko = new ArrayList<Ko>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ko getKo(int index)
  {
    Ko aKo = ko.get(index);
    return aKo;
  }

  public List<Ko> getKo()
  {
    List<Ko> newKo = Collections.unmodifiableList(ko);
    return newKo;
  }

  public int numberOfKo()
  {
    int number = ko.size();
    return number;
  }

  public boolean hasKo()
  {
    boolean has = ko.size() > 0;
    return has;
  }

  public int indexOfKo(Ko aKo)
  {
    int index = ko.indexOf(aKo);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_ko()
  {
    ko.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfKo()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addKo(Ko aKo)
  {
    boolean wasAdded = false;
    if (ko.contains(aKo)) { return false; }
    ko.add(aKo);
    if (aKo.indexOfOl(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aKo.addOl(this);
      if (!wasAdded)
      {
        ko.remove(aKo);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeKo(Ko aKo)
  {
    boolean wasRemoved = false;
    if (!ko.contains(aKo))
    {
      return wasRemoved;
    }

    int oldIndex = ko.indexOf(aKo);
    ko.remove(oldIndex);
    if (aKo.indexOfOl(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aKo.removeOl(this);
      if (!wasRemoved)
      {
        ko.add(oldIndex,aKo);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addKoAt(Ko aKo, int index)
  {  
    boolean wasAdded = false;
    if(addKo(aKo))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfKo()) { index = numberOfKo() - 1; }
      ko.remove(aKo);
      ko.add(index, aKo);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveKoAt(Ko aKo, int index)
  {
    boolean wasAdded = false;
    if(ko.contains(aKo))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfKo()) { index = numberOfKo() - 1; }
      ko.remove(aKo);
      ko.add(index, aKo);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addKoAt(aKo, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Ko> copyOfKo = new ArrayList<Ko>(ko);
    ko.clear();
    for(Ko aKo : copyOfKo)
    {
      aKo.removeOl(this);
    }
  }

}
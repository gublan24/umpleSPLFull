/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [56]
 */
// line 542 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Cd
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Cd Associations
  private List<De> de;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Cd()
  {
    de = new ArrayList<De>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public De getDe(int index)
  {
    De aDe = de.get(index);
    return aDe;
  }

  public List<De> getDe()
  {
    List<De> newDe = Collections.unmodifiableList(de);
    return newDe;
  }

  public int numberOfDe()
  {
    int number = de.size();
    return number;
  }

  public boolean hasDe()
  {
    boolean has = de.size() > 0;
    return has;
  }

  public int indexOfDe(De aDe)
  {
    int index = de.indexOf(aDe);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_de()
  {
    de.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDe()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDe(De aDe)
  {
    boolean wasAdded = false;
    if (de.contains(aDe)) { return false; }
    de.add(aDe);
    if (aDe.indexOfCd(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDe.addCd(this);
      if (!wasAdded)
      {
        de.remove(aDe);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDe(De aDe)
  {
    boolean wasRemoved = false;
    if (!de.contains(aDe))
    {
      return wasRemoved;
    }

    int oldIndex = de.indexOf(aDe);
    de.remove(oldIndex);
    if (aDe.indexOfCd(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDe.removeCd(this);
      if (!wasRemoved)
      {
        de.add(oldIndex,aDe);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDeAt(De aDe, int index)
  {  
    boolean wasAdded = false;
    if(addDe(aDe))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDe()) { index = numberOfDe() - 1; }
      de.remove(aDe);
      de.add(index, aDe);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDeAt(De aDe, int index)
  {
    boolean wasAdded = false;
    if(de.contains(aDe))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDe()) { index = numberOfDe() - 1; }
      de.remove(aDe);
      de.add(index, aDe);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDeAt(aDe, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<De> copyOfDe = new ArrayList<De>(de);
    de.clear();
    for(De aDe : copyOfDe)
    {
      aDe.removeCd(this);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 543 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class De
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //De Associations
  private List<Cd> cd;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public De()
  {
    cd = new ArrayList<Cd>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Cd getCd(int index)
  {
    Cd aCd = cd.get(index);
    return aCd;
  }

  public List<Cd> getCd()
  {
    List<Cd> newCd = Collections.unmodifiableList(cd);
    return newCd;
  }

  public int numberOfCd()
  {
    int number = cd.size();
    return number;
  }

  public boolean hasCd()
  {
    boolean has = cd.size() > 0;
    return has;
  }

  public int indexOfCd(Cd aCd)
  {
    int index = cd.indexOf(aCd);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_cd()
  {
    cd.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCd()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCd(Cd aCd)
  {
    boolean wasAdded = false;
    if (cd.contains(aCd)) { return false; }
    cd.add(aCd);
    if (aCd.indexOfDe(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCd.addDe(this);
      if (!wasAdded)
      {
        cd.remove(aCd);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeCd(Cd aCd)
  {
    boolean wasRemoved = false;
    if (!cd.contains(aCd))
    {
      return wasRemoved;
    }

    int oldIndex = cd.indexOf(aCd);
    cd.remove(oldIndex);
    if (aCd.indexOfDe(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCd.removeDe(this);
      if (!wasRemoved)
      {
        cd.add(oldIndex,aCd);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCdAt(Cd aCd, int index)
  {  
    boolean wasAdded = false;
    if(addCd(aCd))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCd()) { index = numberOfCd() - 1; }
      cd.remove(aCd);
      cd.add(index, aCd);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCdAt(Cd aCd, int index)
  {
    boolean wasAdded = false;
    if(cd.contains(aCd))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCd()) { index = numberOfCd() - 1; }
      cd.remove(aCd);
      cd.add(index, aCd);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCdAt(aCd, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Cd> copyOfCd = new ArrayList<Cd>(cd);
    cd.clear();
    for(Cd aCd : copyOfCd)
    {
      aCd.removeDe(this);
    }
  }

}
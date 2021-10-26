/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [48]
 */
// line 473 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Hn
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Hn Associations
  private List<Nu> nu;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Hn()
  {
    nu = new ArrayList<Nu>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Nu getNu(int index)
  {
    Nu aNu = nu.get(index);
    return aNu;
  }

  public List<Nu> getNu()
  {
    List<Nu> newNu = Collections.unmodifiableList(nu);
    return newNu;
  }

  public int numberOfNu()
  {
    int number = nu.size();
    return number;
  }

  public boolean hasNu()
  {
    boolean has = nu.size() > 0;
    return has;
  }

  public int indexOfNu(Nu aNu)
  {
    int index = nu.indexOf(aNu);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_nu()
  {
    nu.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfNu()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addNu(Nu aNu)
  {
    boolean wasAdded = false;
    if (nu.contains(aNu)) { return false; }
    nu.add(aNu);
    if (aNu.indexOfHn(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aNu.addHn(this);
      if (!wasAdded)
      {
        nu.remove(aNu);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeNu(Nu aNu)
  {
    boolean wasRemoved = false;
    if (!nu.contains(aNu))
    {
      return wasRemoved;
    }

    int oldIndex = nu.indexOf(aNu);
    nu.remove(oldIndex);
    if (aNu.indexOfHn(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aNu.removeHn(this);
      if (!wasRemoved)
      {
        nu.add(oldIndex,aNu);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addNuAt(Nu aNu, int index)
  {  
    boolean wasAdded = false;
    if(addNu(aNu))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNu()) { index = numberOfNu() - 1; }
      nu.remove(aNu);
      nu.add(index, aNu);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveNuAt(Nu aNu, int index)
  {
    boolean wasAdded = false;
    if(nu.contains(aNu))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNu()) { index = numberOfNu() - 1; }
      nu.remove(aNu);
      nu.add(index, aNu);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addNuAt(aNu, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Nu> copyOfNu = new ArrayList<Nu>(nu);
    nu.clear();
    for(Nu aNu : copyOfNu)
    {
      aNu.removeHn(this);
    }
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [40]
 */
// line 406 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Qa
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Qa Associations
  private List<Az> az;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Qa()
  {
    az = new ArrayList<Az>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Az getAz(int index)
  {
    Az aAz = az.get(index);
    return aAz;
  }

  public List<Az> getAz()
  {
    List<Az> newAz = Collections.unmodifiableList(az);
    return newAz;
  }

  public int numberOfAz()
  {
    int number = az.size();
    return number;
  }

  public boolean hasAz()
  {
    boolean has = az.size() > 0;
    return has;
  }

  public int indexOfAz(Az aAz)
  {
    int index = az.indexOf(aAz);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_az()
  {
    az.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAz()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addAz(Az aAz)
  {
    boolean wasAdded = false;
    if (az.contains(aAz)) { return false; }
    az.add(aAz);
    if (aAz.indexOfQa(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAz.addQa(this);
      if (!wasAdded)
      {
        az.remove(aAz);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeAz(Az aAz)
  {
    boolean wasRemoved = false;
    if (!az.contains(aAz))
    {
      return wasRemoved;
    }

    int oldIndex = az.indexOf(aAz);
    az.remove(oldIndex);
    if (aAz.indexOfQa(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAz.removeQa(this);
      if (!wasRemoved)
      {
        az.add(oldIndex,aAz);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAzAt(Az aAz, int index)
  {  
    boolean wasAdded = false;
    if(addAz(aAz))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAz()) { index = numberOfAz() - 1; }
      az.remove(aAz);
      az.add(index, aAz);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAzAt(Az aAz, int index)
  {
    boolean wasAdded = false;
    if(az.contains(aAz))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAz()) { index = numberOfAz() - 1; }
      az.remove(aAz);
      az.add(index, aAz);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAzAt(aAz, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Az> copyOfAz = new ArrayList<Az>(az);
    az.clear();
    for(Az aAz : copyOfAz)
    {
      aAz.removeQa(this);
    }
  }

}
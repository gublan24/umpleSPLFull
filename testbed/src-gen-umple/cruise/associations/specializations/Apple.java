/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 39 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Apple
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Apple Associations
  private List<Spatula> spat;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Apple()
  {
    spat = new ArrayList<Spatula>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Spatula getSpat(int index)
  {
    Spatula aSpat = spat.get(index);
    return aSpat;
  }

  public List<Spatula> getSpat()
  {
    List<Spatula> newSpat = Collections.unmodifiableList(spat);
    return newSpat;
  }

  public int numberOfSpat()
  {
    int number = spat.size();
    return number;
  }

  public boolean hasSpat()
  {
    boolean has = spat.size() > 0;
    return has;
  }

  public int indexOfSpat(Spatula aSpat)
  {
    int index = spat.indexOf(aSpat);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_spat()
  {
    spat.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSpat()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfSpat()
  {
    return 2;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSpat(Spatula aSpat)
  {
    boolean wasAdded = false;
    if (spat.contains(aSpat)) { return false; }
    if (numberOfSpat() >= maximumNumberOfSpat())
    {
      return wasAdded;
    }

    spat.add(aSpat);
    if (aSpat.indexOfFruit(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSpat.addFruit(this);
      if (!wasAdded)
      {
        spat.remove(aSpat);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSpat(Spatula aSpat)
  {
    boolean wasRemoved = false;
    if (!spat.contains(aSpat))
    {
      return wasRemoved;
    }

    int oldIndex = spat.indexOf(aSpat);
    spat.remove(oldIndex);
    if (aSpat.indexOfFruit(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSpat.removeFruit(this);
      if (!wasRemoved)
      {
        spat.add(oldIndex,aSpat);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSpatAt(Spatula aSpat, int index)
  {  
    boolean wasAdded = false;
    if(addSpat(aSpat))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSpat()) { index = numberOfSpat() - 1; }
      spat.remove(aSpat);
      spat.add(index, aSpat);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSpatAt(Spatula aSpat, int index)
  {
    boolean wasAdded = false;
    if(spat.contains(aSpat))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSpat()) { index = numberOfSpat() - 1; }
      spat.remove(aSpat);
      spat.add(index, aSpat);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSpatAt(aSpat, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Spatula> copyOfSpat = new ArrayList<Spatula>(spat);
    spat.clear();
    for(Spatula aSpat : copyOfSpat)
    {
      if (aSpat.numberOfFruit() <= Spatula.minimumNumberOfFruit())
      {
        aSpat.delete();
      }
      else
      {
        aSpat.removeFruit(this);
      }
    }
  }

}
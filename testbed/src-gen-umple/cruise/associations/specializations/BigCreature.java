/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 84 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class BigCreature
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BigCreature Associations
  private List<Fat> fat;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BigCreature()
  {
    fat = new ArrayList<Fat>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Fat getFat(int index)
  {
    Fat aFat = fat.get(index);
    return aFat;
  }

  public List<Fat> getFat()
  {
    List<Fat> newFat = Collections.unmodifiableList(fat);
    return newFat;
  }

  public int numberOfFat()
  {
    int number = fat.size();
    return number;
  }

  public boolean hasFat()
  {
    boolean has = fat.size() > 0;
    return has;
  }

  public int indexOfFat(Fat aFat)
  {
    int index = fat.indexOf(aFat);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_fat()
  {
    fat.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFat()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addFat(Fat aFat)
  {
    boolean wasAdded = false;
    if (fat.contains(aFat)) { return false; }
    fat.add(aFat);
    if (aFat.indexOfBig(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aFat.addBig(this);
      if (!wasAdded)
      {
        fat.remove(aFat);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeFat(Fat aFat)
  {
    boolean wasRemoved = false;
    if (!fat.contains(aFat))
    {
      return wasRemoved;
    }

    int oldIndex = fat.indexOf(aFat);
    fat.remove(oldIndex);
    if (aFat.indexOfBig(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aFat.removeBig(this);
      if (!wasRemoved)
      {
        fat.add(oldIndex,aFat);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFatAt(Fat aFat, int index)
  {  
    boolean wasAdded = false;
    if(addFat(aFat))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFat()) { index = numberOfFat() - 1; }
      fat.remove(aFat);
      fat.add(index, aFat);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFatAt(Fat aFat, int index)
  {
    boolean wasAdded = false;
    if(fat.contains(aFat))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFat()) { index = numberOfFat() - 1; }
      fat.remove(aFat);
      fat.add(index, aFat);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFatAt(aFat, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Fat> copyOfFat = new ArrayList<Fat>(fat);
    fat.clear();
    for(Fat aFat : copyOfFat)
    {
      aFat.removeBig(this);
    }
  }

}
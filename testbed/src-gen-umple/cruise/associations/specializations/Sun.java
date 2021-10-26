/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * Both multiplicities changed to one -- both subclasses          [3]
 */
// line 48 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Sun
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Sun Associations
  private List<Moon> moon;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Sun()
  {
    moon = new ArrayList<Moon>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Moon getMoon(int index)
  {
    Moon aMoon = moon.get(index);
    return aMoon;
  }

  public List<Moon> getMoon()
  {
    List<Moon> newMoon = Collections.unmodifiableList(moon);
    return newMoon;
  }

  public int numberOfMoon()
  {
    int number = moon.size();
    return number;
  }

  public boolean hasMoon()
  {
    boolean has = moon.size() > 0;
    return has;
  }

  public int indexOfMoon(Moon aMoon)
  {
    int index = moon.indexOf(aMoon);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_moon()
  {
    moon.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMoon()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfMoon()
  {
    return 4;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addMoon(Moon aMoon)
  {
    boolean wasAdded = false;
    if (moon.contains(aMoon)) { return false; }
    if (numberOfMoon() >= maximumNumberOfMoon())
    {
      return wasAdded;
    }

    moon.add(aMoon);
    if (aMoon.indexOfSun(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aMoon.addSun(this);
      if (!wasAdded)
      {
        moon.remove(aMoon);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeMoon(Moon aMoon)
  {
    boolean wasRemoved = false;
    if (!moon.contains(aMoon))
    {
      return wasRemoved;
    }

    int oldIndex = moon.indexOf(aMoon);
    moon.remove(oldIndex);
    if (aMoon.indexOfSun(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aMoon.removeSun(this);
      if (!wasRemoved)
      {
        moon.add(oldIndex,aMoon);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMoonAt(Moon aMoon, int index)
  {  
    boolean wasAdded = false;
    if(addMoon(aMoon))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMoon()) { index = numberOfMoon() - 1; }
      moon.remove(aMoon);
      moon.add(index, aMoon);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMoonAt(Moon aMoon, int index)
  {
    boolean wasAdded = false;
    if(moon.contains(aMoon))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMoon()) { index = numberOfMoon() - 1; }
      moon.remove(aMoon);
      moon.add(index, aMoon);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMoonAt(aMoon, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Moon> copyOfMoon = new ArrayList<Moon>(moon);
    moon.clear();
    for(Moon aMoon : copyOfMoon)
    {
      aMoon.removeSun(this);
    }
  }

}
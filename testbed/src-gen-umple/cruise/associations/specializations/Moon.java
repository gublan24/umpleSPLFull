/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 49 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Moon
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Moon Associations
  private List<Sun> sun;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Moon()
  {
    sun = new ArrayList<Sun>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Sun getSun(int index)
  {
    Sun aSun = sun.get(index);
    return aSun;
  }

  public List<Sun> getSun()
  {
    List<Sun> newSun = Collections.unmodifiableList(sun);
    return newSun;
  }

  public int numberOfSun()
  {
    int number = sun.size();
    return number;
  }

  public boolean hasSun()
  {
    boolean has = sun.size() > 0;
    return has;
  }

  public int indexOfSun(Sun aSun)
  {
    int index = sun.indexOf(aSun);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_sun()
  {
    sun.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSun()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfSun()
  {
    return 10;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSun(Sun aSun)
  {
    boolean wasAdded = false;
    if (sun.contains(aSun)) { return false; }
    if (numberOfSun() >= maximumNumberOfSun())
    {
      return wasAdded;
    }

    sun.add(aSun);
    if (aSun.indexOfMoon(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSun.addMoon(this);
      if (!wasAdded)
      {
        sun.remove(aSun);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSun(Sun aSun)
  {
    boolean wasRemoved = false;
    if (!sun.contains(aSun))
    {
      return wasRemoved;
    }

    int oldIndex = sun.indexOf(aSun);
    sun.remove(oldIndex);
    if (aSun.indexOfMoon(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSun.removeMoon(this);
      if (!wasRemoved)
      {
        sun.add(oldIndex,aSun);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSunAt(Sun aSun, int index)
  {  
    boolean wasAdded = false;
    if(addSun(aSun))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSun()) { index = numberOfSun() - 1; }
      sun.remove(aSun);
      sun.add(index, aSun);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSunAt(Sun aSun, int index)
  {
    boolean wasAdded = false;
    if(sun.contains(aSun))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSun()) { index = numberOfSun() - 1; }
      sun.remove(aSun);
      sun.add(index, aSun);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSunAt(aSun, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Sun> copyOfSun = new ArrayList<Sun>(sun);
    sun.clear();
    for(Sun aSun : copyOfSun)
    {
      aSun.removeMoon(this);
    }
  }

}
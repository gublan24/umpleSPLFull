/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.*;

// line 33 "../../../../../UmpleTLTemplates/Core.ump"
public class GenStatemachine
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenStatemachine Attributes
  private String type;
  private String name;
  private int level;

  //GenStatemachine Associations
  private GenClass timerOwner;
  private GenClass owner;
  private GenClass statemachineOwner;
  private List<GenState> states;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenStatemachine(String aType, String aName)
  {
    cachedHashCode = -1;
    canSetName = true;
    type = aType;
    name = aName;
    level = 0;
    states = new ArrayList<GenState>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    if (!canSetName) { return false; }
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setLevel(int aLevel)
  {
    boolean wasSet = false;
    level = aLevel;
    wasSet = true;
    return wasSet;
  }

  public String getType()
  {
    return type;
  }

  public String getName()
  {
    return name;
  }

  public int getLevel()
  {
    return level;
  }
  /* Code from template association_GetOne */
  public GenClass getTimerOwner()
  {
    return timerOwner;
  }

  public boolean hasTimerOwner()
  {
    boolean has = timerOwner != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenClass getOwner()
  {
    return owner;
  }

  public boolean hasOwner()
  {
    boolean has = owner != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenClass getStatemachineOwner()
  {
    return statemachineOwner;
  }

  public boolean hasStatemachineOwner()
  {
    boolean has = statemachineOwner != null;
    return has;
  }
  /* Code from template association_GetMany */
  public GenState getState(int index)
  {
    GenState aState = states.get(index);
    return aState;
  }

  public List<GenState> getStates()
  {
    List<GenState> newStates = Collections.unmodifiableList(states);
    return newStates;
  }

  public int numberOfStates()
  {
    int number = states.size();
    return number;
  }

  public boolean hasStates()
  {
    boolean has = states.size() > 0;
    return has;
  }

  public int indexOfState(GenState aState)
  {
    int index = states.indexOf(aState);
    return index;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setTimerOwner(GenClass aTimerOwner)
  {
    boolean wasSet = false;
    GenClass existingTimerOwner = timerOwner;
    timerOwner = aTimerOwner;
    if (existingTimerOwner != null && !existingTimerOwner.equals(aTimerOwner))
    {
      existingTimerOwner.removeTimerStatemachine(this);
    }
    if (aTimerOwner != null)
    {
      aTimerOwner.addTimerStatemachine(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setOwner(GenClass aOwner)
  {
    boolean wasSet = false;
    GenClass existingOwner = owner;
    owner = aOwner;
    if (existingOwner != null && !existingOwner.equals(aOwner))
    {
      existingOwner.removeAutoStatemachine(this);
    }
    if (aOwner != null)
    {
      aOwner.addAutoStatemachine(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setStatemachineOwner(GenClass aStatemachineOwner)
  {
    boolean wasSet = false;
    GenClass existingStatemachineOwner = statemachineOwner;
    statemachineOwner = aStatemachineOwner;
    if (existingStatemachineOwner != null && !existingStatemachineOwner.equals(aStatemachineOwner))
    {
      existingStatemachineOwner.removeStatemachine(this);
    }
    if (aStatemachineOwner != null)
    {
      aStatemachineOwner.addStatemachine(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStates()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addState(GenState aState)
  {
    boolean wasAdded = false;
    if (states.contains(aState)) { return false; }
    GenStatemachine existingOwner = aState.getOwner();
    if (existingOwner == null)
    {
      aState.setOwner(this);
    }
    else if (!this.equals(existingOwner))
    {
      existingOwner.removeState(aState);
      addState(aState);
    }
    else
    {
      states.add(aState);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeState(GenState aState)
  {
    boolean wasRemoved = false;
    if (states.contains(aState))
    {
      states.remove(aState);
      aState.setOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStateAt(GenState aState, int index)
  {  
    boolean wasAdded = false;
    if(addState(aState))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStates()) { index = numberOfStates() - 1; }
      states.remove(aState);
      states.add(index, aState);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStateAt(GenState aState, int index)
  {
    boolean wasAdded = false;
    if(states.contains(aState))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStates()) { index = numberOfStates() - 1; }
      states.remove(aState);
      states.add(index, aState);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStateAt(aState, index);
    }
    return wasAdded;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    GenStatemachine compareTo = (GenStatemachine)obj;
  
    if (getName() == null && compareTo.getName() != null)
    {
      return false;
    }
    else if (getName() != null && !getName().equals(compareTo.getName()))
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getName() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getName().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetName = false;
    return cachedHashCode;
  }

  public void delete()
  {
    if (timerOwner != null)
    {
      GenClass placeholderTimerOwner = timerOwner;
      this.timerOwner = null;
      placeholderTimerOwner.removeTimerStatemachine(this);
    }
    if (owner != null)
    {
      GenClass placeholderOwner = owner;
      this.owner = null;
      placeholderOwner.removeAutoStatemachine(this);
    }
    if (statemachineOwner != null)
    {
      GenClass placeholderStatemachineOwner = statemachineOwner;
      this.statemachineOwner = null;
      placeholderStatemachineOwner.removeStatemachine(this);
    }
    while( !states.isEmpty() )
    {
      states.get(0).setOwner(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "type" + ":" + getType()+ "," +
            "level" + ":" + getLevel()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "timerOwner = "+(getTimerOwner()!=null?Integer.toHexString(System.identityHashCode(getTimerOwner())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "owner = "+(getOwner()!=null?Integer.toHexString(System.identityHashCode(getOwner())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "statemachineOwner = "+(getStatemachineOwner()!=null?Integer.toHexString(System.identityHashCode(getStatemachineOwner())):"null");
  }
}
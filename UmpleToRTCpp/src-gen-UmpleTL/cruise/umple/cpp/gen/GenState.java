/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.*;

// line 27 "../../../../../UmpleTLTemplates/Core.ump"
public class GenState
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenState Attributes
  private String state;
  private int level;

  //GenState Associations
  private GenStatemachine owner;
  private List<GenState> exitableStates;
  private GenState exitableOwner;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetState;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenState(String aState)
  {
    cachedHashCode = -1;
    canSetState = true;
    state = aState;
    level = 0;
    exitableStates = new ArrayList<GenState>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setState(String aState)
  {
    boolean wasSet = false;
    if (!canSetState) { return false; }
    state = aState;
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

  public String getState()
  {
    return state;
  }

  public int getLevel()
  {
    return level;
  }
  /* Code from template association_GetOne */
  public GenStatemachine getOwner()
  {
    return owner;
  }

  public boolean hasOwner()
  {
    boolean has = owner != null;
    return has;
  }
  /* Code from template association_GetMany */
  public GenState getExitableState(int index)
  {
    GenState aExitableState = exitableStates.get(index);
    return aExitableState;
  }

  public List<GenState> getExitableStates()
  {
    List<GenState> newExitableStates = Collections.unmodifiableList(exitableStates);
    return newExitableStates;
  }

  public int numberOfExitableStates()
  {
    int number = exitableStates.size();
    return number;
  }

  public boolean hasExitableStates()
  {
    boolean has = exitableStates.size() > 0;
    return has;
  }

  public int indexOfExitableState(GenState aExitableState)
  {
    int index = exitableStates.indexOf(aExitableState);
    return index;
  }
  /* Code from template association_GetOne */
  public GenState getExitableOwner()
  {
    return exitableOwner;
  }

  public boolean hasExitableOwner()
  {
    boolean has = exitableOwner != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setOwner(GenStatemachine aOwner)
  {
    boolean wasSet = false;
    GenStatemachine existingOwner = owner;
    owner = aOwner;
    if (existingOwner != null && !existingOwner.equals(aOwner))
    {
      existingOwner.removeState(this);
    }
    if (aOwner != null)
    {
      aOwner.addState(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfExitableStates()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addExitableState(GenState aExitableState)
  {
    boolean wasAdded = false;
    if (exitableStates.contains(aExitableState)) { return false; }
    GenState existingExitableOwner = aExitableState.getExitableOwner();
    if (existingExitableOwner == null)
    {
      aExitableState.setExitableOwner(this);
    }
    else if (!this.equals(existingExitableOwner))
    {
      existingExitableOwner.removeExitableState(aExitableState);
      addExitableState(aExitableState);
    }
    else
    {
      exitableStates.add(aExitableState);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeExitableState(GenState aExitableState)
  {
    boolean wasRemoved = false;
    if (exitableStates.contains(aExitableState))
    {
      exitableStates.remove(aExitableState);
      aExitableState.setExitableOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addExitableStateAt(GenState aExitableState, int index)
  {  
    boolean wasAdded = false;
    if(addExitableState(aExitableState))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExitableStates()) { index = numberOfExitableStates() - 1; }
      exitableStates.remove(aExitableState);
      exitableStates.add(index, aExitableState);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveExitableStateAt(GenState aExitableState, int index)
  {
    boolean wasAdded = false;
    if(exitableStates.contains(aExitableState))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExitableStates()) { index = numberOfExitableStates() - 1; }
      exitableStates.remove(aExitableState);
      exitableStates.add(index, aExitableState);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addExitableStateAt(aExitableState, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setExitableOwner(GenState aExitableOwner)
  {
    boolean wasSet = false;
    GenState existingExitableOwner = exitableOwner;
    exitableOwner = aExitableOwner;
    if (existingExitableOwner != null && !existingExitableOwner.equals(aExitableOwner))
    {
      existingExitableOwner.removeExitableState(this);
    }
    if (aExitableOwner != null)
    {
      aExitableOwner.addExitableState(this);
    }
    wasSet = true;
    return wasSet;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    GenState compareTo = (GenState)obj;
  
    if (getState() == null && compareTo.getState() != null)
    {
      return false;
    }
    else if (getState() != null && !getState().equals(compareTo.getState()))
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
    if (getState() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getState().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetState = false;
    return cachedHashCode;
  }

  public void delete()
  {
    if (owner != null)
    {
      GenStatemachine placeholderOwner = owner;
      this.owner = null;
      placeholderOwner.removeState(this);
    }
    while( !exitableStates.isEmpty() )
    {
      exitableStates.get(0).setExitableOwner(null);
    }
    if (exitableOwner != null)
    {
      GenState placeholderExitableOwner = exitableOwner;
      this.exitableOwner = null;
      placeholderExitableOwner.removeExitableState(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "state" + ":" + getState()+ "," +
            "level" + ":" + getLevel()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "owner = "+(getOwner()!=null?Integer.toHexString(System.identityHashCode(getOwner())):"null");
  }
}
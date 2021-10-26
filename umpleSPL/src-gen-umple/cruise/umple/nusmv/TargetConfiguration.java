/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import cruise.umple.compiler.*;
import java.util.*;

// line 3 "../../../../src/TargetConfig.ump"
public class TargetConfiguration
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TargetConfiguration Associations
  private State greatest_default_state;
  private List<State> greatest_descendant_states;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TargetConfiguration(State aGreatest_default_state, State... allGreatest_descendant_states)
  {
    if (!setGreatest_default_state(aGreatest_default_state))
    {
      throw new RuntimeException("Unable to create TargetConfiguration due to aGreatest_default_state. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    greatest_descendant_states = new ArrayList<State>();
    boolean didAddGreatest_descendant_states = setGreatest_descendant_states(allGreatest_descendant_states);
    if (!didAddGreatest_descendant_states)
    {
      throw new RuntimeException("Unable to create TargetConfiguration, must have at least 1 greatest_descendant_states. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public State getGreatest_default_state()
  {
    return greatest_default_state;
  }
  /* Code from template association_GetMany */
  public State getGreatest_descendant_state(int index)
  {
    State aGreatest_descendant_state = greatest_descendant_states.get(index);
    return aGreatest_descendant_state;
  }

  public List<State> getGreatest_descendant_states()
  {
    List<State> newGreatest_descendant_states = Collections.unmodifiableList(greatest_descendant_states);
    return newGreatest_descendant_states;
  }

  public int numberOfGreatest_descendant_states()
  {
    int number = greatest_descendant_states.size();
    return number;
  }

  public boolean hasGreatest_descendant_states()
  {
    boolean has = greatest_descendant_states.size() > 0;
    return has;
  }

  public int indexOfGreatest_descendant_state(State aGreatest_descendant_state)
  {
    int index = greatest_descendant_states.indexOf(aGreatest_descendant_state);
    return index;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setGreatest_default_state(State aNewGreatest_default_state)
  {
    boolean wasSet = false;
    if (aNewGreatest_default_state != null)
    {
      greatest_default_state = aNewGreatest_default_state;
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGreatest_descendant_states()
  {
    return 1;
  }
  /* Code from template association_AddUnidirectionalMStar */
  public boolean addGreatest_descendant_state(State aGreatest_descendant_state)
  {
    boolean wasAdded = false;
    if (greatest_descendant_states.contains(aGreatest_descendant_state)) { return false; }
    greatest_descendant_states.add(aGreatest_descendant_state);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGreatest_descendant_state(State aGreatest_descendant_state)
  {
    boolean wasRemoved = false;
    if (!greatest_descendant_states.contains(aGreatest_descendant_state))
    {
      return wasRemoved;
    }

    if (numberOfGreatest_descendant_states() <= minimumNumberOfGreatest_descendant_states())
    {
      return wasRemoved;
    }

    greatest_descendant_states.remove(aGreatest_descendant_state);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalMStar */
  public boolean setGreatest_descendant_states(State... newGreatest_descendant_states)
  {
    boolean wasSet = false;
    ArrayList<State> verifiedGreatest_descendant_states = new ArrayList<State>();
    for (State aGreatest_descendant_state : newGreatest_descendant_states)
    {
      if (verifiedGreatest_descendant_states.contains(aGreatest_descendant_state))
      {
        continue;
      }
      verifiedGreatest_descendant_states.add(aGreatest_descendant_state);
    }

    if (verifiedGreatest_descendant_states.size() != newGreatest_descendant_states.length || verifiedGreatest_descendant_states.size() < minimumNumberOfGreatest_descendant_states())
    {
      return wasSet;
    }

    greatest_descendant_states.clear();
    greatest_descendant_states.addAll(verifiedGreatest_descendant_states);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGreatest_descendant_stateAt(State aGreatest_descendant_state, int index)
  {  
    boolean wasAdded = false;
    if(addGreatest_descendant_state(aGreatest_descendant_state))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGreatest_descendant_states()) { index = numberOfGreatest_descendant_states() - 1; }
      greatest_descendant_states.remove(aGreatest_descendant_state);
      greatest_descendant_states.add(index, aGreatest_descendant_state);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGreatest_descendant_stateAt(State aGreatest_descendant_state, int index)
  {
    boolean wasAdded = false;
    if(greatest_descendant_states.contains(aGreatest_descendant_state))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGreatest_descendant_states()) { index = numberOfGreatest_descendant_states() - 1; }
      greatest_descendant_states.remove(aGreatest_descendant_state);
      greatest_descendant_states.add(index, aGreatest_descendant_state);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGreatest_descendant_stateAt(aGreatest_descendant_state, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    greatest_default_state = null;
    greatest_descendant_states.clear();
  }

  // line 13 "../../../../src/TargetConfig.ump"
   public String toString(){
    String descendants = "";

		for( State state : getGreatest_descendant_states() )
			descendants += " " + state;

		return "("+greatest_default_state+ " , <" + descendants +" >)";
  }

}
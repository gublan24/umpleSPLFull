/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 322 "../../../../src/Generator_CodeEventSequence.ump"
public class EventSequenceWalkTracker
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventSequenceWalkTracker Attributes
  private String finishReason;
  private int counter;
  private int maxEvents;

  //EventSequenceWalkTracker Associations
  private List<StateWrapper> unvisitedStates;
  private List<Transition> unvisitedTransitions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventSequenceWalkTracker()
  {
    finishReason = "";
    counter = 0;
    maxEvents = -1;
    unvisitedStates = new ArrayList<StateWrapper>();
    unvisitedTransitions = new ArrayList<Transition>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFinishReason(String aFinishReason)
  {
    boolean wasSet = false;
    finishReason = aFinishReason;
    wasSet = true;
    return wasSet;
  }

  public boolean setCounter(int aCounter)
  {
    boolean wasSet = false;
    counter = aCounter;
    wasSet = true;
    return wasSet;
  }

  public boolean setMaxEvents(int aMaxEvents)
  {
    boolean wasSet = false;
    maxEvents = aMaxEvents;
    wasSet = true;
    return wasSet;
  }

  public String getFinishReason()
  {
    return finishReason;
  }

  public int getCounter()
  {
    return counter;
  }

  /**
   * set lazily
   */
  public int getMaxEvents()
  {
    return maxEvents;
  }
  /* Code from template association_GetMany */
  public StateWrapper getUnvisitedState(int index)
  {
    StateWrapper aUnvisitedState = unvisitedStates.get(index);
    return aUnvisitedState;
  }

  public List<StateWrapper> getUnvisitedStates()
  {
    List<StateWrapper> newUnvisitedStates = Collections.unmodifiableList(unvisitedStates);
    return newUnvisitedStates;
  }

  public int numberOfUnvisitedStates()
  {
    int number = unvisitedStates.size();
    return number;
  }

  public boolean hasUnvisitedStates()
  {
    boolean has = unvisitedStates.size() > 0;
    return has;
  }

  public int indexOfUnvisitedState(StateWrapper aUnvisitedState)
  {
    int index = unvisitedStates.indexOf(aUnvisitedState);
    return index;
  }
  /* Code from template association_GetMany */
  public Transition getUnvisitedTransition(int index)
  {
    Transition aUnvisitedTransition = unvisitedTransitions.get(index);
    return aUnvisitedTransition;
  }

  public List<Transition> getUnvisitedTransitions()
  {
    List<Transition> newUnvisitedTransitions = Collections.unmodifiableList(unvisitedTransitions);
    return newUnvisitedTransitions;
  }

  public int numberOfUnvisitedTransitions()
  {
    int number = unvisitedTransitions.size();
    return number;
  }

  public boolean hasUnvisitedTransitions()
  {
    boolean has = unvisitedTransitions.size() > 0;
    return has;
  }

  public int indexOfUnvisitedTransition(Transition aUnvisitedTransition)
  {
    int index = unvisitedTransitions.indexOf(aUnvisitedTransition);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUnvisitedStates()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addUnvisitedState(StateWrapper aUnvisitedState)
  {
    boolean wasAdded = false;
    if (unvisitedStates.contains(aUnvisitedState)) { return false; }
    unvisitedStates.add(aUnvisitedState);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUnvisitedState(StateWrapper aUnvisitedState)
  {
    boolean wasRemoved = false;
    if (unvisitedStates.contains(aUnvisitedState))
    {
      unvisitedStates.remove(aUnvisitedState);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUnvisitedStateAt(StateWrapper aUnvisitedState, int index)
  {  
    boolean wasAdded = false;
    if(addUnvisitedState(aUnvisitedState))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUnvisitedStates()) { index = numberOfUnvisitedStates() - 1; }
      unvisitedStates.remove(aUnvisitedState);
      unvisitedStates.add(index, aUnvisitedState);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUnvisitedStateAt(StateWrapper aUnvisitedState, int index)
  {
    boolean wasAdded = false;
    if(unvisitedStates.contains(aUnvisitedState))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUnvisitedStates()) { index = numberOfUnvisitedStates() - 1; }
      unvisitedStates.remove(aUnvisitedState);
      unvisitedStates.add(index, aUnvisitedState);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUnvisitedStateAt(aUnvisitedState, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUnvisitedTransitions()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addUnvisitedTransition(Transition aUnvisitedTransition)
  {
    boolean wasAdded = false;
    if (unvisitedTransitions.contains(aUnvisitedTransition)) { return false; }
    unvisitedTransitions.add(aUnvisitedTransition);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUnvisitedTransition(Transition aUnvisitedTransition)
  {
    boolean wasRemoved = false;
    if (unvisitedTransitions.contains(aUnvisitedTransition))
    {
      unvisitedTransitions.remove(aUnvisitedTransition);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUnvisitedTransitionAt(Transition aUnvisitedTransition, int index)
  {  
    boolean wasAdded = false;
    if(addUnvisitedTransition(aUnvisitedTransition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUnvisitedTransitions()) { index = numberOfUnvisitedTransitions() - 1; }
      unvisitedTransitions.remove(aUnvisitedTransition);
      unvisitedTransitions.add(index, aUnvisitedTransition);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUnvisitedTransitionAt(Transition aUnvisitedTransition, int index)
  {
    boolean wasAdded = false;
    if(unvisitedTransitions.contains(aUnvisitedTransition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUnvisitedTransitions()) { index = numberOfUnvisitedTransitions() - 1; }
      unvisitedTransitions.remove(aUnvisitedTransition);
      unvisitedTransitions.add(index, aUnvisitedTransition);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUnvisitedTransitionAt(aUnvisitedTransition, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    unvisitedStates.clear();
    unvisitedTransitions.clear();
  }

  // line 332 "../../../../src/Generator_CodeEventSequence.ump"
   public boolean isWalkFinished(StateWrapper currentState){
    boolean isFinished = false;

    counter++;

    // Hit event counter limit (ensures the walk ends in every case)
    if(counter >= maxEvents)
    {
      isFinished = true;
      setFinishReason("Hit arbitrary counter");
    }

    // Reached end state policy
    if(currentState.isEndState())
    {
      isFinished = true;
      setFinishReason("Reached an end-state");
    }

    // Visit all states policy
    if(numberOfUnvisitedStates() == 0)
    {
      isFinished = true;
      setFinishReason("Visited all states");
    }

    return isFinished;
  }

  // line 361 "../../../../src/Generator_CodeEventSequence.ump"
   public void calculateMaximumEvents(){
    maxEvents = (numberOfUnvisitedStates() + numberOfUnvisitedTransitions());
  }

  // line 365 "../../../../src/Generator_CodeEventSequence.ump"
   public void markTransitionVisited(Transition trans){
    removeUnvisitedTransition(trans);
  }

  // line 369 "../../../../src/Generator_CodeEventSequence.ump"
   public void markStateVisited(StateWrapper state){
    removeUnvisitedState(state);
    markSuperStatesAsVisited(state);
  }

  // line 374 "../../../../src/Generator_CodeEventSequence.ump"
   private void markSuperStatesAsVisited(StateWrapper state){
    while(state != null) {
      removeUnvisitedState(state);
      state = state.getParent();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "finishReason" + ":" + getFinishReason()+ "," +
            "counter" + ":" + getCounter()+ "," +
            "maxEvents" + ":" + getMaxEvents()+ "]";
  }
}
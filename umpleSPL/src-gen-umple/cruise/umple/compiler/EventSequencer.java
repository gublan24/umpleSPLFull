/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 32 "../../../../src/Generator_CodeEventSequence.ump"
public class EventSequencer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventSequencer Attributes
  private StateMachine sm;
  private double randomEventProportion;
  private Random randomGenerator;
  private int smNumber;
  private int nextStateId;

  //EventSequencer Associations
  private List<StateWrapper> possibleStates;
  private List<Transition> possibleTransitions;
  private List<Event> possibleEvents;
  private EventSequenceWalkTracker tracker;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventSequencer(StateMachine aSm, int aSmNumber)
  {
    sm = aSm;
    randomEventProportion = 0.15;
    randomGenerator = new Random();
    smNumber = aSmNumber;
    nextStateId = 0;
    possibleStates = new ArrayList<StateWrapper>();
    possibleTransitions = new ArrayList<Transition>();
    possibleEvents = new ArrayList<Event>();
    // line 46 "../../../../src/Generator_CodeEventSequence.ump"
    tracker = new EventSequenceWalkTracker();
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSm(StateMachine aSm)
  {
    boolean wasSet = false;
    sm = aSm;
    wasSet = true;
    return wasSet;
  }

  public boolean setRandomEventProportion(double aRandomEventProportion)
  {
    boolean wasSet = false;
    randomEventProportion = aRandomEventProportion;
    wasSet = true;
    return wasSet;
  }

  public boolean setRandomGenerator(Random aRandomGenerator)
  {
    boolean wasSet = false;
    randomGenerator = aRandomGenerator;
    wasSet = true;
    return wasSet;
  }

  public boolean setSmNumber(int aSmNumber)
  {
    boolean wasSet = false;
    smNumber = aSmNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setNextStateId(int aNextStateId)
  {
    boolean wasSet = false;
    nextStateId = aNextStateId;
    wasSet = true;
    return wasSet;
  }

  public StateMachine getSm()
  {
    return sm;
  }

  public double getRandomEventProportion()
  {
    return randomEventProportion;
  }

  public Random getRandomGenerator()
  {
    return randomGenerator;
  }

  public int getSmNumber()
  {
    return smNumber;
  }

  public int getNextStateId()
  {
    return nextStateId;
  }
  /* Code from template association_GetMany */
  public StateWrapper getPossibleState(int index)
  {
    StateWrapper aPossibleState = possibleStates.get(index);
    return aPossibleState;
  }

  public List<StateWrapper> getPossibleStates()
  {
    List<StateWrapper> newPossibleStates = Collections.unmodifiableList(possibleStates);
    return newPossibleStates;
  }

  public int numberOfPossibleStates()
  {
    int number = possibleStates.size();
    return number;
  }

  public boolean hasPossibleStates()
  {
    boolean has = possibleStates.size() > 0;
    return has;
  }

  public int indexOfPossibleState(StateWrapper aPossibleState)
  {
    int index = possibleStates.indexOf(aPossibleState);
    return index;
  }
  /* Code from template association_GetMany */
  public Transition getPossibleTransition(int index)
  {
    Transition aPossibleTransition = possibleTransitions.get(index);
    return aPossibleTransition;
  }

  public List<Transition> getPossibleTransitions()
  {
    List<Transition> newPossibleTransitions = Collections.unmodifiableList(possibleTransitions);
    return newPossibleTransitions;
  }

  public int numberOfPossibleTransitions()
  {
    int number = possibleTransitions.size();
    return number;
  }

  public boolean hasPossibleTransitions()
  {
    boolean has = possibleTransitions.size() > 0;
    return has;
  }

  public int indexOfPossibleTransition(Transition aPossibleTransition)
  {
    int index = possibleTransitions.indexOf(aPossibleTransition);
    return index;
  }
  /* Code from template association_GetMany */
  public Event getPossibleEvent(int index)
  {
    Event aPossibleEvent = possibleEvents.get(index);
    return aPossibleEvent;
  }

  public List<Event> getPossibleEvents()
  {
    List<Event> newPossibleEvents = Collections.unmodifiableList(possibleEvents);
    return newPossibleEvents;
  }

  public int numberOfPossibleEvents()
  {
    int number = possibleEvents.size();
    return number;
  }

  public boolean hasPossibleEvents()
  {
    boolean has = possibleEvents.size() > 0;
    return has;
  }

  public int indexOfPossibleEvent(Event aPossibleEvent)
  {
    int index = possibleEvents.indexOf(aPossibleEvent);
    return index;
  }
  /* Code from template association_GetOne */
  public EventSequenceWalkTracker getTracker()
  {
    return tracker;
  }

  public boolean hasTracker()
  {
    boolean has = tracker != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPossibleStates()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addPossibleState(StateWrapper aPossibleState)
  {
    boolean wasAdded = false;
    if (possibleStates.contains(aPossibleState)) { return false; }
    possibleStates.add(aPossibleState);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePossibleState(StateWrapper aPossibleState)
  {
    boolean wasRemoved = false;
    if (possibleStates.contains(aPossibleState))
    {
      possibleStates.remove(aPossibleState);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPossibleStateAt(StateWrapper aPossibleState, int index)
  {  
    boolean wasAdded = false;
    if(addPossibleState(aPossibleState))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPossibleStates()) { index = numberOfPossibleStates() - 1; }
      possibleStates.remove(aPossibleState);
      possibleStates.add(index, aPossibleState);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePossibleStateAt(StateWrapper aPossibleState, int index)
  {
    boolean wasAdded = false;
    if(possibleStates.contains(aPossibleState))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPossibleStates()) { index = numberOfPossibleStates() - 1; }
      possibleStates.remove(aPossibleState);
      possibleStates.add(index, aPossibleState);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPossibleStateAt(aPossibleState, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPossibleTransitions()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addPossibleTransition(Transition aPossibleTransition)
  {
    boolean wasAdded = false;
    if (possibleTransitions.contains(aPossibleTransition)) { return false; }
    possibleTransitions.add(aPossibleTransition);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePossibleTransition(Transition aPossibleTransition)
  {
    boolean wasRemoved = false;
    if (possibleTransitions.contains(aPossibleTransition))
    {
      possibleTransitions.remove(aPossibleTransition);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPossibleTransitionAt(Transition aPossibleTransition, int index)
  {  
    boolean wasAdded = false;
    if(addPossibleTransition(aPossibleTransition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPossibleTransitions()) { index = numberOfPossibleTransitions() - 1; }
      possibleTransitions.remove(aPossibleTransition);
      possibleTransitions.add(index, aPossibleTransition);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePossibleTransitionAt(Transition aPossibleTransition, int index)
  {
    boolean wasAdded = false;
    if(possibleTransitions.contains(aPossibleTransition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPossibleTransitions()) { index = numberOfPossibleTransitions() - 1; }
      possibleTransitions.remove(aPossibleTransition);
      possibleTransitions.add(index, aPossibleTransition);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPossibleTransitionAt(aPossibleTransition, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPossibleEvents()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addPossibleEvent(Event aPossibleEvent)
  {
    boolean wasAdded = false;
    if (possibleEvents.contains(aPossibleEvent)) { return false; }
    possibleEvents.add(aPossibleEvent);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePossibleEvent(Event aPossibleEvent)
  {
    boolean wasRemoved = false;
    if (possibleEvents.contains(aPossibleEvent))
    {
      possibleEvents.remove(aPossibleEvent);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPossibleEventAt(Event aPossibleEvent, int index)
  {  
    boolean wasAdded = false;
    if(addPossibleEvent(aPossibleEvent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPossibleEvents()) { index = numberOfPossibleEvents() - 1; }
      possibleEvents.remove(aPossibleEvent);
      possibleEvents.add(index, aPossibleEvent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePossibleEventAt(Event aPossibleEvent, int index)
  {
    boolean wasAdded = false;
    if(possibleEvents.contains(aPossibleEvent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPossibleEvents()) { index = numberOfPossibleEvents() - 1; }
      possibleEvents.remove(aPossibleEvent);
      possibleEvents.add(index, aPossibleEvent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPossibleEventAt(aPossibleEvent, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setTracker(EventSequenceWalkTracker aNewTracker)
  {
    boolean wasSet = false;
    tracker = aNewTracker;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    possibleStates.clear();
    possibleTransitions.clear();
    possibleEvents.clear();
    tracker = null;
  }

  // line 51 "../../../../src/Generator_CodeEventSequence.ump"
   public StringBuilder generateEventSequence(EventSequenceTemplate templater){
    EventSequenceTable table = new EventSequenceTable(smNumber);
    EventSequenceList list = new EventSequenceList();

    recursivelyAnalyzeStateMachine(sm, table, null);

    // After analysis, set the tracker event limit
    tracker.calculateMaximumEvents();

    // Special case, empty state machine
    if(numberOfPossibleStates() == 0)
    {
      return new StringBuilder(templater.genNoStatesMessage(
        String.valueOf(smNumber)));
    }

    // Special case, state machine without transitions
    if(numberOfPossibleTransitions() == 0)
    {
      return new StringBuilder(templater.genNoTransitionMessage(
        String.valueOf(smNumber)));
    }

    walkThroughStateMachine(table, list);

    StringBuilder output = new StringBuilder();
    output.append(table.output(templater));
    output.append(list.output(templater));
    output.append(templater.genEndMessage(tracker.getFinishReason()));
    return output;
  }


  /**
   * Build the data structures the EventSequencer will use to walk the state
   * machine. Also, adds rows the the output table
   */
  // line 88 "../../../../src/Generator_CodeEventSequence.ump"
   private void recursivelyAnalyzeStateMachine(StateMachine currentStateMachine, EventSequenceTable table, StateWrapper parent){
    StateWrapper wrappedState;

    for(State state : currentStateMachine.getStates()) 
    {
      wrappedState = new StateWrapper(state, nextStateId++);
      wrappedState.setParent(parent);

      //Add the state only if it has not been added before
      if(wrapState(state) == null) 
      {
        addPossibleState(wrappedState);
        tracker.addUnvisitedState(wrappedState);
        table.addRow(wrappedState);
        recursivelyAddStateTransitions(wrappedState, wrappedState);
      }
      
      for (StateMachine nestedSm : state.getNestedStateMachines())
      {
        recursivelyAnalyzeStateMachine(nestedSm, table, wrappedState);
      }
    }
  }

  // line 114 "../../../../src/Generator_CodeEventSequence.ump"
   private void recursivelyAddStateTransitions(StateWrapper originalState, StateWrapper currentState){
    State unwrappedState = currentState.getWrappedState();
    Event event;

    for(Transition trans : unwrappedState.getTransitions())
    {
      event = trans.getEvent();

      // only handle the transition and event if it has not already been dealt
      // with in a sub state
      if(indexOfPossibleTransition(trans) == -1)
      {
        addPossibleTransition(trans);
        tracker.addUnvisitedTransition(trans);
      }

      // add the event to the state's pool of available events
      originalState.addMappedTransistion(event, trans);

      // only add the event to the global list of possible transitions if it
      // doesn't make sense as an event that could happen globally (ie auto
      // and timed transitions).
      // add the event to the global possible list if it isn't already there
      if(event.isAutoTransition() &&
         event.getIsTimer() &&
         indexOfPossibleEvent(event) == -1)
      {
        addPossibleEvent(event);
      }
    }

    if(currentState.hasParent()) 
    {
      recursivelyAddStateTransitions(originalState, currentState.getParent());
    }
  }


  /**
   * Does a random walk through the state machine. It will choose events that
   * apply to the current state 1-randomEventProportion, and the rest of the
   * time it will choose a random event from the state machine (which may or
   * may not apply to the current state). It builds up the EventSequenceTable
   * as it walks. The walk finishes depending on the policy set (visit all
   * states, use all transitions, do X events)
   */
  // line 159 "../../../../src/Generator_CodeEventSequence.ump"
   private void walkThroughStateMachine(EventSequenceTable table, EventSequenceList list){
    StateWrapper currentState;
    Transition currentTransition;
    Event currentEvent;
    boolean isFinished = false;

    currentState = wrapState(resolveStartState(sm.getStartState()));

    // Add the start state to the output table
    table.addColumn(currentState, "START");

    // Add the start state to the output list
    list.addFirstRow(currentState, "-");

    // Mark the start state as visited
    tracker.removeUnvisitedState(currentState);

    // Begin walking through the state machine
    while(!isFinished)
    {
      currentEvent = nextEvent(currentState);
      currentTransition = currentState.getMappedTransition(currentEvent,
                                                           randomGenerator);

      if(currentTransition != null)
      {
        currentState = wrapState(findNextState(currentTransition));
      }      
      
      // Mark the transition and state as visited
      tracker.markTransitionVisited(currentTransition);
      tracker.markStateVisited(currentState);

      // Add state and event to the outputs
      table.addColumn(currentState, 
                      extractLabel(currentEvent, currentTransition));
      list.addRow(currentState, 
                     extractLabel(currentEvent, currentTransition));

      isFinished = tracker.isWalkFinished(currentState);
    }
  }


  /**
   * Decides whether to have the next event be pulled from the global set of
   * events, or only from the events associated with the current state.
   */
  // line 205 "../../../../src/Generator_CodeEventSequence.ump"
   private Event nextEvent(StateWrapper currentState){
    double chance = randomGenerator.nextDouble();
    Event nextEvent;

    // only try to get a random event from the global pool of events if
    // the global event pool isn't empty (which will happen if the only
    // kinds of transitions are auto and timed transitions) 
    if(numberOfPossibleEvents() != 0 && chance <= randomEventProportion )
    {
      nextEvent = getRandomEvent();
    }
    else
    {
      nextEvent = getRandomEvent(currentState); 
    }

    return nextEvent;
  }


  /**
   * Retrieves an event randomly from the set of all events present in the
   * state machine.
   */
  // line 227 "../../../../src/Generator_CodeEventSequence.ump"
   private Event getRandomEvent(){
    int index = randomGenerator.nextInt(numberOfPossibleEvents());
    return getPossibleEvent(index);
  }


  /**
   * Retrieves an event from the set of events that will cause a transition
   * within the current state.
   */
  // line 235 "../../../../src/Generator_CodeEventSequence.ump"
   private Event getRandomEvent(StateWrapper curState){
    Event[] events = curState.getPossibleEvents();
    int index = randomGenerator.nextInt(events.length);
    return events[index];
  }


  /**
   * Retrieves a StateWrapper object from the associated StateWrappers based
   * on the state that it is wrapping.
   */
  // line 244 "../../../../src/Generator_CodeEventSequence.ump"
   private StateWrapper wrapState(State state){
    StateWrapper resultWrappedState = null;

    for(StateWrapper sw : getPossibleStates())
    {
      if(sw.getWrappedState() == state)
      {
        resultWrappedState = sw;
        break;
      }
    }

    return resultWrappedState;
  }

  // line 260 "../../../../src/Generator_CodeEventSequence.ump"
   private State findNextState(Transition trans){
    State nextState = trans.getNextState();

    nextState = resolveStartState(nextState);

    return nextState;
  }

  // line 269 "../../../../src/Generator_CodeEventSequence.ump"
   private State resolveStartState(State nextState){
    while(nextState.hasNestedStateMachines()) 
    {
      for(StateMachine sm : nextState.getNestedStateMachines()) 
      {
        tracker.removeUnvisitedState(wrapState(nextState)); // Superstates are marked as visited
        nextState = sm.getStartState();
      }
    }

    return nextState;
  }

  // line 283 "../../../../src/Generator_CodeEventSequence.ump"
   private String extractLabel(Event event, Transition trans){
    String eventLabel;
    Guard guard = null;

    if(event.isAutoTransition())
    {
      eventLabel = "(auto)";
    }
    else if(event.getIsTimer())
    {
      eventLabel = "after(" + event.getTimerInSeconds() + ")";
    }
    else
    {
      eventLabel = event.getName();
    }

    if(trans != null)
    {
      guard = trans.getGuard();
    }

    if(guard != null) 
    {
      eventLabel += " [" + extractGuardLabel(guard) + "]";
    }

    return eventLabel;
  }

  // line 314 "../../../../src/Generator_CodeEventSequence.ump"
   private String extractGuardLabel(Guard guard){
    JavaGenerator gen = new JavaGenerator();
    UmpleClass umpClass = sm.getUmpleClass();
  
    gen.setModel(umpClass.getSourceModel());
    return guard.getCondition(gen).replaceAll("\"","&quot;");
  }


  public String toString()
  {
    return super.toString() + "["+
            "randomEventProportion" + ":" + getRandomEventProportion()+ "," +
            "smNumber" + ":" + getSmNumber()+ "," +
            "nextStateId" + ":" + getNextStateId()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "sm" + "=" + (getSm() != null ? !getSm().equals(this)  ? getSm().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "randomGenerator" + "=" + (getRandomGenerator() != null ? !getRandomGenerator().equals(this)  ? getRandomGenerator().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "tracker = "+(getTracker()!=null?Integer.toHexString(System.identityHashCode(getTracker())):"null");
  }
}
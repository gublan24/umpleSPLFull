/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * A simple wrapper over a State machine's states that allows keeping track
 * of the parent state of the wrapped state, and all events that will cause
 * a transition out of the wrapped state.
 */
// line 384 "../../../../src/Generator_CodeEventSequence.ump"
public class StateWrapper
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateWrapper Attributes
  private State wrappedState;
  private int stateId;

  //StateWrapper Associations
  private StateWrapper parent;
  private List<EventWrapper> events;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateWrapper(State aWrappedState, int aStateId)
  {
    wrappedState = aWrappedState;
    stateId = aStateId;
    events = new ArrayList<EventWrapper>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setWrappedState(State aWrappedState)
  {
    boolean wasSet = false;
    wrappedState = aWrappedState;
    wasSet = true;
    return wasSet;
  }

  public boolean setStateId(int aStateId)
  {
    boolean wasSet = false;
    stateId = aStateId;
    wasSet = true;
    return wasSet;
  }

  public State getWrappedState()
  {
    return wrappedState;
  }

  public int getStateId()
  {
    return stateId;
  }
  /* Code from template association_GetOne */
  public StateWrapper getParent()
  {
    return parent;
  }

  public boolean hasParent()
  {
    boolean has = parent != null;
    return has;
  }
  /* Code from template association_GetMany */
  public EventWrapper getEvent(int index)
  {
    EventWrapper aEvent = events.get(index);
    return aEvent;
  }

  public List<EventWrapper> getEvents()
  {
    List<EventWrapper> newEvents = Collections.unmodifiableList(events);
    return newEvents;
  }

  public int numberOfEvents()
  {
    int number = events.size();
    return number;
  }

  public boolean hasEvents()
  {
    boolean has = events.size() > 0;
    return has;
  }

  public int indexOfEvent(EventWrapper aEvent)
  {
    int index = events.indexOf(aEvent);
    return index;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setParent(StateWrapper aNewParent)
  {
    boolean wasSet = false;
    parent = aNewParent;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEvents()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addEvent(EventWrapper aEvent)
  {
    boolean wasAdded = false;
    if (events.contains(aEvent)) { return false; }
    events.add(aEvent);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEvent(EventWrapper aEvent)
  {
    boolean wasRemoved = false;
    if (events.contains(aEvent))
    {
      events.remove(aEvent);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEventAt(EventWrapper aEvent, int index)
  {  
    boolean wasAdded = false;
    if(addEvent(aEvent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEvents()) { index = numberOfEvents() - 1; }
      events.remove(aEvent);
      events.add(index, aEvent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEventAt(EventWrapper aEvent, int index)
  {
    boolean wasAdded = false;
    if(events.contains(aEvent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEvents()) { index = numberOfEvents() - 1; }
      events.remove(aEvent);
      events.add(index, aEvent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEventAt(aEvent, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    parent = null;
    events.clear();
  }


  /**
   * If no possible events exist to exit this state, then the wrapped state is
   * an end state.
   */
  // line 396 "../../../../src/Generator_CodeEventSequence.ump"
   public boolean isEndState(){
    boolean result = false;
    
    if(numberOfEvents() == 0) 
      result = true;
    
    return result;
  }


  /**
   * Adds an event and the transition it maps to for this state to the eventMap
   */
  // line 407 "../../../../src/Generator_CodeEventSequence.ump"
   public void addMappedTransistion(Event event, Transition transition){
    wrapEvent(event).addTransition(transition);
  }


  /**
   * Returns one of the transitions caused by this event using the injected
   * Random number generator
   */
  // line 414 "../../../../src/Generator_CodeEventSequence.ump"
   public Transition getMappedTransition(Event event, Random randomGen){
    EventWrapper wrappedEvent = wrapEvent(event);

    if(isEndState() || wrappedEvent.numberOfTransitions() == 0) 
      return null;

    int index = randomGen.nextInt(wrappedEvent.numberOfTransitions());

    return wrappedEvent.getTransition(index);
  }


  /**
   * returns an array of possible events
   */
  // line 427 "../../../../src/Generator_CodeEventSequence.ump"
   public Event[] getPossibleEvents(){
    Event[] eventArray = new Event[numberOfEvents()];
    for(int i = 0; i < numberOfEvents(); i++) 
    {
      eventArray[i] = events.get(i).getWrappedEvent();
    }

    return eventArray;
  }


  /**
   * Returns the name of this state, accounting for parent states.
   * The parent state names are added as prefixes, separated by dots.
   */
  // line 440 "../../../../src/Generator_CodeEventSequence.ump"
   public String getDottedName(){
    return recursivelyGetDottedNames(this);
  }


  /**
   * Returns the name of this state, accounting for nested depth.
   * For each level of nesting this state is in, a dash is prefixed to the name
   */
  // line 447 "../../../../src/Generator_CodeEventSequence.ump"
   public String getDashedName(){
    String name = "";
    StateWrapper parent = getParent();

    while(parent != null) {
      name += "- ";
      parent = parent.getParent();
    }

    return name + wrappedState.getName();
  }


  /**
   * Returns the id value of this states parent, or the empty string, if this
   * has no parent
   */
  // line 462 "../../../../src/Generator_CodeEventSequence.ump"
   public String getParentId(){
    if(parent == null)
    {
      return "";
    }
    else
    {
      return String.valueOf(getParent().getStateId());
    }
  }

  // line 474 "../../../../src/Generator_CodeEventSequence.ump"
   private String recursivelyGetDottedNames(StateWrapper stateWrapper){
    if(stateWrapper.hasParent()) {
      return stateWrapper.recursivelyGetDottedNames(stateWrapper.getParent()) 
        + "." + stateWrapper.getWrappedState().getName();
    } else {
      return stateWrapper.getWrappedState().getName();
    }
  }

  // line 484 "../../../../src/Generator_CodeEventSequence.ump"
   private EventWrapper wrapEvent(Event unwrapped){
    for(EventWrapper ev : events) {
      if(ev.getWrappedEvent() == unwrapped) {
        return ev;
      }
    }

    EventWrapper newEv = new EventWrapper(unwrapped);
    events.add(newEv);
    return newEv;
  }


  public String toString()
  {
    return super.toString() + "["+
            "stateId" + ":" + getStateId()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "wrappedState" + "=" + (getWrappedState() != null ? !getWrappedState().equals(this)  ? getWrappedState().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
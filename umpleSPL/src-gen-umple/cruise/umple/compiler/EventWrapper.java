/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Allows mapping from events to the various transitions. This allows guards to
 * effectively be ignored for the purpose of walking randomly through the state
 * machine.
 */
// line 499 "../../../../src/Generator_CodeEventSequence.ump"
public class EventWrapper
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventWrapper Attributes
  private Event wrappedEvent;

  //EventWrapper Associations
  private List<Transition> transitions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventWrapper(Event aWrappedEvent)
  {
    wrappedEvent = aWrappedEvent;
    transitions = new ArrayList<Transition>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setWrappedEvent(Event aWrappedEvent)
  {
    boolean wasSet = false;
    wrappedEvent = aWrappedEvent;
    wasSet = true;
    return wasSet;
  }

  public Event getWrappedEvent()
  {
    return wrappedEvent;
  }
  /* Code from template association_GetMany */
  public Transition getTransition(int index)
  {
    Transition aTransition = transitions.get(index);
    return aTransition;
  }

  public List<Transition> getTransitions()
  {
    List<Transition> newTransitions = Collections.unmodifiableList(transitions);
    return newTransitions;
  }

  public int numberOfTransitions()
  {
    int number = transitions.size();
    return number;
  }

  public boolean hasTransitions()
  {
    boolean has = transitions.size() > 0;
    return has;
  }

  public int indexOfTransition(Transition aTransition)
  {
    int index = transitions.indexOf(aTransition);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTransitions()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addTransition(Transition aTransition)
  {
    boolean wasAdded = false;
    if (transitions.contains(aTransition)) { return false; }
    transitions.add(aTransition);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTransition(Transition aTransition)
  {
    boolean wasRemoved = false;
    if (transitions.contains(aTransition))
    {
      transitions.remove(aTransition);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTransitionAt(Transition aTransition, int index)
  {  
    boolean wasAdded = false;
    if(addTransition(aTransition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTransitions()) { index = numberOfTransitions() - 1; }
      transitions.remove(aTransition);
      transitions.add(index, aTransition);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTransitionAt(Transition aTransition, int index)
  {
    boolean wasAdded = false;
    if(transitions.contains(aTransition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTransitions()) { index = numberOfTransitions() - 1; }
      transitions.remove(aTransition);
      transitions.add(index, aTransition);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTransitionAt(aTransition, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    transitions.clear();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "wrappedEvent" + "=" + (getWrappedEvent() != null ? !getWrappedEvent().equals(this)  ? getWrappedEvent().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
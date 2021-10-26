/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;

/**
 * Specifies, within a state, what happens with a certain event (method call) occurs
 * Normally the state machine will go to a new state after executing various actions and
 * activities.
 * The guard is a boolean condition that may prevent triggering the transition
 * 
 * NEW CLASS****************************************
 * 
 */
// line 126 "../../../../src/StateMachine.ump"
// line 744 "../../../../src/StateMachine_Code.ump"
// line 1494 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
public class Transition
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Transition Attributes
  private boolean isInternal;
  private boolean autoTransition;
  private Position position;

  //Transition Associations
  private Event event;
  private State fromState;
  private State nextState;
  private Guard guard;
  private Action action;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetFromState;
  private boolean canSetEvent;
  private boolean canSetNextState;
  private boolean canSetGuard;
  private boolean canSetAction;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Transition(State aFromState, State aNextState)
  {
    cachedHashCode = -1;
    canSetFromState = true;
    canSetEvent = true;
    canSetNextState = true;
    canSetGuard = true;
    canSetAction = true;
    isInternal = false;
    autoTransition = false;
    position = null;
    boolean didAddFromState = setFromState(aFromState);
    if (!didAddFromState)
    {
      throw new RuntimeException("Unable to create transition due to fromState. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddNextState = setNextState(aNextState);
    if (!didAddNextState)
    {
      throw new RuntimeException("Unable to create nextTransition due to nextState. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsInternal(boolean aIsInternal)
  {
    boolean wasSet = false;
    isInternal = aIsInternal;
    wasSet = true;
    return wasSet;
  }

  public boolean setAutoTransition(boolean aAutoTransition)
  {
    boolean wasSet = false;
    autoTransition = aAutoTransition;
    wasSet = true;
    return wasSet;
  }

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean getIsInternal()
  {
    return isInternal;
  }

  public boolean getAutoTransition()
  {
    return autoTransition;
  }

  /**
   * Issue 519
   */
  public Position getPosition()
  {
    return position;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInternal()
  {
    return isInternal;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isAutoTransition()
  {
    return autoTransition;
  }
  /* Code from template association_GetOne */
  public Event getEvent()
  {
    return event;
  }

  public boolean hasEvent()
  {
    boolean has = event != null;
    return has;
  }
  /* Code from template association_GetOne */
  public State getFromState()
  {
    return fromState;
  }
  /* Code from template association_GetOne */
  public State getNextState()
  {
    return nextState;
  }
  /* Code from template association_GetOne */
  public Guard getGuard()
  {
    return guard;
  }

  public boolean hasGuard()
  {
    boolean has = guard != null;
    return has;
  }
  /* Code from template association_GetOne */
  public Action getAction()
  {
    return action;
  }

  public boolean hasAction()
  {
    boolean has = action != null;
    return has;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setEvent(Event aNewEvent)
  {
    boolean wasSet = false;
    if (!canSetEvent) { return false; }
    event = aNewEvent;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setFromState(State aFromState)
  {
    boolean wasSet = false;
    if (!canSetFromState) { return false; }
    if (aFromState == null)
    {
      return wasSet;
    }

    State existingFromState = fromState;
    fromState = aFromState;
    if (existingFromState != null && !existingFromState.equals(aFromState))
    {
      existingFromState.removeTransition(this);
    }
    fromState.addTransition(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setNextState(State aNextState)
  {
    boolean wasSet = false;
    if (!canSetNextState) { return false; }
    if (aNextState == null)
    {
      return wasSet;
    }

    State existingNextState = nextState;
    nextState = aNextState;
    if (existingNextState != null && !existingNextState.equals(aNextState))
    {
      existingNextState.removeNextTransition(this);
    }
    nextState.addNextTransition(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setGuard(Guard aNewGuard)
  {
    boolean wasSet = false;
    if (!canSetGuard) { return false; }
    guard = aNewGuard;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setAction(Action aNewAction)
  {
    boolean wasSet = false;
    if (!canSetAction) { return false; }
    action = aNewAction;
    wasSet = true;
    return wasSet;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Transition compareTo = (Transition)obj;
  
    if (getFromState() == null && compareTo.getFromState() != null)
    {
      return false;
    }
    else if (getFromState() != null && !getFromState().equals(compareTo.getFromState()))
    {
      return false;
    }

    if (getEvent() == null && compareTo.getEvent() != null)
    {
      return false;
    }
    else if (getEvent() != null && !getEvent().equals(compareTo.getEvent()))
    {
      return false;
    }

    if (getNextState() == null && compareTo.getNextState() != null)
    {
      return false;
    }
    else if (getNextState() != null && !getNextState().equals(compareTo.getNextState()))
    {
      return false;
    }

    if (getGuard() == null && compareTo.getGuard() != null)
    {
      return false;
    }
    else if (getGuard() != null && !getGuard().equals(compareTo.getGuard()))
    {
      return false;
    }

    if (getAction() == null && compareTo.getAction() != null)
    {
      return false;
    }
    else if (getAction() != null && !getAction().equals(compareTo.getAction()))
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
    if (getFromState() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getFromState().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }
    if (getEvent() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getEvent().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }
    if (getNextState() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getNextState().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }
    if (getGuard() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getGuard().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }
    if (getAction() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getAction().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetFromState = false;
    canSetEvent = false;
    canSetNextState = false;
    canSetGuard = false;
    canSetAction = false;
    return cachedHashCode;
  }

  public void delete()
  {
    event = null;
    State placeholderFromState = fromState;
    this.fromState = null;
    if(placeholderFromState != null)
    {
      placeholderFromState.removeTransition(this);
    }
    State placeholderNextState = nextState;
    this.nextState = null;
    if(placeholderNextState != null)
    {
      placeholderNextState.removeNextTransition(this);
    }
    guard = null;
    action = null;
  }

  // line 748 "../../../../src/StateMachine_Code.ump"
   public static  Transition createPlaceholder(State nextState){
    StateMachine nullSm = new StateMachine("null");
    State nullState = new State("null",nullSm);
    return new Transition(nullState, nextState);
  }


  /**
   * Issue 935 Helper Function - Determine the state machine to exit in a transition
   */
  // line 757 "../../../../src/StateMachine_Code.ump"
   public StateMachine getSmToExit(StateMachine defaultToExit){
    StateMachine smToExit = defaultToExit;
    if (fromState.getStateMachine().getParentState() != null && nextState.getStateMachine().getParentState() != null) {
      State fromStateSuperParent = fromState.getStateMachine().getParentState();
      if (nextState.equals(fromStateSuperParent)) {
        smToExit = fromStateSuperParent.getStateMachine();
      } else if(nextState.equals(fromState)) {
        smToExit = fromState.getStateMachine();
      } else {
        boolean foundSmToExit = false;
        
        // First, traverse up "nextState" and see if it is contained in "fromState"
        State nextStateTraverser = nextState;
        while (nextStateTraverser.getStateMachine().getParentState() != null && !foundSmToExit) {
          State nextStateSuperParent = nextStateTraverser.getStateMachine().getParentState();
          if (nextStateSuperParent.equals(fromState)) {
            smToExit = nextStateTraverser.getStateMachine();
            foundSmToExit = true;
          } else if (nextStateSuperParent.equals(fromStateSuperParent)) {
            smToExit = fromState.getStateMachine();
            foundSmToExit = true;
          } else {
            nextStateTraverser = nextStateSuperParent;
          }
        }
        
        // If we did not find smToExit, traverse up "fromState" and see if it is contained in "nextState"
        State fromStateTraverser = fromState;
        while (fromStateTraverser.getStateMachine().getParentState() != null && !foundSmToExit) {
          if (fromStateTraverser.getStateMachine().getParentState().equals(nextState)) {
            smToExit = nextState.getStateMachine();
            foundSmToExit = true;
          } else {
            fromStateTraverser = fromStateTraverser.getStateMachine().getParentState();
          }
        }
        
        if (!foundSmToExit && fromStateTraverser.equals(nextStateTraverser)) {
          for (StateMachine nsm : fromStateTraverser.getStateMachine().getNestedStateMachines()) {
            if (nsm.getParentState().equals(fromStateTraverser)) {
              smToExit = nsm;
              break;
            }
          }
        }
      }
    } else if (nextState.getStateMachine().getParentState() != null) {
      // Need to see if "nextState" is contained within "fromState"
      State nextStateTraverser = nextState.getStateMachine().getParentState();
      while (nextStateTraverser.getStateMachine().getParentState() != null) {
        nextStateTraverser = nextStateTraverser.getStateMachine().getParentState();
      }
      if (nextStateTraverser.equals(fromState)) {
        for (StateMachine nsm : fromState.getStateMachine().getNestedStateMachines()) {
          if (nsm.getParentState().equals(fromState)) {
            smToExit = nsm;
            break;
          }
        }
      }
    }
    
    return smToExit;
  }


  /**
   * Issue 140/935 - A helper function to determine if a transition is an and-cross transition
   */
  // line 826 "../../../../src/StateMachine_Code.ump"
   public boolean isTransitionAndCross(State commonConcurrentParent){
    // We've already determined that fromState and nextState are in the same concurrent parent state
     // However, we need to check if fromState and nextState belong to different state machines
     // within the concurrent parent state
     StateMachine fromStateSm = fromState.getStateMachine();
     StateMachine nextStateSm = nextState.getStateMachine();
     
     while (!fromStateSm.getParentState().equals(commonConcurrentParent)) {
       fromStateSm = fromStateSm.getParentState().getStateMachine();
     }
     
     while (!nextStateSm.getParentState().equals(commonConcurrentParent)) {
       nextStateSm = nextStateSm.getParentState().getStateMachine();
     }
     return !fromStateSm.equals(nextStateSm);
  }


  /**
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ----------------------------------------------------------------------------
   * Please maintain this method if you're going to add new features to Transitions.
   * This code manually creates a clone of a Transitions.
   */
  // line 1502 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
  public Transition clone(State inFromState, State inNextState){
    Transition transition = new Transition(inFromState, inNextState);
  	transition.setAutoTransition(getAutoTransition());
  	transition.setIsInternal(getIsInternal());
  	transition.setPosition(getPosition());
  	transition.setEvent(getEvent().clone());
  	if (getAction()!=null) transition.setAction(getAction().clone());
  	transition.setGuard(getGuard());
  	return  transition;
  }


  /**
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ----------------------------------------------------------------------------
   */
  // line 1515 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
  public boolean isEqualToTransition(Transition inTransition){
    if (inTransition.equals(null)) return false;
    if (getAutoTransition()!=inTransition.getAutoTransition())  return false;
    if (!getAutoTransition() && !inTransition.getAutoTransition()){
    	if (!getEvent().compareWithAnotherEvent(inTransition.getEvent())) return false;
    }  
	  if (getGuard()!=null){
		  if (!getGuard().isEqualTo(inTransition.getGuard())) return false; 
	  } else {
	  	if (inTransition.getGuard()!=null) 	return false;
	  }
		/*
		 * The following comments try to compare actions of a transition. However, I noticed I don't need to do it in my algorithm because they have to be overwritten later.
		 * There are here for reference (I may need them later).
		 */
		//	  if (getAction()!=null){
		//	  	//Please the following equals API is generated automatically.It must be checked always and make sure it's correct.
		//		  if (!getAction().equals(inTransition.getAction())) return false; 
		//	  } else {
		//	  	if (inTransition.getAction()!=null) 	return false;
		//	  }
    return true;
  }


  public String toString()
  {
    return super.toString() + "["+
            "isInternal" + ":" + getIsInternal()+ "," +
            "autoTransition" + ":" + getAutoTransition()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "event = "+(getEvent()!=null?Integer.toHexString(System.identityHashCode(getEvent())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "fromState = "+(getFromState()!=null?Integer.toHexString(System.identityHashCode(getFromState())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "nextState = "+(getNextState()!=null?Integer.toHexString(System.identityHashCode(getNextState())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "guard = "+(getGuard()!=null?Integer.toHexString(System.identityHashCode(getGuard())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "action = "+(getAction()!=null?Integer.toHexString(System.identityHashCode(getAction())):"null");
  }
}
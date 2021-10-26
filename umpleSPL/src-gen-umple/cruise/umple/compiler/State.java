/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * One of the values in which a state machine can be at any given point in time
 * 
 * NEW CLASS****************************************
 * 
 */
// line 47 "../../../../src/StateMachine.ump"
// line 501 "../../../../src/StateMachine_Code.ump"
// line 1790 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
public class State implements Node
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //State Attributes
  private String name;
  private boolean isStartState;
  private boolean isInternal;
  private boolean isHistoryState;
  private boolean isDeepHistoryState;
  private boolean finalState;
  private boolean isVisited;
  private Position position;

  //State Associations
  private List<Activity> activities;
  private List<Action> actions;
  private StateMachine stateMachine;
  private List<StateMachine> nestedStateMachines;
  private List<Transition> transitions;
  private List<Transition> nextTransition;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public State(String aName, StateMachine aStateMachine)
  {
    name = aName;
    isStartState = false;
    isInternal = false;
    isHistoryState = false;
    isDeepHistoryState = false;
    finalState = false;
    isVisited = false;
    position = null;
    activities = new ArrayList<Activity>();
    actions = new ArrayList<Action>();
    boolean didAddStateMachine = setStateMachine(aStateMachine);
    if (!didAddStateMachine)
    {
      throw new RuntimeException("Unable to create state due to stateMachine. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    nestedStateMachines = new ArrayList<StateMachine>();
    transitions = new ArrayList<Transition>();
    nextTransition = new ArrayList<Transition>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsStartState(boolean aIsStartState)
  {
    boolean wasSet = false;
    isStartState = aIsStartState;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInternal(boolean aIsInternal)
  {
    boolean wasSet = false;
    isInternal = aIsInternal;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsHistoryState(boolean aIsHistoryState)
  {
    boolean wasSet = false;
    isHistoryState = aIsHistoryState;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDeepHistoryState(boolean aIsDeepHistoryState)
  {
    boolean wasSet = false;
    isDeepHistoryState = aIsDeepHistoryState;
    wasSet = true;
    return wasSet;
  }

  public boolean setFinalState(boolean aFinalState)
  {
    boolean wasSet = false;
    finalState = aFinalState;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsVisited(boolean aIsVisited)
  {
    boolean wasSet = false;
    isVisited = aIsVisited;
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

  public String getName()
  {
    return name;
  }

  public boolean getIsConcurrent()
  {
    return numberOfNestedStateMachines() > 1;
  }

  public boolean getIsStartState()
  {
    return isStartState;
  }

  /**
   * for code generation only e.g. ouside scope of nested state
   */
  public boolean getIsInternal()
  {
    return isInternal;
  }

  public boolean getIsHistoryState()
  {
    // line 68 "../../../../src/StateMachine.ump"
    if ("H".equals(name)) { isHistoryState = true; }
    // END OF UMPLE BEFORE INJECTION
    return isHistoryState;
  }

  public boolean getIsDeepHistoryState()
  {
    // line 69 "../../../../src/StateMachine.ump"
    if ("HStar".equals(name)) { isDeepHistoryState = true; }
    // END OF UMPLE BEFORE INJECTION
    return isDeepHistoryState;
  }

  public boolean getFinalState()
  {
    return finalState;
  }

  public boolean getIsVisited()
  {
    return isVisited;
  }

  /**
   * State mostRecentState; //will be in dot notation, if used by historyState, only look at first part?
   */
  public Position getPosition()
  {
    return position;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isIsConcurrent()
  {
    return numberOfNestedStateMachines() > 1;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsStartState()
  {
    return isStartState;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInternal()
  {
    return isInternal;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsHistoryState()
  {
    return isHistoryState;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsDeepHistoryState()
  {
    return isDeepHistoryState;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isFinalState()
  {
    // line 70 "../../../../src/StateMachine.ump"
    if ("Final".equals(name)) { finalState = true; }
    // END OF UMPLE BEFORE INJECTION
    return finalState;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsVisited()
  {
    return isVisited;
  }
  /* Code from template association_GetMany */
  public Activity getActivity(int index)
  {
    Activity aActivity = activities.get(index);
    return aActivity;
  }

  public List<Activity> getActivities()
  {
    List<Activity> newActivities = Collections.unmodifiableList(activities);
    return newActivities;
  }

  public int numberOfActivities()
  {
    int number = activities.size();
    return number;
  }

  public boolean hasActivities()
  {
    boolean has = activities.size() > 0;
    return has;
  }

  public int indexOfActivity(Activity aActivity)
  {
    int index = activities.indexOf(aActivity);
    return index;
  }
  /* Code from template association_GetMany */
  public Action getAction(int index)
  {
    Action aAction = actions.get(index);
    return aAction;
  }

  public List<Action> getActions()
  {
    List<Action> newActions = Collections.unmodifiableList(actions);
    return newActions;
  }

  public int numberOfActions()
  {
    int number = actions.size();
    return number;
  }

  public boolean hasActions()
  {
    boolean has = actions.size() > 0;
    return has;
  }

  public int indexOfAction(Action aAction)
  {
    int index = actions.indexOf(aAction);
    return index;
  }
  /* Code from template association_GetOne */
  public StateMachine getStateMachine()
  {
    return stateMachine;
  }
  /* Code from template association_GetMany */
  public StateMachine getNestedStateMachine(int index)
  {
    StateMachine aNestedStateMachine = nestedStateMachines.get(index);
    return aNestedStateMachine;
  }

  public List<StateMachine> getNestedStateMachines()
  {
    List<StateMachine> newNestedStateMachines = Collections.unmodifiableList(nestedStateMachines);
    return newNestedStateMachines;
  }

  public int numberOfNestedStateMachines()
  {
    int number = nestedStateMachines.size();
    return number;
  }

  public boolean hasNestedStateMachines()
  {
    boolean has = nestedStateMachines.size() > 0;
    return has;
  }

  public int indexOfNestedStateMachine(StateMachine aNestedStateMachine)
  {
    int index = nestedStateMachines.indexOf(aNestedStateMachine);
    return index;
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
  /* Code from template association_GetMany */
  public Transition getNextTransition(int index)
  {
    Transition aNextTransition = nextTransition.get(index);
    return aNextTransition;
  }

  public List<Transition> getNextTransition()
  {
    List<Transition> newNextTransition = Collections.unmodifiableList(nextTransition);
    return newNextTransition;
  }

  public int numberOfNextTransition()
  {
    int number = nextTransition.size();
    return number;
  }

  public boolean hasNextTransition()
  {
    boolean has = nextTransition.size() > 0;
    return has;
  }

  public int indexOfNextTransition(Transition aNextTransition)
  {
    int index = nextTransition.indexOf(aNextTransition);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfActivities()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Activity addActivity(String aActivityCode)
  {
    return new Activity(aActivityCode, this);
  }

  public boolean addActivity(Activity aActivity)
  {
    boolean wasAdded = false;
    if (activities.contains(aActivity)) { return false; }
    State existingState = aActivity.getState();
    boolean isNewState = existingState != null && !this.equals(existingState);
    if (isNewState)
    {
      aActivity.setState(this);
    }
    else
    {
      activities.add(aActivity);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeActivity(Activity aActivity)
  {
    boolean wasRemoved = false;
    //Unable to remove aActivity, as it must always have a state
    if (!this.equals(aActivity.getState()))
    {
      activities.remove(aActivity);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addActivityAt(Activity aActivity, int index)
  {  
    boolean wasAdded = false;
    if(addActivity(aActivity))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfActivities()) { index = numberOfActivities() - 1; }
      activities.remove(aActivity);
      activities.add(index, aActivity);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveActivityAt(Activity aActivity, int index)
  {
    boolean wasAdded = false;
    if(activities.contains(aActivity))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfActivities()) { index = numberOfActivities() - 1; }
      activities.remove(aActivity);
      activities.add(index, aActivity);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addActivityAt(aActivity, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfActions()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addAction(Action aAction)
  {
    boolean wasAdded = false;
    if (actions.contains(aAction)) { return false; }
    actions.add(aAction);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAction(Action aAction)
  {
    boolean wasRemoved = false;
    if (actions.contains(aAction))
    {
      actions.remove(aAction);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addActionAt(Action aAction, int index)
  {  
    boolean wasAdded = false;
    if(addAction(aAction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfActions()) { index = numberOfActions() - 1; }
      actions.remove(aAction);
      actions.add(index, aAction);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveActionAt(Action aAction, int index)
  {
    boolean wasAdded = false;
    if(actions.contains(aAction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfActions()) { index = numberOfActions() - 1; }
      actions.remove(aAction);
      actions.add(index, aAction);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addActionAt(aAction, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
  public boolean setStateMachine(StateMachine aStateMachine)
  {
    boolean wasSet = false;
    if (aStateMachine == null)
    {
      return wasSet;
    }

    StateMachine existingStateMachine = stateMachine;
    stateMachine = aStateMachine;
    if (existingStateMachine != null && !existingStateMachine.equals(aStateMachine))
    {
      existingStateMachine.removeState(this);
    }
    stateMachine.addState(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfNestedStateMachines()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addNestedStateMachine(StateMachine aNestedStateMachine)
  {
    boolean wasAdded = false;
    if (nestedStateMachines.contains(aNestedStateMachine)) { return false; }
    State existingParentState = aNestedStateMachine.getParentState();
    if (existingParentState == null)
    {
      aNestedStateMachine.setParentState(this);
    }
    else if (!this.equals(existingParentState))
    {
      existingParentState.removeNestedStateMachine(aNestedStateMachine);
      addNestedStateMachine(aNestedStateMachine);
    }
    else
    {
      nestedStateMachines.add(aNestedStateMachine);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeNestedStateMachine(StateMachine aNestedStateMachine)
  {
    boolean wasRemoved = false;
    if (nestedStateMachines.contains(aNestedStateMachine))
    {
      nestedStateMachines.remove(aNestedStateMachine);
      aNestedStateMachine.setParentState(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addNestedStateMachineAt(StateMachine aNestedStateMachine, int index)
  {  
    boolean wasAdded = false;
    if(addNestedStateMachine(aNestedStateMachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNestedStateMachines()) { index = numberOfNestedStateMachines() - 1; }
      nestedStateMachines.remove(aNestedStateMachine);
      nestedStateMachines.add(index, aNestedStateMachine);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveNestedStateMachineAt(StateMachine aNestedStateMachine, int index)
  {
    boolean wasAdded = false;
    if(nestedStateMachines.contains(aNestedStateMachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNestedStateMachines()) { index = numberOfNestedStateMachines() - 1; }
      nestedStateMachines.remove(aNestedStateMachine);
      nestedStateMachines.add(index, aNestedStateMachine);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addNestedStateMachineAt(aNestedStateMachine, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTransitions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Transition addTransition(State aNextState)
  {
    return new Transition(this, aNextState);
  }

  public boolean addTransition(Transition aTransition)
  {
    boolean wasAdded = false;
    if (transitions.contains(aTransition)) { return false; }
    State existingFromState = aTransition.getFromState();
    boolean isNewFromState = existingFromState != null && !this.equals(existingFromState);
    if (isNewFromState)
    {
      aTransition.setFromState(this);
    }
    else
    {
      transitions.add(aTransition);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTransition(Transition aTransition)
  {
    boolean wasRemoved = false;
    //Unable to remove aTransition, as it must always have a fromState
    if (!this.equals(aTransition.getFromState()))
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfNextTransition()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Transition addNextTransition(State aFromState)
  {
    return new Transition(aFromState, this);
  }

  public boolean addNextTransition(Transition aNextTransition)
  {
    boolean wasAdded = false;
    if (nextTransition.contains(aNextTransition)) { return false; }
    State existingNextState = aNextTransition.getNextState();
    boolean isNewNextState = existingNextState != null && !this.equals(existingNextState);
    if (isNewNextState)
    {
      aNextTransition.setNextState(this);
    }
    else
    {
      nextTransition.add(aNextTransition);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeNextTransition(Transition aNextTransition)
  {
    boolean wasRemoved = false;
    //Unable to remove aNextTransition, as it must always have a nextState
    if (!this.equals(aNextTransition.getNextState()))
    {
      nextTransition.remove(aNextTransition);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addNextTransitionAt(Transition aNextTransition, int index)
  {  
    boolean wasAdded = false;
    if(addNextTransition(aNextTransition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNextTransition()) { index = numberOfNextTransition() - 1; }
      nextTransition.remove(aNextTransition);
      nextTransition.add(index, aNextTransition);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveNextTransitionAt(Transition aNextTransition, int index)
  {
    boolean wasAdded = false;
    if(nextTransition.contains(aNextTransition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNextTransition()) { index = numberOfNextTransition() - 1; }
      nextTransition.remove(aNextTransition);
      nextTransition.add(index, aNextTransition);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addNextTransitionAt(aNextTransition, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=activities.size(); i > 0; i--)
    {
      Activity aActivity = activities.get(i - 1);
      aActivity.delete();
    }
    actions.clear();
    StateMachine placeholderStateMachine = stateMachine;
    this.stateMachine = null;
    if(placeholderStateMachine != null)
    {
      placeholderStateMachine.removeState(this);
    }
    while( !nestedStateMachines.isEmpty() )
    {
      nestedStateMachines.get(0).setParentState(null);
    }
    for(int i=transitions.size(); i > 0; i--)
    {
      Transition aTransition = transitions.get(i - 1);
      aTransition.delete();
    }
    for(int i=nextTransition.size(); i > 0; i--)
    {
      Transition aNextTransition = nextTransition.get(i - 1);
      aNextTransition.delete();
    }
  }

  // line 506 "../../../../src/StateMachine_Code.ump"
   public boolean isSameState(State state, StateMachine relativeTo){
    if (this.equals(state))
    {
      return true;
    }
    
    State mySuper = findSuperState(this,relativeTo);
    State yourSuper = findSuperState(state,relativeTo);
    return mySuper != null && mySuper.equals(yourSuper);
  }


  /**
   * return true of this is a substate of or same as possibleSuperState
   */
  // line 518 "../../../../src/StateMachine_Code.ump"
   public boolean isSubstateOf(State possibleSuperState){
    if(this.equals(possibleSuperState)) {
      return true;
    }
    State parent = this.getStateMachine().getParentState();
    if(parent == null) {
      return false;
    }
    else {
      return parent.isSubstateOf(possibleSuperState);
    }
  }

  // line 532 "../../../../src/StateMachine_Code.ump"
   private State findSuperState(State me, StateMachine lookFor){
    if (me == null || lookFor == null)
    {
      return null;
    }
    else if (lookFor.equals(me.getStateMachine()))
    {
      return me;
    }
    else
    {
      return findSuperState(me.getStateMachine().getParentState(),lookFor);
    }
  }


  /**
   * Issue 519
   */
  // line 549 "../../../../src/StateMachine_Code.ump"
   public boolean deleteTransition(Transition aTransition){
    boolean wasRemoved = false;
    
    if (this.equals(aTransition.getFromState()))
    {
      transitions.remove(aTransition);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  // line 561 "../../../../src/StateMachine_Code.ump"
   public Transition addTransition(State nextState, int index){
    Transition newTransition = new Transition(this,nextState);
    transitions.remove(newTransition);
    transitions.add(index,newTransition);
    return newTransition;
  }

  // line 569 "../../../../src/StateMachine_Code.ump"
   public void addAction(Action newAction, int index){
    addAction(newAction);
    actions.remove(newAction);
    actions.add(index,newAction);
  }

  // line 576 "../../../../src/StateMachine_Code.ump"
   public String getType(){
    return numberOfTransitions() == 0 && numberOfNestedStateMachines() == 0 && numberOfActions() == 0 ? "Simple" : "Complex";
  }

  // line 581 "../../../../src/StateMachine_Code.ump"
   public String newTimedEventName(State toState){
    String templateName;
    if (toState == null)
    {
      templateName = "timeout"+ name  + "To";
    }
    else
    {
      templateName = "timeout"+ name  + "To" + toState.name;
    }
  
    String currentName = templateName;
    int index = 2;
    while (stateMachine.getEvent(currentName) != null)
    {
      currentName = templateName + index;
      index += 1;
    }
    return currentName;
  }

  // line 603 "../../../../src/StateMachine_Code.ump"
   public List<Transition> getTransitionsFor(Event e){
    List<Transition> all = new ArrayList<Transition>();
    for(Transition aTransition : transitions)
    {
      if (e.equals(aTransition.getEvent()))
      {
        all.add(aTransition);
      }
    }
    return all;
  }

  // line 616 "../../../../src/StateMachine_Code.ump"
   public boolean getHasExitAction(){
    return getHasAction("exit");
  }

  // line 621 "../../../../src/StateMachine_Code.ump"
   public boolean getHasEntryAction(){
    return getHasAction("entry");
  }

  // line 626 "../../../../src/StateMachine_Code.ump"
   private boolean getHasAction(String actionType){
    for(Action action : getActions())
    {
      if (actionType.equals(action.getActionType()))
      {
        return true;
      }
    }
    return false;
  }


  /**
   * @author: Vahdat
   */
  // line 641 "../../../../src/StateMachine_Code.ump"
   public List<Action> getActionsByType(String actionType){
    List<Action> actions = new ArrayList<Action>(); 
	  for(Action action : getActions())
	  {
	    if (actionType.equals(action.getActionType()))
	    {
	    	actions.add(action);
	    }
	  }
	  return actions;
  }

  // line 654 "../../../../src/StateMachine_Code.ump"
   public StateMachine exitableStateMachine(State nextState){
    if (getHasExitAction() && !equals(nextState))
    {
      return getStateMachine();
    }
    State currentState = getStateMachine().getParentState();
    while (currentState != null)
    {
      StateMachine sm = currentState.getStateMachine();
      if (currentState.getHasExitAction() && !currentState.equals(nextState))
      {
        return sm;
      }
      else
      {
        currentState = sm.getParentState();
      }
    }
    return null;
  }

  // line 676 "../../../../src/StateMachine_Code.ump"
   public StateMachine exitableSelfTransition(State nextState){
    if (getHasExitAction() && equals(nextState))
    {
      return getStateMachine();
    }
    return null;
  }

  // line 685 "../../../../src/StateMachine_Code.ump"
   public void visit(){
    this.isVisited = true;
  }

  // line 690 "../../../../src/StateMachine_Code.ump"
   public void clear(){
    this.isVisited = false;
  }

  // line 695 "../../../../src/StateMachine_Code.ump"
   public boolean isVisited(){
    return this.isVisited;
  }


  /**
   * Issue 935
   * A helper function to obtain the concurrent parent state
   */
  // line 702 "../../../../src/StateMachine_Code.ump"
   public State getConcurrentParentState(){
    State concurrentParentState = getStateMachine().getParentState();
    while (concurrentParentState != null) {
      if (concurrentParentState.getIsConcurrent()) {
        return concurrentParentState;
      } else {
        concurrentParentState = concurrentParentState.getStateMachine().getParentState();
      }
    }
    return null;
  }


  /**
   * Issue 140
   * A helper function to obtain the concurrent region
   */
  // line 717 "../../../../src/StateMachine_Code.ump"
   public State getConcurrentRegion(){
    State concurrentRegion = getConcurrentParentState();
    if (concurrentRegion != null) {
      State traverser = concurrentRegion.getStateMachine().getParentState();
      while (traverser != null) {
        if (traverser.getIsConcurrent()) {
          concurrentRegion = traverser;
        }
        traverser = traverser.getStateMachine().getParentState();
      }
    } else if (this.getIsConcurrent()) {
      concurrentRegion = this;
    }
    return concurrentRegion;
  }


  /**
   * Issue 1351
   * A helper function to obtain the root state machine
   */
  // line 736 "../../../../src/StateMachine_Code.ump"
   public StateMachine getRootStateMachine(){
    State runner = this;
	  while (runner.getStateMachine().getParentState() != null) {
		  runner = runner.getStateMachine().getParentState();
	  }
	  return runner.getStateMachine();
  }


  /**
   * 
   * @author Vahdat
   * Please maintain this method if you're going to add new features to states.
   * This code manually creates a clone of a state.
   * This method clones the state and also return the list of transitions that their destinations are not available yet in the duplicated state machine.
   */
  // line 1798 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
  public State clone(List<Transition> inTransitions, StateMachine inStateMachine){
    State newState = new State(getName(), inStateMachine);
    newState.setFinalState(getFinalState());
    newState.setIsDeepHistoryState(getIsDeepHistoryState());
    newState.setIsHistoryState(getIsHistoryState());
    newState.setIsInternal(getIsInternal());
    newState.setIsStartState(getIsStartState());
    newState.setIsVisited(getIsVisited());
    newState.setPosition(getPosition());
  
  	for (int i = 0; i < getNestedStateMachines().size(); i++) {
			StateMachine newSTM = nestedStateMachines.get(i).clone(inTransitions,newState);
			newState.addNestedStateMachine(newSTM);
		}
  	for (Action action : actions) {
  		newState.addAction(action.clone());
		}
   	for (Activity activity : activities){
  		newState.addActivity(activity.clone(newState));
  	}
  	for (Transition transition : getTransitions()){
  		State fromState = inStateMachine.findState(transition.getFromState().getName(),true);
			State nextState = inStateMachine.findState(transition.getNextState().getName(),true);
			if (fromState!=null && nextState!=null ){
				transition.clone(fromState, nextState);
			} else{
				inTransitions.add(transition);
			}		
  	}
  	return newState;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "isConcurrent" + ":" + getIsConcurrent()+ "," +
            "isStartState" + ":" + getIsStartState()+ "," +
            "isInternal" + ":" + getIsInternal()+ "," +
            "isHistoryState" + ":" + getIsHistoryState()+ "," +
            "isDeepHistoryState" + ":" + getIsDeepHistoryState()+ "," +
            "finalState" + ":" + getFinalState()+ "," +
            "isVisited" + ":" + getIsVisited()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "stateMachine = "+(getStateMachine()!=null?Integer.toHexString(System.identityHashCode(getStateMachine())):"null");
  }
}
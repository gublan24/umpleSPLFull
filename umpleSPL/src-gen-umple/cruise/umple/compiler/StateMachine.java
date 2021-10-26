/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.*;
import java.util.*;

/**
 * An entity in a running program that can have a set of values (states) and which
 * changes values by taking transitions in response to various events.
 * Fragment source file: StateMachine.ump
 * Line : 37
 * Fragment source file: StateMachine.ump
 * Line : 29
 * 
 * NEW CLASS****************************************
 * 
 */
// line 18 "../../../../src/StateMachine.ump"
// line 14 "../../../../src/StateMachine_Code.ump"
// line 159 "../../../../src/Trait_refactored.ump"
// line 163 "../../../../src/Trait_refactored.ump"
// line 1679 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
public class StateMachine
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateMachine Attributes
  private int recentSearchDepth;
  private String name;
  private boolean containsHistoryState;
  private boolean containsDeepHistoryState;
  private boolean queued;
  private boolean pooled;

  //StateMachine Associations
  private UmpleClass umpleClass;
  private State parentState;
  private UmpleTrait umpleTrait;
  private List<State> states;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetParentState;
  private boolean canSetName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateMachine(String aName)
  {
    cachedHashCode = -1;
    canSetParentState = true;
    canSetName = true;
    recentSearchDepth = -1;
    name = aName;
    containsHistoryState = false;
    containsDeepHistoryState = false;
    queued = false;
    pooled = false;
    states = new ArrayList<State>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRecentSearchDepth(int aRecentSearchDepth)
  {
    boolean wasSet = false;
    recentSearchDepth = aRecentSearchDepth;
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

  public boolean setContainsHistoryState(boolean aContainsHistoryState)
  {
    boolean wasSet = false;
    containsHistoryState = aContainsHistoryState;
    wasSet = true;
    return wasSet;
  }

  public boolean setContainsDeepHistoryState(boolean aContainsDeepHistoryState)
  {
    boolean wasSet = false;
    containsDeepHistoryState = aContainsDeepHistoryState;
    wasSet = true;
    return wasSet;
  }

  public boolean setQueued(boolean aQueued)
  {
    boolean wasSet = false;
    queued = aQueued;
    wasSet = true;
    return wasSet;
  }

  public boolean setPooled(boolean aPooled)
  {
    boolean wasSet = false;
    pooled = aPooled;
    wasSet = true;
    return wasSet;
  }

  public int getRecentSearchDepth()
  {
    return recentSearchDepth;
  }

  public String getName()
  {
    return name;
  }

  public boolean getContainsHistoryState()
  {
    return containsHistoryState;
  }

  public boolean getContainsDeepHistoryState()
  {
    return containsDeepHistoryState;
  }

  /**
   * before getContainsHistoryState { if ("H".equals(name)) { containsHistoryState = true; } }
   * before getContainsDeepHistoryState { if ("HStar".equals(name)) { containsDeepHistoryState = true; } }
   */
  public boolean getQueued()
  {
    return queued;
  }

  public boolean getPooled()
  {
    return pooled;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isContainsHistoryState()
  {
    return containsHistoryState;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isContainsDeepHistoryState()
  {
    return containsDeepHistoryState;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isQueued()
  {
    return queued;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isPooled()
  {
    return pooled;
  }
  /* Code from template association_GetOne */
  public UmpleClass getUmpleClass()
  {
    return umpleClass;
  }

  public boolean hasUmpleClass()
  {
    boolean has = umpleClass != null;
    return has;
  }
  /* Code from template association_GetOne */
  public State getParentState()
  {
    return parentState;
  }

  public boolean hasParentState()
  {
    boolean has = parentState != null;
    return has;
  }
  /* Code from template association_GetOne */
  public UmpleTrait getUmpleTrait()
  {
    return umpleTrait;
  }

  public boolean hasUmpleTrait()
  {
    boolean has = umpleTrait != null;
    return has;
  }
  /* Code from template association_GetMany */
  public State getState(int index)
  {
    State aState = states.get(index);
    return aState;
  }

  public List<State> getStates()
  {
    List<State> newStates = Collections.unmodifiableList(states);
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

  public int indexOfState(State aState)
  {
    int index = states.indexOf(aState);
    return index;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    // line 33 "../../../../src/StateMachine.ump"
    if (aUmpleClass != null && aUmpleClass.isImmutable()) { return false; }
    // END OF UMPLE BEFORE INJECTION
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeStateMachine(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addStateMachine(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setParentState(State aParentState)
  {
    boolean wasSet = false;
    if (!canSetParentState) { return false; }
    State existingParentState = parentState;
    parentState = aParentState;
    if (existingParentState != null && !existingParentState.equals(aParentState))
    {
      existingParentState.removeNestedStateMachine(this);
    }
    if (aParentState != null)
    {
      aParentState.addNestedStateMachine(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleTrait(UmpleTrait aUmpleTrait)
  {
    boolean wasSet = false;
    // line 159 "../../../../src/Trait_refactored.ump"
    if (aUmpleTrait != null && aUmpleTrait.isImmutable()) { return false; }
    // END OF UMPLE BEFORE INJECTION
    UmpleTrait existingUmpleTrait = umpleTrait;
    umpleTrait = aUmpleTrait;
    if (existingUmpleTrait != null && !existingUmpleTrait.equals(aUmpleTrait))
    {
      existingUmpleTrait.removeStateMachine(this);
    }
    if (aUmpleTrait != null)
    {
      aUmpleTrait.addStateMachine(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStates()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public State addState(String aName)
  {
    return new State(aName, this);
  }

  public boolean addState(State aState)
  {
    boolean wasAdded = false;
    if (states.contains(aState)) { return false; }
    StateMachine existingStateMachine = aState.getStateMachine();
    boolean isNewStateMachine = existingStateMachine != null && !this.equals(existingStateMachine);
    if (isNewStateMachine)
    {
      aState.setStateMachine(this);
    }
    else
    {
      states.add(aState);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeState(State aState)
  {
    boolean wasRemoved = false;
    //Unable to remove aState, as it must always have a stateMachine
    if (!this.equals(aState.getStateMachine()))
    {
      states.remove(aState);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStateAt(State aState, int index)
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

  public boolean addOrMoveStateAt(State aState, int index)
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

    StateMachine compareTo = (StateMachine)obj;
  
    if (getParentState() == null && compareTo.getParentState() != null)
    {
      return false;
    }
    else if (getParentState() != null && !getParentState().equals(compareTo.getParentState()))
    {
      return false;
    }

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
    if (getParentState() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getParentState().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }
    if (getName() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getName().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetParentState = false;
    canSetName = false;
    return cachedHashCode;
  }

  public void delete()
  {
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeStateMachine(this);
    }
    if (parentState != null)
    {
      State placeholderParentState = parentState;
      this.parentState = null;
      placeholderParentState.removeNestedStateMachine(this);
    }
    if (umpleTrait != null)
    {
      UmpleTrait placeholderUmpleTrait = umpleTrait;
      this.umpleTrait = null;
      placeholderUmpleTrait.removeStateMachine(this);
    }
    for(int i=states.size(); i > 0; i--)
    {
      State aState = states.get(i - 1);
      aState.delete();
    }
  }

  // line 19 "../../../../src/StateMachine_Code.ump"
   public boolean getHasExitAction(){
    return getHasAction("exit");
  }

  // line 24 "../../../../src/StateMachine_Code.ump"
   public boolean getHasEntryAction(){
    return getHasAction("entry");
  }

  // line 29 "../../../../src/StateMachine_Code.ump"
   private boolean getHasAction(String actionType){
    for(State state : getStates())
    {
      for(Action action : state.getActions())
      {
        if (actionType.equals(action.getActionType()))
        {
          return true;
        }
      }
    }
    return false;
  }

  // line 44 "../../../../src/StateMachine_Code.ump"
   public Event getEvent(String eventName){
    if (eventName == null)
    {
      return null;
    }
    for (State aState : states)
    {
      for (int i=0; i<aState.numberOfTransitions(); i++)
      {
        Transition aTransition = aState.getTransition(i);
        Event e = aTransition.getEvent();
        if (e != null && eventName.equals(e.getName()))
        {
          return e;
        }
      }
    }
    return null;
  }

  // line 64 "../../../../src/StateMachine_Code.ump"
   public List<Guard> getAllGuards(){
    List<Guard> allGuards = new ArrayList<Guard>();
		for( Transition transition : getAllTransitions() ) {
			if( transition.getGuard() != null && !has(allGuards, transition.getGuard())) {
				Guard guard = transition.getGuard();
				allGuards.add( guard );
			}
		}
		return allGuards;
  }

  // line 76 "../../../../src/StateMachine_Code.ump"
   public List<Event> getAllEvents(){
    ArrayList<Event> allEvents = new ArrayList<Event>();
    ArrayList<StateMachine> allSearch = new ArrayList<StateMachine>();
    ArrayList<StateMachine> alreadySearched = new ArrayList<StateMachine>();
    allSearch.add(this);
    while (!allSearch.isEmpty())
    {
      StateMachine sm = allSearch.remove(0);
      if (alreadySearched.contains(sm))
      {
        continue;
      }
      alreadySearched.add(sm);
      if (sm.getParentState() != null)
      {
        allSearch.add(sm.getParentState().getStateMachine());
        allSearch.addAll(sm.getParentState().getNestedStateMachines());
      }
      for (State aState : sm.states)
      {
        allSearch.addAll(aState.getNestedStateMachines());
        for (int i=0; i<aState.numberOfTransitions(); i++)
        {
          
          Transition aTransition = aState.getTransition(i);
          Event e = aTransition.getEvent();
          if (e != null && !allEvents.contains(e))
          {
            allEvents.add(e);
          }
        }
      }
    }
    return allEvents;
  }

  // line 113 "../../../../src/StateMachine_Code.ump"
   public List<Event> getEvents(){
    ArrayList<Event> allEvents = new ArrayList<Event>();
    
    for (State aState : states)
    {
      for (int i=0; i<aState.numberOfTransitions(); i++)
      {
        Transition aTransition = aState.getTransition(i);
        Event e = aTransition.getEvent();
        if (e != null && !allEvents.contains(e))
        {
          allEvents.add(e);
        }
      }
    }
    return allEvents;
  }

  // line 132 "../../../../src/StateMachine_Code.ump"
   public ArrayList<Transition> getAllTransitions(){
    ArrayList<Transition> allTransitions = new ArrayList<Transition>();
    ArrayList<StateMachine> allStateMachines = new ArrayList<StateMachine>();
    allStateMachines.add(this);
    addNestedStateMachinesTo(allStateMachines, this);
    for (StateMachine sm : allStateMachines)
    {
      for (State state : sm.getStates())
      {
        for (Transition t : state.getTransitions())
        {
					//preventing duplicated transitions (Issue #760) - Temporary solution to facilitate analyzable output by nuXmv code generator...
					if( !has(allTransitions, t) )
          	allTransitions.add(t);
        }
      }
    }
    return allTransitions;
  }


  /**
   * Issue 519
   */
  // line 165 "../../../../src/StateMachine_Code.ump"
   public boolean deleteState(State aState){
    boolean wasRemoved = false;
    //Unable to remove aState, as it must always have a stateMachine
    if (this.equals(aState.getStateMachine()))
    {
      states.remove(aState);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  // line 177 "../../../../src/StateMachine_Code.ump"
   public State getDeepHistoryState(){
    for (State s : this.getStates())
    {
      if (s.getIsDeepHistoryState() == true)
      {
          return s;
      }
    }
    return null;
  }

  // line 189 "../../../../src/StateMachine_Code.ump"
   public State findState(String aName){
    boolean isFinal = "Final".equals(aName);
    boolean searchNestedStateMachines = !isFinal;
    boolean isAtRoot = isFinal;
    return findState(aName,searchNestedStateMachines,isAtRoot);
  }

  // line 197 "../../../../src/StateMachine_Code.ump"
   public State findState(String aName, boolean searchNestedStateMachines){
    boolean isFinal = "Final".equals(aName);
    searchNestedStateMachines = !isFinal && searchNestedStateMachines;
    boolean isAtRoot = isFinal;
    return findState(aName,searchNestedStateMachines,isAtRoot);
  }

  // line 205 "../../../../src/StateMachine_Code.ump"
   public List<State> getFinalStates(){
    List<StateMachine> all = new ArrayList<StateMachine>();
    all.add(this);
    all.addAll(getNestedStateMachines());
    return getFinalStatesIn(all);
  }

  // line 213 "../../../../src/StateMachine_Code.ump"
   public boolean hasFinalStates(){
    return !getFinalStates().isEmpty();
  }

  // line 218 "../../../../src/StateMachine_Code.ump"
   private List<State> getFinalStatesIn(List<StateMachine> allStateMachines){
    List<State> all = new ArrayList<State>();
    for (StateMachine sm : allStateMachines)
    {
      for(State s : sm.getStates())
      {
        if (s.isFinalState())
        {
          all.add(s);
          break;
        }
      }
    }
    return all;
  }

  // line 235 "../../../../src/StateMachine_Code.ump"
   public Event findOrCreateEvent(String aName){
    for (Event aEvent : getAllEvents())
    {
      if (aEvent.getName().equals(aName))
      {
        return aEvent;
      }
    }  
    return new Event(aName);
  }

  // line 247 "../../../../src/StateMachine_Code.ump"
   public State getStartState(){
    for (State aState : states)
    {
      if (aState.getIsStartState())
      {
        return aState;
      }
    }
    return null;
  }

  // line 259 "../../../../src/StateMachine_Code.ump"
   public State getNullState(){
    for (State aState : states)
    {
      if (aState.getName() == "Null")
      {
        return aState;
      }
    }
    return null;
  }

  // line 271 "../../../../src/StateMachine_Code.ump"
   public String getType(){
    for (State aState : states)
    {
      if (aState.getType() == "Complex")
      {
        return "Complex";
      }
    }
    return "Simple";
  }

  // line 283 "../../../../src/StateMachine_Code.ump"
   public List<StateMachine> getNestedStateMachines(){
    return getNestedStateMachines(true); // original - do it recursively
  }

  // line 288 "../../../../src/StateMachine_Code.ump"
   public List<StateMachine> getImmediateNestedStateMachines(){
    return getNestedStateMachines(false); // just next level
  }

  // line 293 "../../../../src/StateMachine_Code.ump"
   private List<StateMachine> getNestedStateMachines(boolean recursive){
    ArrayList<StateMachine> all = new ArrayList<StateMachine>();
    addNestedStateMachinesTo(all,this, recursive);
    return all;
  }

  // line 300 "../../../../src/StateMachine_Code.ump"
   private void addNestedStateMachinesTo(List<StateMachine> all, StateMachine sm){
    addNestedStateMachinesTo(all, sm, true);
  }

  // line 305 "../../../../src/StateMachine_Code.ump"
   private void addNestedStateMachinesTo(List<StateMachine> all, StateMachine sm, boolean recursive){
    for (State s : sm.states)
    {
      for (StateMachine nestedSm : s.getNestedStateMachines())
      {
        all.add(nestedSm);
        if(recursive) addNestedStateMachinesTo(all, nestedSm, recursive);
      }
    }
  }

  // line 317 "../../../../src/StateMachine_Code.ump"
   public State findStateDotNotaion(String aName){
    //TODO: add suport to look deeper first
    //look at this level for first name in s1.s2.s3, then check nested sms for s1
    //then go up until you find then go down
    
    StateMachine root = this;
    State state;
    
    String[] stateNames = aName.split("\\.");
    int stateNameIndex = 0;
    String stateNameToFind = stateNames[stateNameIndex];
    
    //find first state in dot notation by looking at level of transition
    //then looking in each parent state machine until at top
    while (true)
    {
      state = root.findState(stateNameToFind, false);
      if (state != null)//we found the first state
      {
        root = state.getStateMachine();
        break;
      }
      else
      {
        state = root.getParentState();
        if(state == null){return null;}
        root = state.getStateMachine();
      }
    }
    
    //Starting at the state found above, search nested state machines for the 
    //next item in stateNames until at end of stateNames
    stateNameIndex = 1;
    while(stateNameIndex < stateNames.length)
    {
      State tmpState = null;
      stateNameToFind = stateNames[stateNameIndex];
      for (StateMachine sm : state.getNestedStateMachines())
      {  
        tmpState = sm.findState(stateNameToFind, false);
        if(tmpState != null){
          break;}
      }
      //if the next state in dot noation is not found in previous state in dot notation, return null
      state = tmpState;
      if(state == null){return null;}
             
      stateNameIndex += 1;
    }
    
    return state;
  }

  // line 372 "../../../../src/StateMachine_Code.ump"
   private State findState(String aName, boolean searchNestedStateMachines, boolean didFindRoot){
    StateMachine root = this;
    if (!didFindRoot && searchNestedStateMachines)
    {
      root = getRootStateMachine();
    }
    
    for (State aState : root.states)
    {
      if (aState.getName().indexOf('.') > 0)
      {
        //this is a state in placeHolderStateMachine saved from a transition
        //that used dot-notation to transition to a state that hadn't been declared yet
        if (aName.endsWith(aState.getName()))//aName must be in dot notation
        {
          root.recentSearchDepth=0;
          return aState;
        }
      }
      if (aState.getName().equals(aName))
      {
        root.recentSearchDepth=0;
        return aState;
      }
      
      if (searchNestedStateMachines)
      {
        for (StateMachine nestedSm : aState.getNestedStateMachines()) 
        {
          State potentialMatch = nestedSm.findState(aName,true,true);
          if (potentialMatch != null)
          {
            recentSearchDepth=nestedSm.recentSearchDepth+2;
            return potentialMatch;
          } 
        }
      }
    }
    //must be last so that searching placeHolderStateMachine for states that
    //were declared in a transition earlier works
    if(aName.indexOf('.') > 0)
    {
      return findStateDotNotaion(aName);
    }
    return null;
  }

  // line 420 "../../../../src/StateMachine_Code.ump"
   public StateMachine getRootStateMachine(){
    StateMachine root = this;
    
    State parent = getParentState();
    while (parent != null)
    {
      root = parent.getStateMachine();
      parent = root.getParentState();
    }
    
    return root;
  }

  // line 434 "../../../../src/StateMachine_Code.ump"
   public String getFullName(){
    if (getParentState() == null)
    {
      return name;
    }
    else
    {
      // Issue 1001 - Append the name of the composite state that the concurrent state machine is in
      String appendToFullName = name;
      if (getParentState().getIsConcurrent()) 
      {
        if(!getParentState().getName().equals(getParentState().getStateMachine().getName())) 
        {
        	appendToFullName = parentState.getName() + "." + appendToFullName;
        }
      }
      return getParentState().getStateMachine().getFullName() + StringFormatter.toPascalCase(appendToFullName);
    }
  }

  // line 455 "../../../../src/StateMachine_Code.ump"
   public State addState(String aName, int index){
    State newState = new State(aName,this);
    states.remove(newState);
    states.add(index,newState);
    return newState;
  }


  /**
   * Issue 935 - A helper function to retrieve the super state machine (state machine that has no parent state)
   */
  // line 466 "../../../../src/StateMachine_Code.ump"
   public StateMachine getSuperStateMachine(){
    if (getParentState() == null) 
    {
      return this;
    } 
    else 
    {
      StateMachine superStateMachine = getParentState().getStateMachine();
      while(superStateMachine.getParentState() != null) 
      {
        superStateMachine = superStateMachine.getParentState().getStateMachine();
      }
      return superStateMachine;
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 484 "../../../../src/StateMachine_Code.ump"
   public Event getEventByMethod(Method inMethod){
    if (inMethod == null)
    {
      return null;
    }
    for (Transition aTransition  : getAllTransitions()) {
      Event e = aTransition.getEvent();
      if (e != null )
      {
        Method m = new Method("",e.getName(),e.getType(),false);
        m.setMethodParameters(e.getParams());
        if (m.compareWithTheMethod(inMethod))  return e;
      }
    }
    return null;
  }


  /**
   * Please maintain this method if you're going to add new features to state machines.
   * This code manually creates a clone of a state machine.
   */
  // line 1684 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   public StateMachine clone(){
    StateMachine newSTM = new StateMachine(getName());
    newSTM.setContainsDeepHistoryState(getContainsDeepHistoryState());
    newSTM.setContainsHistoryState(getContainsHistoryState());
    newSTM.setPooled(getPooled());
    newSTM.setQueued(getQueued());
    newSTM.setRecentSearchDepth(getRecentSearchDepth());
    newSTM.setUmpleClass(getUmpleClass());
    newSTM.setUmpleTrait(getUmpleTrait());
 	
    //duplicate states of the system 
  	List<Transition> notClonedTransitions = new ArrayList<Transition>();
  	for (State st : getStates()) {
  			State newState = st.clone(notClonedTransitions,newSTM);
  			newSTM.addState(newState);
		}
  	
  	//create transitions that their destinations were not available.
  	for(Iterator<Transition> iternator = notClonedTransitions.iterator(); iternator.hasNext();){
  		Transition transition = iternator.next();
  		State fromState = newSTM.findState(transition.getFromState().getName(),true);
  		State nextState = newSTM.findState(transition.getNextState().getName(),true);
 			if (fromState!=null  && nextState!=null ){
 				transition.clone(fromState, nextState);
 				iternator.remove();
 			}
  	}
  	return  newSTM;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * 
   * @author Vahdat
   * @param inTransitions the list of transitions that couldn't be cloned because their either source or destination have not been duplicated yet.
   * @param parentState the state which includes this state machines as its nested state machines.
   * @return returns a new state machines
   * Please maintain this method if you're going to add new features to state machines.
   * This code manually creates a clone of a state machine.
   * This method must be called through states which have a nested state machines.
   * 
   */
  // line 1726 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   public StateMachine clone(List<Transition> inTransitions, State parentState){
    StateMachine newSTM = new StateMachine(getName());
  	newSTM.setParentState(parentState);
  	
    //duplicate states of the system 
  	for (State st : getStates()) {
  			State newState = st.clone(inTransitions,newSTM);
  			newSTM.addState(newState);
		}
  	return newSTM;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1740 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   public State findStateBasedOnSequence(String [] inSequence){
    State foundState =null;
    StateMachine smTemp = this;    
      for(int i = 0; i<inSequence.length;i++){
        if(i % 2==0) {
          foundState = smTemp.findState(inSequence[i], false);
          smTemp = null;
          if(foundState==null) return null;
        } else {
          for(StateMachine nSM:foundState.getNestedStateMachines()){
            if(nSM.getName().equals(inSequence[i])){
              smTemp = nSM;
              foundState=null;
              break;
            }
          }
          if(smTemp==null) return null ;
       }
    }
    return foundState;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1764 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   public StateMachine findRegionBasedOnSequence(String [] inSequence){
    State foundState =null;
    StateMachine smTemp = this;    
      for(int i = 0; i<inSequence.length;i++){
        if(i % 2==0) {
          foundState = smTemp.findState(inSequence[i], false);
          smTemp = null;
          if(foundState==null) return null;
        } else {
          for(StateMachine nSM:foundState.getNestedStateMachines()){
            if(nSM.getName().equals(inSequence[i])){
              smTemp = nSM;
              foundState=null;
              break;
            }
          }
          if(smTemp==null) return null ;
       }
    }
    return smTemp;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "recentSearchDepth" + ":" + getRecentSearchDepth()+ "," +
            "containsHistoryState" + ":" + getContainsHistoryState()+ "," +
            "containsDeepHistoryState" + ":" + getContainsDeepHistoryState()+ "," +
            "queued" + ":" + getQueued()+ "," +
            "pooled" + ":" + getPooled()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "parentState = "+(getParentState()!=null?Integer.toHexString(System.identityHashCode(getParentState())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleTrait = "+(getUmpleTrait()!=null?Integer.toHexString(System.identityHashCode(getUmpleTrait())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 151 "../../../../src/StateMachine_Code.ump"
  private <E> boolean has ( List<E> objectList, E whatToFind ) 
  {
    boolean yes = false;
  	for(E st : objectList) {
  		if( st.equals(whatToFind) ) {
  			yes = true;
  			break;
  		}
  	}
  	return yes;
  }

  
}
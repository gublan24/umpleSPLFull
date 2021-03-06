/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import cruise.umple.compiler.*;
import java.util.*;

/**
 * use ../generators/NuSMV/NuSMVCoordinationUnit.ump;
 */
// line 5 "../../../../src/ModelOptimizationEngine.ump"
public class ModelOptimizer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelOptimizer()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 13 "../../../../src/ModelOptimizationEngine.ump"
   public StateMachine optimize(StateMachine smn){
    StateMachine sm = smn.clone();
		List<Transition> transitions = sm.getAllTransitions();
		System.out.println( transitions.size() );

		HashMap<State, TargetConfiguration> map = new HashMap<State, TargetConfiguration>();
		ExplorationResult result = optimize( sm, createCopy( sm ), map );
		StateMachine machine = result.getStateMachine();
		System.out.println( map.size() );
		//printTable( map );


		NuSMVCoordinator coord = new NuSMVCoordinator();
		List<StateMachine> machines = coord.generateStateMachineList( result.getStateMachine() );
		//System.out.println(machines.size());
		//for( State st : machine.getStates() )
		for( StateMachine smm : getStateMachines( machine ) )
			printStatesOf( smm );
		setTransition( machine, transitions, map );
		return machine;
  }

  // line 36 "../../../../src/ModelOptimizationEngine.ump"
   private List<StateMachine> getStateMachines(StateMachine machine){
    List<StateMachine> machines = new ArrayList<StateMachine>();
		if( machine.getParentState() == null )
			machines.add( machine );

		for( State state : machine.getStates() )
			for( StateMachine nMachine : getRegions( state ) ) {
				machines.add( nMachine );
				for( StateMachine ourMachine : getStateMachines( nMachine ) )
					machines.add( ourMachine );
			}
			return machines;
  }


  /**
   * /////////////////////////////////////////////////////// Utilities
   */
  // line 53 "../../../../src/ModelOptimizationEngine.ump"
   private void printStatesOf(StateMachine sm){
    String states = "";
		
		for( State state : sm.getStates() ) 
			states += " " + state +" : "+ state.getNestedStateMachines().size()+"\n";
		System.out.println( sm.getName() +" : "+ states );
  }

  // line 61 "../../../../src/ModelOptimizationEngine.ump"
   private void printTransition(Transition transition, int dex){
    System.out.println( transition.getEvent().getName()+"["+transition.getFromState()+"__"+ transition.getNextState()+"]: "+dex );
  }

  // line 66 "../../../../src/ModelOptimizationEngine.ump"
   private void printTable(HashMap<State,TargetConfiguration> map){
    String str = "";
		for( Map.Entry<State, TargetConfiguration> entry : map.entrySet() ) {
			
			State key = ( State ) entry.getKey();
			TargetConfiguration config = map.get( entry.getKey() );
				
			str += "["+ key + " , " + config +"] \n";
		}
		
		System.out.println( str );
  }


  /**
   * /////////////////////////////////////////////////////// Utilities
   * assigns transitions to corresponding sources and destinations
   */
  // line 83 "../../../../src/ModelOptimizationEngine.ump"
   private void setTransition(StateMachine sm, List<Transition> transitions, HashMap<State,TargetConfiguration> map){
    TargetConfiguration nextEntry, fromEntry;
		
		for( Transition transition : transitions ) {
			nextEntry = map.get( transition.getNextState() ); 
			fromEntry = map.get( transition.getFromState() );
			//printTransition( transition, 0);
			if( kind( transition.getFromState() ) == 1 )
				for( State state : fromEntry.getGreatest_descendant_states() )
					transition.clone( state, nextEntry.getGreatest_default_state() );
			else
				transition.clone( fromEntry.getGreatest_descendant_states().get(0), nextEntry.getGreatest_default_state() );
		}
  }


  /**
   * this method constructs an optimized Statemachine from its input StateMachine (i.e., root or non-root)
   */
  // line 100 "../../../../src/ModelOptimizationEngine.ump"
   public ExplorationResult optimize(StateMachine sm, StateMachine parentStateMachine, HashMap<State,TargetConfiguration> map){
    ExplorationResult result;
		State newState = null;
		for( State state : sm.getStates() ) {
		
			if( kind( state ) == 0 ) {
				map.put( state, buildEntry( createCopy( state, parentStateMachine ), null, map ) );
				//System.out.println( state.getName() + ":0 - " + state.getStateMachine().getParentState() + ", " + parentStateMachine.getParentState());
			}
			
			if( kind( state ) == 1 ) {
				
				List<State> beforeList = new ArrayList<State>();
				boolean flag = false;
				for( State myState : parentStateMachine.getStates() ) {
					beforeList.add( myState );
					if( myState.isIsStartState() )
						flag = true;
				}
				
				result = optimize( state.getNestedStateMachine(0), parentStateMachine, map );
				List<State> afterList = parentStateMachine.getStates();
				afterList = difference( beforeList, afterList ); //computing the difference 
				
				//enforcing initialization of respected initial state by disabling other initial states of optimized composite states  
				for( State myState : afterList )
					if( myState.isIsStartState() && flag )
						myState.setIsStartState( false );
				
				//making entry for the state under exploration
				map.put( state, buildEntry( state, afterList, map ) ); 
			}
			
			if( kind( state ) == 2 ) {
				
				//System.out.println( state.getName() + ":1 - " + state.getStateMachine().getParentState() + ", " + parentStateMachine.getParentState() );
				//we create a copy of the state
				newState = createCopy( state, parentStateMachine );
				map.put( state, buildEntry( newState, null, map ) );
				
				//we create a copy of the state corresponding to the region
				State wrapperState;
				StateMachine nestedStateMachine;
				for( StateMachine machine : getRegions( state ) ) {
				
					//we create a copy of the host nested StateMachine
					nestedStateMachine = createCopy( machine.getParentState().getStateMachine() );
					
					//we create a copy of the state corresponding to the region
					wrapperState = createCopy( machine.getParentState(), nestedStateMachine );
					map.put( machine.getParentState(), buildEntry( wrapperState, null, map ) );
					
					//we construct and wrap the optimized StateMachine here!
					result = optimize( machine, createCopy( machine ), map );
					wrapperState.addNestedStateMachine( result.getStateMachine() );
					newState.addNestedStateMachine( nestedStateMachine );

					//System.out.println( state.getName() +"---"+machine.getName() +" : "+ newState.getName() +"---"+result.getStateMachine().getName() +":::"+ newState.getNestedStateMachines().size());
					//System.out.println( newState.getName() +"---"+machine.getName() +" : "+ newState.getName() +"---"+result.getStateMachine().getName() );
				}
				
			}
		}
		result = new ExplorationResult( parentStateMachine );
		result.setMap( map );
		return result;
  }

  // line 169 "../../../../src/ModelOptimizationEngine.ump"
   private List<State> difference(List<State> beforeList, List<State> afterList){
    List<State> result = new ArrayList<State>();
		for( State obj : afterList ) {
			if( !beforeList.contains( obj ) )
				result.add( obj );
		}
		return result;
  }

  // line 179 "../../../../src/ModelOptimizationEngine.ump"
   private List<StateMachine> getRegions(State state){
    List<StateMachine> regions = new ArrayList<StateMachine>();
		//Case 1 - BASIC state
		if( kind( state ) == 0 )
			return regions;
		
		//Case 2 - Non-Concurrent Composite state
		if( kind( state ) == 1 ) {
			regions.add( state.getNestedStateMachine( 0 ) );
			return regions;
		}
		
		//Case 3 - Concurrent state
		for( StateMachine stm : state.getNestedStateMachines() ) {
			State wrapperState = stm.getStates().get(0);
			if( wrapperState.getNestedStateMachines().size() == 0 )
				regions.add( stm );
			
			for( StateMachine machine : getRegions( wrapperState ) )
				regions.add( machine );
		}
		return regions;
  }

  // line 204 "../../../../src/ModelOptimizationEngine.ump"
   private TargetConfiguration buildEntry(State newState, List<State> states, HashMap<State,TargetConfiguration> map){
    State[] arr;
		if( states != null && states.size() > 0 ) {
			arr = new State[ states.size() ];
			State initialState = newState.getNestedStateMachine(0).getStartState();
			TargetConfiguration nextEntry = map.get( initialState );
			initialState = nextEntry.getGreatest_default_state();
			if( kind( initialState ) == 1 )
				initialState = map.get( initialState ).getGreatest_default_state();
				
			return new TargetConfiguration( initialState, states.toArray( arr ) );
		}
		
		arr = new State[ 1 ];
		List<State> descendants = new ArrayList<State>();
		descendants.add( newState );
		return new TargetConfiguration( newState, descendants.toArray( arr ) );
  }


  /**
   * This method creates a copy of the input StateMachine
   */
  // line 226 "../../../../src/ModelOptimizationEngine.ump"
   private StateMachine createCopy(StateMachine sm){
    StateMachine smm = new StateMachine( sm.getName() );
		UmpleClass uClass = sm.getUmpleClass();
		//System.out.println( uClass.toString() );
		smm.setUmpleClass( uClass );
		
		/*State parent = sm.getParentState();
		if( parent == null )
				smm.setParentState( parent );
		else
				smm.setParentState( map.get( parent ).getGreatest_default_state() );*/
		smm.setRecentSearchDepth( sm.getRecentSearchDepth() );
		smm.setContainsHistoryState( sm.getContainsHistoryState() );
		smm.setContainsDeepHistoryState( sm.getContainsDeepHistoryState() );
		smm.setPooled( sm.isPooled() );
		smm.setQueued( sm.isQueued() );
		
		return smm;
  }


  /**
   * This method creates a copy of the input State
   */
  // line 248 "../../../../src/ModelOptimizationEngine.ump"
   private State createCopy(State state, StateMachine sm){
    String sName = state.getName();
		State parent = state.getStateMachine().getParentState();
		if( parent != null && kind( parent ) == 1 )
			sName = state.getStateMachine().getName() + sName;
		
		
		State newState = new State( sName, sm );
		if( parent != null && parent.isIsStartState() == false )
			newState.setIsStartState( false );
		else 
			newState.setIsStartState( state.getIsStartState() );
		newState.setIsInternal( state.getIsInternal() );
		newState.setIsHistoryState( state.getIsHistoryState() );
		newState.setIsDeepHistoryState( state.getIsDeepHistoryState() );
		newState.setFinalState( state.getFinalState() );
		newState.setIsVisited( state.getIsVisited() );
		newState.setPosition( state.getPosition() );
		
		return newState;
  }


  /**
   * 0 - Simple state (BASIC), 1 - Non-concurrent composite state (OR), 2 - Concurrent state (AND), Otherwise - (-1)
   * precondition - state mustr not be null
   */
  // line 273 "../../../../src/ModelOptimizationEngine.ump"
   private int kind(State state){
    //for basic state
		if( state.hasNestedStateMachines() == false )
			return 0;

		//for non-concurrent composite state
		if( state.getNestedStateMachines().size() == 1 )
			return 1;
			
		//for concurrent state
		if( state.getNestedStateMachines().size() > 1 )
			return 2;
		
		return -1;
  }

}
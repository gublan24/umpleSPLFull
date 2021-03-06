/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import cruise.umple.compiler.*;
import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

// line 6 "../../../../src/NuSMVCoordinationUnit.ump"
public class NuSMVCoordinator
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "-- This file is generated from ";
  public static final String TEXT_1 = " --";
  public static final String TEXT_2 = NL + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NuSMVCoordinator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * 
   * This changes the first caharacter of a given string.
   * @param str the given string.
   * @param index value 0 - Lowercase, 1 - Uppercase, Otherwise no change
   * @return the resulting string value.
   */
  // line 25 "../../../../src/NuSMVCoordinationUnit.ump"
   public static  String changeNameCase(String str, int index){
    if( str.length() < 1)
  			return "";
    	char[] stringArray = str.trim().toCharArray();
    	if(index == 1)
    		stringArray[0] = Character.toUpperCase(stringArray[0]);
    	if(index == 0)
    		stringArray[0] = Character.toLowerCase(stringArray[0]);
    	str = new String(stringArray);
    	return str;
  }

  // line 37 "../../../../src/NuSMVCoordinationUnit.ump"
   public boolean isNested(StateMachine sm){
    boolean yes = false;
  		for(State st : sm.getStates()) 
  			if(st.numberOfNestedStateMachines() > 0) {
  				yes = true;
  				break;
  			}
  		return yes;
  }

  // line 47 "../../../../src/NuSMVCoordinationUnit.ump"
   public StringBuilder generateSystem(List<NuSMVModule> modules){
    StringBuilder temp = new StringBuilder();
  		for( NuSMVModule mod : modules )
  			temp.append(mod.toString()+"\n");
  		return temp;
  }

  // line 55 "../../../../src/NuSMVCoordinationUnit.ump"
   private NuSMVModule generateParentModule(StateMachine sm, UmpleClass uClass){
    VarDeclaration vdec = new VarDeclaration( getStateList( sm ) );
		vdec.addVariableSpecifier( getEventList( sm ) );
		for( VariableSpecifier vs : generateSpecifiersForAttributesOf( uClass ) )
			vdec.addVariableSpecifier(vs);
		
		ModuleBody body = new ModuleBody( vdec );
			body.addModuleElement( vdec );
		
		List<VariableSpecifier> specifiers = generateSpecifiersForInputAttributesOf( uClass );
		if( specifiers.size() > 0) {
			IVarDeclaration ivdec = new IVarDeclaration( specifiers.get(0) );
			for( int i = 1; i < specifiers.size(); i++ )
				ivdec.addVariableSpecifier( specifiers.get(i) );
			body.addModuleElement( ivdec );
		}
		
		//Adding define declaration to module body
		body.addModuleElement( getDefineDeclaration( sm, uClass ) );
		body.addModuleElement( getAssignConstraint( sm, sm) );
		body.addModuleElement( getEventAssignConstraint( sm ) );
		
		//Adding assign constraints for all the attributes
		for( AssignConstraint constraint : getAssignConstraint( uClass ))
			body.addModuleElement( constraint );
			
		//generateSpecForTransitionDeterminism( sm, body );
		NuSMVModule module = new NuSMVModule( changeNameCase( getAbsoluteName( sm, sm ), 1 ), body );
		generateParameters( module, sm, sm ); 
		return module;
  }

  // line 87 "../../../../src/NuSMVCoordinationUnit.ump"
   private String getAbsoluteName(StateMachine root, StateMachine sm){
    return root.getUmpleClass().getName() + changeNameCase(sm.getFullName(),1);
  }


  /**
   * Building dependency set
   */
  // line 103 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<String> getDependencySet(StateMachine root, StateMachine sm){
    List<StateMachine> smList = generateStateMachineList( root );
		List<String> temp = new ArrayList<String>();
		if( root.equals( sm ) ) {
			for(StateMachine stm : smList) 
				if( !stm.getFullName().equals(sm.getFullName()) ) 
					temp.add( changeNameCase(stm.getFullName(),1) );
		}
		else {
			temp.add( changeNameCase(root.getFullName(), 1) );
			State parent = getParentState( sm ); 
			if( !parent.getStateMachine().equals(root) )
				temp.add( changeNameCase(parent.getStateMachine().getFullName(),1) );
		}
		return temp;
  }

  // line 120 "../../../../src/NuSMVCoordinationUnit.ump"
   private State getParentState(StateMachine sm){
    State bioParent = sm.getParentState();
		State gParent = bioParent.getStateMachine().getParentState();
		if( gParent != null && gParent.isIsConcurrent() )
			bioParent = gParent;
		return bioParent;
  }

  // line 128 "../../../../src/NuSMVCoordinationUnit.ump"
   private void generateParameters(NuSMVModule module, StateMachine parent, StateMachine sm){
    List<String> dependencySet = getDependencySet( parent, sm);
		for(String stm : dependencySet) 
			module.addParameter( "_"+changeNameCase(stm,0) );
  }

  // line 134 "../../../../src/NuSMVCoordinationUnit.ump"
   private VariableSpecifier generateVariableSpecifierForMain(StateMachine sm, StateMachine root){
    String identifier = changeNameCase( getAbsoluteName( root, sm ), 0);
		VariableSpecifier vs = new VariableSpecifier(identifier);
		List<String> dependencySet = getDependencySet( root, sm);
		for( String stm : dependencySet ) 
			vs.addTypeSpecifier( changeNameCase(root.getUmpleClass().getName() + stm,0) );
		vs.setIsBracketed(true);
		vs.setTypeName( changeNameCase( getAbsoluteName( root, sm ), 1) );
		return vs;
  }


  /**
   * Created to generate the list of state machine
   */
  // line 146 "../../../../src/NuSMVCoordinationUnit.ump"
   public List<StateMachine> generateStateMachineList(StateMachine root){
    List<StateMachine> nestedMachines = new ArrayList<StateMachine>();
		if( root.getParentState() == null )
			nestedMachines.add(root);
  		for( State st :  getCompositeStates(root) )
				for( StateMachine stm : getEmbeddedStateMachines( st ) )
					nestedMachines.add( stm );
		return nestedMachines;
  }


  /**
   * Computes the list of embeddedStateMachines of a composite state
   */
  // line 157 "../../../../src/NuSMVCoordinationUnit.ump"
   public List<StateMachine> getEmbeddedStateMachines(State state){
    List<StateMachine> nestedMachines = new ArrayList<StateMachine>();
 
		for( StateMachine stm : state.getNestedStateMachines() ) {
			if(!state.isIsConcurrent()){
				if(!has(nestedMachines, stm))
					nestedMachines.add( stm );
				if( isNested( stm ) )
					for( StateMachine innerMachine : generateStateMachineList( stm ) )
							nestedMachines.add( innerMachine );
			}
			else {
				//skips the wrapper of the region
				if( stm.getImmediateNestedStateMachines().size() == 0 )
					nestedMachines.add( stm );
				
				for( StateMachine region : stm.getImmediateNestedStateMachines() ){
					if(!has(nestedMachines, stm)){
						nestedMachines.add( region );
						if( isNested( region ) )
							for( StateMachine innerMachine : generateStateMachineList( region ) )
								nestedMachines.add( innerMachine );
					}
				}
				if( stm.getImmediateNestedStateMachines().size() > 1 )
					nestedMachines.add( stm );
			}
		}
		return nestedMachines;
  }

  // line 188 "../../../../src/NuSMVCoordinationUnit.ump"
   private boolean isHighLevelTransition(Transition transition){
    State source = transition.getFromState();
		if( source != null && source.hasNestedStateMachines() )
			return true;
		return false;
  }

  // line 195 "../../../../src/NuSMVCoordinationUnit.ump"
   private StateMachine getStateMachineOfHighLevelTransition(Transition transition){
    if( !isHighLevelTransition(transition) )
			return null;
		StateMachine source = transition.getFromState().getStateMachine();
		if( !isConcurrent(transition.getFromState()) )
			return source;
		return source.getImmediateNestedStateMachines().get(0);
  }

  // line 204 "../../../../src/NuSMVCoordinationUnit.ump"
   public List<State> getCompositeStates(StateMachine sm){
    List<State> temp = new ArrayList<State>();
		for(State st : sm.getStates())
			if(st.hasNestedStateMachines())
				temp.add(st);
		return temp;
  }

  // line 212 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<NuSMVModule> generateModuleForCompositeStatesOf(StateMachine root, StateMachine parent){
    List<NuSMVModule> nestedMachines = new ArrayList<NuSMVModule>();
  		for( StateMachine stm : generateStateMachineList(root) ) {
			if( !stm.equals( root ) ) {
				NuSMVModule module = generateModuleForSubstate(stm, root);
				generateParameters( module, root, stm ); 
				nestedMachines.add( module );
			}
		}
		return nestedMachines;
  }


  /**
   * this generates variable declaration section for the entire Umple model
   */
  // line 225 "../../../../src/NuSMVCoordinationUnit.ump"
   private VarDeclaration genMainVariableFor(List<NuSMVModule> capsules){
    VariableSpecifier vs = new VariableSpecifier( changeNameCase(capsules.get(0).getIdentifier(), 0));	
  		vs.addTypeSpecifier( changeNameCase(capsules.get(0).getIdentifier(), 1));
  		VarDeclaration vdec = new VarDeclaration(vs); 
		
  		for( int i = 1; i < capsules.size(); i++ ) {
  			VariableSpecifier vss = new VariableSpecifier( changeNameCase(capsules.get(i).getIdentifier(), 0));	
			vss.addTypeSpecifier( changeNameCase(capsules.get(i).getIdentifier(), 1));
			vdec.addVariableSpecifier( vss ); 
  		}
  		return vdec;
  }


  /**
   * Generates a String builder for the modeling elements
   */
  // line 242 "../../../../src/NuSMVCoordinationUnit.ump"
   public StringBuilder generateModel(UmpleModel uModel, List<NuSMVModule> capsules, List<CTLSpecification> reachability, List<ModuleElement> properties, List<InvarConstraint> nonDeterminism, int option){
    List<NuSMVModule> temp = new ArrayList<NuSMVModule>();
		StringBuilder output = new StringBuilder();
		double elapsedMemory = 0;
		
		for( UmpleClass uClass : uModel.getUmpleClasses() )	{
			
			//Generating the capsule module for the statemachine
			for( StateMachine sMachine : uClass.getStateMachines() ) {
		
				if( option == 1 ) {

					//optimization begins here whenever necessary
					ModelOptimizer mop = new ModelOptimizer();
					sMachine = mop.optimize( sMachine );
				}

				//Generates the parent state machine  		
				NuSMVModule module = generateParentModule( sMachine, uClass );
				temp.add(module);
				for( NuSMVModule mod : generateModuleForCompositeStatesOf( sMachine, sMachine ) )
					temp.add( mod );
		
				ModuleBody body = new ModuleBody( genMainVariableFor( sMachine ) );				
				NuSMVModule capsuleModule = new NuSMVModule( uClass.getName() + changeNameCase( sMachine.getFullName(), 1 )+"_Machine" , body);	
				temp.add( capsuleModule );
				capsules.add( capsuleModule );

				double startTime = (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024*1024);
				//Generates invariance specifications for non-determinism
				for( InvarConstraint spec : generateSpecForTransitionDeterminism( sMachine, capsuleModule ) ){
					nonDeterminism.add( spec );
					properties.add( spec );
				}
				double stopTime = (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024*1024);
      	elapsedMemory = stopTime - startTime;
			
				//Generates reachability specifications for the nested state machines of hierarchical system under generation.
				for( StateMachine machine : generateStateMachineList( sMachine ) ) {
					
					for( CTLSpecification spec : generateSpecForStateReachability( sMachine, machine, capsuleModule ) ){
						reachability.add( spec );
						properties.add( spec );
					}
				}					
			}
		}
		
		//creating main module for the model
		if(capsules.size() < 1)
		{
			output.append("/* To generate NuSMV model, your umple file should contain some state machines. */");
		}
		else
		{
			ModuleBody body = new ModuleBody( genMainVariableFor( capsules ) );
			NuSMVModule mainmodule = new NuSMVModule( "main" , body );	
			temp.add( mainmodule );
			
			for( NuSMVModule module : temp )
				output.append( module.toString() +"\n" );
		
		//output.append( "--Elapsed Memory to discover non-determinism (ms): "+elapsedMemory);		
		}		
		return output;
  }


  /**
   * the file with the input name on the specified path, and extension is created whenever this method returns a string (i.e. absolute file name).
   */
  // line 311 "../../../../src/NuSMVCoordinationUnit.ump"
   public String createFile(UmpleModel model, StringBuilder sb, String addOn, String extension){
    String modelFileName = null;
		File file;
		try {
			String path = model.getUmpleFile().getPath();
			file = new File( path );
			file.mkdirs();
			modelFileName = path + File.separator + addOn + model.getUmpleFile().getSimpleFileName() + "." + extension;
			
			BufferedWriter bw = new BufferedWriter( new FileWriter( modelFileName ) );
			bw.write( sb.toString() );
			bw.flush();
			bw.close();
		}
		catch(Exception ex) {
			return modelFileName;
		}
		return modelFileName;
  }


  /**
   * the file with the input name on the specified path, and extension is deleted whenever this method returns true.
   */
  // line 333 "../../../../src/NuSMVCoordinationUnit.ump"
   public boolean deleteFile(String modelFileName){
    boolean deleted = false;
		File file;
		try {
			file = new File( modelFileName );
			if( file.delete() )
				deleted = true;
			else
				deleted = false;
		}
		catch(Exception ex) {
			return deleted;
		}
		return deleted;
  }


  /**
   * command invoking program
   */
  // line 351 "../../../../src/NuSMVCoordinationUnit.ump"
   private void executeCommand(String command){
    StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//return output.toString();
  }

  // line 372 "../../../../src/NuSMVCoordinationUnit.ump"
   private boolean hasInfiniteDomain(UmpleModel model, StringBuilder output){
    boolean test0 = false;
		for( UmpleClass uClass : model.getUmpleClasses() )
			for( Attribute attribute : uClass.getAttributes() ) {
				if( attribute.getFullType().equals( "Float" ) || 
					attribute.getFullType().equals( "float" ) ||
					attribute.getFullType().equals( "Integer" ) ||
					attribute.getFullType().equals( "int" ) )
				
				test0 = test0 || true;					
				output.append( "\n ... Attribute "+ attribute.getName() +" of type "+ attribute.getFullType() +" cannot be analyzed with CTL properties..." );
			}
		return test0;
  }


  /**
   * prepares all files needed for analysis under consideration...
   */
  // line 389 "../../../../src/NuSMVCoordinationUnit.ump"
   public void prepareAnalysisFiles(UmpleModel model, StringBuilder output, ModuleElement element){
    //house cleaning or garbage collection
		deleteAnalysisFiles( model );
		
		String fileName = createFile( model, output, "_", "smv" );
		StringBuilder sb = new StringBuilder();
		String runscript = "_" + model.getUmpleFile().getSimpleFileName()+".sh";
		String modelName = "_" + model.getUmpleFile().getSimpleFileName()+".smv";
		sb.append( "nuXmv -source " + runscript +" "+ modelName );
		String runFileName = createFile( model, sb, "", "sh" );
		
		StringBuilder nsb;
		if( element instanceof InvarConstraint ) {
			
			nsb = new StringBuilder();
			if( hasInfiniteDomain(model, output) ) {
				nsb.append( "go_msat" + "\n" );
				nsb.append( "check_invar_ic3" + "\n" );
			}
			else {
				nsb.append( "go" + "\n" ); 
				nsb.append( "check_invar" + "\n" );
			}
			
			nsb.append( "show_traces -p 4 -o " + model.getUmpleFile().getSimpleFileName() + "\n" );
			nsb.append( "quit" );
			String runFileName1 = createFile( model, nsb, "_", "sh" );		
		}
		
		//System.out.println(hasInfiniteDomain( model, output ));
		if( ( element instanceof CTLSpecification ) && !hasInfiniteDomain( model, output ) ) {
			nsb = new StringBuilder();
			nsb.append( "go" + "\n" );
			nsb.append( "check_ctlspec" + "\n" );
			nsb.append( "show_traces -p 4 -o " + model.getUmpleFile().getSimpleFileName() + "\n" );
			nsb.append( "quit" );
			String runFileName1 = createFile( model, nsb, "_", "sh" );		
		}
  }


  /**
   * work on this later for option argument - (currently being set - 0)
   */
  // line 431 "../../../../src/NuSMVCoordinationUnit.ump"
   public void analyzeModel(UmpleModel model){
    List<NuSMVModule> capsules = new ArrayList<NuSMVModule>();
		List<CTLSpecification> reachability = new ArrayList<CTLSpecification>();
		List<InvarConstraint> nonDeterminism = new ArrayList<InvarConstraint>();
		List<ModuleElement> properties = new ArrayList< ModuleElement >();
		String npath = model.getUmpleFile().getPath() + File.separator;
		String fileName = "sh " + npath + model.getUmpleFile().getSimpleFileName()+".sh";

		StringBuilder output = generateModel( model, capsules, reachability, properties, nonDeterminism, 0 );
		for( ModuleElement element : properties ) {
			StringBuilder myOutput = generateModules( model, true, 0 );
			appendConstraint( myOutput, element );
			prepareAnalysisFiles( model, myOutput, element );
    	
			//invoke model checker here...
			executeCommand( fileName );
			//System.out.println( out );
			
			//and determine whether there is a counterexample or not...
			//if there is a counterexample, generate a table to present the result...
			
		}
		deleteAnalysisFiles( model );
  }


  /**
   * deletes all files used for analysis under consideration...
   */
  // line 458 "../../../../src/NuSMVCoordinationUnit.ump"
   public void deleteAnalysisFiles(UmpleModel model){
    String npath = model.getUmpleFile().getPath() + File.separator;
		String fileName = npath + "_" + model.getUmpleFile().getSimpleFileName()+".sh";
		String runFileName = npath + "_" + model.getUmpleFile().getSimpleFileName()+".smv";
		String runFileName1 = npath + model.getUmpleFile().getSimpleFileName()+".sh";
		String xmlFile = npath + model.getUmpleFile().getSimpleFileName()+".xml";
		
		deleteFile( fileName );
		deleteFile( runFileName );
		deleteFile( runFileName1 );
		//deleteFile( xmlFile );
  }


  /**
   * Generates models from an Umple model for analysis purpose
   */
  // line 475 "../../../../src/NuSMVCoordinationUnit.ump"
   public void appendConstraint(StringBuilder output, ModuleElement property){
    if( property != null ) {
			output.append("\n   -- The following property are specified to certify that this model is free of non-determinism. \n");	
			output.append( property.toString() +"\n" );
		}
  }


  /**
   * Generates modules from an Umple model
   */
  // line 484 "../../../../src/NuSMVCoordinationUnit.ump"
   public StringBuilder generateModules(UmpleModel uModel, boolean temp, int option){
    List<NuSMVModule> capsules = new ArrayList<NuSMVModule>();
		List<CTLSpecification> reachability = new ArrayList<CTLSpecification>();
		List<InvarConstraint> nonDeterminism = new ArrayList<InvarConstraint>();
		List<ModuleElement> properties = new ArrayList< ModuleElement >();

		StringBuilder output = generateModel( uModel, capsules, reachability, properties, nonDeterminism, option );		
  		return output;
  }


  /**
   * Generates modules from an Umple model
   */
  // line 497 "../../../../src/NuSMVCoordinationUnit.ump"
   public StringBuilder generateModules(UmpleModel uModel, int option){
    List<NuSMVModule> capsules = new ArrayList<NuSMVModule>();
		List<CTLSpecification> reachability = new ArrayList<CTLSpecification>();
		List<InvarConstraint> nonDeterminism = new ArrayList<InvarConstraint>();
		List<ModuleElement> properties = new ArrayList<ModuleElement>();

		StringBuilder output = generateModel( uModel, capsules, reachability, properties, nonDeterminism, option );
		if( nonDeterminism.size() > 0 ) {
			output.append("\n   -- The following properties are specified to certify that this model is free of non-determinism. \n");	
			for( InvarConstraint element : nonDeterminism )
				output.append( element.toString() +"\n" );
		}
		
		if( reachability.size() > 0 ) {
			output.append("\n   -- The following properties are specified to certify that non-symbolic state(s) of this model is (or are) reachable. \n");	
			for( CTLSpecification element : reachability )
				output.append( element.toString() +"\n" );
		}
		
  		return output;
  }

  // line 519 "../../../../src/NuSMVCoordinationUnit.ump"
   public List<NuSMVModule> generateModuleForNestedStateMachine(StateMachine sm, UmpleClass uClass){
    List<NuSMVModule> temp = new ArrayList<NuSMVModule>();
  		//Generates the parent state machine  		
  		NuSMVModule module = generateParentModule( sm, uClass );
  		temp.add(module);
  		for( NuSMVModule mod : generateModuleForCompositeStatesOf( sm, sm ) )
  			temp.add( mod );
			
		//Generating the main module for the statemachine
  		ModuleBody body = new ModuleBody( genMainVariableFor( sm ) );
		for( StateMachine smm : generateStateMachineList( sm ) )
			generateSpecForStateReachability( smm , body );
		NuSMVModule mainmodule = new NuSMVModule( "main" , body);	
		temp.add( mainmodule );
  		return temp;
  }


  /**
   * This generates modules generated from a simple state machine including its main
   */
  // line 538 "../../../../src/NuSMVCoordinationUnit.ump"
   public List<NuSMVModule> generateModuleForSimpleStateMachine(StateMachine sm, UmpleClass uClass){
    List<NuSMVModule> temp = new ArrayList<NuSMVModule>();
  		//Generating and setting the parent module
  		temp.add( generateParentModule(sm, uClass) );
  		
  		//Generating the main module for the statemachine
  		ModuleBody body = new ModuleBody(genMainVariableFor( sm ));
  		NuSMVModule module = new NuSMVModule("main", body);	
  		generateSpecForStateReachability( sm, body ); 
  		temp.add( module );
  		return temp;
  }


  /**
   * This generates a module for a substate given the state machine of the state and the root state machine
   */
  // line 552 "../../../../src/NuSMVCoordinationUnit.ump"
   public NuSMVModule generateModuleForSubstate(StateMachine sm, StateMachine root){
    ModuleBody body = new ModuleBody( new VarDeclaration(getStateList(sm)) );
  		//Adding define declaration to module body
  		body.addModuleElement( getAssignConstraint( sm, root) );
  		NuSMVModule module = new NuSMVModule( changeNameCase(getAbsoluteName( root, sm ), 1), body );	
  		return module;
  }

  // line 560 "../../../../src/NuSMVCoordinationUnit.ump"
   public int getObjectIdentity(StateMachine sm, Object obj){
    int pos = 1;
		if( obj instanceof Transition ){
			for(Transition trans : sm.getAllTransitions() ) {
				//System.out.println( getEventName( trans.getEvent() )+"["+trans.getFromState().getName() +" -- "+trans.getNextState().getName()+"]");
				if(trans.equals( (Transition) obj) )
					return pos;
				pos++;
			}
			//System.out.println( getEventName(((Transition)obj).getEvent())+"["+((Transition)obj).getFromState().getName() +" -- "+((Transition)obj).getNextState().getName()+"]");
		}
		if( obj instanceof Guard ) {
			pos = 1;
			for(Guard guard : sm.getAllGuards() ) {
				if(guard.equals(( Guard ) obj ))
					return pos;
				pos++;
			}
		}
  		return -1;
  }

  // line 583 "../../../../src/NuSMVCoordinationUnit.ump"
   private InvarExpression generateDestinationStatesExpr(StateMachine sm, Transition first, Transition second, StateMachine root, NuSMVModule capsule){
    BasicExpression f1 = new BasicExpression( changeNameCase(capsule.getIdentifier(),0)+"."+changeNameCase( getAbsoluteName(root ,first.getNextState().getStateMachine()), 0)+".state" );
    	BasicExpression f2 = new BasicExpression( changeNameCase( first.getNextState().getStateMachine().getFullName(),1)+"_"+first.getNextState().getName());
		BasicExpression firstExpr = new BasicExpression("first");
		firstExpr.addChild(f1);
		firstExpr.addChild(f2);
		firstExpr.setOperator(BasicExpression.Operator.EQ);
		
		BasicExpression s1 = new BasicExpression( changeNameCase(capsule.getIdentifier(),0)+"."+changeNameCase( getAbsoluteName(root ,second.getNextState().getStateMachine()),0)+".state" );
    	BasicExpression s2 = new BasicExpression( changeNameCase( second.getNextState().getStateMachine().getFullName(),1)+"_"+second.getNextState().getName());
		BasicExpression secondExpr = new BasicExpression("second");
		secondExpr.addChild(s1);
		secondExpr.addChild(s2);
		secondExpr.setOperator(BasicExpression.Operator.EQ);
		
		InvarExpression cexp = new InvarExpression("ctl");
		cexp.addChild( firstExpr );
		cexp.addChild( secondExpr );
		cexp.setOperator(BasicExpression.Operator.AND);
		cexp.setBracketed(true);
		cexp.setInvarOperator( InvarExpression.InvarOperator.next );
		cexp.setQualified(true);
		
		return cexp;
  }

  // line 609 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<InvarConstraint> generateSpecForTransitionDeterminism(StateMachine sm, NuSMVModule capsule){
    BasicExpression bexp1;
		BasicExpression bexp2;
		String rootName = changeNameCase(capsule.getIdentifier(),0)+"."+changeNameCase(getAbsoluteName(sm,sm),0);
		List<InvarConstraint> constraints = new ArrayList<InvarConstraint>();
		for(State st : sm.getStates() )
			for( HashMap<Transition,Transition> entry : matchMakeTransitions( st ) )
				for( HashMap.Entry<Transition,Transition> map : entry.entrySet() ) {
					Transition key = map.getKey();
					int i = getObjectIdentity( sm, key );
					Transition value = map.getValue();
					int j = getObjectIdentity( sm, value );
					
					bexp1 = new BasicExpression(rootName + ".t"+i);
					bexp2 = new BasicExpression(rootName + ".t"+j);
					BasicExpression bexp3 = new BasicExpression("temp");
					bexp3.addChild(bexp1);
					bexp3.addChild(bexp2);				
				
					InvarExpression cexp = new InvarExpression("ctl");
					cexp.addChild(bexp3);
					cexp.addChild( generateDestinationStatesExpr( sm, mapIdentity( sm, i), mapIdentity( sm, j), sm, capsule ) );
					cexp.setOperator( BasicExpression.Operator.IMPLY );
					cexp.setBracketed(true);
				
					InvarConstraint cspec = new InvarConstraint(cexp);
					constraints.add(cspec);
				}
		return constraints;
  }


  /**
   * Generates specifications for reachability of states in a given system...
   */
  // line 642 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<CTLSpecification> generateSpecForStateReachability(StateMachine root, StateMachine sm, NuSMVModule capsule){
    List<CTLSpecification> reachabilitySpecifications = new ArrayList<CTLSpecification>();
  		for( State st : sm.getStates() ) {
  			BasicExpression bexp1 = new BasicExpression( changeNameCase(capsule.getIdentifier(),0) + "." + changeNameCase(getAbsoluteName(root , sm), 0)+".state");
    		BasicExpression bexp2 = new BasicExpression( changeNameCase(st.getStateMachine().getFullName(),1)+"_"+st.getName());
    		CTLExpression cexp = new CTLExpression("ctl");
    		cexp.addChild(bexp1);
    		cexp.addChild(bexp2);
    		cexp.setOperator(BasicExpression.Operator.EQ);
    		cexp.setBracketed(true);
    		cexp.setQualified(true);
    		cexp.setCtlOperator(CTLExpression.CtlOperator.EF);
    		CTLSpecification cspec = new CTLSpecification(cexp);
			//cspec.setDisplayNegation( true );
    		reachabilitySpecifications.add(cspec);
    	}
		
		return reachabilitySpecifications;
  }

  // line 663 "../../../../src/NuSMVCoordinationUnit.ump"
   private void generateSpecForStateReachability(StateMachine sm, ModuleBody body){
    for( State st : sm.getStates() ) {
  			BasicExpression bexp1 = new BasicExpression(changeNameCase(sm.getFullName(), 0)+".state");
    		BasicExpression bexp2 = new BasicExpression(changeNameCase(st.getStateMachine().getFullName(),1)+"_"+st.getName());
    		CTLExpression cexp = new CTLExpression("ctl");
    		cexp.addChild(bexp1);
    		cexp.addChild(bexp2);
    		cexp.setOperator(BasicExpression.Operator.EQ);
    		cexp.setBracketed(true);
    		cexp.setQualified(true);
    		cexp.setCtlOperator(CTLExpression.CtlOperator.EF);
    		CTLSpecification cspec = new CTLSpecification(cexp);
    		body.addModuleElement(cspec);
    	}
  }


  /**
   * private void generateSpecForTransitionDeterminism( StateMachine sm, ModuleBody body ) {
   * int i = 1;
   * while( i <= sm.getAllTransitions().size() ) {
   * int j = i + 1;
   * while( j <= sm.getAllTransitions().size() ) {
   * BasicExpression bexp1 = new BasicExpression(changeNameCase(sm.getFullName(), 0)+".t"+i);
   * BasicExpression bexp2 = new BasicExpression(changeNameCase(sm.getFullName(), 0)+".t"+j);
   * BasicExpression bexp3 = new BasicExpression("temp");
   * bexp3.addChild(bexp1);
   * bexp3.addChild(bexp2);				
   * 
   * CTLExpression cexp = new CTLExpression("ctl");
   * cexp.addChild(bexp3);
   * cexp.addChild( generateDestinationStatesExpr( sm, mapIdentity( sm, i), mapIdentity( sm, j) ));
   * cexp.setOperator( BasicExpression.Operator.IMPLY );
   * cexp.setBracketed(true);
   * cexp.setQualified(true);
   * cexp.setCtlOperator(CTLExpression.CtlOperator.AG);
   * 
   * CTLSpecification cspec = new CTLSpecification(cexp);
   * body.addModuleElement(cspec);
   * 
   * }
   * i++;
   * }
   * }
   */
  // line 706 "../../../../src/NuSMVCoordinationUnit.ump"
   private void generateSpecForTransitionDeterminism(StateMachine sm, ModuleBody body){
    BasicExpression bexp1;
		BasicExpression bexp2;
		for(State st : sm.getStates() )
			for( HashMap<Transition,Transition> entry : matchMakeTransitions( st ) )
				for( HashMap.Entry<Transition,Transition> map : entry.entrySet() ) {
					Transition key = map.getKey();
					int i = getObjectIdentity( sm, key );
					Transition value = map.getValue();
					int j = getObjectIdentity( sm, value );
					
					bexp1 = new BasicExpression("t"+i);
					bexp2 = new BasicExpression("t"+j);
					BasicExpression bexp3 = new BasicExpression("temp");
					bexp3.addChild(bexp1);
					bexp3.addChild(bexp2);				
				
					InvarExpression cexp = new InvarExpression("ctl");
					cexp.addChild(bexp3);
					cexp.addChild( generateDestinationStatesExpr( sm, mapIdentity( sm, i), mapIdentity( sm, j) ));
					cexp.setOperator( BasicExpression.Operator.IMPLY );
					cexp.setBracketed(true);
				
					InvarConstraint cspec = new InvarConstraint(cexp);
					body.addModuleElement(cspec);
				}
  }


  /**
   * match making algorithm now includes filter
   */
  // line 750 "../../../../src/NuSMVCoordinationUnit.ump"
   private void match(List<Transition> first, List<Transition> second, List<HashMap<Transition,Transition>> pairable, boolean defaulted, State state){
    int i = 0;
		int x = first.size(), y = second.size(); 
		if( !defaulted ) 
			x = x - 1;
		while( i < x ) {
			int j = 0;
			if( !defaulted ) 
				j = i + 1;
			while( j < y ) { 
				HashMap<Transition, Transition> entry = new HashMap();
				if( ( first.get(i).getEvent().equals( second.get(j).getEvent() ) || getEventName(first.get(i).getEvent()).equals( getEventName(second.get(j).getEvent()) )) 
					&& !isSameDestination(first.get(i), second.get(j), state) ) {
					entry.put(first.get(i), second.get(j));
					for( HashMap.Entry<Transition,Transition> map : entry.entrySet() )
						if( !has( pairable, entry ) && !map.getKey().equals( map.getValue() ) )
							pairable.add( entry );
				}
				j++;
			}
			i++;
		}
  }


  /**
   * This checks whether the input transitions are ignorable for non-determinism
   */
  // line 789 "../../../../src/NuSMVCoordinationUnit.ump"
   public boolean isIgnorablePair(Transition first, Transition second, State supremum){
    boolean sameDestination = first.getNextState().equals( second.getNextState() );
		List< Transition > andCross = getAndCross( supremum );
		for( Transition transition : andCross )
			if( transition.equals( first ) || transition.equals( second ))
				return false || sameDestination;
		
		List< State > descendantsOfFirst = getEmbeddedStates( first.getNextState() );
		List< State > descendantsOfSecond = getEmbeddedStates( second.getNextState() );
		boolean embedded = false;
		
		if( has(descendantsOfFirst, second.getNextState()) || has(descendantsOfSecond, first.getNextState()) )
			embedded = true;
		return ( embedded && !isSourceEmbedded( first, second )) || sameDestination;
  }


  /**
   * This checks whether the input transitions are ignorable for non-determinism
   */
  // line 806 "../../../../src/NuSMVCoordinationUnit.ump"
   private boolean isSameDestination(Transition first, Transition second, State supremum){
    return first.getNextState().equals( second.getNextState() );
  }


  /**
   * Tracks non-determinism whenever one of the pairable transitions incidents on the supremum and the other incidents on an embedded state
   */
  // line 812 "../../../../src/NuSMVCoordinationUnit.ump"
   public boolean isSourceEmbedded(Transition first, Transition second){
    State a = first.getFromState(), b = second.getFromState(), 
			y = first.getNextState(), x = second.getNextState();
		
		List< State > embeddedStatesOfFirst = getEmbeddedStates( x );
		List< State > embeddedStatesOfSecond = getEmbeddedStates( y );
		return has( embeddedStatesOfFirst, a) 
			|| has( embeddedStatesOfFirst, b) 
			|| has( embeddedStatesOfSecond, a) 
			|| has( embeddedStatesOfSecond, b);
  }


  /**
   * Tracks non-determinism whenever one of the pairable transitions incidents on the supremum and the other incidents on an embedded state
   */
  // line 827 "../../../../src/NuSMVCoordinationUnit.ump"
   private boolean isEmbeddedSourceInconsistent(Transition first, Transition second){
    State a = first.getFromState(), b = second.getFromState(), 
			y = first.getNextState(), x = second.getNextState();
			
		if( !y.isIsConcurrent() && !x.isIsConcurrent() )
			return false;

		List< State > embeddedStatesOfFirst = getEmbeddedStates( x );
		boolean hasY = has( embeddedStatesOfFirst, y);
		boolean hasA = has( embeddedStatesOfFirst, a);
		boolean hasB = has( embeddedStatesOfFirst, b);
		
		if( hasY && hasA && hasB )
			return true;
		
		List< State > embeddedStatesOfSecond = getEmbeddedStates( y );
		boolean hasX = has( embeddedStatesOfSecond, x);
		hasA = has( embeddedStatesOfSecond, a);
		hasB = has( embeddedStatesOfSecond, b);
		
		return hasX && hasA && hasB;
  }


  /**
   * Returns the list of states embedded in the given state
   */
  // line 928 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<State> getEmbeddedStates(State state){
    List<State> embeddedStates = new ArrayList<State>();
		for( StateMachine smm : state.getNestedStateMachines() ) {
			for( State innerState : smm.getStates() ) {
				embeddedStates.add( innerState );
				for( State st : getEmbeddedStates(innerState) )
					embeddedStates.add( st ); 
			}
		}
		return embeddedStates;
  }


  /**
   * Determines if a transition is an out-going transition of a concurrent state and returns the list of all outgoing transitions
   */
  // line 941 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<Transition> isOutgoingOfOrthogonal(State state, State parent){
    List<State> embeddedStates = getEmbeddedStates( parent );
		StateMachine sm = parent.getStateMachine();
		List<Transition> outGoingTransitions = new ArrayList<Transition>();
		for( Transition transition : sm.getAllTransitions() )
			if( transition.getFromState().equals( state ) && !has( embeddedStates, transition.getNextState()))
				outGoingTransitions.add( transition );
		return outGoingTransitions;
  }


  /**
   * obtaining the least common ancestor
   */
  // line 952 "../../../../src/NuSMVCoordinationUnit.ump"
   private StateMachine getLCA(State child, State ancestor){
    StateMachine sm = child.getStateMachine();
		while( !sm.getParentState().equals( ancestor ) ){
			State gParent = sm.getParentState();
			sm = gParent.getStateMachine();
		}
		return sm;
  }


  /**
   * composing the set u(z,s) of states
   */
  // line 962 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<State> getExternalStateOf(State child, State ancestor){
    StateMachine sm = getLCA( child, ancestor );
		List<State> closRelations = getEmbeddedStates( sm );
		List<State> states = new ArrayList<State>();
		for( State state : getEmbeddedStates( ancestor ) )
			if(! has( closRelations, state ))
				states.add( state );
		return states;
  }

  // line 973 "../../../../src/NuSMVCoordinationUnit.ump"
   private Transition mapIdentity(StateMachine root, int id){
    for( Transition tr : root.getAllTransitions() )
			if( getObjectIdentity( root, tr ) == id )
				return tr;
		return null;
  }

  // line 980 "../../../../src/NuSMVCoordinationUnit.ump"
   private StateMachine skipWrapper(StateMachine sm){
    if( sm.getImmediateNestedStateMachines().size() == 1 && sm.getStates().size() > 0 )
			return sm.getImmediateNestedStateMachines().get( 0 );
		return sm;
  }

  // line 988 "../../../../src/NuSMVCoordinationUnit.ump"
   private InvarExpression generateDestinationStatesExpr(StateMachine sm, Transition first, Transition second){
    BasicExpression s1;
		BasicExpression f1;
		if( first.getNextState().getStateMachine().equals( sm ) )
			f1 = new BasicExpression( "state" );
		else
			f1 = new BasicExpression( "_"+changeNameCase( first.getNextState().getStateMachine().getFullName(), 0)+".state" );
    	BasicExpression f2 = new BasicExpression( changeNameCase( first.getNextState().getStateMachine().getFullName(),1)+"_"+first.getNextState().getName());
		BasicExpression firstExpr = new BasicExpression("first");
		firstExpr.addChild(f1);
		firstExpr.addChild(f2);
		firstExpr.setOperator(BasicExpression.Operator.EQ);
		
		if( second.getNextState().getStateMachine().equals( sm ) )
			s1 = new BasicExpression( "state" );
		else
			s1 = new BasicExpression( "_"+changeNameCase( second.getNextState().getStateMachine().getFullName(),0)+".state" );
    	BasicExpression s2 = new BasicExpression( changeNameCase( second.getNextState().getStateMachine().getFullName(),1)+"_"+second.getNextState().getName());
		BasicExpression secondExpr = new BasicExpression("second");
		secondExpr.addChild(s1);
		secondExpr.addChild(s2);
		secondExpr.setOperator(BasicExpression.Operator.EQ);
		
		InvarExpression cexp = new InvarExpression("ctl");
		cexp.addChild( firstExpr );
		cexp.addChild( secondExpr );
		cexp.setOperator(BasicExpression.Operator.AND);
		cexp.setBracketed(true);
		cexp.setInvarOperator( InvarExpression.InvarOperator.next );
		cexp.setQualified(true);
		
		return cexp;
  }

  // line 1022 "../../../../src/NuSMVCoordinationUnit.ump"
   private AssignConstraint getAssignConstraint(StateMachine sm, StateMachine root){
    BasicExpression bexp;
  		if( sm.getParentState() == null )
  			bexp = new BasicExpression(changeNameCase(sm.getFullName(),1)+"_"+sm.getStartState().getName());
  		else 
  			bexp = new BasicExpression("null");
			
  		InitAssign ia = new InitAssign("state", bexp);
  		AssignConstraint ac = new AssignConstraint(ia);
  		ac.addAssign(getNextAssign( sm, root ));
  		return ac;
  }

  // line 1036 "../../../../src/NuSMVCoordinationUnit.ump"
   private AssignConstraint getEventAssignConstraint(StateMachine sm){
    VariableSpecifier eventset = new VariableSpecifier("events");
		for( String event : getAllEventNames( sm ) )
			eventset.addTypeSpecifier( "ev_"+ event );
			
		BasicExpression lhs = new BasicExpression( sm.getFullName()+"_stable" );
    BasicExpression rhs = new BasicExpression( "{ "+eventset.printArray( Arrays.asList( eventset.getTypeSpecifier() ) )+" }" );
		CaseStatement stable = new CaseStatement(lhs, rhs);
			
		//defining otherwise case
		BasicExpression bexp1 = new BasicExpression("ev_null");
    	BasicExpression bexp2 = new BasicExpression("TRUE");
		CaseStatement otherwise = new CaseStatement(bexp2, bexp1);
		
		CaseExpression expr = new CaseExpression("",stable);
    	expr.addCaseStatement( otherwise );	
		NextAssign na = new NextAssign("event", expr);
	
  		BasicExpression bexp = new BasicExpression("ev_null");
  		InitAssign ia = new InitAssign("event", bexp);
  		AssignConstraint ac = new AssignConstraint( ia );
  		ac.addAssign( na );
  		return ac;
  }

  // line 1061 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<AssignConstraint> getAssignConstraint(UmpleClass uClass){
    List<AssignConstraint> constraints = new ArrayList<AssignConstraint>();
		
		for( Attribute attribute : uClass.getAllAttributes() ) {
			if( !attribute.isConstant() && !attribute.isIsIvar() ) {
				BasicExpression bexp = new BasicExpression("");
			
				if( attribute.getValue() != null ){
					String value = attribute.getValue();
					switch( value ){
						case "true" : bexp = new BasicExpression("TRUE"); break;
						case "false" : bexp = new BasicExpression("FALSE"); break;
						default : bexp = new BasicExpression(value);
					}
				}
				else if( attribute.getValue() == null && (attribute.getType().equals("Boolean") || attribute.getType().equals("boolean")))
					bexp = new BasicExpression("FALSE");
				else if( attribute.getValue() == null && (attribute.getType().equals("Integer") || attribute.getType().equals("int")
					|| attribute.getType().equals("long") || attribute.getType().equals("Long") 
					|| attribute.getType().equals("short") || attribute.getType().equals("Short")))
					bexp = new BasicExpression("0");
				else if( attribute.getValue() == null && (attribute.getType().equals("Float") || attribute.getType().equals("float") 
					|| attribute.getType().equals("double") || attribute.getType().equals("Double")))
					bexp = new BasicExpression("0.0");
			
				InitAssign initialVal = new InitAssign(attribute.getName(), bexp);
				AssignConstraint assignConstraint = new AssignConstraint( initialVal );
				constraints.add( assignConstraint );
			}
		}
  	return constraints;
  }

  // line 1095 "../../../../src/NuSMVCoordinationUnit.ump"
   private CaseStatement initializeCompositeStartState(State state){
    BasicExpression bexp3 = new BasicExpression( "expr" );
		
		if( state.isIsStartState() && state.getStateMachine().getParentState() != null ) {
			State bioparent = getParentState(state.getStateMachine());
  			BasicExpression bexp1 = new BasicExpression("_"+changeNameCase(bioparent.getStateMachine().getFullName(), 0)+".state");
  			BasicExpression bexp2 = new BasicExpression(changeNameCase(bioparent.getStateMachine().getFullName(),1)+"_"+bioparent.getName());
			BasicExpression bexp7 = new BasicExpression( "expr" );
			bexp7.addChild( bexp1 );
  			bexp7.addChild( bexp2 );
  			bexp7.setOperator( BasicExpression.Operator.EQ );
			
			BasicExpression bexp4 = new BasicExpression("state");
			BasicExpression bexp5 = new BasicExpression("null");
			BasicExpression bexp6 = new BasicExpression("temp");
			bexp6.setOperator( BasicExpression.Operator.EQ );
			bexp6.addChild( bexp4 );
  			bexp6.addChild( bexp5 );
			
			bexp3.addChild(bexp7);
			bexp3.addChild(bexp6);
			bexp3.setOperator( BasicExpression.Operator.AND );
			
			BasicExpression st = new BasicExpression( changeNameCase(state.getStateMachine().getFullName(),1)+"_"+state.getName() ); 
			return new CaseStatement( bexp3, st );
  		}
		return null;
  }


  /**
   * Disabling a composite state alone without other concurrent states
   */
  // line 1126 "../../../../src/NuSMVCoordinationUnit.ump"
   private CaseStatement diasableCompositeState(State state){
    BasicExpression bexp3 = new BasicExpression( "expr" );
		
		if( state.isIsStartState() && state.getStateMachine().getParentState() != null ) {
			State bioparent =  getParentState(state.getStateMachine());
  			BasicExpression bexp1 = new BasicExpression("_"+changeNameCase(bioparent.getStateMachine().getFullName(), 0)+".state");
  			BasicExpression bexp2 = new BasicExpression(changeNameCase(bioparent.getStateMachine().getFullName(),1)+"_"+bioparent.getName());
			bexp3.addChild( bexp1 );
  			bexp3.addChild( bexp2 );
  			bexp3.setOperator( BasicExpression.Operator.NE );
			
			BasicExpression st = new BasicExpression( "null" ); 
			return new CaseStatement( bexp3, st );
  		}
		return null;
  }

  // line 1143 "../../../../src/NuSMVCoordinationUnit.ump"
   private NextAssign getNextAssign(StateMachine sm, StateMachine root){
    BasicExpression bexp1 = new BasicExpression("state");
    	BasicExpression bexp2 = new BasicExpression("TRUE");
    	CaseStatement temp = new CaseStatement(bexp2, bexp1);
    	CaseExpression expr = new CaseExpression("",temp);
		
		//*****changes made here....
		if( sm.getParentState() != null && getCaseStatementForNullState(sm, root) != null )
			expr.addCaseStatement( getCaseStatementForNullState(sm, root) );
		
    	for(State st : sm.getStates() ) {
    		CaseStatement cstatement = getCaseStatement(sm, st, root);
    		if( cstatement != null)
    			expr.addCaseStatement(cstatement);
    	}
		
		//Initializing and disabling composite states
		for(State st : sm.getStates() )
			if( initializeCompositeStartState( st ) != null )
				expr.addCaseStatement( initializeCompositeStartState( st ) );
				
		CaseStatement otherwise = new CaseStatement(bexp2, bexp1);
    	expr.addCaseStatement( otherwise );
    	expr.removeCaseStatement(temp);
		
    	NextAssign na = new NextAssign("state", expr);
    	return na;
  }


  /**
   * Harvesting transitions for any given orthogonal state or region
   */
  // line 1173 "../../../../src/NuSMVCoordinationUnit.ump"
   public List<Transition> getAllTransitionsForOrthogonalState(State st){
    List<Transition> results = new ArrayList<Transition>();
		if( !st.isIsConcurrent() )
			for( StateMachine sm : st.getNestedStateMachines() ) 
				for( Transition trans : getAllEnablingTransitions( sm ) )
					results.add( trans );
		return results;
  }


  /**
   * Harvesting transitions for a state machine
   * Also generates a list of next transitions for a state and its substates (where possible).
   * That is transition that enables or activates a state
   */
  // line 1185 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<Transition> getAllEnablingTransitions(Object obj){
    List<Transition> results = new ArrayList<Transition>();
		if( obj instanceof StateMachine ){
			
			for( State st : ( (StateMachine) obj).getStates() ) {
				for( Transition trans : st.getNextTransition() )
					results.add( trans );
				if( st.hasNestedStateMachines() )
					for( StateMachine smm : st.getNestedStateMachines() )
						for( Transition transition : getAllEnablingTransitions( smm ) )
							results.add( transition );
			}
		}
		else if( obj instanceof State ){
			if( !((State) obj).hasNestedStateMachines() ) {
				return ((State) obj).getNextTransition();
			}
			else {
				for( Transition tr : ((State) obj).getNextTransition() )
					results.add(tr);
				for( StateMachine smm : ((State) obj).getNestedStateMachines() )
					for( Transition transition : getAllEnablingTransitions( smm ) )
						results.add( transition );
			}
		}
		return results;
  }

  // line 1213 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<StateMachine> getNestedStateMachines(State state){
    if(!state.hasNestedStateMachines())
			return null;
		List<StateMachine> stateMachines = new ArrayList<StateMachine>();
		if(!state.isIsConcurrent())
			for(StateMachine sm : state.getNestedStateMachines())
				stateMachines.add(sm);
		else {
			//skips the wrapper of the region
			for(StateMachine nsm : state.getNestedStateMachines()) {
				System.out.println( nsm.getFullName() );
				if( nsm.getImmediateNestedStateMachines().size() != 1 )
					stateMachines.add(nsm);
				for( StateMachine region : nsm.getImmediateNestedStateMachines() ){
					stateMachines.add(region);
				}
			}
		}
		return stateMachines;
  }


  /**
   * This method the set of and-cross transitions for a state machine
   */
  // line 1236 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<Transition> andCross(StateMachine sm){
    List<State> embeddedStates = getEmbeddedStates( sm );
		List<State> friendStates = new ArrayList<State>();
		State parent = getParentState( sm );
		for( StateMachine smm : parent.getNestedStateMachines() ) {
		
			//skipping the wrapper of regions
			for(StateMachine region : smm.getImmediateNestedStateMachines())
				if( !region.equals(sm) )
					for(State st : getEmbeddedStates( smm ))
						if( !has( friendStates, st))
							friendStates.add( st );
		}
		
		List<Transition> andCrossTransitions = new ArrayList<Transition>();
		for( Transition tr : sm.getAllTransitions() ) {
		
			//defines a constraint for and-cross transitions
			if(!has(embeddedStates, tr.getNextState()) && has(friendStates, tr.getNextState()))
				andCrossTransitions.add( tr );
		}
		return andCrossTransitions;
  }


  /**
   * This computes and-cross transitions of a given state.
   */
  // line 1261 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<Transition> getAndCross(State state){
    List<Transition> andCross = new ArrayList<Transition>();
		if( !state.isIsConcurrent() )
			return andCross;
		
		for( StateMachine sm : state.getNestedStateMachines() )
			for( Transition transition : andCross( sm ) )
				andCross.add( transition );
		return andCross;
  }

  // line 1273 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<Transition> getEnclosedTransitions(State state){
    List<Transition> enclosedTransitions = new ArrayList<Transition>();
		for( Transition tr : getAllEnablingTransitions( state ) )
			if( !tr.getNextState().equals( state ))
				enclosedTransitions.add( tr );
		return enclosedTransitions;
  }


  /**
   * Computes the exit transitions for a concurrent region
   */
  // line 1284 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<Transition> getExitTransitionsForConcurrentRegion(StateMachine region){
    State parent = getParentState( region );
		List<Transition> temp = getExternalTransitions( parent );
		

		/*List<Transition> trans = getEnclosedTransitions( parent );		
		List<Transition> temp = new ArrayList<Transition>();
		
		for( Transition tr : parent.getStateMachine().getAllTransitions() )
			if( !has( trans, tr ) )
				temp.add( tr ); //adds to temp every other transitions not enclosed by the parent state 
		*/

		//adding and-cross transitions for a given region
		List<State> embeddedStates = getEmbeddedStates( region );
		for( Transition tr : getAndCross( getParentState( region ) ) )
			if( !has( embeddedStates, tr.getNextState() ) && !has(temp,tr) )
				temp.add( tr );
		return temp;
  }


  /**
   * Computes exit transitions for non-orthogonal composite state
   */
  // line 1306 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<Transition> getExitTransitions(State st){
    List<Transition> transitions = new ArrayList<Transition>();
		


		for( Transition transition : st.getStateMachine().getAllTransitions() ){
			if(st.hasNestedStateMachines() && !st.isIsConcurrent() )				
				for( StateMachine sm : st.getNestedStateMachines() ){
					List<State> embeddedStates = getEmbeddedStates(sm);
					if(!has(embeddedStates, transition.getNextState()) && !has(transitions,transition))
						transitions.add(transition);
						
					//This section handles nested regions
					for( StateMachine region : sm.getImmediateNestedStateMachines() )
						if( region.getParentState() != null )
							for( Transition tr : getExitTransitions(region.getParentState()))
								if(!has(embeddedStates, transition.getNextState()) && !has(transitions,transition))
									transitions.add(transition);
				}
		}
		return transitions;
  }

  // line 1331 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<State> getEmbeddedStates(StateMachine sm){
    List<State> embeddedStates = new ArrayList<State>();
		for(State state : sm.getStates() ) {
			if(!state.hasNestedStateMachines())
				embeddedStates.add(state);
			else
				for( StateMachine stm : generateStateMachineList(sm) )
					for(State st : getEmbeddedStates(stm))
						embeddedStates.add(st);						
		}
		return embeddedStates;
  }

  // line 1344 "../../../../src/NuSMVCoordinationUnit.ump"
   public void printList(List<Transition> input, StateMachine root){
    String results = "";
		for( Transition element : input )
			results += getObjectIdentity( root, element ) +" ";
		System.out.println( results );
  }


  /**
   * on-going work here -- disables non-orthogonal region
   */
  // line 1353 "../../../../src/NuSMVCoordinationUnit.ump"
   private CaseStatement getCaseStatementForNullState(StateMachine sm, StateMachine root){
    int counter = 0;
		BasicExpression rt = new BasicExpression("root");
		List<Transition> trans;
		if(!( getParentState( sm ).isIsConcurrent() ) ) {
			if( sm.equals(root) ) return null;
			trans = getExternalTransitions( getParentState( sm ) );
		}
		else
			trans = getExitTransitionsForConcurrentRegion( sm );

		for( Transition tr : trans ) {
			BasicExpression bexp;
			bexp = new BasicExpression("_"+changeNameCase(root.getFullName(),0)+".t"+getObjectIdentity( root, tr) );	
			rt = getExpressionTreeFor( rt, bexp );
			counter++;
		}
		if(counter > 0) {
  			BasicExpression state = new BasicExpression( "null" ); 
  			return new CaseStatement( rt, state );
  		}
  		return null;
  }

  // line 1378 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<Transition> getExternalTransitions(State state){
    StateMachine sm = state.getStateMachine();
		List<Transition> highLevelTransitions = new ArrayList<Transition>();

		if( sm.getParentState() != null ) {
		
			State ancestor = sm.getParentState();
			StateMachine smm = ancestor.getStateMachine();	
			for( Transition transition : smm.getAllTransitions() )
				if( transition.getFromState().equals( ancestor ) )
					highLevelTransitions.add( transition );
		}
			
		List<Transition> embeddedTransitions = new ArrayList<Transition>();
		for( Transition transition : getAllEnablingTransitions( state ) )
			if( transition.getNextState().equals( state ) )
					continue;
			else
				embeddedTransitions.add( transition );
		
		List<Transition> enablingTransitions = sm.getAllTransitions();
		enablingTransitions.addAll( highLevelTransitions );
		enablingTransitions.removeAll( embeddedTransitions );

		return enablingTransitions;
  }

  // line 1407 "../../../../src/NuSMVCoordinationUnit.ump"
   private CaseStatement getCaseStatement(StateMachine sm, State st, StateMachine parent){
    int counter = 0;
  		BasicExpression root = new BasicExpression("root");
  		for( Transition tr : getAllEnablingTransitions(st) ) {
			
			//System.out.println( getEventName(tr.getEvent())+"["+tr.getFromState().getName() +" -- "+tr.getNextState().getName()+"]");
			BasicExpression bexp;
			if(!parent.equals(sm))
				bexp = new BasicExpression("_"+changeNameCase(parent.getFullName(),0)+".t"+getObjectIdentity( parent, tr) );	
			else	
				bexp = new BasicExpression("t"+getObjectIdentity( parent, tr) );
  			root = getExpressionTreeFor( root, bexp );	
  			counter++;
  		} 			
  		if(counter > 0) {
  			BasicExpression state = new BasicExpression( changeNameCase(st.getStateMachine().getFullName(),1)+"_"+st.getName() ); 
  			return new CaseStatement( root, state );
  		}
  		return null;
  }


  /**
   * This adds expression to activate a composite start state
   */
  // line 1429 "../../../../src/NuSMVCoordinationUnit.ump"
   public Stack<State> ancestorStack(State st){
    if(st.getStateMachine().getParentState() == null)
			return null;
		Stack<State> ancestors = new Stack<State>();
		ancestors.push(st);
		State parent = st.getStateMachine().getParentState();
		while( parent != null && parent.isIsStartState() ) {
			ancestors.push(parent);
			parent = parent.getStateMachine().getParentState();
		}
		return ancestors;
  }

  // line 1442 "../../../../src/NuSMVCoordinationUnit.ump"
   private BasicExpression getExpressionTreeFor(BasicExpression root, BasicExpression bexp){
    if( root.getChildren().size() < 2) {
  			root.addChild(bexp); 
  			root.setOperator(BasicExpression.Operator.OR);
  		}
  		else {
  			BasicExpression temp = new BasicExpression(root.getChildren().get(0).getIdentifier());
  			temp.addChild(root.getChildren().get(0));
  			temp.addChild(bexp);
  			temp.setOperator(BasicExpression.Operator.OR);
  			root.addChild(temp);
  		}
  		return root;
  }

  // line 1457 "../../../../src/NuSMVCoordinationUnit.ump"
   private VarDeclaration genMainVariableFor(StateMachine sm){
    VariableSpecifier vs = new VariableSpecifier(changeNameCase(getAbsoluteName( sm, sm ), 0));	
  		vs.addTypeSpecifier( changeNameCase(getAbsoluteName( sm, sm ), 1));
  		VarDeclaration vdec = new VarDeclaration(vs); 
  		if(!isNested(sm)) 
  			return vdec;
		List<StateMachine> smList = generateStateMachineList( sm );	
  		for( StateMachine smm : smList ) {
  			VariableSpecifier vss = generateVariableSpecifierForMain( smm, sm );
  			vdec.addVariableSpecifier(vss);
  		}
		vdec.removeVariableSpecifier( vs );
  		return vdec;
  }


  /**
   * Generates event enumeration for a given state machine
   */
  // line 1474 "../../../../src/NuSMVCoordinationUnit.ump"
   private VariableSpecifier getEventList(StateMachine sm){
    VariableSpecifier vs = new VariableSpecifier("event");
  		for( String event : getAllEventNames(sm) ) 
  			vs.addTypeSpecifier("ev_"+event );
  		vs.addTypeSpecifier("ev_null");
  		return vs;
  }


  /**
   * Generates state enumeration for a given state machine
   */
  // line 1483 "../../../../src/NuSMVCoordinationUnit.ump"
   private VariableSpecifier getStateList(StateMachine sm){
    VariableSpecifier vs = new VariableSpecifier("state");
  		for(State st : sm.getStates())
  			vs.addTypeSpecifier(changeNameCase(st.getStateMachine().getFullName(),1)+"_"+st.getName());
  		if(sm.getParentState() != null || sm.getStates().size() == 1)
  			vs.addTypeSpecifier("null");
  		return vs;
  }

  // line 1493 "../../../../src/NuSMVCoordinationUnit.ump"
   private void generateSpecifier(String type, VariableSpecifier vs, List<VariableSpecifier> attributes){
    switch( type ) {
			case "Float" : vs.addTypeSpecifier("real"); attributes.add( vs ); break; 
			case "Boolean" : vs.addTypeSpecifier("boolean"); attributes.add( vs ); break;
			case "Integer" : vs.addTypeSpecifier("integer"); attributes.add( vs ); break;
			case "Long" : vs.addTypeSpecifier("integer"); attributes.add( vs ); break;
			case "long" : vs.addTypeSpecifier("integer"); attributes.add( vs ); break;
			case "Short" : vs.addTypeSpecifier("integer"); attributes.add( vs ); break;
			case "short" : vs.addTypeSpecifier("integer"); attributes.add( vs ); break;
			case "Double" : vs.addTypeSpecifier("real"); attributes.add( vs ); break;
			case "double" : vs.addTypeSpecifier("real"); attributes.add( vs ); break;
			case "float" : vs.addTypeSpecifier("real"); attributes.add( vs ); break; 
			case "boolean" : vs.addTypeSpecifier("boolean"); attributes.add( vs ); break;
			case "int" : vs.addTypeSpecifier("integer"); attributes.add( vs ); break;
			default : vs.addTypeSpecifier(type); attributes.add( vs );
		}
  }


  /**
   * Generates the input variable section
   */
  // line 1512 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<VariableSpecifier> generateSpecifiersForInputAttributesOf(UmpleClass uClass){
    List<VariableSpecifier> attributes = new ArrayList<VariableSpecifier>();
		
		for( Attribute attribute : uClass.getAllAttributes() ){
			if( attribute.isIsIvar() ) { 
				VariableSpecifier vs = new VariableSpecifier( attribute.getName() );
				String type = attribute.getFullType();
				generateSpecifier( type, vs, attributes );
			}
		}
		return attributes;
  }

  // line 1525 "../../../../src/NuSMVCoordinationUnit.ump"
   private List<VariableSpecifier> generateSpecifiersForAttributesOf(UmpleClass uClass){
    List<VariableSpecifier> attributes = new ArrayList<VariableSpecifier>();
		
		for( Attribute attribute : uClass.getAllAttributes() ){
			if( !attribute.isConstant() && !attribute.isIsIvar() ) { 
				VariableSpecifier vs = new VariableSpecifier( attribute.getName() );
				String type = attribute.getFullType();
				generateSpecifier( type, vs, attributes );
			}
		}
		return attributes;
  }


  /**
   * Generates the define part for all the transitions of the system
   */
  // line 1539 "../../../../src/NuSMVCoordinationUnit.ump"
   private DefineDeclaration getDefineDeclaration(StateMachine sm, UmpleClass uClass){
    BasicExpression temp = composeExpressionForStability( sm );
  		DefineBody stable = new DefineBody( sm.getFullName()+"_stable", temp );
  		DefineDeclaration ddec = new DefineDeclaration( stable );
  		for( Transition tr : sm.getAllTransitions() ) {
  			BasicExpression bexp = composeExpressionFor( tr, sm );
  			DefineBody dBody = new DefineBody("t"+getObjectIdentity( sm, tr) , bexp);
  			ddec.addDefineBody(dBody);
  		}

		for( Guard gr : sm.getAllGuards() ) {
  			DefineBody dBody = new DefineBody("g"+getObjectIdentity( sm, gr) , generateRHS( gr ));
  			ddec.addDefineBody(dBody);
  		}

		for( Attribute attr : uClass.getAllAttributes() )
			if( attr.isConstant() ) {
				DefineBody dBody = new DefineBody( attr.getName() , new BasicExpression( attr.getValue() ) );
  				ddec.addDefineBody(dBody);
			}
      
  		//ddec.removeDefineBody(dnull);
  		return ddec;
  }

  // line 1564 "../../../../src/NuSMVCoordinationUnit.ump"
   private boolean isConcurrent(State state){
    State parent = state.getStateMachine().getParentState();
		if( parent != null)
			if(parent.isIsConcurrent())
				return true;
		return false;
  }

  // line 1572 "../../../../src/NuSMVCoordinationUnit.ump"
   private BasicExpression composeExpressionFor(Transition tr, StateMachine sm){
    BasicExpression bexp1 = new BasicExpression("event");
  		BasicExpression bexp2 = new BasicExpression("ev_" + getEventName( tr.getEvent() ));
  		BasicExpression bexp3 = new BasicExpression("eventExpr"); 
  		bexp3.addChild(bexp1);
  		bexp3.addChild(bexp2);
  		bexp3.setOperator(BasicExpression.Operator.EQ);
  		
  		BasicExpression bexp4 = generateRHS(tr.getFromState(), tr);
		BasicExpression bexp5;
		BasicExpression bexp6 = new BasicExpression("stateExpr");
		if( isHighLevelTransition(tr) && isConcurrent(tr.getFromState())) {
			bexp5 = new BasicExpression("null");
			bexp6.setOperator(BasicExpression.Operator.NE); 
		}
		else {	
			bexp5 = new BasicExpression(changeNameCase(tr.getFromState().getStateMachine().getFullName(),1)+"_"+tr.getFromState().getName());
			bexp6.setOperator(BasicExpression.Operator.EQ); 
		}
  		bexp6.addChild(bexp4);
  		bexp6.addChild(bexp5); 
  			
  		BasicExpression bexp = new BasicExpression("state");
  		bexp.addChild(bexp3);
  		bexp.addChild(bexp6);
		
		BasicExpression fBexp = new BasicExpression("fExp");
		fBexp.setOperator( BasicExpression.Operator.AND );
		if( tr.getGuard() != null ) {
			BasicExpression guard = new BasicExpression("g"+getObjectIdentity( sm, tr.getGuard()));
			fBexp.addChild(bexp);
			fBexp.addChild(guard);
			return fBexp;
		}
  		  		
  		return bexp;
  }


  /**
   * we exterminate uniqueness of auto-transitions
   */
  // line 1611 "../../../../src/NuSMVCoordinationUnit.ump"
   public Set<String> getAllEventNames(StateMachine sm){
    Set<String> allEvents = new HashSet<String>();
		for( Event event : sm.getAllEvents() )
			allEvents.add( getEventName( event ) );	
		return allEvents;
  }

  // line 1618 "../../../../src/NuSMVCoordinationUnit.ump"
   private String getEventName(Event event){
    if( event.getName().length() > "__autotransition".length() && event.getName().substring( 0, 16).equals( "__autotransition" ) )
			return event.getName().substring( 0, 16)+"__";
		return event.getName();
  }

  // line 1624 "../../../../src/NuSMVCoordinationUnit.ump"
   private BasicExpression composeExpressionForStability(StateMachine sm){
    BasicExpression root = new BasicExpression("root");
		BasicExpression bexp3;
		for( String event : getAllEventNames( sm ) ){
			BasicExpression bexp1 = new BasicExpression("event");
			BasicExpression bexp2 = new BasicExpression("ev_"+ event );
			bexp3 = new BasicExpression("eventExpr"); 
			bexp3.addChild(bexp1);
			bexp3.addChild(bexp2);
			bexp3.setOperator(BasicExpression.Operator.EQ);
			root = getExpressionTreeFor( root, bexp3 );
		}
		root.setDisplayNegation(true);
		root.setBracketed(true);
  		return root;
  }

  // line 1642 "../../../../src/NuSMVCoordinationUnit.ump"
   private BasicExpression generateRHS(Object obj, Transition tr){
    BasicExpression bexp4 = null;
		if( obj instanceof State ) {
			State st = ( State ) obj;
			State state = st.getStateMachine().getParentState(); 
			if( state != null ) {
				StateMachine sm;
				if( !isHighLevelTransition(tr) )
					sm = st.getStateMachine();
				else
					sm = getStateMachineOfHighLevelTransition(tr);
				String name = changeNameCase(sm.getFullName(), 0);
				bexp4 = new BasicExpression("_" +name + ".state"); 
			}
			else 
				bexp4 = new BasicExpression("state");
		}
  		return bexp4;
  }

  // line 1662 "../../../../src/NuSMVCoordinationUnit.ump"
   private BasicExpression generateRHS(Guard guard){
    return new BasicExpression( getExpression( guard.getQueuedExpression() ) );
  }


  /**
   * checks the input string and reports if it is an operator or not
   */
  // line 1667 "../../../../src/NuSMVCoordinationUnit.ump"
   private boolean isOperator(String variable){
    switch( variable ){
			case "+" : return true;
			case "-" : return true;
			case "*" : return true;
			case "/" : return true;
			case "%" : return true;
			case "&&" : return true;
			case "||" : return true;
			case "==" : return true;
			case "!=" : return true;
			case ">=" : return true;
			case "<=" : return true;
			case "<" : return true;
			case ">" : return true;
			case ">>" : return true;
			case "<<" : return true;
			case "+=" : return true;
			case "-=" : return true;
			case "*=" : return true;
			case "%=" : return true;
			case "/=" : return true;
			case ">>=" : return true;
			case "<<=" : return true;
			//case "^" : return true;
			default : return false;
		}
  }

  // line 1696 "../../../../src/NuSMVCoordinationUnit.ump"
   public String getExpression(ArrayDeque<String> nodes){
    String temp = "", lastVariable = "";
		while( nodes.size() > 1) {
			String variable = nodes.poll();
			if( isOperator(variable) )
				temp += " "+ mapOperator( variable ) +" ";
			else	
				temp += variable;
			lastVariable = variable;
		}
		temp += mapOperator( nodes.poll() );
		return temp;
  }

  // line 1710 "../../../../src/NuSMVCoordinationUnit.ump"
   private String mapOperator(String value){
    switch( value ) {
			case "&&" : return "&";
			case "||" : return "|";
			case "%" : return "mod";
			case "==" : return "=";
			//case "object==" : return "=";
			case "true" : return "TRUE";
			case "false" : return "FALSE";
			default : return value;
		}
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _commentModel(Integer numSpaces, StringBuilder sb, UmpleModel model){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(model.getUmpleFile().getFileName());
    realSb.append(TEXT_1);
    realSb.append(TEXT_2);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String commentModel(UmpleModel model){
        StringBuilder sb = new StringBuilder();
    return this._commentModel(0,sb,model).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 90 "../../../../src/NuSMVCoordinationUnit.ump"
  public <E> boolean has ( Collection<E> objectList, E whatToFind ) 
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

// line 733 "../../../../src/NuSMVCoordinationUnit.ump"
  private <Transition> boolean has ( List< HashMap<Transition,Transition> > objectList, HashMap<Transition,Transition> whatToFind ) 
  {
    boolean yes = false;
		
  		for( HashMap<Transition,Transition> entry : objectList ) {
			for( HashMap.Entry<Transition,Transition> map : entry.entrySet() )
				for( HashMap.Entry<Transition,Transition> findMap : whatToFind.entrySet() )
					if( (map.getKey().equals(findMap.getKey()) && map.getValue().equals(findMap.getValue()))
						|| (map.getValue().equals(findMap.getKey()) && map.getKey().equals(findMap.getValue())) ) {
						yes = true;
						break;
					}
  		}
  		return yes;
  }

// line 773 "../../../../src/NuSMVCoordinationUnit.ump"
  private List< HashMap<Transition,Transition> > matchMakeTransitions ( State state ) 
  {
    List< HashMap<Transition,Transition> > pairable = matchMaker( state );
		int i = 0;	
		while( i < getEmbeddedStates( state ).size() ) {
			for( HashMap<Transition,Transition> entry : matchMaker( getEmbeddedStates( state ).get(i) ) )
				for( HashMap.Entry<Transition,Transition> map : entry.entrySet() )
					if( !has( pairable, entry ) && !map.getKey().equals(map.getValue()) )
						pairable.add( entry );
			i++;
		}
		return pairable;
  }

// line 850 "../../../../src/NuSMVCoordinationUnit.ump"
  private List< HashMap< Transition,Transition > > matchMaker ( State state ) 
  {
    List< HashMap< Transition,Transition > > pairable = new ArrayList< HashMap< Transition,Transition > >();
		List<Transition> outgoingTransitions = new ArrayList<Transition>();
		
		if( state.getNestedStateMachines().size() == 0 ) {
			for( Transition transition : state.getStateMachine().getAllTransitions() )
				if( transition.getFromState().equals( state ) && !has( outgoingTransitions, transition ) )
					outgoingTransitions.add( transition );
			match( outgoingTransitions, outgoingTransitions, pairable, false, state );
		}
		else if( state.getNestedStateMachines().size() >= 1 ) {
			
			List<Transition> highLevelTransitions = new ArrayList<Transition>();
			List<Transition> embeddedTransitions = new ArrayList<Transition>();			
			
			//------------------------ extracting highlevel transitions of a composite state ------------------------- 
			for( Transition transition : state.getStateMachine().getAllTransitions() ) {
				if( transition.getFromState().equals( state ) && !has( highLevelTransitions, transition ))
					highLevelTransitions.add( transition );
				
				for( State embeddedState : getEmbeddedStates( state ) )  
					if( transition.getFromState().equals( embeddedState ) )
						embeddedTransitions.add( transition );				
			}
			match( highLevelTransitions, embeddedTransitions, pairable, true, state );
			
			//------------------------ ending extraction of highlevel transitions for composite state ------------------------- 
			if( state.getNestedStateMachines().size() > 1 ) {
				StateMachine parent = state.getStateMachine();
				List<Transition> allOutGoingTransitions = new ArrayList<Transition>();
				
				//------------------------ extracting pairable set of outgoing transitions for an orthogonal state ------------------------- 
				for( State embeddedState : getEmbeddedStates( state ) ) { 
					List<Transition> outgoing = isOutgoingOfOrthogonal( embeddedState, state );
					for( Transition trans : outgoing )
						if( !has( allOutGoingTransitions, trans ) )
							allOutGoingTransitions.add( trans );
					List<Transition> external = new ArrayList<Transition>();
					for( Transition trans : parent.getAllTransitions() )
						if( has( getExternalStateOf( embeddedState, state ), trans.getFromState() ) )
							external.add( trans );
					match( outgoing, external, pairable, true, state );
				}
				//------------------------ ending extraction -------------------------
				
				//------------------------ managing and-cross transitions -------------------------
				List<Transition> andCross = getAndCross( state );
				for( Transition trans : andCross ) {
					State source = trans.getFromState();
					List<State> external = getExternalStateOf( source, state );
					for( Transition tr : state.getStateMachine().getAllTransitions() )
						if( has( external, tr.getFromState() ) && 
							( tr.getEvent().equals( trans.getEvent() ) || getEventName( tr.getEvent() ).equals( getEventName( trans.getEvent()) )) && !isSameDestination(tr, trans, state) ) {
							HashMap<Transition, Transition> entry = new HashMap();
							entry.put(trans, tr);
							for( HashMap.Entry<Transition,Transition> map : entry.entrySet() )
								if( !has( pairable, entry ) && !map.getKey().equals(map.getValue()) )
									pairable.add( entry );
						}
					for( Transition tr : highLevelTransitions ){
						if( ( tr.getEvent().equals( trans.getEvent() ) || getEventName( tr.getEvent() ).equals( getEventName( trans.getEvent()) )) && !isSameDestination(tr, trans, state) ) {
							HashMap<Transition, Transition> entry = new HashMap();
							entry.put(trans, tr);
							for( HashMap.Entry<Transition,Transition> map : entry.entrySet() )
								if( !has( pairable, entry ) && !map.getKey().equals( map.getValue() ) )
									pairable.add( entry );
						}
					}
				}
				//------------------------ ending and-cross management -------------------------
			}
		}
		
		return pairable;
  }

  
}
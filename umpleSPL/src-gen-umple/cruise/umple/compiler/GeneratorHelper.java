/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.UmpleCompilerException;
import java.util.*;
import java.io.*;
import cruise.umple.parser.Position;

// line 20 "../../../../src/GeneratorHelper_Code.ump"
// line 16 "../../../../src/GeneratorHelper_CodeClass.ump"
// line 16 "../../../../src/GeneratorHelper_CodeStateMachine.ump"
// line 16 "../../../../src/GeneratorHelper_CodeTrace.ump"
// line 103 "../../../../src/Trace_refactored.ump"
// line 112 "../../../../src/Trace_refactored.ump"
// line 30 "../../../../src/Mixset_refactored.ump"
// line 1017 "../../../../src/Generator_CodeRuby.ump"
public class GeneratorHelper
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GeneratorHelper()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Following code generation, undo all meta-model internal changes.
   */
  // line 31 "../../../../src/GeneratorHelper_Code.ump"
   public static  void postpare(UmpleModel model){
    postpareClass(model);
    Label_StateMachine_1: ;    
    
postpareTrace(model);
Label_Trace_2: ;

    for (UmpleClass aClass : model.getUmpleClasses())
    {
      postpare(aClass);
    }
  }


  /**
   * Undo all class level internal changes
   */
  // line 44 "../../../../src/GeneratorHelper_Code.ump"
   private static  void postpare(UmpleClass aClass){
    postpareClass(aClass);
    Label_StateMachine_3: ;
    
postpareTrace(aClass);
Label_Trace_4: ;
  }


  /**
   * Remove all internally added classes
   */
  // line 22 "../../../../src/GeneratorHelper_CodeClass.ump"
   public static  void postpareClass(UmpleModel model){
    int maxIndex = model.numberOfUmpleClasses() - 1;
    for (int i=maxIndex; i>=0; i--)
    {
      UmpleClass c = model.getUmpleClass(i);
      if (c.getIsInternal())
      {
        model.removeUmpleClass(c);
      }
    }
  }


  /**
   * Remove all internally added attributes / associations of a class
   */
  // line 36 "../../../../src/GeneratorHelper_CodeClass.ump"
   private static  void postpareClass(UmpleClass aClass){
    int maxIndex = aClass.numberOfCodeInjections() - 1;
    for (int i=maxIndex; i>=0; i--)
    {
      CodeInjection ci = aClass.getCodeInjection(i);
      if (ci.getIsInternal())
      {
        aClass.removeCodeInjection(ci);
      }
    }
    
    maxIndex = aClass.numberOfDepends() - 1;
    for (int i=maxIndex; i>=0; i--)
    {
      Depend d = aClass.getDepend(i);
      if (d.getIsInternal())
      {
        aClass.removeDepend(d);
      }      
    }
  }

  // line 59 "../../../../src/GeneratorHelper_CodeClass.ump"
   public static  String toCode(List<CodeInjection> allCodeInjections){
    String asCode = null;
    if (allCodeInjections != null)
    {
      for (CodeInjection inject : allCodeInjections)
      {
        
if(inject.hasCodeLabel())
          continue;// handle the case when labels are used. // Do nothing
Label_Mixset_5:  ;
        String comment = "//";
        
comment = RubyGenerator.class.isInstance(generator)?"#":"//";
Label_RubyGeneratorIntMixset_6: ;

        String positionString = "";
        Position p = inject.getPosition();
        Position codeP = inject.getCodePosition();
        String injectFooter = "";
        String injectType = inject.getType();
        if (codeP != null) {
            positionString =  comment + " line " + codeP.getLineNumber() + " \"" + inject.getUmpleClassifier().getRelativePath( p.getFilename(), inject.getUmpleClassifier().getSourceModel().getDefaultGenerate() ) + "\"\n";
            if (injectType != null) {
                injectFooter = "\n"+ comment +" END OF UMPLE " + injectType.toUpperCase() + " INJECTION";
            }
        }
        else if (p != null) {
            positionString =  comment +" line " + p.getLineNumber() + " \"" + inject.getUmpleClassifier().getRelativePath( p.getFilename(), inject.getUmpleClassifier().getSourceModel().getDefaultGenerate() ) + "\"\n";
            if (injectType != null) {
                injectFooter = "\n"+ comment +" END OF UMPLE " + injectType.toUpperCase() + " INJECTION";
            }
        }
        if (asCode == null)
        {
          if(inject.getConstraintTree()!=null&&generator!=null)
          {
            asCode = positionString + inject.getConstraintCode(generator) + injectFooter;
          }
          
          else asCode = (inject.getCode()!=null)?positionString + inject.getCode() + injectFooter:positionString + injectFooter;

        }
        else
        {
          if(inject.getConstraintTree()!=null&&generator!=null)
          {
            asCode = StringFormatter.format("{0}\n{1}{2}{3}",asCode,positionString,inject.getConstraintCode(generator), injectFooter);
          }
          else asCode = StringFormatter.format("{0}\n{1}{2}{3}",asCode,positionString,inject.getCode(), injectFooter);
        }
      }
    }
    if (asCode == null)
    {
      return null;
    }
    return asCode;
  }

  // line 114 "../../../../src/GeneratorHelper_CodeClass.ump"
   public static  String doIndent(String code, String indents){
    StringBuilder builder = new StringBuilder(code.length() + indents.length()); //Assume generally only one line, will expand otherwise
    builder.append(indents); //Indent first line
    for (int i = 0; i < code.length(); i++)
    {
      builder.append(code.charAt(i));
      if (code.charAt(i) == '\n')
      {
        builder.append(indents);
      }
    }
    return builder.toString();
  }

  // line 128 "../../../../src/GeneratorHelper_CodeClass.ump"
   public static  boolean isValidReturnStatement(String statement){
    int returnInd = statement.indexOf("return");
  	if (returnInd == -1) {
  	  return false;
  	}
  	if (statement.trim().substring(0,2).equals("//")) { // Can't be in a comment
  	  return false;
  	}
  	if (!(statement.charAt(returnInd + 6) == ';' || statement.charAt(returnInd + 6) == ' ')){
  	  return false;
  	}
  	//Check if it's in a quote
	int openQuote = statement.indexOf("\"");
	while (openQuote != -1 && openQuote < returnInd){
	  int closeQuote = statement.indexOf("\"",openQuote + 1);
	  if (closeQuote > returnInd){
	  	return false;
	  }
	  openQuote = statement.indexOf("\"",closeQuote + 1);
	}
	return true;
  }


  /**
   * Currently no model-level post generate changes required
   */
  // line 23 "../../../../src/GeneratorHelper_CodeStateMachine.ump"
   private static  void postpareStateMachine(UmpleModel aModel){
    
  }


  /**
   * Remove all internal state machine entities
   */
  // line 28 "../../../../src/GeneratorHelper_CodeStateMachine.ump"
   private static  void postpareStateMachine(UmpleClass aClass){
    List<State> shouldDelete = new ArrayList<State>();
    for (StateMachine sm : aClass.getAllStateMachines())
    {
      postpareInternalStates(sm,shouldDelete);
    }

    // Remove all internally created actions
    for (StateMachine sm : aClass.getAllStateMachines())
    {
      for (State s : sm.getStates())
      {
        for (int i=s.numberOfTransitions()-1; i>=0; i--)
        {
          Transition t = s.getTransition(i);
          if (t.getIsInternal())
          {
            t.delete();
          }
        }

        for (int i=s.numberOfActions()-1; i>=0; i--)
        {
          Action a = s.getAction(i);
          if (a.getIsInternal())
          {
            s.removeAction(a);
          }
        }
      }
    }
    
    for (int i=shouldDelete.size()-1; i>=0; i--)
    {
      State s = shouldDelete.get(i);
      s.delete();
    }
  }

  // line 68 "../../../../src/GeneratorHelper_CodeStateMachine.ump"
   public static  void prepareAutoTransitions(StateMachine sm, CodeTranslator codeTranslate, Map<String,String> lookups){
    for (State s : sm.getStates())
    {
      for (Transition t : s.getTransitions())
      {
        if (t.isAutoTransition())
        {
          String eventName = codeTranslate.translate("eventMethod",t.getEvent());
          Action entryAction = new Action(StringFormatter.format(lookups.get("callEvent"),eventName));
          entryAction.setIsInternal(true);
          entryAction.setActionType("entry");
          s.addAction(entryAction);
        }
      }
    }
  }


  /**
   * Add the necessary entry action to delete the object once the final state is reached
   */
  // line 87 "../../../../src/GeneratorHelper_CodeStateMachine.ump"
   public static  void prepareFinalState(StateMachine sm, Map<String,String> lookups){
    for (State s : sm.getStates())
    {
      if (s.isFinalState())
      {
        Action entryAction = new Action(lookups.get("deleteActionCode"));
        entryAction.setIsInternal(true);
        entryAction.setActionType("entry");
        s.addAction(entryAction);
      }
    }
  }


  /**
   * Add the necessary before / after hooks to support nested state machines
   */
  // line 102 "../../../../src/GeneratorHelper_CodeStateMachine.ump"
   public static  void prepareNestedStateMachine(StateMachine sm, int concurrentIndex, Map<String,String> lookups){
    String parentEntryActionCode = lookups.get("parentEntryActionCode");
    String parentExitActionCode = lookups.get("parentExitActionCode");
  
    State parentState = sm.getParentState();
    StateMachine firstSm = parentState.getNestedStateMachine(0);
    State nullState = sm.getNullState();
    if(nullState == null){
      nullState = sm.addState("Null",0);
    }
    nullState.setIsInternal(true);

    if (sm.getStartState() != null)
    {
  
	  // Issue 935 - Have the parent state call the exit method for this state machine
      Action parentExitAction = new Action(parentExitActionCode);
      parentExitAction.setActionType("exit");
      parentState.addAction(parentExitAction, concurrentIndex);
  
  	  // Issue 935 - Add an exit action to each state to set the state machine to its Null state
      String setSmToNullExitActionCode = lookups.get("setSmToNullExitActionCode");
      for (State state : sm.getStates())
      {
        if (state == nullState) { continue; }
        Action setSmToNullExitAction = new Action(setSmToNullExitActionCode);
        setSmToNullExitAction.setActionType("exit");
        state.addAction(setSmToNullExitAction);
      }

      Action parentEntryAction = new Action(parentEntryActionCode);
      parentEntryAction.setActionType("entry");
      parentEntryAction.setIsInternal(true);
      parentState.addAction(parentEntryAction); 
      
      StateMachine parentSm = parentState.getStateMachine();
      State deepState = parentSm.getDeepHistoryState();
      if (deepState != null){
        int x = parentEntryActionCode.lastIndexOf('.');
        int y = parentEntryActionCode.indexOf(')',x);
        String beginning = parentEntryActionCode.substring(0,x + 1);
        String end = parentEntryActionCode.substring(y);
        String deepActionCode = beginning.concat(parentState.getName()).concat(end);
        Action deepEntryAction = new Action(deepActionCode);
        deepEntryAction.setActionType("entry");
        deepEntryAction.setIsInternal(true);
        deepState.addAction(deepEntryAction);
      }
    }
  }

  // line 154 "../../../../src/GeneratorHelper_CodeStateMachine.ump"
   public static  String getFullActivityName(State currentState){
    String name = getNameWithCapital(currentState.getName());
    State parent = null;
     
    name = getNameWithCapital(currentState.getStateMachine().getName()) + name;
    
    parent = currentState.getStateMachine().getParentState();
    while (parent != null)
    {
      name = getNameWithCapital(parent.getStateMachine().getName()) + name;
      parent = parent.getStateMachine().getParentState();
    }
    
    return name;
  }

  // line 171 "../../../../src/GeneratorHelper_CodeStateMachine.ump"
   private static  String getNameWithCapital(String name){
    return name.substring(0, 1).toUpperCase() + name.substring(1);
  }


  /**
   * Mark all internal states are ready for deletion
   */
  // line 177 "../../../../src/GeneratorHelper_CodeStateMachine.ump"
   private static  void postpareInternalStates(StateMachine sm, List<State> shouldDelete){
    for (int i=sm.numberOfStates() - 1; i >= 0; i--)
    {
      State s = sm.getState(i);
      if (s.getIsInternal())
      {
        shouldDelete.add(s);
      }       
    }
  }

  // line 20 "../../../../src/GeneratorHelper_CodeTrace.ump"
   private static  void postpareTrace(UmpleModel aModel){
    
  }


  /**
   * Currently no internal trace entities to remove at the class level
   */
  // line 24 "../../../../src/GeneratorHelper_CodeTrace.ump"
   private static  void postpareTrace(UmpleClass aClass){
    
  }

  // line 37 "../../../../src/GeneratorHelper_CodeTrace.ump"
   public static  boolean getWillGenerateString(){
    return generateString;
  }

  // line 41 "../../../../src/GeneratorHelper_CodeTrace.ump"
   public static  void prepareAllTracers(CodeTranslator t, UmpleModel model, UmpleClass aClass, Map<String,String> templateLookups){
    for(TraceDirective td: aClass.getAllTraceDirectives())
    {
      if(templateLookups.containsKey("dependTracer"))
      {
      	if(td.getTracerType().equals("log4j") || td.getTracerType().equals("javaapi") 
        		|| td.getTracerType().equals("lttngjni") || td.getTracerType().equals("lttng"))
      	{
//          aClass.addDepend(new Depend("org.apache.logging.log4j.LogManager"));
//          aClass.addDepend(new Depend("org.apache.logging.log4j.Logger"));
        }
        else
        {
        	String tracerName = Character.toUpperCase(td.getTracerType().charAt(0)) + td.getTracerType().substring(1);
          aClass.addDepend(new Depend(StringFormatter.format(templateLookups.get("dependTracer"),tracerName)));
        }
      }
      if(templateLookups.containsKey("dependDate"))
      {
        Depend dep = new Depend(templateLookups.get("dependDate"));
        dep.setIsInternal(true);
        aClass.addDepend(dep);
      }
      if ("console".equals(td.getTracerType()))
      {
        if(generateConsole)
        {
          generateConsole=false;
          prepareConsoleTracer(model,templateLookups);
        }
      }
      else if ("file".equals(td.getTracerType()))
      {
        if(generateFile)
        {
          generateFile=false;          
          if(model.getTracer().numberOfTracerArguments()>0)
          {
            templateLookups.put("filename","\""+td.getTracerDirective().getTracerArgument(0).getArgument()+"\"");
          }
          else
          {
            templateLookups.put("filename","\"trace.txt\"");
          }
          prepareFileTracer(model,templateLookups);
        }
      }
      else if ("string".equals(td.getTracerType()))
      {
        if(generateString)
        {
          generateString=false;
          prepareStringTracer(model,templateLookups);
        }
      }
      else if ("log4j".equals(td.getTracerType()))
      {
        generateLog4j=false;
        prepareLog4jTracer(model,templateLookups);
      }
    }
  }


  /**
   * Add a StringTracer class to support "String" tracing - typically used for testing, this methods
   * expects the following action semantic lookups
   * + packageName: What package should this class belong to?
   * + extraCode: What is the code required to execute the trace
   */
  // line 109 "../../../../src/GeneratorHelper_CodeTrace.ump"
   public static  void prepareStringTracer(UmpleModel model, Map<String,String> lookups){
    UmpleClass aClass = model.addUmpleClass("StringTracer");
    
    if (aClass.numberOfAttributes() == 0)
    {
      aClass.setIsInternal(true);
      aClass.setIsSingleton(true); 
      aClass.setPackageName(lookups.get("packageName"));
      Attribute traces = new Attribute("traces","String",null,"null",false,aClass);
      Attribute startTime = new Attribute("startTime","int",null,lookups.get("startTime"),false,aClass);
      traces.setIsList(true);
      CodeInjection init = new CodeInjection("after","constructor", lookups.get("initial"), aClass);
      init.setIsInternal(true);
      aClass.addCodeInjection(init);
      aClass.appendExtraCode(lookups.get("stringTracer"));
      aClass.appendExtraCode(lookups.get("static"));
    }
    aClass.createGeneratedClass(model);
  }

  // line 129 "../../../../src/GeneratorHelper_CodeTrace.ump"
   public static  void prepareConsoleTracer(UmpleModel model, Map<String,String> lookups){
    UmpleClass aClass = model.addUmpleClass("ConsoleTracer");
    
    if (aClass.getExtraCode().equals(""))
    {
      aClass.setIsInternal(true);
      aClass.setIsSingleton(true); 
      aClass.setPackageName(lookups.get("packageName"));
      aClass.appendExtraCode(lookups.get("consoleTracer"));
      aClass.appendExtraCode(lookups.get("static"));
      CodeInjection init = new CodeInjection("after","constructor", lookups.get("initial"), aClass);
      init.setIsInternal(true);
      aClass.addCodeInjection(init);
    }
    aClass.createGeneratedClass(model);
  }

  // line 145 "../../../../src/GeneratorHelper_CodeTrace.ump"
   public static  void prepareFileTracer(UmpleModel model, Map<String,String> lookups){
    UmpleClass aClass = model.addUmpleClass("FileTracer");
    
    if (aClass.getExtraCode()=="")
    {
      aClass.setIsInternal(true);
      aClass.setIsSingleton(true); 
      aClass.addDepend(new Depend("java.io.*"));
      aClass.setPackageName(lookups.get("packageName"));
      
      Attribute filename = new Attribute("filename","String","const",lookups.get("filename"),false,aClass);
      // commented these attributes
      // Umple doesn't support static attributes
      /*
      Attribute output = new Attribute("fout","FileOutputStream","static","null",false,aClass);
      Attribute print = new Attribute("stream","PrintStream","static","null",false,aClass);
      Attribute open = new Attribute("open","boolean","static","false",false,aClass);
       */
      aClass.appendExtraCode("  private static FileOutputStream fout = null;");
      aClass.appendExtraCode("  private static PrintStream stream = null;");
      aClass.appendExtraCode("  private static boolean open = false;");
      aClass.appendExtraCode(lookups.get("fileTracer"));
      aClass.appendExtraCode(lookups.get("static"));
      CodeInjection init = new CodeInjection("after","constructor", lookups.get("initial"), aClass);
      init.setIsInternal(true);
      aClass.addCodeInjection(init);
    }
    aClass.createGeneratedClass(model);
  }

  // line 176 "../../../../src/GeneratorHelper_CodeTrace.ump"
   public static  void prepareLog4jTracer(UmpleModel model, Map<String,String> lookups){
    // Don't generate log4j xml configuration file
  	if(model.getTracer().hasLogConfiguration())
  		if(model.getTracer().getLogConfiguration().getGenerateConfig()==false)
  			return;
  	
    try 
    {
      String path = model.getUmpleFile().getPath();
      String logCode = getLogConfigCode(model,lookups);
      model.setCode(logCode);
      
      String modelFilename = path + File.separator + "log4j2.xml";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(logCode);
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating Log4j2 xml code." + e, e);
    }
  }

  // line 200 "../../../../src/GeneratorHelper_CodeTrace.ump"
   public static  String getLogConfigCode(UmpleModel model, Map<String,String> lookups){
    String logCode = null;
    String rootLogger = null;
    String appender = "";
    int monitorInterval = 0;

    if(model.getTracer().hasLogConfiguration()==false)
    {
      logCode = lookups.get("log4jConfigDefault");
    }
    else
    {
      LogConfiguration lc = model.getTracer().getLogConfiguration();
      
      for(LoggerLevelToAppender logApp : lc.getLoggerLevelToAppenders())
      {
        for(Level level : logApp.getLevels())
        {
          for(Appender app : logApp.getAppenders())
          {
            appender += StringFormatter.format(lookups.get("log4jAppender"),app.getAppender(),level.getLevel());
          }
        }
      }
      
      rootLogger = lc.getRootLogger();
      monitorInterval = lc.getMonitorInterval();

      logCode = StringFormatter.format(lookups.get("log4jLogger"),rootLogger,appender);
      logCode = StringFormatter.format(lookups.get("log4jConfig"), logCode);
      
      if(monitorInterval > 0)
      {
        logCode = logCode.replace("<Configuration>", StringFormatter.format("<Configuration monitorInterval=\"{0}\">", monitorInterval));
      }
    }
    return logCode;
  }


  /**
   * Process output to force consistency
   * this method deals with what is inside the System.err.println();
   */
  // line 242 "../../../../src/GeneratorHelper_CodeTrace.ump"
   static  String prepareConsistentOutput(String [] record, Object... params){
    String output = StringFormatter.format("\"{0}=\" + {1}",params[0],params[1]);
    int i;
    
    for( i = 2 ; i < params.length ; i += 2 )
    {
      if( ! outputRedundant( i, params[i] , params ) )
        output += StringFormatter.format(" + \",{0}=\" + {1}",params[i],params[i+1]);
    }

    if( record != null )
      for( i = 0 ; i < record.length ; ++i )
      {
        if( record[i] == null )
        {
      
        }
        else
          output += StringFormatter.format(" + \",{0}=\" + {1}",record[i],record[i]);
      }
        
    return output;
  }


  /**
   * purpose of this method is make sure that output is not redundant
   */
  // line 268 "../../../../src/GeneratorHelper_CodeTrace.ump"
   static  boolean outputRedundant(int index, Object target, Object... params){
    boolean flag = false;
    
    for( int i =  0 ; i < index ; i += 2 )
    {
      if( target.equals(params[i]) )
        flag = true;
    }
    
    return flag;
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 49 "../../../../src/GeneratorHelper_Code.ump"
  public static SuperCodeGenerator generator = null ;
// line 31 "../../../../src/GeneratorHelper_CodeTrace.ump"
  static private boolean generateConsole = true ;
// line 32 "../../../../src/GeneratorHelper_CodeTrace.ump"
  static private boolean generateFile = true ;
// line 33 "../../../../src/GeneratorHelper_CodeTrace.ump"
  static private boolean generateString = true ;
// line 34 "../../../../src/GeneratorHelper_CodeTrace.ump"
  static private boolean generateLog4j = true ;

  
}
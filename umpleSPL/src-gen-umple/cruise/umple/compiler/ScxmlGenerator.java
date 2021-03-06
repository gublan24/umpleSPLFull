/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;
import java.util.regex.Pattern;

// line 12 "../../../../src/Generator_CodeScxml.ump"
public class ScxmlGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL;
  public static final String TEXT_1 = "<!--  EXPERIMENTAL SCXML OUTPUT, NOT READY FOR USE -->";
  public static final String TEXT_2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
  public static final String TEXT_3 = " ";
  public static final String TEXT_4 = "=\"";
  public static final String TEXT_5 = "\"";
  public static final String TEXT_6 = "<scxml";
  public static final String TEXT_7 = " xmlns=\"http://www.w3.org/2005/07/scxml\" xmlns:xi=\"http://www.w3.org/2001/XInclude\" version=\"1.0\">";
  public static final String TEXT_8 = "</scxml>";
  public static final String TEXT_9 = "<scxml";
  public static final String TEXT_10 = " xmlns=\"http://www.w3.org/2005/07/scxml\" xmlns:xi=\"http://www.w3.org/2001/XInclude\" version=\"1.0\"/>";
  public static final String TEXT_11 = "<state";
  public static final String TEXT_12 = ">";
  public static final String TEXT_13 = "</state>";
  public static final String TEXT_14 = "<state";
  public static final String TEXT_15 = "/>";
  public static final String TEXT_16 = "<transition";
  public static final String TEXT_17 = ">";
  public static final String TEXT_18 = "</transition>";
  public static final String TEXT_19 = "<transition";
  public static final String TEXT_20 = "/>";
  public static final String TEXT_21 = "<raise";
  public static final String TEXT_22 = "/>";
  public static final String TEXT_23 = "<";
  public static final String TEXT_24 = "/";
  public static final String TEXT_25 = ">";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ScxmlGenerator Attributes
  private UmpleModel model;
  private String output;
  private StringBuilder code;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ScxmlGenerator()
  {
    super();
    model = null;
    output = "";
    code = new StringBuilder();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setModel(UmpleModel aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }

  public boolean setOutput(String aOutput)
  {
    boolean wasSet = false;
    output = aOutput;
    wasSet = true;
    return wasSet;
  }

  public boolean setCode(StringBuilder aCode)
  {
    boolean wasSet = false;
    code = aCode;
    wasSet = true;
    return wasSet;
  }

  /**
   * Contains various aspects from an Umple file (.ump), such as classes, attributes, associations and methods.  Generated output is based
   * off of what's contained in here.
   */
  public UmpleModel getModel()
  {
    return model;
  }

  public String getOutput()
  {
    return output;
  }

  public StringBuilder getCode()
  {
    return code;
  }

  public void delete()
  {
    super.delete();
  }

  // line 71 "../../../../src/Generator_CodeScxml.ump"
   public void generate(){
    _genHeader(0, code);
    _genXMLTag(0, code);
    String name = "";
    StateMachine sm = null;
    
    // Verify that there is only one class that contains one state machine
    if (model.getUmpleClasses().size() == 1) {
      if (model.getUmpleClass(0).getStateMachines().size() == 1) {
        sm = model.getUmpleClass(0).getStateMachine(0);
        name = genTagAttribute("name", sm.getName());
      }
    }
    
    if (sm == null || isStateMachineEmpty(sm)) {
    	_genScxmlEmptyTag(0, code, name);
    	model.setCode(code.toString());
    	writeModel();
    	return;
    }
    
    _genScxmlOpeningTag(0, code, name);
    if (sm != null) {
      // Generate code for the state machine.
      for (State state : sm.getStates()) {
        generateState(state);
      }
    }
    
    // Look for additional methods inside the class and add them in a <script> in 
    // the scxml document.
    UmpleClass umpleClass = model.getUmpleClass(0);
    Boolean hasNonAutoGeneratedMethods = false;
    for (Method m : umpleClass.getMethods())
    {
      if (m.getSource() != Method.Source.fAutoAPI)
      {
        hasNonAutoGeneratedMethods = true;
        break;
      }
    }
    if (umpleClass.hasMethods() && hasNonAutoGeneratedMethods) {
      generateScxmlScript(umpleClass.getMethods());
    }
    
    _genScxmlClosingTag(0, code);
    model.setCode(code.toString());
    writeModel();
  }

  // line 121 "../../../../src/Generator_CodeScxml.ump"
   public boolean isStateMachineEmpty(StateMachine sm){
    UmpleClass parent = sm.getUmpleClass();
    return sm != null && !sm.hasStates() && !parent.hasMethods();
  }

  // line 126 "../../../../src/Generator_CodeScxml.ump"
   private void generateState(State state){
    if (isStateEmpty(state)) {
      _genStateEmptyTag(0, code, genTagAttribute("id", state.getName()));
      return;
    }
    
    _genStateOpeningTag(0, code, genTagAttribute("id", state.getName()));
    
    if (stateHasOnEntry(state)) {
      generateOnEntry(state);
    }
    
    if (stateHasOnExit(state)) {
      generateOnExit(state);
    }
    
    for (Transition transition: state.getTransitions()) {
      generateTransition(transition);
    }
    
    // Handle nested states.
    for (StateMachine nestedStateMachine : state.getNestedStateMachines()) {
      for (State subState : nestedStateMachine.getStates()) {
        generateState(subState);
      }
    }
     
    _genStateClosingTag(0, code);
  }

  // line 156 "../../../../src/Generator_CodeScxml.ump"
   private boolean isStateEmpty(State state){
    return state != null && !state.hasTransitions() && !state.hasNestedStateMachines() && !state.hasActions();
  }

  // line 160 "../../../../src/Generator_CodeScxml.ump"
   private boolean stateHasOnEntry(State state){
    if (state.hasActivities()) {
      return true;
    }
    
    for (Action action: state.getActions()) {
      if ("entry".equals(action.getActionType())) {
        return true;
      }
    }
    
    return false;
  }

  // line 174 "../../../../src/Generator_CodeScxml.ump"
   private boolean stateHasOnExit(State state){
    for (Action action: state.getActions()) {
      if ("exit".equals(action.getActionType())) {
        return true;
      }
    }
    
    return false;
  }

  // line 184 "../../../../src/Generator_CodeScxml.ump"
   private void generateTransition(Transition transition){
    String event = "";
    String cond = "";
    String target = genTagAttribute("target", transition.getNextState().getName());
    String type = "";
    
    if (transition.hasEvent()) {
      event = genTagAttribute("event", transition.getEvent().getName());
    }
    
    if (transition.hasGuard()) {
      Guard guard = transition.getGuard();
      cond = genTagAttribute("cond", guard.getCondition(new JavaGenerator()));
    }
    
    if (isTransitionEmpty(transition)) {
    	_genTransitionTag(0, code, event, cond, target, type);
    	return;
   	}
   	
   	_genTransitionOpeningTag(0, code, event, cond, target, type);
   	
   	if (transition.hasAction()) {
   		generateTransitionAction(transition.getAction());
   	}
   	
   	_genTransitionClosingTag(0, code);
  }

  // line 213 "../../../../src/Generator_CodeScxml.ump"
   private boolean isTransitionEmpty(Transition transition){
    return transition != null && !transition.hasAction();
  }

  // line 218 "../../../../src/Generator_CodeScxml.ump"
   private void generateOnEntry(State state){
    _genGenericTag(0, code, "onentry", false);
     
    for(Action action: state.getActions()) {
      _genGenericTag(0, code, "script", false);
      if ("entry".equals(action.getActionType())) {
        _genTextElement(0, code, action.getActionCode());
      }
      _genGenericTag(0, code, "script", true);
    }
     
    for (Activity activity: state.getActivities()) {
      _genGenericTag(0, code, "script", false);
      _genTextElement(0, code, activity.getActivityCode());
      _genGenericTag(0, code, "script", true);
      
      if (activity.hasOnCompletionEvent()) {
        Event cEvent = activity.getOnCompletionEvent();
        if (cEvent.isAutoTransition()) {
          String event = " event=\"" + cEvent.getName() + "\"";
          _genRaiseTag(0, code, event);
        }
      }
    } 
    
    _genGenericTag(0, code, "onentry", true);
  }

  // line 246 "../../../../src/Generator_CodeScxml.ump"
   private void generateOnExit(State state){
    _genGenericTag(0, code, "onexit", false);
    _genGenericTag(0, code, "script", false);
    
    for (Action action: state.getActions()) {
      if ("exit".equals(action.getActionType())) {
        _genTextElement(0, code, action.getActionCode());
      }
    }
 	
    _genGenericTag(0, code, "script", true);
    _genGenericTag(0, code, "onexit", true);
  }

  // line 260 "../../../../src/Generator_CodeScxml.ump"
   private void generateTransitionAction(Action action){
    _genGenericTag(0, code, "script", false);
 	_genTextElement(0, code, action.getActionCode());
 	_genGenericTag(0, code, "script", true);
  }

  // line 266 "../../../../src/Generator_CodeScxml.ump"
   private void generateScxmlScript(List<Method> methods){
    _genGenericTag(0, code, "script", false);
     
     for (Method method: methods) {
      if (method.getSource() == Method.Source.fAutoAPI)
        continue;
      _genTextElement(0, code, method.toString());  
     }
     
     _genGenericTag(0, code, "script", true);
  }

  // line 280 "../../../../src/Generator_CodeScxml.ump"
   private void writeModel(){
    try
    {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName() + ".scxml";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(model.getCode());
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating SCXML code." + e, e);
    }
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _genTextElement(Integer numSpaces, StringBuilder sb, String content){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(content);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genTextElement(String content){
        StringBuilder sb = new StringBuilder();
    return this._genTextElement(0,sb,content).toString(); 
  }

  public StringBuilder _genHeader(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_1);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genHeader(){
        StringBuilder sb = new StringBuilder();
    return this._genHeader(0,sb).toString(); 
  }

  public StringBuilder _genXMLTag(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_2);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genXMLTag(){
        StringBuilder sb = new StringBuilder();
    return this._genXMLTag(0,sb).toString(); 
  }

  public StringBuilder _genTagAttribute(Integer numSpaces, StringBuilder sb, String key, String value){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_3);
    realSb.append(key);
    realSb.append(TEXT_4);
    realSb.append(value);
    realSb.append(TEXT_5);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genTagAttribute(String key, String value){
        StringBuilder sb = new StringBuilder();
    return this._genTagAttribute(0,sb,key,value).toString(); 
  }

  public StringBuilder _genScxmlOpeningTag(Integer numSpaces, StringBuilder sb, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_6);
    realSb.append(name);
    realSb.append(TEXT_7);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genScxmlOpeningTag(String name){
        StringBuilder sb = new StringBuilder();
    return this._genScxmlOpeningTag(0,sb,name).toString(); 
  }

  public StringBuilder _genScxmlClosingTag(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_8);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genScxmlClosingTag(){
        StringBuilder sb = new StringBuilder();
    return this._genScxmlClosingTag(0,sb).toString(); 
  }

  public StringBuilder _genScxmlEmptyTag(Integer numSpaces, StringBuilder sb, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_9);
    realSb.append(name);
    realSb.append(TEXT_10);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genScxmlEmptyTag(String name){
        StringBuilder sb = new StringBuilder();
    return this._genScxmlEmptyTag(0,sb,name).toString(); 
  }

  public StringBuilder _genStateOpeningTag(Integer numSpaces, StringBuilder sb, String id){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_11);
    realSb.append(id);
    realSb.append(TEXT_12);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genStateOpeningTag(String id){
        StringBuilder sb = new StringBuilder();
    return this._genStateOpeningTag(0,sb,id).toString(); 
  }

  public StringBuilder _genStateClosingTag(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_13);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genStateClosingTag(){
        StringBuilder sb = new StringBuilder();
    return this._genStateClosingTag(0,sb).toString(); 
  }

  public StringBuilder _genStateEmptyTag(Integer numSpaces, StringBuilder sb, String id){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_14);
    realSb.append(id);
    realSb.append(TEXT_15);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genStateEmptyTag(String id){
        StringBuilder sb = new StringBuilder();
    return this._genStateEmptyTag(0,sb,id).toString(); 
  }

  public StringBuilder _genTransitionOpeningTag(Integer numSpaces, StringBuilder sb, String event, String cond, String target, String type){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_16);
    realSb.append(event);
    realSb.append(cond);
    realSb.append(target);
    realSb.append(type);
    realSb.append(TEXT_17);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genTransitionOpeningTag(String event, String cond, String target, String type){
        StringBuilder sb = new StringBuilder();
    return this._genTransitionOpeningTag(0,sb,event,cond,target,type).toString(); 
  }

  public StringBuilder _genTransitionClosingTag(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_18);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genTransitionClosingTag(){
        StringBuilder sb = new StringBuilder();
    return this._genTransitionClosingTag(0,sb).toString(); 
  }

  public StringBuilder _genTransitionTag(Integer numSpaces, StringBuilder sb, String event, String cond, String target, String type){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_19);
    realSb.append(event);
    realSb.append(cond);
    realSb.append(target);
    realSb.append(type);
    realSb.append(TEXT_20);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genTransitionTag(String event, String cond, String target, String type){
        StringBuilder sb = new StringBuilder();
    return this._genTransitionTag(0,sb,event,cond,target,type).toString(); 
  }

  public StringBuilder _genRaiseTag(Integer numSpaces, StringBuilder sb, String event){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_21);
    realSb.append(event);
    realSb.append(TEXT_22);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genRaiseTag(String event){
        StringBuilder sb = new StringBuilder();
    return this._genRaiseTag(0,sb,event).toString(); 
  }

  public StringBuilder _genGenericTag(Integer numSpaces, StringBuilder sb, String tagName, boolean isClosing){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_23);
    if (isClosing) {
    realSb.append(TEXT_24);
    }
    realSb.append(tagName);
    realSb.append(TEXT_25);
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String genGenericTag(String tagName, boolean isClosing){
        StringBuilder sb = new StringBuilder();
    return this._genGenericTag(0,sb,tagName,isClosing).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "code" + "=" + (getCode() != null ? !getCode().equals(this)  ? getCode().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
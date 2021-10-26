/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.*;
import java.util.*;

// line 12 "../../../../src/Generator_CodeJsonMixed.ump"
public class JsonMixedGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //JsonMixedGenerator Attributes
  private UmpleModel model;
  private String output;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JsonMixedGenerator()
  {
    super();
    model = null;
    output = "";
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

  public void delete()
  {
    super.delete();
  }

  // line 26 "../../../../src/Generator_CodeJsonMixed.ump"
   public void generate(){
    String jsonForClasses = StringFormatter.format("{0}umpleClasses{0}:[", "\"");
    String jsonForInterfaces = StringFormatter.format("{0}umpleInterfaces{0}:[", "\"");
    String jsonForAssociations = StringFormatter.format("{0}umpleAssociations{0}:[", "\"");

    boolean isFirst = true;
    for (UmpleClass aClass : model.getUmpleClasses())
    {
      String x = aClass.getCoordinates().getX() + "";
      String y = aClass.getCoordinates().getY() + "";
      String width = aClass.getCoordinates().getWidth() + "";
      String height = aClass.getCoordinates().getHeight() + "";
      String name = aClass.getName();
      String displayColor = aClass.getDisplayColor();
      boolean isAbstract = aClass.getIsAbstract();
      
      // Strip off leading and trailing quotes if they exist
      if(displayColor.startsWith("\""))
        displayColor=displayColor.substring(1,displayColor.length());
      if(displayColor.endsWith("\""))
        displayColor=displayColor.substring(0,displayColor.length()-1);

      String jsonForAttributes = "";
      String jsonForMethods = "";
      for (Attribute attribute : aClass.getAttributes())
      {
        if (jsonForAttributes.length() > 0)
        {
          jsonForAttributes += ", "; 
        }
        
        String attributeType = attribute.getFullType();
        String modifier = "";
        
        if (attribute.isConstant()) 
        {
          modifier = "const";
        }
        
        String traceColor = "black";
        for( TraceDirective tc : aClass.getAllTraceDirectives() )
          for( AttributeTraceItem ati : tc.getAttributeTraceItems() )
            for( UmpleVariable aVar : ati.getUmpleVariables() )
              if( aVar.getName().equals(attribute.getName()) )
                traceColor = "red";
        
        jsonForAttributes += StringFormatter.format(
          "{\n {0}type{0} : {0}{1}{0},\n {0}name{0} : {0}{2}{0},\n " +
          "{0}modifier{0} : {0}{3}{0},\n {0}traceColor{0} : {0}{4}{0} }",
          "\"",
          attributeType,
          attribute.getName(),
          modifier,
          traceColor);
      }

      for(Method method : aClass.getMethods())
      {
		if (method.getSource() == Method.Source.fAutoAPI)
      	  continue;
	  
        if(jsonForMethods.length() > 0)
        {
          jsonForMethods += ", ";
        }
        String methodModifier = method.getModifier();
        String methodReturnType = method.getType();

        String visibility="";
        if(methodModifier.matches(".*public.*"))
          visibility = "public";
        else if(methodModifier.matches(".*private.*"))
          visibility = "private";
        else if(methodModifier.matches(".*protected.*"))
          visibility = "protected";

        String methodParams = "";
        for(MethodParameter param : method.getMethodParameters())
        {
          if(methodParams.length() > 0)
          {
            methodParams += ",";
          }
          methodParams += param.getFullType().trim();
        }
        jsonForMethods += StringFormatter.format(
          "{\n {0}type{0} : {0}{1}{0},\n {0}name{0} : {0}{2}{0},\n " +
          "{0}parameters{0} : {0}{3}{0},\n {0}visibility{0} : {0}{4}{0},\n {0}isAbstract{0} : {0}{5}{0}}",
          "\"",
          methodReturnType,
          method.getName(),
          methodParams,
          visibility,
          method.getIsAbstract());
      }

      if (!isFirst)
      {
        jsonForClasses += ", ";
      }

      String extendsJson = "";
      if (aClass.getExtendsClass() != null)
      {
        String extendsClassName = aClass.getExtendsClass().getName();
        extendsJson = StringFormatter.format(",\n {0}extendsClass{0}: {0}{1}{0}","\"",extendsClassName);
      }
      //Add implemented interfaces in jsonForClasses: if a class implements one or multiple interfaces, the name of thoese interfaces will be included in Json
      String implementedInterfaces = "";

      if (aClass.hasParentInterface() == true)
      {
          int index = 0;
          implementedInterfaces = StringFormatter.format(",\n {0}implementedInterfaces{0}: [ ","\"");
          for (UmpleInterface uInterface : aClass.getParentInterface())
          {
              if (index > 0)
              {
                implementedInterfaces += ", "; 
              }
              implementedInterfaces += StringFormatter.format("{ {0}interfacesName{0}: {0}{1}{0} }","\"",uInterface.getName());
              index ++;
          }
          implementedInterfaces += " ]";
      }
       

      boolean isInterface = false;

      // All code above is cut-n-paste from JsonGenerator
      String jsonForStateMachines = "";
      // Process the top level state machines in a class
      for (StateMachine sm : aClass.getStateMachines())
      {
        jsonForStateMachines += parseStateMachines(sm);
      }

      jsonForClasses += StringFormatter.format(
        "{\n{0}position{0}: {\n{0}x{0}: {1},\n {0}y{0}: {2},\n {0}width{0}: {3},\n " +
        "{0}height{0}: {4}},\n {0}attributes{0}: [{7}],\n{0}methods{0}: [{8}],\n " +
        "{0}id{0}: {0}{5}{0},\n {0}name{0}: {0}{6}{0},\n {0}isAbstract{0}: {0}{13}{0},\n {0}displayColor{0}: {0}{10}{0} {9},\n " +
        "{0}isInterface{0}: {0}{11}{0}{12},\n " +
        "{0}stateMachines{0}: [{14}] }", 
        "\"", 
        x, 
        y, 
        width, 
        height, 
        name, 
        name, 
        jsonForAttributes,
        jsonForMethods,
        extendsJson,
        displayColor,
        isInterface,
        implementedInterfaces,
        isAbstract,
        jsonForStateMachines);

      isFirst = false;
    }

    boolean isFirstInterface = true;
    for (UmpleInterface aInterface : model.getUmpleInterfaces())
    {
      String x = aInterface.getCoordinates().getX() + "";
      String y = aInterface.getCoordinates().getY() + "";
      String width = aInterface.getCoordinates().getWidth() + "";
      String height = aInterface.getCoordinates().getHeight() + "";
      String name = aInterface.getName();
      //String displayColor = aInterface.getDisplayColor();
      String displayColor = "";
      String jsonForAttributes = "";
      String jsonForMethods = "";
      String extendsJson = "";
      boolean isInterface = true;
      String implementedInterfaces = "";
      boolean isAbstract = false;

	//Fix for issue #911 - UmpleOnline in Editable diagram mode was not displaying methods for interfaces
	  for(Method method : aInterface.getMethods())
      {
      	if (method.getSource() == Method.Source.fAutoAPI)
      	  continue;

        if(jsonForMethods.length() > 0)
        {
          jsonForMethods += ", ";
        }
        String methodModifier = method.getModifier();
        String methodReturnType = method.getType();

        String visibility="";
        if(methodModifier.matches(".*public.*"))
          visibility = "public";
        else if(methodModifier.matches(".*private.*"))
          visibility = "private";
        else if(methodModifier.matches(".*protected.*"))
          visibility = "protected";

        String methodParams = "";
        for(MethodParameter param : method.getMethodParameters())
        {
          if(methodParams.length() > 0)
          {
            methodParams += ",";
          }
          methodParams += param.getFullType().trim();
		}
                 
        jsonForMethods += StringFormatter.format(
          "{\n {0}type{0} : {0}{1}{0},\n {0}name{0} : {0}{2}{0},\n " +
          "{0}parameters{0} : {0}{3}{0},\n {0}visibility{0} : {0}{4}{0},\n {0}isAbstract{0} : {0}{5}{0}}",
          "\"",
          methodReturnType,
          method.getName(),
          methodParams,
          visibility,
          method.getIsAbstract());
      }
		//End of fix

      if (!isFirst)
      {
        jsonForClasses += ", ";
      }

      jsonForClasses += StringFormatter.format(
        "{\n{0}position{0}: {\n{0}x{0}: {1},\n {0}y{0}: {2},\n {0}width{0}: {3},\n " +
        "{0}height{0}: {4}},\n {0}attributes{0}: [{7}],\n{0}methods{0}: [{8}],\n " +
        "{0}id{0}: {0}{5}{0},\n {0}name{0}: {0}{6}{0},\n {0}isAbstract{0}: {0}{13}{0},\n {0}displayColor{0}: {0}{10}{0} {9},\n " + 
        "{0}isInterface{0}: {0}{11}{0}{12}}", "\"", 
        x, 
        y, 
        width, 
        height, 
        name, 
        name, 
        jsonForAttributes,
        jsonForMethods,
        extendsJson, 
        displayColor,
        isInterface,
        implementedInterfaces,
        isAbstract);

      isFirst = false;
    }

    int index = 0;
    for (Association aAssoc : model.getAssociations())
    {
      String c1Name = extractClassName(aAssoc.getEnd(0));
      String c2Name = extractClassName(aAssoc.getEnd(1));
      
      if (index > 0)
      {
        jsonForAssociations += ", ";
      }

      int x1 = -1;
      int y1 = -1;
      int x2 = -1;
      int y2 = -1;
      String name = aAssoc.getName();
      String multOne = aAssoc.getEnd(0).toSimpleString();
      String multTwo = aAssoc.getEnd(1).toSimpleString();
      String roleOne = aAssoc.getEnd(0).getRoleName();
      String roleTwo = aAssoc.getEnd(1).getRoleName();
      String modifierOne = aAssoc.getEnd(0).getModifier();
      String modifierTwo = aAssoc.getEnd(1).getModifier();
      
      if (aAssoc.getEnd(0).getIsDefaultRoleName()) roleOne = "";
      if (aAssoc.getEnd(1).getIsDefaultRoleName()) roleTwo = "";

      if (aAssoc.numberOfPositions() > 0)
      {
        Coordinate position = aAssoc.getPosition(0);
        x1 = position.getX();
        y1 = position.getY();
      }

      if (aAssoc.numberOfPositions() > 1)
      {
        Coordinate position = aAssoc.getPosition(1);
        x2 = position.getX();
        y2 = position.getY();
      }

      String traceColor = "black";
      for (UmpleClass aClass : model.getUmpleClasses())
        for( TraceDirective tc : aClass.getAllTraceDirectives() )
          for( AssociationTraceItem asi : tc.getAssociationTraceItems() )
            for( AssociationVariable aVar : asi.getAssociationVariables() )
              if( aVar.getName().equals(roleOne) || aVar.getName().equals(roleTwo) )
                traceColor = "red";

      String associationId = "umpleAssociation_" + index;
      String baseAssociationJson = 
          "{\n\"offsetOnePosition\": {\n\"x\": {2},\n \"y\": {3},\n \"width\": 0,\n \"height\": 0},\n " +
          "\"offsetTwoPosition\": {\n\"x\": {4},\n \"y\": {5},\n \"width\": 0,\n \"height\": 0},\n " +
          "\"id\": \"{6}\",\n \"classOneId\": \"{0}\",\n \"classTwoId\": \"{1}\",\n " +
          "\"multiplicityOne\": \"{7}\",\n \"multiplicityTwo\": \"{8}\",\n " +
          "\"name\": \"{9}\",\n \"roleOne\": \"{10}\",\n \"roleTwo\": \"{11}\",\n " +
          "\"isLeftNavigable\":\"{12}\",\n \"isRightNavigable\":\"{13}\",\n " +
          "\"isLeftComposition\":\"{14}\",\n \"isRightComposition\":\"{15}\",\n " + 
          "\"isSymmetricReflexive\":\"{16}\",\n \"isTraced\":\"{17}\"}";

      String isSymmetricReflexive;

      if ("symmetricreflexive".equals(modifierOne) && "symmetricreflexive".equals(modifierTwo)) 
      {
        roleOne = roleTwo;
        roleTwo = "";
        isSymmetricReflexive = "true";
      }
      else 
      {
        isSymmetricReflexive = "false";
      }

      jsonForAssociations += StringFormatter.format(
          baseAssociationJson,
          c1Name, 
          c2Name, 
          x1, 
          y1, 
          x2, 
          y2,
          associationId, 
          multOne, 
          multTwo, 
          name, 
          roleOne, 
          roleTwo, 
          aAssoc.getIsLeftNavigable(), 
          aAssoc.getIsRightNavigable(), 
          aAssoc.getIsLeftComposition(), 
          aAssoc.getIsRightComposition(), 
          isSymmetricReflexive, 
          traceColor);

      index += 1;
    }

    jsonForClasses += "]";
    jsonForAssociations += "]";
    jsonForInterfaces += "]";
    //String json = "{" + jsonForClasses + ", " + jsonForInterfaces + ", " + jsonForAssociations + " }";
    String json = "{" + jsonForClasses  + ",\n " + jsonForAssociations + " }";
    model.setCode(json);
  }

  // line 379 "../../../../src/Generator_CodeJsonMixed.ump"
   private String parseStateMachines(StateMachine sm){
    String jsonForStateMachines = "";
    // This check shouldn't be needed ... check carried over from GvStateDiagram
    // if(sm.getParentState() == null) { 
      String states = "";
      String transitions = "";
      int indexState = 0;
      int indexTrans = 0;

      for (State s : sm.getStates()) {

        String internals = "";
        int indexInterns = 0;

        if (indexState > 0) {
          states += ", ";
        }
        indexState += 1;

        // transitions += parseTransitions(s);
        Set<Transition> allT = new HashSet<Transition>();
        allT.addAll(s.getTransitions());
        for (Transition t: allT) {

          if (t.getFromState().equals(t.getNextState())) {
            if (indexInterns > 0) {
              internals += ", ";
            }
            indexInterns += 1;
            // make an internal transition
            internals += parseInternalTransition(t);
          }
          else {
            if (indexTrans > 0) {
              transitions += ", ";
            }
            indexTrans += 1;
            transitions += parseSingleTransition(t);
          }

        }

        //if (transitions.charAt(transitions.length() - 1) == '}') {
        //  transitions += ", ";
        //}
        String jsonForNestedMachines = "";
        int indexNested = 0;
        Set<StateMachine> nested = new HashSet<StateMachine>();
        nested.addAll(s.getNestedStateMachines());
        for (StateMachine ns : nested) {
          if (indexNested > 0) {
            jsonForNestedMachines += ", ";
          }
          indexState += 1;

          jsonForNestedMachines += parseStateMachines(ns);
        }

        states += StringFormatter.format(
          "{\n {0}name{0}: {0}{1}{0},\n {0}id{0}: {0}{1}{0},\n {0}actions{0}: [{2}],\n " +
		    "{0}activities{0}: [{7}],\n "+
            "{0}isstart{0}: {3},\n {0}isfinal{0}: {4},\n " + 
            "{0}size{0}: {\n {0}width{0}: 50, {0}height{0}: 50 },\n " +
            "{0}internals{0}: [{5}], {0}stateMachines{0}: [{6}] }",
          "\"",
          s.getName(),
          parseStateActions(s),
          s.getIsStartState(),
		  s.isFinalState(),
          internals,
          jsonForNestedMachines,
		  parseStateActivities(s)
        );
      }

      jsonForStateMachines += StringFormatter.format(
      "{\n {0}name{0}: {0}{1}{0},\n {0}states{0}: [{2}],\n {0}transitions{0}: [{3}] } ",
      "\"",
      sm.getName(),
      states,
      transitions
      );
    // }
    //else {
    //	jsonForStateMachines = "skipped";
    //}
    return jsonForStateMachines;
  }

  // line 468 "../../../../src/Generator_CodeJsonMixed.ump"
   private String parseSingleTransition(Transition t){
    String transitionLabel = t.getEvent().getName();
    if (t.getGuard() != null) {
      transitionLabel += " [" + t.getGuard().getExpression() + "]";
    }

    String actionCode = "";
    Action action = t.getAction();
    if (action != null) {
      actionCode = action.getActionCode();
      if (actionCode.equals("null")) {
        actionCode = "";
      }
      else {
        transitionLabel += " / " + actionCode;
      }
    }

    transitionLabel = java.util.regex.Pattern.compile("[\"]").matcher(transitionLabel).replaceAll("'");
    transitionLabel = java.util.regex.Pattern.compile("[\\n]").matcher(transitionLabel).replaceAll("\",\"");

    String text = StringFormatter.format(
      "{\n {0}source{0}: {\n {0}id{0}: {0}{1}{0} },\n " + 
      "{0}target{0}: {\n {0}id{0}: {0}{2}{0} },\n " +
      "{0}labels{0}: [{\n {0}position{0}: 0.5,\n {0}attrs{0}: {\n {0}text{0}: {\n {0}text{0}: " +
      "{0}{3}{0},\n {0}font-weight{0}: {0}bold{0} } } }] }",
      "\"",
      t.getFromState().getName(),
      t.getNextState().getName(),
      transitionLabel
    );

    return text;
  }

  // line 503 "../../../../src/Generator_CodeJsonMixed.ump"
   private String parseInternalTransition(Transition t){
    String transition = t.getEvent().getName();
    if (t.getGuard() != null) {
      transition += " [" + t.getGuard().getExpression() + "]";
    }

    String actionCode = "";
    Action action = t.getAction();
    if (action != null) {
      actionCode = action.getActionCode();
      if (actionCode.equals("null")) {
        actionCode = "";
      }
      else {
        transition += " / " + actionCode;
      }
    }

    transition = java.util.regex.Pattern.compile("[\"]").matcher(transition).replaceAll("'");
    transition = java.util.regex.Pattern.compile("[\\n]").matcher(transition).replaceAll("\",\"");

    return StringFormatter.format(
      "{0}{1}{0}",
      "\"",
      transition
      );
  }

  // line 531 "../../../../src/Generator_CodeJsonMixed.ump"
   private String parseTransitions(State s){
    Set<Transition> allT = new HashSet<Transition>();
    allT.addAll(s.getTransitions());
    String transitions = "";
    int index = 0;
    for (Transition t: allT) {
      if (index > 0) {
        transitions += ", ";
      }
      index += 1;

      String transitionLabel = t.getEvent().getName();
      if (t.getGuard() != null) {
        transitionLabel += " [" + t.getGuard().getExpression() + "]";
      }

      String actionCode = "";
      Action action = t.getAction();
      if (action != null) {
        actionCode = action.getActionCode();
        if (actionCode.equals("null")) {
          actionCode = "";
        }
        else {
          transitionLabel += " / " + actionCode;
        }
      }
      transitionLabel = java.util.regex.Pattern.compile("[\"]").matcher(transitionLabel).replaceAll("'");
      transitionLabel = java.util.regex.Pattern.compile("[\\n]").matcher(transitionLabel).replaceAll("\",\"");

      transitions += StringFormatter.format(
        "{\n {0}source{0}: {\n {0}id{0}: {0}{1}{0} },\n " + 
          "{0}target{0}: {\n {0}id{0}: {0}{2}{0} },\n " +
          "{0}labels{0}: [{\n {0}position{0}: 0.5,\n {0}attrs{0}: {\n {0}text{0}: {\n {0}text{0}: " +
          "{0}{3}{0},\n {0}font-weight{0}: {0}bold{0} } } }] }",
        "\"",
        t.getFromState().getName(),
        t.getNextState().getName(),
        transitionLabel
      );
    }
    return transitions;
  }

  // line 575 "../../../../src/Generator_CodeJsonMixed.ump"
   private String parseStateActions(State s){
    String actions = "";
    int index = 0;
    for (Action action : s.getActions()) {
    if (index > 0) {
      actions += ", ";
      }
      index += 1;

      String actionCode = action.getActionCode();
      // Action code can include a print statement, 
      // which includes double quotes to screw up the JSON parsing in the client.
      actionCode = java.util.regex.Pattern.compile("[\"]").matcher(actionCode).replaceAll("'");
      // Some action code is comprised of multiple lines, so requires being split
      // into separate items for display.
      actionCode = java.util.regex.Pattern.compile("[\\n]").matcher(actionCode).replaceAll("\",\"");

      actions += StringFormatter.format(
        "{0}{1} / {2}{0}",
        "\"",
        action.getActionType(),
        actionCode
      );
    }
    return actions;
  }

  // line 602 "../../../../src/Generator_CodeJsonMixed.ump"
   private String parseStateActivities(State s){
    String activities = "";
    int index = 0;
    for (Activity activity : s.getActivities()) {
      if (index > 0) {
        activities += ", ";
      }
      index += 1;

      String activityCode = activity.getActivityCode();
      // Activity Code can include a print statement, 
      // which includes double quotes to screw up the JSON parsing in the client.
      activityCode = java.util.regex.Pattern.compile("[\"]").matcher(activityCode).replaceAll("'");
      // Some Activity Code is comprised of multiple lines, so requires being split
      // into separate items for display.
      activityCode = java.util.regex.Pattern.compile("[\\n]").matcher(activityCode).replaceAll("\",\"");

      activities += StringFormatter.format(
		"{0} {1}{0}",
        "\"",
        activityCode
      );
    }
    return activities;
  }


  /**
   * Method to deal with association ends being different entities
   * (eg. class or interface)
   */
  // line 631 "../../../../src/Generator_CodeJsonMixed.ump"
   private String extractClassName(AssociationEnd aAssocEnd){
    UmpleClass umpClass = model.getUmpleClass(aAssocEnd.getClassName());

    if(umpClass != null) 
    {
      return umpClass.getName();
    }
      
    //Must be an interface at this end of the association
    UmpleInterface umpInterface = 
      model.getUmpleInterface(aAssocEnd.getClassName());

    return umpInterface.getName();
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
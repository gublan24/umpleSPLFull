/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.HashMap;
import java.util.Map;
import cruise.umple.parser.Position;
import cruise.umple.parser.Token;
import cruise.umple.parser.ErrorMessage;
import cruise.umple.compiler.Port.Direction;
import cruise.umple.compiler.ActiveMethod.ActiveType;
import cruise.umple.compiler.ActiveDirectionHandler.DirectionHandler;
import cruise.umple.compiler.Trigger.TimeType;
import cruise.umple.compiler.DeferredFunction.DeferredCallType;
import cruise.umple.compiler.ActiveDirectionHandlerBody.BodyType;
import cruise.umple.compiler.TimerConstraint.TimeConstraintType;
import cruise.umple.compiler.Port.Type;
import cruise.umple.compiler.MessageHandler.CommunicationType;
import cruise.umple.analysis.*;
import java.util.*;

/**
 * Fragment source file: UmpleInternalParser_CodeStructure.ump
 * Line : 1260
 * Used as a helper class to analyze tokens in a given component
 */
// line 52 "../../../../src/Association_refactored.ump"
// line 18 "../../../../src/UmpleInternalParser_CodeStructure.ump"
public class CompositeStructureTokenAnalyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CompositeStructureTokenAnalyzer Attributes
  private UmpleInternalParser parser;
  private UmpleClass componentClass;
  private boolean mustWarn;

  //CompositeStructureTokenAnalyzer Associations
  private List<UmpleClass> components;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CompositeStructureTokenAnalyzer(UmpleInternalParser aParser)
  {
    parser = aParser;
    mustWarn = true;
    components = new ArrayList<UmpleClass>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setParser(UmpleInternalParser aParser)
  {
    boolean wasSet = false;
    parser = aParser;
    wasSet = true;
    return wasSet;
  }

  public boolean setComponentClass(UmpleClass aComponentClass)
  {
    boolean wasSet = false;
    componentClass = aComponentClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setMustWarn(boolean aMustWarn)
  {
    boolean wasSet = false;
    mustWarn = aMustWarn;
    wasSet = true;
    return wasSet;
  }

  public UmpleInternalParser getParser()
  {
    return parser;
  }

  public UmpleClass getComponentClass()
  {
    return componentClass;
  }

  /**
   * 
   * /////////////////////////////////////////////// TO BE REMOVED AFTER FIXING ERRORS WITH LATEST CHANGES ///////////////////////////////////////////////////////////////////////
   */
  public boolean getMustWarn()
  {
    return mustWarn;
  }
  /* Code from template association_GetMany */
  public UmpleClass getComponent(int index)
  {
    UmpleClass aComponent = components.get(index);
    return aComponent;
  }

  public List<UmpleClass> getComponents()
  {
    List<UmpleClass> newComponents = Collections.unmodifiableList(components);
    return newComponents;
  }

  public int numberOfComponents()
  {
    int number = components.size();
    return number;
  }

  public boolean hasComponents()
  {
    boolean has = components.size() > 0;
    return has;
  }

  public int indexOfComponent(UmpleClass aComponent)
  {
    int index = components.indexOf(aComponent);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfComponents()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addComponent(UmpleClass aComponent)
  {
    boolean wasAdded = false;
    if (components.contains(aComponent)) { return false; }
    CompositeStructureTokenAnalyzer existingCompositeStructureTokenAnalyzer = aComponent.getCompositeStructureTokenAnalyzer();
    if (existingCompositeStructureTokenAnalyzer == null)
    {
      aComponent.setCompositeStructureTokenAnalyzer(this);
    }
    else if (!this.equals(existingCompositeStructureTokenAnalyzer))
    {
      existingCompositeStructureTokenAnalyzer.removeComponent(aComponent);
      addComponent(aComponent);
    }
    else
    {
      components.add(aComponent);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeComponent(UmpleClass aComponent)
  {
    boolean wasRemoved = false;
    if (components.contains(aComponent))
    {
      components.remove(aComponent);
      aComponent.setCompositeStructureTokenAnalyzer(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addComponentAt(UmpleClass aComponent, int index)
  {  
    boolean wasAdded = false;
    if(addComponent(aComponent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfComponents()) { index = numberOfComponents() - 1; }
      components.remove(aComponent);
      components.add(index, aComponent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveComponentAt(UmpleClass aComponent, int index)
  {
    boolean wasAdded = false;
    if(components.contains(aComponent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfComponents()) { index = numberOfComponents() - 1; }
      components.remove(aComponent);
      components.add(index, aComponent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addComponentAt(aComponent, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !components.isEmpty() )
    {
      components.get(0).setCompositeStructureTokenAnalyzer(null);
    }
  }

  // line 54 "../../../../src/Association_refactored.ump"
   private ConstraintTree analyzeAssociationLiteralConstraintExpression(Token literalToken, UmpleClassifier uClassifier, boolean cardinal, boolean all, boolean firstName, ConstraintTree subject, ConstraintOperator operator){
    ConstraintTree rawLine = new ConstraintTree();
		for(Token sub:literalToken.getSubTokens())
		{
			if(sub.is("associationLit"))
			{
				rawLine.addElementAll(analyzeAssociationLiteralConstraintExpression(sub, uClassifier, cardinal, all, firstName, subject, operator));
				firstName = false;
			}
			else if(sub.is("constraintName"))
			{
				if(!firstName)
				{
					if(all&&!cardinal)
					{
						rawLine.addElement(new ConstraintOperator("&&"));
					}
					else
					{
						rawLine.addElement(new ConstraintOperator("||"));
					}
				}
				else
				{
					firstName = false;
				}
				rawLine.addElementAll(subject);
				rawLine.addElement(operator);
				rawLine.addElement(analyzeConstraintName(sub,uClassifier,true));
			}
			else if(sub.is("elements"))
			{
				if(!cardinal)
				{
					operator.setValue("cardinality==");
				}
			}
			else if(sub.is("number"))
			{
				if(!firstName)
				{
					if(all&&!cardinal)
					{
						rawLine.addElement(new ConstraintOperator("&&"));
					}
					else
					{
						rawLine.addElement(new ConstraintOperator("||"));
					}
				}
				else
				{
					firstName = false;
				}
				rawLine.addElementAll(subject);
				rawLine.addElement(operator);
				rawLine.addElement(analyzeConstraintNumber(sub));
				firstName = false;
			}
		}
		return rawLine;
  }

  // line 118 "../../../../src/Association_refactored.ump"
   private ConstraintTree analyzeAssociationConstraintExpression(Token associationExpressionToken, UmpleClassifier uClassifier){
    List<Token> associationExpressionSubtokens = associationExpressionToken.getSubTokens();
		ConstraintTree rawLine = new ConstraintTree();
		ConstraintTree subject = new ConstraintTree();
		boolean card = associationExpressionToken.getValue("firstOp").equals("cardinality");
		boolean all = false;
		ConstraintOperator operator = new ConstraintOperator(associationExpressionToken.getValue("firstOp"));
		for(Token sub : associationExpressionSubtokens)
		{
			if(sub.is("constraintName"))
			{
				subject.addElement(analyzeConstraintName(sub,uClassifier,true));
			}
			  else if(sub.is("associationLit"))
			  {
				rawLine.addElementAll(analyzeAssociationLiteralConstraintExpression(sub,uClassifier,card,all,true,subject,operator));
			  }
			else if(sub.is("all"))
			{
				if(!card)
				{
					operator.setValue("hasAll");
					all = true;
				}
				else
				{
					//warning that cardinality all is not supported
				}
			}
			else if(sub.is("moreOp"))
			{
				if(!card)
				{
					card = true;
				}
				operator.setValue("cardinality>");
			}
			else if(sub.is("smallerOp"))
			{
				if(!card)
				{
					card = true;
				}
				operator.setValue("cardinality<");
			}
			else if(sub.is("greaterOp"))
			{
				if(!card)
				{
					card = true;
				}
				operator.setValue("cardinality>=");
			}
			else if(sub.is("lessOp"))
			{
				if(!card)
				{
					card = true;
				}
				operator.setValue("cardinality<=");
			}
			else if(sub.is("equalsOp"))
			{
				if(!card)
				{
					card = true;
				}
				operator.setValue("cardinality==");
			}
			else if(sub.is("notequalsOp"))
			{
				if(!card)
				{
					card = true;
				}
				operator.setValue("cardinality!=");
			}
		}
		return rawLine;
  }

  // line 49 "../../../../src/UmpleInternalParser_CodeStructure.ump"
  public void logError(Position position, int errorCode, String... messages){
    getParser().getParseResult().setPosition(position);
	  getParser().getParseResult().addErrorMessage(new ErrorMessage(errorCode,position,messages));
  }

  // line 54 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   public String analyzeInlineComment(Token token){
    String txt = token.getValue();
	  return !txt.startsWith("@outputumplesource") && !txt.equals("$?[End_of_model]$?") ? txt : null;
  }

  // line 59 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   public List<Comment> analyzeMultiComment(Token token){
    List<Comment> cmtList = new ArrayList<Comment>();
	  String inlineComments[] = token.getValue().split("\n");

	  for (int i = 0; i < inlineComments.length; i++)
	  {
		  if(!inlineComments[i].startsWith("@outputumplesource")) {
			  cmtList.add(new Comment(inlineComments[i]));
		  }
	  }

	  return cmtList;
  }

  // line 73 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   public void analyzePortClassDefinition(Token token){
    if(token!=null) {
		componentClass.setPortClass(true);
	   }
  }

  // line 80 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   public void analyzePortBindingDefinition(Token token){
    if(token!=null) {
		   String from = null , to = null , code = null, toPortClass = null, fromPortClass = null;
		   for(Token portParamToken: token.getSubTokens()) {
			   if(portParamToken.is("fromPort")) {
				   from = portParamToken.getValue();
			   } else if(portParamToken.is("toPort")) {
				   to = portParamToken.getValue();
			   } else if(portParamToken.is("bindinHandler")) {
				   Token codeToken = portParamToken.getSubToken("code");
				   if(codeToken != null) {
					   code = codeToken.getValue();
				   }
			   } else if(portParamToken.is("fromClassname")) {
				   fromPortClass = portParamToken.getValue();
			   } else if(portParamToken.is("toClassname")) {
				   toPortClass = portParamToken.getValue();
			   }
		   }
		   if(from != null && to != null ) {
			   PortBindingInformation pbi = new PortBindingInformation(fromPortClass, from,toPortClass, to, code);
			   pbi.setPosition(token.getPosition());
			   pbi.setEndPosition(token.getEndPosition());
			   componentClass.addPortBindingInformation(pbi);
		   }
	   }
  }

  // line 108 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   public void analyzePortDefinition(Token token){
    if(token!=null) {
		   for(Token portParamToken: token.getSubTokens()) {
			   if(portParamToken.is("port")) {
				   analyzePortClassDefinition(portParamToken);
			   } else if(portParamToken.is("portDeclaration")) {
				   analyzePortDeclaration(portParamToken);
			   }
		   }
	   }
  }

  // line 120 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   public void analyzePortDeclaration(Token token){
    if(token!=null) {
    	String name = null, type = "String";
    	Direction direction = null;
    	String modifier = "public";
    	boolean isConjugated = false, isReplicated = false;
    	int multiplicity = 0;
    	for(Token portParamToken: token.getSubTokens()) {
    		if(portParamToken.is("typedPortName")) {
    			Token portNameToken = portParamToken.getSubToken("portName");
    			Token portTypeToken = portParamToken.getSubToken("type");
    			Token portMulToken = portParamToken.getSubToken("portMultiplicity");
    			if(portNameToken != null) {
        			name = portNameToken.getValue("portName");
        			if(!Token.isValidIdentifier(name)){
        				logError(token.getPosition(), 3601, portParamToken.getValue("portName"));
        			}
        		}
    			if(portTypeToken != null) {
        			type = portTypeToken.getValue("type");
        		}
    			if(portMulToken != null) {
        			isReplicated = true;
        			Token mulToken = portMulToken.getSubToken(0);
        			String mulValue = mulToken.getValue();
        			if(mulValue != null
        					&& mulValue.length() > 0) {
        				mulValue = mulValue.substring(1, mulValue.length()-1);
        			}
        			if(mulValue.matches("\\d")) {
        				multiplicity = Integer.parseInt(mulValue);
        			}
        		}
    		} else if (portParamToken.is("modifier")){
    			if(portParamToken.getValue() != null && portParamToken.getValue().length() > 0){
    				modifier = portParamToken.getValue();
    			}
    		} else if(portParamToken.is("direction")) {
    			String dirStr = portParamToken.getValue("direction");
    			if(dirStr.equalsIgnoreCase("in")) {
    				direction = Direction.IN;
    			} else if(dirStr.equalsIgnoreCase("out")) {
    				direction = Direction.OUT;
    			} else if(dirStr.equalsIgnoreCase("port")) {
    				direction = Direction.BOTH;
    			}
    			if(direction == null){
    				logError(token.getPosition(), 3602, portParamToken.getValue("direction")); // Error msg
    			}
    		} else if(portParamToken.is("inverse")) {
    			isConjugated = true;
    		}
    	}
    	Port portDef = new Port(name,modifier ,isConjugated, multiplicity, isReplicated, type);
    	portDef.setDirection(direction);
    	componentClass.addPort(portDef);
      }
  }

  // line 180 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private DeferredFunction createAnonymousBody(Token activeTriggerToken, ActiveMethod aMethod){
    CodeBlock cb = new CodeBlock();
	   Token codeToken = activeTriggerToken.getSubToken("code");
	   if(codeToken != null) {
		   cb.setCode(codeToken.getValue());
		   DeferredFunction anonymousDeferredFunc = new DeferredFunction();
		   anonymousDeferredFunc.setDeferredCallType(DeferredCallType.ANONYMOUS);
		   AnonymousFunction anonymousFunc = new AnonymousFunction();
		   anonymousFunc.setCodeblock(cb);
		   anonymousDeferredFunc.setAnonymousFunction(anonymousFunc);
		   return anonymousDeferredFunc;
	   }
	   return null;
  }

  // line 195 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeAnonymousBody(Trigger trig, Token activeTriggerToken, ActiveMethod aMethod){
    DeferredCall anonymousCall = new DeferredCall();
	   anonymousCall.addList(createAnonymousBody(activeTriggerToken, aMethod));
	   trig.setDeferredCall(anonymousCall);
  }

  // line 201 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeHitchConstraint(Trigger trig, Token activeTriggerToken, ActiveMethod aMethod){
    Token clauseToken = activeTriggerToken.getSubToken("clause");
	   Token timerToken = activeTriggerToken.getSubToken("timer");
	   if(clauseToken != null && timerToken != null ) {
		   String clause = clauseToken.getValue();
		   String timer = timerToken.getValue();
		   if(clause.equalsIgnoreCase("after")) {
			   trig.setTimeType(TimeType.AFTER);
		   } else if(clause.equalsIgnoreCase("poll")) {
			   trig.setTimeType(TimeType.POLL);
		   } else if(clause.equalsIgnoreCase("timeout")) {
			   trig.setTimeType(TimeType.TIMEOUT);
		   }
		   trig.setTimerPSec(timer);
	   }
  }

  // line 218 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeTriggerConstraintTree(Trigger trig, Token ConstraintTreeToken, ActiveMethod aMethod){
    for(Token constraintToken : ConstraintTreeToken.getSubTokens()) {
		   if(constraintToken.getSubToken("messageConstraint") != null) {
			   Token msgToken = constraintToken.getSubToken("messageConstraint");
			   Token priorityToken = msgToken.getSubToken("priorityValue");
			   if(priorityToken != null) {
				   MessageConstraint msgConstraint = new MessageConstraint(priorityToken.getValue());
				   trig.setMessageConstraint(msgConstraint);
			   }

		   } else if(constraintToken.getSubToken("timeConstraint") != null) {
			   Token timeToken = constraintToken.getSubToken("timeConstraint");
			   Token clauseToken = timeToken.getSubToken("clause");
			   Token timerToken = timeToken.getSubToken("timer");
			   if(clauseToken != null && timerToken != null ) {
				   String clause = clauseToken.getValue();
				   String timer = timerToken.getValue();
				   TimerConstraint tc = new TimerConstraint();
				   tc.setPosition(constraintToken.getPosition());
				   tc.setEndPosition(constraintToken.getEndPosition());
				   if(clause.equalsIgnoreCase("latency")) {
					   tc.setTimeConstraintType(TimeConstraintType.LTENCY);
				   } else if(clause.equalsIgnoreCase("period")) {
					   tc.setTimeConstraintType(TimeConstraintType.PERIOD);
				   } else if(clause.equalsIgnoreCase("timeout")) {
					   tc.setTimeConstraintType(TimeConstraintType.TIMEOUT);
				   }
				   tc.setTimer(timer);
				   trig.addTimerConstraint(tc);
			   }
		   } else if(constraintToken.getValue() != "STATIC") {
			   ConstraintTree cvs = analyzeInvariantConstraint(constraintToken);
			   BasicConstraint constraint = new BasicConstraint();
			   constraint.setPosition(constraintToken.getPosition());
			   constraint.setEndPosition(constraintToken.getEndPosition());
			   constraint.addElementAll(cvs);
			   trig.addConstraint(constraint);
		   }
	   }
  }

  // line 259 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeConstraintTree(Monitor pw, Token ConstraintTreeToken, ActiveMethod aMethod){
    for(Token constraintToken : ConstraintTreeToken.getSubTokens()) {
		   if(constraintToken.is("timeConstraint")) {
			   Token timeToken = constraintToken.getSubToken("timeConstraint");
			   Token clauseToken = timeToken.getSubToken("clause");
			   Token timerToken = timeToken.getSubToken("timer");
			   if(clauseToken != null && timerToken != null ) {
				   String clause = clauseToken.getValue();
				   String timer = timerToken.getValue();
				   TimerConstraint tc = new TimerConstraint();
				   tc.setPosition(constraintToken.getPosition());
				   tc.setEndPosition(constraintToken.getEndPosition());
				   if(clause.equalsIgnoreCase("latency")) {
					   tc.setTimeConstraintType(TimeConstraintType.LTENCY);
				   } else if(clause.equalsIgnoreCase("period")) {
					   tc.setTimeConstraintType(TimeConstraintType.PERIOD);
				   } else if(clause.equalsIgnoreCase("timeout")) {
					   tc.setTimeConstraintType(TimeConstraintType.TIMEOUT);
				   }
				   tc.setTimer(timer);
				   pw.addTimerConstraint(tc);
			   }
		   } else if(constraintToken.getValue() != "STATIC") {
			   ConstraintTree cvs = analyzeInvariantConstraint(constraintToken);
			   BasicConstraint constraint = new BasicConstraint();
			   constraint.setPosition(constraintToken.getPosition());
			   constraint.setEndPosition(constraintToken.getEndPosition());

			   if(cvs.getNumberOfElements() == 0) {
				   Token portToken = constraintToken.getSubToken("constraintName");
				   if(portToken != null) {
					   Token nameToken = portToken.getSubToken("name");
					   ConstraintVariable cv = new ConstraintLiteral( nameToken.getValue());
					   constraint.addElement(cv);
				   }
			   } else {
				   constraint.addElementAll(cvs);
			   }
			   pw.addConstraint(constraint);
		   }
	   }
  }

  // line 302 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeInvoke(Trigger trig, Token activeTriggerToken, ActiveMethod a){
    DeferredCall invokeCall = new DeferredCall();
	   DeferredFunction invokeDeferredFunc = new DeferredFunction();
	   invokeDeferredFunc.setDeferredCallType(DeferredCallType.METHOD);
	   for(Token invokeToken : activeTriggerToken.getSubTokens())
	   {
		   if (invokeToken.is("name"))
		   {
			   invokeDeferredFunc.setMethodInvoke(invokeToken.getValue());
		   }
		   if (invokeToken.is("parameter"))
		   {
			   invokeDeferredFunc.addParameter(invokeToken.getValue());
		   }
	   }
	   invokeCall.addList(invokeDeferredFunc);
	   trig.setDeferredCall(invokeCall);
  }

  // line 321 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeActiveTrigger(boolean normalHandler, Token activeTriggerToken, ActiveMethod aMethod){
    Trigger trig = new Trigger();
	trig.setTimeType(TimeType.NONE);
	DeferredFunction thenDef = null , resolveDef = null;
    for(Token activeToken : activeTriggerToken.getSubTokens()) {
		   if(activeToken.is("anonymousTriggerBody")) {
			   analyzeAnonymousBody(trig, activeToken, aMethod);
		   } else if(activeToken.is("hitchConstraint")) {
			   analyzeHitchConstraint(trig, activeToken, aMethod);
		   } else if(activeToken.is("ConstraintTree") || activeToken.is("constraintList")) {
			   analyzeTriggerConstraintTree(trig, activeToken, aMethod);
		   } else if(activeToken.is("invoke")) {
			   analyzeInvoke(trig, activeToken, aMethod);
		   } else if(activeToken.is("thenDefinition")) {
			   Token annoyToken = activeToken.getSubToken("anonymousTriggerBody");
			   if(annoyToken != null) {
				   thenDef = createAnonymousBody(annoyToken, aMethod);
			   }
		   } else if(activeToken.is("resolveDefinition")) {
			   Token annoyToken = activeToken.getSubToken("anonymousTriggerBody");
			   if(annoyToken != null) {
				   resolveDef = createAnonymousBody(annoyToken, aMethod);
			   }
		   }
	   }
	   if(trig != null) {
			   if(trig.getDeferredCall() != null ) {
				   trig.getDeferredCall().setThen(thenDef);
				   trig.getDeferredCall().setResolve(resolveDef);
			   }
			   ActiveDirectionHandlerBody abh = new ActiveDirectionHandlerBody();
			   abh.setBodyType(BodyType.TRIGGER);
			   abh.setTrigger(trig);
			   aMethod.getMethodBody().addActiveDirectionHandlerBody(abh);
		}
  }

  // line 358 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeMethodBody(Token activeMethodBody, ActiveMethod aMethod){
    boolean normalHandler = true;
	  for(Token methodToken : activeMethodBody.getSubTokens())
	  {
		  if(methodToken.is("activeDirectionHandler")) {
			  Token methodDirectionToken = methodToken.getSubToken("direction");
			  if(methodDirectionToken != null ) {
				  String methodDirection = methodDirectionToken.getValue();
				  if(methodDirection.equalsIgnoreCase("forward")) {
					  normalHandler = true;
				  } else if(methodDirection.equalsIgnoreCase("inverse")) {
					  normalHandler = false;
				  }
				  aMethod.getMethodBody().setPosition(activeMethodBody.getPosition());
				  aMethod.getMethodBody().setEndPosition(activeMethodBody.getEndPosition());
			  }
		  }
		  else if (methodToken.is("inlineComment"))
		  {
			  String txt = analyzeInlineComment(methodToken);
			  if(txt != null) {
				  ActiveDirectionHandlerBody abh = new ActiveDirectionHandlerBody();
				  abh.setBodyType(BodyType.COMMENT);
				  abh.setComment(new Comment(txt));
				  aMethod.getMethodBody().addActiveDirectionHandlerBody(abh);
			  }
		  }
		  else if (methodToken.is("multilineComment"))
		  {
			  List<Comment> cmtList = analyzeMultiComment(methodToken);
			  if(cmtList.size() > 0) {
				  for(Comment cmt : cmtList) {
					  ActiveDirectionHandlerBody abh = new ActiveDirectionHandlerBody();
					  abh.setBodyType(BodyType.COMMENT);
					  abh.setComment(cmt);
					  aMethod.getMethodBody().addActiveDirectionHandlerBody(abh);
				  }
			  }
		  }
		  else if (methodToken.is("code"))
		  {
			  ActiveDirectionHandlerBody abh = new ActiveDirectionHandlerBody();
			  CodeBlock cb = new CodeBlock(methodToken.getValue());
			  abh.setCodeblock(cb);
			  aMethod.getMethodBody().addActiveDirectionHandlerBody(abh);
		  } else if (methodToken.is("activeTrigger")){
			  analyzeActiveTrigger(normalHandler, methodToken, aMethod);
		  }

	  }
  }

  // line 410 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeMethodDeclarator(Token activeMethodDeclarator, ActiveMethod aMethod){
    for(Token methodToken : activeMethodDeclarator.getSubTokens())
	  {
		  if (methodToken.is("methodName"))
		  {
			  aMethod.setName(methodToken.getValue());
		  }
		  if (methodToken.is("parameterList"))
		  {
			  for(Token parameterToken : methodToken.getSubTokens())
			  {
				  boolean isList = false;
				  if (parameterToken.is("parameter"))
				  {
					  String paramType="";
					  if (parameterToken.getSubToken("type") != null)
					  {
						  paramType = parameterToken.getSubToken("type").getValue();
					  }
					  if (parameterToken.getSubToken("list") != null)
					  {
						  isList = parameterToken.getSubToken("list").getValue() != null;
					  }
					  String paramName = parameterToken.getSubToken("name").getValue();
					  MethodParameter aParameter  = new MethodParameter(paramName,paramType,null,null, false);
					  aParameter.setIsList(isList);
					  aMethod.addMethodParameter(aParameter);
				  }
			  }
		  }
	  }
  }

  // line 443 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   public void analyzeActiveMethodDefinition(Token activeMethodToken){
    if(activeMethodToken != null) {
    	ActiveDirectionHandler forwardBody = new ActiveDirectionHandler();
    	ActiveDirectionHandler inverseBody = new ActiveDirectionHandler();
    	inverseBody.setDirectionHandler(DirectionHandler.INVERSE);
    	ActiveMethod inverseMethod = new ActiveMethod("", "", "", inverseBody, null);
    	ActiveMethod aMethod = new ActiveMethod("", "", "",forwardBody,inverseMethod);
    	// TODO
    	Protocol protocol = new Protocol();
    	// Set method position
    	aMethod.setPosition(activeMethodToken.getPosition());
    	aMethod.setEndPosition(activeMethodToken.getEndPosition());

    	//    List<String> langs = new ArrayList<String>();
    	//    CodeBlock cb = new CodeBlock("");
    	for(Token token : activeMethodToken.getSubTokens())
    	{
    		if (token.is("modifier"))
    		{
    			aMethod.setModifier(token.getValue());
    			inverseMethod.setModifier(token.getValue());
    		}
    		if (token.is("ConstraintTree") || token.is("constraintList"))
    		{
    			Monitor pw = new Monitor(aMethod);
    			analyzeConstraintTree(pw, token, aMethod);
    			aMethod.addWatchList(pw);
    		}
    		else if (token.is("type"))
    		{
    			aMethod.setType(token.getValue()); 
    			inverseMethod.setType(token.getValue());
    		}
    		else if (token.is("activeType"))
    		{
    			String activeType = token.getValue("activeType");
    			if(activeType.equalsIgnoreCase("atomic")) {
    				aMethod.setActiveType(ActiveType.ATOMIC);
    				inverseMethod.setActiveType(ActiveType.ATOMIC);
    			} else if(activeType.equalsIgnoreCase("synchronous")) {
    				aMethod.setActiveType(ActiveType.SYNCH);
    				inverseMethod.setActiveType(ActiveType.SYNCH);
    			} else if(activeType.equalsIgnoreCase("intercept")) {
    				aMethod.setActiveType(ActiveType.INTERCEPTOR);
    				inverseMethod.setActiveType(ActiveType.INTERCEPTOR);
    			} else {
    				aMethod.setActiveType(ActiveType.ASYNCH);
    				inverseMethod.setActiveType(ActiveType.ASYNCH);
    			}
    		}
    		else if (token.is("activeMethodDeclarator"))
    		{
    			analyzeMethodDeclarator(token, aMethod);
    		}
    		else if (token.is("activeMethodBody"))
    		{
    			int len = token.getSubTokens().size();
    			if( len > 0 && token.getSubToken(0).is("activeMethodBodyContent")) {
    				analyzeMethodBody(token.getSubToken(0), aMethod);
    			}
    			if( len > 1 && token.getSubToken(1).is("inverseDirectionHandler")) {
    				for(Token subToken : token.getSubToken(1).getSubTokens()) {    							
    					if (subToken.is("ConstraintTree") || subToken.is("constraintList")) {
    						Monitor pw= new Monitor(inverseMethod);
    						analyzeConstraintTree(pw, subToken, inverseMethod);
    						inverseMethod.addWatchList(pw);
    					} else if (subToken.is("activeMethodDeclarator")) {
    						analyzeMethodDeclarator(subToken, inverseMethod);
    					} else if (subToken.is("activeMethodBodyContent")) {
    						analyzeMethodBody(subToken, inverseMethod);
    					}
    				}
    			}
    		}
    	}
    	componentClass.addActiveMethod(aMethod);
    }
  }

  // line 522 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   public UmpleVariable getSubcomponentVariable(UmpleClass cmpClass, String cls, String varName){
    UmpleVariable att = null;
	   if(varName != null && varName.length() > 0 && cls != null) {
		   if(cls.equalsIgnoreCase("this")) {
			   att = null; // No var, it is in the same class
		   } else {
			   att = cmpClass.getAttribute(cls);
			   if(att == null) {
				   att = cmpClass.getAssociationVariable(cls);
			   }
		   }
	   }
	   return att;
  }

  // line 537 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void buildBindingPortData(){
    for(UmpleClass cmpClass : getComponents()) {
			  // Build Binding Ports
			  for(PortBindingInformation pbi : cmpClass.getPortBindingInformation()) {
				  boolean errorFound = false;
				  UmpleClass fromClass = null, toClass = null;
				  Port from = null, to = null;

				  boolean bindfromSubcomponent = pbi.getFromPortClass() != null && pbi.getFromPortClass().length() > 0;
				  boolean bindtoSubcomopnent = pbi.getToPortClass() != null && pbi.getToPortClass().length() > 0;

				  UmpleVariable fromVar = getSubcomponentVariable(cmpClass, pbi.getFromPortClass(), pbi.getFromPort());
				  UmpleVariable toVar = getSubcomponentVariable(cmpClass, pbi.getToPortClass(), pbi.getToPort());

				  if(bindfromSubcomponent) {
					  if(fromVar == null) {
						  fromClass = cmpClass;
					  } else {
						  String type = fromVar.getType();
						  fromClass = parser.getModel().getUmpleClass(type);
						  if(fromClass == null) {
							  // log error comp doesn't exist
							  logError(pbi.getPosition(), 3603, type); // Error msg
						  }
					  }
				  }
				  if(bindtoSubcomopnent) {
					  if(toVar == null) {
						  toClass = cmpClass;
					  } else {
						  String type = toVar.getType();
						  toClass = parser.getModel().getUmpleClass(type);
						  if(toClass == null) {
							  // log error comp doesn't exist
							  logError(pbi.getPosition(), 3604, type); // Error msg
						  }
					  }
				  }

				  if(bindfromSubcomponent && fromClass == null ) {
					  // Log Error
					  errorFound = true;
				  }

				  if(bindtoSubcomopnent && toClass == null ) {
					  // Log Error
					  errorFound = true;
				  }

				  if(pbi.getFromPort() == null || pbi.getFromPort().length() == 0 ) {
					  // Log Error
					  errorFound = true;
					  logError(pbi.getPosition(), 3605, pbi.getFromPort()); // Error msg
				  }

				  if(pbi.getToPort() == null || pbi.getToPort().length() == 0 ) {
					  // Log Error
					  errorFound = true;
					  logError(pbi.getPosition(), 3606, pbi.getToPort()); // Error msg
				  }

				  if(!errorFound) {
					  if(bindfromSubcomponent) {
						  if(fromClass == null) {
							  from = cmpClass.getPort(pbi.getFromPort());
						  } else {
							  from = fromClass.getPort(pbi.getFromPort());
						  }
					  } else {
						  from = cmpClass.getPort(pbi.getFromPort());
					  }
					  if(bindtoSubcomopnent) {
						  if(toClass == null) {
							  to = cmpClass.getPort(pbi.getToPort());
						  } else {
							  to = toClass.getPort(pbi.getToPort());
						  }
					  } else {
						  to = cmpClass.getPort(pbi.getToPort());
					  }

					  if(from == null || to == null) {
						  // Log Error
						  errorFound = true;
						  if(from == null)
						  	logError(pbi.getPosition(), 3607, pbi.getFromPort(), pbi.getFromPortClass()); // Error msg
						  if(to == null)
						  	logError(pbi.getPosition(), 3607, pbi.getToPort(), pbi.getToPortClass()); // Error msg
					  } else {
						  PortBinding pb = new PortBinding(from, to);
						  pb.setFromSubcomponent(fromVar);
						  pb.setToSubcomponent(toVar);

						  if(pbi.getCode() != null && pbi.getCode().length() > 0) {
							  AnonymousFunction af = new AnonymousFunction();
							  af.setCodeblock(new CodeBlock(pbi.getCode()));
							  pb.setSpecialHandler(af);
						  }
						  cmpClass.addPortBinding(pb);
					  }

				  }
			  }
		  }
  }

  // line 643 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void processConstraintsData(){
    for(UmpleClass cmpClass : getComponents()) {
		   for(ActiveMethod am : cmpClass.getActiveMethods()) {
			   for(Monitor mt : am.getWatchList()) {
//				   ConstraintTree removeList = new ConstraintTree();
				   for(BasicConstraint bs : mt.getConstraints()) {
					   for(ConstraintVariable cv:bs)
                                           {
                                             if(cv instanceof ConstraintNamed)
                                             {
                                               String checkPortName = ((ConstraintNamed)cv).getName();
                                               Port portFound = cmpClass.getPort(checkPortName);
                                               if(portFound != null)
                                               {
                                                 PortConstraint pc = mt.getPortConstraint(checkPortName);
                                                 if(pc == null)
                                                 {
                                                   pc = new PortConstraint(portFound);
                                                   mt.addPortConstraint(pc);
//                                                 removeList.add(cv);
                                                 }
                                               }
                                             }
                                           }
//					   for(ConstraintVariable cv : removeList) {
//						   bs.removeExpression(cv);
//					   }

				   }

			   }
		   }
	   }
  }

  // line 678 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private boolean isMonitored(Port portName, ActiveMethod am){
    for(Monitor mt : am.getWatchList()) {
			for(PortConstraint pc : mt.getPortConstraints()) {
				if(portName.equals(pc.getPort())) {
					return true;
				}
			}
		}
		return false;
  }

  // line 689 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void buildIncomingProtocolData(Protocol pr, Port portName){
    for(UmpleClass cmpClass : getComponents()) {
		   for(ActiveMethod am : cmpClass.getActiveMethods()) {
			   ActiveDirectionHandler hdl = am.getMethodBody(); 
			   {
				   for(ActiveDirectionHandlerBody bdy : hdl.getActiveDirectionHandlerBodies()) {
					   if( bdy.getBodyType() == BodyType.TRIGGER ) {
						   Trigger trg = bdy.getTrigger();

						   DeferredCall call = trg.getDeferredCall();
						   if(call != null) {
							   for(DeferredFunction df : call.getList()) {
								   if(df.getPortFunction() != null) {
									   PortFunction pFunc = df.getPortFunction();
									   // check modifier
									   if(pFunc.getName().equals(portName)) {
										   pr.addIncomingList(trg);
									   }
								   }
							   }
						   }
					   }
				   }

			   }
		   }
	   }
  }

  // line 718 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void buildOutgoingProtocolData(Protocol pr, Port portName){
    for(Monitor mt : pr.getWatchList()) {
		   ActiveMethod am  = mt.getActiveMethod();
		   ActiveDirectionHandler hdl = am.getMethodBody(); 
		   {
			   for(ActiveDirectionHandlerBody bdy : hdl.getActiveDirectionHandlerBodies()) {
				   if( bdy.getBodyType() == BodyType.TRIGGER ) {
					   Trigger trg = bdy.getTrigger();

					   DeferredCall call = trg.getDeferredCall();
					   if(call != null ) {
						   for(DeferredFunction df : call.getList()) {
							   if(df.getPortFunction() != null) {
								   PortFunction pFunc = df.getPortFunction();
								   // check modifier
								   if(pFunc.getName().equals(portName)) {
									   pr.addOutgoingList(trg);
								   }
							   }
						   }
					   }
				   }
			   }

		   }
	   }
  }

  // line 746 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void inferPortTypeData(Port port){
    Protocol protocol = port.getProtocol();
	   String modifier = port.getModifier();
	   ActiveType acType = ActiveType.ASYNCH;
	   for(Monitor mt : protocol.getWatchList()) {
		   ActiveMethod am = mt.getActiveMethod();
		   acType = am.getActiveType();
		   if(acType == ActiveType.ATOMIC || acType == ActiveType.SYNCH)
			   break;
	   }

	   if(modifier.contains("public")) {
		   if(acType == ActiveType.ASYNCH ) {
			   port.setType(Type.RELAY);
		   }
		   if((acType == ActiveType.SYNCH) ) {
			   port.setType(Type.END);
		   }
		   if((acType == ActiveType.ATOMIC) ) {
			   port.setType(Type.SERVICE);
		   }
	   } else if(modifier.contains("private")
			   		|| modifier.contains("protected")) {
		   if((acType == ActiveType.SYNCH || acType == ActiveType.ASYNCH) ) {
			   port.setType(Type.END);
		   }
		   if((acType == ActiveType.ATOMIC) ) {
			   port.setType(Type.SERVICE);
		   }
	   }
  }

  // line 778 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void createMessageStructureData(MessageStructure msgStruct, Port port, String signalType){
    msgStruct.addParam(new MessageField(port.getName(), signalType));
//	   UmpleClass typeClass = parser.getModel().getUmpleClass(signalType);
//	   if(typeClass == null) {
//		   msgStruct.addParam(new MessageField(port.getName(), signalType));
//	   } else {
//		   for(Attribute attr : typeClass.getAttributes()) {
//
//		   }
//	   }
  }

  // line 790 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void createMessageHandlerData(Port port){
    Protocol protocol = port.getProtocol();
	   Type portType = port.getType();
	   MessageStructure msgStruct = new MessageStructure();
	   createMessageStructureData(msgStruct, port, port.getSignalType());
	   MessageHandler msgHdl = new MessageHandler(msgStruct);
	   if(portType == Type.RELAY) {
		   msgHdl.setCommunicationType(CommunicationType.DATA);
	   } else if(portType == Type.END) {
		   msgHdl.setCommunicationType(CommunicationType.QUEUED);
	   } else if(portType == Type.SERVICE) {
		   msgHdl.setCommunicationType(CommunicationType.QUEUED);
	   } else {
		   msgHdl.setCommunicationType(CommunicationType.NONE);
	   }
  }

  // line 807 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void buildProtocolData(){
    for(UmpleClass cmpClass : getComponents()) {
		   for(Port port : cmpClass.getPorts()) {
			   Protocol protocol = new Protocol();

			   for(ActiveMethod am : cmpClass.getActiveMethods()) {
				   if( isMonitored(port, am) ) {
					   for(Monitor mt : am.getWatchList()) {
						   protocol.addWatchList(mt);
					   }
				   }
			   }
			   buildIncomingProtocolData(protocol, port);
			   buildOutgoingProtocolData(protocol, port);
			   port.setProtocol(protocol);
			   inferPortTypeData(port);
			   createMessageHandlerData(port);
		   }
	   }
  }

  // line 828 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void processTriggersData(){
    for(UmpleClass cmpClass : getComponents()) {
		   for(ActiveMethod am : cmpClass.getActiveMethods()) {

			   ActiveDirectionHandler hdl = am.getMethodBody(); 
			   {

				   for(ActiveDirectionHandlerBody bdy : hdl.getActiveDirectionHandlerBodies()) {

					   if( bdy.getBodyType() == BodyType.TRIGGER ) {

						   Trigger trg = bdy.getTrigger();
						   DeferredCall call = trg.getDeferredCall();
						   if(call != null) {
							   for(DeferredFunction df : call.getList()) {
								   if(df.getMethodInvoke() != null) {
									   String checkPortName = df.getMethodInvoke();
									   Port portFound = cmpClass.getPort(checkPortName);
									   if(portFound != null) {
										   PortFunction pFunc = new PortFunction();
										   pFunc.setName(portFound);
										   for(String param : df.getParameters()) {
											   pFunc.addParameter(param);
										   }
										   df.setPortFunction(pFunc);
									   }
								   }
							   }
						   }
					   }
				   }

			   }
		   }
	   }
  }

  // line 875 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private ConstraintVariable analyzeConstraintName(Token nameToken, UmpleClassifier uClassifier, boolean mustBeInClass, String... type){
    Token grandparentToken = nameToken.getParentToken().getParentToken();
	   ConstraintTree cv = new ConstraintTree();
	   for(Token sub:nameToken.getSubTokens())
	   {
		   if(sub.is("constraintParameterList"))
		   {
			   for(Token param: sub.getSubTokens())
			   {
				   if(param.is("constraintParameter"))
				   {
					   Token value = param.getSubToken(0);
					   int i=1;
					   while(value.getValue().equals("STATIC"))
					   {
						   value = param.getSubToken(i);
						   ++i;
					   }
					   if(value.is("boolLit"))
					   {
						   cv.addElement(new ConstraintLiteral(value.getValue()));
					   }
					   else if(value.is("quote"))
					   {
						   cv.addElement(new ConstraintLiteral("\""+value.getValue()+"\""));
					   }
					   else if(value.is("number"))
					   {
						   cv.addElement(analyzeConstraintNumber(value));
					   }
					   else if(value.is("constraintName")){
						   cv.addElement(analyzeConstraintName(value,uClassifier,false));
					   }
				   }
				   else
				   {
					   cv.addElement(new ConstraintLiteral(param.getName()));
				   }
			   }
		   }
		   else if(sub.is("index"))
		   {
			   analyzeConstraintIndex(sub,cv);
		   }
		   else if(sub.is("new"))
		   {
			   ConstraintVariable newCV = new ConstraintOperator("initialise");
			   cv.addElement(newCV);
		   }
		   else if(sub.is("constraintScopeOperator"))
		   {
			   ConstraintVariable dot = new ConstraintOperator(".");
			   cv.addElement(dot);
			   for(Token subsub:sub.getSubTokens()){
				   if(subsub.is("constraintName"))
				   {
					   cv.addElement(analyzeConstraintName(subsub,uClassifier,true));
				   }
			   }
			   mustWarn = false;
		   }
		   else if(sub.is("name"))
		   {
			   ConstraintNamed name = (ConstraintNamed)(ConstraintNameNameAnalyzer.analyzeName(cv,uClassifier,sub.getValue(),sub.getParentToken().getSubToken("constraintParameterList")!=null));
			   cv.addElement(name);
			   if (grandparentToken.is("precondition")||grandparentToken.is("postcondition"))
			   { //if it was a precondition or postcondition, check if it matches any of the method arguments
				   Token concreteMethod = grandparentToken.getParentToken();
				   ArrayList<MethodParameter> methodparams = new ArrayList<MethodParameter>();
				   for (Token t : concreteMethod.getSubTokens())
				   {
					   if (t.getName().equals("methodDeclarator"))
					   {
						   for (Token st : t.getSubTokens())
						   {
							   if (st.getName().equals("parameterList"))
							   {
								   for (Token sst : st.getSubTokens())
								   {
									   if(sst.getName().equals("parameter"))
									   {
										   String paramName = null;
										   String paramType = null;
										   for (Token ssst: sst.getSubTokens())
										   {
											   if (ssst.getName().equals("type"))
											   {
												   paramType = ssst.getValue();
											   }
											   if (ssst.getName().equals("name"))
												   {
											   paramName = ssst.getValue();
											   }
										   }
										   MethodParameter mp = new MethodParameter(paramName, paramType, null, null, false);
										   methodparams.add(mp);
									   }
								   }
							   }
						   }
					   }
					   boolean matchesAnyMethodParams = false;
					   for (MethodParameter mp : methodparams)
					   {
						   if (mp.getName().equals(sub.getValue()))
						   {
							   matchesAnyMethodParams = true;
							  // cv.setType(mp.getType());
						   }
					   }
				   }
			   }
		   }
	   }
	   mustWarn = true;
	   return cv;
  }

  // line 994 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private ConstraintVariable analyzeConstraintNumber(Token numberToken){
    return new ConstraintLiteral(numberToken.getValue());
  }

  // line 999 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeConstraintIndex(Token indexToken, ConstraintVariable cv){
    Token sub = indexToken;
	   try {
		   int i = Integer.parseInt(sub.getValue());
		   if(cv instanceof ConstraintAttribute)
                   {
			   ((ConstraintAttribute)cv).setIndex(i);
                   }
		   else if(cv instanceof ConstraintAssociation)
		   {
			   ((ConstraintAssociation)cv).setIndex(i);
		   }
		   else
		   {
//			   logError(sub.getPosition(), 29, cv.getValue(), "association or list");
		   }
	   } catch (NumberFormatException e) {
		   logError(sub.getPosition(), 29, sub.getValue(), "integer");
	   }
  }

  // line 1021 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private ConstraintTree analyzeGeneralConstraintExpression(Token generalExpressionToken, UmpleClassifier uClassifier){
    ConstraintTree rawLine = new ConstraintTree();
	   List<Token> generalExpressionSubtokens = generalExpressionToken.getSubTokens();
	   for(Token sub : generalExpressionSubtokens)
	   {
		   if(sub.is("constraintName"))
		   {
			   rawLine.addElement(analyzeConstraintName(sub,uClassifier,true));
		   }
		   else if(sub.is("equalsOp"))
		   {
			   ConstraintVariable cv = new ConstraintOperator("==");
			   rawLine.addElement(cv);
		   }
		   else if(sub.is("notequalsOp"))
		   {
			   ConstraintVariable cv = new ConstraintOperator("!=");
			   rawLine.addElement(cv);
		   }
	   }
	   return rawLine;
  }

  // line 1045 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private ConstraintTree analyzeConstraint(Token invariantToken, UmpleClassifier uClassifier){
    ConstraintTree rawLine = new ConstraintTree();
	   if (invariantToken.is("genExpr"))
	   {
		   rawLine.addElementAll(analyzeGeneralConstraintExpression(invariantToken,uClassifier));
	   }
	   else if (invariantToken.is("boolExpr"))
	   {
		   rawLine.addElementAll(analyzeBooleanConstraintExpression(invariantToken,uClassifier));
	   }
	   else if (invariantToken.is("stringExpr"))
	   {
		   rawLine.addElementAll(analyzeStringConstraintExpression(invariantToken,uClassifier));
	   }
	   else if (invariantToken.is("numExpr"))
	   {
		   rawLine.addElementAll(analyzeNumberConstraintExpression(invariantToken,uClassifier));
	   }
	   Label_Association_152: ;
	   Label_StateMachine_153: ;
	   else if(invariantToken.is("loneBoolean"))
	   {
		   rawLine.addElement(analyzeConstraintName(invariantToken.getSubToken(0),uClassifier,true));
	   }
	   else if (invariantToken.is("linkingOp")){
		   rawLine.addElementAll(analyzeLinkingOpExpression(invariantToken,uClassifier));
	   }
	   else if (invariantToken.is("negativeConstraint")){
		   rawLine.addElementAll(analyzeNegativeConstraint(invariantToken, uClassifier));
	   }
	   else if (invariantToken.is("fakeContraint")){
		   rawLine.addElement(new ConstraintUnassignedName(invariantToken.getValue()));
	   }
	   else
	   {
		   List<Token> subs = invariantToken.getSubTokens();
		   for (Token sub : subs)
		   {
			   rawLine.addElementAll(analyzeConstraint(sub,uClassifier));
		   }
	   }
	   
	   return rawLine;
  }

  // line 1091 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private ConstraintTree analyzeLinkingOpExpression(Token linkingOpExpressionToken, UmpleClassifier uClassifier){
    List<Token> LinkingOpExpressionSubtokens = linkingOpExpressionToken.getSubTokens();
	   ConstraintTree rawLine = new ConstraintTree();

	   Token subOp = LinkingOpExpressionSubtokens.get(0); //the linking Expr (ie) &&, ||


	   if (subOp.is("||")||subOp.is("orOp"))
	   {
		   rawLine.addElement(new ConstraintOperator("||"));
	   }
	   else if (subOp.is("andOp"))
	   {
		   rawLine.addElement(new ConstraintOperator("&&"));
	   }
	   rawLine.addElementAll(analyzeConstraint(linkingOpExpressionToken.getSubToken(1), uClassifier));

	   return rawLine;
  }

  // line 1113 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private ConstraintTree analyzeBooleanConstraintExpression(Token booleanExpressionToken, UmpleClassifier uClassifier){
    List<Token> BooleanExpressionSubtokens = booleanExpressionToken.getSubTokens();
	   ConstraintTree rawLine = new ConstraintTree();
	   for(Token sub : BooleanExpressionSubtokens)
	   {
		   if(sub.is("boolLiteral"))
		   {
			   rawLine.addElement(new ConstraintOperator(sub.getValue("literal")));
		   }
		   else if(sub.is("constraintName"))
		   {
			   rawLine.addElement(analyzeConstraintName(sub,uClassifier,true,"boolean"));
		   }
		   else if(sub.is("equalsOp"))
		   {
			   rawLine.addElement(new ConstraintOperator("=="));
		   }
		   else if(sub.is("notequalsOp"))
		   {
			   rawLine.addElement(new ConstraintOperator("!="));
		   }
	   }
	   return rawLine;
  }

  // line 1139 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private ConstraintTree analyzeStringConstraintExpression(Token stringExpressionToken, UmpleClassifier uClassifier){
    Token innerTokens = stringExpressionToken.getSubToken(0);
	   String[] mustBeTypes = new String[]{"string"};
	   if(innerTokens.is("stringExprOperator"))
	   {
		   mustBeTypes = new String[]{"string","integer","float","double"};
	   }
	   List<Token> stringExpressionSubtokens = innerTokens.getSubTokens();
	   ConstraintTree rawLine = new ConstraintTree();
	   for(Token sub : stringExpressionSubtokens)
	   {
		   if (sub.is("quote"))
		   {
			   rawLine.addElement(new ConstraintLiteral("\""+sub.getValue()+"\""));
		   }
		   else if(sub.is("constraintName"))
		   {
			   rawLine.addElement(analyzeConstraintName(sub,uClassifier,true,mustBeTypes));
		   }
		   else if(sub.is("operator"))
		   {
			   rawLine.addElement(new ConstraintOperator(sub.getValue()));
		   }
		   else if(sub.is("equalsOp"))
		   {
			   ConstraintVariable cv = new ConstraintOperator("==");
			   rawLine.addElement(cv);
		   }
		   else if(sub.is("notequalsOp"))
		   {
			   ConstraintVariable cv = new ConstraintOperator("!=");
			   rawLine.addElement(cv);
		   }
	   }
	   return rawLine;
  }

  // line 1177 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private ConstraintTree analyzeArithmeticCall(Token numberExpressionToken, UmpleClassifier uClassifier){
    ConstraintTree rawLine = new ConstraintTree();
	   List<Token> numberExpressionSubtokens = numberExpressionToken.getSubTokens();
	   for(Token sub : numberExpressionSubtokens)
	   {
		   if(sub.is("constraintName"))
		   {
			   rawLine.addElement(analyzeConstraintName(sub,uClassifier,true,"integer","float","double"));
		   }
		   else if(sub.is("number"))
		   {
			   rawLine.addElement(analyzeConstraintNumber(sub));
		   }
		   else if(sub.is("operator"))
		   {
			   rawLine.addElement(new ConstraintOperator(sub.getValue()));
		   }
		   else if(sub.is("arithmeticCall")||sub.is("lowArithmeticOperatorCall")||sub.is("highArithmeticOperatorCall"))
		   {
			   rawLine.addElementAll(analyzeArithmeticCall(sub,uClassifier));
		   }
	   }
	   return rawLine;
  }

  // line 1203 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private ConstraintTree analyzeNumberConstraintExpression(Token numberExpressionToken, UmpleClassifier uClassifier){
    ConstraintTree rawLine = new ConstraintTree();
	   List<Token> numberExpressionSubtokens = numberExpressionToken.getSubTokens();
	   for(Token sub : numberExpressionSubtokens)
	   {
		   if(sub.is("constraintName"))
		   {
			   rawLine.addElement(analyzeConstraintName(sub,uClassifier,true,"integer","float","double", "date"));
		   }
		   else if(sub.is("arithmeticCall"))
		   {
			   rawLine.addElementAll(analyzeArithmeticCall(sub,uClassifier));
		   }
		   else if(sub.is("number"))
		   {
			   rawLine.addElement(analyzeConstraintNumber(sub));
		   }
		   else if(sub.is("moreOp"))
		   {
			   rawLine.addElement(new ConstraintOperator(">"));
		   }
		   else if(sub.is("smallerOp"))
		   {
			   rawLine.addElement(new ConstraintOperator("<"));
		   }
		   else if(sub.is("greaterOp"))
		   {
			   rawLine.addElement(new ConstraintOperator(">="));
		   }
		   else if(sub.is("lessOp"))
		   {
			   rawLine.addElement(new ConstraintOperator("<="));
		   }
		   else if(sub.is("equalsOp"))
		   {
			   ConstraintVariable cv = new ConstraintOperator("==");
			   rawLine.addElement(cv);
		   }
		   else if(sub.is("notequalsOp"))
		   {
			   ConstraintVariable cv = new ConstraintOperator("!=");
			   rawLine.addElement(cv);
		   }
	   }
	   return rawLine;
  }

  // line 1254 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   public ConstraintTree analyzeInvariantConstraint(Token invariantToken){
    ConstraintTree rawLine = analyzeConstraint(invariantToken, componentClass);
	   if(rawLine.getNumberOfElements() == 0)
	   {
		   if (!invariantToken.getValue().equals("STATIC"))
		   {
			   if (invariantToken.is("genExpr"))
			   {
				   rawLine.addElementAll(analyzeGeneralConstraintExpression(invariantToken,null));
			   }
			   else if (invariantToken.is("boolExpr"))
			   {
				   rawLine.addElementAll(analyzeBooleanConstraintExpression(invariantToken,null));
			   }
			   else if (invariantToken.is("stringExpr"))
			   {
				   rawLine.addElementAll(analyzeStringConstraintExpression(invariantToken,null));
			   }
			   else if (invariantToken.is("numExpr"))
			   {
				   rawLine.addElementAll(analyzeNumberConstraintExpression(invariantToken,null));
			   }
			   Label_Association_155: ;
			   Label_StateMachine_156: ;
			   else if(invariantToken.is("loneBoolean"))
			   {
				   rawLine.addElement(analyzeConstraintName(invariantToken.getSubToken(0),null,true));
			   }
			   else if (invariantToken.is("linkingOp")){
				   rawLine.addElementAll(analyzeLinkingOpExpression(invariantToken,null));
			   }
			   else if (invariantToken.is("negativeConstraint")){
				   rawLine.addElementAll(analyzeNegativeConstraint(invariantToken, null));
			   }
			   else if (invariantToken.is("fakeContraint")){
				   rawLine.addElement(new ConstraintLiteral(invariantToken.getValue()));
			   }
			   else
			   {
				   rawLine.addElementAll(analyzeConstraint(invariantToken,null));
			   }

		   }
	   }
	   return rawLine;
  }

  // line 1301 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private ConstraintTree analyzeNegativeConstraint(Token negativeConstraintToken, UmpleClassifier uClassifier){
    List<Token> negativeConstraintSubtokens = negativeConstraintToken.getSubTokens();
	   List<Token> subtokensCopy = new ArrayList<Token> ();
	   subtokensCopy.addAll(negativeConstraintSubtokens);

	   ConstraintTree rawLine = new ConstraintTree();
	   rawLine.addElement(new ConstraintOperator("!"));

	   for (Token s :subtokensCopy){
		   String name = s.getName();
		   if (name.equals("!")|name.equals("not")|name.equals("~")){
			   negativeConstraintToken.removeSubToken(s);
		   }
	   }

	   rawLine.addElementAll(analyzeConstraint(negativeConstraintToken, uClassifier));


	   return rawLine; //rawLine = !(constraintBodystuff)
  }


  /**
   * 
   * /////////////////////////////////////////////// TO BE REMOVED ///////////////////////////////////////////////////////////////////////
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * Analyzer Events
   */
  // line 1334 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   public void done(){
    buildBindingPortData();
	processConstraintsData();
	processTriggersData();
	buildProtocolData();
  }


  public String toString()
  {
    return super.toString() + "["+
            "mustWarn" + ":" + getMustWarn()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parser" + "=" + (getParser() != null ? !getParser().equals(this)  ? getParser().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "componentClass" + "=" + (getComponentClass() != null ? !getComponentClass().equals(this)  ? getComponentClass().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 39 "../../../../src/UmpleInternalParser_CodeStructure.ump"
  void prepare (final Token token) 
  {
    String componentName = token.getValue("name");
    	componentClass = parser.getModel().getUmpleClass(componentName);
    	if(componentClass != null) {
    		addComponent(componentClass);
    	}
  }

  
}
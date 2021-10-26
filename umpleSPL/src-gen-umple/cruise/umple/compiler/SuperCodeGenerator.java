/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;
import cruise.umple.util.*;

/**
 * Fragment source file: Generator_SuperCodeGenerator.ump
 * Line : 47
 */
// line 45 "../../../../src/Trace_refactored.ump"
// line 1 "../../../../src/Generator_SuperCodeGenerator.ump"
public abstract class SuperCodeGenerator extends CodeGeneratorWithSubptions implements CodeTranslator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SuperCodeGenerator Attributes
  private UmpleModel model;
  private String output;
  private String parameterConstraintName;
  private boolean dontDisplayNextAccessor;
  private boolean constraintWithinConstructor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SuperCodeGenerator()
  {
    super();
    model = null;
    output = "";
    parameterConstraintName = "";
    dontDisplayNextAccessor = false;
    constraintWithinConstructor = false;
    // line 14 "../../../../src/Generator_SuperCodeGenerator.ump"
    UmpleToPrimitiveMap = new HashMap<String, String>();
        TraceLookupMap = new HashMap<String,String>();	
        ConstraintLookupMap = new HashMap<String,String>();
        initializeLangaugeBasedVariables();
    // END OF UMPLE AFTER INJECTION
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

  public boolean setParameterConstraintName(String aParameterConstraintName)
  {
    boolean wasSet = false;
    parameterConstraintName = aParameterConstraintName;
    wasSet = true;
    return wasSet;
  }

  public boolean setDontDisplayNextAccessor(boolean aDontDisplayNextAccessor)
  {
    boolean wasSet = false;
    dontDisplayNextAccessor = aDontDisplayNextAccessor;
    wasSet = true;
    return wasSet;
  }

  public boolean setConstraintWithinConstructor(boolean aConstraintWithinConstructor)
  {
    boolean wasSet = false;
    constraintWithinConstructor = aConstraintWithinConstructor;
    wasSet = true;
    return wasSet;
  }

  public UmpleModel getModel()
  {
    return model;
  }

  public String getOutput()
  {
    return output;
  }

  public String getParameterConstraintName()
  {
    return parameterConstraintName;
  }

  public boolean getDontDisplayNextAccessor()
  {
    return dontDisplayNextAccessor;
  }

  public boolean getConstraintWithinConstructor()
  {
    return constraintWithinConstructor;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDontDisplayNextAccessor()
  {
    return dontDisplayNextAccessor;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isConstraintWithinConstructor()
  {
    return constraintWithinConstructor;
  }

  public void delete()
  {
    super.delete();
  }

  // line 48 "../../../../src/Trace_refactored.ump"
   public String translate(String keyName, TraceItem ti){
    if (keyName.length()>5&&"trace".equals(keyName.substring(0,5)))
      {
        return TraceLookupMap.get(keyName.substring(5).toLowerCase());
      }
      else 
      {
        return "INVALID KEYNAME IN TRANSLATE";
      }
  }

  // line 11 "../../../../src/Generator_SuperCodeGenerator.ump"
   public void postpare(){
    GeneratorHelper.postpare(getModel());
  }

   public abstract void initializeLangaugeBasedVariables();

  // line 31 "../../../../src/Generator_SuperCodeGenerator.ump"
   public String getType(UmpleVariable av){
    String myType = av.getType();
    if (myType == null || myType.length() == 0)
    {
      return UmpleToPrimitiveMap.get("String");
    }
    else if (UmpleToPrimitiveMap.containsKey(myType))
    {
      return UmpleToPrimitiveMap.get(myType);
    }
    else
    {
      return myType;
    }
  }

  // line 49 "../../../../src/Generator_SuperCodeGenerator.ump"
   private boolean testForPrimitiveInConstraint(ConstraintVariable variable){
    //System.out.println(variable.toString() + "###");
  	if((variable instanceof ConstraintLiteral) && ( ((ConstraintLiteral)variable).getValue().toString().startsWith("\"")  )) 
  	{
  		return false;
  	}
  	Label_StateMachine_17: ;

    if((variable instanceof ConstraintAttribute)&&(UmpleToPrimitiveMap.containsValue(((ConstraintAttribute)variable).getAttribute().getType()) || UmpleToPrimitiveMap.containsKey(((ConstraintAttribute)variable).getAttribute().getType())))
    {
        return !"String".equals(((ConstraintAttribute)variable).getAttribute().getType());
    }
    else if(variable instanceof ConstraintOperator)
    {
      	return testForPrimitiveInConstraint(((ConstraintOperator)variable).getLeft())||testForPrimitiveInConstraint(((ConstraintOperator)variable).getRight());
    }
    else if(variable instanceof ConstraintTree)
    {
      	return testForPrimitiveInConstraint(((ConstraintTree)variable).getRoot());
    }

    return true;
  }

  // line 74 "../../../../src/Generator_SuperCodeGenerator.ump"
   private boolean testForUnassignedPrimitivesInConstraint(ConstraintVariable var1, ConstraintVariable var2){
    if(var1 instanceof ConstraintTree)
  	{
  		return testForUnassignedPrimitivesInConstraint(((ConstraintTree)var1).getRoot(), var2);
  	}
  	if(var2 instanceof ConstraintTree)
  	{
  		return testForUnassignedPrimitivesInConstraint(var1, ((ConstraintTree)var2).getRoot());
  	}
  	
  	if(var1 instanceof ConstraintUnassignedName && var2 instanceof ConstraintUnassignedName)
  	{
  		String name1 = ((ConstraintUnassignedName) var1).getValue();
  		String name2 = ((ConstraintUnassignedName) var2).getValue();
  		if(!name1.equals("true") && !name1.equals("false") && !name2.equals("true") && !name2.equals("false")) {
  			return false;
  		}
  	}
  	
  	return true;
  }

  // line 97 "../../../../src/Generator_SuperCodeGenerator.ump"
   private String getBooleanResultIfExists(ConstraintVariable left, ConstraintVariable right, String leftString, String rightString, String operator){
    String booleanResult = "";
     if(checkStringForEqualsOperator(operator) || checkStringForNotEqualsOperator(operator))
     {
       if(testForBooleanConstraint(left) && testForBooleanValueConstraint(right))
       {
         booleanResult = getBooleanResult(leftString, rightString, operator);
       } 
       else if(testForBooleanConstraint(right) && testForBooleanValueConstraint(left)) 
       {
         booleanResult = getBooleanResult(rightString, leftString, operator);
       }
     }
     return booleanResult;
  }

  // line 114 "../../../../src/Generator_SuperCodeGenerator.ump"
   private boolean testForBooleanConstraint(ConstraintVariable variable){
    if(variable instanceof ConstraintAttribute)
     {
         return "Boolean".equals(((ConstraintAttribute)variable).getAttribute().getType());
     }
     else if(variable instanceof ConstraintTree)
     {
       return testForBooleanConstraint(((ConstraintTree)variable).getRoot());
     }
     return false;
  }

  // line 127 "../../../../src/Generator_SuperCodeGenerator.ump"
   private boolean testForBooleanValueConstraint(ConstraintVariable variable){
    if(variable instanceof ConstraintUnassignedName)
     {
       String variableValue = ((ConstraintUnassignedName)variable).getValue();
       return "true".equalsIgnoreCase(variableValue) || "false".equalsIgnoreCase(variableValue);
     }
     else if(variable instanceof ConstraintTree)
     {
       return testForBooleanValueConstraint(((ConstraintTree)variable).getRoot());
     }
     return false;
  }

  // line 141 "../../../../src/Generator_SuperCodeGenerator.ump"
   private String getBooleanResult(String booleanObject, String booleanValue, String operator){
    StringBuilder builder = new StringBuilder();
     builder.append(booleanObject);
     if(checkStringForNotEqualsOperator(operator))
     {
       addNegationToCondition(builder);
     }
     if("false".equalsIgnoreCase(booleanValue))
     {
       addNegationToCondition(builder);
     }
     return builder.toString();
  }

  // line 156 "../../../../src/Generator_SuperCodeGenerator.ump"
   private Boolean checkStringForEqualsOperator(String value){
    return "object==".equals(value) || "==".equals(value);
  }

  // line 161 "../../../../src/Generator_SuperCodeGenerator.ump"
   private Boolean checkStringForNotEqualsOperator(String value){
    return "object!=".equals(value) || "!=".equals(value);
  }

  // line 166 "../../../../src/Generator_SuperCodeGenerator.ump"
   private void addNegationToCondition(StringBuilder builder){
    if(builder.indexOf("!") == 0)
     {
       builder.deleteCharAt(0);
     }
     else
     {
       builder.insert(0, '!');
     }
  }

  // line 178 "../../../../src/Generator_SuperCodeGenerator.ump"
   public String translate(String id, ConstraintVariable cv){
    if("operatorOne".equals(id))
    {
      ConstraintVariable left = ((ConstraintOperator)cv).getLeft();
      if(testForPrimitiveInConstraint(left))
      {
        ((ConstraintOperator)cv).correctForPrimitive();
      }
      String leftString = (left instanceof ConstraintOperator)?translate(left.getType(),left):translate(left.getType(),left,true);
      return StringFormatter.format(translate(id,cv,true),leftString);
    }
    else if("operatorTwo".equals(id))
    {
    	//System.out.println("@@@");
      ConstraintVariable left = ((ConstraintOperator)cv).getLeft();
      ConstraintVariable right = ((ConstraintOperator)cv).getRight();
      
      if(testForPrimitiveInConstraint(left) && testForPrimitiveInConstraint(right))
      {
      		if(testForUnassignedPrimitivesInConstraint(left, right))
      		{
      			//System.out.println("$$$");
        		((ConstraintOperator)cv).correctForPrimitive();
        	}
      }
      
      else if(testForPrimitiveInConstraint(left)||testForPrimitiveInConstraint(right))
      {
      	if( left instanceof ConstraintTree || right instanceof ConstraintTree) 
      	{
      		ConstraintVariable tempLeft = left;
      		while(tempLeft instanceof ConstraintTree)
      		{
      			tempLeft =  ((ConstraintTree)tempLeft).getRoot();
      		}

			ConstraintVariable tempRight = right;
      		while(tempRight instanceof ConstraintTree)
      		{
      			tempRight =  ((ConstraintTree)tempRight).getRoot();
      		}
      		
      		if((tempLeft instanceof ConstraintAttribute)&&(UmpleToPrimitiveMap.containsValue(((ConstraintAttribute)tempLeft).getAttribute().getType()) || UmpleToPrimitiveMap.containsKey(((ConstraintAttribute)tempLeft).getAttribute().getType()))
      		&& (tempRight instanceof ConstraintAttribute)&&(UmpleToPrimitiveMap.containsValue(((ConstraintAttribute)tempRight).getAttribute().getType()) || UmpleToPrimitiveMap.containsKey(((ConstraintAttribute)tempRight).getAttribute().getType())))
    		{
        		if( !"String".equals(((ConstraintAttribute)tempLeft).getAttribute().getType()) && !"String".equals(((ConstraintAttribute)tempRight).getAttribute().getType()) )
        		{
        			//System.out.println("!!!");
        			((ConstraintOperator)cv).correctForPrimitive();
        		}
    		}
      	}

      	else if(!((left instanceof ConstraintLiteral) && ( ((ConstraintLiteral)left).getValue().toString().startsWith("\"")  )) && !((right instanceof ConstraintLiteral) && ( ((ConstraintLiteral)right).getValue().toString().startsWith("\"")  ))) 
  		{
  			//System.out.println("Left: " + left.toString() + "***");
  			//System.out.println("Right: " + right.toString() + "***");
  			((ConstraintOperator)cv).correctForPrimitive();
  		}
      }
      
      String leftString = (left instanceof ConstraintOperator)?translate(left.getType(),left):translate(left.getType(),left,true);
      String rightString = (right instanceof ConstraintOperator)?translate(right.getType(),right):translate(right.getType(),right,true);
      
      String checkForBooleanResult = getBooleanResultIfExists(left, right, leftString, rightString, ((ConstraintOperator)cv).getValue());
      if(!checkForBooleanResult.isEmpty())
      {
        return checkForBooleanResult;
      }
      
      String value = translate(id,cv,true);
      return StringFormatter.format(value,leftString,rightString);
    }
    else return translate(id,cv,true);
  }

  // line 255 "../../../../src/Generator_SuperCodeGenerator.ump"
   private String translate(String id, ConstraintVariable cv, boolean returnAll){
    if("operatorTwo".equals(id)||"operatorOne".equals(id))
    {
      String value = ConstraintLookupMap.get(((ConstraintOperator)cv).getValue());
      String left = ("operatorTwo".equals(id)?"{0}":"");
      String exact = ((ConstraintOperator)cv).getValue();
      String right = ("operatorTwo".equals(id)?"{1}":"{0}");
      return value!=null?value:(left+exact+right);
    }
    else if("attribute".equals(id))
    {
      ConstraintAttribute attribute = ((ConstraintAttribute)cv);
      String methodName = "getMethod";
      String suffix = "("+(attribute.getIndex()!=-1?(""+attribute.getIndex()):"")+")";
      String prefix = ConstraintLookupMap.get("accessor");
      if((constraintWithinConstructor||attribute.getName().equals(parameterConstraintName))&&attribute.getIndex()==-1)
      {
        methodName = "parameterOne";
        suffix = "";
        prefix = ConstraintLookupMap.get("paramaccessor");
      }
      if(dontDisplayNextAccessor)
      {
        prefix = "";
        dontDisplayNextAccessor = false;
      }
      String name = "";
      if (!"const".equals(attribute.getAttribute().getModifier())) {
        name = translate(methodName,attribute.getAttribute()) + suffix;
      } else {
        name = attribute.getName();
      }
      return umpleCVarToLanguagePrimitive(prefix+name,cv);
    }
    else if("associationGet".equals(id))
    {
      return ConstraintLookupMap.get("accessor")+translate("getMethod",((ConstraintAssociation)cv).getAssociation())+"("+((ConstraintAssociation)cv).getIndex()+")";
    }
    else if("associationList".equals(id))
    {
      return ConstraintLookupMap.get("accessor")+translate("getManyMethod",((ConstraintAssociation)cv).getAssociation())+"()";
    }
    else if("associationNumberOf".equals(id))
    {
      return ConstraintLookupMap.get("accessor")+translate("numberOfMethod",((ConstraintAssociation)cv).getAssociation())+"()";
    }
    else if("method parameter".equals(id))
    {
      return ConstraintLookupMap.get("accessor")+((ConstraintMethodParameter)cv).getParameter().getName();
    }
    Label_StateMachine_18 : ;

    else if("literal".equals(id))
    {
      return ((ConstraintLiteral)cv).getValue();
    }
    else if("name".equals(id))
    {
      String name = "NAME NOT SET BY SUPERGENERATOR";
      if(cv instanceof ConstraintUnassignedName)
      {
        name = ((ConstraintUnassignedName)cv).getValue();
      }
      else if(cv instanceof ConstraintAttribute)
      {
        name = ((ConstraintAttribute)cv).getName();
      }
      if("".equals(name)||dontDisplayNextAccessor)
      {
        dontDisplayNextAccessor = false;
        return name;
      }
      else if("this".equals(name))
      {
        dontDisplayNextAccessor = true;
        return ConstraintLookupMap.get("paramaccessor")+name;
      }
      else 
      {
        return ConstraintLookupMap.get("accessor")+name;
      }
    }
    else if("complex".equals(id))
    {
      ConstraintTree tree = (ConstraintTree)cv;
      if(tree.getRoot()==null)return "";
      StringBuilder builder = new StringBuilder();
      if(tree.getDisplayNegation())
      {
        builder.append("!");
      }
      if(tree.getDisplayBrackets())
      {
        builder.append("(");
      }
      builder.append(tree.getRoot().getValue(this));
      if(tree.getDisplayBrackets())
      {
        builder.append(")");
      }
      return builder.toString();
    }
    return "INVALID CONSTRAINT VARIABLE";
  }

  // line 361 "../../../../src/Generator_SuperCodeGenerator.ump"
   public String umpleCVarToLanguagePrimitive(String name, ConstraintVariable expr){
    return name;
  }

  // line 366 "../../../../src/Generator_SuperCodeGenerator.ump"
   public String translate(String format, ConstraintTree constraint){
    if(constraint==null)
    {
      return "{0}";
    }
    String expression = constraint.getRoot().getValue(this);
    if(format.contains("Plain"))
    {
      return expression;
    }
    if(format.contains("Closed"))
    {
      return StringFormatter.format(ConstraintLookupMap.get("ifstatement")+"\n  {1}\n"+ConstraintLookupMap.get("end"),expression, "{0}");
    }
    else if(format.contains("Open"))
    {
      return StringFormatter.format(ConstraintLookupMap.get("ifstatement"),expression, "{0}");
    }
    return StringFormatter.format(ConstraintLookupMap.get("ifstatement")+"\n  {1}\n"+ConstraintLookupMap.get("end"),expression, "{0}");
  }

  // line 388 "../../../../src/Generator_SuperCodeGenerator.ump"
   public void prepareConstraint(ConstraintVariable cur, ConstraintTree ac, ConstraintTree head, Map<String,ConstraintTree> setters, Map<String,UmpleClassifier> uClassifiers, int constraintNum){
    if(cur == null)return;
    if(cur instanceof ConstraintAssociation)
    {
      ConstraintAssociation association = ((ConstraintAssociation)cur);

      String methodName = translate("setMethod", association.getAssociation());
      String addName = translate("addMethod", association.getAssociation());

      if(!setters.containsKey(association.getAssociation().getName()+":"+methodName+":"+String.valueOf(constraintNum)))
      {
        ConstraintTree tempConstraint = new ConstraintTree();
        setters.put(association.getName()+":"+methodName+":"+String.valueOf(constraintNum),tempConstraint);
        setters.put(association.getName()+":"+addName+":"+String.valueOf(constraintNum), tempConstraint);
        UmpleClassifier uClassifier = association.retrieveClassifier();
        if(uClassifier!=null)
        {
          uClassifiers.put(association.getName(),uClassifier);
        }
      }
      setters.get(association.getName()+":"+methodName+":"+String.valueOf(constraintNum)).addElementAll(head);
      setters.get(association.getName()+":"+addName+":"+String.valueOf(constraintNum)).addElementAll(head);
    }
    else if(cur instanceof ConstraintAttribute)
    {
      ConstraintAttribute attribute = (ConstraintAttribute)cur;
      String methodName = translate("setMethod", attribute.getAttribute());
      if(!setters.containsKey(attribute.getName()+":"+methodName+":"+String.valueOf(constraintNum)))
      {
        ConstraintTree tempConstraint = new ConstraintTree();
        setters.put(attribute.getName()+":"+methodName+":"+String.valueOf(constraintNum),tempConstraint);
        UmpleClassifier uClassifier = attribute.retrieveClassifier();
        if(uClassifier!=null)
        {
          uClassifiers.put(attribute.getName(),uClassifier);
        }
      }
      setters.get(attribute.getName()+":"+methodName+":"+String.valueOf(constraintNum)).addElementAll(head);
    }
    else if(cur instanceof ConstraintTree)
    {
      prepareConstraint(((ConstraintTree)cur).getRoot(),(ConstraintTree)cur,head,setters,uClassifiers,constraintNum);
    }
    else if(cur instanceof ConstraintOperator)
    {
      prepareConstraint(((ConstraintOperator)cur).getLeft(),ac,head,setters,uClassifiers,constraintNum);
      prepareConstraint(((ConstraintOperator)cur).getRight(),ac,head,setters,uClassifiers,constraintNum);
    }
  }

  // line 438 "../../../../src/Generator_SuperCodeGenerator.ump"
   private String getExpr(ConstraintVariable cur){
    if (cur instanceof ConstraintOperator) {
      return getExpr(((ConstraintOperator)cur).getLeft()) + ((ConstraintOperator)cur).getValue() + getExpr(((ConstraintOperator)cur).getRight());
    } else if (cur instanceof ConstraintLiteral) {
      return ((ConstraintLiteral)cur).getValue();
    } else if (cur instanceof ConstraintAttribute) {
      return ((ConstraintAttribute)cur).getName();
    } else if (cur instanceof ConstraintTree) {
      return getExpr(((ConstraintTree)cur).getRoot());
    } else {
      return "";
    }
  }

  // line 452 "../../../../src/Generator_SuperCodeGenerator.ump"
   private void findConstants(ConstraintVariable cur, Set<String> constants){
    if (cur instanceof ConstraintOperator) {
      findConstants(((ConstraintOperator)cur).getLeft(), constants);
      findConstants(((ConstraintOperator)cur).getRight(), constants);
    } else if (cur instanceof ConstraintTree) {
      findConstants(((ConstraintTree)cur).getRoot(), constants);
    } else if (cur instanceof ConstraintAttribute) {
      if ("const".equals(((ConstraintAttribute)cur).getAttribute().getModifier())) {
        constants.add(((ConstraintAttribute)cur).getName());
      }
    }
  }

  // line 465 "../../../../src/Generator_SuperCodeGenerator.ump"
   private String getNamedNames(ConstraintTree constructor){
    Set<String> constants = new HashSet<>();
    findConstants(constructor, constants);
    Set<String> names = constructor.getNames();
    names.removeAll(constants);
    StringBuilder builder = new StringBuilder();
    int i=0;
    String last = "";
    for(String name:names)
    {
      if(i>=names.size()-1)
      {
        last = name;
        break;
      }
      builder.append(name);
      if(names.size()>2)
      {
        builder.append(", ");
      }
      else builder.append(" ");
      ++i;
    }
    if(names.size()>1)builder.append("and ");
    builder.append(last);
    return builder.toString();
  }

  // line 494 "../../../../src/Generator_SuperCodeGenerator.ump"
   public void prepareConstraints(UmpleClass aClass){
    List<ConstraintTree> constructors = new ArrayList<>();
    constraintWithinConstructor = false;
    Map<String,ConstraintTree> setters = new HashMap<String,ConstraintTree>();
    Map<String,UmpleClassifier> uClassifiers = new HashMap<String, UmpleClassifier>();
    int constraintNum = 0;
    for (ConstraintTree ac : aClass.getConstraintTrees())
    {
      CodeInjection before;
      prepareConstraint(ac.getRoot(),ac,ac,setters,uClassifiers,constraintNum++);
      ConstraintTree constructor = new ConstraintTree();
      constructor.addElementAll(ac);
      constructors.add(constructor);
    }
    for(String name:setters.keySet())
    {
      int index = name.indexOf(':');
      int secondIndex = name.indexOf(':', index+1);
      parameterConstraintName = name.substring(0,index);
      String methodName = name.substring(index+1,secondIndex);
      CodeInjection before = new CodeInjection("before", methodName, translate("Open",setters.get(name)), aClass);
      CodeInjection after = new CodeInjection("after", methodName, ConstraintLookupMap.get("end"), aClass);
      before.setIsInternal(true);
      after.setIsInternal(true);
      UmpleClassifier classifier = uClassifiers.get(parameterConstraintName);
      aClass.addCodeInjection(before);
      aClass.addCodeInjection(after);
    }
    for (ConstraintTree constructor: constructors) {
      if(constructor.getNumberOfElements()>0)
      {
        constraintWithinConstructor = true;
        String expr_generated = getExpr(constructor);	
		//expr and expr_no_quotes are needed to adjust the format of the Error message we generated(expr_generated)
		String expr_no_quotes = expr_generated.replace("\"","\\\"");
		String expr = expr_no_quotes.replace("object","");
        constructor.negate();
        String inject = StringFormatter.format(ConstraintLookupMap.get("exception"),getNamedNames(constructor) + " [" + expr + "]");
        String ifstatement = translate("Closed",constructor);
        String complete = StringFormatter.format(ifstatement,inject);
        CodeInjection cons = new CodeInjection("after",  "constructor", complete, aClass);  
        cons.setIsInternal(true);
        aClass.addCodeInjection(cons);
      }
    }

    for (Precondition pc : aClass.getPreConds())
    { 
      String methodName = pc.getMethod().getName();
      pc.negate();
      String inject = "  "+StringFormatter.format(ConstraintLookupMap.get("exception"),pc.getNamedNames());
      String ifstatement = translate("Closed",pc);
      String complete = StringFormatter.format(ifstatement,inject);
      CodeInjection before = new CodeInjection("before", methodName+"Precondition", complete, aClass);         
      before.setIsInternal(true);
      aClass.addCodeInjection(before);    
    }

    for (Postcondition pc : aClass.getPostConds())
    { 
      String methodName = pc.getMethod().getName();
      pc.negate();
      String inject = "  "+StringFormatter.format(ConstraintLookupMap.get("exception"),pc.getNamedNames());
      String ifstatement = translate("Closed",pc);
      String complete = StringFormatter.format(ifstatement,inject);
      CodeInjection before = new CodeInjection("before", methodName+"Postcondition", complete, aClass);         
      before.setIsInternal(true);
      aClass.addCodeInjection(before);    
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "," +
            "parameterConstraintName" + ":" + getParameterConstraintName()+ "," +
            "dontDisplayNextAccessor" + ":" + getDontDisplayNextAccessor()+ "," +
            "constraintWithinConstructor" + ":" + getConstraintWithinConstructor()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 20 "../../../../src/Generator_SuperCodeGenerator.ump"
  protected Map<String,String> UmpleToPrimitiveMap = new HashMap<String,String>() ;
// line 21 "../../../../src/Generator_SuperCodeGenerator.ump"
  protected Map<String,String> TraceLookupMap = new HashMap<String,String>() ;
// line 22 "../../../../src/Generator_SuperCodeGenerator.ump"
  protected Map<String,String> ConstraintLookupMap = new HashMap<String,String>() ;

  
}
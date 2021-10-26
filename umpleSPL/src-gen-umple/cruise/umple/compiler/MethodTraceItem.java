/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import cruise.umple.util.*;
import java.util.*;

/**
 * An element of a trace directive that indicates to trace one or more associations
 */
// line 184 "../../../../src/Trace.ump"
// line 247 "../../../../src/Trace_Code.ump"
public class MethodTraceItem implements TraceItem
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MethodTraceItem Attributes
  private ConstraintTree constraint;
  private boolean entry;
  private boolean exit;
  private Position position;
  private String periodClause;
  private boolean conditionallyWhere;
  private String conditionType;

  //MethodTraceItem Associations
  private List<Method> methods;
  private TraceDirective traceDirective;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MethodTraceItem(TraceDirective aTraceDirective)
  {
    constraint = null;
    entry = false;
    exit = false;
    position = null;
    periodClause = null;
    conditionallyWhere = true;
    conditionType = "where";
    methods = new ArrayList<Method>();
    boolean didAddTraceDirective = setTraceDirective(aTraceDirective);
    if (!didAddTraceDirective)
    {
      throw new RuntimeException("Unable to create methodTraceItem due to traceDirective. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setConstraint(ConstraintTree aConstraint)
  {
    boolean wasSet = false;
    constraint = aConstraint;
    wasSet = true;
    return wasSet;
  }

  public boolean setEntry(boolean aEntry)
  {
    boolean wasSet = false;
    entry = aEntry;
    wasSet = true;
    return wasSet;
  }

  public boolean setExit(boolean aExit)
  {
    boolean wasSet = false;
    exit = aExit;
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

  public boolean setPeriodClause(String aPeriodClause)
  {
    boolean wasSet = false;
    periodClause = aPeriodClause;
    wasSet = true;
    return wasSet;
  }

  public boolean setConditionallyWhere(boolean aConditionallyWhere)
  {
    boolean wasSet = false;
    conditionallyWhere = aConditionallyWhere;
    wasSet = true;
    return wasSet;
  }

  public boolean setConditionType(String aConditionType)
  {
    boolean wasSet = false;
    conditionType = aConditionType;
    wasSet = true;
    return wasSet;
  }

  public ConstraintTree getConstraint()
  {
    return constraint;
  }

  public String getTracerType()
  {
    return getTraceDirective().getTracerType();
  }

  public boolean getEntry()
  {
    return entry;
  }

  public boolean getExit()
  {
    return exit;
  }

  public Position getPosition()
  {
    return position;
  }

  public String getPeriodClause()
  {
    return periodClause;
  }

  public boolean getConditionallyWhere()
  {
    return conditionallyWhere;
  }

  public String getConditionType()
  {
    return conditionType;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isConditionallyWhere()
  {
    return conditionallyWhere;
  }
  /* Code from template association_GetMany */
  public Method getMethod(int index)
  {
    Method aMethod = methods.get(index);
    return aMethod;
  }

  public List<Method> getMethods()
  {
    List<Method> newMethods = Collections.unmodifiableList(methods);
    return newMethods;
  }

  public int numberOfMethods()
  {
    int number = methods.size();
    return number;
  }

  public boolean hasMethods()
  {
    boolean has = methods.size() > 0;
    return has;
  }

  public int indexOfMethod(Method aMethod)
  {
    int index = methods.indexOf(aMethod);
    return index;
  }
  /* Code from template association_GetOne */
  public TraceDirective getTraceDirective()
  {
    return traceDirective;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMethods()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addMethod(Method aMethod)
  {
    boolean wasAdded = false;
    if (methods.contains(aMethod)) { return false; }
    methods.add(aMethod);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMethod(Method aMethod)
  {
    boolean wasRemoved = false;
    if (methods.contains(aMethod))
    {
      methods.remove(aMethod);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMethodAt(Method aMethod, int index)
  {  
    boolean wasAdded = false;
    if(addMethod(aMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethods()) { index = numberOfMethods() - 1; }
      methods.remove(aMethod);
      methods.add(index, aMethod);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMethodAt(Method aMethod, int index)
  {
    boolean wasAdded = false;
    if(methods.contains(aMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethods()) { index = numberOfMethods() - 1; }
      methods.remove(aMethod);
      methods.add(index, aMethod);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMethodAt(aMethod, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
  public boolean setTraceDirective(TraceDirective aTraceDirective)
  {
    boolean wasSet = false;
    if (aTraceDirective == null)
    {
      return wasSet;
    }

    TraceDirective existingTraceDirective = traceDirective;
    traceDirective = aTraceDirective;
    if (existingTraceDirective != null && !existingTraceDirective.equals(aTraceDirective))
    {
      existingTraceDirective.removeMethodTraceItem(this);
    }
    traceDirective.addMethodTraceItem(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    methods.clear();
    TraceDirective placeholderTraceDirective = traceDirective;
    this.traceDirective = null;
    if(placeholderTraceDirective != null)
    {
      placeholderTraceDirective.removeMethodTraceItem(this);
    }
  }

  // line 252 "../../../../src/Trace_Code.ump"
   public Boolean getIsPre(){
    return getEntry();
  }

  // line 255 "../../../../src/Trace_Code.ump"
   public Boolean getIsPost(){
    return getExit();
  }


  /**
   * @params gen: A code translator
   * @params o: the current context(i.e.state being traced)
   * @params methodname: what to call this trace
   * @params uClass: the current umple class uClass
   * @params args: if the string is equal to "", the format will be {methodname} {attribute name} to {parameter name}, no argument only returns the argument name, or else the string is passed in the form {methodname} {passed string} to {attribute}
   * @return the message for the trace
   */
  // line 266 "../../../../src/Trace_Code.ump"
   public String trace(CodeTranslator gen, Object o, String methodname, UmpleClass uClass, String... args){
    for(Method meth: methods)
		{
			if(meth.equals(o))
			{
				String type = ((Method)o).getType();
				String name = "";
				String extra = "";
				String obj = "";
				String accessor = gen.translate("traceAccessor",this);
				String concatinator = gen.translate("traceConcatinator",this);
				String comma = concatinator+"\",\""+concatinator;
				String tracerName = Character.toUpperCase(getTracerType().charAt(0)) + getTracerType().substring(1);
				String messageLayout = "{0}"+comma+"{1}"+concatinator+"\",{2},{3},{4},\""+concatinator+"{5}"+concatinator+"\",{6},{7}\"";

				if(o instanceof Method)
				{
					name = meth.getName();
				}


				if(type==null||"".equals(type)||"Boolean".equals(type)||"boolean".equals(type)||"String".equals(type)||"int".equals(type)||"Integer".equals(type)||"float".equals(type)||"Float".equals(type)||"double".equals(type)||"Double".equals(type)||"Time".equals(type)||"Date".equals(type))
				{
					obj = name;
				}
				else
				{
					//          obj = name+"(\"+"+StringFormatter.format(gen.translate("traceIdentifier",this),name)+"+\")";
					//          name += gen.translate("traceFormatNonPrimitive",this);
					obj = name;
				}

				for(String str: args){
					extra+=comma+"(\"\"+"+str+")"+gen.translate("traceFormatNonPrimitive",this);
				}
				if(getTraceDirective().getTraceRecord()!=null)
				{
					for(Attribute record:getTraceDirective().getTraceRecord().getAttributes())
					{
						extra+=comma+gen.translate("attribute"+(record.getIsList()?"Many":"One"),record);
					}
					if(getTraceDirective().getTraceRecord().numberOfRecord()>0)
					{
						extra+= concatinator+"\"";
						for(String record:getTraceDirective().getTraceRecord().getRecord())
						{
							extra+=","+record.replace("\"","");
						}
						extra+= "\"";
					}
				}
				String message = messageLayout+extra;
				message = StringFormatter.format(
						message,gen.translate("traceTimestamp",this),
						gen.translate("traceThread",this),
						getPosition().getFilename().replace("\\","\\\\"),
						getPosition().getLineNumber(),
						uClass.getName(),
						StringFormatter.format(gen.translate("traceIdentifier",this),gen.translate("traceSelf",this)),
						methodname,
						accessor+name         
						);

				message = TraceItemUtil.prepareTraceMessage(getTraceDirective(),gen,this,message);

				message = StringFormatter.format(getExtremities(gen, name),message);
				message = GeneratorHelper.doIndent(message,gen.translate("traceIndent",this));
				message += "\n";
				return message;
			}
		}
		return "";
  }

  // line 340 "../../../../src/Trace_Code.ump"
   public String getExtremities(CodeTranslator gen, String name){
    return gen.translate(name+":Closed",constraint);
  }


  public String toString()
  {
    return super.toString() + "["+
            "tracerType" + ":" + getTracerType()+ "," +
            "entry" + ":" + getEntry()+ "," +
            "exit" + ":" + getExit()+ "," +
            "periodClause" + ":" + getPeriodClause()+ "," +
            "conditionallyWhere" + ":" + getConditionallyWhere()+ "," +
            "conditionType" + ":" + getConditionType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "constraint" + "=" + (getConstraint() != null ? !getConstraint().equals(this)  ? getConstraint().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "traceDirective = "+(getTraceDirective()!=null?Integer.toHexString(System.identityHashCode(getTraceDirective())):"null");
  }
}
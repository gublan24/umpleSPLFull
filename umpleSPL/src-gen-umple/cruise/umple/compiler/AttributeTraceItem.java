/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import cruise.umple.util.*;
import java.util.*;

/**
 * An element of a trace directive that indicates to trace one or more attributes
 */
// line 158 "../../../../src/Trace.ump"
// line 93 "../../../../src/Trace_Code.ump"
public class AttributeTraceItem implements TraceItem
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AttributeTraceItem Attributes
  private boolean traceSet;
  private boolean traceGet;
  private boolean traceConstructor;
  private String forClause;
  private String periodClause;
  private String duringClause;
  private Position position;

  //AttributeTraceItem Associations
  private List<UmpleVariable> umpleVariables;
  private TraceDirective traceDirective;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AttributeTraceItem(TraceDirective aTraceDirective)
  {
    traceSet = false;
    traceGet = false;
    traceConstructor = false;
    forClause = null;
    periodClause = null;
    duringClause = null;
    position = null;
    umpleVariables = new ArrayList<UmpleVariable>();
    boolean didAddTraceDirective = setTraceDirective(aTraceDirective);
    if (!didAddTraceDirective)
    {
      throw new RuntimeException("Unable to create attributeTraceItem due to traceDirective. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTraceSet(boolean aTraceSet)
  {
    boolean wasSet = false;
    traceSet = aTraceSet;
    wasSet = true;
    return wasSet;
  }

  public boolean setTraceGet(boolean aTraceGet)
  {
    boolean wasSet = false;
    traceGet = aTraceGet;
    wasSet = true;
    return wasSet;
  }

  public boolean setTraceConstructor(boolean aTraceConstructor)
  {
    boolean wasSet = false;
    traceConstructor = aTraceConstructor;
    wasSet = true;
    return wasSet;
  }

  public boolean setForClause(String aForClause)
  {
    boolean wasSet = false;
    forClause = aForClause;
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

  public boolean setDuringClause(String aDuringClause)
  {
    boolean wasSet = false;
    duringClause = aDuringClause;
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

  public String getTracerType()
  {
    return getTraceDirective().getTracerType();
  }

  public boolean getTraceSet()
  {
    return traceSet;
  }

  public boolean getTraceGet()
  {
    return traceGet;
  }

  public boolean getTraceConstructor()
  {
    return traceConstructor;
  }

  public String getForClause()
  {
    return forClause;
  }

  public String getPeriodClause()
  {
    return periodClause;
  }

  public String getDuringClause()
  {
    return duringClause;
  }

  public Position getPosition()
  {
    return position;
  }
  /* Code from template association_GetMany */
  public UmpleVariable getUmpleVariable(int index)
  {
    UmpleVariable aUmpleVariable = umpleVariables.get(index);
    return aUmpleVariable;
  }

  public List<UmpleVariable> getUmpleVariables()
  {
    List<UmpleVariable> newUmpleVariables = Collections.unmodifiableList(umpleVariables);
    return newUmpleVariables;
  }

  public int numberOfUmpleVariables()
  {
    int number = umpleVariables.size();
    return number;
  }

  public boolean hasUmpleVariables()
  {
    boolean has = umpleVariables.size() > 0;
    return has;
  }

  public int indexOfUmpleVariable(UmpleVariable aUmpleVariable)
  {
    int index = umpleVariables.indexOf(aUmpleVariable);
    return index;
  }
  /* Code from template association_GetOne */
  public TraceDirective getTraceDirective()
  {
    return traceDirective;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleVariables()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addUmpleVariable(UmpleVariable aUmpleVariable)
  {
    boolean wasAdded = false;
    if (umpleVariables.contains(aUmpleVariable)) { return false; }
    umpleVariables.add(aUmpleVariable);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleVariable(UmpleVariable aUmpleVariable)
  {
    boolean wasRemoved = false;
    if (umpleVariables.contains(aUmpleVariable))
    {
      umpleVariables.remove(aUmpleVariable);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleVariableAt(UmpleVariable aUmpleVariable, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleVariable(aUmpleVariable))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleVariables()) { index = numberOfUmpleVariables() - 1; }
      umpleVariables.remove(aUmpleVariable);
      umpleVariables.add(index, aUmpleVariable);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleVariableAt(UmpleVariable aUmpleVariable, int index)
  {
    boolean wasAdded = false;
    if(umpleVariables.contains(aUmpleVariable))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleVariables()) { index = numberOfUmpleVariables() - 1; }
      umpleVariables.remove(aUmpleVariable);
      umpleVariables.add(index, aUmpleVariable);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleVariableAt(aUmpleVariable, index);
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
      existingTraceDirective.removeAttributeTraceItem(this);
    }
    traceDirective.addAttributeTraceItem(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    umpleVariables.clear();
    TraceDirective placeholderTraceDirective = traceDirective;
    this.traceDirective = null;
    if(placeholderTraceDirective != null)
    {
      placeholderTraceDirective.removeAttributeTraceItem(this);
    }
  }

  // line 99 "../../../../src/Trace_Code.ump"
  public Attribute getAttribute(int index){
    return (Attribute)getUmpleVariable(index);
  }

  // line 102 "../../../../src/Trace_Code.ump"
  public Boolean addAttribute(Attribute attr){
    return addUmpleVariable(attr);
  }

  // line 105 "../../../../src/Trace_Code.ump"
   public Boolean getIsPre(){
    return getTraceDirective().getPostfix().getCondition().getConditionallyWhere();
  }

  // line 108 "../../../../src/Trace_Code.ump"
   public Boolean getIsPost(){
    return !getTraceDirective().getPostfix().getCondition().getConditionallyWhere();
  }


  /**
   * @params gen: A code transator
   * @params o: the current context(i.e.attribute being traced)
   * @params methodname: what to call this trace
   * @params uClass: the current umple class uClass
   * @params args: if the string is equal to "", the format will be {methodname} {attribute name} to {parameter name}, no argument only returns the argument name, or else the string is passed in the form {methodname} {passed string} to {attribute}
   * @return the message for the trace
   */
  // line 120 "../../../../src/Trace_Code.ump"
   public String trace(CodeTranslator gen, Object o, String methodname, UmpleClass uClass, String... args){
    //find the object being traced
		for(UmpleVariable attr: umpleVariables)
		{
			if(attr.equals(o))
			{
				String type = ((UmpleVariable)o).getType();
				String name = "";
				String extra = "";
				String obj = "";
				String accessor = gen.translate("traceAccessor",this);
				String concatinator = gen.translate("traceConcatinator",this);
				String comma = concatinator+"\",\""+concatinator;
				String tracerName = Character.toUpperCase(getTracerType().charAt(0)) + getTracerType().substring(1);
				String messageLayout = TraceItemUtil.prepareMessageLayout(gen,getTraceDirective().getTracerDirective(),this);

				if(o instanceof Attribute)
				{
					name = gen.translate("attributeOne",(Attribute)o);
				}
				Label_Association_33: ;

				if(type==null||"".equals(type)||"Boolean".equals(type)||"boolean".equals(type)||"String".equals(type)||"int".equals(type)||"Integer".equals(type)||"float".equals(type)||"Float".equals(type)||"double".equals(type)||"Double".equals(type)||"Time".equals(type)||"Date".equals(type))
				{
					obj = name;
				}
				else
				{
					obj = name+"(\"+"+StringFormatter.format(gen.translate("traceIdentifier",this),name)+"+\")";
					name += gen.translate("traceFormatNonPrimitive",this);
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
						obj,
						accessor+name      		
						);

				message = TraceItemUtil.prepareTraceMessage(getTraceDirective(),gen,this,message);

				if(getForClause()!=null)
				{
					message += "\n  "+StringFormatter.format(gen.translate("traceIncrement",this),getForClause());
				}
				message = StringFormatter.format(getExtremities(gen, name),message);
				message = GeneratorHelper.doIndent(message,gen.translate("traceIndent",this));
				message = "\n" + message;
				if(getTraceDirective().getPostfix().getExecuteClause()!=null)
				{
					String execute = getTraceDirective().getPostfix().getExecuteClause();
					execute = GeneratorHelper.doIndent(execute,gen.translate("traceIndent",this));
					message += "\n" + execute;
				}
				return message;
			}
		}
		return "";
  }


  /**
   * Gets and returns the if statement enclosing this trace item.
   * needs the name of the attribute
   * @return the if statement for the trace if one exists
   */
  // line 209 "../../../../src/Trace_Code.ump"
   public String getExtremities(CodeTranslator gen, String name){
    ((SuperCodeGenerator)gen).setParameterConstraintName(name);
		return gen.translate("Closed",getTraceDirective().getPostfix().getCondition().getConstraint());
  }


  public String toString()
  {
    return super.toString() + "["+
            "tracerType" + ":" + getTracerType()+ "," +
            "traceSet" + ":" + getTraceSet()+ "," +
            "traceGet" + ":" + getTraceGet()+ "," +
            "traceConstructor" + ":" + getTraceConstructor()+ "," +
            "forClause" + ":" + getForClause()+ "," +
            "periodClause" + ":" + getPeriodClause()+ "," +
            "duringClause" + ":" + getDuringClause()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "traceDirective = "+(getTraceDirective()!=null?Integer.toHexString(System.identityHashCode(getTraceDirective())):"null");
  }
}
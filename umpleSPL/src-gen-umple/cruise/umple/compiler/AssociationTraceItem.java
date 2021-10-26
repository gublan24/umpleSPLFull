/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import cruise.umple.util.*;
import java.util.*;

/**
 * Fragment source file: Trace.ump
 * Line : 217
 */
// line 23 "../../../../src/Association_refactored.ump"
// line 214 "../../../../src/Trace_Code.ump"
public class AssociationTraceItem implements TraceItem
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationTraceItem Attributes
  private ConstraintTree constraint;
  private boolean traceCardinality;
  private boolean traceAdd;
  private boolean traceRemove;
  private Position position;
  private String periodClause;
  private boolean conditionallyWhere;
  private String conditionType;

  //AssociationTraceItem Associations
  private List<AssociationVariable> associationVariables;
  private List<Association> associations;
  private TraceDirective traceDirective;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssociationTraceItem(TraceDirective aTraceDirective)
  {
    constraint = null;
    traceCardinality = true;
    traceAdd = false;
    traceRemove = false;
    position = null;
    periodClause = null;
    conditionallyWhere = false;
    conditionType = "where";
    associationVariables = new ArrayList<AssociationVariable>();
    associations = new ArrayList<Association>();
    boolean didAddTraceDirective = setTraceDirective(aTraceDirective);
    if (!didAddTraceDirective)
    {
      throw new RuntimeException("Unable to create associationTraceItem due to traceDirective. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public boolean setTraceCardinality(boolean aTraceCardinality)
  {
    boolean wasSet = false;
    traceCardinality = aTraceCardinality;
    wasSet = true;
    return wasSet;
  }

  public boolean setTraceAdd(boolean aTraceAdd)
  {
    boolean wasSet = false;
    traceAdd = aTraceAdd;
    wasSet = true;
    return wasSet;
  }

  public boolean setTraceRemove(boolean aTraceRemove)
  {
    boolean wasSet = false;
    traceRemove = aTraceRemove;
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

  /**
   * default case tracing Cardinality
   */
  public boolean getTraceCardinality()
  {
    return traceCardinality;
  }

  public boolean getTraceAdd()
  {
    return traceAdd;
  }

  public boolean getTraceRemove()
  {
    return traceRemove;
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
  public AssociationVariable getAssociationVariable(int index)
  {
    AssociationVariable aAssociationVariable = associationVariables.get(index);
    return aAssociationVariable;
  }

  public List<AssociationVariable> getAssociationVariables()
  {
    List<AssociationVariable> newAssociationVariables = Collections.unmodifiableList(associationVariables);
    return newAssociationVariables;
  }

  public int numberOfAssociationVariables()
  {
    int number = associationVariables.size();
    return number;
  }

  public boolean hasAssociationVariables()
  {
    boolean has = associationVariables.size() > 0;
    return has;
  }

  public int indexOfAssociationVariable(AssociationVariable aAssociationVariable)
  {
    int index = associationVariables.indexOf(aAssociationVariable);
    return index;
  }
  /* Code from template association_GetMany */
  public Association getAssociation(int index)
  {
    Association aAssociation = associations.get(index);
    return aAssociation;
  }

  public List<Association> getAssociations()
  {
    List<Association> newAssociations = Collections.unmodifiableList(associations);
    return newAssociations;
  }

  public int numberOfAssociations()
  {
    int number = associations.size();
    return number;
  }

  public boolean hasAssociations()
  {
    boolean has = associations.size() > 0;
    return has;
  }

  public int indexOfAssociation(Association aAssociation)
  {
    int index = associations.indexOf(aAssociation);
    return index;
  }
  /* Code from template association_GetOne */
  public TraceDirective getTraceDirective()
  {
    return traceDirective;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAssociationVariables()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addAssociationVariable(AssociationVariable aAssociationVariable)
  {
    boolean wasAdded = false;
    if (associationVariables.contains(aAssociationVariable)) { return false; }
    associationVariables.add(aAssociationVariable);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAssociationVariable(AssociationVariable aAssociationVariable)
  {
    boolean wasRemoved = false;
    if (associationVariables.contains(aAssociationVariable))
    {
      associationVariables.remove(aAssociationVariable);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAssociationVariableAt(AssociationVariable aAssociationVariable, int index)
  {  
    boolean wasAdded = false;
    if(addAssociationVariable(aAssociationVariable))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociationVariables()) { index = numberOfAssociationVariables() - 1; }
      associationVariables.remove(aAssociationVariable);
      associationVariables.add(index, aAssociationVariable);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAssociationVariableAt(AssociationVariable aAssociationVariable, int index)
  {
    boolean wasAdded = false;
    if(associationVariables.contains(aAssociationVariable))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociationVariables()) { index = numberOfAssociationVariables() - 1; }
      associationVariables.remove(aAssociationVariable);
      associationVariables.add(index, aAssociationVariable);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAssociationVariableAt(aAssociationVariable, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAssociations()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addAssociation(Association aAssociation)
  {
    boolean wasAdded = false;
    if (associations.contains(aAssociation)) { return false; }
    associations.add(aAssociation);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAssociation(Association aAssociation)
  {
    boolean wasRemoved = false;
    if (associations.contains(aAssociation))
    {
      associations.remove(aAssociation);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAssociationAt(Association aAssociation, int index)
  {  
    boolean wasAdded = false;
    if(addAssociation(aAssociation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociations()) { index = numberOfAssociations() - 1; }
      associations.remove(aAssociation);
      associations.add(index, aAssociation);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAssociationAt(Association aAssociation, int index)
  {
    boolean wasAdded = false;
    if(associations.contains(aAssociation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociations()) { index = numberOfAssociations() - 1; }
      associations.remove(aAssociation);
      associations.add(index, aAssociation);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAssociationAt(aAssociation, index);
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
      existingTraceDirective.removeAssociationTraceItem(this);
    }
    traceDirective.addAssociationTraceItem(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    associationVariables.clear();
    associations.clear();
    TraceDirective placeholderTraceDirective = traceDirective;
    this.traceDirective = null;
    if(placeholderTraceDirective != null)
    {
      placeholderTraceDirective.removeAssociationTraceItem(this);
    }
  }

  // line 220 "../../../../src/Trace_Code.ump"
   public Boolean getIsPre(){
    return conditionallyWhere;
  }

  // line 223 "../../../../src/Trace_Code.ump"
   public Boolean getIsPost(){
    return !conditionallyWhere;
  }


  /**
   * @params gen: A code transator
   * @params o: the current context(i.e.attribute being traced)
   * @params methodname: what to call this trace
   * @params uClass: the current umple class uClass
   * @params args: if the string is equal to "", the format will be {methodname} {attribute name} to {parameter name}, no argument only returns the argument name, or else the string is passed in the form {methodname} {passed string} to {attribute}
   * @return the message for the trace
   */
  // line 234 "../../../../src/Trace_Code.ump"
   public String trace(CodeTranslator gen, Object o, String methodname, UmpleClass uClass, String... args){
    Label_Association_35: ;
		return "";
  }


  /**
   * Gets and returns the if statement enclosing this trace item.
   * needs the name of the attribute
   * @return the if statement for the trace if one exists
   */
  // line 243 "../../../../src/Trace_Code.ump"
   public String getExtremities(CodeTranslator gen, String name){
    return gen.translate(name+":Closed",constraint);
  }


  public String toString()
  {
    return super.toString() + "["+
            "tracerType" + ":" + getTracerType()+ "," +
            "traceCardinality" + ":" + getTraceCardinality()+ "," +
            "traceAdd" + ":" + getTraceAdd()+ "," +
            "traceRemove" + ":" + getTraceRemove()+ "," +
            "periodClause" + ":" + getPeriodClause()+ "," +
            "conditionallyWhere" + ":" + getConditionallyWhere()+ "," +
            "conditionType" + ":" + getConditionType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "constraint" + "=" + (getConstraint() != null ? !getConstraint().equals(this)  ? getConstraint().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "traceDirective = "+(getTraceDirective()!=null?Integer.toHexString(System.identityHashCode(getTraceDirective())):"null");
  }
}
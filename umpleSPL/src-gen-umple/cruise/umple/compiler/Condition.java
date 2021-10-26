/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Used to associated condition patern for an umple elemnt. Designed to be generic so, this elemnt
 * can be of different types
 */
// line 11 "../../../../src/Umple_CodeConstraint.ump"
// line 120 "../../../../src/Trace.ump"
public class Condition
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Condition Attributes
  private String condition;
  private Object element;
  private ConstraintTree constraint;
  private boolean conditionallyWhere;
  private String conditionType;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Condition(String aCondition, Object aElement)
  {
    condition = aCondition;
    element = aElement;
    constraint = null;
    conditionallyWhere = true;
    conditionType = "where";
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCondition(String aCondition)
  {
    boolean wasSet = false;
    condition = aCondition;
    wasSet = true;
    return wasSet;
  }

  public boolean setElement(Object aElement)
  {
    boolean wasSet = false;
    element = aElement;
    wasSet = true;
    return wasSet;
  }

  public boolean setConstraint(ConstraintTree aConstraint)
  {
    boolean wasSet = false;
    constraint = aConstraint;
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

  public String getCondition()
  {
    return condition;
  }

  public Object getElement()
  {
    return element;
  }

  public ConstraintTree getConstraint()
  {
    return constraint;
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

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "condition" + ":" + getCondition()+ "," +
            "conditionallyWhere" + ":" + getConditionallyWhere()+ "," +
            "conditionType" + ":" + getConditionType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "element" + "=" + (getElement() != null ? !getElement().equals(this)  ? getElement().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "constraint" + "=" + (getConstraint() != null ? !getConstraint().equals(this)  ? getConstraint().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
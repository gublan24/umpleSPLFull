/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Discarded metamodel
 */
// line 219 "../../../../src/Trace.ump"
public class TraceCondition
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TraceCondition Attributes
  private String conditionType;
  private boolean preCondition;
  private boolean postCondition;
  private String lhs;

  //TraceCondition Associations
  private ConditionRhs rhs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TraceCondition(ConditionRhs aRhs)
  {
    conditionType = null;
    preCondition = false;
    postCondition = false;
    lhs = null;
    if (!setRhs(aRhs))
    {
      throw new RuntimeException("Unable to create TraceCondition due to aRhs. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setConditionType(String aConditionType)
  {
    boolean wasSet = false;
    conditionType = aConditionType;
    wasSet = true;
    return wasSet;
  }

  public boolean setPreCondition(boolean aPreCondition)
  {
    boolean wasSet = false;
    preCondition = aPreCondition;
    wasSet = true;
    return wasSet;
  }

  public boolean setPostCondition(boolean aPostCondition)
  {
    boolean wasSet = false;
    postCondition = aPostCondition;
    wasSet = true;
    return wasSet;
  }

  public boolean setLhs(String aLhs)
  {
    boolean wasSet = false;
    lhs = aLhs;
    wasSet = true;
    return wasSet;
  }

  /**
   * condition may be where, until, after, or giving
   */
  public String getConditionType()
  {
    return conditionType;
  }

  public boolean getPreCondition()
  {
    return preCondition;
  }

  public boolean getPostCondition()
  {
    return postCondition;
  }

  public String getLhs()
  {
    return lhs;
  }
  /* Code from template association_GetOne */
  public ConditionRhs getRhs()
  {
    return rhs;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setRhs(ConditionRhs aNewRhs)
  {
    boolean wasSet = false;
    if (aNewRhs != null)
    {
      rhs = aNewRhs;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    rhs = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "conditionType" + ":" + getConditionType()+ "," +
            "preCondition" + ":" + getPreCondition()+ "," +
            "postCondition" + ":" + getPostCondition()+ "," +
            "lhs" + ":" + getLhs()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rhs = "+(getRhs()!=null?Integer.toHexString(System.identityHashCode(getRhs())):"null");
  }
}
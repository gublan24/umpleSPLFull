/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 229 "../../../../src/Trace.ump"
public class ConditionRhs
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConditionRhs Attributes
  private String rhs;
  private String comparisonOperator;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConditionRhs()
  {
    rhs = null;
    comparisonOperator = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRhs(String aRhs)
  {
    boolean wasSet = false;
    rhs = aRhs;
    wasSet = true;
    return wasSet;
  }

  public boolean setComparisonOperator(String aComparisonOperator)
  {
    boolean wasSet = false;
    comparisonOperator = aComparisonOperator;
    wasSet = true;
    return wasSet;
  }

  public String getRhs()
  {
    return rhs;
  }

  public String getComparisonOperator()
  {
    return comparisonOperator;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "rhs" + ":" + getRhs()+ "," +
            "comparisonOperator" + ":" + getComparisonOperator()+ "]";
  }
}
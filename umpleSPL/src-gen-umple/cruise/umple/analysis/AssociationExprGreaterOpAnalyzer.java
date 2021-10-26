/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 464 "../../../../src/UmpleAnalysis.ump"
public class AssociationExprGreaterOpAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationExprGreaterOpAnalyzer Attributes
  private ConstraintOperator operator;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssociationExprGreaterOpAnalyzer()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOperator(ConstraintOperator aOperator)
  {
    boolean wasSet = false;
    operator = aOperator;
    wasSet = true;
    return wasSet;
  }

  public ConstraintOperator getOperator()
  {
    return operator;
  }

  public void delete()
  {}

  // line 474 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    operator.setValue("cardinality>=");
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "operator" + "=" + (getOperator() != null ? !getOperator().equals(this)  ? getOperator().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
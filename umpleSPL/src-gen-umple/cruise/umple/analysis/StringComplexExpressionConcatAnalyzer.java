/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 923 "../../../../src/UmpleAnalysis.ump"
public class StringComplexExpressionConcatAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StringComplexExpressionConcatAnalyzer Attributes
  private ConstraintTree rawLine;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StringComplexExpressionConcatAnalyzer()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRawLine(ConstraintTree aRawLine)
  {
    boolean wasSet = false;
    rawLine = aRawLine;
    wasSet = true;
    return wasSet;
  }

  public ConstraintTree getRawLine()
  {
    return rawLine;
  }

  public void delete()
  {}

  // line 933 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    rawLine.addElement(new ConstraintOperator("concatenate"));
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
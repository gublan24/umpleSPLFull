/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 354 "../../../../src/UmpleAnalysis.ump"
public class AssociationExprAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationExprAnalyzer Attributes
  private ConstraintTree rawLine;
  private UmpleClassifier uClassifier;
  private ConstraintTree cv;
  private ConstraintOperator operator;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssociationExprAnalyzer()
  {
    super();
    cv = null;
    operator = new ConstraintOperator("NOT SET");
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

  public boolean setUClassifier(UmpleClassifier aUClassifier)
  {
    boolean wasSet = false;
    uClassifier = aUClassifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setCv(ConstraintTree aCv)
  {
    boolean wasSet = false;
    cv = aCv;
    wasSet = true;
    return wasSet;
  }

  public boolean setOperator(ConstraintOperator aOperator)
  {
    boolean wasSet = false;
    operator = aOperator;
    wasSet = true;
    return wasSet;
  }

  public ConstraintTree getRawLine()
  {
    return rawLine;
  }

  public UmpleClassifier getUClassifier()
  {
    return uClassifier;
  }

  public ConstraintTree getCv()
  {
    return cv;
  }

  public ConstraintOperator getOperator()
  {
    return operator;
  }

  public void delete()
  {}

  // line 369 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    cv = rawLine.createNew();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "operator" + "=" + (getOperator() != null ? !getOperator().equals(this)  ? getOperator().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
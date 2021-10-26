/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 73 "../../../../src/UmpleAnalysis.ump"
public class ConstraintTokenAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintTokenAnalyzer Attributes
  private ConstraintTree rawLine;
  private UmpleClassifier uClassifier;
  private ConstraintTree constraint;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintTokenAnalyzer()
  {
    super();
    rawLine = new ConstraintTree();
    constraint = null;
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

  public boolean setConstraint(ConstraintTree aConstraint)
  {
    boolean wasSet = false;
    constraint = aConstraint;
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

  public ConstraintTree getConstraint()
  {
    return constraint;
  }

  public void delete()
  {}

  // line 85 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    constraint = new ConstraintTree();   
    constraint.addElementAll(rawLine.getRoot());
    rawLine = new ConstraintTree();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "constraint" + "=" + (getConstraint() != null ? !getConstraint().equals(this)  ? getConstraint().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
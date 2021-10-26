/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;
import cruise.umple.analysis.*;

/**
 * File UmpleAnalysis.ump:
 */
// line 102 "../../../../src/StateMachine_refactored.ump"
public class GuardAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GuardAnalyzer Attributes
  private ConstraintTree rawLine;
  private UmpleClassifier uClassifier;
  private Transition t;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GuardAnalyzer()
  {
    super();
    rawLine = new ConstraintTree();
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

  public boolean setT(Transition aT)
  {
    boolean wasSet = false;
    t = aT;
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

  public Transition getT()
  {
    return t;
  }

  public void delete()
  {}

  // line 115 "../../../../src/StateMachine_refactored.ump"
  public void analyze(Token token){
    Guard constraint = new Guard();
      constraint.addElementAll(rawLine.getRoot());
      constraint.setPosition(token.getPosition());
      constraint.setEndPosition(token.getEndPosition());

      t.setGuard(constraint);
      rawLine = new ConstraintTree();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "t" + "=" + (getT() != null ? !getT().equals(this)  ? getT().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
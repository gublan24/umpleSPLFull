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
// line 127 "../../../../src/StateMachine_refactored.ump"
public class StatemachineExprAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StatemachineExprAnalyzer Attributes
  private ConstraintTree rawLine;
  private UmpleClassifier uClassifier;
  private ConstraintTree cv;
  private boolean isStateMachine;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StatemachineExprAnalyzer()
  {
    super();
    cv = null;
    isStateMachine = true;
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

  public boolean setIsStateMachine(boolean aIsStateMachine)
  {
    boolean wasSet = false;
    isStateMachine = aIsStateMachine;
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

  public boolean getIsStateMachine()
  {
    return isStateMachine;
  }

  public void delete()
  {}

  // line 140 "../../../../src/StateMachine_refactored.ump"
   public void prepare(Token token){
    cv = rawLine.createNew();
  }


  public String toString()
  {
    return super.toString() + "["+
            "isStateMachine" + ":" + getIsStateMachine()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
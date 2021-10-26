/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;
import cruise.umple.analysis.*;

// line 144 "../../../../src/StateMachine_refactored.ump"
public class StatemachineExprStateNameAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StatemachineExprStateNameAnalyzer Attributes
  private UmpleClassifier uClassifier;
  private ConstraintTree cv;
  private ConstraintTree rawLine;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StatemachineExprStateNameAnalyzer()
  {
    super();
    rawLine = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

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

  public boolean setRawLine(ConstraintTree aRawLine)
  {
    boolean wasSet = false;
    rawLine = aRawLine;
    wasSet = true;
    return wasSet;
  }

  public UmpleClassifier getUClassifier()
  {
    return uClassifier;
  }

  public ConstraintTree getCv()
  {
    return cv;
  }

  public ConstraintTree getRawLine()
  {
    return rawLine;
  }

  public void delete()
  {}

  // line 157 "../../../../src/StateMachine_refactored.ump"
   public void prepare(Token token){
    rawLine = cv.createNew();
  }

  // line 161 "../../../../src/StateMachine_refactored.ump"
   public void analyze(Token token){
    StateMachine stateMachine = null;
    while(!(cv.getRoot() instanceof ConstraintStateMachine))
    {
      if(cv.getRoot()!=null&&(cv.getRoot() instanceof ConstraintOperator))
      {
        ConstraintOperator operator = (ConstraintOperator)cv.getRoot();
        if(operator.getLeft()!=null&&(operator.getLeft() instanceof ConstraintTree))
        {
          cv = (ConstraintTree)operator.getLeft();
        }
        else break;
      }
      else break;
    }
    if(cv.getRoot() instanceof ConstraintStateMachine)
    {
      State state = ((ConstraintStateMachine)cv.getRoot()).getStateMachine().findState(token.getValue());
      ConstraintState var = new ConstraintState(state);
      rawLine.addElement(var);
    }
    else
    {
      //TODO: add error
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
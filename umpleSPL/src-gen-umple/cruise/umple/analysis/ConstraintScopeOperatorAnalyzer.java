/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 849 "../../../../src/UmpleAnalysis.ump"
public class ConstraintScopeOperatorAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintScopeOperatorAnalyzer Attributes
  private UmpleClassifier uClassifier;
  private ConstraintTree cv;
  private ConstraintTree rawLine;
  private boolean mustBeInClass;
  private List<String> type;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintScopeOperatorAnalyzer()
  {
    super();
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

  public boolean setMustBeInClass(boolean aMustBeInClass)
  {
    boolean wasSet = false;
    mustBeInClass = aMustBeInClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(List<String> aType)
  {
    boolean wasSet = false;
    type = aType;
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

  public boolean getMustBeInClass()
  {
    return mustBeInClass;
  }

  public List<String> getType()
  {
    return type;
  }

  public void delete()
  {}

  // line 865 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    ConstraintOperator dot = new ConstraintOperator(".");
    cv.addElement(dot);
  }

  // line 871 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "mustBeInClass" + ":" + getMustBeInClass()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "type" + "=" + (getType() != null ? !getType().equals(this)  ? getType().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
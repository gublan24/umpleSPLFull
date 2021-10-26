/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 281 "../../../../src/UmpleAnalysis.ump"
public class ArithmeticCallAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ArithmeticCallAnalyzer Attributes
  private UmpleClassifier uClassifier;
  private ConstraintTree rawLine;
  private ConstraintTree personalRawLine;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ArithmeticCallAnalyzer()
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

  public boolean setRawLine(ConstraintTree aRawLine)
  {
    boolean wasSet = false;
    rawLine = aRawLine;
    wasSet = true;
    return wasSet;
  }

  public boolean setPersonalRawLine(ConstraintTree aPersonalRawLine)
  {
    boolean wasSet = false;
    personalRawLine = aPersonalRawLine;
    wasSet = true;
    return wasSet;
  }

  public UmpleClassifier getUClassifier()
  {
    return uClassifier;
  }

  public ConstraintTree getRawLine()
  {
    return rawLine;
  }

  public ConstraintTree getPersonalRawLine()
  {
    return personalRawLine;
  }

  public void delete()
  {}

  // line 295 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    personalRawLine = rawLine;
    rawLine = rawLine.createNew();
  }

  // line 301 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    ConstraintTree cv = rawLine.createNew();
    cv.setShouldDisplayBrackets(true);
    cv.addElementAll(rawLine.getRoot());
    personalRawLine.addElement(cv);
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "personalRawLine" + "=" + (getPersonalRawLine() != null ? !getPersonalRawLine().equals(this)  ? getPersonalRawLine().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
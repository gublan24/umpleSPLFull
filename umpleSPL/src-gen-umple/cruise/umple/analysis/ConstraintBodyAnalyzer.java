/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 178 "../../../../src/UmpleAnalysis.ump"
public class ConstraintBodyAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintBodyAnalyzer Attributes
  private UmpleClassifier uClassifier;
  private ConstraintTree rawLine;
  private ConstraintTree savedRawLine;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintBodyAnalyzer()
  {
    super();
    savedRawLine = null;
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

  public boolean setSavedRawLine(ConstraintTree aSavedRawLine)
  {
    boolean wasSet = false;
    savedRawLine = aSavedRawLine;
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

  public ConstraintTree getSavedRawLine()
  {
    return savedRawLine;
  }

  public void delete()
  {}

  // line 189 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    savedRawLine = rawLine;
    rawLine = rawLine.createNew();
  }

  // line 193 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    rawLine.setShouldDisplayBrackets(true);
    savedRawLine.addElement(rawLine);
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "savedRawLine" + "=" + (getSavedRawLine() != null ? !getSavedRawLine().equals(this)  ? getSavedRawLine().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 198 "../../../../src/UmpleAnalysis.ump"
public class NegativeConstraintAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //NegativeConstraintAnalyzer Attributes
  private UmpleClassifier uClassifier;
  private ConstraintTree rawLine;
  private ConstraintTree strawLine;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NegativeConstraintAnalyzer()
  {
    super();
    strawLine = null;
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

  public boolean setStrawLine(ConstraintTree aStrawLine)
  {
    boolean wasSet = false;
    strawLine = aStrawLine;
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

  public ConstraintTree getStrawLine()
  {
    return strawLine;
  }

  public void delete()
  {}

  // line 210 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    strawLine = rawLine;
    rawLine = rawLine.createNew();
  }

  // line 214 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    rawLine.negate();
    strawLine.addElement(rawLine);
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "strawLine" + "=" + (getStrawLine() != null ? !getStrawLine().equals(this)  ? getStrawLine().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
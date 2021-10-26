/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 219 "../../../../src/UmpleAnalysis.ump"
public class LinkingOpBodyAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LinkingOpBodyAnalyzer Attributes
  private UmpleClassifier uClassifier;
  private ConstraintTree rawLine;
  private ConstraintTree sRawLine;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LinkingOpBodyAnalyzer()
  {
    super();
    sRawLine = null;
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

  public boolean setSRawLine(ConstraintTree aSRawLine)
  {
    boolean wasSet = false;
    sRawLine = aSRawLine;
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

  public ConstraintTree getSRawLine()
  {
    return sRawLine;
  }

  public void delete()
  {}

  // line 231 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    sRawLine = rawLine;
    rawLine = rawLine.createNew();
  }

  // line 235 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    sRawLine.addElement(rawLine);
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "sRawLine" + "=" + (getSRawLine() != null ? !getSRawLine().equals(this)  ? getSRawLine().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 588 "../../../../src/UmpleAnalysis.ump"
public class ConstraintParameterAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintParameterAnalyzer Attributes
  private UmpleClassifier uClassifier;
  private ConstraintTree cv;
  private ConstraintTree rawLine;
  private boolean mustBeInClass;
  private boolean asIs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintParameterAnalyzer()
  {
    super();
    rawLine = null;
    mustBeInClass = false;
    asIs = false;
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

  public boolean setAsIs(boolean aAsIs)
  {
    boolean wasSet = false;
    asIs = aAsIs;
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

  public boolean getAsIs()
  {
    return asIs;
  }

  public void delete()
  {}

  // line 604 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    if(cv!=null)
    {
      rawLine = cv.createNew();
    }
    else if(rawLine!=null)
    {
      cv = rawLine;
      rawLine = rawLine.createNew();
    }
  }

  // line 617 "../../../../src/UmpleAnalysis.ump"
  public void analyze(Token token){
    cv.addElement(rawLine);
  }


  public String toString()
  {
    return super.toString() + "["+
            "mustBeInClass" + ":" + getMustBeInClass()+ "," +
            "asIs" + ":" + getAsIs()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
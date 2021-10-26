/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 636 "../../../../src/UmpleAnalysis.ump"
public class ConstraintNameAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintNameAnalyzer Attributes
  private UmpleClassifier uClassifier;
  private ConstraintTree rawLine;
  private boolean mustBeInClass;
  private List<String> type;
  private boolean mustWarn;
  private Token grandparentToken;
  private ConstraintTree cv;
  private ConstraintTree personalRawLine;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintNameAnalyzer()
  {
    super();
    mustWarn = true;
    grandparentToken = null;
    cv = null;
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

  public boolean setMustWarn(boolean aMustWarn)
  {
    boolean wasSet = false;
    mustWarn = aMustWarn;
    wasSet = true;
    return wasSet;
  }

  public boolean setGrandparentToken(Token aGrandparentToken)
  {
    boolean wasSet = false;
    grandparentToken = aGrandparentToken;
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

  public boolean getMustBeInClass()
  {
    return mustBeInClass;
  }

  public List<String> getType()
  {
    return type;
  }

  public boolean getMustWarn()
  {
    return mustWarn;
  }

  public Token getGrandparentToken()
  {
    return grandparentToken;
  }

  public ConstraintTree getCv()
  {
    return cv;
  }

  public ConstraintTree getPersonalRawLine()
  {
    return personalRawLine;
  }

  public void delete()
  {}

  // line 655 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token nameToken){
    Token grandparentToken = nameToken.getParentToken().getParentToken();
    if(cv==null)
    {
      cv = rawLine.createNew();
    }
    personalRawLine = rawLine;
    rawLine = rawLine.createNew();
  }

  // line 665 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token nameToken){
    personalRawLine.addElement(cv);
  }


  public String toString()
  {
    return super.toString() + "["+
            "mustBeInClass" + ":" + getMustBeInClass()+ "," +
            "mustWarn" + ":" + getMustWarn()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "type" + "=" + (getType() != null ? !getType().equals(this)  ? getType().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "grandparentToken" + "=" + (getGrandparentToken() != null ? !getGrandparentToken().equals(this)  ? getGrandparentToken().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "personalRawLine" + "=" + (getPersonalRawLine() != null ? !getPersonalRawLine().equals(this)  ? getPersonalRawLine().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
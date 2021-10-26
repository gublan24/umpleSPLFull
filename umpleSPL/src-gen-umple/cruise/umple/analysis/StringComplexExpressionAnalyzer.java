/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 888 "../../../../src/UmpleAnalysis.ump"
public class StringComplexExpressionAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StringComplexExpressionAnalyzer Attributes
  private ConstraintTree rawLine;
  private UmpleClassifier uClassifier;
  private ConstraintTree myRawLine;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StringComplexExpressionAnalyzer()
  {
    super();
    myRawLine = null;
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

  public boolean setMyRawLine(ConstraintTree aMyRawLine)
  {
    boolean wasSet = false;
    myRawLine = aMyRawLine;
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

  public ConstraintTree getMyRawLine()
  {
    return myRawLine;
  }

  public void delete()
  {}

  // line 900 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    if(token.numberOfSubTokens()>1)
    {
      if(token.numberOfSubTokens()!=3||!token.getSubToken(0).getName().equals("\""))
      {
        myRawLine = rawLine;
        rawLine = rawLine.createNew();
      }
    }
  }

  // line 911 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    if(token.numberOfSubTokens()>1)
    {
      if(token.numberOfSubTokens()!=3||!token.getSubToken(0).getName().equals("\""))
      {
        ConstraintTree cv = rawLine.createNew();
        cv.addElementAll(rawLine.getRoot());
        myRawLine.addElement(cv);
      }
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "myRawLine" + "=" + (getMyRawLine() != null ? !getMyRawLine().equals(this)  ? getMyRawLine().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
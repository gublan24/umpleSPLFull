/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 492 "../../../../src/UmpleAnalysis.ump"
public class AssociationLiteralAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationLiteralAnalyzer Attributes
  private ConstraintTree rawLine;
  private UmpleClassifier uClassifier;
  private ConstraintTree cv;
  private ConstraintOperator operator;
  private boolean firstName;
  private ConstraintTree subject;
  private boolean asIs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssociationLiteralAnalyzer()
  {
    super();
    firstName = true;
    subject = null;
    asIs = true;
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

  public boolean setOperator(ConstraintOperator aOperator)
  {
    boolean wasSet = false;
    operator = aOperator;
    wasSet = true;
    return wasSet;
  }

  public boolean setFirstName(boolean aFirstName)
  {
    boolean wasSet = false;
    firstName = aFirstName;
    wasSet = true;
    return wasSet;
  }

  public boolean setSubject(ConstraintTree aSubject)
  {
    boolean wasSet = false;
    subject = aSubject;
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

  public ConstraintOperator getOperator()
  {
    return operator;
  }

  public boolean getFirstName()
  {
    return firstName;
  }

  public ConstraintTree getSubject()
  {
    return subject;
  }

  public boolean getAsIs()
  {
    return asIs;
  }

  public void delete()
  {}

  // line 509 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    if(subject == null)
    {
      subject = cv;
      cv = null;
    }
    if(!firstName)
    {
      if("hasAll".equals(operator.getValue()))
      {
        rawLine.addElement(new ConstraintOperator("&&"));
      }
      else 
      {
        rawLine.addElement(new ConstraintOperator("||"));
      }
      rawLine.addElement(subject);
    }
    else firstName = false;    
    rawLine.addElement(operator);
  }

  // line 531 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "firstName" + ":" + getFirstName()+ "," +
            "asIs" + ":" + getAsIs()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "operator" + "=" + (getOperator() != null ? !getOperator().equals(this)  ? getOperator().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "subject" + "=" + (getSubject() != null ? !getSubject().equals(this)  ? getSubject().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
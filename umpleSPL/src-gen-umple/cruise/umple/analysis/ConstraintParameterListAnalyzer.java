/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 563 "../../../../src/UmpleAnalysis.ump"
public class ConstraintParameterListAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintParameterListAnalyzer Attributes
  private UmpleClassifier uClassifier;
  private ConstraintTree cv;
  private ConstraintTree mcv;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintParameterListAnalyzer()
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

  public boolean setMcv(ConstraintTree aMcv)
  {
    boolean wasSet = false;
    mcv = aMcv;
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

  public ConstraintTree getMcv()
  {
    return mcv;
  }

  public void delete()
  {}

  // line 576 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token nameToken){
    cv.addElement(new ConstraintOperator(""));
    mcv = cv;
    cv = cv.createNew();
    cv.addElement(new ConstraintUnassignedName(""));
  }

  // line 583 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token nameToken){
    cv.setShouldDisplayBrackets(true);
    mcv.addElement(cv);
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "mcv" + "=" + (getMcv() != null ? !getMcv().equals(this)  ? getMcv().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 798 "../../../../src/UmpleAnalysis.ump"
public class ConstraintNameNewAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintNameNewAnalyzer Attributes
  private ConstraintTree cv;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintNameNewAnalyzer()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCv(ConstraintTree aCv)
  {
    boolean wasSet = false;
    cv = aCv;
    wasSet = true;
    return wasSet;
  }

  public ConstraintTree getCv()
  {
    return cv;
  }

  public void delete()
  {}

  // line 809 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    ConstraintOperator newCV = new ConstraintOperator("initialise");
    cv.addElement(newCV);
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
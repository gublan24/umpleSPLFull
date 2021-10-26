/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 814 "../../../../src/UmpleAnalysis.ump"
public class ConstraintNameIndexAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintNameIndexAnalyzer Attributes
  private ConstraintTree cv;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintNameIndexAnalyzer()
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

  // line 824 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    ConstraintVariable var = cv.getRoot();
    if(var==null)return;
    try
    {
      int i = Integer.parseInt(token.getValue());
      if(var instanceof ConstraintAssociation )
      {
        ((ConstraintAssociation)var).setIndex(i);
      }
      else if(var instanceof ConstraintAttribute)
      {
        ((ConstraintAttribute)var).setIndex(i);
      }
      else
      {
        //setFailedPosition(token.getPosition(), 29, var.getValue(), "association or list");
      }
    } 
    catch (NumberFormatException e)
    {
      //setFailedPosition(token.getPosition(), 29, token.getValue(), "integer");
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
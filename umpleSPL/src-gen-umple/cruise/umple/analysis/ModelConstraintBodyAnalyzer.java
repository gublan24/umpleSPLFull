/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 1050 "../../../../src/UmpleAnalysis.ump"
public class ModelConstraintBodyAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModelConstraintBodyAnalyzer Attributes
  private ModelConstraint modelConstraint;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelConstraintBodyAnalyzer()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setModelConstraint(ModelConstraint aModelConstraint)
  {
    boolean wasSet = false;
    modelConstraint = aModelConstraint;
    wasSet = true;
    return wasSet;
  }

  public ModelConstraint getModelConstraint()
  {
    return modelConstraint;
  }

  public void delete()
  {}

  // line 1060 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    ModelConstraint parent = modelConstraint;
    modelConstraint = new ModelConstraint(token.getPosition());
    if(parent!=null)
    {
      parent.addModelConstraint(modelConstraint);
    }
  }

  // line 1069 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    
  }

  // line 1073 "../../../../src/UmpleAnalysis.ump"
   public void reset(){
    modelConstraint = null;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "modelConstraint" + "=" + (getModelConstraint() != null ? !getModelConstraint().equals(this)  ? getModelConstraint().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
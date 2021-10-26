/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 1175 "../../../../src/UmpleAnalysis.ump"
public class ModelRelationOpAttributeClassificationAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModelRelationOpAttributeClassificationAnalyzer Attributes
  private ModelConstraint modelConstraint;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelRelationOpAttributeClassificationAnalyzer()
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

  // line 1186 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    if("named".equals(token.getValue()))
    {
      modelConstraint.addModelConstraint(new ModelConstraintAttributeFromName(token.getPosition()));
    }
    else if("of".equals(token.getValue()))
    {
      modelConstraint.addModelConstraint(new ModelConstraintAttributeFromClass(token.getPosition()));
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "modelConstraint" + "=" + (getModelConstraint() != null ? !getModelConstraint().equals(this)  ? getModelConstraint().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
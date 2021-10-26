/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;

// line 1197 "../../../../src/UmpleAnalysis.ump"
public class ModelRelationOpAssociationAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModelRelationOpAssociationAnalyzer Attributes
  private ModelConstraint modelConstraint;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelRelationOpAssociationAnalyzer()
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

  // line 1208 "../../../../src/UmpleAnalysis.ump"
   public void prepare(Token token){
    modelConstraint.addModelConstraint(new ModelConstraintAssociation(token.getPosition()));
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "modelConstraint" + "=" + (getModelConstraint() != null ? !getModelConstraint().equals(this)  ? getModelConstraint().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
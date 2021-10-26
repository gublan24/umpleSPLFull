/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;

// line 1227 "../../../../src/UmpleAnalysis.ump"
public class ModelRelationAssociationEndAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModelRelationAssociationEndAnalyzer Attributes
  private ModelConstraint modelConstraint;
  private Multiplicity multiplicity;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelRelationAssociationEndAnalyzer()
  {
    super();
    multiplicity = new Multiplicity();
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

  public boolean setMultiplicity(Multiplicity aMultiplicity)
  {
    boolean wasSet = false;
    multiplicity = aMultiplicity;
    wasSet = true;
    return wasSet;
  }

  public ModelConstraint getModelConstraint()
  {
    return modelConstraint;
  }

  public Multiplicity getMultiplicity()
  {
    return multiplicity;
  }

  public void delete()
  {}

  // line 1238 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    if(multiplicity.getMaximum() == null)
    {
      multiplicity.setBound(multiplicity.getMinimum());
      multiplicity.setMinimum(null);
    }
    modelConstraint.addAssociationEnd(multiplicity);
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "modelConstraint" + "=" + (getModelConstraint() != null ? !getModelConstraint().equals(this)  ? getModelConstraint().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "multiplicity" + "=" + (getMultiplicity() != null ? !getMultiplicity().equals(this)  ? getMultiplicity().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
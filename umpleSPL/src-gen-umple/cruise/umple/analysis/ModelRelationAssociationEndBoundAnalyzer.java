/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.analysis;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;

// line 1247 "../../../../src/UmpleAnalysis.ump"
public class ModelRelationAssociationEndBoundAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModelRelationAssociationEndBoundAnalyzer Attributes
  private Multiplicity multiplicity;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelRelationAssociationEndBoundAnalyzer()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMultiplicity(Multiplicity aMultiplicity)
  {
    boolean wasSet = false;
    multiplicity = aMultiplicity;
    wasSet = true;
    return wasSet;
  }

  public Multiplicity getMultiplicity()
  {
    return multiplicity;
  }

  public void delete()
  {}

  // line 1257 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    if(multiplicity.getMinimum()==null)
    {
      multiplicity.setMinimum(token.getValue());
    }
    else
    {
      multiplicity.setMaximum(token.getValue());
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "multiplicity" + "=" + (getMultiplicity() != null ? !getMultiplicity().equals(this)  ? getMultiplicity().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
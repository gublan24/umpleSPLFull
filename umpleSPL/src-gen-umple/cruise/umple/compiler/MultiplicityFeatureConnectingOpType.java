/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * MultiplicityFeatureConnectingOpType is a special type of FeatureLink in which there are min and max multiplicity.
 */
// line 85 "../../../../src/FeatureModel.ump"
public class MultiplicityFeatureConnectingOpType extends FeatureLink
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MultiplicityFeatureConnectingOpType Attributes
  private Multiplicity multiplicity;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MultiplicityFeatureConnectingOpType()
  {
    super();
    multiplicity = new Multiplicity();
    // line 90 "../../../../src/FeatureModel.ump"
    this.setFeatureConnectingOpType(FeatureConnectingOpType.Multiplicity);
    // END OF UMPLE AFTER INJECTION
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
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "multiplicity" + "=" + (getMultiplicity() != null ? !getMultiplicity().equals(this)  ? getMultiplicity().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
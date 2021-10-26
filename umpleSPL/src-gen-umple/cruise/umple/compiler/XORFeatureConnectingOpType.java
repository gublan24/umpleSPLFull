/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * XORFeatureConnectingOpType is a special type of FeatureLink in which lower & upper bounds of the set are limited to 1 (i.e. 1..1).
 */
// line 94 "../../../../src/FeatureModel.ump"
public class XORFeatureConnectingOpType extends MultiplicityFeatureConnectingOpType
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public XORFeatureConnectingOpType()
  {
    super();
    // line 98 "../../../../src/FeatureModel.ump"
    this.setFeatureConnectingOpType(FeatureConnectingOpType.XOR);
        Multiplicity xorMultiplicity = new Multiplicity();
        xorMultiplicity.setRange("1","1");
        setMultiplicity(xorMultiplicity);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations;

/**
 * this java code is compiled automatically on build for testbed
 * if the code compiles, then the test has passed
 */
// line 6 "../../../src/TestHarnessAssociation0_1_mMultiplicity.ump"
public class A
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //A Associations
  private B b;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public A()
  {}

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public B getB()
  {
    return b;
  }

  public boolean hasB()
  {
    boolean has = b != null;
    return has;
  }

  public void delete()
  {
    if (b != null)
    {
      b.delete();
    }
  }

}
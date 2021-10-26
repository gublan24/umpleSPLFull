/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.patterns.test;

// line 14 "../../../../src/TestHarnessPatternsImmutable.ump"
public class WidgetImmutableB
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //WidgetImmutableB Attributes
  private String name;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public WidgetImmutableB(String aName)
  {
    name = aName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getName()
  {
    return name;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]";
  }
}
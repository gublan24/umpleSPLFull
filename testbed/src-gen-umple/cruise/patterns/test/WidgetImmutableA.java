/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.patterns.test;

// line 6 "../../../../src/TestHarnessPatternsImmutable.ump"
public class WidgetImmutableA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //WidgetImmutableA Attributes
  private String name;

  //WidgetImmutableA Associations
  private WidgetImmutableB widgetImmutableB;

  //Helper Variables
  private boolean canSetWidgetImmutableB;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public WidgetImmutableA(String aName, WidgetImmutableB aWidgetImmutableB)
  {
    name = aName;
    canSetWidgetImmutableB = true;
    if (!setWidgetImmutableB(aWidgetImmutableB))
    {
      throw new RuntimeException("Unable to create WidgetImmutableA due to aWidgetImmutableB. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getName()
  {
    return name;
  }
  /* Code from template association_GetOne */
  public WidgetImmutableB getWidgetImmutableB()
  {
    return widgetImmutableB;
  }
  /* Code from template association_SetUnidirectionalOne */
  private boolean setWidgetImmutableB(WidgetImmutableB aNewWidgetImmutableB)
  {
    boolean wasSet = false;
    if (!canSetWidgetImmutableB) { return false; }
    canSetWidgetImmutableB = false;
    if (aNewWidgetImmutableB != null)
    {
      widgetImmutableB = aNewWidgetImmutableB;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "widgetImmutableB = "+(getWidgetImmutableB()!=null?Integer.toHexString(System.identityHashCode(getWidgetImmutableB())):"null");
  }
}
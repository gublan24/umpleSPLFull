/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.patterns.test;
import java.util.*;

// line 20 "../../../../src/TestHarnessPatternsImmutable.ump"
public class WidgetSubclass extends WidgetImmutableB
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //WidgetSubclass Attributes
  private String type;

  //WidgetSubclass Associations
  private List<WidgetImmutableB> widgetImmutableBs;

  //Helper Variables
  private boolean canSetWidgetImmutableBs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public WidgetSubclass(String aName, String aType, WidgetImmutableB... allWidgetImmutableBs)
  {
    super(aName);
    type = aType;
    canSetWidgetImmutableBs = true;
    widgetImmutableBs = new ArrayList<WidgetImmutableB>();
    boolean didAddWidgetImmutableBs = setWidgetImmutableBs(allWidgetImmutableBs);
    if (!didAddWidgetImmutableBs)
    {
      throw new RuntimeException("Unable to create WidgetSubclass, must have 2 or fewer widgetImmutableBs, no duplicates. See http://manual.umple.org?RE001ViolationofImmutability.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getType()
  {
    return type;
  }
  /* Code from template association_GetMany */
  public WidgetImmutableB getWidgetImmutableB(int index)
  {
    WidgetImmutableB aWidgetImmutableB = widgetImmutableBs.get(index);
    return aWidgetImmutableB;
  }

  public List<WidgetImmutableB> getWidgetImmutableBs()
  {
    List<WidgetImmutableB> newWidgetImmutableBs = Collections.unmodifiableList(widgetImmutableBs);
    return newWidgetImmutableBs;
  }

  public int numberOfWidgetImmutableBs()
  {
    int number = widgetImmutableBs.size();
    return number;
  }

  public boolean hasWidgetImmutableBs()
  {
    boolean has = widgetImmutableBs.size() > 0;
    return has;
  }

  public int indexOfWidgetImmutableB(WidgetImmutableB aWidgetImmutableB)
  {
    int index = widgetImmutableBs.indexOf(aWidgetImmutableB);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWidgetImmutableBs()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfWidgetImmutableBs()
  {
    return 2;
  }
  /* Code from template association_SetUnidirectionalOptionalN */
  private boolean setWidgetImmutableBs(WidgetImmutableB... newWidgetImmutableBs)
  {
    boolean wasSet = false;
    if (!canSetWidgetImmutableBs) { return false; }
    canSetWidgetImmutableBs = false;
    ArrayList<WidgetImmutableB> verifiedWidgetImmutableBs = new ArrayList<WidgetImmutableB>();
    for (WidgetImmutableB aWidgetImmutableB : newWidgetImmutableBs)
    {
      if (verifiedWidgetImmutableBs.contains(aWidgetImmutableB))
      {
        continue;
      }
      verifiedWidgetImmutableBs.add(aWidgetImmutableB);
    }

    if (verifiedWidgetImmutableBs.size() != newWidgetImmutableBs.length || verifiedWidgetImmutableBs.size() > maximumNumberOfWidgetImmutableBs())
    {
      return wasSet;
    }

    widgetImmutableBs.clear();
    widgetImmutableBs.addAll(verifiedWidgetImmutableBs);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "type" + ":" + getType()+ "]";
  }
}
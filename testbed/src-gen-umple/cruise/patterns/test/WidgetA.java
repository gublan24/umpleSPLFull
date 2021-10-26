/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.patterns.test;
import java.sql.Date;

// line 3 "../../../../src/TestHarnessPatterns.ump"
public class WidgetA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //WidgetA Attributes
  private String id;
  private int intId;
  private double doubleId;
  private boolean boolId;
  private Date dateId;
  private WidgetB widgetId;
  private String ignore;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetId;
  private boolean canSetIntId;
  private boolean canSetDoubleId;
  private boolean canSetBoolId;
  private boolean canSetDateId;
  private boolean canSetWidgetId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public WidgetA(String aId, int aIntId, double aDoubleId, boolean aBoolId, Date aDateId, WidgetB aWidgetId, String aIgnore)
  {
    cachedHashCode = -1;
    canSetId = true;
    canSetIntId = true;
    canSetDoubleId = true;
    canSetBoolId = true;
    canSetDateId = true;
    canSetWidgetId = true;
    id = aId;
    intId = aIntId;
    doubleId = aDoubleId;
    boolId = aBoolId;
    dateId = aDateId;
    widgetId = aWidgetId;
    ignore = aIgnore;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    if (!canSetId) { return false; }
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean setIntId(int aIntId)
  {
    boolean wasSet = false;
    if (!canSetIntId) { return false; }
    intId = aIntId;
    wasSet = true;
    return wasSet;
  }

  public boolean setDoubleId(double aDoubleId)
  {
    boolean wasSet = false;
    if (!canSetDoubleId) { return false; }
    doubleId = aDoubleId;
    wasSet = true;
    return wasSet;
  }

  public boolean setBoolId(boolean aBoolId)
  {
    boolean wasSet = false;
    if (!canSetBoolId) { return false; }
    boolId = aBoolId;
    wasSet = true;
    return wasSet;
  }

  public boolean setDateId(Date aDateId)
  {
    boolean wasSet = false;
    if (!canSetDateId) { return false; }
    dateId = aDateId;
    wasSet = true;
    return wasSet;
  }

  public boolean setWidgetId(WidgetB aWidgetId)
  {
    boolean wasSet = false;
    if (!canSetWidgetId) { return false; }
    widgetId = aWidgetId;
    wasSet = true;
    return wasSet;
  }

  public boolean setIgnore(String aIgnore)
  {
    boolean wasSet = false;
    ignore = aIgnore;
    wasSet = true;
    return wasSet;
  }

  public String getId()
  {
    return id;
  }

  public int getIntId()
  {
    return intId;
  }

  public double getDoubleId()
  {
    return doubleId;
  }

  public boolean getBoolId()
  {
    return boolId;
  }

  public Date getDateId()
  {
    return dateId;
  }

  public WidgetB getWidgetId()
  {
    return widgetId;
  }

  public String getIgnore()
  {
    return ignore;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isBoolId()
  {
    return boolId;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    WidgetA compareTo = (WidgetA)obj;
  
    if (getId() == null && compareTo.getId() != null)
    {
      return false;
    }
    else if (getId() != null && !getId().equals(compareTo.getId()))
    {
      return false;
    }

    if (getIntId() != compareTo.getIntId())
    {
      return false;
    }

    if (getDoubleId() != compareTo.getDoubleId())
    {
      return false;
    }

    if (getBoolId() != compareTo.getBoolId())
    {
      return false;
    }

    if (getDateId() == null && compareTo.getDateId() != null)
    {
      return false;
    }
    else if (getDateId() != null && !getDateId().equals(compareTo.getDateId()))
    {
      return false;
    }

    if (getWidgetId() == null && compareTo.getWidgetId() != null)
    {
      return false;
    }
    else if (getWidgetId() != null && !getWidgetId().equals(compareTo.getWidgetId()))
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getId() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getId().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    cachedHashCode = cachedHashCode * 23 + getIntId();

    cachedHashCode = cachedHashCode * 23 + (Double.valueOf(getDoubleId())).hashCode();

    cachedHashCode = cachedHashCode * 23 + (getBoolId() ? 1 : 0);

    if (getDateId() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getDateId().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getWidgetId() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getWidgetId().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetId = false;
    canSetIntId = false;
    canSetDoubleId = false;
    canSetBoolId = false;
    canSetDateId = false;
    canSetWidgetId = false;
    return cachedHashCode;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "boolId" + ":" + getBoolId()+ "," +
            "doubleId" + ":" + getDoubleId()+ "," +
            "intId" + ":" + getIntId()+ "," +
            "id" + ":" + getId()+ "," +
            "ignore" + ":" + getIgnore()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "widgetId" + "=" + (getWidgetId() != null ? !getWidgetId().equals(this)  ? getWidgetId().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "dateId" + "=" + (getDateId() != null ? !getDateId().equals(this)  ? getDateId().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
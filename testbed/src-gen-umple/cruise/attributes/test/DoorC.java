/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;
import java.sql.Date;
import java.sql.Time;

// line 20 "../../../../src/TestHarnessAttributes.ump"
public class DoorC
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorC Attributes
  private String id;
  private int intId;
  private double doubleId;
  private Date dateId;
  private Time timeId;
  private boolean booleanId;
  private DoorB doorId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DoorC(String aId, int aIntId, double aDoubleId, Date aDateId, Time aTimeId, boolean aBooleanId, DoorB aDoorId)
  {
    id = aId;
    intId = aIntId;
    doubleId = aDoubleId;
    dateId = aDateId;
    timeId = aTimeId;
    booleanId = aBooleanId;
    doorId = aDoorId;
  }

  //------------------------
  // INTERFACE
  //------------------------

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

  public Date getDateId()
  {
    return dateId;
  }

  public Time getTimeId()
  {
    return timeId;
  }

  public boolean getBooleanId()
  {
    return booleanId;
  }

  public DoorB getDoorId()
  {
    return doorId;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isBooleanId()
  {
    return booleanId;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "intId" + ":" + getIntId()+ "," +
            "doubleId" + ":" + getDoubleId()+ "," +
            "booleanId" + ":" + getBooleanId()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "dateId" + "=" + (getDateId() != null ? !getDateId().equals(this)  ? getDateId().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "timeId" + "=" + (getTimeId() != null ? !getTimeId().equals(this)  ? getTimeId().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "doorId" + "=" + (getDoorId() != null ? !getDoorId().equals(this)  ? getDoorId().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;
import java.sql.Date;
import java.sql.Time;

// line 6 "../../../../src/TestHarnessAttributes.ump"
// line 4 "../../../../src/LocalHarness.ump"
public class DoorA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorA Attributes
  private String id;
  private int intId;
  private double doubleId;
  private boolean booleanId;
  private DoorB doorId;
  private Date dateId;
  private Time timeId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DoorA()
  {
    id = "1";
    intId = 2;
    doubleId = 3.4;
    booleanId = false;
    doorId = new DoorB(5);
    dateId = new Date(1234);
    timeId = new Time(1235);
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

  public boolean getBooleanId()
  {
    return booleanId;
  }

  public DoorB getDoorId()
  {
    return doorId;
  }

  public Date getDateId()
  {
    return dateId;
  }

  public Time getTimeId()
  {
    return timeId;
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
            "  " + "doorId" + "=" + (getDoorId() != null ? !getDoorId().equals(this)  ? getDoorId().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "dateId" + "=" + (getDateId() != null ? !getDateId().equals(this)  ? getDateId().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "timeId" + "=" + (getTimeId() != null ? !getTimeId().equals(this)  ? getTimeId().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
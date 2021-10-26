/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;
import java.sql.Time;

// line 46 "../../../../src/TestHarnessAttributes.ump"
// line 23 "../../../../src/LocalHarness.ump"
public class DoorF
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorF Attributes
  private Time d1;
  private Time d2;
  private Time d3;
  private Time d4;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DoorF()
  {
    d1 = Time.valueOf("12:51:51");
    d2 = Time.valueOf("12:52:52");
    resetD3();
    d4 = Time.valueOf("12:54:54");
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setD1(Time aD1)
  {
    boolean wasSet = false;
    d1 = aD1;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setD3(Time aD3)
  {
    boolean wasSet = false;
    d3 = aD3;
    wasSet = true;
    return wasSet;
  }

  public boolean resetD3()
  {
    boolean wasReset = false;
    d3 = getDefaultD3();
    wasReset = true;
    return wasReset;
  }

  public boolean setD4(Time aD4)
  {
    boolean wasSet = false;
    d4 = aD4;
    wasSet = true;
    return wasSet;
  }

  public Time getD1()
  {
    return d1;
  }

  public Time getD2()
  {
    return d2;
  }

  public Time getD3()
  {
    return d3;
  }
  /* Code from template attribute_GetDefaulted */
  public Time getDefaultD3()
  {
    return Time.valueOf("12:53:53");
  }

  public Time getD4()
  {
    return d4;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "d1" + "=" + (getD1() != null ? !getD1().equals(this)  ? getD1().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "d2" + "=" + (getD2() != null ? !getD2().equals(this)  ? getD2().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "d3" + "=" + (getD3() != null ? !getD3().equals(this)  ? getD3().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "d4" + "=" + (getD4() != null ? !getD4().equals(this)  ? getD4().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
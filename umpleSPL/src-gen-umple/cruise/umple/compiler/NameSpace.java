/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;

/**
 * added for issue 1315 warning 31
 */
// line 1206 "../../../../src/Umple.ump"
public class NameSpace
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //NameSpace Attributes
  private String value;
  private Position position;
  private int timesUsed;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NameSpace(String aValue, Position aPosition)
  {
    value = aValue;
    position = aPosition;
    timesUsed = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTimesUsed(int aTimesUsed)
  {
    boolean wasSet = false;
    // line 1213 "../../../../src/Umple.ump"
    if(aTimesUsed <0) return false;
    // END OF UMPLE BEFORE INJECTION
    timesUsed = aTimesUsed;
    wasSet = true;
    return wasSet;
  }

  public String getValue()
  {
    return value;
  }

  public Position getPosition()
  {
    return position;
  }

  public int getTimesUsed()
  {
    return timesUsed;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "value" + ":" + getValue()+ "," +
            "timesUsed" + ":" + getTimesUsed()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
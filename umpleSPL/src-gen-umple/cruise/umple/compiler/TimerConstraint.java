/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;

// line 111 "../../../../src/Structure.ump"
public class TimerConstraint
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TimerConstraint Attributes
  private Position position;
  private Position endPosition;
  private String timer;

  //TimerConstraint State Machines
  public enum TimeConstraintType { LTENCY, PERIOD, TIMEOUT }
  private TimeConstraintType timeConstraintType;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TimerConstraint()
  {
    timer = "0";
    setTimeConstraintType(TimeConstraintType.LTENCY);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setEndPosition(Position aEndPosition)
  {
    boolean wasSet = false;
    endPosition = aEndPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setTimer(String aTimer)
  {
    boolean wasSet = false;
    timer = aTimer;
    wasSet = true;
    return wasSet;
  }

  public Position getPosition()
  {
    return position;
  }

  public Position getEndPosition()
  {
    return endPosition;
  }

  public String getTimer()
  {
    return timer;
  }

  public String getTimeConstraintTypeFullName()
  {
    String answer = timeConstraintType.toString();
    return answer;
  }

  public TimeConstraintType getTimeConstraintType()
  {
    return timeConstraintType;
  }

  public boolean setTimeConstraintType(TimeConstraintType aTimeConstraintType)
  {
    timeConstraintType = aTimeConstraintType;
    return true;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "timer" + ":" + getTimer()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition" + "=" + (getEndPosition() != null ? !getEndPosition().equals(this)  ? getEndPosition().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
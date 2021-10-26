/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;
import java.util.*;

// line 255 "../../../../src/TestHarnessStateMachine.ump"
public class CourseX
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseX Attributes
  private List<String> logs;

  //CourseX State Machines
  public enum Status { Open }
  public enum StatusOpen { Null, white, green, black }
  public enum StatusOpenGreen { Null, greenStatus }
  public enum StatusOpenGreenGreenStatus { Null, greenStatusOn }
  private Status status;
  private StatusOpen statusOpen;
  private StatusOpenGreen statusOpenGreen;
  private StatusOpenGreenGreenStatus statusOpenGreenGreenStatus;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseX()
  {
    logs = new ArrayList<String>();
    setStatusOpen(StatusOpen.Null);
    setStatusOpenGreen(StatusOpenGreen.Null);
    setStatusOpenGreenGreenStatus(StatusOpenGreenGreenStatus.Null);
    setStatus(Status.Open);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addLog(String aLog)
  {
    boolean wasAdded = false;
    wasAdded = logs.add(aLog);
    return wasAdded;
  }

  public boolean removeLog(String aLog)
  {
    boolean wasRemoved = false;
    wasRemoved = logs.remove(aLog);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  public String getLog(int index)
  {
    String aLog = logs.get(index);
    return aLog;
  }

  public String[] getLogs()
  {
    String[] newLogs = logs.toArray(new String[logs.size()]);
    return newLogs;
  }

  public int numberOfLogs()
  {
    int number = logs.size();
    return number;
  }

  public boolean hasLogs()
  {
    boolean has = logs.size() > 0;
    return has;
  }

  public int indexOfLog(String aLog)
  {
    int index = logs.indexOf(aLog);
    return index;
  }

  public String getStatusFullName()
  {
    String answer = status.toString();
    if (statusOpen != StatusOpen.Null) { answer += "." + statusOpen.toString(); }
    if (statusOpenGreen != StatusOpenGreen.Null) { answer += "." + statusOpenGreen.toString(); }
    if (statusOpenGreenGreenStatus != StatusOpenGreenGreenStatus.Null) { answer += "." + statusOpenGreenGreenStatus.toString(); }
    if (statusOpenGreenGreenStatus != StatusOpenGreenGreenStatus.Null) { answer += "." + statusOpenGreenGreenStatus.toString(); }
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public StatusOpen getStatusOpen()
  {
    return statusOpen;
  }

  public StatusOpenGreen getStatusOpenGreen()
  {
    return statusOpenGreen;
  }

  public StatusOpenGreenGreenStatus getStatusOpenGreenGreenStatus()
  {
    return statusOpenGreenGreenStatus;
  }

  public boolean e()
  {
    boolean wasEventProcessed = false;
    
    StatusOpen aStatusOpen = statusOpen;
    switch (aStatusOpen)
    {
      case white:
        exitStatusOpen();
        setStatusOpen(StatusOpen.green);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean darken()
  {
    boolean wasEventProcessed = false;
    
    StatusOpen aStatusOpen = statusOpen;
    switch (aStatusOpen)
    {
      case green:
        exitStatusOpen();
        setStatusOpen(StatusOpen.black);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean e2()
  {
    boolean wasEventProcessed = false;
    
    StatusOpenGreen aStatusOpenGreen = statusOpenGreen;
    switch (aStatusOpenGreen)
    {
      case greenStatus:
        exitStatus();
        setStatus(Status.Open);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean check()
  {
    boolean wasEventProcessed = false;
    
    StatusOpenGreenGreenStatus aStatusOpenGreenGreenStatus = statusOpenGreenGreenStatus;
    switch (aStatusOpenGreenGreenStatus)
    {
      case greenStatusOn:
        exitStatusOpen();
        setStatusOpen(StatusOpen.white);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitStatus()
  {
    switch(status)
    {
      case Open:
        exitStatusOpen();
        break;
    }
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;

    // entry actions and do activities
    switch(status)
    {
      case Open:
        if (statusOpen == StatusOpen.Null) { setStatusOpen(StatusOpen.white); }
        break;
    }
  }

  private void exitStatusOpen()
  {
    switch(statusOpen)
    {
      case white:
        setStatusOpen(StatusOpen.Null);
        break;
      case green:
        exitStatusOpenGreen();
        setStatusOpen(StatusOpen.Null);
        break;
      case black:
        setStatusOpen(StatusOpen.Null);
        break;
    }
  }

  private void setStatusOpen(StatusOpen aStatusOpen)
  {
    statusOpen = aStatusOpen;
    if (status != Status.Open && aStatusOpen != StatusOpen.Null) { setStatus(Status.Open); }

    // entry actions and do activities
    switch(statusOpen)
    {
      case white:
        // line 261 "../../../../src/TestHarnessStateMachine.ump"
        addLog("White entry");
        break;
      case green:
        if (statusOpenGreen == StatusOpenGreen.Null) { setStatusOpenGreen(StatusOpenGreen.greenStatus); }
        break;
    }
  }

  private void exitStatusOpenGreen()
  {
    switch(statusOpenGreen)
    {
      case greenStatus:
        exitStatusOpenGreenGreenStatus();
        setStatusOpenGreen(StatusOpenGreen.Null);
        break;
    }
  }

  private void setStatusOpenGreen(StatusOpenGreen aStatusOpenGreen)
  {
    statusOpenGreen = aStatusOpenGreen;
    if (statusOpen != StatusOpen.green && aStatusOpenGreen != StatusOpenGreen.Null) { setStatusOpen(StatusOpen.green); }

    // entry actions and do activities
    switch(statusOpenGreen)
    {
      case greenStatus:
        if (statusOpenGreenGreenStatus == StatusOpenGreenGreenStatus.Null) { setStatusOpenGreenGreenStatus(StatusOpenGreenGreenStatus.greenStatusOn); }
        break;
    }
  }

  private void exitStatusOpenGreenGreenStatus()
  {
    switch(statusOpenGreenGreenStatus)
    {
      case greenStatusOn:
        setStatusOpenGreenGreenStatus(StatusOpenGreenGreenStatus.Null);
        break;
    }
  }

  private void setStatusOpenGreenGreenStatus(StatusOpenGreenGreenStatus aStatusOpenGreenGreenStatus)
  {
    statusOpenGreenGreenStatus = aStatusOpenGreenGreenStatus;
    if (statusOpenGreen != StatusOpenGreen.greenStatus && aStatusOpenGreenGreenStatus != StatusOpenGreenGreenStatus.Null) { setStatusOpenGreen(StatusOpenGreen.greenStatus); }

    // entry actions and do activities
    switch(statusOpenGreenGreenStatus)
    {
      case greenStatusOn:
        // line 268 "../../../../src/TestHarnessStateMachine.ump"
        addLog("GreenStatusOn Entry");
        break;
    }
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}
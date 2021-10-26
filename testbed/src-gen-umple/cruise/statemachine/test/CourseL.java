/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;
import java.util.*;

// line 99 "../../../../src/TestHarnessStateMachineJava.ump"
public class CourseL
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseL Attributes
  private List<String> logs;

  //CourseL State Machines
  public enum Status { On, Final }
  public enum StatusOnMotorIdle { Null, MotorIdle }
  public enum StatusOnFanIdle { Null, FanIdle }
  private Status status;
  private StatusOnMotorIdle statusOnMotorIdle;
  private StatusOnFanIdle statusOnFanIdle;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseL()
  {
    logs = new ArrayList<String>();
    setStatusOnMotorIdle(StatusOnMotorIdle.Null);
    setStatusOnFanIdle(StatusOnFanIdle.Null);
    setStatus(Status.On);
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
    if (statusOnMotorIdle != StatusOnMotorIdle.Null) { answer += "." + statusOnMotorIdle.toString(); }
    if (statusOnFanIdle != StatusOnFanIdle.Null) { answer += "." + statusOnFanIdle.toString(); }
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public StatusOnMotorIdle getStatusOnMotorIdle()
  {
    return statusOnMotorIdle;
  }

  public StatusOnFanIdle getStatusOnFanIdle()
  {
    return statusOnFanIdle;
  }

  public boolean flip()
  {
    boolean wasEventProcessed = false;
    
    StatusOnMotorIdle aStatusOnMotorIdle = statusOnMotorIdle;
    switch (aStatusOnMotorIdle)
    {
      case MotorIdle:
        exitStatus();
        setStatus(Status.Final);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean flop()
  {
    boolean wasEventProcessed = false;
    
    StatusOnFanIdle aStatusOnFanIdle = statusOnFanIdle;
    switch (aStatusOnFanIdle)
    {
      case FanIdle:
        exitStatus();
        setStatus(Status.Final);
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
      case On:
        exitStatusOnMotorIdle();
        exitStatusOnFanIdle();
        break;
    }
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;

    // entry actions and do activities
    switch(status)
    {
      case On:
        if (statusOnMotorIdle == StatusOnMotorIdle.Null) { setStatusOnMotorIdle(StatusOnMotorIdle.MotorIdle); }
        if (statusOnFanIdle == StatusOnFanIdle.Null) { setStatusOnFanIdle(StatusOnFanIdle.FanIdle); }
        break;
      case Final:
        delete();
        break;
    }
  }

  private void exitStatusOnMotorIdle()
  {
    switch(statusOnMotorIdle)
    {
      case MotorIdle:
        setStatusOnMotorIdle(StatusOnMotorIdle.Null);
        break;
    }
  }

  private void setStatusOnMotorIdle(StatusOnMotorIdle aStatusOnMotorIdle)
  {
    statusOnMotorIdle = aStatusOnMotorIdle;
    if (status != Status.On && aStatusOnMotorIdle != StatusOnMotorIdle.Null) { setStatus(Status.On); }
  }

  private void exitStatusOnFanIdle()
  {
    switch(statusOnFanIdle)
    {
      case FanIdle:
        setStatusOnFanIdle(StatusOnFanIdle.Null);
        break;
    }
  }

  private void setStatusOnFanIdle(StatusOnFanIdle aStatusOnFanIdle)
  {
    statusOnFanIdle = aStatusOnFanIdle;
    if (status != Status.On && aStatusOnFanIdle != StatusOnFanIdle.Null) { setStatus(Status.On); }
  }

  public void delete()
  {
    // line 123 "../../../../src/TestHarnessStateMachineJava.ump"
    addLog("deleted");
    // END OF UMPLE AFTER INJECTION
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}
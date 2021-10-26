/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 4 "../../../../src/TestHarnessStateMachineJava.ump"
public class CourseB
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseB Attributes
  private String log;

  //CourseB State Machines
  public enum Status { Open, Closed }
  private Status status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseB()
  {
    log = "initial value";
    setStatus(Status.Open);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLog(String aLog)
  {
    boolean wasSet = false;
    log = aLog;
    wasSet = true;
    return wasSet;
  }

  public String getLog()
  {
    return log;
  }

  public String getStatusFullName()
  {
    String answer = status.toString();
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public boolean anEvent()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Open:
        exitStatus();
        setStatus(Status.Closed);
        wasEventProcessed = true;
        break;
      case Closed:
        setStatus(Status.Open);
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
        // line 11 "../../../../src/TestHarnessStateMachineJava.ump"
        log = "exit called";
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
        // line 10 "../../../../src/TestHarnessStateMachineJava.ump"
        log = "entry called";
        break;
    }
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "log" + ":" + getLog()+ "]";
  }
}
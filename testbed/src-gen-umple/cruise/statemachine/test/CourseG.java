/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 59 "../../../../src/TestHarnessStateMachine.ump"
public class CourseG
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseG State Machines
  public enum Status { On, Off }
  public enum StatusOn { Null, Idle, Running }
  private Status status;
  private StatusOn statusOn;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseG()
  {
    setStatusOn(StatusOn.Null);
    setStatus(Status.On);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStatusFullName()
  {
    String answer = status.toString();
    if (statusOn != StatusOn.Null) { answer += "." + statusOn.toString(); }
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public StatusOn getStatusOn()
  {
    return statusOn;
  }

  public boolean turnOff()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case On:
        exitStatus();
        setStatus(Status.Off);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean flip()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    StatusOn aStatusOn = statusOn;
    switch (aStatus)
    {
      case Off:
        setStatusOn(StatusOn.Idle);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aStatusOn)
    {
      case Idle:
        exitStatusOn();
        setStatusOn(StatusOn.Running);
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
        exitStatusOn();
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
        if (statusOn == StatusOn.Null) { setStatusOn(StatusOn.Idle); }
        break;
    }
  }

  private void exitStatusOn()
  {
    switch(statusOn)
    {
      case Idle:
        setStatusOn(StatusOn.Null);
        break;
      case Running:
        setStatusOn(StatusOn.Null);
        break;
    }
  }

  private void setStatusOn(StatusOn aStatusOn)
  {
    statusOn = aStatusOn;
    if (status != Status.On && aStatusOn != StatusOn.Null) { setStatus(Status.On); }
  }

  public void delete()
  {}

}
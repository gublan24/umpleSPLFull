/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 112 "../../../../src/TestHarnessStateMachine.ump"
public class CourseI
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseI State Machines
  public enum Status { On, Off }
  public enum StatusOn { Null, Running }
  public enum StatusOnRunning { Null, Play }
  public enum StatusOff { Null, Idle, Full }
  private Status status;
  private StatusOn statusOn;
  private StatusOnRunning statusOnRunning;
  private StatusOff statusOff;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseI()
  {
    setStatusOn(StatusOn.Null);
    setStatusOnRunning(StatusOnRunning.Null);
    setStatusOff(StatusOff.Null);
    setStatus(Status.On);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStatusFullName()
  {
    String answer = status.toString();
    if (statusOn != StatusOn.Null) { answer += "." + statusOn.toString(); }
    if (statusOnRunning != StatusOnRunning.Null) { answer += "." + statusOnRunning.toString(); }
    if (statusOff != StatusOff.Null) { answer += "." + statusOff.toString(); }
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

  public StatusOnRunning getStatusOnRunning()
  {
    return statusOnRunning;
  }

  public StatusOff getStatusOff()
  {
    return statusOff;
  }

  public boolean flip()
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
      case Off:
        exitStatus();
        setStatus(Status.On);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean fill()
  {
    boolean wasEventProcessed = false;
    
    StatusOff aStatusOff = statusOff;
    switch (aStatusOff)
    {
      case Idle:
        exitStatusOff();
        setStatusOff(StatusOff.Full);
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
      case Off:
        exitStatusOff();
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
        if (statusOn == StatusOn.Null) { setStatusOn(StatusOn.Running); }
        break;
      case Off:
        if (statusOff == StatusOff.Null) { setStatusOff(StatusOff.Idle); }
        break;
    }
  }

  private void exitStatusOn()
  {
    switch(statusOn)
    {
      case Running:
        exitStatusOnRunning();
        setStatusOn(StatusOn.Null);
        break;
    }
  }

  private void setStatusOn(StatusOn aStatusOn)
  {
    statusOn = aStatusOn;
    if (status != Status.On && aStatusOn != StatusOn.Null) { setStatus(Status.On); }

    // entry actions and do activities
    switch(statusOn)
    {
      case Running:
        if (statusOnRunning == StatusOnRunning.Null) { setStatusOnRunning(StatusOnRunning.Play); }
        break;
    }
  }

  private void exitStatusOnRunning()
  {
    switch(statusOnRunning)
    {
      case Play:
        setStatusOnRunning(StatusOnRunning.Null);
        break;
    }
  }

  private void setStatusOnRunning(StatusOnRunning aStatusOnRunning)
  {
    statusOnRunning = aStatusOnRunning;
    if (statusOn != StatusOn.Running && aStatusOnRunning != StatusOnRunning.Null) { setStatusOn(StatusOn.Running); }
  }

  private void exitStatusOff()
  {
    switch(statusOff)
    {
      case Idle:
        setStatusOff(StatusOff.Null);
        break;
      case Full:
        setStatusOff(StatusOff.Null);
        break;
    }
  }

  private void setStatusOff(StatusOff aStatusOff)
  {
    statusOff = aStatusOff;
    if (status != Status.Off && aStatusOff != StatusOff.Null) { setStatus(Status.Off); }
  }

  public void delete()
  {}

}
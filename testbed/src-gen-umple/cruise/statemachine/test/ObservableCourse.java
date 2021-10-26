/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;
import java.util.Observable;

// line 310 "../../../../src/TestHarnessStateMachineJava.ump"
public class ObservableCourse extends Observable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ObservableCourse Attributes
  private String log;

  //ObservableCourse State Machines
  public enum Status { Open, Closed }
  private Status status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ObservableCourse()
  {
    super();
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
    // line 324 "../../../../src/TestHarnessStateMachineJava.ump"
    log = "before";
        setChanged();
        notifyObservers(status);
    // END OF UMPLE BEFORE INJECTION
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Open:
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

    // line 329 "../../../../src/TestHarnessStateMachineJava.ump"
    log = "after";
        setChanged();
        notifyObservers(status);
    // END OF UMPLE AFTER INJECTION
    return wasEventProcessed;
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "log" + ":" + getLog()+ "]";
  }
}
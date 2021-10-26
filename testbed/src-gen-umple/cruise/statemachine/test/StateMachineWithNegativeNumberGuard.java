/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 399 "../../../../src/TestHarnessStateMachineJava.ump"
public class StateMachineWithNegativeNumberGuard
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateMachineWithNegativeNumberGuard State Machines
  public enum Status { On, Off }
  private Status status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateMachineWithNegativeNumberGuard()
  {
    setStatus(Status.On);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStatusFullName()
  {
    String answer = status.toString();
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public boolean turnOff(Integer pn)
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case On:
        if (pn>-1)
        {
          setStatus(Status.Off);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean turnOn()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Off:
        setStatus(Status.On);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;
  }

  public void delete()
  {}

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;

// line 358 "../../../../src/TestHarnessTracerStateMachine.ump"
public class ConcurrentStmA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConcurrentStmA State Machines
  public enum Status { Off, On }
  public enum StatusOnMotorIdle { Null, MotorIdle, MotorRunning }
  public enum StatusOnFanIdle { Null, FanIdle, FanRunning }
  private Status status;
  private StatusOnMotorIdle statusOnMotorIdle;
  private StatusOnFanIdle statusOnFanIdle;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConcurrentStmA()
  {
    setStatusOnMotorIdle(StatusOnMotorIdle.Null);
    setStatusOnFanIdle(StatusOnFanIdle.Null);
    setStatus(Status.Off);
  }

  //------------------------
  // INTERFACE
  //------------------------

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

  public boolean turnOn()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Off:
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,394,ConcurrentStmA,"+System.identityHashCode(this)+",sm_t,Off,turnOn,On" );
        setStatus(Status.On);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean turnOff()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case On:
        exitStatus();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,394,ConcurrentStmA,"+System.identityHashCode(this)+",sm_t,On,turnOff,Off" );
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
    
    StatusOnMotorIdle aStatusOnMotorIdle = statusOnMotorIdle;
    switch (aStatusOnMotorIdle)
    {
      case MotorIdle:
        exitStatusOnMotorIdle();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,394,ConcurrentStmA,"+System.identityHashCode(this)+",sm_t,MotorIdle,flip,MotorRunning" );
        setStatusOnMotorIdle(StatusOnMotorIdle.MotorRunning);
        wasEventProcessed = true;
        break;
      case MotorRunning:
        exitStatusOnMotorIdle();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,394,ConcurrentStmA,"+System.identityHashCode(this)+",sm_t,MotorRunning,flip,MotorIdle" );
        setStatusOnMotorIdle(StatusOnMotorIdle.MotorIdle);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean flup()
  {
    boolean wasEventProcessed = false;
    
    StatusOnMotorIdle aStatusOnMotorIdle = statusOnMotorIdle;
    switch (aStatusOnMotorIdle)
    {
      case MotorIdle:
        exitStatus();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,394,ConcurrentStmA,"+System.identityHashCode(this)+",sm_t,MotorIdle,flup,Off" );
        setStatus(Status.Off);
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
        exitStatusOnFanIdle();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,394,ConcurrentStmA,"+System.identityHashCode(this)+",sm_t,FanIdle,flop,FanRunning" );
        setStatusOnFanIdle(StatusOnFanIdle.FanRunning);
        wasEventProcessed = true;
        break;
      case FanRunning:
        exitStatusOnFanIdle();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,394,ConcurrentStmA,"+System.identityHashCode(this)+",sm_t,FanRunning,flop,FanIdle" );
        setStatusOnFanIdle(StatusOnFanIdle.FanIdle);
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
    }
  }

  private void exitStatusOnMotorIdle()
  {
    switch(statusOnMotorIdle)
    {
      case MotorIdle:
        setStatusOnMotorIdle(StatusOnMotorIdle.Null);
        break;
      case MotorRunning:
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
      case FanRunning:
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
  {}

}
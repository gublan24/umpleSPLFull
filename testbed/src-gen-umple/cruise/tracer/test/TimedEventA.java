/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;
import java.util.*;

// line 397 "../../../../src/TestHarnessTracerStateMachine.ump"
public class TimedEventA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TimedEventA State Machines
  public enum Status { Open, Closed, Final }
  private Status status;

  //Helper Variables
  private TimedEventHandler timeoutOpenToClosedHandler;
  private TimedEventHandler timeoutClosedToFinalHandler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TimedEventA()
  {
    setStatus(Status.Open);
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

  public boolean timeoutOpenToClosed()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Open:
        exitStatus();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,407,TimedEventA,"+System.identityHashCode(this)+",sm_t,Open,timeoutOpenToClosed,Closed" );
        setStatus(Status.Closed);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean timeoutClosedToFinal()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Closed:
        exitStatus();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,407,TimedEventA,"+System.identityHashCode(this)+",sm_t,Closed,timeoutClosedToFinal,Final" );
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
      case Open:
        stopTimeoutOpenToClosedHandler();
        break;
      case Closed:
        stopTimeoutClosedToFinalHandler();
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
        startTimeoutOpenToClosedHandler();
        break;
      case Closed:
        startTimeoutClosedToFinalHandler();
        break;
      case Final:
        delete();
        break;
    }
  }

  private void startTimeoutOpenToClosedHandler()
  {
    timeoutOpenToClosedHandler = new TimedEventHandler(this,"timeoutOpenToClosed",0.000001);
  }

  private void stopTimeoutOpenToClosedHandler()
  {
    timeoutOpenToClosedHandler.stop();
  }

  private void startTimeoutClosedToFinalHandler()
  {
    timeoutClosedToFinalHandler = new TimedEventHandler(this,"timeoutClosedToFinal",0.000001);
  }

  private void stopTimeoutClosedToFinalHandler()
  {
    timeoutClosedToFinalHandler.stop();
  }

  public static class TimedEventHandler extends TimerTask  
  {
    private TimedEventA controller;
    private String timeoutMethodName;
    private double howLongInSeconds;
    private Timer timer;
    
    public TimedEventHandler(TimedEventA aController, String aTimeoutMethodName, double aHowLongInSeconds)
    {
      controller = aController;
      timeoutMethodName = aTimeoutMethodName;
      howLongInSeconds = aHowLongInSeconds;
      timer = new Timer();
      timer.schedule(this, (long)howLongInSeconds*1000);
    }
    
    public void stop()
    {
      timer.cancel();
    }
    
    public void run ()
    {
      if ("timeoutOpenToClosed".equals(timeoutMethodName))
      {
        boolean shouldRestart = !controller.timeoutOpenToClosed();
        if (shouldRestart)
        {
          controller.startTimeoutOpenToClosedHandler();
        }
        return;
      }
      if ("timeoutClosedToFinal".equals(timeoutMethodName))
      {
        boolean shouldRestart = !controller.timeoutClosedToFinal();
        if (shouldRestart)
        {
          controller.startTimeoutClosedToFinalHandler();
        }
        return;
      }
    }
  }

  public void delete()
  {}

}
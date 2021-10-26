/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;

// line 151 "../../../../src/TestHarnessTracerStateMachine.ump"
public class LightFixtureA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LightFixtureA State Machines
  public enum Status { Open, Closed }
  private Status status;

  //LightFixtureA Do Activity Threads
  Thread doActivityStatusClosedThread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LightFixtureA()
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

  public boolean flip()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Open:
        setStatus(Status.Closed);
        wasEventProcessed = true;
        break;
      case Closed:
        exitStatus();
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
      case Closed:
        if (doActivityStatusClosedThread != null) { doActivityStatusClosedThread.interrupt(); }
        break;
    }
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;

    // entry actions and do activities
    switch(status)
    {
      case Closed:
        doActivityStatusClosedThread = new DoActivityThread(this,"doActivityStatusClosed");
        break;
    }
  }

  private void doActivityStatusClosed()
  {
    try
    {
      // line 160 "../../../../src/TestHarnessTracerStateMachine.ump"
      Thread.sleep(400);
        measureClose();
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    LightFixtureA controller;
    String doActivityMethodName;
    
    public DoActivityThread(LightFixtureA aController,String aDoActivityMethodName)
    {
      controller = aController;
      doActivityMethodName = aDoActivityMethodName;
      start();
    }
    
    public void run()
    {
      if ("doActivityStatusClosed".equals(doActivityMethodName))
      {
        controller.doActivityStatusClosed();
      }
    }
  }

  public void delete()
  {}

  // line 170 "../../../../src/TestHarnessTracerStateMachine.ump"
  public void measureClose(){
    
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 254 "../../../../src/TestHarnessStateMachineJava.ump"
public class CourseVMultiDo
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseVMultiDo Attributes
  private int count;

  //CourseVMultiDo State Machines
  public enum Status { Off, On }
  private Status status;

  //CourseVMultiDo Do Activity Threads
  Thread doActivity0StatusOffThread = null;
  Thread doActivity1StatusOffThread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseVMultiDo()
  {
    count = 0;
    setStatus(Status.Off);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCount(int aCount)
  {
    boolean wasSet = false;
    count = aCount;
    wasSet = true;
    return wasSet;
  }

  public int getCount()
  {
    return count;
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

  private boolean __autotransition13__()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
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

  private void exitStatus()
  {
    switch(status)
    {
      case Off:
        if (doActivity0StatusOffThread != null) { doActivity0StatusOffThread.interrupt(); }
        if (doActivity1StatusOffThread != null) { doActivity1StatusOffThread.interrupt(); }
        break;
    }
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;

    // entry actions and do activities
    switch(status)
    {
      case Off:
        doActivity0StatusOffThread = new DoActivityThread(this,"doActivity0StatusOff");
        doActivity1StatusOffThread = new DoActivityThread(this,"doActivity1StatusOff");
        break;
    }
  }

  private void doActivity0StatusOff()
  {
    try
    {
      // line 260 "../../../../src/TestHarnessStateMachineJava.ump"
      doX();
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private void doActivity1StatusOff()
  {
    try
    {
      // line 261 "../../../../src/TestHarnessStateMachineJava.ump"
      doX();
      Thread.sleep(1);
      doActivity0StatusOffThread.join();
      __autotransition13__();
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    CourseVMultiDo controller;
    String doActivityMethodName;
    
    public DoActivityThread(CourseVMultiDo aController,String aDoActivityMethodName)
    {
      controller = aController;
      doActivityMethodName = aDoActivityMethodName;
      start();
    }
    
    public void run()
    {
      if ("doActivity0StatusOff".equals(doActivityMethodName))
      {
        controller.doActivity0StatusOff();
      }
        else if ("doActivity1StatusOff".equals(doActivityMethodName))
      {
        controller.doActivity1StatusOff();
      }
    }
  }

  public void delete()
  {}

  // line 268 "../../../../src/TestHarnessStateMachineJava.ump"
   public void doX(){
    count += 1;
  }


  public String toString()
  {
    return super.toString() + "["+
            "count" + ":" + getCount()+ "]";
  }
}
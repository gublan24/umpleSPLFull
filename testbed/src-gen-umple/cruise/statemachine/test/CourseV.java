/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 197 "../../../../src/TestHarnessStateMachineJava.ump"
public class CourseV
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseV Attributes
  private int count;

  //CourseV State Machines
  public enum Status { Off, On }
  private Status status;

  //CourseV Do Activity Threads
  Thread doActivityStatusOffThread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseV()
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

  private boolean __autotransition12__()
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
        if (doActivityStatusOffThread != null) { doActivityStatusOffThread.interrupt(); }
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
        doActivityStatusOffThread = new DoActivityThread(this,"doActivityStatusOff");
        break;
    }
  }

  private void doActivityStatusOff()
  {
    try
    {
      // line 203 "../../../../src/TestHarnessStateMachineJava.ump"
      doX();
      Thread.sleep(1);
      __autotransition12__();
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    CourseV controller;
    String doActivityMethodName;
    
    public DoActivityThread(CourseV aController,String aDoActivityMethodName)
    {
      controller = aController;
      doActivityMethodName = aDoActivityMethodName;
      start();
    }
    
    public void run()
    {
      if ("doActivityStatusOff".equals(doActivityMethodName))
      {
        controller.doActivityStatusOff();
      }
    }
  }

  public void delete()
  {}

  // line 209 "../../../../src/TestHarnessStateMachineJava.ump"
   public void doX(){
    count += 1;
  }


  public String toString()
  {
    return super.toString() + "["+
            "count" + ":" + getCount()+ "]";
  }
}
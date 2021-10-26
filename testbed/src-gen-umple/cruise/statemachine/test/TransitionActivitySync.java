/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 273 "../../../../src/TestHarnessStateMachineJava.ump"
public class TransitionActivitySync
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TransitionActivitySync Attributes
  private String list;

  //TransitionActivitySync State Machines
  public enum Status { Off, On }
  private Status status;

  //TransitionActivitySync Do Activity Threads
  Thread doActivity0StatusOffThread = null;
  Thread doActivity1StatusOffThread = null;
  Thread doActivityStatusOnThread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TransitionActivitySync()
  {
    list = "";
    setStatus(Status.Off);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setList(String aList)
  {
    boolean wasSet = false;
    list = aList;
    wasSet = true;
    return wasSet;
  }

  public String getList()
  {
    return list;
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

  private boolean __autotransition14__()
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
      case On:
        if (doActivityStatusOnThread != null) { doActivityStatusOnThread.interrupt(); }
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
      case On:
        doActivityStatusOnThread = new DoActivityThread(this,"doActivityStatusOn");
        break;
    }
  }

  private void doActivity0StatusOff()
  {
    try
    {
      // line 278 "../../../../src/TestHarnessStateMachineJava.ump"
      Thread.sleep(500);
        list += "2, ";
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
      // line 283 "../../../../src/TestHarnessStateMachineJava.ump"
      list += "[1, ";
      Thread.sleep(1);
      doActivity0StatusOffThread.join();
      __autotransition14__();
    }
    catch (InterruptedException e)
    {

    }
  }

  private void doActivityStatusOn()
  {
    try
    {
      // line 286 "../../../../src/TestHarnessStateMachineJava.ump"
      list += "3]";
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    TransitionActivitySync controller;
    String doActivityMethodName;
    
    public DoActivityThread(TransitionActivitySync aController,String aDoActivityMethodName)
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
        else if ("doActivityStatusOn".equals(doActivityMethodName))
      {
        controller.doActivityStatusOn();
      }
    }
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "list" + ":" + getList()+ "]";
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;
import java.util.*;

// line 228 "../../../../src/TestHarnessStateMachineJava.ump"
public class MultiLogCourse
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MultiLogCourse Attributes
  private List<String> logs;

  //MultiLogCourse State Machines
  public enum Status { Open, Closed }
  private Status status;

  //MultiLogCourse Do Activity Threads
  Thread doActivity0StatusClosedThread = null;
  Thread doActivity1StatusClosedThread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MultiLogCourse()
  {
    logs = new ArrayList<String>();
    setStatus(Status.Open);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addLog(String aLog)
  {
    boolean wasAdded = false;
    wasAdded = logs.add(aLog);
    return wasAdded;
  }

  public boolean removeLog(String aLog)
  {
    boolean wasRemoved = false;
    wasRemoved = logs.remove(aLog);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  public String getLog(int index)
  {
    String aLog = logs.get(index);
    return aLog;
  }

  public String[] getLogs()
  {
    String[] newLogs = logs.toArray(new String[logs.size()]);
    return newLogs;
  }

  public int numberOfLogs()
  {
    int number = logs.size();
    return number;
  }

  public boolean hasLogs()
  {
    boolean has = logs.size() > 0;
    return has;
  }

  public int indexOfLog(String aLog)
  {
    int index = logs.indexOf(aLog);
    return index;
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
        if (doActivity0StatusClosedThread != null) { doActivity0StatusClosedThread.interrupt(); }
        if (doActivity1StatusClosedThread != null) { doActivity1StatusClosedThread.interrupt(); }
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
        // line 234 "../../../../src/TestHarnessStateMachineJava.ump"
        addLog("Open Entry");
        break;
      case Closed:
        // line 238 "../../../../src/TestHarnessStateMachineJava.ump"
        addLog("Closed Entry");
        doActivity0StatusClosedThread = new DoActivityThread(this,"doActivity0StatusClosed");
        doActivity1StatusClosedThread = new DoActivityThread(this,"doActivity1StatusClosed");
        break;
    }
  }

  private void doActivity0StatusClosed()
  {
    try
    {
      // line 240 "../../../../src/TestHarnessStateMachineJava.ump"
      Thread.sleep(400);
        addLog("Do Activity On Closed Thread1");
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private void doActivity1StatusClosed()
  {
    try
    {
      // line 245 "../../../../src/TestHarnessStateMachineJava.ump"
      Thread.sleep(500);
        addLog("Do Activity On Closed Thread2");
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    MultiLogCourse controller;
    String doActivityMethodName;
    
    public DoActivityThread(MultiLogCourse aController,String aDoActivityMethodName)
    {
      controller = aController;
      doActivityMethodName = aDoActivityMethodName;
      start();
    }
    
    public void run()
    {
      if ("doActivity0StatusClosed".equals(doActivityMethodName))
      {
        controller.doActivity0StatusClosed();
      }
        else if ("doActivity1StatusClosed".equals(doActivityMethodName))
      {
        controller.doActivity1StatusClosed();
      }
    }
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}
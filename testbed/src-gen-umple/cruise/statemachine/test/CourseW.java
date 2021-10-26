/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;
import java.util.*;

// line 214 "../../../../src/TestHarnessStateMachineJava.ump"
public class CourseW
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseW Attributes
  private List<String> logs;

  //CourseW State Machines
  public enum Status { Open }
  public enum StatusOpen { Null, statusOpen }
  private Status status;
  private StatusOpen statusOpen;

  //CourseW Do Activity Threads
  Thread doActivityStatusOpenStatusOpenThread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseW()
  {
    logs = new ArrayList<String>();
    setStatusOpen(StatusOpen.Null);
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
    if (statusOpen != StatusOpen.Null) { answer += "." + statusOpen.toString(); }
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public StatusOpen getStatusOpen()
  {
    return statusOpen;
  }

  private void exitStatus()
  {
    switch(status)
    {
      case Open:
        exitStatusOpen();
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
        if (statusOpen == StatusOpen.Null) { setStatusOpen(StatusOpen.statusOpen); }
        break;
    }
  }

  private void exitStatusOpen()
  {
    switch(statusOpen)
    {
      case statusOpen:
        if (doActivityStatusOpenStatusOpenThread != null) { doActivityStatusOpenStatusOpenThread.interrupt(); }
        setStatusOpen(StatusOpen.Null);
        break;
    }
  }

  private void setStatusOpen(StatusOpen aStatusOpen)
  {
    statusOpen = aStatusOpen;
    if (status != Status.Open && aStatusOpen != StatusOpen.Null) { setStatus(Status.Open); }

    // entry actions and do activities
    switch(statusOpen)
    {
      case statusOpen:
        doActivityStatusOpenStatusOpenThread = new DoActivityThread(this,"doActivityStatusOpenStatusOpen");
        break;
    }
  }

  private void doActivityStatusOpenStatusOpen()
  {
    try
    {
      // line 220 "../../../../src/TestHarnessStateMachineJava.ump"
      addLog("DoActivity in nested state");
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    CourseW controller;
    String doActivityMethodName;
    
    public DoActivityThread(CourseW aController,String aDoActivityMethodName)
    {
      controller = aController;
      doActivityMethodName = aDoActivityMethodName;
      start();
    }
    
    public void run()
    {
      if ("doActivityStatusOpenStatusOpen".equals(doActivityMethodName))
      {
        controller.doActivityStatusOpenStatusOpen();
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
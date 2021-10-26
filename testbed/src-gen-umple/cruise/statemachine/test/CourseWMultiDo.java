/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;
import java.util.*;

// line 291 "../../../../src/TestHarnessStateMachineJava.ump"
public class CourseWMultiDo
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseWMultiDo Attributes
  private List<String> logs;

  //CourseWMultiDo State Machines
  public enum Status { Open }
  public enum StatusOpen { Null, statusOpen }
  private Status status;
  private StatusOpen statusOpen;

  //CourseWMultiDo Do Activity Threads
  Thread doActivity0StatusOpenStatusOpenThread = null;
  Thread doActivity1StatusOpenStatusOpenThread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseWMultiDo()
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
        if (doActivity0StatusOpenStatusOpenThread != null) { doActivity0StatusOpenStatusOpenThread.interrupt(); }
        if (doActivity1StatusOpenStatusOpenThread != null) { doActivity1StatusOpenStatusOpenThread.interrupt(); }
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
        doActivity0StatusOpenStatusOpenThread = new DoActivityThread(this,"doActivity0StatusOpenStatusOpen");
        doActivity1StatusOpenStatusOpenThread = new DoActivityThread(this,"doActivity1StatusOpenStatusOpen");
        break;
    }
  }

  private void doActivity0StatusOpenStatusOpen()
  {
    try
    {
      // line 297 "../../../../src/TestHarnessStateMachineJava.ump"
      addLog("DoActivity in nested state Thread1");
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private void doActivity1StatusOpenStatusOpen()
  {
    try
    {
      // line 300 "../../../../src/TestHarnessStateMachineJava.ump"
      Thread.sleep(500);
          addLog("DoActivity in nested state Thread2");
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    CourseWMultiDo controller;
    String doActivityMethodName;
    
    public DoActivityThread(CourseWMultiDo aController,String aDoActivityMethodName)
    {
      controller = aController;
      doActivityMethodName = aDoActivityMethodName;
      start();
    }
    
    public void run()
    {
      if ("doActivity0StatusOpenStatusOpen".equals(doActivityMethodName))
      {
        controller.doActivity0StatusOpenStatusOpen();
      }
        else if ("doActivity1StatusOpenStatusOpen".equals(doActivityMethodName))
      {
        controller.doActivity1StatusOpenStatusOpen();
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
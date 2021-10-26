/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;
import java.util.*;

// line 279 "../../../../src/TestHarnessStateMachine.ump"
public class CourseY
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseY Attributes
  private List<String> logs;

  //CourseY State Machines
  public enum StateMachine1 { topLevel }
  public enum StateMachine1TopLevel { Null, thread1 }
  private StateMachine1 stateMachine1;
  private StateMachine1TopLevel stateMachine1TopLevel;

  //CourseY Do Activity Threads
  Thread doActivityStateMachine1TopLevelThread1Thread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseY()
  {
    logs = new ArrayList<String>();
    setStateMachine1TopLevel(StateMachine1TopLevel.Null);
    setStateMachine1(StateMachine1.topLevel);
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

  public String getStateMachine1FullName()
  {
    String answer = stateMachine1.toString();
    if (stateMachine1TopLevel != StateMachine1TopLevel.Null) { answer += "." + stateMachine1TopLevel.toString(); }
    return answer;
  }

  public StateMachine1 getStateMachine1()
  {
    return stateMachine1;
  }

  public StateMachine1TopLevel getStateMachine1TopLevel()
  {
    return stateMachine1TopLevel;
  }

  private void exitStateMachine1()
  {
    switch(stateMachine1)
    {
      case topLevel:
        exitStateMachine1TopLevel();
        break;
    }
  }

  private void setStateMachine1(StateMachine1 aStateMachine1)
  {
    stateMachine1 = aStateMachine1;

    // entry actions and do activities
    switch(stateMachine1)
    {
      case topLevel:
        if (stateMachine1TopLevel == StateMachine1TopLevel.Null) { setStateMachine1TopLevel(StateMachine1TopLevel.thread1); }
        break;
    }
  }

  private void exitStateMachine1TopLevel()
  {
    switch(stateMachine1TopLevel)
    {
      case thread1:
        if (doActivityStateMachine1TopLevelThread1Thread != null) { doActivityStateMachine1TopLevelThread1Thread.interrupt(); }
        setStateMachine1TopLevel(StateMachine1TopLevel.Null);
        break;
    }
  }

  private void setStateMachine1TopLevel(StateMachine1TopLevel aStateMachine1TopLevel)
  {
    stateMachine1TopLevel = aStateMachine1TopLevel;
    if (stateMachine1 != StateMachine1.topLevel && aStateMachine1TopLevel != StateMachine1TopLevel.Null) { setStateMachine1(StateMachine1.topLevel); }

    // entry actions and do activities
    switch(stateMachine1TopLevel)
    {
      case thread1:
        doActivityStateMachine1TopLevelThread1Thread = new DoActivityThread(this,"doActivityStateMachine1TopLevelThread1");
        break;
    }
  }

  private void doActivityStateMachine1TopLevelThread1()
  {
    try
    {
      // line 282 "../../../../src/TestHarnessStateMachine.ump"
      addLog("Active entry");
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    CourseY controller;
    String doActivityMethodName;
    
    public DoActivityThread(CourseY aController,String aDoActivityMethodName)
    {
      controller = aController;
      doActivityMethodName = aDoActivityMethodName;
      start();
    }
    
    public void run()
    {
      if ("doActivityStateMachine1TopLevelThread1".equals(doActivityMethodName))
      {
        controller.doActivityStateMachine1TopLevelThread1();
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
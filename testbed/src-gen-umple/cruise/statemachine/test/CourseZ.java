/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 287 "../../../../src/TestHarnessStateMachine.ump"
public class CourseZ
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseZ Attributes
  private String logFirstActive;
  private String logSecondActive;

  //CourseZ State Machines
  public enum StateMachine1 { topLevel }
  public enum StateMachine1TopLevel { Null, thread1 }
  private StateMachine1 stateMachine1;
  private StateMachine1TopLevel stateMachine1TopLevel;
  public enum StateMachine2 { topLevel }
  public enum StateMachine2TopLevel { Null, thread1 }
  private StateMachine2 stateMachine2;
  private StateMachine2TopLevel stateMachine2TopLevel;

  //CourseZ Do Activity Threads
  Thread doActivityStateMachine1TopLevelThread1Thread = null;
  Thread doActivityStateMachine2TopLevelThread1Thread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseZ()
  {
    logFirstActive = "";
    logSecondActive = "";
    setStateMachine1TopLevel(StateMachine1TopLevel.Null);
    setStateMachine1(StateMachine1.topLevel);
    setStateMachine2TopLevel(StateMachine2TopLevel.Null);
    setStateMachine2(StateMachine2.topLevel);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLogFirstActive(String aLogFirstActive)
  {
    boolean wasSet = false;
    logFirstActive = aLogFirstActive;
    wasSet = true;
    return wasSet;
  }

  public boolean setLogSecondActive(String aLogSecondActive)
  {
    boolean wasSet = false;
    logSecondActive = aLogSecondActive;
    wasSet = true;
    return wasSet;
  }

  public String getLogFirstActive()
  {
    return logFirstActive;
  }

  public String getLogSecondActive()
  {
    return logSecondActive;
  }

  public String getStateMachine1FullName()
  {
    String answer = stateMachine1.toString();
    if (stateMachine1TopLevel != StateMachine1TopLevel.Null) { answer += "." + stateMachine1TopLevel.toString(); }
    return answer;
  }

  public String getStateMachine2FullName()
  {
    String answer = stateMachine2.toString();
    if (stateMachine2TopLevel != StateMachine2TopLevel.Null) { answer += "." + stateMachine2TopLevel.toString(); }
    return answer;
  }

  public StateMachine1 getStateMachine1()
  {
    return stateMachine1;
  }

  public StateMachine2 getStateMachine2()
  {
    return stateMachine2;
  }

  public StateMachine1TopLevel getStateMachine1TopLevel()
  {
    return stateMachine1TopLevel;
  }

  public StateMachine2TopLevel getStateMachine2TopLevel()
  {
    return stateMachine2TopLevel;
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

  private void exitStateMachine2()
  {
    switch(stateMachine2)
    {
      case topLevel:
        exitStateMachine2TopLevel();
        break;
    }
  }

  private void setStateMachine2(StateMachine2 aStateMachine2)
  {
    stateMachine2 = aStateMachine2;

    // entry actions and do activities
    switch(stateMachine2)
    {
      case topLevel:
        if (stateMachine2TopLevel == StateMachine2TopLevel.Null) { setStateMachine2TopLevel(StateMachine2TopLevel.thread1); }
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

  private void exitStateMachine2TopLevel()
  {
    switch(stateMachine2TopLevel)
    {
      case thread1:
        if (doActivityStateMachine2TopLevelThread1Thread != null) { doActivityStateMachine2TopLevelThread1Thread.interrupt(); }
        setStateMachine2TopLevel(StateMachine2TopLevel.Null);
        break;
    }
  }

  private void setStateMachine2TopLevel(StateMachine2TopLevel aStateMachine2TopLevel)
  {
    stateMachine2TopLevel = aStateMachine2TopLevel;
    if (stateMachine2 != StateMachine2.topLevel && aStateMachine2TopLevel != StateMachine2TopLevel.Null) { setStateMachine2(StateMachine2.topLevel); }

    // entry actions and do activities
    switch(stateMachine2TopLevel)
    {
      case thread1:
        doActivityStateMachine2TopLevelThread1Thread = new DoActivityThread(this,"doActivityStateMachine2TopLevelThread1");
        break;
    }
  }

  private void doActivityStateMachine1TopLevelThread1()
  {
    try
    {
      // line 291 "../../../../src/TestHarnessStateMachine.ump"
      logFirstActive = "First active";
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private void doActivityStateMachine2TopLevelThread1()
  {
    try
    {
      // line 295 "../../../../src/TestHarnessStateMachine.ump"
      logSecondActive = "Second active";
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    CourseZ controller;
    String doActivityMethodName;
    
    public DoActivityThread(CourseZ aController,String aDoActivityMethodName)
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
        else if ("doActivityStateMachine2TopLevelThread1".equals(doActivityMethodName))
      {
        controller.doActivityStateMachine2TopLevelThread1();
      }
    }
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "logFirstActive" + ":" + getLogFirstActive()+ "," +
            "logSecondActive" + ":" + getLogSecondActive()+ "]";
  }
}
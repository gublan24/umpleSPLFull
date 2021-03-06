/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.queued.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 328 "../../../../../src/TestHarnessQueuedStateMachine.ump"
public class QueuedSM_timedTransition_2 implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //QueuedSM_timedTransition_2 Attributes
  private String log;

  //QueuedSM_timedTransition_2 State Machines
  public enum Sm { s0, s1, s2, s3, s4 }
  private Sm sm;
  
  //enumeration type of messages accepted by QueuedSM_timedTransition_2
  protected enum MessageType { ev0_M, timeouts1Tos2_M, ev1_M, ev2_M, ev3_M }
  
  MessageQueue queue;
  Thread removal;

  //Helper Variables
  private TimedEventHandler timeouts1Tos2Handler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public QueuedSM_timedTransition_2()
  {
    log = "initial value";
    setSm(Sm.s0);
    queue = new MessageQueue();
    removal=new Thread(this);
    //start the thread of QueuedSM_timedTransition_2
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLog(String aLog)
  {
    boolean wasSet = false;
    log = aLog;
    wasSet = true;
    return wasSet;
  }

  public String getLog()
  {
    return log;
  }

  public String getSmFullName()
  {
    String answer = sm.toString();
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  public boolean _ev0()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s0:
        setSm(Sm.s1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _timeouts1Tos2()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s1:
        exitSm();
        setSm(Sm.s2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _ev1()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s1:
        exitSm();
        setSm(Sm.s3);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _ev2()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s2:
        setSm(Sm.s4);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _ev3()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s3:
        setSm(Sm.s4);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitSm()
  {
    switch(sm)
    {
      case s1:
        stopTimeouts1Tos2Handler();
        break;
    }
  }

  private void setSm(Sm aSm)
  {
    sm = aSm;

    // entry actions and do activities
    switch(sm)
    {
      case s0:
        // line 332 "../../../../../src/TestHarnessQueuedStateMachine.ump"
        log = "running";
        break;
      case s1:
        startTimeouts1Tos2Handler();
        break;
    }
  }

  private void startTimeouts1Tos2Handler()
  {
    timeouts1Tos2Handler = new TimedEventHandler(this,"timeouts1Tos2",2);
  }

  private void stopTimeouts1Tos2Handler()
  {
    timeouts1Tos2Handler.stop();
  }

  public static class TimedEventHandler extends TimerTask  
  {
    private QueuedSM_timedTransition_2 controller;
    private String timeoutMethodName;
    private double howLongInSeconds;
    private Timer timer;
    
    public TimedEventHandler(QueuedSM_timedTransition_2 aController, String aTimeoutMethodName, double aHowLongInSeconds)
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
      if ("timeouts1Tos2".equals(timeoutMethodName))
      {
        boolean shouldRestart = !controller.timeouts1Tos2();
        if (shouldRestart)
        {
          controller.startTimeouts1Tos2Handler();
        }
        return;
      }
    }
  }

  public void delete()
  {
    removal.interrupt();
  }

  protected class Message
  {
    MessageType type;
    
    //Message parameters
    Vector<Object> param;
    
    public Message(MessageType t, Vector<Object> p)
    {
      type = t; 
      param = p;
    }

    @Override
    public String toString()
    {
      return type + "," + param;
    }
  }
  
  protected class MessageQueue {
    Queue<Message> messages = new LinkedList<Message>();
    
    public synchronized void put(Message m)
    {
      messages.add(m); 
      notify();
    }

    public synchronized Message getNext()
    {
      try {
        while (messages.isEmpty()) 
        {
          wait();
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        return null;
      }

      //The element to be removed
      Message m = messages.remove(); 
      return (m);
    }
  }

  //------------------------------
  //messages accepted 
  //------------------------------

  public void ev0 ()
  {
    queue.put(new Message(MessageType.ev0_M, null));
  }

  public boolean timeouts1Tos2 ()
  {
    boolean wasAdded = false;
    queue.put(new Message(MessageType.timeouts1Tos2_M, null));
    wasAdded = true;
    return wasAdded;
  }

  public void ev1 ()
  {
    queue.put(new Message(MessageType.ev1_M, null));
  }

  public void ev2 ()
  {
    queue.put(new Message(MessageType.ev2_M, null));
  }

  public void ev3 ()
  {
    queue.put(new Message(MessageType.ev3_M, null));
  }

  
  @Override
  public void run ()
  {
    boolean status=false;
    while (true) 
    {
      Message m = queue.getNext();
      if(m == null)  return;
      
      switch (m.type)
      {
        case ev0_M:
          status = _ev0();
          break;
        case timeouts1Tos2_M:
          status = _timeouts1Tos2();
          break;
        case ev1_M:
          status = _ev1();
          break;
        case ev2_M:
          status = _ev2();
          break;
        case ev3_M:
          status = _ev3();
          break; 
        default:
      }
      if(!status)
      {
        // Error message is written or  exception is raised
      }
    }
  }

  public String toString()
  {
    return super.toString() + "["+
            "log" + ":" + getLog()+ "]";
  }
}
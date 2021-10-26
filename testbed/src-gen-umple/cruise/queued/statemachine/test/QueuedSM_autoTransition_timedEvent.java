/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.queued.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 56 "../../../../../src/TestHarnessQueuedStateMachine.ump"
public class QueuedSM_autoTransition_timedEvent implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //QueuedSM_autoTransition_timedEvent State Machines
  public enum Sm { s1, s2, s3 }
  private Sm sm;
  
  //enumeration type of messages accepted by QueuedSM_autoTransition_timedEvent
  protected enum MessageType { timeouts2Tos3_M }
  
  MessageQueue queue;
  Thread removal;

  //Helper Variables
  private TimedEventHandler timeouts2Tos3Handler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public QueuedSM_autoTransition_timedEvent()
  {
    setSm(Sm.s1);
    queue = new MessageQueue();
    removal=new Thread(this);
    //start the thread of QueuedSM_autoTransition_timedEvent
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSmFullName()
  {
    String answer = sm.toString();
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  private boolean __autotransition6__()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s1:
        setSm(Sm.s2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _timeouts2Tos3()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s2:
        exitSm();
        setSm(Sm.s3);
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
      case s2:
        stopTimeouts2Tos3Handler();
        break;
    }
  }

  private void setSm(Sm aSm)
  {
    sm = aSm;

    // entry actions and do activities
    switch(sm)
    {
      case s1:
        __autotransition6__();
        break;
      case s2:
        startTimeouts2Tos3Handler();
        break;
    }
  }

  private void startTimeouts2Tos3Handler()
  {
    timeouts2Tos3Handler = new TimedEventHandler(this,"timeouts2Tos3",2);
  }

  private void stopTimeouts2Tos3Handler()
  {
    timeouts2Tos3Handler.stop();
  }

  public static class TimedEventHandler extends TimerTask  
  {
    private QueuedSM_autoTransition_timedEvent controller;
    private String timeoutMethodName;
    private double howLongInSeconds;
    private Timer timer;
    
    public TimedEventHandler(QueuedSM_autoTransition_timedEvent aController, String aTimeoutMethodName, double aHowLongInSeconds)
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
      if ("timeouts2Tos3".equals(timeoutMethodName))
      {
        boolean shouldRestart = !controller.timeouts2Tos3();
        if (shouldRestart)
        {
          controller.startTimeouts2Tos3Handler();
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

  public boolean timeouts2Tos3 ()
  {
    boolean wasAdded = false;
    queue.put(new Message(MessageType.timeouts2Tos3_M, null));
    wasAdded = true;
    return wasAdded;
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
        case timeouts2Tos3_M:
          status = _timeouts2Tos3();
          break; 
        default:
      }
      if(!status)
      {
        // Error message is written or  exception is raised
      }
    }
  }
}
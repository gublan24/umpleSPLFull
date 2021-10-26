/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.queued.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 33 "../../../../../src/TestHarnessQueuedStateMachine.ump"
public class QueuedSM_timedEvent implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //QueuedSM_timedEvent Attributes
  private int timer;

  //QueuedSM_timedEvent State Machines
  public enum Status { s1, s2 }
  private Status status;
  
  //enumeration type of messages accepted by QueuedSM_timedEvent
  protected enum MessageType { timeouts1Tos2_M }
  
  MessageQueue queue;
  Thread removal;

  //Helper Variables
  private TimedEventHandler timeouts1Tos2Handler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public QueuedSM_timedEvent()
  {
    timer = 3;
    setStatus(Status.s1);
    queue = new MessageQueue();
    removal=new Thread(this);
    //start the thread of QueuedSM_timedEvent
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTimer(int aTimer)
  {
    boolean wasSet = false;
    timer = aTimer;
    wasSet = true;
    return wasSet;
  }

  public int getTimer()
  {
    return timer;
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

  public boolean _timeouts1Tos2()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case s1:
        exitStatus();
        setStatus(Status.s2);
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
      case s1:
        stopTimeouts1Tos2Handler();
        break;
    }
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;

    // entry actions and do activities
    switch(status)
    {
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
    private QueuedSM_timedEvent controller;
    private String timeoutMethodName;
    private double howLongInSeconds;
    private Timer timer;
    
    public TimedEventHandler(QueuedSM_timedEvent aController, String aTimeoutMethodName, double aHowLongInSeconds)
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

  public boolean timeouts1Tos2 ()
  {
    boolean wasAdded = false;
    queue.put(new Message(MessageType.timeouts1Tos2_M, null));
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
        case timeouts1Tos2_M:
          status = _timeouts1Tos2();
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
            "timer" + ":" + getTimer()+ "]";
  }
}
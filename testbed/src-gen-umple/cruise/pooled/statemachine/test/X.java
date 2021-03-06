/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.pooled.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 60 "../../../../../src/TestHarnessPooledStateMachine.ump"
public class X implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X State Machines
  public enum Sm { s1, s2, s3 }
  private Sm sm;
  
  MessagePool pool;
  Thread removal;
  
  //enumeration type of messages accepted by X
  protected enum MessageType { timeouts2Tos3_M, null_M }

  // Map for a X pooled state machine that allows querying which events are possible in each map

  public static final Map<Object, HashSet<MessageType>> stateMessageMap = new HashMap<Object, HashSet<MessageType>>();
  static {
    stateMessageMap.put(Sm.s1,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(Sm.s2,new HashSet<MessageType>(Arrays.asList(MessageType.timeouts2Tos3_M)));
    stateMessageMap.put(Sm.s3,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
  }

  //Helper Variables
  private TimedEventHandler timeouts2Tos3Handler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X()
  {
    setSm(Sm.s1);
    pool = new MessagePool();
    removal=new Thread(this);
    //start the thread of X
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

  private boolean __autotransition3__()
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
        __autotransition3__();
        break;
      case s2:
        startTimeouts2Tos3Handler();
        break;
    }
  }

  private void startTimeouts2Tos3Handler()
  {
    timeouts2Tos3Handler = new TimedEventHandler(this,"timeouts2Tos3",3);
  }

  private void stopTimeouts2Tos3Handler()
  {
    timeouts2Tos3Handler.stop();
  }

  public static class TimedEventHandler extends TimerTask  
  {
    private X controller;
    private String timeoutMethodName;
    private double howLongInSeconds;
    private Timer timer;
    
    public TimedEventHandler(X aController, String aTimeoutMethodName, double aHowLongInSeconds)
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
  
  protected class MessagePool {
    Queue<Message> messages = new LinkedList<Message>();
    
    public synchronized void put(Message m)
    {
      messages.add(m); 
      notify();
    }

    public synchronized Message getNext()
    {
      Message message=null;

      try {
        message=getNextProcessableMessage();
        while (message==null)
        {
          wait();
          message=getNextProcessableMessage();
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        return null;
      }

      // return the message
      return (message);
    }

    public Message getNextProcessableMessage()
    {
      // Iterate through messages and remove the first message that matches one of the Messages list
      // otherwise return null
      for (Message msg: messages)
      {
        if(stateMessageMap.get(getSm()).contains(msg.type))
        {
          //The element to be removed
          messages.remove(msg);
          return (msg);
        }
      }
      return null;
    }
  }

  //------------------------------
  //messages accepted 
  //------------------------------

  public boolean timeouts2Tos3 ()
  {
    boolean wasAdded = false;
    pool.put(new Message(MessageType.timeouts2Tos3_M, null));
    wasAdded = true;
    return wasAdded;
  }

  
  @Override
  public void run ()
  {
    boolean status=false;
    while (true) 
    {
      Message m = pool.getNext();
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
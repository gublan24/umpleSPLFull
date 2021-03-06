/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.pooled.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 48 "../../../../../src/TestHarnessPooledStateMachine.ump"
public class Mentor implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Mentor Attributes
  private int howLongUntilOk;

  //Mentor State Machines
  public enum Status { Ok, NotOk }
  private Status status;
  
  MessagePool pool;
  Thread removal;
  
  //enumeration type of messages accepted by Mentor
  protected enum MessageType { timeoutOkToNotOk_M, null_M }

  // Map for a Mentor pooled state machine that allows querying which events are possible in each map

  public static final Map<Object, HashSet<MessageType>> stateMessageMap = new HashMap<Object, HashSet<MessageType>>();
  static {
    stateMessageMap.put(Status.Ok,new HashSet<MessageType>(Arrays.asList(MessageType.timeoutOkToNotOk_M)));
    stateMessageMap.put(Status.NotOk,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
  }

  //Helper Variables
  private TimedEventHandler timeoutOkToNotOkHandler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Mentor()
  {
    howLongUntilOk = 3;
    setStatus(Status.Ok);
    pool = new MessagePool();
    removal=new Thread(this);
    //start the thread of Mentor
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setHowLongUntilOk(int aHowLongUntilOk)
  {
    boolean wasSet = false;
    howLongUntilOk = aHowLongUntilOk;
    wasSet = true;
    return wasSet;
  }

  public int getHowLongUntilOk()
  {
    return howLongUntilOk;
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

  public boolean _timeoutOkToNotOk()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Ok:
        exitStatus();
        setStatus(Status.NotOk);
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
      case Ok:
        stopTimeoutOkToNotOkHandler();
        break;
    }
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;

    // entry actions and do activities
    switch(status)
    {
      case Ok:
        startTimeoutOkToNotOkHandler();
        break;
    }
  }

  private void startTimeoutOkToNotOkHandler()
  {
    timeoutOkToNotOkHandler = new TimedEventHandler(this,"timeoutOkToNotOk",2);
  }

  private void stopTimeoutOkToNotOkHandler()
  {
    timeoutOkToNotOkHandler.stop();
  }

  public static class TimedEventHandler extends TimerTask  
  {
    private Mentor controller;
    private String timeoutMethodName;
    private double howLongInSeconds;
    private Timer timer;
    
    public TimedEventHandler(Mentor aController, String aTimeoutMethodName, double aHowLongInSeconds)
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
      if ("timeoutOkToNotOk".equals(timeoutMethodName))
      {
        boolean shouldRestart = !controller.timeoutOkToNotOk();
        if (shouldRestart)
        {
          controller.startTimeoutOkToNotOkHandler();
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
        if(stateMessageMap.get(getStatus()).contains(msg.type))
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

  public boolean timeoutOkToNotOk ()
  {
    boolean wasAdded = false;
    pool.put(new Message(MessageType.timeoutOkToNotOk_M, null));
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
        case timeoutOkToNotOk_M:
          status = _timeoutOkToNotOk();
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
            "howLongUntilOk" + ":" + getHowLongUntilOk()+ "]";
  }
}
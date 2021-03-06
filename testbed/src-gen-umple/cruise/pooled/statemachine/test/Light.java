/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.pooled.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 39 "../../../../../src/TestHarnessPooledStateMachine.ump"
public class Light implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Light State Machines
  public enum Bulb { Off, On }
  private Bulb bulb;
  
  MessagePool pool;
  Thread removal;
  
  //enumeration type of messages accepted by Light
  protected enum MessageType { null_M }

  // Map for a Light pooled state machine that allows querying which events are possible in each map

  public static final Map<Object, HashSet<MessageType>> stateMessageMap = new HashMap<Object, HashSet<MessageType>>();
  static {
    stateMessageMap.put(Bulb.Off,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(Bulb.On,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
  }

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Light()
  {
    setBulb(Bulb.Off);
    pool = new MessagePool();
    removal=new Thread(this);
    //start the thread of Light
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getBulbFullName()
  {
    String answer = bulb.toString();
    return answer;
  }

  public Bulb getBulb()
  {
    return bulb;
  }

  private boolean __autotransition2__()
  {
    boolean wasEventProcessed = false;
    
    Bulb aBulb = bulb;
    switch (aBulb)
    {
      case Off:
        setBulb(Bulb.On);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setBulb(Bulb aBulb)
  {
    bulb = aBulb;

    // entry actions and do activities
    switch(bulb)
    {
      case Off:
        __autotransition2__();
        break;
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
        if(stateMessageMap.get(getBulb()).contains(msg.type))
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
        default:
      }
      if(!status)
      {
        // Error message is written or  exception is raised
      }
    }
  }
}
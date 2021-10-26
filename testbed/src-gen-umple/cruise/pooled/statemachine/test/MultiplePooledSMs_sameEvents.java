/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.pooled.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 281 "../../../../../src/TestHarnessPooledStateMachine.ump"
public class MultiplePooledSMs_sameEvents implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MultiplePooledSMs_sameEvents State Machines
  public enum Sm { s1, s2, s3, s4 }
  private Sm sm;
  public enum Sm1 { s21, s22 }
  private Sm1 sm1;
  
  MessagePool pool;
  Thread removal;
  
  //enumeration type of messages accepted by MultiplePooledSMs_sameEvents
  protected enum MessageType { ev1_M, ev5_M, ev2_M, ev3_M, ev4_M, ev7_M }

  // Map for a MultiplePooledSMs_sameEvents pooled state machine that allows querying which events are possible in each map

  public static final Map<Object, HashSet<MessageType>> stateMessageMap = new HashMap<Object, HashSet<MessageType>>();
  static {
    stateMessageMap.put(Sm.s1,new HashSet<MessageType>(Arrays.asList(MessageType.ev1_M, MessageType.ev5_M)));
    stateMessageMap.put(Sm.s2,new HashSet<MessageType>(Arrays.asList(MessageType.ev2_M)));
    stateMessageMap.put(Sm.s3,new HashSet<MessageType>(Arrays.asList(MessageType.ev3_M)));
    stateMessageMap.put(Sm.s4,new HashSet<MessageType>(Arrays.asList(MessageType.ev4_M)));
    stateMessageMap.put(Sm1.s21,new HashSet<MessageType>(Arrays.asList(MessageType.ev1_M)));
    stateMessageMap.put(Sm1.s22,new HashSet<MessageType>(Arrays.asList(MessageType.ev7_M)));
  }

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MultiplePooledSMs_sameEvents()
  {
    setSm(Sm.s1);
    setSm1(Sm1.s21);
    pool = new MessagePool();
    removal=new Thread(this);
    //start the thread of MultiplePooledSMs_sameEvents
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

  public String getSm1FullName()
  {
    String answer = sm1.toString();
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  public Sm1 getSm1()
  {
    return sm1;
  }

  public boolean _ev1()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    Sm1 aSm1 = sm1;
    switch (aSm)
    {
      case s1:
        setSm(Sm.s2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aSm1)
    {
      case s21:
        setSm1(Sm1.s22);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _ev5()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s1:
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
        setSm(Sm.s3);
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

  public boolean _ev4()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s4:
        setSm(Sm.s1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _ev7()
  {
    boolean wasEventProcessed = false;
    
    Sm1 aSm1 = sm1;
    switch (aSm1)
    {
      case s22:
        setSm1(Sm1.s21);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setSm(Sm aSm)
  {
    sm = aSm;
  }

  private void setSm1(Sm1 aSm1)
  {
    sm1 = aSm1;
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
        if(stateMessageMap.get(getSm1()).contains(msg.type))
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

  public void ev1 ()
  {
    pool.put(new Message(MessageType.ev1_M, null));
  }

  public void ev5 ()
  {
    pool.put(new Message(MessageType.ev5_M, null));
  }

  public void ev2 ()
  {
    pool.put(new Message(MessageType.ev2_M, null));
  }

  public void ev3 ()
  {
    pool.put(new Message(MessageType.ev3_M, null));
  }

  public void ev4 ()
  {
    pool.put(new Message(MessageType.ev4_M, null));
  }

  public void ev7 ()
  {
    pool.put(new Message(MessageType.ev7_M, null));
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
        case ev1_M:
          status = _ev1();
          break;
        case ev5_M:
          status = _ev5();
          break;
        case ev2_M:
          status = _ev2();
          break;
        case ev3_M:
          status = _ev3();
          break;
        case ev4_M:
          status = _ev4();
          break;
        case ev7_M:
          status = _ev7();
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
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.pooled.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 234 "../../../../../src/TestHarnessPooledStateMachine.ump"
public class PooledSM_ConcurrentState_2 implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PooledSM_ConcurrentState_2 State Machines
  public enum Sm { s1, s2 }
  public enum SmS2S2a { Null, s2a }
  public enum SmS2S2b { Null, s2b }
  private Sm sm;
  private SmS2S2a smS2S2a;
  private SmS2S2b smS2S2b;
  
  MessagePool pool;
  Thread removal;
  
  //enumeration type of messages accepted by PooledSM_ConcurrentState_2
  protected enum MessageType { e1_M, e2_M, e3_M, e5_M, e4_M, null_M }

  // Map for a PooledSM_ConcurrentState_2 pooled state machine that allows querying which events are possible in each map

  public static final Map<Object, HashSet<MessageType>> stateMessageMap = new HashMap<Object, HashSet<MessageType>>();
  static {
    stateMessageMap.put(Sm.s1,new HashSet<MessageType>(Arrays.asList(MessageType.e1_M)));
    stateMessageMap.put(Sm.s2,new HashSet<MessageType>(Arrays.asList(MessageType.e2_M)));
    stateMessageMap.put(SmS2S2a.Null,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(SmS2S2a.s2a,new HashSet<MessageType>(Arrays.asList(MessageType.e3_M, MessageType.e5_M)));
    stateMessageMap.put(SmS2S2b.Null,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(SmS2S2b.s2b,new HashSet<MessageType>(Arrays.asList(MessageType.e4_M)));
  }

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PooledSM_ConcurrentState_2()
  {
    setSmS2S2a(SmS2S2a.Null);
    setSmS2S2b(SmS2S2b.Null);
    setSm(Sm.s1);
    pool = new MessagePool();
    removal=new Thread(this);
    //start the thread of PooledSM_ConcurrentState_2
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSmFullName()
  {
    String answer = sm.toString();
    if (smS2S2a != SmS2S2a.Null) { answer += "." + smS2S2a.toString(); }
    if (smS2S2b != SmS2S2b.Null) { answer += "." + smS2S2b.toString(); }
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  public SmS2S2a getSmS2S2a()
  {
    return smS2S2a;
  }

  public SmS2S2b getSmS2S2b()
  {
    return smS2S2b;
  }

  public boolean _e1()
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

  public boolean _e2()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s2:
        exitSm();
        setSm(Sm.s1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _e3()
  {
    boolean wasEventProcessed = false;
    
    SmS2S2a aSmS2S2a = smS2S2a;
    switch (aSmS2S2a)
    {
      case s2a:
        exitSmS2S2a();
        setSmS2S2b(SmS2S2b.s2b);
        setSmS2S2a(SmS2S2a.s2a);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _e5()
  {
    boolean wasEventProcessed = false;
    
    SmS2S2a aSmS2S2a = smS2S2a;
    switch (aSmS2S2a)
    {
      case s2a:
        exitSm();
        setSm(Sm.s1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _e4()
  {
    boolean wasEventProcessed = false;
    
    SmS2S2b aSmS2S2b = smS2S2b;
    switch (aSmS2S2b)
    {
      case s2b:
        exitSm();
        setSm(Sm.s1);
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
        exitSmS2S2a();
        exitSmS2S2b();
        break;
    }
  }

  private void setSm(Sm aSm)
  {
    sm = aSm;

    // entry actions and do activities
    switch(sm)
    {
      case s2:
        if (smS2S2a == SmS2S2a.Null) { setSmS2S2a(SmS2S2a.s2a); }
        if (smS2S2b == SmS2S2b.Null) { setSmS2S2b(SmS2S2b.s2b); }
        break;
    }
  }

  private void exitSmS2S2a()
  {
    switch(smS2S2a)
    {
      case s2a:
        setSmS2S2a(SmS2S2a.Null);
        break;
    }
  }

  private void setSmS2S2a(SmS2S2a aSmS2S2a)
  {
    smS2S2a = aSmS2S2a;
    if (sm != Sm.s2 && aSmS2S2a != SmS2S2a.Null) { setSm(Sm.s2); }
  }

  private void exitSmS2S2b()
  {
    switch(smS2S2b)
    {
      case s2b:
        setSmS2S2b(SmS2S2b.Null);
        break;
    }
  }

  private void setSmS2S2b(SmS2S2b aSmS2S2b)
  {
    smS2S2b = aSmS2S2b;
    if (sm != Sm.s2 && aSmS2S2b != SmS2S2b.Null) { setSm(Sm.s2); }
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
        else if(stateMessageMap.get(getSmS2S2a()).contains(msg.type))
        {
          //The element to be removed
          messages.remove(msg);
          return (msg);
        }
        else if(stateMessageMap.get(getSmS2S2b()).contains(msg.type))
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

  public void e1 ()
  {
    pool.put(new Message(MessageType.e1_M, null));
  }

  public void e2 ()
  {
    pool.put(new Message(MessageType.e2_M, null));
  }

  public void e3 ()
  {
    pool.put(new Message(MessageType.e3_M, null));
  }

  public void e5 ()
  {
    pool.put(new Message(MessageType.e5_M, null));
  }

  public void e4 ()
  {
    pool.put(new Message(MessageType.e4_M, null));
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
        case e1_M:
          status = _e1();
          break;
        case e2_M:
          status = _e2();
          break;
        case e3_M:
          status = _e3();
          break;
        case e5_M:
          status = _e5();
          break;
        case e4_M:
          status = _e4();
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
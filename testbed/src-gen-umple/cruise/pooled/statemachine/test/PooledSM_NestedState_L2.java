/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.pooled.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 162 "../../../../../src/TestHarnessPooledStateMachine.ump"
public class PooledSM_NestedState_L2 implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PooledSM_NestedState_L2 State Machines
  public enum Sm1 { s1, s2 }
  public enum Sm1S1 { Null, s1a, s1b }
  public enum Sm1S2 { Null, s2a, s2b }
  public enum Sm1S2S2b { Null, s2b1, s2b2 }
  private Sm1 sm1;
  private Sm1S1 sm1S1;
  private Sm1S2 sm1S2;
  private Sm1S2S2b sm1S2S2b;
  
  MessagePool pool;
  Thread removal;
  
  //enumeration type of messages accepted by PooledSM_NestedState_L2
  protected enum MessageType { e_M, f_M, g_M, h_M, i_M, k_M, j_M, m_M, null_M }

  // Map for a PooledSM_NestedState_L2 pooled state machine that allows querying which events are possible in each map

  public static final Map<Object, HashSet<MessageType>> stateMessageMap = new HashMap<Object, HashSet<MessageType>>();
  static {
    stateMessageMap.put(Sm1.s1,new HashSet<MessageType>(Arrays.asList(MessageType.e_M)));
    stateMessageMap.put(Sm1.s2,new HashSet<MessageType>(Arrays.asList(MessageType.e_M)));
    stateMessageMap.put(Sm1S1.Null,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(Sm1S1.s1a,new HashSet<MessageType>(Arrays.asList(MessageType.f_M, MessageType.g_M)));
    stateMessageMap.put(Sm1S1.s1b,new HashSet<MessageType>(Arrays.asList(MessageType.h_M, MessageType.i_M, MessageType.k_M)));
    stateMessageMap.put(Sm1S2.Null,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(Sm1S2.s2a,new HashSet<MessageType>(Arrays.asList(MessageType.i_M, MessageType.j_M)));
    stateMessageMap.put(Sm1S2.s2b,new HashSet<MessageType>(Arrays.asList(MessageType.h_M, MessageType.k_M)));
    stateMessageMap.put(Sm1S2S2b.Null,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(Sm1S2S2b.s2b1,new HashSet<MessageType>(Arrays.asList(MessageType.m_M)));
    stateMessageMap.put(Sm1S2S2b.s2b2,new HashSet<MessageType>(Arrays.asList(MessageType.m_M)));
  }

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PooledSM_NestedState_L2()
  {
    setSm1S1(Sm1S1.Null);
    setSm1S2(Sm1S2.Null);
    setSm1S2S2b(Sm1S2S2b.Null);
    setSm1(Sm1.s1);
    pool = new MessagePool();
    removal=new Thread(this);
    //start the thread of PooledSM_NestedState_L2
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSm1FullName()
  {
    String answer = sm1.toString();
    if (sm1S1 != Sm1S1.Null) { answer += "." + sm1S1.toString(); }
    if (sm1S2 != Sm1S2.Null) { answer += "." + sm1S2.toString(); }
    if (sm1S2S2b != Sm1S2S2b.Null) { answer += "." + sm1S2S2b.toString(); }
    return answer;
  }

  public Sm1 getSm1()
  {
    return sm1;
  }

  public Sm1S1 getSm1S1()
  {
    return sm1S1;
  }

  public Sm1S2 getSm1S2()
  {
    return sm1S2;
  }

  public Sm1S2S2b getSm1S2S2b()
  {
    return sm1S2S2b;
  }

  public boolean _e()
  {
    boolean wasEventProcessed = false;
    
    Sm1 aSm1 = sm1;
    switch (aSm1)
    {
      case s1:
        exitSm1();
        setSm1(Sm1.s2);
        wasEventProcessed = true;
        break;
      case s2:
        exitSm1();
        setSm1(Sm1.s1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _f()
  {
    boolean wasEventProcessed = false;
    
    Sm1S1 aSm1S1 = sm1S1;
    switch (aSm1S1)
    {
      case s1a:
        exitSm1();
        setSm1S2(Sm1S2.s2b);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _g()
  {
    boolean wasEventProcessed = false;
    
    Sm1S1 aSm1S1 = sm1S1;
    switch (aSm1S1)
    {
      case s1a:
        exitSm1S1();
        setSm1S1(Sm1S1.s1a);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _h()
  {
    boolean wasEventProcessed = false;
    
    Sm1S1 aSm1S1 = sm1S1;
    Sm1S2 aSm1S2 = sm1S2;
    switch (aSm1S1)
    {
      case s1b:
        exitSm1S1();
        setSm1S1(Sm1S1.s1a);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aSm1S2)
    {
      case s2b:
        exitSm1S2();
        setSm1S2(Sm1S2.s2a);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _i()
  {
    boolean wasEventProcessed = false;
    
    Sm1S1 aSm1S1 = sm1S1;
    Sm1S2 aSm1S2 = sm1S2;
    switch (aSm1S1)
    {
      case s1b:
        exitSm1();
        setSm1S2(Sm1S2.s2b);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aSm1S2)
    {
      case s2a:
        exitSm1S2();
        setSm1S2(Sm1S2.s2b);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _k()
  {
    boolean wasEventProcessed = false;
    
    Sm1S1 aSm1S1 = sm1S1;
    Sm1S2 aSm1S2 = sm1S2;
    switch (aSm1S1)
    {
      case s1b:
        exitSm1();
        setSm1(Sm1.s2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aSm1S2)
    {
      case s2b:
        exitSm1();
        setSm1(Sm1.s1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _j()
  {
    boolean wasEventProcessed = false;
    
    Sm1S2 aSm1S2 = sm1S2;
    switch (aSm1S2)
    {
      case s2a:
        exitSm1();
        setSm1S1(Sm1S1.s1b);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _m()
  {
    boolean wasEventProcessed = false;
    
    Sm1S2S2b aSm1S2S2b = sm1S2S2b;
    switch (aSm1S2S2b)
    {
      case s2b1:
        exitSm1S2S2b();
        setSm1S2S2b(Sm1S2S2b.s2b2);
        wasEventProcessed = true;
        break;
      case s2b2:
        exitSm1S2S2b();
        setSm1S2S2b(Sm1S2S2b.s2b1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitSm1()
  {
    switch(sm1)
    {
      case s1:
        exitSm1S1();
        break;
      case s2:
        exitSm1S2();
        break;
    }
  }

  private void setSm1(Sm1 aSm1)
  {
    sm1 = aSm1;

    // entry actions and do activities
    switch(sm1)
    {
      case s1:
        if (sm1S1 == Sm1S1.Null) { setSm1S1(Sm1S1.s1a); }
        break;
      case s2:
        if (sm1S2 == Sm1S2.Null) { setSm1S2(Sm1S2.s2a); }
        break;
    }
  }

  private void exitSm1S1()
  {
    switch(sm1S1)
    {
      case s1a:
        setSm1S1(Sm1S1.Null);
        break;
      case s1b:
        setSm1S1(Sm1S1.Null);
        break;
    }
  }

  private void setSm1S1(Sm1S1 aSm1S1)
  {
    sm1S1 = aSm1S1;
    if (sm1 != Sm1.s1 && aSm1S1 != Sm1S1.Null) { setSm1(Sm1.s1); }
  }

  private void exitSm1S2()
  {
    switch(sm1S2)
    {
      case s2a:
        setSm1S2(Sm1S2.Null);
        break;
      case s2b:
        exitSm1S2S2b();
        setSm1S2(Sm1S2.Null);
        break;
    }
  }

  private void setSm1S2(Sm1S2 aSm1S2)
  {
    sm1S2 = aSm1S2;
    if (sm1 != Sm1.s2 && aSm1S2 != Sm1S2.Null) { setSm1(Sm1.s2); }

    // entry actions and do activities
    switch(sm1S2)
    {
      case s2b:
        if (sm1S2S2b == Sm1S2S2b.Null) { setSm1S2S2b(Sm1S2S2b.s2b1); }
        break;
    }
  }

  private void exitSm1S2S2b()
  {
    switch(sm1S2S2b)
    {
      case s2b1:
        setSm1S2S2b(Sm1S2S2b.Null);
        break;
      case s2b2:
        setSm1S2S2b(Sm1S2S2b.Null);
        break;
    }
  }

  private void setSm1S2S2b(Sm1S2S2b aSm1S2S2b)
  {
    sm1S2S2b = aSm1S2S2b;
    if (sm1S2 != Sm1S2.s2b && aSm1S2S2b != Sm1S2S2b.Null) { setSm1S2(Sm1S2.s2b); }
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
        if(stateMessageMap.get(getSm1()).contains(msg.type))
        {
          //The element to be removed
          messages.remove(msg);
          return (msg);
        }
        else if(stateMessageMap.get(getSm1S1()).contains(msg.type))
        {
          //The element to be removed
          messages.remove(msg);
          return (msg);
        }
        else if(stateMessageMap.get(getSm1S2()).contains(msg.type))
        {
          //The element to be removed
          messages.remove(msg);
          return (msg);
        }
        else if(stateMessageMap.get(getSm1S2S2b()).contains(msg.type))
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

  public void e ()
  {
    pool.put(new Message(MessageType.e_M, null));
  }

  public void f ()
  {
    pool.put(new Message(MessageType.f_M, null));
  }

  public void g ()
  {
    pool.put(new Message(MessageType.g_M, null));
  }

  public void h ()
  {
    pool.put(new Message(MessageType.h_M, null));
  }

  public void i ()
  {
    pool.put(new Message(MessageType.i_M, null));
  }

  public void k ()
  {
    pool.put(new Message(MessageType.k_M, null));
  }

  public void j ()
  {
    pool.put(new Message(MessageType.j_M, null));
  }

  public void m ()
  {
    pool.put(new Message(MessageType.m_M, null));
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
        case e_M:
          status = _e();
          break;
        case f_M:
          status = _f();
          break;
        case g_M:
          status = _g();
          break;
        case h_M:
          status = _h();
          break;
        case i_M:
          status = _i();
          break;
        case k_M:
          status = _k();
          break;
        case j_M:
          status = _j();
          break;
        case m_M:
          status = _m();
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
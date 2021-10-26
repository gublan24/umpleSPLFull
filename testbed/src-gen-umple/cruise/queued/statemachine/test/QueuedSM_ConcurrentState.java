/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.queued.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 168 "../../../../../src/TestHarnessQueuedStateMachine.ump"
public class QueuedSM_ConcurrentState implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //QueuedSM_ConcurrentState State Machines
  public enum Sm { s1, s2 }
  public enum SmS2S2a { Null, s2a, s2b }
  public enum SmS2S2c { Null, s2c, s2d }
  private Sm sm;
  private SmS2S2a smS2S2a;
  private SmS2S2c smS2S2c;
  
  //enumeration type of messages accepted by QueuedSM_ConcurrentState
  protected enum MessageType { e1_M, e2_M, e3_M, e5_M, e4_M }
  
  MessageQueue queue;
  Thread removal;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public QueuedSM_ConcurrentState()
  {
    setSmS2S2a(SmS2S2a.Null);
    setSmS2S2c(SmS2S2c.Null);
    setSm(Sm.s1);
    queue = new MessageQueue();
    removal=new Thread(this);
    //start the thread of QueuedSM_ConcurrentState
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSmFullName()
  {
    String answer = sm.toString();
    if (smS2S2a != SmS2S2a.Null) { answer += "." + smS2S2a.toString(); }
    if (smS2S2c != SmS2S2c.Null) { answer += "." + smS2S2c.toString(); }
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

  public SmS2S2c getSmS2S2c()
  {
    return smS2S2c;
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
        setSmS2S2a(SmS2S2a.s2b);
        wasEventProcessed = true;
        break;
      case s2b:
        exitSmS2S2a();
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
    
    SmS2S2c aSmS2S2c = smS2S2c;
    switch (aSmS2S2c)
    {
      case s2c:
        exitSmS2S2c();
        setSmS2S2c(SmS2S2c.s2d);
        wasEventProcessed = true;
        break;
      case s2d:
        exitSmS2S2c();
        setSmS2S2c(SmS2S2c.s2c);
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
        exitSmS2S2c();
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
        if (smS2S2c == SmS2S2c.Null) { setSmS2S2c(SmS2S2c.s2c); }
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
      case s2b:
        setSmS2S2a(SmS2S2a.Null);
        break;
    }
  }

  private void setSmS2S2a(SmS2S2a aSmS2S2a)
  {
    smS2S2a = aSmS2S2a;
    if (sm != Sm.s2 && aSmS2S2a != SmS2S2a.Null) { setSm(Sm.s2); }
  }

  private void exitSmS2S2c()
  {
    switch(smS2S2c)
    {
      case s2c:
        setSmS2S2c(SmS2S2c.Null);
        break;
      case s2d:
        setSmS2S2c(SmS2S2c.Null);
        break;
    }
  }

  private void setSmS2S2c(SmS2S2c aSmS2S2c)
  {
    smS2S2c = aSmS2S2c;
    if (sm != Sm.s2 && aSmS2S2c != SmS2S2c.Null) { setSm(Sm.s2); }
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

  public void e1 ()
  {
    queue.put(new Message(MessageType.e1_M, null));
  }

  public void e2 ()
  {
    queue.put(new Message(MessageType.e2_M, null));
  }

  public void e3 ()
  {
    queue.put(new Message(MessageType.e3_M, null));
  }

  public void e5 ()
  {
    queue.put(new Message(MessageType.e5_M, null));
  }

  public void e4 ()
  {
    queue.put(new Message(MessageType.e4_M, null));
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
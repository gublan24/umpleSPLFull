/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.queued.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 117 "../../../../../src/TestHarnessQueuedStateMachine.ump"
public class QueuedSM_NestedStates_level1 implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //QueuedSM_NestedStates_level1 State Machines
  public enum Sm { s1, s2 }
  public enum SmS2 { Null, s2a, s2b }
  private Sm sm;
  private SmS2 smS2;
  
  //enumeration type of messages accepted by QueuedSM_NestedStates_level1
  protected enum MessageType { e1_M, e2_M, e3_M }
  
  MessageQueue queue;
  Thread removal;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public QueuedSM_NestedStates_level1()
  {
    setSmS2(SmS2.Null);
    setSm(Sm.s1);
    queue = new MessageQueue();
    removal=new Thread(this);
    //start the thread of QueuedSM_NestedStates_level1
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSmFullName()
  {
    String answer = sm.toString();
    if (smS2 != SmS2.Null) { answer += "." + smS2.toString(); }
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  public SmS2 getSmS2()
  {
    return smS2;
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
    
    SmS2 aSmS2 = smS2;
    switch (aSmS2)
    {
      case s2a:
        exitSmS2();
        setSmS2(SmS2.s2b);
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
    
    SmS2 aSmS2 = smS2;
    switch (aSmS2)
    {
      case s2b:
        exitSmS2();
        setSmS2(SmS2.s2a);
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
        exitSmS2();
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
        if (smS2 == SmS2.Null) { setSmS2(SmS2.s2a); }
        break;
    }
  }

  private void exitSmS2()
  {
    switch(smS2)
    {
      case s2a:
        setSmS2(SmS2.Null);
        break;
      case s2b:
        setSmS2(SmS2.Null);
        break;
    }
  }

  private void setSmS2(SmS2 aSmS2)
  {
    smS2 = aSmS2;
    if (sm != Sm.s2 && aSmS2 != SmS2.Null) { setSm(Sm.s2); }
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
        default:
      }
      if(!status)
      {
        // Error message is written or  exception is raised
      }
    }
  }
}
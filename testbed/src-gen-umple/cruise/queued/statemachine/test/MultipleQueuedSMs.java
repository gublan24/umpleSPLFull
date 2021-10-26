/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.queued.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 234 "../../../../../src/TestHarnessQueuedStateMachine.ump"
public class MultipleQueuedSMs implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MultipleQueuedSMs State Machines
  public enum Sm { s1, s2 }
  private Sm sm;
  public enum Sm1 { s3, s4 }
  private Sm1 sm1;
  
  //enumeration type of messages accepted by MultipleQueuedSMs
  protected enum MessageType { e1_M, e2_M, e4_M }
  
  MessageQueue queue;
  Thread removal;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MultipleQueuedSMs()
  {
    setSm(Sm.s1);
    setSm1(Sm1.s3);
    queue = new MessageQueue();
    removal=new Thread(this);
    //start the thread of MultipleQueuedSMs
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
    Sm1 aSm1 = sm1;
    switch (aSm)
    {
      case s2:
        setSm(Sm.s1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aSm1)
    {
      case s3:
        setSm1(Sm1.s4);
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
    
    Sm1 aSm1 = sm1;
    switch (aSm1)
    {
      case s4:
        setSm1(Sm1.s3);
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
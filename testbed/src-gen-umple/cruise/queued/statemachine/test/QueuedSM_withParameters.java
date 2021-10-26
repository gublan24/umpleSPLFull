/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.queued.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 18 "../../../../../src/TestHarnessQueuedStateMachine.ump"
public class QueuedSM_withParameters implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //QueuedSM_withParameters Attributes
  private int value;

  //QueuedSM_withParameters State Machines
  public enum Sm { s1, s2 }
  private Sm sm;
  
  //enumeration type of messages accepted by QueuedSM_withParameters
  protected enum MessageType { e1_M, e2_M }
  
  MessageQueue queue;
  Thread removal;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public QueuedSM_withParameters()
  {
    value = 0;
    setSm(Sm.s1);
    queue = new MessageQueue();
    removal=new Thread(this);
    //start the thread of QueuedSM_withParameters
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setValue(int aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public int getValue()
  {
    return value;
  }

  public String getSmFullName()
  {
    String answer = sm.toString();
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  public boolean _e1(Integer val)
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s1:
        // line 25 "../../../../../src/TestHarnessQueuedStateMachine.ump"
        setValue(val);
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
        setSm(Sm.s2);
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

  public void e1 (Integer val)
  {
    Vector<Object> v = new Vector<Object>(1);
    v.add(0, val);
    queue.put(new Message(MessageType.e1_M, v));
  }

  public void e2 ()
  {
    queue.put(new Message(MessageType.e2_M, null));
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
          status = _e1((Integer) m.param.elementAt(0));
          break;
        case e2_M:
          status = _e2();
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
            "value" + ":" + getValue()+ "]";
  }
}
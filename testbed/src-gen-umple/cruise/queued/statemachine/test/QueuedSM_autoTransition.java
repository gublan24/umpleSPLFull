/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.queued.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 47 "../../../../../src/TestHarnessQueuedStateMachine.ump"
public class QueuedSM_autoTransition implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //QueuedSM_autoTransition State Machines
  public enum Sm { s1, s2 }
  private Sm sm;
  
  //enumeration type of messages accepted by QueuedSM_autoTransition
  protected enum MessageType {  }
  
  MessageQueue queue;
  Thread removal;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public QueuedSM_autoTransition()
  {
    setSm(Sm.s1);
    queue = new MessageQueue();
    removal=new Thread(this);
    //start the thread of QueuedSM_autoTransition
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

  private boolean __autotransition5__()
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

  private void setSm(Sm aSm)
  {
    sm = aSm;

    // entry actions and do activities
    switch(sm)
    {
      case s1:
        __autotransition5__();
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
        default:
      }
      if(!status)
      {
        // Error message is written or  exception is raised
      }
    }
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.pooled.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 307 "../../../../../src/TestHarnessPooledStateMachine.ump"
public class MultiplePooledSMs_nestedStates_EventlessSM implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MultiplePooledSMs_nestedStates_EventlessSM State Machines
  public enum Sm { s1, s2 }
  public enum SmS1 { Null, s1a, s1b }
  private Sm sm;
  private SmS1 smS1;
  public enum Sm1 { s3, s4 }
  private Sm1 sm1;
  public enum Sm2 { q, s }
  private Sm2 sm2;
  
  MessagePool pool;
  Thread removal;
  
  //enumeration type of messages accepted by MultiplePooledSMs_nestedStates_EventlessSM
  protected enum MessageType { e1_M, e2_M, e5_M, e6_M, null_M, e3_M, e4_M }

  // Map for a MultiplePooledSMs_nestedStates_EventlessSM pooled state machine that allows querying which events are possible in each map

  public static final Map<Object, HashSet<MessageType>> stateMessageMap = new HashMap<Object, HashSet<MessageType>>();
  static {
    stateMessageMap.put(Sm.s1,new HashSet<MessageType>(Arrays.asList(MessageType.e1_M)));
    stateMessageMap.put(Sm.s2,new HashSet<MessageType>(Arrays.asList(MessageType.e2_M)));
    stateMessageMap.put(SmS1.Null,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(SmS1.s1a,new HashSet<MessageType>(Arrays.asList(MessageType.e5_M)));
    stateMessageMap.put(SmS1.s1b,new HashSet<MessageType>(Arrays.asList(MessageType.e6_M)));
    stateMessageMap.put(Sm1.s3,new HashSet<MessageType>(Arrays.asList(MessageType.e3_M)));
    stateMessageMap.put(Sm1.s4,new HashSet<MessageType>(Arrays.asList(MessageType.e4_M)));
  }

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MultiplePooledSMs_nestedStates_EventlessSM()
  {
    setSmS1(SmS1.Null);
    setSm(Sm.s1);
    setSm1(Sm1.s3);
    setSm2(Sm2.q);
    pool = new MessagePool();
    removal=new Thread(this);
    //start the thread of MultiplePooledSMs_nestedStates_EventlessSM
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSmFullName()
  {
    String answer = sm.toString();
    if (smS1 != SmS1.Null) { answer += "." + smS1.toString(); }
    return answer;
  }

  public String getSm1FullName()
  {
    String answer = sm1.toString();
    return answer;
  }

  public String getSm2FullName()
  {
    String answer = sm2.toString();
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

  public Sm2 getSm2()
  {
    return sm2;
  }

  public SmS1 getSmS1()
  {
    return smS1;
  }

  public boolean _e1()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s1:
        exitSmS1();
        setSmS1(SmS1.s1a);
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
    
    Sm1 aSm1 = sm1;
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

  public boolean _e5()
  {
    boolean wasEventProcessed = false;
    
    SmS1 aSmS1 = smS1;
    switch (aSmS1)
    {
      case s1a:
        exitSmS1();
        setSmS1(SmS1.s1b);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _e6()
  {
    boolean wasEventProcessed = false;
    
    SmS1 aSmS1 = smS1;
    switch (aSmS1)
    {
      case s1b:
        exitSm();
        setSm(Sm.s2);
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
      case s1:
        exitSmS1();
        break;
    }
  }

  private void setSm(Sm aSm)
  {
    sm = aSm;

    // entry actions and do activities
    switch(sm)
    {
      case s1:
        if (smS1 == SmS1.Null) { setSmS1(SmS1.s1a); }
        break;
    }
  }

  private void setSm1(Sm1 aSm1)
  {
    sm1 = aSm1;
  }

  public boolean setSm2(Sm2 aSm2)
  {
    sm2 = aSm2;
    return true;
  }

  private void exitSmS1()
  {
    switch(smS1)
    {
      case s1a:
        setSmS1(SmS1.Null);
        break;
      case s1b:
        setSmS1(SmS1.Null);
        break;
    }
  }

  private void setSmS1(SmS1 aSmS1)
  {
    smS1 = aSmS1;
    if (sm != Sm.s1 && aSmS1 != SmS1.Null) { setSm(Sm.s1); }
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
        else if(stateMessageMap.get(getSmS1()).contains(msg.type))
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

  public void e1 ()
  {
    pool.put(new Message(MessageType.e1_M, null));
  }

  public void e2 ()
  {
    pool.put(new Message(MessageType.e2_M, null));
  }

  public void e5 ()
  {
    pool.put(new Message(MessageType.e5_M, null));
  }

  public void e6 ()
  {
    pool.put(new Message(MessageType.e6_M, null));
  }

  public void e3 ()
  {
    pool.put(new Message(MessageType.e3_M, null));
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
        case e5_M:
          status = _e5();
          break;
        case e6_M:
          status = _e6();
          break;
        case e3_M:
          status = _e3();
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
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.pooled.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 129 "../../../../../src/TestHarnessPooledStateMachine.ump"
public class PooledSM_NestedState_L1_2 implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PooledSM_NestedState_L1_2 State Machines
  public enum Sm { s1, s2, s3 }
  public enum SmS1 { Null, s1a, s1b }
  public enum SmS2 { Null, s2a, s2b }
  public enum SmS3 { Null, s3a, s3b }
  private Sm sm;
  private SmS1 smS1;
  private SmS2 smS2;
  private SmS3 smS3;
  
  MessagePool pool;
  Thread removal;
  
  //enumeration type of messages accepted by PooledSM_NestedState_L1_2
  protected enum MessageType { e1_M, e4_M, e7_M, e2_M, e3_M, e5_M, e6_M, e8_M, e9_M, null_M }

  // Map for a PooledSM_NestedState_L1_2 pooled state machine that allows querying which events are possible in each map

  public static final Map<Object, HashSet<MessageType>> stateMessageMap = new HashMap<Object, HashSet<MessageType>>();
  static {
    stateMessageMap.put(Sm.s1,new HashSet<MessageType>(Arrays.asList(MessageType.e1_M)));
    stateMessageMap.put(Sm.s2,new HashSet<MessageType>(Arrays.asList(MessageType.e4_M)));
    stateMessageMap.put(Sm.s3,new HashSet<MessageType>(Arrays.asList(MessageType.e7_M)));
    stateMessageMap.put(SmS1.Null,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(SmS1.s1a,new HashSet<MessageType>(Arrays.asList(MessageType.e2_M)));
    stateMessageMap.put(SmS1.s1b,new HashSet<MessageType>(Arrays.asList(MessageType.e3_M)));
    stateMessageMap.put(SmS2.Null,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(SmS2.s2a,new HashSet<MessageType>(Arrays.asList(MessageType.e5_M)));
    stateMessageMap.put(SmS2.s2b,new HashSet<MessageType>(Arrays.asList(MessageType.e6_M)));
    stateMessageMap.put(SmS3.Null,new HashSet<MessageType>(Arrays.asList(MessageType.null_M)));
    stateMessageMap.put(SmS3.s3a,new HashSet<MessageType>(Arrays.asList(MessageType.e8_M)));
    stateMessageMap.put(SmS3.s3b,new HashSet<MessageType>(Arrays.asList(MessageType.e9_M)));
  }

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PooledSM_NestedState_L1_2()
  {
    setSmS1(SmS1.Null);
    setSmS2(SmS2.Null);
    setSmS3(SmS3.Null);
    setSm(Sm.s1);
    pool = new MessagePool();
    removal=new Thread(this);
    //start the thread of PooledSM_NestedState_L1_2
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSmFullName()
  {
    String answer = sm.toString();
    if (smS1 != SmS1.Null) { answer += "." + smS1.toString(); }
    if (smS2 != SmS2.Null) { answer += "." + smS2.toString(); }
    if (smS3 != SmS3.Null) { answer += "." + smS3.toString(); }
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  public SmS1 getSmS1()
  {
    return smS1;
  }

  public SmS2 getSmS2()
  {
    return smS2;
  }

  public SmS3 getSmS3()
  {
    return smS3;
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

  public boolean _e4()
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

  public boolean _e7()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s3:
        exitSm();
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

  public boolean _e3()
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

  public boolean _e5()
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

  public boolean _e6()
  {
    boolean wasEventProcessed = false;
    
    SmS2 aSmS2 = smS2;
    switch (aSmS2)
    {
      case s2b:
        exitSm();
        setSm(Sm.s3);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _e8()
  {
    boolean wasEventProcessed = false;
    
    SmS3 aSmS3 = smS3;
    switch (aSmS3)
    {
      case s3a:
        exitSmS3();
        setSmS3(SmS3.s3b);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _e9()
  {
    boolean wasEventProcessed = false;
    
    SmS3 aSmS3 = smS3;
    switch (aSmS3)
    {
      case s3b:
        exitSm();
        setSmS1(SmS1.s1a);
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
      case s2:
        exitSmS2();
        break;
      case s3:
        exitSmS3();
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
      case s2:
        if (smS2 == SmS2.Null) { setSmS2(SmS2.s2a); }
        break;
      case s3:
        if (smS3 == SmS3.Null) { setSmS3(SmS3.s3a); }
        break;
    }
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

  private void exitSmS3()
  {
    switch(smS3)
    {
      case s3a:
        setSmS3(SmS3.Null);
        break;
      case s3b:
        setSmS3(SmS3.Null);
        break;
    }
  }

  private void setSmS3(SmS3 aSmS3)
  {
    smS3 = aSmS3;
    if (sm != Sm.s3 && aSmS3 != SmS3.Null) { setSm(Sm.s3); }
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
        else if(stateMessageMap.get(getSmS2()).contains(msg.type))
        {
          //The element to be removed
          messages.remove(msg);
          return (msg);
        }
        else if(stateMessageMap.get(getSmS3()).contains(msg.type))
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

  public void e4 ()
  {
    pool.put(new Message(MessageType.e4_M, null));
  }

  public void e7 ()
  {
    pool.put(new Message(MessageType.e7_M, null));
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

  public void e6 ()
  {
    pool.put(new Message(MessageType.e6_M, null));
  }

  public void e8 ()
  {
    pool.put(new Message(MessageType.e8_M, null));
  }

  public void e9 ()
  {
    pool.put(new Message(MessageType.e9_M, null));
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
        case e4_M:
          status = _e4();
          break;
        case e7_M:
          status = _e7();
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
        case e6_M:
          status = _e6();
          break;
        case e8_M:
          status = _e8();
          break;
        case e9_M:
          status = _e9();
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
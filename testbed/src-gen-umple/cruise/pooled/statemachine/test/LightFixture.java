/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.pooled.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 18 "../../../../../src/TestHarnessPooledStateMachine.ump"
public class LightFixture implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LightFixture Attributes
  private int brightness;
  private int dimmer;

  //LightFixture State Machines
  public enum Bulb { Off, Dimmed, On }
  private Bulb bulb;
  
  MessagePool pool;
  Thread removal;
  
  //enumeration type of messages accepted by LightFixture
  protected enum MessageType { turnDimmer_M, flipSwitch_M, entry_M }

  // Map for a LightFixture pooled state machine that allows querying which events are possible in each map

  public static final Map<Object, HashSet<MessageType>> stateMessageMap = new HashMap<Object, HashSet<MessageType>>();
  static {
    stateMessageMap.put(Bulb.Off,new HashSet<MessageType>(Arrays.asList(MessageType.turnDimmer_M, MessageType.flipSwitch_M)));
    stateMessageMap.put(Bulb.Dimmed,new HashSet<MessageType>(Arrays.asList(MessageType.entry_M, MessageType.flipSwitch_M, MessageType.turnDimmer_M)));
    stateMessageMap.put(Bulb.On,new HashSet<MessageType>(Arrays.asList(MessageType.flipSwitch_M, MessageType.turnDimmer_M)));
  }

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LightFixture(int aDimmer)
  {
    brightness = 0;
    dimmer = aDimmer;
    setBulb(Bulb.Off);
    pool = new MessagePool();
    removal=new Thread(this);
    //start the thread of LightFixture
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setBrightness(int aBrightness)
  {
    boolean wasSet = false;
    brightness = aBrightness;
    wasSet = true;
    return wasSet;
  }

  public boolean setDimmer(int aDimmer)
  {
    boolean wasSet = false;
    dimmer = aDimmer;
    wasSet = true;
    return wasSet;
  }

  public int getBrightness()
  {
    return brightness;
  }

  public int getDimmer()
  {
    return dimmer;
  }

  public String getBulbFullName()
  {
    String answer = bulb.toString();
    return answer;
  }

  public Bulb getBulb()
  {
    return bulb;
  }

  public boolean _turnDimmer(Integer lightval)
  {
    boolean wasEventProcessed = false;
    
    Bulb aBulb = bulb;
    switch (aBulb)
    {
      case Off:
        // line 24 "../../../../../src/TestHarnessPooledStateMachine.ump"
        setBrightness(lightval);
        setBulb(Bulb.Off);
        wasEventProcessed = true;
        break;
      case Dimmed:
        // line 30 "../../../../../src/TestHarnessPooledStateMachine.ump"
        setBrightness(lightval);
        setBulb(Bulb.Dimmed);
        wasEventProcessed = true;
        break;
      case On:
        // line 34 "../../../../../src/TestHarnessPooledStateMachine.ump"
        setBrightness(lightval);
        setBulb(Bulb.Dimmed);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _flipSwitch()
  {
    boolean wasEventProcessed = false;
    
    Bulb aBulb = bulb;
    switch (aBulb)
    {
      case Off:
        setBulb(Bulb.Dimmed);
        wasEventProcessed = true;
        break;
      case Dimmed:
        setBulb(Bulb.Off);
        wasEventProcessed = true;
        break;
      case On:
        setBulb(Bulb.Off);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _entry()
  {
    boolean wasEventProcessed = false;
    
    Bulb aBulb = bulb;
    switch (aBulb)
    {
      case Dimmed:
        if (getDimmer()>99)
        {
          setBulb(Bulb.On);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setBulb(Bulb aBulb)
  {
    bulb = aBulb;
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
        if(stateMessageMap.get(getBulb()).contains(msg.type))
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

  public void turnDimmer (Integer lightval)
  {
    Vector<Object> v = new Vector<Object>(1);
    v.add(0, lightval);
    pool.put(new Message(MessageType.turnDimmer_M, v));
  }

  public void flipSwitch ()
  {
    pool.put(new Message(MessageType.flipSwitch_M, null));
  }

  public void entry ()
  {
    pool.put(new Message(MessageType.entry_M, null));
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
        case turnDimmer_M:
          status = _turnDimmer((Integer) m.param.elementAt(0));
          break;
        case flipSwitch_M:
          status = _flipSwitch();
          break;
        case entry_M:
          status = _entry();
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
            "brightness" + ":" + getBrightness()+ "," +
            "dimmer" + ":" + getDimmer()+ "]";
  }
}
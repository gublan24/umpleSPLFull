/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.queued.statemachine.test;
import java.util.*;
import java.lang.Thread;

// line 70 "../../../../../src/TestHarnessQueuedStateMachine.ump"
public class AutomatedTellerMachine implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AutomatedTellerMachine Attributes
  private List<String> logs;

  //AutomatedTellerMachine State Machines
  public enum Sm { idle, maintenance, active, error1, error2 }
  public enum SmActive { Null, validating, selecting, processing, printing }
  private Sm sm;
  private SmActive smActive;
  
  //enumeration type of messages accepted by AutomatedTellerMachine
  protected enum MessageType { cardInserted_M, maintain_M, isMaintained_M, cancel_M, validated_M, select_M, selectAnotherTransiction_M, finish_M, receiptPrinted_M }
  
  MessageQueue queue;
  Thread removal;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AutomatedTellerMachine()
  {
    logs = new ArrayList<String>();
    setSmActive(SmActive.Null);
    setSm(Sm.idle);
    queue = new MessageQueue();
    removal=new Thread(this);
    //start the thread of AutomatedTellerMachine
    removal.start();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addLog(String aLog)
  {
    boolean wasAdded = false;
    wasAdded = logs.add(aLog);
    return wasAdded;
  }

  public boolean removeLog(String aLog)
  {
    boolean wasRemoved = false;
    wasRemoved = logs.remove(aLog);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  public String getLog(int index)
  {
    String aLog = logs.get(index);
    return aLog;
  }

  public String[] getLogs()
  {
    String[] newLogs = logs.toArray(new String[logs.size()]);
    return newLogs;
  }

  public int numberOfLogs()
  {
    int number = logs.size();
    return number;
  }

  public boolean hasLogs()
  {
    boolean has = logs.size() > 0;
    return has;
  }

  public int indexOfLog(String aLog)
  {
    int index = logs.indexOf(aLog);
    return index;
  }

  public String getSmFullName()
  {
    String answer = sm.toString();
    if (smActive != SmActive.Null) { answer += "." + smActive.toString(); }
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  public SmActive getSmActive()
  {
    return smActive;
  }

  public boolean _cardInserted()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case idle:
        setSm(Sm.active);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
        wasEventProcessed = unspecified(getSm().toString(), "cardInserted");
    }

    return wasEventProcessed;
  }

  public boolean _maintain()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case idle:
        setSm(Sm.maintenance);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
        wasEventProcessed = unspecified(getSm().toString(), "maintain");
    }

    return wasEventProcessed;
  }

  public boolean unspecified(String state, String event)
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    SmActive aSmActive = smActive;
    switch (aSm)
    {
      case idle:
        setSm(Sm.error1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aSmActive)
    {
      case validating:
        exitSm();
        setSm(Sm.error2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _isMaintained()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case maintenance:
        setSm(Sm.idle);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _cancel()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case active:
        exitSm();
        setSm(Sm.idle);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private boolean __autotransition7__()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case error1:
        setSm(Sm.idle);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private boolean __autotransition8__()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case error2:
        setSmActive(SmActive.validating);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _validated()
  {
    boolean wasEventProcessed = false;
    
    SmActive aSmActive = smActive;
    switch (aSmActive)
    {
      case validating:
        exitSmActive();
        setSmActive(SmActive.selecting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
        wasEventProcessed = unspecified(getSmActive().toString(), "validated");
    }

    return wasEventProcessed;
  }

  public boolean _select()
  {
    boolean wasEventProcessed = false;
    
    SmActive aSmActive = smActive;
    switch (aSmActive)
    {
      case selecting:
        exitSmActive();
        setSmActive(SmActive.processing);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _selectAnotherTransiction()
  {
    boolean wasEventProcessed = false;
    
    SmActive aSmActive = smActive;
    switch (aSmActive)
    {
      case processing:
        exitSmActive();
        setSmActive(SmActive.selecting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _finish()
  {
    boolean wasEventProcessed = false;
    
    SmActive aSmActive = smActive;
    switch (aSmActive)
    {
      case processing:
        exitSmActive();
        setSmActive(SmActive.printing);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean _receiptPrinted()
  {
    boolean wasEventProcessed = false;
    
    SmActive aSmActive = smActive;
    switch (aSmActive)
    {
      case printing:
        exitSm();
        setSm(Sm.idle);
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
      case active:
        exitSmActive();
        // line 86 "../../../../../src/TestHarnessQueuedStateMachine.ump"
        addLog("Card is ejected");
        break;
    }
  }

  private void setSm(Sm aSm)
  {
    sm = aSm;

    // entry actions and do activities
    switch(sm)
    {
      case active:
        // line 85 "../../../../../src/TestHarnessQueuedStateMachine.ump"
        addLog("Card is read");
        if (smActive == SmActive.Null) { setSmActive(SmActive.validating); }
        break;
      case error1:
        __autotransition7__();
        break;
      case error2:
        __autotransition8__();
        break;
    }
  }

  private void exitSmActive()
  {
    switch(smActive)
    {
      case validating:
        setSmActive(SmActive.Null);
        break;
      case selecting:
        setSmActive(SmActive.Null);
        break;
      case processing:
        setSmActive(SmActive.Null);
        break;
      case printing:
        setSmActive(SmActive.Null);
        break;
    }
  }

  private void setSmActive(SmActive aSmActive)
  {
    smActive = aSmActive;
    if (sm != Sm.active && aSmActive != SmActive.Null) { setSm(Sm.active); }
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

  public void cardInserted ()
  {
    queue.put(new Message(MessageType.cardInserted_M, null));
  }

  public void maintain ()
  {
    queue.put(new Message(MessageType.maintain_M, null));
  }

  public void isMaintained ()
  {
    queue.put(new Message(MessageType.isMaintained_M, null));
  }

  public void cancel ()
  {
    queue.put(new Message(MessageType.cancel_M, null));
  }

  public void validated ()
  {
    queue.put(new Message(MessageType.validated_M, null));
  }

  public void select ()
  {
    queue.put(new Message(MessageType.select_M, null));
  }

  public void selectAnotherTransiction ()
  {
    queue.put(new Message(MessageType.selectAnotherTransiction_M, null));
  }

  public void finish ()
  {
    queue.put(new Message(MessageType.finish_M, null));
  }

  public void receiptPrinted ()
  {
    queue.put(new Message(MessageType.receiptPrinted_M, null));
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
        case cardInserted_M:
          status = _cardInserted();
          break;
        case maintain_M:
          status = _maintain();
          break;
        case isMaintained_M:
          status = _isMaintained();
          break;
        case cancel_M:
          status = _cancel();
          break;
        case validated_M:
          status = _validated();
          break;
        case select_M:
          status = _select();
          break;
        case selectAnotherTransiction_M:
          status = _selectAnotherTransiction();
          break;
        case finish_M:
          status = _finish();
          break;
        case receiptPrinted_M:
          status = _receiptPrinted();
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
    return super.toString() + "["+ "]";
  }
}
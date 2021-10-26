/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.queued.method.test;
import java.util.*;
import java.lang.Thread;

// line 3 "../../../../../src/TestHarnessQueuedMethod.ump"
public class QueuedAndNonQueuedMethods
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //QueuedAndNonQueuedMethods Attributes
  private List<String> log;

  //Helper Variables

  protected enum QueuedMethod { queuedMethod_M }  QueuedMethodThread queuedMethodThread;


  //------------------------
  // CONSTRUCTOR
  //------------------------

  public QueuedAndNonQueuedMethods()
  {
    log = new ArrayList<String>();
    queuedMethodThread = new QueuedMethodThread();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addLog(String aLog)
  {
    boolean wasAdded = false;
    wasAdded = log.add(aLog);
    return wasAdded;
  }

  public boolean removeLog(String aLog)
  {
    boolean wasRemoved = false;
    wasRemoved = log.remove(aLog);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  public String getLog(int index)
  {
    String aLog = log.get(index);
    return aLog;
  }

  public String[] getLog()
  {
    String[] newLog = log.toArray(new String[log.size()]);
    return newLog;
  }

  public int numberOfLog()
  {
    int number = log.size();
    return number;
  }

  public boolean hasLog()
  {
    boolean has = log.size() > 0;
    return has;
  }

  public int indexOfLog(String aLog)
  {
    int index = log.indexOf(aLog);
    return index;
  }

  public void delete()
  {
    queuedMethodThread.delete();
  }

  public void queuedMethod ()
  {
    queuedMethodThread.putCallTo(queuedMethodThread.new QueuedMethodMessage(QueuedMethod.queuedMethod_M, null));
  }

  // line 8 "../../../../../src/TestHarnessQueuedMethod.ump"
  public void _queuedMethod(){
    try
    {
      Thread.sleep(500);
      addLog("queuedMethod executed");
    }
    catch(Exception e) {addLog("queuedMethod interrupted");}
  }

  // line 18 "../../../../../src/TestHarnessQueuedMethod.ump"
  public void nonqueuedMethod(){
    try
    {
      Thread.sleep(100);
      addLog("nonqueuedMethod executed");
    }
    catch(Exception e) {addLog("nonqueuedMethod interrupted");}
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
  private class QueuedMethodThread implements Runnable
  {

    QueuedMethodMessageQueue methodQueue;
    Thread methodRemoval;
    
    public QueuedMethodThread()
    {
      methodQueue = new QueuedMethodMessageQueue();
      methodRemoval = new Thread(this);
      //start the thread for queued methods of QueuedAndNonQueuedMethods
      methodRemoval.start();   
    }

    protected class QueuedMethodMessage
    {
      QueuedMethod type;
      
      //QueuedMethodMessage parameters
      Vector<Object> param;
      
      public QueuedMethodMessage(QueuedMethod t, Vector<Object> p)
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
  
    protected class QueuedMethodMessageQueue {
      Queue<QueuedMethodMessage> messages = new LinkedList<QueuedMethodMessage>();
      
      public synchronized void put(QueuedMethodMessage m)
      {
        messages.add(m); 
        notify();
      }

      public synchronized QueuedMethodMessage getNext()
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
        QueuedMethodMessage m = messages.remove(); 
        return (m);
      }
    }

    @Override
    public void run ()
    {
      boolean status=false;
      while (true) 
      {
        QueuedMethodMessage qmm = methodQueue.getNext();
        if(qmm == null)  return;
        switch(qmm.type)
        {
          case queuedMethod_M:
            _queuedMethod();
            break;
          default:
        }
      }
    }
    public void putCallTo(QueuedMethodMessage message)
    {
      methodQueue.put(message);
    }

    public void delete()
    {
       methodRemoval.interrupt();
    }
  }
}
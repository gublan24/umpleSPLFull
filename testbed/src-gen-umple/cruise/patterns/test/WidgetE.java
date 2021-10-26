/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.patterns.test;
import java.util.*;

// line 38 "../../../../src/TestHarnessPatterns.ump"
public class WidgetE
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //WidgetE Attributes
  private List<String> ids;
  private List<String> logs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public WidgetE()
  {
    ids = new ArrayList<String>();
    logs = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addId(String aId)
  {
    boolean wasAdded = false;
    // line 44 "../../../../src/TestHarnessPatterns.ump"
    addLog("before addId:" + numberOfIds());
    // END OF UMPLE BEFORE INJECTION
    wasAdded = ids.add(aId);
    // line 45 "../../../../src/TestHarnessPatterns.ump"
    addLog("after addId:" + numberOfIds());
    // END OF UMPLE AFTER INJECTION
    return wasAdded;
  }

  public boolean removeId(String aId)
  {
    boolean wasRemoved = false;
    // line 46 "../../../../src/TestHarnessPatterns.ump"
    addLog("before removeId:" + numberOfIds());
    // END OF UMPLE BEFORE INJECTION
    wasRemoved = ids.remove(aId);
    // line 47 "../../../../src/TestHarnessPatterns.ump"
    addLog("after removeId:" + numberOfIds());
    // END OF UMPLE AFTER INJECTION
    return wasRemoved;
  }
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
  public String getId(int index)
  {
    // line 50 "../../../../src/TestHarnessPatterns.ump"
    addLog("before getId");
    // END OF UMPLE BEFORE INJECTION
    String aId = ids.get(index);
    // line 51 "../../../../src/TestHarnessPatterns.ump"
    addLog("after getId");
    // END OF UMPLE AFTER INJECTION
    return aId;
  }

  public String[] getIds()
  {
    // line 52 "../../../../src/TestHarnessPatterns.ump"
    addLog("before getIds");
    // END OF UMPLE BEFORE INJECTION
    String[] newIds = ids.toArray(new String[ids.size()]);
    // line 53 "../../../../src/TestHarnessPatterns.ump"
    addLog("after getIds");
    // END OF UMPLE AFTER INJECTION
    return newIds;
  }

  public int numberOfIds()
  {
    int number = ids.size();
    return number;
  }

  public boolean hasIds()
  {
    boolean has = ids.size() > 0;
    return has;
  }

  public int indexOfId(String aId)
  {
    // line 48 "../../../../src/TestHarnessPatterns.ump"
    addLog("before indexOfId");
    // END OF UMPLE BEFORE INJECTION
    int index = ids.indexOf(aId);
    // line 49 "../../../../src/TestHarnessPatterns.ump"
    addLog("after indexOfId");
    // END OF UMPLE AFTER INJECTION
    return index;
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

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}
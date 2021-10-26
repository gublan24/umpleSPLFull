/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.patterns.test;
import java.util.*;

// line 57 "../../../../src/TestHarnessPatterns.ump"
public class WidgetF
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //WidgetF Attributes
  private List<String> ids;
  private List<String> logs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public WidgetF()
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
    wasAdded = ids.add(aId);
    return wasAdded;
  }

  public boolean removeId(String aId)
  {
    boolean wasRemoved = false;
    wasRemoved = ids.remove(aId);
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
    String aId = ids.get(index);
    return aId;
  }

  public String[] getIds()
  {
    String[] newIds = ids.toArray(new String[ids.size()]);
    return newIds;
  }

  public int numberOfIds()
  {
    // line 62 "../../../../src/TestHarnessPatterns.ump"
    addLog("before numberOfIds");
    // END OF UMPLE BEFORE INJECTION
    int number = ids.size();
    // line 63 "../../../../src/TestHarnessPatterns.ump"
    addLog("after numberOfIds");
    // END OF UMPLE AFTER INJECTION
    return number;
  }

  public boolean hasIds()
  {
    boolean has = ids.size() > 0;
    return has;
  }

  public int indexOfId(String aId)
  {
    int index = ids.indexOf(aId);
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
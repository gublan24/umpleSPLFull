/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 221 "../../../../src/Structure.ump"
public class Protocol
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Protocol Attributes
  private MessageHandler msgHandler;

  //Protocol Associations
  private List<Monitor> watchList;
  private List<Trigger> incomingList;
  private List<Trigger> outgoingList;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Protocol()
  {
    watchList = new ArrayList<Monitor>();
    incomingList = new ArrayList<Trigger>();
    outgoingList = new ArrayList<Trigger>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMsgHandler(MessageHandler aMsgHandler)
  {
    boolean wasSet = false;
    msgHandler = aMsgHandler;
    wasSet = true;
    return wasSet;
  }

  public MessageHandler getMsgHandler()
  {
    return msgHandler;
  }
  /* Code from template association_GetMany */
  public Monitor getWatchList(int index)
  {
    Monitor aWatchList = watchList.get(index);
    return aWatchList;
  }

  public List<Monitor> getWatchList()
  {
    List<Monitor> newWatchList = Collections.unmodifiableList(watchList);
    return newWatchList;
  }

  public int numberOfWatchList()
  {
    int number = watchList.size();
    return number;
  }

  public boolean hasWatchList()
  {
    boolean has = watchList.size() > 0;
    return has;
  }

  public int indexOfWatchList(Monitor aWatchList)
  {
    int index = watchList.indexOf(aWatchList);
    return index;
  }
  /* Code from template association_GetMany */
  public Trigger getIncomingList(int index)
  {
    Trigger aIncomingList = incomingList.get(index);
    return aIncomingList;
  }

  public List<Trigger> getIncomingList()
  {
    List<Trigger> newIncomingList = Collections.unmodifiableList(incomingList);
    return newIncomingList;
  }

  public int numberOfIncomingList()
  {
    int number = incomingList.size();
    return number;
  }

  public boolean hasIncomingList()
  {
    boolean has = incomingList.size() > 0;
    return has;
  }

  public int indexOfIncomingList(Trigger aIncomingList)
  {
    int index = incomingList.indexOf(aIncomingList);
    return index;
  }
  /* Code from template association_GetMany */
  public Trigger getOutgoingList(int index)
  {
    Trigger aOutgoingList = outgoingList.get(index);
    return aOutgoingList;
  }

  public List<Trigger> getOutgoingList()
  {
    List<Trigger> newOutgoingList = Collections.unmodifiableList(outgoingList);
    return newOutgoingList;
  }

  public int numberOfOutgoingList()
  {
    int number = outgoingList.size();
    return number;
  }

  public boolean hasOutgoingList()
  {
    boolean has = outgoingList.size() > 0;
    return has;
  }

  public int indexOfOutgoingList(Trigger aOutgoingList)
  {
    int index = outgoingList.indexOf(aOutgoingList);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWatchList()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addWatchList(Monitor aWatchList)
  {
    boolean wasAdded = false;
    if (watchList.contains(aWatchList)) { return false; }
    watchList.add(aWatchList);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeWatchList(Monitor aWatchList)
  {
    boolean wasRemoved = false;
    if (watchList.contains(aWatchList))
    {
      watchList.remove(aWatchList);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWatchListAt(Monitor aWatchList, int index)
  {  
    boolean wasAdded = false;
    if(addWatchList(aWatchList))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWatchList()) { index = numberOfWatchList() - 1; }
      watchList.remove(aWatchList);
      watchList.add(index, aWatchList);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWatchListAt(Monitor aWatchList, int index)
  {
    boolean wasAdded = false;
    if(watchList.contains(aWatchList))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWatchList()) { index = numberOfWatchList() - 1; }
      watchList.remove(aWatchList);
      watchList.add(index, aWatchList);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWatchListAt(aWatchList, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfIncomingList()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addIncomingList(Trigger aIncomingList)
  {
    boolean wasAdded = false;
    if (incomingList.contains(aIncomingList)) { return false; }
    incomingList.add(aIncomingList);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeIncomingList(Trigger aIncomingList)
  {
    boolean wasRemoved = false;
    if (incomingList.contains(aIncomingList))
    {
      incomingList.remove(aIncomingList);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addIncomingListAt(Trigger aIncomingList, int index)
  {  
    boolean wasAdded = false;
    if(addIncomingList(aIncomingList))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfIncomingList()) { index = numberOfIncomingList() - 1; }
      incomingList.remove(aIncomingList);
      incomingList.add(index, aIncomingList);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveIncomingListAt(Trigger aIncomingList, int index)
  {
    boolean wasAdded = false;
    if(incomingList.contains(aIncomingList))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfIncomingList()) { index = numberOfIncomingList() - 1; }
      incomingList.remove(aIncomingList);
      incomingList.add(index, aIncomingList);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addIncomingListAt(aIncomingList, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfOutgoingList()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addOutgoingList(Trigger aOutgoingList)
  {
    boolean wasAdded = false;
    if (outgoingList.contains(aOutgoingList)) { return false; }
    outgoingList.add(aOutgoingList);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeOutgoingList(Trigger aOutgoingList)
  {
    boolean wasRemoved = false;
    if (outgoingList.contains(aOutgoingList))
    {
      outgoingList.remove(aOutgoingList);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addOutgoingListAt(Trigger aOutgoingList, int index)
  {  
    boolean wasAdded = false;
    if(addOutgoingList(aOutgoingList))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOutgoingList()) { index = numberOfOutgoingList() - 1; }
      outgoingList.remove(aOutgoingList);
      outgoingList.add(index, aOutgoingList);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOutgoingListAt(Trigger aOutgoingList, int index)
  {
    boolean wasAdded = false;
    if(outgoingList.contains(aOutgoingList))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOutgoingList()) { index = numberOfOutgoingList() - 1; }
      outgoingList.remove(aOutgoingList);
      outgoingList.add(index, aOutgoingList);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOutgoingListAt(aOutgoingList, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    watchList.clear();
    incomingList.clear();
    outgoingList.clear();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "msgHandler" + "=" + (getMsgHandler() != null ? !getMsgHandler().equals(this)  ? getMsgHandler().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
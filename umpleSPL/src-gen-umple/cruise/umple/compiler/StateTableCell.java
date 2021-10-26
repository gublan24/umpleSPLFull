/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Cell in a state table containing the resulting state or the event that results in transition
 */
// line 263 "../../../../src/Generator_CodeStateTables.ump"
public class StateTableCell
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateTableCell Associations
  private List<StateTableEntry> stateTableEntries;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateTableCell()
  {
    stateTableEntries = new ArrayList<StateTableEntry>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public StateTableEntry getStateTableEntry(int index)
  {
    StateTableEntry aStateTableEntry = stateTableEntries.get(index);
    return aStateTableEntry;
  }

  public List<StateTableEntry> getStateTableEntries()
  {
    List<StateTableEntry> newStateTableEntries = Collections.unmodifiableList(stateTableEntries);
    return newStateTableEntries;
  }

  public int numberOfStateTableEntries()
  {
    int number = stateTableEntries.size();
    return number;
  }

  public boolean hasStateTableEntries()
  {
    boolean has = stateTableEntries.size() > 0;
    return has;
  }

  public int indexOfStateTableEntry(StateTableEntry aStateTableEntry)
  {
    int index = stateTableEntries.indexOf(aStateTableEntry);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStateTableEntries()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addStateTableEntry(StateTableEntry aStateTableEntry)
  {
    boolean wasAdded = false;
    if (stateTableEntries.contains(aStateTableEntry)) { return false; }
    stateTableEntries.add(aStateTableEntry);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStateTableEntry(StateTableEntry aStateTableEntry)
  {
    boolean wasRemoved = false;
    if (stateTableEntries.contains(aStateTableEntry))
    {
      stateTableEntries.remove(aStateTableEntry);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStateTableEntryAt(StateTableEntry aStateTableEntry, int index)
  {  
    boolean wasAdded = false;
    if(addStateTableEntry(aStateTableEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStateTableEntries()) { index = numberOfStateTableEntries() - 1; }
      stateTableEntries.remove(aStateTableEntry);
      stateTableEntries.add(index, aStateTableEntry);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStateTableEntryAt(StateTableEntry aStateTableEntry, int index)
  {
    boolean wasAdded = false;
    if(stateTableEntries.contains(aStateTableEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStateTableEntries()) { index = numberOfStateTableEntries() - 1; }
      stateTableEntries.remove(aStateTableEntry);
      stateTableEntries.add(index, aStateTableEntry);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStateTableEntryAt(aStateTableEntry, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    stateTableEntries.clear();
  }

  // line 269 "../../../../src/Generator_CodeStateTables.ump"
   public StringBuilder htmlString(){
    StringBuilder sb = new StringBuilder();
    boolean isFirst = true;
    for(StateTableEntry entry : getStateTableEntries())
    {
      if(isFirst)
      {
        isFirst = false;
        sb.append(entry.htmlString());
      } 
      else
      {
        sb.append("<br>");
        sb.append(entry.htmlString());
      }
    }

    return sb;
  }

}
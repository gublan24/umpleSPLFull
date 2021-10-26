/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Represents a row in the Event Sequence table. This has a state name as a row
 * label
 */
// line 624 "../../../../src/Generator_CodeEventSequence.ump"
public class EventSequenceTableRow
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventSequenceTableRow Attributes
  private StateWrapper rowState;
  private boolean isHeader;

  //EventSequenceTableRow Associations
  private List<EventSequenceCell> eventSequenceCells;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventSequenceTableRow(StateWrapper aRowState)
  {
    rowState = aRowState;
    isHeader = false;
    eventSequenceCells = new ArrayList<EventSequenceCell>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRowState(StateWrapper aRowState)
  {
    boolean wasSet = false;
    rowState = aRowState;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsHeader(boolean aIsHeader)
  {
    boolean wasSet = false;
    isHeader = aIsHeader;
    wasSet = true;
    return wasSet;
  }

  public StateWrapper getRowState()
  {
    return rowState;
  }

  public boolean getIsHeader()
  {
    return isHeader;
  }
  /* Code from template association_GetMany */
  public EventSequenceCell getEventSequenceCell(int index)
  {
    EventSequenceCell aEventSequenceCell = eventSequenceCells.get(index);
    return aEventSequenceCell;
  }

  public List<EventSequenceCell> getEventSequenceCells()
  {
    List<EventSequenceCell> newEventSequenceCells = Collections.unmodifiableList(eventSequenceCells);
    return newEventSequenceCells;
  }

  public int numberOfEventSequenceCells()
  {
    int number = eventSequenceCells.size();
    return number;
  }

  public boolean hasEventSequenceCells()
  {
    boolean has = eventSequenceCells.size() > 0;
    return has;
  }

  public int indexOfEventSequenceCell(EventSequenceCell aEventSequenceCell)
  {
    int index = eventSequenceCells.indexOf(aEventSequenceCell);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEventSequenceCells()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addEventSequenceCell(EventSequenceCell aEventSequenceCell)
  {
    boolean wasAdded = false;
    if (eventSequenceCells.contains(aEventSequenceCell)) { return false; }
    eventSequenceCells.add(aEventSequenceCell);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEventSequenceCell(EventSequenceCell aEventSequenceCell)
  {
    boolean wasRemoved = false;
    if (eventSequenceCells.contains(aEventSequenceCell))
    {
      eventSequenceCells.remove(aEventSequenceCell);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEventSequenceCellAt(EventSequenceCell aEventSequenceCell, int index)
  {  
    boolean wasAdded = false;
    if(addEventSequenceCell(aEventSequenceCell))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEventSequenceCells()) { index = numberOfEventSequenceCells() - 1; }
      eventSequenceCells.remove(aEventSequenceCell);
      eventSequenceCells.add(index, aEventSequenceCell);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEventSequenceCellAt(EventSequenceCell aEventSequenceCell, int index)
  {
    boolean wasAdded = false;
    if(eventSequenceCells.contains(aEventSequenceCell))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEventSequenceCells()) { index = numberOfEventSequenceCells() - 1; }
      eventSequenceCells.remove(aEventSequenceCell);
      eventSequenceCells.add(index, aEventSequenceCell);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEventSequenceCellAt(aEventSequenceCell, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    eventSequenceCells.clear();
  }

  // line 633 "../../../../src/Generator_CodeEventSequence.ump"
   public void addCell(State activeState){
    if(activeState == rowState.getWrappedState())
    {
      addEventSequenceCell(new EventSequenceCell(false, "X"));
    }
    else
    {
      addEventSequenceCell(new EventSequenceCell(true, ""));
    }
  }


  /**
   * Outputs this row
   */
  // line 646 "../../../../src/Generator_CodeEventSequence.ump"
   public StringBuilder output(EventSequenceTemplate templater){
    StringBuilder rowSb = new StringBuilder();
    boolean isFirst = true;

    rowSb.append(templater.genGridRowStart());

    for(EventSequenceCell cell : getEventSequenceCells())
    {
      if(isFirst)
      {
        rowSb.append(cell.outputFirst(templater, rowState.getParentId()));
        isFirst = false;
      }
      else
      {
        rowSb.append(cell.output(templater));
      }
    }

    rowSb.append(templater.genGridRowEnd());
    return rowSb;
  }


  public String toString()
  {
    return super.toString() + "["+
            "isHeader" + ":" + getIsHeader()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rowState" + "=" + (getRowState() != null ? !getRowState().equals(this)  ? getRowState().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
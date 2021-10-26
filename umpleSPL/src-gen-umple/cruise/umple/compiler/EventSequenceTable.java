/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * The grid-type view of the event sequence, with the possible states as rows
 * and the sequence of events as columns.
 */
// line 507 "../../../../src/Generator_CodeEventSequence.ump"
public class EventSequenceTable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventSequenceTable Attributes
  private int gridId;
  private int nextEventNumber;

  //EventSequenceTable Associations
  private List<StateWrapper> headerStates;
  private List<EventSequenceTableRow> eventSequenceTableRows;
  private EventSequenceTableHeaderRow headerRow;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventSequenceTable(int aGridId)
  {
    gridId = aGridId;
    nextEventNumber = 0;
    headerStates = new ArrayList<StateWrapper>();
    eventSequenceTableRows = new ArrayList<EventSequenceTableRow>();
    // line 519 "../../../../src/Generator_CodeEventSequence.ump"
    headerRow = new EventSequenceTableHeaderRow();
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGridId(int aGridId)
  {
    boolean wasSet = false;
    gridId = aGridId;
    wasSet = true;
    return wasSet;
  }

  public boolean setNextEventNumber(int aNextEventNumber)
  {
    boolean wasSet = false;
    nextEventNumber = aNextEventNumber;
    wasSet = true;
    return wasSet;
  }

  public int getGridId()
  {
    return gridId;
  }

  public int getNextEventNumber()
  {
    return nextEventNumber;
  }
  /* Code from template association_GetMany */
  public StateWrapper getHeaderState(int index)
  {
    StateWrapper aHeaderState = headerStates.get(index);
    return aHeaderState;
  }

  public List<StateWrapper> getHeaderStates()
  {
    List<StateWrapper> newHeaderStates = Collections.unmodifiableList(headerStates);
    return newHeaderStates;
  }

  public int numberOfHeaderStates()
  {
    int number = headerStates.size();
    return number;
  }

  public boolean hasHeaderStates()
  {
    boolean has = headerStates.size() > 0;
    return has;
  }

  public int indexOfHeaderState(StateWrapper aHeaderState)
  {
    int index = headerStates.indexOf(aHeaderState);
    return index;
  }
  /* Code from template association_GetMany */
  public EventSequenceTableRow getEventSequenceTableRow(int index)
  {
    EventSequenceTableRow aEventSequenceTableRow = eventSequenceTableRows.get(index);
    return aEventSequenceTableRow;
  }

  public List<EventSequenceTableRow> getEventSequenceTableRows()
  {
    List<EventSequenceTableRow> newEventSequenceTableRows = Collections.unmodifiableList(eventSequenceTableRows);
    return newEventSequenceTableRows;
  }

  public int numberOfEventSequenceTableRows()
  {
    int number = eventSequenceTableRows.size();
    return number;
  }

  public boolean hasEventSequenceTableRows()
  {
    boolean has = eventSequenceTableRows.size() > 0;
    return has;
  }

  public int indexOfEventSequenceTableRow(EventSequenceTableRow aEventSequenceTableRow)
  {
    int index = eventSequenceTableRows.indexOf(aEventSequenceTableRow);
    return index;
  }
  /* Code from template association_GetOne */
  public EventSequenceTableHeaderRow getHeaderRow()
  {
    return headerRow;
  }

  public boolean hasHeaderRow()
  {
    boolean has = headerRow != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfHeaderStates()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addHeaderState(StateWrapper aHeaderState)
  {
    boolean wasAdded = false;
    if (headerStates.contains(aHeaderState)) { return false; }
    headerStates.add(aHeaderState);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeHeaderState(StateWrapper aHeaderState)
  {
    boolean wasRemoved = false;
    if (headerStates.contains(aHeaderState))
    {
      headerStates.remove(aHeaderState);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addHeaderStateAt(StateWrapper aHeaderState, int index)
  {  
    boolean wasAdded = false;
    if(addHeaderState(aHeaderState))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHeaderStates()) { index = numberOfHeaderStates() - 1; }
      headerStates.remove(aHeaderState);
      headerStates.add(index, aHeaderState);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveHeaderStateAt(StateWrapper aHeaderState, int index)
  {
    boolean wasAdded = false;
    if(headerStates.contains(aHeaderState))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHeaderStates()) { index = numberOfHeaderStates() - 1; }
      headerStates.remove(aHeaderState);
      headerStates.add(index, aHeaderState);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addHeaderStateAt(aHeaderState, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEventSequenceTableRows()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addEventSequenceTableRow(EventSequenceTableRow aEventSequenceTableRow)
  {
    boolean wasAdded = false;
    if (eventSequenceTableRows.contains(aEventSequenceTableRow)) { return false; }
    eventSequenceTableRows.add(aEventSequenceTableRow);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEventSequenceTableRow(EventSequenceTableRow aEventSequenceTableRow)
  {
    boolean wasRemoved = false;
    if (eventSequenceTableRows.contains(aEventSequenceTableRow))
    {
      eventSequenceTableRows.remove(aEventSequenceTableRow);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEventSequenceTableRowAt(EventSequenceTableRow aEventSequenceTableRow, int index)
  {  
    boolean wasAdded = false;
    if(addEventSequenceTableRow(aEventSequenceTableRow))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEventSequenceTableRows()) { index = numberOfEventSequenceTableRows() - 1; }
      eventSequenceTableRows.remove(aEventSequenceTableRow);
      eventSequenceTableRows.add(index, aEventSequenceTableRow);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEventSequenceTableRowAt(EventSequenceTableRow aEventSequenceTableRow, int index)
  {
    boolean wasAdded = false;
    if(eventSequenceTableRows.contains(aEventSequenceTableRow))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEventSequenceTableRows()) { index = numberOfEventSequenceTableRows() - 1; }
      eventSequenceTableRows.remove(aEventSequenceTableRow);
      eventSequenceTableRows.add(index, aEventSequenceTableRow);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEventSequenceTableRowAt(aEventSequenceTableRow, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setHeaderRow(EventSequenceTableHeaderRow aNewHeaderRow)
  {
    boolean wasSet = false;
    headerRow = aNewHeaderRow;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    headerStates.clear();
    eventSequenceTableRows.clear();
    headerRow = null;
  }


  /**
   * Adds a column to the table, puts an X in the row with the active state
   */
  // line 525 "../../../../src/Generator_CodeEventSequence.ump"
   public void addColumn(StateWrapper activeState, String triggeringEvent){
    addToHeaderRow(triggeringEvent);
    for(EventSequenceTableRow row : getEventSequenceTableRows())
    {
      row.addCell(activeState.getWrappedState());
    }
  }


  /**
   * Adds a row to the table, puts the state name in the first cell of the row
   */
  // line 535 "../../../../src/Generator_CodeEventSequence.ump"
   public void addRow(StateWrapper rowState){
    addHeaderState(rowState);
    addEventSequenceTableRow(new EventSequenceTableRow(rowState));
  }


  /**
   * Outputs the entire table
   */
  // line 542 "../../../../src/Generator_CodeEventSequence.ump"
   public StringBuilder output(EventSequenceTemplate templater){
    StringBuilder tableSb = new StringBuilder();
    tableSb.append(templater.genGridHeader());
    tableSb.append(templater.genGridContainer(gridId));

    //Outputting the floating grid header
    tableSb.append(templater.genFloaterHeader());

    tableSb.append(templater.genFloaterRowStart());
    tableSb.append(templater.genFloaterFirstCell(templater.GRID_FLOATER_FIRST,
                                            "States"));
    tableSb.append(templater.genFloaterRowEnd());

    for(StateWrapper state : headerStates)
    {
      tableSb.append(templater.genFloaterRowStart());
      tableSb.append(templater.genFloaterCell(templater.GRID_FLOATER,
                                              state.getParentId(),
                                              state.getDashedName()));
      tableSb.append(templater.genFloaterRowEnd());
    }

    tableSb.append(templater.genFloaterFooter());

    //Outputting the body of the event grid
    tableSb.append(templater.genGridBodyHeader());

    tableSb.append(headerRow.output(templater));

    for(EventSequenceTableRow row : getEventSequenceTableRows())
    {
      tableSb.append(row.output(templater));
    }

    tableSb.append(templater.genGridBodyFooter());
    tableSb.append(templater.genGridContainerFooter());
    tableSb.append(templater.genGridEnd());
    return tableSb;
  }

  // line 583 "../../../../src/Generator_CodeEventSequence.ump"
   private void addToHeaderRow(String eventLabel){
    if(nextEventNumber == 0)
    {
      headerRow.addCell(eventLabel);
    }
    else
    {
      headerRow.addCell(String.valueOf(nextEventNumber) + ". " + eventLabel);
    }
    nextEventNumber++;
  }


  public String toString()
  {
    return super.toString() + "["+
            "gridId" + ":" + getGridId()+ "," +
            "nextEventNumber" + ":" + getNextEventNumber()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "headerRow = "+(getHeaderRow()!=null?Integer.toHexString(System.identityHashCode(getHeaderRow())):"null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * This is the list-style view for the event sequence. It has two primary rows.
 * The first row is the sequence of events generated, the second row is the
 * the state resulting from that event.
 */
// line 720 "../../../../src/Generator_CodeEventSequence.ump"
public class EventSequenceList
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventSequenceList Attributes
  private int eventCount;

  //EventSequenceList Associations
  private List<EventListRow> eventListRows;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventSequenceList()
  {
    eventCount = 1;
    eventListRows = new ArrayList<EventListRow>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setEventCount(int aEventCount)
  {
    boolean wasSet = false;
    eventCount = aEventCount;
    wasSet = true;
    return wasSet;
  }

  public int getEventCount()
  {
    return eventCount;
  }
  /* Code from template association_GetMany */
  public EventListRow getEventListRow(int index)
  {
    EventListRow aEventListRow = eventListRows.get(index);
    return aEventListRow;
  }

  public List<EventListRow> getEventListRows()
  {
    List<EventListRow> newEventListRows = Collections.unmodifiableList(eventListRows);
    return newEventListRows;
  }

  public int numberOfEventListRows()
  {
    int number = eventListRows.size();
    return number;
  }

  public boolean hasEventListRows()
  {
    boolean has = eventListRows.size() > 0;
    return has;
  }

  public int indexOfEventListRow(EventListRow aEventListRow)
  {
    int index = eventListRows.indexOf(aEventListRow);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEventListRows()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addEventListRow(EventListRow aEventListRow)
  {
    boolean wasAdded = false;
    if (eventListRows.contains(aEventListRow)) { return false; }
    eventListRows.add(aEventListRow);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEventListRow(EventListRow aEventListRow)
  {
    boolean wasRemoved = false;
    if (eventListRows.contains(aEventListRow))
    {
      eventListRows.remove(aEventListRow);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEventListRowAt(EventListRow aEventListRow, int index)
  {  
    boolean wasAdded = false;
    if(addEventListRow(aEventListRow))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEventListRows()) { index = numberOfEventListRows() - 1; }
      eventListRows.remove(aEventListRow);
      eventListRows.add(index, aEventListRow);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEventListRowAt(EventListRow aEventListRow, int index)
  {
    boolean wasAdded = false;
    if(eventListRows.contains(aEventListRow))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEventListRows()) { index = numberOfEventListRows() - 1; }
      eventListRows.remove(aEventListRow);
      eventListRows.add(index, aEventListRow);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEventListRowAt(aEventListRow, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    eventListRows.clear();
  }

  // line 728 "../../../../src/Generator_CodeEventSequence.ump"
   public void addFirstRow(StateWrapper resultingState, String triggeringEvent){
    addEventListRow(new EventListRow("", 
      "START", 
      triggeringEvent, 
      resultingState.getDottedName()));
  }

  // line 736 "../../../../src/Generator_CodeEventSequence.ump"
   public void addRow(StateWrapper resultingState, String triggeringEvent){
    addEventListRow(new EventListRow("", 
      String.valueOf(eventCount), 
      triggeringEvent, 
      resultingState.getDottedName()));

    eventCount++;
  }

  // line 746 "../../../../src/Generator_CodeEventSequence.ump"
   public StringBuilder output(EventSequenceTemplate templater){
    StringBuilder outputSb = new StringBuilder();

    outputSb.append(templater.genListStart());

    outputSb.append(new EventListRow(
      templater.TABLE_HEADER, 
      "Event<br>Number",
      "Event",
      "Next State").output(templater));

    for(EventListRow row : eventListRows)
    {
      outputSb.append(row.output(templater));
    }

    outputSb.append(templater.genListEnd());

    return outputSb;
  }


  public String toString()
  {
    return super.toString() + "["+
            "eventCount" + ":" + getEventCount()+ "]";
  }
}
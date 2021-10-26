/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Represents the header row of a Event Sequence table.
 */
// line 596 "../../../../src/Generator_CodeEventSequence.ump"
public class EventSequenceTableHeaderRow
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventSequenceTableHeaderRow Associations
  private List<EventSequenceHeaderCell> eventSequenceHeaderCells;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventSequenceTableHeaderRow()
  {
    eventSequenceHeaderCells = new ArrayList<EventSequenceHeaderCell>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public EventSequenceHeaderCell getEventSequenceHeaderCell(int index)
  {
    EventSequenceHeaderCell aEventSequenceHeaderCell = eventSequenceHeaderCells.get(index);
    return aEventSequenceHeaderCell;
  }

  public List<EventSequenceHeaderCell> getEventSequenceHeaderCells()
  {
    List<EventSequenceHeaderCell> newEventSequenceHeaderCells = Collections.unmodifiableList(eventSequenceHeaderCells);
    return newEventSequenceHeaderCells;
  }

  public int numberOfEventSequenceHeaderCells()
  {
    int number = eventSequenceHeaderCells.size();
    return number;
  }

  public boolean hasEventSequenceHeaderCells()
  {
    boolean has = eventSequenceHeaderCells.size() > 0;
    return has;
  }

  public int indexOfEventSequenceHeaderCell(EventSequenceHeaderCell aEventSequenceHeaderCell)
  {
    int index = eventSequenceHeaderCells.indexOf(aEventSequenceHeaderCell);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEventSequenceHeaderCells()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addEventSequenceHeaderCell(EventSequenceHeaderCell aEventSequenceHeaderCell)
  {
    boolean wasAdded = false;
    if (eventSequenceHeaderCells.contains(aEventSequenceHeaderCell)) { return false; }
    eventSequenceHeaderCells.add(aEventSequenceHeaderCell);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEventSequenceHeaderCell(EventSequenceHeaderCell aEventSequenceHeaderCell)
  {
    boolean wasRemoved = false;
    if (eventSequenceHeaderCells.contains(aEventSequenceHeaderCell))
    {
      eventSequenceHeaderCells.remove(aEventSequenceHeaderCell);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEventSequenceHeaderCellAt(EventSequenceHeaderCell aEventSequenceHeaderCell, int index)
  {  
    boolean wasAdded = false;
    if(addEventSequenceHeaderCell(aEventSequenceHeaderCell))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEventSequenceHeaderCells()) { index = numberOfEventSequenceHeaderCells() - 1; }
      eventSequenceHeaderCells.remove(aEventSequenceHeaderCell);
      eventSequenceHeaderCells.add(index, aEventSequenceHeaderCell);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEventSequenceHeaderCellAt(EventSequenceHeaderCell aEventSequenceHeaderCell, int index)
  {
    boolean wasAdded = false;
    if(eventSequenceHeaderCells.contains(aEventSequenceHeaderCell))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEventSequenceHeaderCells()) { index = numberOfEventSequenceHeaderCells() - 1; }
      eventSequenceHeaderCells.remove(aEventSequenceHeaderCell);
      eventSequenceHeaderCells.add(index, aEventSequenceHeaderCell);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEventSequenceHeaderCellAt(aEventSequenceHeaderCell, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    eventSequenceHeaderCells.clear();
  }

  // line 602 "../../../../src/Generator_CodeEventSequence.ump"
   public void addCell(String eventLabel){
    addEventSequenceHeaderCell(new EventSequenceHeaderCell(eventLabel));
  }


  /**
   * Outputs the header row
   */
  // line 608 "../../../../src/Generator_CodeEventSequence.ump"
   public StringBuilder output(EventSequenceTemplate templater){
    StringBuilder rowSb = new StringBuilder();

    rowSb.append(templater.genGridRowStart());

    for(EventSequenceHeaderCell cell : getEventSequenceHeaderCells())
    {
      rowSb.append(cell.output(templater));
    }

    rowSb.append(templater.genGridRowEnd());
    return rowSb;
  }

}
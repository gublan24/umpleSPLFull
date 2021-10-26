/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 362 "../../../../src/Generator_CodeStateTables.ump"
public class StateTable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateTable Attributes
  private UmpleClass uClass;
  private StateMachine sm;
  private List<String> allEvents;

  //StateTable Associations
  private List<StateTableRow> rows;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateTable(UmpleClass aUClass, StateMachine aSm)
  {
    uClass = aUClass;
    sm = aSm;
    allEvents = null;
    rows = new ArrayList<StateTableRow>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUClass(UmpleClass aUClass)
  {
    boolean wasSet = false;
    uClass = aUClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setSm(StateMachine aSm)
  {
    boolean wasSet = false;
    sm = aSm;
    wasSet = true;
    return wasSet;
  }

  public boolean setAllEvents(List<String> aAllEvents)
  {
    boolean wasSet = false;
    allEvents = aAllEvents;
    wasSet = true;
    return wasSet;
  }

  public UmpleClass getUClass()
  {
    return uClass;
  }

  public StateMachine getSm()
  {
    return sm;
  }

  /**
   * will be populated by call to buildAllEvents
   */
  public List<String> getAllEvents()
  {
    return allEvents;
  }
  /* Code from template association_GetMany */
  public StateTableRow getRow(int index)
  {
    StateTableRow aRow = rows.get(index);
    return aRow;
  }

  /**
   * Rows to be output for each state
   */
  public List<StateTableRow> getRows()
  {
    List<StateTableRow> newRows = Collections.unmodifiableList(rows);
    return newRows;
  }

  public int numberOfRows()
  {
    int number = rows.size();
    return number;
  }

  public boolean hasRows()
  {
    boolean has = rows.size() > 0;
    return has;
  }

  public int indexOfRow(StateTableRow aRow)
  {
    int index = rows.indexOf(aRow);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRows()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public StateTableRow addRow(State aUState, String aSLabel, int aNestingLevel, StateTableRow aParent, int aTableRowId)
  {
    return new StateTableRow(aUState, aSLabel, aNestingLevel, aParent, aTableRowId, this);
  }

  public boolean addRow(StateTableRow aRow)
  {
    boolean wasAdded = false;
    if (rows.contains(aRow)) { return false; }
    StateTable existingStateTable = aRow.getStateTable();
    boolean isNewStateTable = existingStateTable != null && !this.equals(existingStateTable);
    if (isNewStateTable)
    {
      aRow.setStateTable(this);
    }
    else
    {
      rows.add(aRow);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeRow(StateTableRow aRow)
  {
    boolean wasRemoved = false;
    //Unable to remove aRow, as it must always have a stateTable
    if (!this.equals(aRow.getStateTable()))
    {
      rows.remove(aRow);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRowAt(StateTableRow aRow, int index)
  {  
    boolean wasAdded = false;
    if(addRow(aRow))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRows()) { index = numberOfRows() - 1; }
      rows.remove(aRow);
      rows.add(index, aRow);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRowAt(StateTableRow aRow, int index)
  {
    boolean wasAdded = false;
    if(rows.contains(aRow))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRows()) { index = numberOfRows() - 1; }
      rows.remove(aRow);
      rows.add(index, aRow);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRowAt(aRow, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=rows.size(); i > 0; i--)
    {
      StateTableRow aRow = rows.get(i - 1);
      aRow.delete();
    }
  }


  /**
   * Outputs the Event State table - with states as cells
   */
  // line 372 "../../../../src/Generator_CodeStateTables.ump"
   public StringBuilder stateEventTableHtml(StringBuilder sb){
    sb.append("<div class=\"statetable-container\">\n");
    sb.append("  <table class=\"statetable event-statetable\">\n");

    // Output row headers - blank cell + list of events
    sb.append("    <tr>\n      <td class=\"event-header\">&nbsp;</td>\n");
    for(String e : allEvents) 
    {
      sb.append("      <td class=\"event-header\">");
      sb.append(e);
      sb.append("</td>\n");
    }
    sb.append("    </tr>\n\n");

    // Output each row
    for(StateTableRow row : rows) 
    {
      sb.append("    <tr>\n");
      sb.append(row.stateEventTableRowHtml());
      sb.append("    </tr>\n\n");
    }

    sb.append("  </table>\n");
    sb.append("</div>\n\n");
    return(sb);
  }


  /**
   * Outputs the State State table - with events as cells
   */
  // line 401 "../../../../src/Generator_CodeStateTables.ump"
   public StringBuilder stateStateTableHtml(StringBuilder sb){
    sb.append("<div class=\"statetable-container\">\n");
    sb.append("  <table class=\"statetable state-statetable\">\n");

    // Output row headers - blank cell + list of states (same as rows)
    sb.append("    <tr>\n      <td class=\"state-header\">&nbsp;</td>\n");
    for(StateTableRow col : rows) {
      String stateName = col.getSLabel();
      sb.append("      <td class=\"state-header\">");
      sb.append(stateName);
      sb.append("</td>\n");
    }
    sb.append("    </tr>\n\n");

    // Output each row
    for(StateTableRow row : rows) 
    {
      sb.append("    <tr>\n");
      sb.append(row.stateStateTableRowHtml());
      sb.append("    </tr>\n\n");
    }

    sb.append("  </table>\n");
    sb.append("</div>\n\n");
    return(sb);
  }


  /**
   * Builds the columns after the rest of the tables are made
   */
  // line 430 "../../../../src/Generator_CodeStateTables.ump"
   public void buildAllEvents(){
    HashSet<String> eventSet = new HashSet<String>();
    for (StateTableRow row : rows) 
    {
      eventSet.addAll(row.getStateEventCells().keySet());
    }
    allEvents = new ArrayList<String>(eventSet);

    Collections.sort(allEvents);
  }


  /**
   * The first call to the recursive state machine walking
   */
  // line 442 "../../../../src/Generator_CodeStateTables.ump"
   public void buildRecursivelyEntry(StateMachine theSm){
    int nestingLevel = 0;
    int currentId = 0;
    buildRecursively(theSm, nestingLevel, currentId, null);
  }


  /**
   * Walks the state machine adding rows as needed
   */
  // line 453 "../../../../src/Generator_CodeStateTables.ump"
   public int buildRecursively(StateMachine theSm, int nestingLevel, int currentId, StateTableRow parent){
    String sLabel;
    StateTableRow stateRow = null;
    String smName, clSmName;
    boolean isPseudo = false;

    // We haven't processed any states yet in this statemachine
    Boolean isFirstState = true;

    // Iterate (recursively) through the states of this state machine
    for (State s : theSm.getStates())
    {
      sLabel=s.getName();  // This is what is displayed
      if(sLabel.equals("HStar")) sLabel="H*";
      isPseudo = sLabel.equals("H") || sLabel.equals("H*");

      // Add a row for this state  - automatically adds to 'rows' as there is an association
      stateRow = new StateTableRow(s, sLabel, nestingLevel, parent, currentId, this);
      stateRow.build();
      currentId++;

      for (StateMachine nestedSm : s.getNestedStateMachines())
      {
      	currentId = buildRecursively(nestedSm, nestingLevel + 1, currentId, stateRow);
      }

    }  // End iteration through the states, adding rows at this level of nesting

    return currentId;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uClass" + "=" + (getUClass() != null ? !getUClass().equals(this)  ? getUClass().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "sm" + "=" + (getSm() != null ? !getSm().equals(this)  ? getSm().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "allEvents" + "=" + (getAllEvents() != null ? !getAllEvents().equals(this)  ? getAllEvents().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.Map;
import java.util.HashMap;

/**
 * Row in a state-state table and state-event table
 * Also iterated through as columns in a state-state-table
 */
// line 42 "../../../../src/Generator_CodeStateTables.ump"
public class StateTableRow
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateTableRow Attributes
  private State uState;
  private String sLabel;
  private int nestingLevel;
  private StateTableRow parent;
  private int tableRowId;
  private boolean isPseudo;
  private Map<String,StateTableCell> stateEventCells;
  private Map<State,StateTableCell> stateStateCells;

  //StateTableRow Associations
  private StateTable stateTable;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateTableRow(State aUState, String aSLabel, int aNestingLevel, StateTableRow aParent, int aTableRowId, StateTable aStateTable)
  {
    uState = aUState;
    sLabel = aSLabel;
    nestingLevel = aNestingLevel;
    parent = aParent;
    tableRowId = aTableRowId;
    isPseudo = false;
    stateEventCells = new HashMap<String,StateTableCell>();
    stateStateCells = new HashMap<State,StateTableCell>();
    boolean didAddStateTable = setStateTable(aStateTable);
    if (!didAddStateTable)
    {
      throw new RuntimeException("Unable to create row due to stateTable. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUState(State aUState)
  {
    boolean wasSet = false;
    uState = aUState;
    wasSet = true;
    return wasSet;
  }

  public boolean setSLabel(String aSLabel)
  {
    boolean wasSet = false;
    sLabel = aSLabel;
    wasSet = true;
    return wasSet;
  }

  public boolean setNestingLevel(int aNestingLevel)
  {
    boolean wasSet = false;
    nestingLevel = aNestingLevel;
    wasSet = true;
    return wasSet;
  }

  public boolean setParent(StateTableRow aParent)
  {
    boolean wasSet = false;
    parent = aParent;
    wasSet = true;
    return wasSet;
  }

  public boolean setTableRowId(int aTableRowId)
  {
    boolean wasSet = false;
    tableRowId = aTableRowId;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsPseudo(boolean aIsPseudo)
  {
    boolean wasSet = false;
    isPseudo = aIsPseudo;
    wasSet = true;
    return wasSet;
  }

  public boolean setStateEventCells(Map<String,StateTableCell> aStateEventCells)
  {
    boolean wasSet = false;
    stateEventCells = aStateEventCells;
    wasSet = true;
    return wasSet;
  }

  public boolean setStateStateCells(Map<State,StateTableCell> aStateStateCells)
  {
    boolean wasSet = false;
    stateStateCells = aStateStateCells;
    wasSet = true;
    return wasSet;
  }

  /**
   * The state for this row (or column)
   */
  public State getUState()
  {
    return uState;
  }

  /**
   * The label to be used for the state
   */
  public String getSLabel()
  {
    return sLabel;
  }

  /**
   * Higher number means it is a substate
   */
  public int getNestingLevel()
  {
    return nestingLevel;
  }

  /**
   * null if not nested
   */
  public StateTableRow getParent()
  {
    return parent;
  }

  /**
   * The unique id of this row
   */
  public int getTableRowId()
  {
    return tableRowId;
  }

  /**
   * H or H* Can never actually be in this so skipped as a row
   */
  public boolean getIsPseudo()
  {
    return isPseudo;
  }

  public Map<String,StateTableCell> getStateEventCells()
  {
    return stateEventCells;
  }

  public Map<State,StateTableCell> getStateStateCells()
  {
    return stateStateCells;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsPseudo()
  {
    return isPseudo;
  }
  /* Code from template association_GetOne */
  public StateTable getStateTable()
  {
    return stateTable;
  }
  /* Code from template association_SetOneToMany */
  public boolean setStateTable(StateTable aStateTable)
  {
    boolean wasSet = false;
    if (aStateTable == null)
    {
      return wasSet;
    }

    StateTable existingStateTable = stateTable;
    stateTable = aStateTable;
    if (existingStateTable != null && !existingStateTable.equals(aStateTable))
    {
      existingStateTable.removeRow(this);
    }
    stateTable.addRow(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    StateTable placeholderStateTable = stateTable;
    this.stateTable = null;
    if(placeholderStateTable != null)
    {
      placeholderStateTable.removeRow(this);
    }
  }


  /**
   * Add cells for the entire row of transitions
   */
  // line 60 "../../../../src/Generator_CodeStateTables.ump"
   public void build(){
    boolean isDerived = false;
    StateTableRow curRow = this;
    State curState;

    //Loops through this row and its parents to find transitions
    while(curRow != null) 
    {
      curState = curRow.getUState();
      extractTransitions(curState, isDerived);
      curRow = curRow.getParent();
      isDerived = true;
    }
  }


  /**
   * End of build() method
   * Output this row of the stateEvent Table (not including tr tags
   */
  // line 78 "../../../../src/Generator_CodeStateTables.ump"
   public StringBuilder stateEventTableRowHtml(){
    StringBuilder sb = new StringBuilder();

    // Output the name of the state with appropriate nesting
    firstCellInRow(sb);

    // Loop through all events, find the event in the hash table, and output each cell

    for(String ev : getStateTable().getAllEvents()) 
    {
      sb.append("      <td class=\"event-entry\">");
      if(stateEventCells.containsKey(ev)) 
      {
        sb.append(stateEventCells.get(ev).htmlString());
      }
      else 
      {
        sb.append("&nbsp;");
      }
      sb.append("</td>\n");
    }
    return(sb);
  }


  /**
   * Output this row of the stateState Table not including tr tags
   */
  // line 104 "../../../../src/Generator_CodeStateTables.ump"
   public StringBuilder stateStateTableRowHtml(){
    StringBuilder sb = new StringBuilder();

    // Output the name of the state with appropriate nesting
    firstCellInRow(sb);

    // Loop through all states, find the state in the hash table, and output each cell
    for(StateTableRow col : getStateTable().getRows()) 
    {
      State colState = col.getUState();
      sb.append("      <td class=\"state-entry\">");

      if(stateStateCells.containsKey(colState)) 
      {
        sb.append(stateStateCells.get(colState).htmlString());
      }
      else 
      {
        sb.append("&nbsp;");
      }
      sb.append("</td>\n");
    }
    return(sb);
  }


  /**
   * Loops through the transitions in a state and adds them to a list
   */
  // line 131 "../../../../src/Generator_CodeStateTables.ump"
   private void extractTransitions(State curState, boolean isDerived){
    Event event;
    Action action;
    String transitionLabel = "?";
    String eventLabel = "??";
    String guardString, actionCode, transitionAction;
    Guard guard;

    // Add cells for each transition
    for (Transition t : curState.getTransitions()) 
    {
      event = t.getEvent();
      action = t.getAction();

      if(event.isAutoTransition()) 
      {
        transitionLabel = "";
        eventLabel = "(auto)";
      }
      else 
      {
        if (event.getIsTimer()) 
        {
          transitionLabel = "after(" + event.getTimerInSeconds() + ")";
          eventLabel=transitionLabel;
        }
        else 
        {
          eventLabel = event.getName();
          if(event.getArgs() == null || event.getArgs() == "") 
          {
            transitionLabel = eventLabel;
          }
          else 
          {
            transitionLabel = eventLabel + "(" + event.getArgs() + ")";
          }
        }
      }

      if (action == null || action.getActionCode() == "") 
      {
        transitionAction = "";
      }
      else 
      {
        actionCode = action.getActionCode();
        transitionAction = "/ " + actionCode.replaceAll("\"","&quot;");
      }

      guard = t.getGuard();
      if (guard == null) guardString = "";
      else 
      {
        guardString = extractGuardString(guard, curState, event, this);
      }

      // Add state to the state event list in hash table
      addStateEventCell(eventLabel, t, guardString, transitionAction, isDerived);

      // Add event to the state state list in hash table
      addStateStateCell(eventLabel, t, guardString, transitionAction, isDerived);

    } // End of loop through each transition
  }

  // line 199 "../../../../src/Generator_CodeStateTables.ump"
   private void addStateEventCell(String label, Transition t, String guard, String action, boolean isDerived){
    if(stateEventCells.get(label) == null) 
    {
      stateEventCells.put(label, new StateTableCell());
    }

    stateEventCells.get(label).addStateTableEntry(
      new StateEventEntry(t.getNextState(), guard, action, isDerived));
  }

  // line 211 "../../../../src/Generator_CodeStateTables.ump"
   private void addStateStateCell(String label, Transition t, String guard, String action, boolean isDerived){
    if(stateStateCells.get(t.getNextState()) == null) 
    {
      stateStateCells.put(t.getNextState(), new StateTableCell());
    }

    stateStateCells.get(t.getNextState()).addStateTableEntry(
      new StateStateEntry(label, guard, action, isDerived));
  }


  /**
   * Output the first cell in the row of the table, i.e. the state name with indentation
   */
  // line 223 "../../../../src/Generator_CodeStateTables.ump"
   private StringBuilder firstCellInRow(StringBuilder sb){
    sb.append("      <td class=\"state-header\" data-parent=\"");

    if(this.parent != null) 
    {
      sb.append(String.valueOf(this.parent.getTableRowId()));
    }

    sb.append("\">");

    for(int i=0; i<nestingLevel; i++) 
    {
      sb.append("- ");
    }
    sb.append(sLabel);
    sb.append("</td>\n");
    return(sb);
  }

  // line 246 "../../../../src/Generator_CodeStateTables.ump"
   private String extractGuardString(Guard guard, State curState, Event event, StateTableRow curRow){
    JavaGenerator gen = new JavaGenerator();
    UmpleClass umpClass = curState.getStateMachine().getUmpleClass();
    
    if(umpClass == null) 
    {
      return extractGuardString(
        guard, curRow.getParent().getUState(), event, curRow.getParent());
    }
    else 
    {
      gen.setModel(umpClass.getSourceModel());
      return guard.getCondition(gen).replaceAll("\"","&quot;");
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "sLabel" + ":" + getSLabel()+ "," +
            "nestingLevel" + ":" + getNestingLevel()+ "," +
            "tableRowId" + ":" + getTableRowId()+ "," +
            "isPseudo" + ":" + getIsPseudo()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uState" + "=" + (getUState() != null ? !getUState().equals(this)  ? getUState().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "parent" + "=" + (getParent() != null ? !getParent().equals(this)  ? getParent().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "stateEventCells" + "=" + (getStateEventCells() != null ? !getStateEventCells().equals(this)  ? getStateEventCells().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "stateStateCells" + "=" + (getStateStateCells() != null ? !getStateStateCells().equals(this)  ? getStateStateCells().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "stateTable = "+(getStateTable()!=null?Integer.toHexString(System.identityHashCode(getStateTable())):"null");
  }
}
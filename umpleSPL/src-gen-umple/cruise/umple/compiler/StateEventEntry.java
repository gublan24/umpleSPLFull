/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Cell entries for state-event tables
 */
// line 296 "../../../../src/Generator_CodeStateTables.ump"
public class StateEventEntry implements StateTableEntry
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateEventEntry Attributes
  private State uState;
  private String guard;
  private String action;
  private boolean isDerived;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateEventEntry(State aUState, String aGuard, String aAction, boolean aIsDerived)
  {
    uState = aUState;
    guard = aGuard;
    action = aAction;
    isDerived = aIsDerived;
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

  public boolean setGuard(String aGuard)
  {
    boolean wasSet = false;
    guard = aGuard;
    wasSet = true;
    return wasSet;
  }

  public boolean setAction(String aAction)
  {
    boolean wasSet = false;
    action = aAction;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDerived(boolean aIsDerived)
  {
    boolean wasSet = false;
    isDerived = aIsDerived;
    wasSet = true;
    return wasSet;
  }

  public State getUState()
  {
    return uState;
  }

  public String getGuard()
  {
    return guard;
  }

  public String getAction()
  {
    return action;
  }

  public boolean getIsDerived()
  {
    return isDerived;
  }

  public void delete()
  {}


  /**
   * Output this state cell as html - appears in state-event table
   */
  // line 307 "../../../../src/Generator_CodeStateTables.ump"
   public StringBuilder htmlString(){
    StringBuilder sb = new StringBuilder();
    sb.append("<span");
    if(isDerived) sb.append(" class=\"derived\"");

    if(action != null && !action.equals("")) {
      sb.append(" data-action=\"");
      sb.append(action);
      sb.append("\"");
    }

    sb.append(">");

    if(guard != null && !guard.equals(""))
    {
      sb.append("[");
      sb.append(guard);
      sb.append("] ");
    }

    sb.append(uState.getName());
    sb.append("</span>");
    return(sb);
  }


  public String toString()
  {
    return super.toString() + "["+
            "guard" + ":" + getGuard()+ "," +
            "action" + ":" + getAction()+ "," +
            "isDerived" + ":" + getIsDerived()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uState" + "=" + (getUState() != null ? !getUState().equals(this)  ? getUState().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
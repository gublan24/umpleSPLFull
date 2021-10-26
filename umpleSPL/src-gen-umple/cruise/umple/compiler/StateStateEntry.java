/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Cell entries for state-state tables
 */
// line 333 "../../../../src/Generator_CodeStateTables.ump"
public class StateStateEntry implements StateTableEntry
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateStateEntry Attributes
  private String label;
  private String guard;
  private String action;
  private boolean isDerived;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateStateEntry(String aLabel, String aGuard, String aAction, boolean aIsDerived)
  {
    label = aLabel;
    guard = aGuard;
    action = aAction;
    isDerived = aIsDerived;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLabel(String aLabel)
  {
    boolean wasSet = false;
    label = aLabel;
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

  public String getLabel()
  {
    return label;
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
   * Output this state cell as html - appears in state-state table
   */
  // line 344 "../../../../src/Generator_CodeStateTables.ump"
   public StringBuilder htmlString(){
    StringBuilder sb = new StringBuilder();
    sb.append("<span");
    if(isDerived) sb.append(" class=\"derived\"");
    sb.append(">");
    sb.append(label);

    if(guard != null && !guard.equals(""))
    {
      sb.append(" [");
      sb.append(guard);
      sb.append("]");
    }

    sb.append("</span>");
    return(sb);
  }


  public String toString()
  {
    return super.toString() + "["+
            "label" + ":" + getLabel()+ "," +
            "guard" + ":" + getGuard()+ "," +
            "action" + ":" + getAction()+ "," +
            "isDerived" + ":" + getIsDerived()+ "]";
  }
}
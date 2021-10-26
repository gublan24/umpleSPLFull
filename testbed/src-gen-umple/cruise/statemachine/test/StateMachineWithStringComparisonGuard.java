/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 410 "../../../../src/TestHarnessStateMachineJava.ump"
public class StateMachineWithStringComparisonGuard
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateMachineWithStringComparisonGuard Attributes
  private String cmdString;

  //StateMachineWithStringComparisonGuard State Machines
  public enum CommandControl { IDLE, CHECK_AVAILABILITY, COMMAND_VALIDITY, EXECUTION }
  private CommandControl commandControl;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateMachineWithStringComparisonGuard()
  {
    cmdString = "";
    setCommandControl(CommandControl.IDLE);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCmdString(String aCmdString)
  {
    boolean wasSet = false;
    cmdString = aCmdString;
    wasSet = true;
    return wasSet;
  }

  public String getCmdString()
  {
    return cmdString;
  }

  public String getCommandControlFullName()
  {
    String answer = commandControl.toString();
    return answer;
  }

  public CommandControl getCommandControl()
  {
    return commandControl;
  }

  public boolean execute()
  {
    boolean wasEventProcessed = false;
    
    CommandControl aCommandControl = commandControl;
    switch (aCommandControl)
    {
      case IDLE:
        setCommandControl(CommandControl.CHECK_AVAILABILITY);
        wasEventProcessed = true;
        break;
      case CHECK_AVAILABILITY:
        if (!"".equals(getCmdString()))
        {
          setCommandControl(CommandControl.COMMAND_VALIDITY);
          wasEventProcessed = true;
          break;
        }
        break;
      case COMMAND_VALIDITY:
        if (isCommandValid(getCmdString()))
        {
          setCommandControl(CommandControl.EXECUTION);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setCommandControl(CommandControl aCommandControl)
  {
    commandControl = aCommandControl;
  }

  public void delete()
  {}

  // line 414 "../../../../src/TestHarnessStateMachineJava.ump"
  public Boolean isCommandValid(String cmdString){
    return cmdString=="valid";
  }


  public String toString()
  {
    return super.toString() + "["+
            "cmdString" + ":" + getCmdString()+ "]";
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 432 "../../../../src/TestHarnessStateMachineJava.ump"
public class ExitActionSelfTransition
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ExitActionSelfTransition Attributes
  private boolean b;
  private boolean exitCodeCalled;

  //ExitActionSelfTransition State Machines
  public enum Sm { created, initialized }
  private Sm sm;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ExitActionSelfTransition()
  {
    b = false;
    exitCodeCalled = false;
    setSm(Sm.created);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setB(boolean aB)
  {
    boolean wasSet = false;
    b = aB;
    wasSet = true;
    return wasSet;
  }

  public boolean setExitCodeCalled(boolean aExitCodeCalled)
  {
    boolean wasSet = false;
    exitCodeCalled = aExitCodeCalled;
    wasSet = true;
    return wasSet;
  }

  public boolean getB()
  {
    return b;
  }

  public boolean getExitCodeCalled()
  {
    return exitCodeCalled;
  }

  public String getSmFullName()
  {
    String answer = sm.toString();
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  public boolean init()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case created:
        if (getB()==false)
        {
          exitSm();
          setSm(Sm.created);
          wasEventProcessed = true;
          break;
        }
        if (getB()==true)
        {
          exitSm();
          setSm(Sm.initialized);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean getback()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case initialized:
        setSm(Sm.created);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitSm()
  {
    switch(sm)
    {
      case created:
        // line 443 "../../../../src/TestHarnessStateMachineJava.ump"
        execute_exit_code();
        break;
    }
  }

  private void setSm(Sm aSm)
  {
    sm = aSm;
  }

  public void delete()
  {}

  // line 438 "../../../../src/TestHarnessStateMachineJava.ump"
  public void execute_exit_code(){
    setExitCodeCalled(true);
  }


  public String toString()
  {
    return super.toString() + "["+
            "b" + ":" + getB()+ "," +
            "exitCodeCalled" + ":" + getExitCodeCalled()+ "]";
  }
}
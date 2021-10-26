/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 336 "../../../../src/TestHarnessStateMachineJava.ump"
public class HistoryCourse
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //HistoryCourse State Machines
  public enum Sm { S1, S2 }
  public enum SmS1 { Null, Ss1, Ss2, H }
  private Sm sm;
  private SmS1 smS1;
  private SmS1 smS1H;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public HistoryCourse()
  {
    setSmS1(SmS1.Null);
    smS1H = SmS1.Ss1;
    setSm(Sm.S1);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSmFullName()
  {
    String answer = sm.toString();
    if (smS1 != SmS1.Null) { answer += "." + smS1.toString(); }
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  public SmS1 getSmS1()
  {
    return smS1;
  }

  public boolean toHistory()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case S2:
        setSmS1(smS1H);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toss2()
  {
    boolean wasEventProcessed = false;
    
    SmS1 aSmS1 = smS1;
    if (smS1 != SmS1.Null){smS1H = smS1;}
    switch (aSmS1)
    {
      case Ss1:
        exitSmS1();
        setSmS1(SmS1.Ss2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean tos2()
  {
    boolean wasEventProcessed = false;
    
    SmS1 aSmS1 = smS1;
    if (smS1 != SmS1.Null){smS1H = smS1;}
    switch (aSmS1)
    {
      case Ss1:
        exitSm();
        setSm(Sm.S2);
        wasEventProcessed = true;
        break;
      case Ss2:
        exitSm();
        setSm(Sm.S2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toss1()
  {
    boolean wasEventProcessed = false;
    
    SmS1 aSmS1 = smS1;
    if (smS1 != SmS1.Null){smS1H = smS1;}
    switch (aSmS1)
    {
      case Ss2:
        exitSmS1();
        setSmS1(SmS1.Ss1);
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
      case S1:
        exitSmS1();
        break;
    }
  }

  private void setSm(Sm aSm)
  {
    sm = aSm;

    // entry actions and do activities
    switch(sm)
    {
      case S1:
        if (smS1 == SmS1.Null) { setSmS1(SmS1.Ss1); }
        break;
    }
  }

  private void exitSmS1()
  {
    switch(smS1)
    {
      case Ss1:
        setSmS1(SmS1.Null);
        break;
      case Ss2:
        setSmS1(SmS1.Null);
        break;
      case H:
        setSmS1(SmS1.Null);
        break;
    }
  }

  private void setSmS1(SmS1 aSmS1)
  {
    smS1 = aSmS1;
    if (sm != Sm.S1 && aSmS1 != SmS1.Null) { setSm(Sm.S1); }
  }

  public void delete()
  {}

}
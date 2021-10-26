/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;

// line 410 "../../../../src/TestHarnessTracerStateMachine.ump"
public class HisTest
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //HisTest State Machines
  public enum Sm { s1, s2 }
  public enum SmS1 { Null, s1a, s1b }
  public enum SmS2 { Null, s2a, s2b }
  private Sm sm;
  private SmS1 smS1;
  private SmS2 smS2;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public HisTest()
  {
    setSmS1(SmS1.Null);
    setSmS2(SmS2.Null);
    setSm(Sm.s1);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSmFullName()
  {
    String answer = sm.toString();
    if (smS1 != SmS1.Null) { answer += "." + smS1.toString(); }
    if (smS2 != SmS2.Null) { answer += "." + smS2.toString(); }
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

  public SmS2 getSmS2()
  {
    return smS2;
  }

  public boolean e2()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case s1:
        exitSm();
        setSm(Sm.s2);
        wasEventProcessed = true;
        break;
      case s2:
        exitSm();
        setSm(Sm.s1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean e1()
  {
    boolean wasEventProcessed = false;
    
    SmS1 aSmS1 = smS1;
    SmS2 aSmS2 = smS2;
    switch (aSmS1)
    {
      case s1a:
        exitSmS1();
        setSmS1(SmS1.s1b);
        wasEventProcessed = true;
        break;
      case s1b:
        exitSmS1();
        setSmS1(SmS1.s1a);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aSmS2)
    {
      case s2a:
        exitSmS2();
        setSmS2(SmS2.s2b);
        wasEventProcessed = true;
        break;
      case s2b:
        exitSmS2();
        setSmS2(SmS2.s2a);
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
      case s1:
        exitSmS1();
        break;
      case s2:
        exitSmS2();
        break;
    }
  }

  private void setSm(Sm aSm)
  {
    sm = aSm;

    // entry actions and do activities
    switch(sm)
    {
      case s1:
        if (smS1 == SmS1.Null) { setSmS1(SmS1.s1a); }
        break;
      case s2:
        if (smS2 == SmS2.Null) { setSmS2(SmS2.s2a); }
        break;
    }
  }

  private void exitSmS1()
  {
    switch(smS1)
    {
      case s1a:
        setSmS1(SmS1.Null);
        break;
      case s1b:
        setSmS1(SmS1.Null);
        break;
    }
  }

  private void setSmS1(SmS1 aSmS1)
  {
    smS1 = aSmS1;
    if (sm != Sm.s1 && aSmS1 != SmS1.Null) { setSm(Sm.s1); }
  }

  private void exitSmS2()
  {
    switch(smS2)
    {
      case s2a:
        setSmS2(SmS2.Null);
        break;
      case s2b:
        setSmS2(SmS2.Null);
        break;
    }
  }

  private void setSmS2(SmS2 aSmS2)
  {
    smS2 = aSmS2;
    if (sm != Sm.s2 && aSmS2 != SmS2.Null) { setSm(Sm.s2); }
  }

  public void delete()
  {}

}
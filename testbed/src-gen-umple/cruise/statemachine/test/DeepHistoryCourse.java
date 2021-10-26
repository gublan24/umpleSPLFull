/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 355 "../../../../src/TestHarnessStateMachineJava.ump"
public class DeepHistoryCourse
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DeepHistoryCourse State Machines
  public enum Sm { S1, S2 }
  public enum SmS1 { Null, Ss1, Ss2, HStar }
  public enum SmS1Ss1 { Null, Sss1, Sss2, HStar }
  public enum SmS1Ss2 { Null, Sss1, Sss2, HStar }
  public enum SmS1Ss2Sss2 { Null, Ssss1, Ssss2, HStar }
  public enum SmS2 { Null, Ss1, Ss2, HStar }
  private Sm sm;
  private SmS1 smS1;
  private SmS1 smS1HStar;
  private SmS1Ss1 smS1Ss1;
  private SmS1Ss1 smS1Ss1HStar;
  private SmS1Ss2 smS1Ss2;
  private SmS1Ss2 smS1Ss2HStar;
  private SmS1Ss2Sss2 smS1Ss2Sss2;
  private SmS1Ss2Sss2 smS1Ss2Sss2HStar;
  private SmS2 smS2;
  private SmS2 smS2HStar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DeepHistoryCourse()
  {
    setSmS1(SmS1.Null);
    smS1HStar = SmS1.Ss1;
    setSmS1Ss1(SmS1Ss1.Null);
    smS1Ss1HStar = SmS1Ss1.Sss1;
    setSmS1Ss2(SmS1Ss2.Null);
    smS1Ss2HStar = SmS1Ss2.Sss1;
    setSmS1Ss2Sss2(SmS1Ss2Sss2.Null);
    smS1Ss2Sss2HStar = SmS1Ss2Sss2.Ssss1;
    setSmS2(SmS2.Null);
    smS2HStar = SmS2.Ss1;
    setSm(Sm.S1);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSmFullName()
  {
    String answer = sm.toString();
    if (smS1 != SmS1.Null) { answer += "." + smS1.toString(); }
    if (smS1Ss1 != SmS1Ss1.Null) { answer += "." + smS1Ss1.toString(); }
    if (smS1Ss2 != SmS1Ss2.Null) { answer += "." + smS1Ss2.toString(); }
    if (smS1Ss2Sss2 != SmS1Ss2Sss2.Null) { answer += "." + smS1Ss2Sss2.toString(); }
    if (smS2 != SmS2.Null) { answer += "." + smS2.toString(); }
    if (smS1Ss2Sss2 != SmS1Ss2Sss2.Null) { answer += "." + smS1Ss2Sss2.toString(); }
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

  public SmS1Ss1 getSmS1Ss1()
  {
    return smS1Ss1;
  }

  public SmS1Ss2 getSmS1Ss2()
  {
    return smS1Ss2;
  }

  public SmS1Ss2Sss2 getSmS1Ss2Sss2()
  {
    return smS1Ss2Sss2;
  }

  public SmS2 getSmS2()
  {
    return smS2;
  }

  public boolean toS2HStar()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case S1:
        exitSm();
        setSmS2(SmS2.HStar);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toDeepHistory()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case S2:
        exitSm();
        setSmS1(SmS1.HStar);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toS1Ss2()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case S2:
        exitSm();
        setSmS1(SmS1.Ss2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toSs2Sss2()
  {
    boolean wasEventProcessed = false;
    
    SmS1Ss1 aSmS1Ss1 = smS1Ss1;
    if (smS1Ss1 != SmS1Ss1.Null){smS1Ss1HStar = smS1Ss1;}
    switch (aSmS1Ss1)
    {
      case Sss1:
        exitSmS1();
        setSmS1Ss2(SmS1Ss2.Sss2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toS2()
  {
    boolean wasEventProcessed = false;
    
    SmS1Ss1 aSmS1Ss1 = smS1Ss1;
    if (smS1Ss1 != SmS1Ss1.Null){smS1Ss1HStar = smS1Ss1;}
    SmS1Ss2 aSmS1Ss2 = smS1Ss2;
    if (smS1Ss2 != SmS1Ss2.Null){smS1Ss2HStar = smS1Ss2;}
    SmS1Ss2Sss2 aSmS1Ss2Sss2 = smS1Ss2Sss2;
    if (smS1Ss2Sss2 != SmS1Ss2Sss2.Null){smS1Ss2Sss2HStar = smS1Ss2Sss2;}
    switch (aSmS1Ss1)
    {
      case Sss1:
        exitSm();
        setSm(Sm.S2);
        wasEventProcessed = true;
        break;
      case Sss2:
        exitSm();
        setSm(Sm.S2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aSmS1Ss2)
    {
      case Sss1:
        exitSm();
        setSm(Sm.S2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aSmS1Ss2Sss2)
    {
      case Ssss2:
        exitSm();
        setSm(Sm.S2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toSss2()
  {
    boolean wasEventProcessed = false;
    
    SmS1Ss2 aSmS1Ss2 = smS1Ss2;
    if (smS1Ss2 != SmS1Ss2.Null){smS1Ss2HStar = smS1Ss2;}
    switch (aSmS1Ss2)
    {
      case Sss1:
        exitSmS1();
        setSmS1Ss1(SmS1Ss1.Sss2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toSsss2()
  {
    boolean wasEventProcessed = false;
    
    SmS1Ss2Sss2 aSmS1Ss2Sss2 = smS1Ss2Sss2;
    if (smS1Ss2Sss2 != SmS1Ss2Sss2.Null){smS1Ss2Sss2HStar = smS1Ss2Sss2;}
    switch (aSmS1Ss2Sss2)
    {
      case Ssss1:
        exitSmS1Ss2Sss2();
        setSmS1Ss2Sss2(SmS1Ss2Sss2.Ssss2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toS2Ss2()
  {
    boolean wasEventProcessed = false;
    
    SmS1Ss2Sss2 aSmS1Ss2Sss2 = smS1Ss2Sss2;
    if (smS1Ss2Sss2 != SmS1Ss2Sss2.Null){smS1Ss2Sss2HStar = smS1Ss2Sss2;}
    switch (aSmS1Ss2Sss2)
    {
      case Ssss1:
        exitSm();
        setSmS2(SmS2.Ss2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toSsss1()
  {
    boolean wasEventProcessed = false;
    
    SmS1Ss2Sss2 aSmS1Ss2Sss2 = smS1Ss2Sss2;
    if (smS1Ss2Sss2 != SmS1Ss2Sss2.Null){smS1Ss2Sss2HStar = smS1Ss2Sss2;}
    switch (aSmS1Ss2Sss2)
    {
      case Ssss2:
        exitSmS1Ss2Sss2();
        setSmS1Ss2Sss2(SmS1Ss2Sss2.Ssss1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean toS1()
  {
    boolean wasEventProcessed = false;
    
    SmS2 aSmS2 = smS2;
    if (smS2 != SmS2.Null){smS2HStar = smS2;}
    switch (aSmS2)
    {
      case Ss1:
        exitSm();
        setSm(Sm.S1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private boolean __autotransition15__()
  {
    boolean wasEventProcessed = false;
    
    SmS2 aSmS2 = smS2;
    if (smS2 != SmS2.Null){smS2HStar = smS2;}
    switch (aSmS2)
    {
      case Ss2:
        exitSm();
        setSmS1(SmS1.HStar);
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
      case S2:
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
      case S1:
        if (smS1 == SmS1.Null) { setSmS1(SmS1.Ss1); }
        break;
      case S2:
        if (smS2 == SmS2.Null) { setSmS2(SmS2.Ss1); }
        break;
    }
  }

  private void exitSmS1()
  {
    switch(smS1)
    {
      case Ss1:
        exitSmS1Ss1();
        setSmS1(SmS1.Null);
        break;
      case Ss2:
        exitSmS1Ss2();
        setSmS1(SmS1.Null);
        break;
      case HStar:
        setSmS1(SmS1.Null);
        break;
    }
  }

  private void setSmS1(SmS1 aSmS1)
  {
    smS1 = aSmS1;
    if (sm != Sm.S1 && aSmS1 != SmS1.Null) { setSm(Sm.S1); }

    // entry actions and do activities
    switch(smS1)
    {
      case Ss1:
        if (smS1Ss1 == SmS1Ss1.Null) { setSmS1Ss1(SmS1Ss1.Sss1); }
        break;
      case Ss2:
        if (smS1Ss2 == SmS1Ss2.Null) { setSmS1Ss2(SmS1Ss2.Sss1); }
        break;
      case HStar:
        if(smS1HStar == SmS1.Ss1)
        {
          if (smS1Ss1 == SmS1Ss1.Null) { setSmS1Ss1(SmS1Ss1.HStar); }
        }
        if(smS1HStar == SmS1.Ss2)
        {
          if (smS1Ss2 == SmS1Ss2.Null) { setSmS1Ss2(SmS1Ss2.HStar); }
        }
        break;
    }
    if (aSmS1 == SmS1.HStar) { smS1 = smS1HStar;}
  }

  private void exitSmS1Ss1()
  {
    switch(smS1Ss1)
    {
      case Sss1:
        setSmS1Ss1(SmS1Ss1.Null);
        break;
      case Sss2:
        setSmS1Ss1(SmS1Ss1.Null);
        break;
      case HStar:
        setSmS1Ss1(SmS1Ss1.Null);
        break;
    }
  }

  private void setSmS1Ss1(SmS1Ss1 aSmS1Ss1)
  {
    smS1Ss1 = aSmS1Ss1;
    if (smS1 != SmS1.Ss1 && aSmS1Ss1 != SmS1Ss1.Null) { setSmS1(SmS1.Ss1); }
    if (aSmS1Ss1 == SmS1Ss1.HStar) { smS1Ss1 = smS1Ss1HStar;}
  }

  private void exitSmS1Ss2()
  {
    switch(smS1Ss2)
    {
      case Sss1:
        setSmS1Ss2(SmS1Ss2.Null);
        break;
      case Sss2:
        exitSmS1Ss2Sss2();
        setSmS1Ss2(SmS1Ss2.Null);
        break;
      case HStar:
        setSmS1Ss2(SmS1Ss2.Null);
        break;
    }
  }

  private void setSmS1Ss2(SmS1Ss2 aSmS1Ss2)
  {
    smS1Ss2 = aSmS1Ss2;
    if (smS1 != SmS1.Ss2 && aSmS1Ss2 != SmS1Ss2.Null) { setSmS1(SmS1.Ss2); }

    // entry actions and do activities
    switch(smS1Ss2)
    {
      case Sss2:
        if (smS1Ss2Sss2 == SmS1Ss2Sss2.Null) { setSmS1Ss2Sss2(SmS1Ss2Sss2.Ssss1); }
        break;
      case HStar:
        if(smS1Ss2HStar == SmS1Ss2.Sss2)
        {
          if (smS1Ss2Sss2 == SmS1Ss2Sss2.Null) { setSmS1Ss2Sss2(SmS1Ss2Sss2.HStar); }
        }
        break;
    }
    if (aSmS1Ss2 == SmS1Ss2.HStar) { smS1Ss2 = smS1Ss2HStar;}
  }

  private void exitSmS1Ss2Sss2()
  {
    switch(smS1Ss2Sss2)
    {
      case Ssss1:
        setSmS1Ss2Sss2(SmS1Ss2Sss2.Null);
        break;
      case Ssss2:
        setSmS1Ss2Sss2(SmS1Ss2Sss2.Null);
        break;
      case HStar:
        setSmS1Ss2Sss2(SmS1Ss2Sss2.Null);
        break;
    }
  }

  private void setSmS1Ss2Sss2(SmS1Ss2Sss2 aSmS1Ss2Sss2)
  {
    smS1Ss2Sss2 = aSmS1Ss2Sss2;
    if (smS1Ss2 != SmS1Ss2.Sss2 && aSmS1Ss2Sss2 != SmS1Ss2Sss2.Null) { setSmS1Ss2(SmS1Ss2.Sss2); }
    if (aSmS1Ss2Sss2 == SmS1Ss2Sss2.HStar) { smS1Ss2Sss2 = smS1Ss2Sss2HStar;}
  }

  private void exitSmS2()
  {
    switch(smS2)
    {
      case Ss1:
        setSmS2(SmS2.Null);
        break;
      case Ss2:
        setSmS2(SmS2.Null);
        break;
      case HStar:
        setSmS2(SmS2.Null);
        break;
    }
  }

  private void setSmS2(SmS2 aSmS2)
  {
    smS2 = aSmS2;
    if (sm != Sm.S2 && aSmS2 != SmS2.Null) { setSm(Sm.S2); }

    // entry actions and do activities
    switch(smS2)
    {
      case Ss2:
        __autotransition15__();
        break;
    }
    if (aSmS2 == SmS2.HStar) { smS2 = smS2HStar;}
  }

  public void delete()
  {}

}
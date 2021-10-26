/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;

// line 288 "../../../../src/TestHarnessTracerStateMachine.ump"
public class NestedStateLevel2
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //NestedStateLevel2 State Machines
  public enum Stm { sLevel1, outsideNested }
  public enum StmSLevel1 { Null, sLevel2a, sLevel2b }
  public enum StmSLevel1SLevel2a { Null, sLevel2aLevel3a, sLevel2aLevel3b }
  public enum StmSLevel1SLevel2aSLevel2aLevel3b { Null, sLevel2aLevel3bLevel4 }
  private Stm stm;
  private StmSLevel1 stmSLevel1;
  private StmSLevel1SLevel2a stmSLevel1SLevel2a;
  private StmSLevel1SLevel2aSLevel2aLevel3b stmSLevel1SLevel2aSLevel2aLevel3b;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NestedStateLevel2()
  {
    setStmSLevel1(StmSLevel1.Null);
    setStmSLevel1SLevel2a(StmSLevel1SLevel2a.Null);
    setStmSLevel1SLevel2aSLevel2aLevel3b(StmSLevel1SLevel2aSLevel2aLevel3b.Null);
    setStm(Stm.sLevel1);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStmFullName()
  {
    String answer = stm.toString();
    if (stmSLevel1 != StmSLevel1.Null) { answer += "." + stmSLevel1.toString(); }
    if (stmSLevel1SLevel2a != StmSLevel1SLevel2a.Null) { answer += "." + stmSLevel1SLevel2a.toString(); }
    if (stmSLevel1SLevel2aSLevel2aLevel3b != StmSLevel1SLevel2aSLevel2aLevel3b.Null) { answer += "." + stmSLevel1SLevel2aSLevel2aLevel3b.toString(); }
    if (stmSLevel1SLevel2aSLevel2aLevel3b != StmSLevel1SLevel2aSLevel2aLevel3b.Null) { answer += "." + stmSLevel1SLevel2aSLevel2aLevel3b.toString(); }
    return answer;
  }

  public Stm getStm()
  {
    return stm;
  }

  public StmSLevel1 getStmSLevel1()
  {
    return stmSLevel1;
  }

  public StmSLevel1SLevel2a getStmSLevel1SLevel2a()
  {
    return stmSLevel1SLevel2a;
  }

  public StmSLevel1SLevel2aSLevel2aLevel3b getStmSLevel1SLevel2aSLevel2aLevel3b()
  {
    return stmSLevel1SLevel2aSLevel2aLevel3b;
  }

  public boolean e1()
  {
    boolean wasEventProcessed = false;
    
    Stm aStm = stm;
    switch (aStm)
    {
      case sLevel1:
        exitStmSLevel1();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,320,NestedStateLevel2,"+System.identityHashCode(this)+",sm_t,sLevel1,e1,sLevel2b" );
        setStmSLevel1(StmSLevel1.sLevel2b);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean e2()
  {
    boolean wasEventProcessed = false;
    
    StmSLevel1 aStmSLevel1 = stmSLevel1;
    switch (aStmSLevel1)
    {
      case sLevel2b:
        exitStmSLevel1();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,320,NestedStateLevel2,"+System.identityHashCode(this)+",sm_t,sLevel2b,e2,sLevel2aLevel3a" );
        setStmSLevel1SLevel2a(StmSLevel1SLevel2a.sLevel2aLevel3a);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean e3()
  {
    boolean wasEventProcessed = false;
    
    StmSLevel1SLevel2a aStmSLevel1SLevel2a = stmSLevel1SLevel2a;
    switch (aStmSLevel1SLevel2a)
    {
      case sLevel2aLevel3a:
        exitStmSLevel1SLevel2a();
        setStmSLevel1SLevel2a(StmSLevel1SLevel2a.sLevel2aLevel3b);
        wasEventProcessed = true;
        break;
      case sLevel2aLevel3b:
        exitStmSLevel1SLevel2a();
        setStmSLevel1SLevel2a(StmSLevel1SLevel2a.sLevel2aLevel3a);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean e4()
  {
    boolean wasEventProcessed = false;
    
    StmSLevel1SLevel2aSLevel2aLevel3b aStmSLevel1SLevel2aSLevel2aLevel3b = stmSLevel1SLevel2aSLevel2aLevel3b;
    switch (aStmSLevel1SLevel2aSLevel2aLevel3b)
    {
      case sLevel2aLevel3bLevel4:
        exitStm();
        setStm(Stm.outsideNested);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitStm()
  {
    switch(stm)
    {
      case sLevel1:
        exitStmSLevel1();
        break;
    }
  }

  private void setStm(Stm aStm)
  {
    stm = aStm;

    // entry actions and do activities
    switch(stm)
    {
      case sLevel1:
        if (stmSLevel1 == StmSLevel1.Null) { setStmSLevel1(StmSLevel1.sLevel2a); }
        break;
    }
  }

  private void exitStmSLevel1()
  {
    switch(stmSLevel1)
    {
      case sLevel2a:
        exitStmSLevel1SLevel2a();
        setStmSLevel1(StmSLevel1.Null);
        break;
      case sLevel2b:
        setStmSLevel1(StmSLevel1.Null);
        break;
    }
  }

  private void setStmSLevel1(StmSLevel1 aStmSLevel1)
  {
    stmSLevel1 = aStmSLevel1;
    if (stm != Stm.sLevel1 && aStmSLevel1 != StmSLevel1.Null) { setStm(Stm.sLevel1); }

    // entry actions and do activities
    switch(stmSLevel1)
    {
      case sLevel2a:
        if (stmSLevel1SLevel2a == StmSLevel1SLevel2a.Null) { setStmSLevel1SLevel2a(StmSLevel1SLevel2a.sLevel2aLevel3a); }
        break;
    }
  }

  private void exitStmSLevel1SLevel2a()
  {
    switch(stmSLevel1SLevel2a)
    {
      case sLevel2aLevel3a:
        setStmSLevel1SLevel2a(StmSLevel1SLevel2a.Null);
        break;
      case sLevel2aLevel3b:
        exitStmSLevel1SLevel2aSLevel2aLevel3b();
        setStmSLevel1SLevel2a(StmSLevel1SLevel2a.Null);
        break;
    }
  }

  private void setStmSLevel1SLevel2a(StmSLevel1SLevel2a aStmSLevel1SLevel2a)
  {
    stmSLevel1SLevel2a = aStmSLevel1SLevel2a;
    if (stmSLevel1 != StmSLevel1.sLevel2a && aStmSLevel1SLevel2a != StmSLevel1SLevel2a.Null) { setStmSLevel1(StmSLevel1.sLevel2a); }

    // entry actions and do activities
    switch(stmSLevel1SLevel2a)
    {
      case sLevel2aLevel3b:
        if (stmSLevel1SLevel2aSLevel2aLevel3b == StmSLevel1SLevel2aSLevel2aLevel3b.Null) { setStmSLevel1SLevel2aSLevel2aLevel3b(StmSLevel1SLevel2aSLevel2aLevel3b.sLevel2aLevel3bLevel4); }
        break;
    }
  }

  private void exitStmSLevel1SLevel2aSLevel2aLevel3b()
  {
    switch(stmSLevel1SLevel2aSLevel2aLevel3b)
    {
      case sLevel2aLevel3bLevel4:
        setStmSLevel1SLevel2aSLevel2aLevel3b(StmSLevel1SLevel2aSLevel2aLevel3b.Null);
        break;
    }
  }

  private void setStmSLevel1SLevel2aSLevel2aLevel3b(StmSLevel1SLevel2aSLevel2aLevel3b aStmSLevel1SLevel2aSLevel2aLevel3b)
  {
    stmSLevel1SLevel2aSLevel2aLevel3b = aStmSLevel1SLevel2aSLevel2aLevel3b;
    if (stmSLevel1SLevel2a != StmSLevel1SLevel2a.sLevel2aLevel3b && aStmSLevel1SLevel2aSLevel2aLevel3b != StmSLevel1SLevel2aSLevel2aLevel3b.Null) { setStmSLevel1SLevel2a(StmSLevel1SLevel2a.sLevel2aLevel3b); }
  }

  public void delete()
  {}

}
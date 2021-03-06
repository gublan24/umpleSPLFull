/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;

// line 174 "../../../../src/TestHarnessTracerStateMachine.ump"
public class LightFixtureB
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LightFixtureB State Machines
  public enum Bulb { Off, On }
  public enum BulbOn { Null, Normal, Dimmed }
  private Bulb bulb;
  private BulbOn bulbOn;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LightFixtureB()
  {
    setBulbOn(BulbOn.Null);
    setBulb(Bulb.Off);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getBulbFullName()
  {
    String answer = bulb.toString();
    if (bulbOn != BulbOn.Null) { answer += "." + bulbOn.toString(); }
    return answer;
  }

  public Bulb getBulb()
  {
    return bulb;
  }

  public BulbOn getBulbOn()
  {
    return bulbOn;
  }

  public boolean flip()
  {
    boolean wasEventProcessed = false;
    
    Bulb aBulb = bulb;
    switch (aBulb)
    {
      case Off:
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,187,LightFixtureB,"+System.identityHashCode(this)+",sm_t,Off,flip,On" );
        setBulb(Bulb.On);
        wasEventProcessed = true;
        break;
      case On:
        exitBulb();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,187,LightFixtureB,"+System.identityHashCode(this)+",sm_t,On,flip,Off" );
        setBulb(Bulb.Off);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean touch()
  {
    boolean wasEventProcessed = false;
    
    BulbOn aBulbOn = bulbOn;
    switch (aBulbOn)
    {
      case Normal:
        exitBulbOn();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,187,LightFixtureB,"+System.identityHashCode(this)+",sm_t,Normal,touch,Dimmed" );
        setBulbOn(BulbOn.Dimmed);
        wasEventProcessed = true;
        break;
      case Dimmed:
        exitBulb();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,187,LightFixtureB,"+System.identityHashCode(this)+",sm_t,Dimmed,touch,Off" );
        setBulb(Bulb.Off);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitBulb()
  {
    switch(bulb)
    {
      case On:
        exitBulbOn();
        break;
    }
  }

  private void setBulb(Bulb aBulb)
  {
    bulb = aBulb;

    // entry actions and do activities
    switch(bulb)
    {
      case On:
        if (bulbOn == BulbOn.Null) { setBulbOn(BulbOn.Normal); }
        break;
    }
  }

  private void exitBulbOn()
  {
    switch(bulbOn)
    {
      case Normal:
        setBulbOn(BulbOn.Null);
        break;
      case Dimmed:
        setBulbOn(BulbOn.Null);
        break;
    }
  }

  private void setBulbOn(BulbOn aBulbOn)
  {
    bulbOn = aBulbOn;
    if (bulb != Bulb.On && aBulbOn != BulbOn.Null) { setBulb(Bulb.On); }
  }

  public void delete()
  {}

}
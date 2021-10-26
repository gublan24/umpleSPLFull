/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;

// line 64 "../../../../src/TestHarnessTracerStateMachine.ump"
public class GarageDoorC
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GarageDoorC State Machines
  public enum GarageDoor { Open, Closing, Closed, Opening, HalfOpen }
  private GarageDoor garageDoor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GarageDoorC()
  {
    setGarageDoor(GarageDoor.Open);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getGarageDoorFullName()
  {
    String answer = garageDoor.toString();
    return answer;
  }

  public GarageDoor getGarageDoor()
  {
    return garageDoor;
  }

  public boolean buttonOrObstacle()
  {
    boolean wasEventProcessed = false;
    
    GarageDoor aGarageDoor = garageDoor;
    switch (aGarageDoor)
    {
      case Open:
        setGarageDoor(GarageDoor.Closing);
        wasEventProcessed = true;
        break;
      case Closing:
        setGarageDoor(GarageDoor.Opening);
        wasEventProcessed = true;
        break;
      case Closed:
        exitGarageDoor();
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,93,GarageDoorC,"+System.identityHashCode(this)+",sm_t,Closed,buttonOrObstacle,Opening" );
        setGarageDoor(GarageDoor.Opening);
        wasEventProcessed = true;
        break;
      case Opening:
        setGarageDoor(GarageDoor.HalfOpen);
        wasEventProcessed = true;
        break;
      case HalfOpen:
        setGarageDoor(GarageDoor.Opening);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean reachBottom()
  {
    boolean wasEventProcessed = false;
    
    GarageDoor aGarageDoor = garageDoor;
    switch (aGarageDoor)
    {
      case Closing:
        setGarageDoor(GarageDoor.Closed);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean reachTop()
  {
    boolean wasEventProcessed = false;
    
    GarageDoor aGarageDoor = garageDoor;
    switch (aGarageDoor)
    {
      case Opening:
        setGarageDoor(GarageDoor.Open);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitGarageDoor()
  {
    switch(garageDoor)
    {
      case Closed:
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,93,GarageDoorC,"+System.identityHashCode(this)+",sm_x,Closed,actionUmpleLine=81,garageDoor" );
        // line 81 "../../../../src/TestHarnessTracerStateMachine.ump"
        closeGarageLights();
        break;
    }
  }

  private void setGarageDoor(GarageDoor aGarageDoor)
  {
    garageDoor = aGarageDoor;

    // entry actions and do activities
    switch(garageDoor)
    {
      case Closed:
        // line 80 "../../../../src/TestHarnessTracerStateMachine.ump"
        openGarageLights();
        break;
    }
  }

  public void delete()
  {}

  // line 95 "../../../../src/TestHarnessTracerStateMachine.ump"
  public void openGarageLights(){
    
  }

  // line 96 "../../../../src/TestHarnessTracerStateMachine.ump"
  public void closeGarageLights(){
    
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;

// line 30 "../../../../src/TestHarnessTracerStateMachine.ump"
public class GarageDoorB
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GarageDoorB State Machines
  public enum GarageDoor { Open, Closing, Closed, Opening, HalfOpen }
  private GarageDoor garageDoor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GarageDoorB()
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
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,58,GarageDoorB,"+System.identityHashCode(this)+",sm_t,Closing,reachBottom,Closed" );
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

  private void setGarageDoor(GarageDoor aGarageDoor)
  {
    garageDoor = aGarageDoor;

    // entry actions and do activities
    switch(garageDoor)
    {
      case Open:
        // line 36 "../../../../src/TestHarnessTracerStateMachine.ump"
        closeGarageLights();
        break;
      case Closed:
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,58,GarageDoorB,"+System.identityHashCode(this)+",sm_e,Closed,actionUmpleLine=46,garageDoor" );
        // line 46 "../../../../src/TestHarnessTracerStateMachine.ump"
        openGarageLights();
        break;
    }
  }

  public void delete()
  {}

  // line 60 "../../../../src/TestHarnessTracerStateMachine.ump"
  public void openGarageLights(){
    
  }

  // line 61 "../../../../src/TestHarnessTracerStateMachine.ump"
  public void closeGarageLights(){
    
  }

}
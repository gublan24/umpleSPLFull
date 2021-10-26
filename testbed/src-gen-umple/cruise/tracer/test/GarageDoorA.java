/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;

// line 4 "../../../../src/TestHarnessTracerStateMachine.ump"
public class GarageDoorA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GarageDoorA State Machines
  public enum GarageDoor { Open, Closing, Closed, Opening, HalfOpen }
  private GarageDoor garageDoor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GarageDoorA()
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
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,27,GarageDoorA,"+System.identityHashCode(this)+",sm_t,Open,buttonOrObstacle,Closing" );
        setGarageDoor(GarageDoor.Closing);
        wasEventProcessed = true;
        break;
      case Closing:
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,27,GarageDoorA,"+System.identityHashCode(this)+",sm_t,Closing,buttonOrObstacle,Opening" );
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
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,27,GarageDoorA,"+System.identityHashCode(this)+",sm_t,Closing,reachBottom,Closed" );
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
  }

  public void delete()
  {}

}
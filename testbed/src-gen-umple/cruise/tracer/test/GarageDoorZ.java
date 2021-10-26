/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;

// line 125 "../../../../src/TestHarnessTracerStateMachine.ump"
public class GarageDoorZ
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GarageDoorZ State Machines
  public enum GarageDoor { Open, Closing, Closed, Opening, HalfOpen }
  private GarageDoor garageDoor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GarageDoorZ()
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
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,148,GarageDoorZ,"+System.identityHashCode(this)+",sm_t,Open,buttonOrObstacle,Closing" );
        setGarageDoor(GarageDoor.Closing);
        wasEventProcessed = true;
        break;
      case Closing:
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,148,GarageDoorZ,"+System.identityHashCode(this)+",sm_t,Closing,buttonOrObstacle,Opening" );
        setGarageDoor(GarageDoor.Opening);
        wasEventProcessed = true;
        break;
      case Closed:
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,148,GarageDoorZ,"+System.identityHashCode(this)+",sm_t,Closed,buttonOrObstacle,Opening" );
        setGarageDoor(GarageDoor.Opening);
        wasEventProcessed = true;
        break;
      case Opening:
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,148,GarageDoorZ,"+System.identityHashCode(this)+",sm_t,Opening,buttonOrObstacle,HalfOpen" );
        setGarageDoor(GarageDoor.HalfOpen);
        wasEventProcessed = true;
        break;
      case HalfOpen:
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,148,GarageDoorZ,"+System.identityHashCode(this)+",sm_t,HalfOpen,buttonOrObstacle,Opening" );
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
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,148,GarageDoorZ,"+System.identityHashCode(this)+",sm_t,Closing,reachBottom,Closed" );
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
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerStateMachine.ump,148,GarageDoorZ,"+System.identityHashCode(this)+",sm_t,Opening,reachTop,Open" );
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
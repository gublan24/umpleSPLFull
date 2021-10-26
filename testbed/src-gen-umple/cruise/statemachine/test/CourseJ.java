/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 144 "../../../../src/TestHarnessStateMachine.ump"
public class CourseJ
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseJ State Machines
  public enum Status { S1, S2, S3 }
  public enum StatusS1 { Null, S1A, S1B }
  public enum StatusS1S1B { Null, S1B1, S1B2 }
  public enum StatusS2 { Null, S2A, S2B, S2C }
  private Status status;
  private StatusS1 statusS1;
  private StatusS1S1B statusS1S1B;
  private StatusS2 statusS2;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseJ()
  {
    setStatusS1(StatusS1.Null);
    setStatusS1S1B(StatusS1S1B.Null);
    setStatusS2(StatusS2.Null);
    setStatus(Status.S1);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStatusFullName()
  {
    String answer = status.toString();
    if (statusS1 != StatusS1.Null) { answer += "." + statusS1.toString(); }
    if (statusS1S1B != StatusS1S1B.Null) { answer += "." + statusS1S1B.toString(); }
    if (statusS2 != StatusS2.Null) { answer += "." + statusS2.toString(); }
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public StatusS1 getStatusS1()
  {
    return statusS1;
  }

  public StatusS1S1B getStatusS1S1B()
  {
    return statusS1S1B;
  }

  public StatusS2 getStatusS2()
  {
    return statusS2;
  }

  public boolean e2()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    StatusS2 aStatusS2 = statusS2;
    switch (aStatus)
    {
      case S1:
        exitStatus();
        setStatusS2(StatusS2.S2C);
        wasEventProcessed = true;
        break;
      case S3:
        setStatus(Status.S2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aStatusS2)
    {
      case S2C:
        exitStatus();
        setStatus(Status.S3);
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
    
    Status aStatus = status;
    StatusS1 aStatusS1 = statusS1;
    StatusS1S1B aStatusS1S1B = statusS1S1B;
    StatusS2 aStatusS2 = statusS2;
    switch (aStatus)
    {
      case S3:
        setStatusS1(StatusS1.S1A);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aStatusS1)
    {
      case S1A:
        exitStatus();
        setStatus(Status.S2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aStatusS1S1B)
    {
      case S1B2:
        exitStatus();
        setStatus(Status.S3);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aStatusS2)
    {
      case S2A:
        exitStatus();
        setStatus(Status.S2);
        wasEventProcessed = true;
        break;
      case S2C:
        exitStatusS2();
        setStatusS2(StatusS2.S2B);
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
    
    Status aStatus = status;
    StatusS1S1B aStatusS1S1B = statusS1S1B;
    StatusS2 aStatusS2 = statusS2;
    switch (aStatus)
    {
      case S3:
        setStatusS2(StatusS2.S2C);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aStatusS1S1B)
    {
      case S1B1:
        exitStatus();
        setStatusS2(StatusS2.S2B);
        wasEventProcessed = true;
        break;
      case S1B2:
        exitStatusS1();
        setStatusS1(StatusS1.S1A);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aStatusS2)
    {
      case S2A:
        exitStatus();
        setStatusS1S1B(StatusS1S1B.S1B1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean e5()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    StatusS1 aStatusS1 = statusS1;
    StatusS2 aStatusS2 = statusS2;
    switch (aStatus)
    {
      case S3:
        setStatus(Status.S1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aStatusS1)
    {
      case S1B:
        exitStatusS1();
        setStatusS1(StatusS1.S1A);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aStatusS2)
    {
      case S2C:
        exitStatus();
        setStatus(Status.S3);
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
    
    StatusS1S1B aStatusS1S1B = statusS1S1B;
    StatusS2 aStatusS2 = statusS2;
    switch (aStatusS1S1B)
    {
      case S1B1:
        exitStatusS1S1B();
        setStatusS1S1B(StatusS1S1B.S1B2);
        wasEventProcessed = true;
        break;
      case S1B2:
        exitStatusS1S1B();
        setStatusS1S1B(StatusS1S1B.S1B1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aStatusS2)
    {
      case S2A:
        exitStatus();
        setStatus(Status.S1);
        wasEventProcessed = true;
        break;
      case S2B:
        exitStatusS2();
        setStatusS2(StatusS2.S2A);
        wasEventProcessed = true;
        break;
      case S2C:
        exitStatusS2();
        setStatusS2(StatusS2.S2B);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitStatus()
  {
    switch(status)
    {
      case S1:
        exitStatusS1();
        break;
      case S2:
        exitStatusS2();
        break;
    }
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;

    // entry actions and do activities
    switch(status)
    {
      case S1:
        if (statusS1 == StatusS1.Null) { setStatusS1(StatusS1.S1A); }
        break;
      case S2:
        if (statusS2 == StatusS2.Null) { setStatusS2(StatusS2.S2A); }
        break;
    }
  }

  private void exitStatusS1()
  {
    switch(statusS1)
    {
      case S1A:
        setStatusS1(StatusS1.Null);
        break;
      case S1B:
        exitStatusS1S1B();
        setStatusS1(StatusS1.Null);
        break;
    }
  }

  private void setStatusS1(StatusS1 aStatusS1)
  {
    statusS1 = aStatusS1;
    if (status != Status.S1 && aStatusS1 != StatusS1.Null) { setStatus(Status.S1); }

    // entry actions and do activities
    switch(statusS1)
    {
      case S1B:
        if (statusS1S1B == StatusS1S1B.Null) { setStatusS1S1B(StatusS1S1B.S1B1); }
        break;
    }
  }

  private void exitStatusS1S1B()
  {
    switch(statusS1S1B)
    {
      case S1B1:
        setStatusS1S1B(StatusS1S1B.Null);
        break;
      case S1B2:
        setStatusS1S1B(StatusS1S1B.Null);
        break;
    }
  }

  private void setStatusS1S1B(StatusS1S1B aStatusS1S1B)
  {
    statusS1S1B = aStatusS1S1B;
    if (statusS1 != StatusS1.S1B && aStatusS1S1B != StatusS1S1B.Null) { setStatusS1(StatusS1.S1B); }
  }

  private void exitStatusS2()
  {
    switch(statusS2)
    {
      case S2A:
        setStatusS2(StatusS2.Null);
        break;
      case S2B:
        setStatusS2(StatusS2.Null);
        break;
      case S2C:
        setStatusS2(StatusS2.Null);
        break;
    }
  }

  private void setStatusS2(StatusS2 aStatusS2)
  {
    statusS2 = aStatusS2;
    if (status != Status.S2 && aStatusS2 != StatusS2.Null) { setStatus(Status.S2); }
  }

  public void delete()
  {}

}
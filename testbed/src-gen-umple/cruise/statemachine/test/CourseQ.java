/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 244 "../../../../src/TestHarnessStateMachine.ump"
public class CourseQ
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseQ State Machines
  public enum One { Off, On }
  private One one;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseQ()
  {
    setOne(One.Off);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getOneFullName()
  {
    String answer = one.toString();
    return answer;
  }

  public One getOne()
  {
    return one;
  }

  private boolean __autotransition1__()
  {
    boolean wasEventProcessed = false;
    
    One aOne = one;
    switch (aOne)
    {
      case Off:
        setOne(One.On);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setOne(One aOne)
  {
    one = aOne;

    // entry actions and do activities
    switch(one)
    {
      case Off:
        __autotransition1__();
        break;
    }
  }

  public void delete()
  {}

}
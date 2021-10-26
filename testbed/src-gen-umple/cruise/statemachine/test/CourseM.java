/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 189 "../../../../src/TestHarnessStateMachine.ump"
public class CourseM
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseM State Machines
  public enum One { On, Off }
  private One one;
  public enum Two { Slow, Fast }
  private Two two;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseM()
  {
    setOne(One.On);
    setTwo(Two.Slow);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getOneFullName()
  {
    String answer = one.toString();
    return answer;
  }

  public String getTwoFullName()
  {
    String answer = two.toString();
    return answer;
  }

  public One getOne()
  {
    return one;
  }

  public Two getTwo()
  {
    return two;
  }

  public boolean flip()
  {
    boolean wasEventProcessed = false;
    
    One aOne = one;
    Two aTwo = two;
    switch (aOne)
    {
      case On:
        setOne(One.Off);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    switch (aTwo)
    {
      case Slow:
        setTwo(Two.Fast);
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
  }

  private void setTwo(Two aTwo)
  {
    two = aTwo;
  }

  public void delete()
  {}

}
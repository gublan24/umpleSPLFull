/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 232 "../../../../src/TestHarnessStateMachine.ump"
public class CourseP
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseP State Machines
  public enum One { On, Amber }
  private One one;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseP()
  {
    setOne(One.On);
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

  public boolean stay()
  {
    boolean wasEventProcessed = false;
    
    One aOne = one;
    switch (aOne)
    {
      case On:
        setOne(One.On);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean flip()
  {
    boolean wasEventProcessed = false;
    
    One aOne = one;
    switch (aOne)
    {
      case On:
        setOne(One.Amber);
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

  public void delete()
  {}

}
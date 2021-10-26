/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 221 "../../../../src/TestHarnessStateMachine.ump"
public class CourseO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseO State Machines
  public enum One { On, Off }
  private One one;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseO()
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

  public boolean revert()
  {
    boolean wasEventProcessed = false;
    
    One aOne = one;
    switch (aOne)
    {
      case On:
        setOne(One.Off);
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
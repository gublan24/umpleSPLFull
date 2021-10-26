/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 162 "../../../../src/TestHarnessStateMachineJava.ump"
public class CourseT
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseT Attributes
  private int count;

  //CourseT State Machines
  public enum One { Off, On, Wait }
  private One one;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseT(int aCount)
  {
    count = aCount;
    setOne(One.Off);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCount(int aCount)
  {
    boolean wasSet = false;
    count = aCount;
    wasSet = true;
    return wasSet;
  }

  public int getCount()
  {
    return count;
  }

  public String getOneFullName()
  {
    String answer = one.toString();
    return answer;
  }

  public One getOne()
  {
    return one;
  }

  private boolean __autotransition10__()
  {
    boolean wasEventProcessed = false;
    
    One aOne = one;
    switch (aOne)
    {
      case Off:
        if (getCount()>10)
        {
          setOne(One.On);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private boolean __autotransition11__()
  {
    boolean wasEventProcessed = false;
    
    One aOne = one;
    switch (aOne)
    {
      case Off:
        if (getCount()<=10)
        {
          setOne(One.Wait);
          wasEventProcessed = true;
          break;
        }
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
        __autotransition10__();
        __autotransition11__();
        break;
    }
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "count" + ":" + getCount()+ "]";
  }
}
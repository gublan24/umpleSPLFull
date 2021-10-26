/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.statemachine.test;

// line 4 "../../../../src/TestHarnessStateMachine.ump"
public class CourseA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseA State Machines
  public enum Status {  }
  private Status status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseA()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public String getStatusFullName()
  {
    String answer = status.toString();
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public void delete()
  {}

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;

// line 3 "../../../../src/TestHarnessConstraints.ump"
public class BoatA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BoatA Attributes
  private int age;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BoatA(int aAge)
  {
    age = aAge;
    if ((aAge<=18))
    {
      throw new RuntimeException("Please provide a valid age [age>18]");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAge(int aAge)
  {
    boolean wasSet = false;
    if ((aAge>18))
    {
    age = aAge;
    wasSet = true;
    }
    return wasSet;
  }

  public int getAge()
  {
    return age;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "age" + ":" + getAge()+ "]";
  }
}
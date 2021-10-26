/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations;

// line 80 "../../../src/LocalHarness.ump"
public class StudentAP
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentAP Attributes
  private int number;

  //StudentAP Associations
  private MentorAP mentor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StudentAP(int aNumber, MentorAP aMentor)
  {
    number = aNumber;
    if (aMentor == null || aMentor.getStudent() != null)
    {
      throw new RuntimeException("Unable to create StudentAP due to aMentor. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    mentor = aMentor;
  }

  public StudentAP(int aNumber, String aNameForMentor, GradStudentAP aGradStudentForMentor)
  {
    number = aNumber;
    mentor = new MentorAP(aNameForMentor, aGradStudentForMentor, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumber(int aNumber)
  {
    boolean wasSet = false;
    number = aNumber;
    wasSet = true;
    return wasSet;
  }

  public int getNumber()
  {
    return number;
  }
  /* Code from template association_GetOne */
  public MentorAP getMentor()
  {
    return mentor;
  }

  public void delete()
  {
    MentorAP existingMentor = mentor;
    mentor = null;
    if (existingMentor != null)
    {
      existingMentor.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "number" + ":" + getNumber()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "mentor = "+(getMentor()!=null?Integer.toHexString(System.identityHashCode(getMentor())):"null");
  }
}
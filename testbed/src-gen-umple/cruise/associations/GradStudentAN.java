/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations;

// line 38 "../../../src/LocalHarness.ump"
public class GradStudentAN
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GradStudentAN Associations
  private MentorAN mentorAN;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GradStudentAN(MentorAN aMentorAN)
  {
    if (aMentorAN == null || aMentorAN.getGradStudent() != null)
    {
      throw new RuntimeException("Unable to create GradStudentAN due to aMentorAN. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    mentorAN = aMentorAN;
  }

  public GradStudentAN(String aNameForMentorAN)
  {
    mentorAN = new MentorAN(aNameForMentorAN, this);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public MentorAN getMentorAN()
  {
    return mentorAN;
  }

  public void delete()
  {
    MentorAN existingMentorAN = mentorAN;
    mentorAN = null;
    if (existingMentorAN != null)
    {
      existingMentorAN.delete();
    }
  }

}
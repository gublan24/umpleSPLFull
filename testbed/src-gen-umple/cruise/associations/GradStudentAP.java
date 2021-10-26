/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations;

// line 70 "../../../src/LocalHarness.ump"
public class GradStudentAP
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GradStudentAP Associations
  private MentorAP mentorAP;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GradStudentAP(MentorAP aMentorAP)
  {
    if (aMentorAP == null || aMentorAP.getGradStudent() != null)
    {
      throw new RuntimeException("Unable to create GradStudentAP due to aMentorAP. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    mentorAP = aMentorAP;
  }

  public GradStudentAP(String aNameForMentorAP, StudentAP aStudentForMentorAP)
  {
    mentorAP = new MentorAP(aNameForMentorAP, this, aStudentForMentorAP);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public MentorAP getMentorAP()
  {
    return mentorAP;
  }

  public void delete()
  {
    MentorAP existingMentorAP = mentorAP;
    mentorAP = null;
    if (existingMentorAP != null)
    {
      existingMentorAP.delete();
    }
  }

}
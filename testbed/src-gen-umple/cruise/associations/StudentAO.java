/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations;

// line 64 "../../../src/LocalHarness.ump"
public class StudentAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentAO Attributes
  private int number;

  //StudentAO Associations
  private MentorAO mentor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StudentAO(int aNumber, MentorAO aMentor)
  {
    number = aNumber;
    boolean didAddMentor = setMentor(aMentor);
    if (!didAddMentor)
    {
      throw new RuntimeException("Unable to create student due to mentor. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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
  public MentorAO getMentor()
  {
    return mentor;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setMentor(MentorAO aMentor)
  {
    boolean wasSet = false;
    //Must provide mentor to student
    if (aMentor == null)
    {
      return wasSet;
    }

    //mentor already at maximum (2)
    if (aMentor.numberOfStudents() >= MentorAO.maximumNumberOfStudents())
    {
      return wasSet;
    }
    
    MentorAO existingMentor = mentor;
    mentor = aMentor;
    if (existingMentor != null && !existingMentor.equals(aMentor))
    {
      boolean didRemove = existingMentor.removeStudent(this);
      if (!didRemove)
      {
        mentor = existingMentor;
        return wasSet;
      }
    }
    mentor.addStudent(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    MentorAO placeholderMentor = mentor;
    this.mentor = null;
    if(placeholderMentor != null)
    {
      placeholderMentor.removeStudent(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "number" + ":" + getNumber()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "mentor = "+(getMentor()!=null?Integer.toHexString(System.identityHashCode(getMentor())):"null");
  }
}
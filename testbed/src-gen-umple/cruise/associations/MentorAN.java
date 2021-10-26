/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations;
import java.util.*;

// line 42 "../../../src/LocalHarness.ump"
public class MentorAN
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MentorAN Attributes
  private String name;

  //MentorAN Associations
  private GradStudentAN gradStudent;
  private List<StudentAN> students;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MentorAN(String aName, GradStudentAN aGradStudent)
  {
    name = aName;
    if (aGradStudent == null || aGradStudent.getMentorAN() != null)
    {
      throw new RuntimeException("Unable to create MentorAN due to aGradStudent. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    gradStudent = aGradStudent;
    students = new ArrayList<StudentAN>();
  }

  public MentorAN(String aName)
  {
    name = aName;
    gradStudent = new GradStudentAN(this);
    students = new ArrayList<StudentAN>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template association_GetOne */
  public GradStudentAN getGradStudent()
  {
    return gradStudent;
  }
  /* Code from template association_GetMany */
  public StudentAN getStudent(int index)
  {
    StudentAN aStudent = students.get(index);
    return aStudent;
  }

  public List<StudentAN> getStudents()
  {
    List<StudentAN> newStudents = Collections.unmodifiableList(students);
    return newStudents;
  }

  public int numberOfStudents()
  {
    int number = students.size();
    return number;
  }

  public boolean hasStudents()
  {
    boolean has = students.size() > 0;
    return has;
  }

  public int indexOfStudent(StudentAN aStudent)
  {
    int index = students.indexOf(aStudent);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStudents()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public StudentAN addStudent(int aNumber)
  {
    return new StudentAN(aNumber, this);
  }

  public boolean addStudent(StudentAN aStudent)
  {
    boolean wasAdded = false;
    if (students.contains(aStudent)) { return false; }
    MentorAN existingMentor = aStudent.getMentor();
    boolean isNewMentor = existingMentor != null && !this.equals(existingMentor);
    if (isNewMentor)
    {
      aStudent.setMentor(this);
    }
    else
    {
      students.add(aStudent);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStudent(StudentAN aStudent)
  {
    boolean wasRemoved = false;
    //Unable to remove aStudent, as it must always have a mentor
    if (!this.equals(aStudent.getMentor()))
    {
      students.remove(aStudent);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStudentAt(StudentAN aStudent, int index)
  {  
    boolean wasAdded = false;
    if(addStudent(aStudent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudents()) { index = numberOfStudents() - 1; }
      students.remove(aStudent);
      students.add(index, aStudent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStudentAt(StudentAN aStudent, int index)
  {
    boolean wasAdded = false;
    if(students.contains(aStudent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudents()) { index = numberOfStudents() - 1; }
      students.remove(aStudent);
      students.add(index, aStudent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStudentAt(aStudent, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    GradStudentAN existingGradStudent = gradStudent;
    gradStudent = null;
    if (existingGradStudent != null)
    {
      existingGradStudent.delete();
    }
    for(int i=students.size(); i > 0; i--)
    {
      StudentAN aStudent = students.get(i - 1);
      aStudent.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "gradStudent = "+(getGradStudent()!=null?Integer.toHexString(System.identityHashCode(getGradStudent())):"null");
  }
}
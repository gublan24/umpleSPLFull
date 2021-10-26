/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations;
import java.util.*;

// line 58 "../../../src/LocalHarness.ump"
public class MentorAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MentorAO Attributes
  private String name;

  //MentorAO Associations
  private GradStudentAO gradStudent;
  private List<StudentAO> students;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MentorAO(String aName, GradStudentAO aGradStudent)
  {
    name = aName;
    if (aGradStudent == null || aGradStudent.getMentorAO() != null)
    {
      throw new RuntimeException("Unable to create MentorAO due to aGradStudent. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    gradStudent = aGradStudent;
    students = new ArrayList<StudentAO>();
  }

  public MentorAO(String aName)
  {
    name = aName;
    gradStudent = new GradStudentAO(this);
    students = new ArrayList<StudentAO>();
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
  public GradStudentAO getGradStudent()
  {
    return gradStudent;
  }
  /* Code from template association_GetMany */
  public StudentAO getStudent(int index)
  {
    StudentAO aStudent = students.get(index);
    return aStudent;
  }

  public List<StudentAO> getStudents()
  {
    List<StudentAO> newStudents = Collections.unmodifiableList(students);
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

  public int indexOfStudent(StudentAO aStudent)
  {
    int index = students.indexOf(aStudent);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfStudentsValid()
  {
    boolean isValid = numberOfStudents() >= minimumNumberOfStudents() && numberOfStudents() <= maximumNumberOfStudents();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfStudents()
  {
    return 2;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStudents()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfStudents()
  {
    return 2;
  }
  /* Code from template association_AddMNToOnlyOne */
  public StudentAO addStudent(int aNumber)
  {
    if (numberOfStudents() >= maximumNumberOfStudents())
    {
      return null;
    }
    else
    {
      return new StudentAO(aNumber, this);
    }
  }

  public boolean addStudent(StudentAO aStudent)
  {
    boolean wasAdded = false;
    if (students.contains(aStudent)) { return false; }
    if (numberOfStudents() >= maximumNumberOfStudents())
    {
      return wasAdded;
    }

    MentorAO existingMentor = aStudent.getMentor();
    boolean isNewMentor = existingMentor != null && !this.equals(existingMentor);

    if (isNewMentor && existingMentor.numberOfStudents() <= minimumNumberOfStudents())
    {
      return wasAdded;
    }

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

  public boolean removeStudent(StudentAO aStudent)
  {
    boolean wasRemoved = false;
    //Unable to remove aStudent, as it must always have a mentor
    if (this.equals(aStudent.getMentor()))
    {
      return wasRemoved;
    }

    //mentor already at minimum (2)
    if (numberOfStudents() <= minimumNumberOfStudents())
    {
      return wasRemoved;
    }
    students.remove(aStudent);
    wasRemoved = true;
    return wasRemoved;
  }

  public void delete()
  {
    GradStudentAO existingGradStudent = gradStudent;
    gradStudent = null;
    if (existingGradStudent != null)
    {
      existingGradStudent.delete();
    }
    for(int i=students.size(); i > 0; i--)
    {
      StudentAO aStudent = students.get(i - 1);
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
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class MentorF
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static $nextY = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Autounique Attributes
  private $y;

  //MentorF Associations
  private $students;
  private $program;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($allStudents)
  {
    $this->y = self::$nextY++;
    $this->students = array();
    $didAddStudents = $this->setStudents($allStudents);
    if (!$didAddStudents)
    {
      throw new Exception("Unable to create MentorF, must have at least 2 students. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getY()
  {
    return $this->y;
  }

  public function getStudent_index($index)
  {
    $aStudent = $this->students[$index];
    return $aStudent;
  }

  public function getStudents()
  {
    $newStudents = $this->students;
    return $newStudents;
  }

  public function numberOfStudents()
  {
    $number = count($this->students);
    return $number;
  }

  public function hasStudents()
  {
    $has = $this->numberOfStudents() > 0;
    return $has;
  }

  public function indexOfStudent($aStudent)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->students as $student)
    {
      if ($student->equals($aStudent))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getProgram()
  {
    return $this->program;
  }

  public function hasProgram()
  {
    $has = $this->program != null;
    return $has;
  }

  public static function minimumNumberOfStudents()
  {
    return 2;
  }

  public function addStudent($aStudent)
  {
    $wasAdded = false;
    if ($this->indexOfStudent($aStudent) !== -1) { return false; }
    $existingMentor = $aStudent->getMentor();
    if ($existingMentor != null && $existingMentor->numberOfStudents() <= self::minimumNumberOfStudents())
    {
      return $wasAdded;
    }
    else if ($existingMentor != null)
    {
      unset($existingMentor->students[$existingMentor->indexOfStudent($aStudent)]);
      $existingMentor->students = array_values($existingMentor->students);
    }
    $this->students[] = $aStudent;
    $this->setMentor($aStudent,$this);
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeStudent($aStudent)
  {
    $wasRemoved = false;
    if ($this->indexOfStudent($aStudent) != -1 && $this->numberOfStudents() > self::minimumNumberOfStudents())
    {
      unset($this->students[$this->indexOfStudent($aStudent)]);
      $this->students = array_values($this->students);
      $this->setMentor($aStudent,null);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function setStudents($newStudents)
  {
    $wasSet = false;
    if (count($newStudents) < self::minimumNumberOfStudents())
    {
      return $wasSet;
    }

    $checkNewStudents = array();
    $mentorToNewStudents = array();
    foreach ($newStudents as $aStudent)
    {
      if (array_search($aStudent,$checkNewStudents) !== false)
      {
        return $wasSet;
      }
      else if ($aStudent->getMentor() != null && $this !== $aStudent->getMentor())
      {
        $existingMentor = $aStudent->getMentor();
        $existingSerializedMentor = serialize($existingMentor);
        if (!array_key_exists($existingSerializedMentor, $mentorToNewStudents))
        {
          $mentorToNewStudents[$existingSerializedMentor] = $existingMentor->numberOfStudents();
        }
        $nextCount = $mentorToNewStudents[$existingSerializedMentor] - 1;
        if ($nextCount < self::minimumnumberOfStudents())
        {
          return $wasSet;
        }
        $mentorToNewStudents[$existingSerializedMentor] = $nextCount;
      }
      $checkNewStudents[] = $aStudent;
    }

    foreach ($this->students as $orphan) 
    {
      $wasFound = false;
      foreach ($checkNewStudents as $fosterCare)
      {
        if ($orphan == $fosterCare)
        {
          $wasFound = true;
          break;
        }
      }
      
      if (!$wasFound)
      {
        $this->setMentor($orphan, null);
      }
    }

    $this->students = array();
    foreach ($newStudents as $aStudent)
    {
      if ($aStudent->getMentor() != null)
      {
        unset($aStudent->getMentor()->students[$aStudent->getMentor()->indexOfStudent($aStudent)]);
        $aStudent->getMentor()->students = array_values($aStudent->getMentor()->students);
      }
      $this->setMentor($aStudent, $this);
      $this->students[] = $aStudent;
    }
    $wasSet = true;
    return $wasSet;
  }

  private function setMentor($aStudent, $aMentor)
  {
    $aStudent->mentor = $aMentor;
    //$prop = new ReflectionProperty($aStudent, 'mentor');
    //$prop->setAccessible(true);
    //$prop->setValue($aStudent,$aMentor);
    //$prop->setAccessible(false);
  }

  public function addStudentAt($aStudent, $index)
  {  
    $wasAdded = false;
    if($this->addStudent($aStudent))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStudents()) { $index = $this->numberOfStudents() - 1; }
      array_splice($this->students, $this->indexOfStudent($aStudent), 1);
      array_splice($this->students, $index, 0, array($aStudent));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveStudentAt($aStudent, $index)
  {
    $wasAdded = false;
    if($this->indexOfStudent($aStudent) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStudents()) { $index = $this->numberOfStudents() - 1; }
      array_splice($this->students, $this->indexOfStudent($aStudent), 1);
      array_splice($this->students, $index, 0, array($aStudent));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addStudentAt($aStudent, $index);
    }
    return $wasAdded;
  }

  public function setProgram($aNewProgram)
  {
    $wasSet = false;
    if ($aNewProgram == null)
    {
      $existingProgram = $this->program;
      $this->program = null;
      
      if ($existingProgram != null && $existingProgram->getMentor() != null)
      {
        $existingProgram->setMentor(null);
      }
      $wasSet = true;
      return $wasSet;
    }
    
    $currentProgram = $this->getProgram();
    if ($currentProgram != null && $currentProgram != $aNewProgram)
    {
      $currentProgram->setMentor(null);
    }
    
    $this->program = $aNewProgram;
    $existingMentor = $aNewProgram->getMentor();
    
    if ($this != $existingMentor)
    {
      $aNewProgram->setMentor($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    foreach ($this->students as $aStudent)
    {
      $this->setMentor($aStudent,null);
    }
    $this->students = array();
    if ($this->program != null)
    {
      $this->program->setMentor(null);
    }
  }

}
?>
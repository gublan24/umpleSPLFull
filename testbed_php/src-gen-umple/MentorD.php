<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class MentorD
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

  //MentorD Associations
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
      throw new Exception("Unable to create MentorD, must have 3 students. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public static function requiredNumberOfStudents()
  {
    return 3;
  }

  public static function minimumNumberOfStudents()
  {
    return 3;
  }

  public static function maximumNumberOfStudents()
  {
    return 3;
  }

  public function setStudents($newStudents)
  {
    $wasSet = false;
    $checkNewStudents = array();
    foreach ($newStudents as $aStudent)
    {
      if (array_search($aStudent,$checkNewStudents) !== false)
      {
        return $wasSet;
      }
      else if ($aStudent->getMentor() != null && $this !== $aStudent->getMentor())
      {
        return $wasSet;
      }
      $checkNewStudents[] = $aStudent;
    }

    if (count($checkNewStudents) != self::minimumNumberOfStudents())
    {
      return $wasSet;
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
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class StudentF
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static $nextX = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Autounique Attributes
  private $x;

  //StudentF Associations
  private $program;
  public $mentor; //until PHP 5.3 (setAccessible)

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->x = self::$nextX++;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getX()
  {
    return $this->x;
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

  public function getMentor()
  {
    return $this->mentor;
  }

  public function hasMentor()
  {
    $has = $this->mentor != null;
    return $has;
  }

  public function setProgram($aNewProgram)
  {
    $wasSet = false;
    if ($aNewProgram == null)
    {
      $existingProgram = $this->program;
      $this->program = null;
      
      if ($existingProgram != null && $existingProgram->getStudent() != null)
      {
        $existingProgram->setStudent(null);
      }
      $wasSet = true;
      return $wasSet;
    }
    
    $currentProgram = $this->getProgram();
    if ($currentProgram != null && $currentProgram != $aNewProgram)
    {
      $currentProgram->setStudent(null);
    }
    
    $this->program = $aNewProgram;
    $existingStudent = $aNewProgram->getStudent();
    
    if ($this != $existingStudent)
    {
      $aNewProgram->setStudent($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function setMentor($aMentor)
  {
    //
    // This source of this source generation is association_SetOptionalOneToMandatoryMany.jet
    // This set file assumes the generation of a maximumNumberOfXXX method does not exist because 
    // it's not required (No upper bound)
    //   

    $wasSet = false;
    
    $existingMentor = $this->mentor;

    if ($existingMentor == null)
    {
      if ($aMentor != null)
      {
        if ($aMentor->addStudent($this))
        {
          $existingMentor = $aMentor;
          $wasSet = true;
        }
      }
    } 
    else if ($existingMentor != null)
    {
      if ($aMentor == null)
      {
        if ($existingMentor->minimumNumberOfStudents() < $existingMentor->numberOfStudents())
        {
          $existingMentor->removeStudent($this);
          $existingMentor = $aMentor;  // aMentor == null
          $wasSet = true;
        }
      } 
      else
      {
        if ($existingMentor->minimumNumberOfStudents() < $existingMentor->numberOfStudents())
        {
          $existingMentor->removeStudent($this);
          $aMentor->addStudent($this);
          $existingMentor = $aMentor;
          $wasSet = true;
        }
      }
    }
    if ($wasSet)
    {
      $mentor = $existingMentor;
    }
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    if ($this->program != null)
    {
      $this->program->setStudent(null);
    }
    if ($this->mentor != null)
    {
      if ($this->mentor->numberOfStudents() <= 2)
      {
        $this->mentor->delete();
      }
      else
      {
        $this->mentor->removeStudent($this);
      }
    }
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class StudentY
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentY Attributes
  private $number;

  //StudentY Associations
  private $program;
  private $mentor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNumber)
  {
    $this->number = $aNumber;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setNumber($aNumber)
  {
    $wasSet = false;
    $this->number = $aNumber;
    $wasSet = true;
    return $wasSet;
  }

  public function getNumber()
  {
    return $this->number;
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
    $wasSet = false;
    if ($aMentor != null && $aMentor->numberOfStudents() >= MentorY::maximumNumberOfStudents())
    {
      return $wasSet;
    }

    $existingMentor = $this->mentor;
    $this->mentor = $aMentor;
    if ($existingMentor != null && $existingMentor != $aMentor)
    {
      $existingMentor->removeStudent($this);
    }
    if ($aMentor != null)
    {
      $aMentor->addStudent($this);
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
    if ($this->program != null)
    {
      $this->program->setStudent(null);
    }
    if ($this->mentor != null)
    {
      $this->mentor->removeStudent($this);
    }
  }

}
?>
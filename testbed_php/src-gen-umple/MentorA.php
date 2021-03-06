<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class MentorA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MentorA Associations
  private $student;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public function getStudent()
  {
    return $this->student;
  }

  public function hasStudent()
  {
    $has = $this->student != null;
    return $has;
  }

  public function setStudent($aNewStudent)
  {
    $wasSet = false;
    if ($aNewStudent == null)
    {
      $existingStudent = $this->student;
      $this->student = null;
      
      if ($existingStudent != null && $existingStudent->getMentor() != null)
      {
        $existingStudent->setMentor(null);
      }
      $wasSet = true;
      return $wasSet;
    }
    
    $currentStudent = $this->getStudent();
    if ($currentStudent != null && $currentStudent != $aNewStudent)
    {
      $currentStudent->setMentor(null);
    }
    
    $this->student = $aNewStudent;
    $existingMentor = $aNewStudent->getMentor();
    
    if ($this != $existingMentor)
    {
      $aNewStudent->setMentor($this);
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
    if ($this->student != null)
    {
      $this->student->setMentor(null);
    }
  }

}
?>
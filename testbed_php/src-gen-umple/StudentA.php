<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class StudentA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentA Associations
  private $mentor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public function getMentor()
  {
    return $this->mentor;
  }

  public function hasMentor()
  {
    $has = $this->mentor != null;
    return $has;
  }

  public function setMentor($aNewMentor)
  {
    $wasSet = false;
    if ($aNewMentor == null)
    {
      $existingMentor = $this->mentor;
      $this->mentor = null;
      
      if ($existingMentor != null && $existingMentor->getStudent() != null)
      {
        $existingMentor->setStudent(null);
      }
      $wasSet = true;
      return $wasSet;
    }
    
    $currentMentor = $this->getMentor();
    if ($currentMentor != null && $currentMentor != $aNewMentor)
    {
      $currentMentor->setStudent(null);
    }
    
    $this->mentor = $aNewMentor;
    $existingStudent = $aNewMentor->getStudent();
    
    if ($this != $existingStudent)
    {
      $aNewMentor->setStudent($this);
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
    if ($this->mentor != null)
    {
      $this->mentor->setStudent(null);
    }
  }

}
?>
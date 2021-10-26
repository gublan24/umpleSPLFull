<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class StudentAM
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentAM Attributes
  private $id;

  //StudentAM Associations
  private $mentor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aId)
  {
    $this->id = $aId;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setId($aId)
  {
    $wasSet = false;
    $this->id = $aId;
    $wasSet = true;
    return $wasSet;
  }

  public function getId()
  {
    return $this->id;
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

  public function setMentor($aMentor)
  {
    $wasSet = false;
    $existingMentor = $this->mentor;
    $this->mentor = $aMentor;
    if ($existingMentor != null && $existingMentor !== $aMentor)
    {
      $existingMentor->removeStudent($this);
    }
    if ($aMentor != null && $aMentor !== $existingMentor)
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
    if ($this->mentor != null)
    {
      $this->mentor->removeStudent($this);
    }
  }

}
?>
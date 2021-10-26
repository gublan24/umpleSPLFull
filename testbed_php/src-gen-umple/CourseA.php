<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class CourseA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseA State Machines
  private $status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public function getStatusFullName()
  {
    $answer = $this->getStatus();
    return $answer;
  }

  public function getStatus()
  {
    return null;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class DoorH
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorH Attributes
  private $id;

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

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
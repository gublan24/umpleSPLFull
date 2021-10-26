<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class DoorA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorA Attributes
  private $id;
  private $intId;
  private $doubleId;
  private $booleanId;
  private $doorId;
  private $dateId;
  private $timeId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->id = "1";
    $this->intId = 2;
    $this->doubleId = 3.4;
    $this->booleanId = false;
    $this->doorId = new DoorB(5);
    $this->dateId = date(1234);
    $this->timeId = time();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getId()
  {
    return $this->id;
  }

  public function getIntId()
  {
    return $this->intId;
  }

  public function getDoubleId()
  {
    return $this->doubleId;
  }

  public function getBooleanId()
  {
    return $this->booleanId;
  }

  public function getDoorId()
  {
    return $this->doorId;
  }

  public function getDateId()
  {
    return $this->dateId;
  }

  public function getTimeId()
  {
    return $this->timeId;
  }

  public function isBooleanId()
  {
    return $this->booleanId;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
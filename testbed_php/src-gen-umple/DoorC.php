<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class DoorC
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorC Attributes
  private $id;
  private $intId;
  private $doubleId;
  private $dateId;
  private $timeId;
  private $booleanId;
  private $doorId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aId, $aIntId, $aDoubleId, $aDateId, $aTimeId, $aBooleanId, $aDoorId)
  {
    $this->id = $aId;
    $this->intId = $aIntId;
    $this->doubleId = $aDoubleId;
    $this->dateId = $aDateId;
    $this->timeId = $aTimeId;
    $this->booleanId = $aBooleanId;
    $this->doorId = $aDoorId;
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

  public function getDateId()
  {
    return $this->dateId;
  }

  public function getTimeId()
  {
    return $this->timeId;
  }

  public function getBooleanId()
  {
    return $this->booleanId;
  }

  public function getDoorId()
  {
    return $this->doorId;
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
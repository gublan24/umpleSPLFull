<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class DoorG
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorG Attributes
  private $floatNoF;
  private $floatWithF;
  private $doubleNoF;
  private $doubleWithF;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->floatNoF = 1.1;
    $this->floatWithF = 1.2;
    $this->doubleNoF = 1.3;
    $this->doubleWithF = 1.4;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setFloatNoF($aFloatNoF)
  {
    $wasSet = false;
    $this->floatNoF = $aFloatNoF;
    $wasSet = true;
    return $wasSet;
  }

  public function setFloatWithF($aFloatWithF)
  {
    $wasSet = false;
    $this->floatWithF = $aFloatWithF;
    $wasSet = true;
    return $wasSet;
  }

  public function setDoubleNoF($aDoubleNoF)
  {
    $wasSet = false;
    $this->doubleNoF = $aDoubleNoF;
    $wasSet = true;
    return $wasSet;
  }

  public function setDoubleWithF($aDoubleWithF)
  {
    $wasSet = false;
    $this->doubleWithF = $aDoubleWithF;
    $wasSet = true;
    return $wasSet;
  }

  public function getFloatNoF()
  {
    return $this->floatNoF;
  }

  public function getFloatWithF()
  {
    return $this->floatWithF;
  }

  public function getDoubleNoF()
  {
    return $this->doubleNoF;
  }

  public function getDoubleWithF()
  {
    return $this->doubleWithF;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
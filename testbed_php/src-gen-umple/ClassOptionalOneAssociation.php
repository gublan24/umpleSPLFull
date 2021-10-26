<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class ClassOptionalOneAssociation
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassOptionalOneAssociation Associations
  private $otherclass;

  //Helper Variables
  private $canSetOtherclass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aOtherclass)
  {
    $this->canSetOtherclass = true;
    $this->setOtherclass($aOtherclass);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getOtherclass()
  {
    return $this->otherclass;
  }

  public function hasOtherclass()
  {
    $has = $this->otherclass != null;
    return $has;
  }

  private function setOtherclass($aNewOtherclass)
  {
    $wasSet = false;
    if (!$this->canSetOtherclass) { return false; }
    $this->canSetOtherclass = false;
    $this->otherclass = $aNewOtherclass;
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
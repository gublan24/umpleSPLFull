<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class ClassOneAssociation
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassOneAssociation Associations
  private $otherclass;

  //Helper Variables
  private $canSetOtherclass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aOtherclass)
  {
    $this->canSetOtherclass = true;
    if (!$this->setOtherclass($aOtherclass))
    {
      throw new Exception("Unable to create ClassOneAssociation due to aOtherclass. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getOtherclass()
  {
    return $this->otherclass;
  }

  private function setOtherclass($aNewOtherclass)
  {
    $wasSet = false;
    if (!$this->canSetOtherclass) { return false; }
    $this->canSetOtherclass = false;
    if ($aNewOtherclass != null)
    {
      $this->otherclass = $aNewOtherclass;
      $wasSet = true;
    }
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
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class ClassThatWillHaveSortedAssociationOne
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassThatWillHaveSortedAssociationOne Attributes
  private $name;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aName)
  {
    $this->name = $aName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setName($aName)
  {
    $wasSet = false;
    $this->name = $aName;
    $wasSet = true;
    return $wasSet;
  }

  public function getName()
  {
    return $this->name;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
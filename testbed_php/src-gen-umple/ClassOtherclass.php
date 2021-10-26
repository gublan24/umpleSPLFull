<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class ClassOtherclass
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassOtherclass Attributes
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
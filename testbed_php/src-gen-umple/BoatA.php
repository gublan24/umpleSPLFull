<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class BoatA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BoatA Attributes
  private $age;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aAge)
  {
    $this->age = $aAge;
    if (($aAge<=18))
    {
      throw new RuntimeException("Please provide a valid age [age>18]");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setAge($aAge)
  {
    $wasSet = false;
    if (($aAge>18))
    {
    $this->age = $aAge;
    $wasSet = true;
    }
    return $wasSet;
  }

  public function getAge()
  {
    return $this->age;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
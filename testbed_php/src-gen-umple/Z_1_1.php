<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_1_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_1_1 Attributes
  private $num;

  //Z_1_1 Associations
  private $y_1_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum = null, $aY_1_1 = null)
  {
    if (func_num_args() == 0) { return; }

    $this->num = $aNum;
    if ($aY_1_1 == null || $aY_1_1->getZVar() != null)
    {
      throw new Exception("Unable to create Z_1_1 due to aY_1_1. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $this->y_1_1 = $aY_1_1;
  }
  public static function newInstance($aNum)
  {
    $thisInstance = new Z_1_1();
    $thisInstance->num = $aNum;
    $thisInstance->y_1_1 = new YR_1_1($thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setNum($aNum)
  {
    $wasSet = false;
    $this->num = $aNum;
    $wasSet = true;
    return $wasSet;
  }

  public function getNum()
  {
    return $this->num;
  }

  public function getY_1_1()
  {
    return $this->y_1_1;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingY_1_1 = $this->y_1_1;
    $this->y_1_1 = null;
    if ($existingY_1_1 != null)
    {
      $existingY_1_1->delete();
    }
  }

}
?>
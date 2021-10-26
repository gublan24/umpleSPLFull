<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X1_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X1_1 Attributes
  private $num;

  //X1_1 Associations
  private $y1_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum = null, $aY1_1 = null)
  {
    if (func_num_args() == 0) { return; }

    $this->num = $aNum;
    if ($aY1_1 == null || $aY1_1->getXVar() != null)
    {
      throw new Exception("Unable to create X1_1 due to aY1_1. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $this->y1_1 = $aY1_1;
  }
  public static function newInstance($aNum)
  {
    $thisInstance = new X1_1();
    $thisInstance->num = $aNum;
    $thisInstance->y1_1 = new Y1_1($thisInstance);
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

  public function getY1_1()
  {
    return $this->y1_1;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingY1_1 = $this->y1_1;
    $this->y1_1 = null;
    if ($existingY1_1 != null)
    {
      $existingY1_1->delete();
    }
  }

}
?>
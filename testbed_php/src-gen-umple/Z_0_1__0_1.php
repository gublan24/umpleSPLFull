<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_0_1__0_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__0_1 Attributes
  private $num;

  //Z_0_1__0_1 Associations
  private $y_0_1__0_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
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

  public function getY_0_1__0_1()
  {
    return $this->y_0_1__0_1;
  }

  public function hasY_0_1__0_1()
  {
    $has = $this->y_0_1__0_1 != null;
    return $has;
  }

  public function setY_0_1__0_1($aNewY_0_1__0_1)
  {
    $wasSet = false;
    if ($aNewY_0_1__0_1 == null)
    {
      $existingY_0_1__0_1 = $this->y_0_1__0_1;
      $this->y_0_1__0_1 = null;
      
      if ($existingY_0_1__0_1 != null && $existingY_0_1__0_1->getZVar() != null)
      {
        $existingY_0_1__0_1->setZVar(null);
      }
      $wasSet = true;
      return $wasSet;
    }
    
    $currentY_0_1__0_1 = $this->getY_0_1__0_1();
    if ($currentY_0_1__0_1 != null && $currentY_0_1__0_1 != $aNewY_0_1__0_1)
    {
      $currentY_0_1__0_1->setZVar(null);
    }
    
    $this->y_0_1__0_1 = $aNewY_0_1__0_1;
    $existingZVar = $aNewY_0_1__0_1->getZVar();
    
    if ($this != $existingZVar)
    {
      $aNewY_0_1__0_1->setZVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    if ($this->y_0_1__0_1 != null)
    {
      $this->y_0_1__0_1->setZVar(null);
    }
  }

}
?>
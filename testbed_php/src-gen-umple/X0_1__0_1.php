<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X0_1__0_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__0_1 Attributes
  private $num;

  //X0_1__0_1 Associations
  private $y0_1__0_1;

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

  public function getY0_1__0_1()
  {
    return $this->y0_1__0_1;
  }

  public function hasY0_1__0_1()
  {
    $has = $this->y0_1__0_1 != null;
    return $has;
  }

  public function setY0_1__0_1($aNewY0_1__0_1)
  {
    $wasSet = false;
    if ($aNewY0_1__0_1 == null)
    {
      $existingY0_1__0_1 = $this->y0_1__0_1;
      $this->y0_1__0_1 = null;
      
      if ($existingY0_1__0_1 != null && $existingY0_1__0_1->getXVar() != null)
      {
        $existingY0_1__0_1->setXVar(null);
      }
      $wasSet = true;
      return $wasSet;
    }
    
    $currentY0_1__0_1 = $this->getY0_1__0_1();
    if ($currentY0_1__0_1 != null && $currentY0_1__0_1 != $aNewY0_1__0_1)
    {
      $currentY0_1__0_1->setXVar(null);
    }
    
    $this->y0_1__0_1 = $aNewY0_1__0_1;
    $existingXVar = $aNewY0_1__0_1->getXVar();
    
    if ($this != $existingXVar)
    {
      $aNewY0_1__0_1->setXVar($this);
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
    
    if ($this->y0_1__0_1 != null)
    {
        $this->y0_1__0_1->delete();
        $this->y0_1__0_1 = null;
    }
    
  }

}
?>
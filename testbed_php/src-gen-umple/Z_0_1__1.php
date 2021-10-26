<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_0_1__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__1 Attributes
  private $num;

  //Z_0_1__1 Associations
  public $y_0_1__1; //until PHP 5.3 (setAccessible)

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

  public function getY_0_1__1()
  {
    return $this->y_0_1__1;
  }

  public function hasY_0_1__1()
  {
    $has = $this->y_0_1__1 != null;
    return $has;
  }

  public function setY_0_1__1($aNewY_0_1__1)
  {
    $wasSet = false;
    if ($this->y_0_1__1 != null && $this->y_0_1__1 != $aNewY_0_1__1 && $this == $this->y_0_1__1->getZVar())
    {
      //Unable to setY_0_1__1, as existing y_0_1__1 would become an orphan
      return $wasSet;
    }
    
    $this->y_0_1__1 = $aNewY_0_1__1;
    $anOldZVar = $aNewY_0_1__1 != null ? $aNewY_0_1__1->getZVar() : null;
    
    if ($this != $anOldZVar)
    {
      if ($anOldZVar != null)
      {
        $anOldZVar->y_0_1__1 = null;
      }
      if ($this->y_0_1__1 != null)
      {
        $this->y_0_1__1->setZVar($this);
      }
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
    $existingY_0_1__1 = $this->y_0_1__1;
    $this->y_0_1__1 = null;
    if ($existingY_0_1__1 != null)
    {
      $existingY_0_1__1->delete();
    }
  }

}
?>
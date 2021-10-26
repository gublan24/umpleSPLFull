<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X0_1__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__1 Attributes
  private $num;

  //X0_1__1 Associations
  public $y0_1__1; //until PHP 5.3 (setAccessible)

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

  public function getY0_1__1()
  {
    return $this->y0_1__1;
  }

  public function hasY0_1__1()
  {
    $has = $this->y0_1__1 != null;
    return $has;
  }

  public function setY0_1__1($aNewY0_1__1)
  {
    $wasSet = false;
    if ($this->y0_1__1 != null && $this->y0_1__1 != $aNewY0_1__1 && $this == $this->y0_1__1->getXVar())
    {
      //Unable to setY0_1__1, as existing y0_1__1 would become an orphan
      return $wasSet;
    }
    
    $this->y0_1__1 = $aNewY0_1__1;
    $anOldXVar = $aNewY0_1__1 != null ? $aNewY0_1__1->getXVar() : null;
    
    if ($this != $anOldXVar)
    {
      if ($anOldXVar != null)
      {
        $anOldXVar->y0_1__1 = null;
      }
      if ($this->y0_1__1 != null)
      {
        $this->y0_1__1->setXVar($this);
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
    
    if ($this->y0_1__1 != null)
    {
        $this->y0_1__1->delete();
        $this->y0_1__1 = null;
    }
    
  }

}
?>
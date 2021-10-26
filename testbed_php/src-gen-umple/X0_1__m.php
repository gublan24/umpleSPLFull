<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X0_1__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__m Attributes
  private $num;

  //X0_1__m Associations
  public $y0_1__m; //until PHP 5.3 (setAccessible)

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

  public function getY0_1__m()
  {
    return $this->y0_1__m;
  }

  public function hasY0_1__m()
  {
    $has = $this->y0_1__m != null;
    return $has;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    
    if ($this->y0_1__m != null)
    {
        $this->y0_1__m->delete();
        $this->y0_1__m = null;
    }
    
  }

}
?>
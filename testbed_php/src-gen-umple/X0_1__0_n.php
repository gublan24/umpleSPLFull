<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X0_1__0_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__0_n Attributes
  private $num;

  //X0_1__0_n Associations
  private $y0_1__0_n;

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

  public function getY0_1__0_n()
  {
    return $this->y0_1__0_n;
  }

  public function hasY0_1__0_n()
  {
    $has = $this->y0_1__0_n != null;
    return $has;
  }

  public function setY0_1__0_n($aY0_1__0_n)
  {
    $wasSet = false;
    if ($aY0_1__0_n != null && $aY0_1__0_n->numberOfXVar() >= Y0_1__0_n::maximumNumberOfXVar())
    {
      return $wasSet;
    }

    $existingY0_1__0_n = $this->y0_1__0_n;
    $this->y0_1__0_n = $aY0_1__0_n;
    if ($existingY0_1__0_n != null && $existingY0_1__0_n != $aY0_1__0_n)
    {
      $existingY0_1__0_n->removeXVar($this);
    }
    if ($aY0_1__0_n != null)
    {
      $aY0_1__0_n->addXVar($this);
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
    
    if ($this->y0_1__0_n != null)
    {
        $this->y0_1__0_n->delete();
        $this->y0_1__0_n = null;
    }
    
  }

}
?>
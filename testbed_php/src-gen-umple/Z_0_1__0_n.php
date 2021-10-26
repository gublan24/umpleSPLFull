<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_0_1__0_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__0_n Attributes
  private $num;

  //Z_0_1__0_n Associations
  private $y_0_1__0_n;

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

  public function getY_0_1__0_n()
  {
    return $this->y_0_1__0_n;
  }

  public function hasY_0_1__0_n()
  {
    $has = $this->y_0_1__0_n != null;
    return $has;
  }

  public function setY_0_1__0_n($aY_0_1__0_n)
  {
    $wasSet = false;
    if ($aY_0_1__0_n != null && $aY_0_1__0_n->numberOfZVar() >= YR_0_1__0_n::maximumNumberOfZVar())
    {
      return $wasSet;
    }

    $existingY_0_1__0_n = $this->y_0_1__0_n;
    $this->y_0_1__0_n = $aY_0_1__0_n;
    if ($existingY_0_1__0_n != null && $existingY_0_1__0_n != $aY_0_1__0_n)
    {
      $existingY_0_1__0_n->removeZVar($this);
    }
    if ($aY_0_1__0_n != null)
    {
      $aY_0_1__0_n->addZVar($this);
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
    if ($this->y_0_1__0_n != null)
    {
      $this->y_0_1__0_n->removeZVar($this);
    }
  }

}
?>
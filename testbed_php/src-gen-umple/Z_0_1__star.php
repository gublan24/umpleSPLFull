<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_0_1__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__star Attributes
  private $num;

  //Z_0_1__star Associations
  private $y_0_1__star;

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

  public function getY_0_1__star()
  {
    return $this->y_0_1__star;
  }

  public function hasY_0_1__star()
  {
    $has = $this->y_0_1__star != null;
    return $has;
  }

  public function setY_0_1__star($aY_0_1__star)
  {
    $wasSet = false;
    $existingY_0_1__star = $this->y_0_1__star;
    $this->y_0_1__star = $aY_0_1__star;
    if ($existingY_0_1__star != null && $existingY_0_1__star !== $aY_0_1__star)
    {
      $existingY_0_1__star->removeZVar($this);
    }
    if ($aY_0_1__star != null && $aY_0_1__star !== $existingY_0_1__star)
    {
      $aY_0_1__star->addZVar($this);
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
    if ($this->y_0_1__star != null)
    {
      $this->y_0_1__star->removeZVar($this);
    }
  }

}
?>
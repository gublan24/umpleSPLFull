<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X0_1__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__star Attributes
  private $num;

  //X0_1__star Associations
  private $y0_1__star;

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

  public function getY0_1__star()
  {
    return $this->y0_1__star;
  }

  public function hasY0_1__star()
  {
    $has = $this->y0_1__star != null;
    return $has;
  }

  public function setY0_1__star($aY0_1__star)
  {
    $wasSet = false;
    $existingY0_1__star = $this->y0_1__star;
    $this->y0_1__star = $aY0_1__star;
    if ($existingY0_1__star != null && $existingY0_1__star !== $aY0_1__star)
    {
      $existingY0_1__star->removeXVar($this);
    }
    if ($aY0_1__star != null && $aY0_1__star !== $existingY0_1__star)
    {
      $aY0_1__star->addXVar($this);
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
    
    if ($this->y0_1__star != null)
    {
        $this->y0_1__star->delete();
        $this->y0_1__star = null;
    }
    
  }

}
?>
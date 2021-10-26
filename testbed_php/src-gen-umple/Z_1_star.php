<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_1_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_1_star Attributes
  private $num;

  //Z_1_star Associations
  private $y_1_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum, $aY_1_star)
  {
    $this->num = $aNum;
    $didAddY_1_star = $this->setY_1_star($aY_1_star);
    if (!$didAddY_1_star)
    {
      throw new Exception("Unable to create zVar due to y_1_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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

  public function getY_1_star()
  {
    return $this->y_1_star;
  }

  public function setY_1_star($aY_1_star)
  {
    $wasSet = false;
    if ($aY_1_star == null)
    {
      return $wasSet;
    }
    
    $existingY_1_star = $this->y_1_star;
    $this->y_1_star = $aY_1_star;
    if ($existingY_1_star != null && $existingY_1_star != $aY_1_star)
    {
      $existingY_1_star->removeZVar($this);
    }
    $this->y_1_star->addZVar($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $placeholderY_1_star = $this->y_1_star;
    $this->y_1_star = null;
    $placeholderY_1_star->removeZVar($this);
  }

}
?>
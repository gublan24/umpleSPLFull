<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X1_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X1_star Attributes
  private $num;

  //X1_star Associations
  private $y1_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum, $aY1_star)
  {
    $this->num = $aNum;
    $didAddY1_star = $this->setY1_star($aY1_star);
    if (!$didAddY1_star)
    {
      throw new Exception("Unable to create xVar due to y1_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public function getY1_star()
  {
    return $this->y1_star;
  }

  public function setY1_star($aY1_star)
  {
    $wasSet = false;
    if ($aY1_star == null)
    {
      return $wasSet;
    }
    
    $existingY1_star = $this->y1_star;
    $this->y1_star = $aY1_star;
    if ($existingY1_star != null && $existingY1_star != $aY1_star)
    {
      $existingY1_star->removeXVar($this);
    }
    $this->y1_star->addXVar($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingY1_star = $this->y1_star;
    $this->y1_star = null;
    if ($existingY1_star != null)
    {
      $existingY1_star->delete();
    }
  }

}
?>
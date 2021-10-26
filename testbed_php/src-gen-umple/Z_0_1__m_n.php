<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_0_1__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__m_n Attributes
  private $num;

  //Z_0_1__m_n Associations
  public $y_0_1__m_n; //until PHP 5.3 (setAccessible)

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

  public function getY_0_1__m_n()
  {
    return $this->y_0_1__m_n;
  }

  public function hasY_0_1__m_n()
  {
    $has = $this->y_0_1__m_n != null;
    return $has;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    if ($this->y_0_1__m_n != null)
    {
      if ($this->y_0_1__m_n->numberOfZVar() <= 2)
      {
        $this->y_0_1__m_n->delete();
    $this->y_0_1__m_n = null;
      }
      else
      {
        $this->y_0_1__m_n = null;
    $this->y_0_1__m_n->removeZVar($this);
      }
    }
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_M_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_M_1 Attributes
  private $num;

  //Z_M_1 Associations
  private $y_m_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y_m_1 = array();
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

  public function getY_m_1_index($index)
  {
    $aY_m_1 = $this->y_m_1[$index];
    return $aY_m_1;
  }

  public function getY_m_1()
  {
    $newY_m_1 = $this->y_m_1;
    return $newY_m_1;
  }

  public function numberOfY_m_1()
  {
    $number = count($this->y_m_1);
    return $number;
  }

  public function hasY_m_1()
  {
    $has = $this->numberOfY_m_1() > 0;
    return $has;
  }

  public function indexOfY_m_1($aY_m_1)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_m_1 as $y_m_1)
    {
      if ($y_m_1->equals($aY_m_1))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfY_m_1Valid()
  {
    $isValid = $this->numberOfY_m_1() >= self::minimumNumberOfY_m_1() && $this->numberOfY_m_1() <= self::maximumNumberOfY_m_1();
    return $isValid;
  }

  public static function requiredNumberOfY_m_1()
  {
    return 3;
  }

  public static function minimumNumberOfY_m_1()
  {
    return 3;
  }

  public static function maximumNumberOfY_m_1()
  {
    return 3;
  }

  public function addY_m_1Via()
  {
    if ($this->numberOfY_m_1() >= self::maximumNumberOfY_m_1())
    {
      return null;
    }
    else
    {
      return new YR_M_1($this);
    }
  }

  public function addY_m_1($aY_m_1)
  {
    $wasAdded = false;
    if ($this->indexOfY_m_1($aY_m_1) !== -1) { return false; }
    if ($this->numberOfY_m_1() >= self::maximumNumberOfY_m_1())
    {
      return $wasAdded;
    }

    $existingZVar = $aY_m_1->getZVar();
    $isNewZVar = $existingZVar != null && $this !== $existingZVar;

    if ($isNewZVar && $existingZVar->numberOfY_m_1() <= self::minimumNumberOfY_m_1())
    {
      return $wasAdded;
    }

    if ($isNewZVar)
    {
      $aY_m_1->setZVar($this);
    }
    else
    {
      $this->y_m_1[] = $aY_m_1;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeY_m_1($aY_m_1)
  {
    $wasRemoved = false;
    //Unable to remove aY_m_1, as it must always have a zVar
    if ($this === $aY_m_1->getZVar())
    {
      return $wasRemoved;
    }

    //zVar already at minimum (3)
    if ($this->numberOfY_m_1() <= self::minimumNumberOfY_m_1())
    {
      return $wasRemoved;
    }

    unset($this->y_m_1[$this->indexOfY_m_1($aY_m_1)]);
    $this->y_m_1 = array_values($this->y_m_1);
    $wasRemoved = true;
    return $wasRemoved;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->y_m_1) > 0)
    {
      $aY_m_1 = $this->y_m_1[count($this->y_m_1) - 1];
      $aY_m_1->delete();
      unset($this->y_m_1[$this->indexOfY_m_1($aY_m_1)]);
      $this->y_m_1 = array_values($this->y_m_1);
    }
    
  }

}
?>
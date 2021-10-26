<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_m_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_m_n__1 Attributes
  private $num;

  //Z_m_n__1 Associations
  private $y_m_n__1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y_m_n__1 = array();
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

  public function getY_m_n__1_index($index)
  {
    $aY_m_n__1 = $this->y_m_n__1[$index];
    return $aY_m_n__1;
  }

  public function getY_m_n__1()
  {
    $newY_m_n__1 = $this->y_m_n__1;
    return $newY_m_n__1;
  }

  public function numberOfY_m_n__1()
  {
    $number = count($this->y_m_n__1);
    return $number;
  }

  public function hasY_m_n__1()
  {
    $has = $this->numberOfY_m_n__1() > 0;
    return $has;
  }

  public function indexOfY_m_n__1($aY_m_n__1)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_m_n__1 as $y_m_n__1)
    {
      if ($y_m_n__1->equals($aY_m_n__1))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfY_m_n__1Valid()
  {
    $isValid = $this->numberOfY_m_n__1() >= self::minimumNumberOfY_m_n__1() && $this->numberOfY_m_n__1() <= self::maximumNumberOfY_m_n__1();
    return $isValid;
  }

  public static function minimumNumberOfY_m_n__1()
  {
    return 2;
  }

  public static function maximumNumberOfY_m_n__1()
  {
    return 3;
  }

  public function addY_m_n__1Via()
  {
    if ($this->numberOfY_m_n__1() >= self::maximumNumberOfY_m_n__1())
    {
      return null;
    }
    else
    {
      return new YR_m_n__1($this);
    }
  }

  public function addY_m_n__1($aY_m_n__1)
  {
    $wasAdded = false;
    if ($this->indexOfY_m_n__1($aY_m_n__1) !== -1) { return false; }
    if ($this->numberOfY_m_n__1() >= self::maximumNumberOfY_m_n__1())
    {
      return $wasAdded;
    }

    $existingZVar = $aY_m_n__1->getZVar();
    $isNewZVar = $existingZVar != null && $this !== $existingZVar;

    if ($isNewZVar && $existingZVar->numberOfY_m_n__1() <= self::minimumNumberOfY_m_n__1())
    {
      return $wasAdded;
    }

    if ($isNewZVar)
    {
      $aY_m_n__1->setZVar($this);
    }
    else
    {
      $this->y_m_n__1[] = $aY_m_n__1;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeY_m_n__1($aY_m_n__1)
  {
    $wasRemoved = false;
    //Unable to remove aY_m_n__1, as it must always have a zVar
    if ($this === $aY_m_n__1->getZVar())
    {
      return $wasRemoved;
    }

    //zVar already at minimum (2)
    if ($this->numberOfY_m_n__1() <= self::minimumNumberOfY_m_n__1())
    {
      return $wasRemoved;
    }

    unset($this->y_m_n__1[$this->indexOfY_m_n__1($aY_m_n__1)]);
    $this->y_m_n__1 = array_values($this->y_m_n__1);
    $wasRemoved = true;
    return $wasRemoved;
  }

  public function addY_m_n__1At($aY_m_n__1, $index)
  {  
    $wasAdded = false;
    if($this->addY_m_n__1($aY_m_n__1))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_m_n__1()) { $index = $this->numberOfY_m_n__1() - 1; }
      array_splice($this->y_m_n__1, $this->indexOfY_m_n__1($aY_m_n__1), 1);
      array_splice($this->y_m_n__1, $index, 0, array($aY_m_n__1));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY_m_n__1At($aY_m_n__1, $index)
  {
    $wasAdded = false;
    if($this->indexOfY_m_n__1($aY_m_n__1) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_m_n__1()) { $index = $this->numberOfY_m_n__1() - 1; }
      array_splice($this->y_m_n__1, $this->indexOfY_m_n__1($aY_m_n__1), 1);
      array_splice($this->y_m_n__1, $index, 0, array($aY_m_n__1));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY_m_n__1At($aY_m_n__1, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->y_m_n__1) > 0)
    {
      $aY_m_n__1 = $this->y_m_n__1[count($this->y_m_n__1) - 1];
      $aY_m_n__1->delete();
      unset($this->y_m_n__1[$this->indexOfY_m_n__1($aY_m_n__1)]);
      $this->y_m_n__1 = array_values($this->y_m_n__1);
    }
    
  }

}
?>
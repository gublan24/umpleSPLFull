<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_0_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_n__1 Attributes
  private $num;

  //Z_0_n__1 Associations
  private $y_0_n__1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y_0_n__1 = array();
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

  public function getY_0_n__1_index($index)
  {
    $aY_0_n__1 = $this->y_0_n__1[$index];
    return $aY_0_n__1;
  }

  public function getY_0_n__1()
  {
    $newY_0_n__1 = $this->y_0_n__1;
    return $newY_0_n__1;
  }

  public function numberOfY_0_n__1()
  {
    $number = count($this->y_0_n__1);
    return $number;
  }

  public function hasY_0_n__1()
  {
    $has = $this->numberOfY_0_n__1() > 0;
    return $has;
  }

  public function indexOfY_0_n__1($aY_0_n__1)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_0_n__1 as $y_0_n__1)
    {
      if ($y_0_n__1->equals($aY_0_n__1))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfY_0_n__1()
  {
    return 0;
  }

  public static function maximumNumberOfY_0_n__1()
  {
    return 3;
  }

  public function addY_0_n__1Via()
  {
    if ($this->numberOfY_0_n__1() >= self::maximumNumberOfY_0_n__1())
    {
      return null;
    }
    else
    {
      return new YR_0_n__1($this);
    }
  }

  public function addY_0_n__1($aY_0_n__1)
  {
    $wasAdded = false;
    if ($this->indexOfY_0_n__1($aY_0_n__1) !== -1) { return false; }
    if ($this->numberOfY_0_n__1() >= self::maximumNumberOfY_0_n__1())
    {
      return $wasAdded;
    }

    $existingZVar = $aY_0_n__1->getZVar();
    $isNewZVar = $existingZVar != null && $this !== $existingZVar;
    if ($isNewZVar)
    {
      $aY_0_n__1->setZVar($this);
    }
    else
    {
      $this->y_0_n__1[] = $aY_0_n__1;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeY_0_n__1($aY_0_n__1)
  {
    $wasRemoved = false;
    //Unable to remove aY_0_n__1, as it must always have a zVar
    if ($this !== $aY_0_n__1->getZVar())
    {
      unset($this->y_0_n__1[$this->indexOfY_0_n__1($aY_0_n__1)]);
      $this->y_0_n__1 = array_values($this->y_0_n__1);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addY_0_n__1At($aY_0_n__1, $index)
  {  
    $wasAdded = false;
    if($this->addY_0_n__1($aY_0_n__1))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_0_n__1()) { $index = $this->numberOfY_0_n__1() - 1; }
      array_splice($this->y_0_n__1, $this->indexOfY_0_n__1($aY_0_n__1), 1);
      array_splice($this->y_0_n__1, $index, 0, array($aY_0_n__1));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY_0_n__1At($aY_0_n__1, $index)
  {
    $wasAdded = false;
    if($this->indexOfY_0_n__1($aY_0_n__1) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_0_n__1()) { $index = $this->numberOfY_0_n__1() - 1; }
      array_splice($this->y_0_n__1, $this->indexOfY_0_n__1($aY_0_n__1), 1);
      array_splice($this->y_0_n__1, $index, 0, array($aY_0_n__1));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY_0_n__1At($aY_0_n__1, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->y_0_n__1) > 0)
    {
      $aY_0_n__1 = $this->y_0_n__1[count($this->y_0_n__1) - 1];
      $aY_0_n__1->delete();
      unset($this->y_0_n__1[$this->indexOfY_0_n__1($aY_0_n__1)]);
      $this->y_0_n__1 = array_values($this->y_0_n__1);
    }
    
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X0_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_n__1 Attributes
  private $num;

  //X0_n__1 Associations
  private $y0_n__1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y0_n__1 = array();
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

  public function getY0_n__1_index($index)
  {
    $aY0_n__1 = $this->y0_n__1[$index];
    return $aY0_n__1;
  }

  public function getY0_n__1()
  {
    $newY0_n__1 = $this->y0_n__1;
    return $newY0_n__1;
  }

  public function numberOfY0_n__1()
  {
    $number = count($this->y0_n__1);
    return $number;
  }

  public function hasY0_n__1()
  {
    $has = $this->numberOfY0_n__1() > 0;
    return $has;
  }

  public function indexOfY0_n__1($aY0_n__1)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y0_n__1 as $y0_n__1)
    {
      if ($y0_n__1->equals($aY0_n__1))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfY0_n__1()
  {
    return 0;
  }

  public static function maximumNumberOfY0_n__1()
  {
    return 3;
  }

  public function addY0_n__1Via()
  {
    if ($this->numberOfY0_n__1() >= self::maximumNumberOfY0_n__1())
    {
      return null;
    }
    else
    {
      return new Y0_n__1($this);
    }
  }

  public function addY0_n__1($aY0_n__1)
  {
    $wasAdded = false;
    if ($this->indexOfY0_n__1($aY0_n__1) !== -1) { return false; }
    if ($this->numberOfY0_n__1() >= self::maximumNumberOfY0_n__1())
    {
      return $wasAdded;
    }

    $existingXVar = $aY0_n__1->getXVar();
    $isNewXVar = $existingXVar != null && $this !== $existingXVar;
    if ($isNewXVar)
    {
      $aY0_n__1->setXVar($this);
    }
    else
    {
      $this->y0_n__1[] = $aY0_n__1;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeY0_n__1($aY0_n__1)
  {
    $wasRemoved = false;
    //Unable to remove aY0_n__1, as it must always have a xVar
    if ($this !== $aY0_n__1->getXVar())
    {
      unset($this->y0_n__1[$this->indexOfY0_n__1($aY0_n__1)]);
      $this->y0_n__1 = array_values($this->y0_n__1);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addY0_n__1At($aY0_n__1, $index)
  {  
    $wasAdded = false;
    if($this->addY0_n__1($aY0_n__1))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY0_n__1()) { $index = $this->numberOfY0_n__1() - 1; }
      array_splice($this->y0_n__1, $this->indexOfY0_n__1($aY0_n__1), 1);
      array_splice($this->y0_n__1, $index, 0, array($aY0_n__1));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY0_n__1At($aY0_n__1, $index)
  {
    $wasAdded = false;
    if($this->indexOfY0_n__1($aY0_n__1) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY0_n__1()) { $index = $this->numberOfY0_n__1() - 1; }
      array_splice($this->y0_n__1, $this->indexOfY0_n__1($aY0_n__1), 1);
      array_splice($this->y0_n__1, $index, 0, array($aY0_n__1));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY0_n__1At($aY0_n__1, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->y0_n__1) > 0)
    {
      $aY0_n__1 = $this->y0_n__1[count($this->y0_n__1) - 1];
      $aY0_n__1->delete();
      unset($this->y0_n__1[$this->indexOfY0_n__1($aY0_n__1)]);
      $this->y0_n__1 = array_values($this->y0_n__1);
    }
    
  }

}
?>
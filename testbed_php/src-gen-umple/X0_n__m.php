<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X0_n__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_n__m Attributes
  private $num;

  //X0_n__m Associations
  private $y0_n__m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y0_n__m = array();
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

  public function getY0_n__m_index($index)
  {
    $aY0_n__m = $this->y0_n__m[$index];
    return $aY0_n__m;
  }

  public function getY0_n__m()
  {
    $newY0_n__m = $this->y0_n__m;
    return $newY0_n__m;
  }

  public function numberOfY0_n__m()
  {
    $number = count($this->y0_n__m);
    return $number;
  }

  public function hasY0_n__m()
  {
    $has = $this->numberOfY0_n__m() > 0;
    return $has;
  }

  public function indexOfY0_n__m($aY0_n__m)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y0_n__m as $y0_n__m)
    {
      if ($y0_n__m->equals($aY0_n__m))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfY0_n__m()
  {
    return 0;
  }

  public static function maximumNumberOfY0_n__m()
  {
    return 3;
  }

  public function addY0_n__m($aY0_n__m)
  {
    $wasAdded = false;
    if ($this->indexOfY0_n__m($aY0_n__m) !== -1) { return false; }
    if ($this->numberOfY0_n__m() >= self::maximumNumberOfY0_n__m())
    {
      return $wasAdded;
    }

    $this->y0_n__m[] = $aY0_n__m;
    if ($aY0_n__m->indexOfXVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY0_n__m->addXVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y0_n__m);
      }
    }
    return $wasAdded;
  }

  public function removeY0_n__m($aY0_n__m)
  {
    $wasRemoved = false;
    if ($this->indexOfY0_n__m($aY0_n__m) == -1)
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY0_n__m($aY0_n__m);
    unset($this->y0_n__m[$oldIndex]);
    if ($aY0_n__m->indexOfXVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY0_n__m->removeXVar($this);
      if (!$wasRemoved)
      {
        $this->y0_n__m[$oldIndex] = $aY0_n__m;
        ksort($this->y0_n__m);
      }
    }
    $this->y0_n__m = array_values($this->y0_n__m);
    return $wasRemoved;
  }

  public function addY0_n__mAt($aY0_n__m, $index)
  {  
    $wasAdded = false;
    if($this->addY0_n__m($aY0_n__m))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY0_n__m()) { $index = $this->numberOfY0_n__m() - 1; }
      array_splice($this->y0_n__m, $this->indexOfY0_n__m($aY0_n__m), 1);
      array_splice($this->y0_n__m, $index, 0, array($aY0_n__m));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY0_n__mAt($aY0_n__m, $index)
  {
    $wasAdded = false;
    if($this->indexOfY0_n__m($aY0_n__m) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY0_n__m()) { $index = $this->numberOfY0_n__m() - 1; }
      array_splice($this->y0_n__m, $this->indexOfY0_n__m($aY0_n__m), 1);
      array_splice($this->y0_n__m, $index, 0, array($aY0_n__m));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY0_n__mAt($aY0_n__m, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->y0_n__m) > 0)
    {
      $aY0_n__m = $this->y0_n__m[count($this->y0_n__m) - 1];
      $aY0_n__m->delete();
      unset($this->y0_n__m[$this->indexOfY0_n__m($aY0_n__m)]);
      $this->y0_n__m = array_values($this->y0_n__m);
    }
    
  }

}
?>
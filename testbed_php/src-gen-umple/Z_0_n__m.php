<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_0_n__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_n__m Attributes
  private $num;

  //Z_0_n__m Associations
  private $y_0_n__m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y_0_n__m = array();
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

  public function getY_0_n__m_index($index)
  {
    $aY_0_n__m = $this->y_0_n__m[$index];
    return $aY_0_n__m;
  }

  public function getY_0_n__m()
  {
    $newY_0_n__m = $this->y_0_n__m;
    return $newY_0_n__m;
  }

  public function numberOfY_0_n__m()
  {
    $number = count($this->y_0_n__m);
    return $number;
  }

  public function hasY_0_n__m()
  {
    $has = $this->numberOfY_0_n__m() > 0;
    return $has;
  }

  public function indexOfY_0_n__m($aY_0_n__m)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_0_n__m as $y_0_n__m)
    {
      if ($y_0_n__m->equals($aY_0_n__m))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfY_0_n__m()
  {
    return 0;
  }

  public static function maximumNumberOfY_0_n__m()
  {
    return 3;
  }

  public function addY_0_n__m($aY_0_n__m)
  {
    $wasAdded = false;
    if ($this->indexOfY_0_n__m($aY_0_n__m) !== -1) { return false; }
    if ($this->numberOfY_0_n__m() >= self::maximumNumberOfY_0_n__m())
    {
      return $wasAdded;
    }

    $this->y_0_n__m[] = $aY_0_n__m;
    if ($aY_0_n__m->indexOfZVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY_0_n__m->addZVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y_0_n__m);
      }
    }
    return $wasAdded;
  }

  public function removeY_0_n__m($aY_0_n__m)
  {
    $wasRemoved = false;
    if ($this->indexOfY_0_n__m($aY_0_n__m) == -1)
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY_0_n__m($aY_0_n__m);
    unset($this->y_0_n__m[$oldIndex]);
    if ($aY_0_n__m->indexOfZVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY_0_n__m->removeZVar($this);
      if (!$wasRemoved)
      {
        $this->y_0_n__m[$oldIndex] = $aY_0_n__m;
        ksort($this->y_0_n__m);
      }
    }
    $this->y_0_n__m = array_values($this->y_0_n__m);
    return $wasRemoved;
  }

  public function addY_0_n__mAt($aY_0_n__m, $index)
  {  
    $wasAdded = false;
    if($this->addY_0_n__m($aY_0_n__m))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_0_n__m()) { $index = $this->numberOfY_0_n__m() - 1; }
      array_splice($this->y_0_n__m, $this->indexOfY_0_n__m($aY_0_n__m), 1);
      array_splice($this->y_0_n__m, $index, 0, array($aY_0_n__m));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY_0_n__mAt($aY_0_n__m, $index)
  {
    $wasAdded = false;
    if($this->indexOfY_0_n__m($aY_0_n__m) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_0_n__m()) { $index = $this->numberOfY_0_n__m() - 1; }
      array_splice($this->y_0_n__m, $this->indexOfY_0_n__m($aY_0_n__m), 1);
      array_splice($this->y_0_n__m, $index, 0, array($aY_0_n__m));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY_0_n__mAt($aY_0_n__m, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $copyOfY_0_n__m = $this->y_0_n__m;
    $this->y_0_n__m = array();
    foreach ($copyOfY_0_n__m as $aY_0_n__m)
    {
      if ($aY_0_n__m->numberOfZVar() <= YR_0_n__m::minimumNumberOfZVar())
      {
        $aY_0_n__m->delete();
      }
      else
      {
        $aY_0_n__m->removeZVar($this);
      }
    }
  }

}
?>
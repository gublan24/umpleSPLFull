<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X0_n__0_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_n__0_n Attributes
  private $num;

  //X0_n__0_n Associations
  private $y0_n__0_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y0_n__0_n = array();
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

  public function getY0_n__0_n_index($index)
  {
    $aY0_n__0_n = $this->y0_n__0_n[$index];
    return $aY0_n__0_n;
  }

  public function getY0_n__0_n()
  {
    $newY0_n__0_n = $this->y0_n__0_n;
    return $newY0_n__0_n;
  }

  public function numberOfY0_n__0_n()
  {
    $number = count($this->y0_n__0_n);
    return $number;
  }

  public function hasY0_n__0_n()
  {
    $has = $this->numberOfY0_n__0_n() > 0;
    return $has;
  }

  public function indexOfY0_n__0_n($aY0_n__0_n)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y0_n__0_n as $y0_n__0_n)
    {
      if ($y0_n__0_n->equals($aY0_n__0_n))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfY0_n__0_n()
  {
    return 0;
  }

  public static function maximumNumberOfY0_n__0_n()
  {
    return 3;
  }

  public function addY0_n__0_n($aY0_n__0_n)
  {
    $wasAdded = false;
    if ($this->indexOfY0_n__0_n($aY0_n__0_n) !== -1) { return false; }
    if ($this->numberOfY0_n__0_n() >= self::maximumNumberOfY0_n__0_n())
    {
      return $wasAdded;
    }

    $this->y0_n__0_n[] = $aY0_n__0_n;
    if ($aY0_n__0_n->indexOfXVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY0_n__0_n->addXVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y0_n__0_n);
      }
    }
    return $wasAdded;
  }

  public function removeY0_n__0_n($aY0_n__0_n)
  {
    $wasRemoved = false;
    if ($this->indexOfY0_n__0_n($aY0_n__0_n) == -1)
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY0_n__0_n($aY0_n__0_n);
    unset($this->y0_n__0_n[$oldIndex]);
    if ($aY0_n__0_n->indexOfXVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY0_n__0_n->removeXVar($this);
      if (!$wasRemoved)
      {
        $this->y0_n__0_n[$oldIndex] = $aY0_n__0_n;
        ksort($this->y0_n__0_n);
      }
    }
    $this->y0_n__0_n = array_values($this->y0_n__0_n);
    return $wasRemoved;
  }

  public function addY0_n__0_nAt($aY0_n__0_n, $index)
  {  
    $wasAdded = false;
    if($this->addY0_n__0_n($aY0_n__0_n))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY0_n__0_n()) { $index = $this->numberOfY0_n__0_n() - 1; }
      array_splice($this->y0_n__0_n, $this->indexOfY0_n__0_n($aY0_n__0_n), 1);
      array_splice($this->y0_n__0_n, $index, 0, array($aY0_n__0_n));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY0_n__0_nAt($aY0_n__0_n, $index)
  {
    $wasAdded = false;
    if($this->indexOfY0_n__0_n($aY0_n__0_n) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY0_n__0_n()) { $index = $this->numberOfY0_n__0_n() - 1; }
      array_splice($this->y0_n__0_n, $this->indexOfY0_n__0_n($aY0_n__0_n), 1);
      array_splice($this->y0_n__0_n, $index, 0, array($aY0_n__0_n));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY0_n__0_nAt($aY0_n__0_n, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->y0_n__0_n) > 0)
    {
      $aY0_n__0_n = $this->y0_n__0_n[count($this->y0_n__0_n) - 1];
      $aY0_n__0_n->delete();
      unset($this->y0_n__0_n[$this->indexOfY0_n__0_n($aY0_n__0_n)]);
      $this->y0_n__0_n = array_values($this->y0_n__0_n);
    }
    
  }

}
?>
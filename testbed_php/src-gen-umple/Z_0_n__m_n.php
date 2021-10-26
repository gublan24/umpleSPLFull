<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_0_n__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_n__m_n Attributes
  private $num;

  //Z_0_n__m_n Associations
  private $y_0_n__m_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y_0_n__m_n = array();
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

  public function getY_0_n__m_n_index($index)
  {
    $aY_0_n__m_n = $this->y_0_n__m_n[$index];
    return $aY_0_n__m_n;
  }

  public function getY_0_n__m_n()
  {
    $newY_0_n__m_n = $this->y_0_n__m_n;
    return $newY_0_n__m_n;
  }

  public function numberOfY_0_n__m_n()
  {
    $number = count($this->y_0_n__m_n);
    return $number;
  }

  public function hasY_0_n__m_n()
  {
    $has = $this->numberOfY_0_n__m_n() > 0;
    return $has;
  }

  public function indexOfY_0_n__m_n($aY_0_n__m_n)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_0_n__m_n as $y_0_n__m_n)
    {
      if ($y_0_n__m_n->equals($aY_0_n__m_n))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfY_0_n__m_n()
  {
    return 0;
  }

  public static function maximumNumberOfY_0_n__m_n()
  {
    return 3;
  }

  public function addY_0_n__m_n($aY_0_n__m_n)
  {
    $wasAdded = false;
    if ($this->indexOfY_0_n__m_n($aY_0_n__m_n) !== -1) { return false; }
    if ($this->numberOfY_0_n__m_n() >= self::maximumNumberOfY_0_n__m_n())
    {
      return $wasAdded;
    }

    $this->y_0_n__m_n[] = $aY_0_n__m_n;
    if ($aY_0_n__m_n->indexOfZVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY_0_n__m_n->addZVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y_0_n__m_n);
      }
    }
    return $wasAdded;
  }

  public function removeY_0_n__m_n($aY_0_n__m_n)
  {
    $wasRemoved = false;
    if ($this->indexOfY_0_n__m_n($aY_0_n__m_n) == -1)
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY_0_n__m_n($aY_0_n__m_n);
    unset($this->y_0_n__m_n[$oldIndex]);
    if ($aY_0_n__m_n->indexOfZVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY_0_n__m_n->removeZVar($this);
      if (!$wasRemoved)
      {
        $this->y_0_n__m_n[$oldIndex] = $aY_0_n__m_n;
        ksort($this->y_0_n__m_n);
      }
    }
    $this->y_0_n__m_n = array_values($this->y_0_n__m_n);
    return $wasRemoved;
  }

  public function addY_0_n__m_nAt($aY_0_n__m_n, $index)
  {  
    $wasAdded = false;
    if($this->addY_0_n__m_n($aY_0_n__m_n))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_0_n__m_n()) { $index = $this->numberOfY_0_n__m_n() - 1; }
      array_splice($this->y_0_n__m_n, $this->indexOfY_0_n__m_n($aY_0_n__m_n), 1);
      array_splice($this->y_0_n__m_n, $index, 0, array($aY_0_n__m_n));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY_0_n__m_nAt($aY_0_n__m_n, $index)
  {
    $wasAdded = false;
    if($this->indexOfY_0_n__m_n($aY_0_n__m_n) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_0_n__m_n()) { $index = $this->numberOfY_0_n__m_n() - 1; }
      array_splice($this->y_0_n__m_n, $this->indexOfY_0_n__m_n($aY_0_n__m_n), 1);
      array_splice($this->y_0_n__m_n, $index, 0, array($aY_0_n__m_n));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY_0_n__m_nAt($aY_0_n__m_n, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $copyOfY_0_n__m_n = $this->y_0_n__m_n;
    $this->y_0_n__m_n = array();
    foreach ($copyOfY_0_n__m_n as $aY_0_n__m_n)
    {
      if ($aY_0_n__m_n->numberOfZVar() <= YR_0_n__m_n::minimumNumberOfZVar())
      {
        $aY_0_n__m_n->delete();
      }
      else
      {
        $aY_0_n__m_n->removeZVar($this);
      }
    }
  }

}
?>
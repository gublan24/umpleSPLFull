<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_m_n__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_m_n__m_n Attributes
  private $num;

  //Z_m_n__m_n Associations
  private $y_m_n__m_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y_m_n__m_n = array();
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

  public function getY_m_n__m_n_index($index)
  {
    $aY_m_n__m_n = $this->y_m_n__m_n[$index];
    return $aY_m_n__m_n;
  }

  public function getY_m_n__m_n()
  {
    $newY_m_n__m_n = $this->y_m_n__m_n;
    return $newY_m_n__m_n;
  }

  public function numberOfY_m_n__m_n()
  {
    $number = count($this->y_m_n__m_n);
    return $number;
  }

  public function hasY_m_n__m_n()
  {
    $has = $this->numberOfY_m_n__m_n() > 0;
    return $has;
  }

  public function indexOfY_m_n__m_n($aY_m_n__m_n)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_m_n__m_n as $y_m_n__m_n)
    {
      if ($y_m_n__m_n->equals($aY_m_n__m_n))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfY_m_n__m_nValid()
  {
    $isValid = $this->numberOfY_m_n__m_n() >= self::minimumNumberOfY_m_n__m_n() && $this->numberOfY_m_n__m_n() <= self::maximumNumberOfY_m_n__m_n();
    return $isValid;
  }

  public static function minimumNumberOfY_m_n__m_n()
  {
    return 2;
  }

  public static function maximumNumberOfY_m_n__m_n()
  {
    return 3;
  }

  public function addY_m_n__m_n($aY_m_n__m_n)
  {
    $wasAdded = false;
    if ($this->indexOfY_m_n__m_n($aY_m_n__m_n) !== -1) { return false; }
    if ($this->numberOfY_m_n__m_n() >= self::maximumNumberOfY_m_n__m_n())
    {
      return $wasAdded;
    }

    $this->y_m_n__m_n[] = $aY_m_n__m_n;
    if ($aY_m_n__m_n->indexOfZVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY_m_n__m_n->addZVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y_m_n__m_n);
      }
    }
    return $wasAdded;
  }

  public function removeY_m_n__m_n($aY_m_n__m_n)
  {
    $wasRemoved = false;
    if ($this->indexOfY_m_n__m_n($aY_m_n__m_n) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfY_m_n__m_n() <= self::minimumNumberOfY_m_n__m_n())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY_m_n__m_n($aY_m_n__m_n);
    unset($this->y_m_n__m_n[$oldIndex]);
    if ($aY_m_n__m_n->indexOfZVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY_m_n__m_n->removeZVar($this);
      if (!$wasRemoved)
      {
        $this->y_m_n__m_n[$oldIndex] = $aY_m_n__m_n;
        ksort($this->y_m_n__m_n);
      }
    }
    $this->y_m_n__m_n = array_values($this->y_m_n__m_n);
    return $wasRemoved;
  }

  public function setY_m_n__m_n($newY_m_n__m_n)
  {
    $wasSet = false;
    $verifiedY_m_n__m_n = array();
    foreach ($newY_m_n__m_n as $aY_m_n__m_n)
    {
      if (array_search($aY_m_n__m_n,$verifiedY_m_n__m_n) !== false)
      {
        continue;
      }
      $verifiedY_m_n__m_n[] = $aY_m_n__m_n;
    }

    if (count($verifiedY_m_n__m_n) != count($newY_m_n__m_n) || count($verifiedY_m_n__m_n) < self::minimumNumberOfY_m_n__m_n() || count($verifiedY_m_n__m_n) > self::maximumNumberOfY_m_n__m_n())
    {
      return $wasSet;
    }

    $oldY_m_n__m_n = $this->y_m_n__m_n;
    $this->y_m_n__m_n = array();
    foreach ($verifiedY_m_n__m_n as $aNewY_m_n__m_n)
    {
      $this->y_m_n__m_n[] = $aNewY_m_n__m_n;
      $removeIndex = array_search($aNewY_m_n__m_n,$oldY_m_n__m_n);
      if ($removeIndex !== false)
      {
        unset($oldY_m_n__m_n[$removeIndex]);
        $oldY_m_n__m_n = array_values($oldY_m_n__m_n);
      }
      else
      {
        $aNewY_m_n__m_n->addZVar($this);
      }
    }

    foreach ($oldY_m_n__m_n as $anOldY_m_n__m_n)
    {
      $anOldY_m_n__m_n->removeZVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function addY_m_n__m_nAt($aY_m_n__m_n, $index)
  {  
    $wasAdded = false;
    if($this->addY_m_n__m_n($aY_m_n__m_n))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_m_n__m_n()) { $index = $this->numberOfY_m_n__m_n() - 1; }
      array_splice($this->y_m_n__m_n, $this->indexOfY_m_n__m_n($aY_m_n__m_n), 1);
      array_splice($this->y_m_n__m_n, $index, 0, array($aY_m_n__m_n));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY_m_n__m_nAt($aY_m_n__m_n, $index)
  {
    $wasAdded = false;
    if($this->indexOfY_m_n__m_n($aY_m_n__m_n) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_m_n__m_n()) { $index = $this->numberOfY_m_n__m_n() - 1; }
      array_splice($this->y_m_n__m_n, $this->indexOfY_m_n__m_n($aY_m_n__m_n), 1);
      array_splice($this->y_m_n__m_n, $index, 0, array($aY_m_n__m_n));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY_m_n__m_nAt($aY_m_n__m_n, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $copyOfY_m_n__m_n = $this->y_m_n__m_n;
    $this->y_m_n__m_n = array();
    foreach ($copyOfY_m_n__m_n as $aY_m_n__m_n)
    {
      if ($aY_m_n__m_n->numberOfZVar() <= YR_m_n__m_n::minimumNumberOfZVar())
      {
        $aY_m_n__m_n->delete();
      }
      else
      {
        $aY_m_n__m_n->removeZVar($this);
      }
    }
  }

}
?>
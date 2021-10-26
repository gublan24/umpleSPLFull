<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_m_n__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_m_n__m Attributes
  private $num;

  //Z_m_n__m Associations
  private $y_m_n__m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y_m_n__m = array();
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

  public function getY_m_n__m_index($index)
  {
    $aY_m_n__m = $this->y_m_n__m[$index];
    return $aY_m_n__m;
  }

  public function getY_m_n__m()
  {
    $newY_m_n__m = $this->y_m_n__m;
    return $newY_m_n__m;
  }

  public function numberOfY_m_n__m()
  {
    $number = count($this->y_m_n__m);
    return $number;
  }

  public function hasY_m_n__m()
  {
    $has = $this->numberOfY_m_n__m() > 0;
    return $has;
  }

  public function indexOfY_m_n__m($aY_m_n__m)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_m_n__m as $y_m_n__m)
    {
      if ($y_m_n__m->equals($aY_m_n__m))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfY_m_n__mValid()
  {
    $isValid = $this->numberOfY_m_n__m() >= self::minimumNumberOfY_m_n__m() && $this->numberOfY_m_n__m() <= self::maximumNumberOfY_m_n__m();
    return $isValid;
  }

  public static function minimumNumberOfY_m_n__m()
  {
    return 2;
  }

  public static function maximumNumberOfY_m_n__m()
  {
    return 3;
  }

  public function addY_m_n__m($aY_m_n__m)
  {
    $wasAdded = false;
    if ($this->indexOfY_m_n__m($aY_m_n__m) !== -1) { return false; }
    if ($this->numberOfY_m_n__m() >= self::maximumNumberOfY_m_n__m())
    {
      return $wasAdded;
    }

    $this->y_m_n__m[] = $aY_m_n__m;
    if ($aY_m_n__m->indexOfZVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY_m_n__m->addZVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y_m_n__m);
      }
    }
    return $wasAdded;
  }

  public function removeY_m_n__m($aY_m_n__m)
  {
    $wasRemoved = false;
    if ($this->indexOfY_m_n__m($aY_m_n__m) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfY_m_n__m() <= self::minimumNumberOfY_m_n__m())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY_m_n__m($aY_m_n__m);
    unset($this->y_m_n__m[$oldIndex]);
    if ($aY_m_n__m->indexOfZVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY_m_n__m->removeZVar($this);
      if (!$wasRemoved)
      {
        $this->y_m_n__m[$oldIndex] = $aY_m_n__m;
        ksort($this->y_m_n__m);
      }
    }
    $this->y_m_n__m = array_values($this->y_m_n__m);
    return $wasRemoved;
  }

  public function setY_m_n__m($newY_m_n__m)
  {
    $wasSet = false;
    $verifiedY_m_n__m = array();
    foreach ($newY_m_n__m as $aY_m_n__m)
    {
      if (array_search($aY_m_n__m,$verifiedY_m_n__m) !== false)
      {
        continue;
      }
      $verifiedY_m_n__m[] = $aY_m_n__m;
    }

    if (count($verifiedY_m_n__m) != count($newY_m_n__m) || count($verifiedY_m_n__m) < self::minimumNumberOfY_m_n__m() || count($verifiedY_m_n__m) > self::maximumNumberOfY_m_n__m())
    {
      return $wasSet;
    }

    $oldY_m_n__m = $this->y_m_n__m;
    $this->y_m_n__m = array();
    foreach ($verifiedY_m_n__m as $aNewY_m_n__m)
    {
      $this->y_m_n__m[] = $aNewY_m_n__m;
      $removeIndex = array_search($aNewY_m_n__m,$oldY_m_n__m);
      if ($removeIndex !== false)
      {
        unset($oldY_m_n__m[$removeIndex]);
        $oldY_m_n__m = array_values($oldY_m_n__m);
      }
      else
      {
        $aNewY_m_n__m->addZVar($this);
      }
    }

    foreach ($oldY_m_n__m as $anOldY_m_n__m)
    {
      $anOldY_m_n__m->removeZVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function addY_m_n__mAt($aY_m_n__m, $index)
  {  
    $wasAdded = false;
    if($this->addY_m_n__m($aY_m_n__m))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_m_n__m()) { $index = $this->numberOfY_m_n__m() - 1; }
      array_splice($this->y_m_n__m, $this->indexOfY_m_n__m($aY_m_n__m), 1);
      array_splice($this->y_m_n__m, $index, 0, array($aY_m_n__m));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY_m_n__mAt($aY_m_n__m, $index)
  {
    $wasAdded = false;
    if($this->indexOfY_m_n__m($aY_m_n__m) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_m_n__m()) { $index = $this->numberOfY_m_n__m() - 1; }
      array_splice($this->y_m_n__m, $this->indexOfY_m_n__m($aY_m_n__m), 1);
      array_splice($this->y_m_n__m, $index, 0, array($aY_m_n__m));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY_m_n__mAt($aY_m_n__m, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $copyOfY_m_n__m = $this->y_m_n__m;
    $this->y_m_n__m = array();
    foreach ($copyOfY_m_n__m as $aY_m_n__m)
    {
      if ($aY_m_n__m->numberOfZVar() <= YR_m_n__m::minimumNumberOfZVar())
      {
        $aY_m_n__m->delete();
      }
      else
      {
        $aY_m_n__m->removeZVar($this);
      }
    }
  }

}
?>
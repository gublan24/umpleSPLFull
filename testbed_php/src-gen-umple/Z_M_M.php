<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_M_M
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_M_M Attributes
  private $num;

  //Z_M_M Associations
  private $y_m_m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y_m_m = array();
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

  public function getY_m_m_index($index)
  {
    $aY_m_m = $this->y_m_m[$index];
    return $aY_m_m;
  }

  public function getY_m_m()
  {
    $newY_m_m = $this->y_m_m;
    return $newY_m_m;
  }

  public function numberOfY_m_m()
  {
    $number = count($this->y_m_m);
    return $number;
  }

  public function hasY_m_m()
  {
    $has = $this->numberOfY_m_m() > 0;
    return $has;
  }

  public function indexOfY_m_m($aY_m_m)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_m_m as $y_m_m)
    {
      if ($y_m_m->equals($aY_m_m))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfY_m_mValid()
  {
    $isValid = $this->numberOfY_m_m() >= self::minimumNumberOfY_m_m() && $this->numberOfY_m_m() <= self::maximumNumberOfY_m_m();
    return $isValid;
  }

  public static function requiredNumberOfY_m_m()
  {
    return 3;
  }

  public static function minimumNumberOfY_m_m()
  {
    return 3;
  }

  public static function maximumNumberOfY_m_m()
  {
    return 3;
  }

  public function addY_m_m($aY_m_m)
  {
    $wasAdded = false;
    if ($this->indexOfY_m_m($aY_m_m) !== -1) { return false; }
    if ($this->numberOfY_m_m() >= self::maximumNumberOfY_m_m())
    {
      return $wasAdded;
    }

    $this->y_m_m[] = $aY_m_m;
    if ($aY_m_m->indexOfZVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY_m_m->addZVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y_m_m);
      }
    }
    return $wasAdded;
  }

  public function removeY_m_m($aY_m_m)
  {
    $wasRemoved = false;
    if ($this->indexOfY_m_m($aY_m_m) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfY_m_m() <= self::minimumNumberOfY_m_m())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY_m_m($aY_m_m);
    unset($this->y_m_m[$oldIndex]);
    if ($aY_m_m->indexOfZVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY_m_m->removeZVar($this);
      if (!$wasRemoved)
      {
        $this->y_m_m[$oldIndex] = $aY_m_m;
        ksort($this->y_m_m);
      }
    }
    $this->y_m_m = array_values($this->y_m_m);
    return $wasRemoved;
  }

  public function setY_m_m($newY_m_m)
  {
    $wasSet = false;
    $verifiedY_m_m = array();
    foreach ($newY_m_m as $aY_m_m)
    {
      if (array_search($aY_m_m,$verifiedY_m_m) !== false)
      {
        continue;
      }
      $verifiedY_m_m[] = $aY_m_m;
    }

    if (count($verifiedY_m_m) != count($newY_m_m) || count($verifiedY_m_m) < self::minimumNumberOfY_m_m() || count($verifiedY_m_m) > self::maximumNumberOfY_m_m())
    {
      return $wasSet;
    }

    $oldY_m_m = $this->y_m_m;
    $this->y_m_m = array();
    foreach ($verifiedY_m_m as $aNewY_m_m)
    {
      $this->y_m_m[] = $aNewY_m_m;
      $removeIndex = array_search($aNewY_m_m,$oldY_m_m);
      if ($removeIndex !== false)
      {
        unset($oldY_m_m[$removeIndex]);
        $oldY_m_m = array_values($oldY_m_m);
      }
      else
      {
        $aNewY_m_m->addZVar($this);
      }
    }

    foreach ($oldY_m_m as $anOldY_m_m)
    {
      $anOldY_m_m->removeZVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $copyOfY_m_m = $this->y_m_m;
    $this->y_m_m = array();
    foreach ($copyOfY_m_m as $aY_m_m)
    {
      if ($aY_m_m->numberOfZVar() <= YR_M_M::minimumNumberOfZVar())
      {
        $aY_m_m->delete();
      }
      else
      {
        $aY_m_m->removeZVar($this);
      }
    }
  }

}
?>
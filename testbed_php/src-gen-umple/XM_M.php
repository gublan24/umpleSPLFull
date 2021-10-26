<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class XM_M
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //XM_M Attributes
  private $num;

  //XM_M Associations
  private $ym_m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->ym_m = array();
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

  public function getYm_m_index($index)
  {
    $aYm_m = $this->ym_m[$index];
    return $aYm_m;
  }

  public function getYm_m()
  {
    $newYm_m = $this->ym_m;
    return $newYm_m;
  }

  public function numberOfYm_m()
  {
    $number = count($this->ym_m);
    return $number;
  }

  public function hasYm_m()
  {
    $has = $this->numberOfYm_m() > 0;
    return $has;
  }

  public function indexOfYm_m($aYm_m)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->ym_m as $ym_m)
    {
      if ($ym_m->equals($aYm_m))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfYm_mValid()
  {
    $isValid = $this->numberOfYm_m() >= self::minimumNumberOfYm_m() && $this->numberOfYm_m() <= self::maximumNumberOfYm_m();
    return $isValid;
  }

  public static function requiredNumberOfYm_m()
  {
    return 3;
  }

  public static function minimumNumberOfYm_m()
  {
    return 3;
  }

  public static function maximumNumberOfYm_m()
  {
    return 3;
  }

  public function addYm_m($aYm_m)
  {
    $wasAdded = false;
    if ($this->indexOfYm_m($aYm_m) !== -1) { return false; }
    if ($this->numberOfYm_m() >= self::maximumNumberOfYm_m())
    {
      return $wasAdded;
    }

    $this->ym_m[] = $aYm_m;
    if ($aYm_m->indexOfXVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aYm_m->addXVar($this);
      if (!$wasAdded)
      {
        array_pop($this->ym_m);
      }
    }
    return $wasAdded;
  }

  public function removeYm_m($aYm_m)
  {
    $wasRemoved = false;
    if ($this->indexOfYm_m($aYm_m) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfYm_m() <= self::minimumNumberOfYm_m())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfYm_m($aYm_m);
    unset($this->ym_m[$oldIndex]);
    if ($aYm_m->indexOfXVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aYm_m->removeXVar($this);
      if (!$wasRemoved)
      {
        $this->ym_m[$oldIndex] = $aYm_m;
        ksort($this->ym_m);
      }
    }
    $this->ym_m = array_values($this->ym_m);
    return $wasRemoved;
  }

  public function setYm_m($newYm_m)
  {
    $wasSet = false;
    $verifiedYm_m = array();
    foreach ($newYm_m as $aYm_m)
    {
      if (array_search($aYm_m,$verifiedYm_m) !== false)
      {
        continue;
      }
      $verifiedYm_m[] = $aYm_m;
    }

    if (count($verifiedYm_m) != count($newYm_m) || count($verifiedYm_m) < self::minimumNumberOfYm_m() || count($verifiedYm_m) > self::maximumNumberOfYm_m())
    {
      return $wasSet;
    }

    $oldYm_m = $this->ym_m;
    $this->ym_m = array();
    foreach ($verifiedYm_m as $aNewYm_m)
    {
      $this->ym_m[] = $aNewYm_m;
      $removeIndex = array_search($aNewYm_m,$oldYm_m);
      if ($removeIndex !== false)
      {
        unset($oldYm_m[$removeIndex]);
        $oldYm_m = array_values($oldYm_m);
      }
      else
      {
        $aNewYm_m->addXVar($this);
      }
    }

    foreach ($oldYm_m as $anOldYm_m)
    {
      $anOldYm_m->removeXVar($this);
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
    while (count($this->ym_m) > 0)
    {
      $aYm_m = $this->ym_m[count($this->ym_m) - 1];
      $aYm_m->delete();
      unset($this->ym_m[$this->indexOfYm_m($aYm_m)]);
      $this->ym_m = array_values($this->ym_m);
    }
    
  }

}
?>
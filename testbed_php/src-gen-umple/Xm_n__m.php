<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Xm_n__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xm_n__m Attributes
  private $num;

  //Xm_n__m Associations
  private $ym_n__m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->ym_n__m = array();
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

  public function getYm_n__m_index($index)
  {
    $aYm_n__m = $this->ym_n__m[$index];
    return $aYm_n__m;
  }

  public function getYm_n__m()
  {
    $newYm_n__m = $this->ym_n__m;
    return $newYm_n__m;
  }

  public function numberOfYm_n__m()
  {
    $number = count($this->ym_n__m);
    return $number;
  }

  public function hasYm_n__m()
  {
    $has = $this->numberOfYm_n__m() > 0;
    return $has;
  }

  public function indexOfYm_n__m($aYm_n__m)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->ym_n__m as $ym_n__m)
    {
      if ($ym_n__m->equals($aYm_n__m))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfYm_n__mValid()
  {
    $isValid = $this->numberOfYm_n__m() >= self::minimumNumberOfYm_n__m() && $this->numberOfYm_n__m() <= self::maximumNumberOfYm_n__m();
    return $isValid;
  }

  public static function minimumNumberOfYm_n__m()
  {
    return 2;
  }

  public static function maximumNumberOfYm_n__m()
  {
    return 3;
  }

  public function addYm_n__m($aYm_n__m)
  {
    $wasAdded = false;
    if ($this->indexOfYm_n__m($aYm_n__m) !== -1) { return false; }
    if ($this->numberOfYm_n__m() >= self::maximumNumberOfYm_n__m())
    {
      return $wasAdded;
    }

    $this->ym_n__m[] = $aYm_n__m;
    if ($aYm_n__m->indexOfXVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aYm_n__m->addXVar($this);
      if (!$wasAdded)
      {
        array_pop($this->ym_n__m);
      }
    }
    return $wasAdded;
  }

  public function removeYm_n__m($aYm_n__m)
  {
    $wasRemoved = false;
    if ($this->indexOfYm_n__m($aYm_n__m) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfYm_n__m() <= self::minimumNumberOfYm_n__m())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfYm_n__m($aYm_n__m);
    unset($this->ym_n__m[$oldIndex]);
    if ($aYm_n__m->indexOfXVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aYm_n__m->removeXVar($this);
      if (!$wasRemoved)
      {
        $this->ym_n__m[$oldIndex] = $aYm_n__m;
        ksort($this->ym_n__m);
      }
    }
    $this->ym_n__m = array_values($this->ym_n__m);
    return $wasRemoved;
  }

  public function setYm_n__m($newYm_n__m)
  {
    $wasSet = false;
    $verifiedYm_n__m = array();
    foreach ($newYm_n__m as $aYm_n__m)
    {
      if (array_search($aYm_n__m,$verifiedYm_n__m) !== false)
      {
        continue;
      }
      $verifiedYm_n__m[] = $aYm_n__m;
    }

    if (count($verifiedYm_n__m) != count($newYm_n__m) || count($verifiedYm_n__m) < self::minimumNumberOfYm_n__m() || count($verifiedYm_n__m) > self::maximumNumberOfYm_n__m())
    {
      return $wasSet;
    }

    $oldYm_n__m = $this->ym_n__m;
    $this->ym_n__m = array();
    foreach ($verifiedYm_n__m as $aNewYm_n__m)
    {
      $this->ym_n__m[] = $aNewYm_n__m;
      $removeIndex = array_search($aNewYm_n__m,$oldYm_n__m);
      if ($removeIndex !== false)
      {
        unset($oldYm_n__m[$removeIndex]);
        $oldYm_n__m = array_values($oldYm_n__m);
      }
      else
      {
        $aNewYm_n__m->addXVar($this);
      }
    }

    foreach ($oldYm_n__m as $anOldYm_n__m)
    {
      $anOldYm_n__m->removeXVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function addYm_n__mAt($aYm_n__m, $index)
  {  
    $wasAdded = false;
    if($this->addYm_n__m($aYm_n__m))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfYm_n__m()) { $index = $this->numberOfYm_n__m() - 1; }
      array_splice($this->ym_n__m, $this->indexOfYm_n__m($aYm_n__m), 1);
      array_splice($this->ym_n__m, $index, 0, array($aYm_n__m));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveYm_n__mAt($aYm_n__m, $index)
  {
    $wasAdded = false;
    if($this->indexOfYm_n__m($aYm_n__m) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfYm_n__m()) { $index = $this->numberOfYm_n__m() - 1; }
      array_splice($this->ym_n__m, $this->indexOfYm_n__m($aYm_n__m), 1);
      array_splice($this->ym_n__m, $index, 0, array($aYm_n__m));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addYm_n__mAt($aYm_n__m, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->ym_n__m) > 0)
    {
      $aYm_n__m = $this->ym_n__m[count($this->ym_n__m) - 1];
      $aYm_n__m->delete();
      unset($this->ym_n__m[$this->indexOfYm_n__m($aYm_n__m)]);
      $this->ym_n__m = array_values($this->ym_n__m);
    }
    
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Xm_n__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xm_n__m_n Attributes
  private $num;

  //Xm_n__m_n Associations
  private $ym_n__m_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->ym_n__m_n = array();
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

  public function getYm_n__m_n_index($index)
  {
    $aYm_n__m_n = $this->ym_n__m_n[$index];
    return $aYm_n__m_n;
  }

  public function getYm_n__m_n()
  {
    $newYm_n__m_n = $this->ym_n__m_n;
    return $newYm_n__m_n;
  }

  public function numberOfYm_n__m_n()
  {
    $number = count($this->ym_n__m_n);
    return $number;
  }

  public function hasYm_n__m_n()
  {
    $has = $this->numberOfYm_n__m_n() > 0;
    return $has;
  }

  public function indexOfYm_n__m_n($aYm_n__m_n)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->ym_n__m_n as $ym_n__m_n)
    {
      if ($ym_n__m_n->equals($aYm_n__m_n))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfYm_n__m_nValid()
  {
    $isValid = $this->numberOfYm_n__m_n() >= self::minimumNumberOfYm_n__m_n() && $this->numberOfYm_n__m_n() <= self::maximumNumberOfYm_n__m_n();
    return $isValid;
  }

  public static function minimumNumberOfYm_n__m_n()
  {
    return 2;
  }

  public static function maximumNumberOfYm_n__m_n()
  {
    return 3;
  }

  public function addYm_n__m_n($aYm_n__m_n)
  {
    $wasAdded = false;
    if ($this->indexOfYm_n__m_n($aYm_n__m_n) !== -1) { return false; }
    if ($this->numberOfYm_n__m_n() >= self::maximumNumberOfYm_n__m_n())
    {
      return $wasAdded;
    }

    $this->ym_n__m_n[] = $aYm_n__m_n;
    if ($aYm_n__m_n->indexOfXVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aYm_n__m_n->addXVar($this);
      if (!$wasAdded)
      {
        array_pop($this->ym_n__m_n);
      }
    }
    return $wasAdded;
  }

  public function removeYm_n__m_n($aYm_n__m_n)
  {
    $wasRemoved = false;
    if ($this->indexOfYm_n__m_n($aYm_n__m_n) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfYm_n__m_n() <= self::minimumNumberOfYm_n__m_n())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfYm_n__m_n($aYm_n__m_n);
    unset($this->ym_n__m_n[$oldIndex]);
    if ($aYm_n__m_n->indexOfXVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aYm_n__m_n->removeXVar($this);
      if (!$wasRemoved)
      {
        $this->ym_n__m_n[$oldIndex] = $aYm_n__m_n;
        ksort($this->ym_n__m_n);
      }
    }
    $this->ym_n__m_n = array_values($this->ym_n__m_n);
    return $wasRemoved;
  }

  public function setYm_n__m_n($newYm_n__m_n)
  {
    $wasSet = false;
    $verifiedYm_n__m_n = array();
    foreach ($newYm_n__m_n as $aYm_n__m_n)
    {
      if (array_search($aYm_n__m_n,$verifiedYm_n__m_n) !== false)
      {
        continue;
      }
      $verifiedYm_n__m_n[] = $aYm_n__m_n;
    }

    if (count($verifiedYm_n__m_n) != count($newYm_n__m_n) || count($verifiedYm_n__m_n) < self::minimumNumberOfYm_n__m_n() || count($verifiedYm_n__m_n) > self::maximumNumberOfYm_n__m_n())
    {
      return $wasSet;
    }

    $oldYm_n__m_n = $this->ym_n__m_n;
    $this->ym_n__m_n = array();
    foreach ($verifiedYm_n__m_n as $aNewYm_n__m_n)
    {
      $this->ym_n__m_n[] = $aNewYm_n__m_n;
      $removeIndex = array_search($aNewYm_n__m_n,$oldYm_n__m_n);
      if ($removeIndex !== false)
      {
        unset($oldYm_n__m_n[$removeIndex]);
        $oldYm_n__m_n = array_values($oldYm_n__m_n);
      }
      else
      {
        $aNewYm_n__m_n->addXVar($this);
      }
    }

    foreach ($oldYm_n__m_n as $anOldYm_n__m_n)
    {
      $anOldYm_n__m_n->removeXVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function addYm_n__m_nAt($aYm_n__m_n, $index)
  {  
    $wasAdded = false;
    if($this->addYm_n__m_n($aYm_n__m_n))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfYm_n__m_n()) { $index = $this->numberOfYm_n__m_n() - 1; }
      array_splice($this->ym_n__m_n, $this->indexOfYm_n__m_n($aYm_n__m_n), 1);
      array_splice($this->ym_n__m_n, $index, 0, array($aYm_n__m_n));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveYm_n__m_nAt($aYm_n__m_n, $index)
  {
    $wasAdded = false;
    if($this->indexOfYm_n__m_n($aYm_n__m_n) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfYm_n__m_n()) { $index = $this->numberOfYm_n__m_n() - 1; }
      array_splice($this->ym_n__m_n, $this->indexOfYm_n__m_n($aYm_n__m_n), 1);
      array_splice($this->ym_n__m_n, $index, 0, array($aYm_n__m_n));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addYm_n__m_nAt($aYm_n__m_n, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->ym_n__m_n) > 0)
    {
      $aYm_n__m_n = $this->ym_n__m_n[count($this->ym_n__m_n) - 1];
      $aYm_n__m_n->delete();
      unset($this->ym_n__m_n[$this->indexOfYm_n__m_n($aYm_n__m_n)]);
      $this->ym_n__m_n = array_values($this->ym_n__m_n);
    }
    
  }

}
?>
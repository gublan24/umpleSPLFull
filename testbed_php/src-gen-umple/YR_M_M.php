<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YR_M_M
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_M_M Attributes
  private $v;

  //YR_M_M Associations
  private $zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->v = 1;
    $this->zVar = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setV($aV)
  {
    $wasSet = false;
    $this->v = $aV;
    $wasSet = true;
    return $wasSet;
  }

  public function getV()
  {
    return $this->v;
  }

  public function getZVar_index($index)
  {
    $aZVar = $this->zVar[$index];
    return $aZVar;
  }

  public function getZVar()
  {
    $newZVar = $this->zVar;
    return $newZVar;
  }

  public function numberOfZVar()
  {
    $number = count($this->zVar);
    return $number;
  }

  public function hasZVar()
  {
    $has = $this->numberOfZVar() > 0;
    return $has;
  }

  public function indexOfZVar($aZVar)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->zVar as $zVar)
    {
      if ($zVar->equals($aZVar))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfZVarValid()
  {
    $isValid = $this->numberOfZVar() >= self::minimumNumberOfZVar() && $this->numberOfZVar() <= self::maximumNumberOfZVar();
    return $isValid;
  }

  public static function requiredNumberOfZVar()
  {
    return 3;
  }

  public static function minimumNumberOfZVar()
  {
    return 3;
  }

  public static function maximumNumberOfZVar()
  {
    return 3;
  }

  public function addZVar($aZVar)
  {
    $wasAdded = false;
    if ($this->indexOfZVar($aZVar) !== -1) { return false; }
    if ($this->numberOfZVar() >= self::maximumNumberOfZVar())
    {
      return $wasAdded;
    }

    $this->zVar[] = $aZVar;
    if ($aZVar->indexOfY_m_m($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aZVar->addY_m_m($this);
      if (!$wasAdded)
      {
        array_pop($this->zVar);
      }
    }
    return $wasAdded;
  }

  public function removeZVar($aZVar)
  {
    $wasRemoved = false;
    if ($this->indexOfZVar($aZVar) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfZVar() <= self::minimumNumberOfZVar())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfZVar($aZVar);
    unset($this->zVar[$oldIndex]);
    if ($aZVar->indexOfY_m_m($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aZVar->removeY_m_m($this);
      if (!$wasRemoved)
      {
        $this->zVar[$oldIndex] = $aZVar;
        ksort($this->zVar);
      }
    }
    $this->zVar = array_values($this->zVar);
    return $wasRemoved;
  }

  public function setZVar($newZVar)
  {
    $wasSet = false;
    $verifiedZVar = array();
    foreach ($newZVar as $aZVar)
    {
      if (array_search($aZVar,$verifiedZVar) !== false)
      {
        continue;
      }
      $verifiedZVar[] = $aZVar;
    }

    if (count($verifiedZVar) != count($newZVar) || count($verifiedZVar) < self::minimumNumberOfZVar() || count($verifiedZVar) > self::maximumNumberOfZVar())
    {
      return $wasSet;
    }

    $oldZVar = $this->zVar;
    $this->zVar = array();
    foreach ($verifiedZVar as $aNewZVar)
    {
      $this->zVar[] = $aNewZVar;
      $removeIndex = array_search($aNewZVar,$oldZVar);
      if ($removeIndex !== false)
      {
        unset($oldZVar[$removeIndex]);
        $oldZVar = array_values($oldZVar);
      }
      else
      {
        $aNewZVar->addY_m_m($this);
      }
    }

    foreach ($oldZVar as $anOldZVar)
    {
      $anOldZVar->removeY_m_m($this);
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
    while (count($this->zVar) > 0)
    {
      $aZVar = $this->zVar[count($this->zVar) - 1];
      $aZVar->delete();
      unset($this->zVar[$this->indexOfZVar($aZVar)]);
      $this->zVar = array_values($this->zVar);
    }
    
  }

}
?>
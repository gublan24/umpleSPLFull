<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YM_M
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YM_M Attributes
  private $v;

  //YM_M Associations
  private $xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->v = 1;
    $this->xVar = array();
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

  public function getXVar_index($index)
  {
    $aXVar = $this->xVar[$index];
    return $aXVar;
  }

  public function getXVar()
  {
    $newXVar = $this->xVar;
    return $newXVar;
  }

  public function numberOfXVar()
  {
    $number = count($this->xVar);
    return $number;
  }

  public function hasXVar()
  {
    $has = $this->numberOfXVar() > 0;
    return $has;
  }

  public function indexOfXVar($aXVar)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->xVar as $xVar)
    {
      if ($xVar->equals($aXVar))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfXVarValid()
  {
    $isValid = $this->numberOfXVar() >= self::minimumNumberOfXVar() && $this->numberOfXVar() <= self::maximumNumberOfXVar();
    return $isValid;
  }

  public static function requiredNumberOfXVar()
  {
    return 3;
  }

  public static function minimumNumberOfXVar()
  {
    return 3;
  }

  public static function maximumNumberOfXVar()
  {
    return 3;
  }

  public function addXVar($aXVar)
  {
    $wasAdded = false;
    if ($this->indexOfXVar($aXVar) !== -1) { return false; }
    if ($this->numberOfXVar() >= self::maximumNumberOfXVar())
    {
      return $wasAdded;
    }

    $this->xVar[] = $aXVar;
    if ($aXVar->indexOfYm_m($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aXVar->addYm_m($this);
      if (!$wasAdded)
      {
        array_pop($this->xVar);
      }
    }
    return $wasAdded;
  }

  public function removeXVar($aXVar)
  {
    $wasRemoved = false;
    if ($this->indexOfXVar($aXVar) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfXVar() <= self::minimumNumberOfXVar())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfXVar($aXVar);
    unset($this->xVar[$oldIndex]);
    if ($aXVar->indexOfYm_m($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aXVar->removeYm_m($this);
      if (!$wasRemoved)
      {
        $this->xVar[$oldIndex] = $aXVar;
        ksort($this->xVar);
      }
    }
    $this->xVar = array_values($this->xVar);
    return $wasRemoved;
  }

  public function setXVar($newXVar)
  {
    $wasSet = false;
    $verifiedXVar = array();
    foreach ($newXVar as $aXVar)
    {
      if (array_search($aXVar,$verifiedXVar) !== false)
      {
        continue;
      }
      $verifiedXVar[] = $aXVar;
    }

    if (count($verifiedXVar) != count($newXVar) || count($verifiedXVar) < self::minimumNumberOfXVar() || count($verifiedXVar) > self::maximumNumberOfXVar())
    {
      return $wasSet;
    }

    $oldXVar = $this->xVar;
    $this->xVar = array();
    foreach ($verifiedXVar as $aNewXVar)
    {
      $this->xVar[] = $aNewXVar;
      $removeIndex = array_search($aNewXVar,$oldXVar);
      if ($removeIndex !== false)
      {
        unset($oldXVar[$removeIndex]);
        $oldXVar = array_values($oldXVar);
      }
      else
      {
        $aNewXVar->addYm_m($this);
      }
    }

    foreach ($oldXVar as $anOldXVar)
    {
      $anOldXVar->removeYm_m($this);
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
    $copyOfXVar = $this->xVar;
    $this->xVar = array();
    foreach ($copyOfXVar as $aXVar)
    {
      if ($aXVar->numberOfYm_m() <= XM_M::minimumNumberOfYm_m())
      {
        $aXVar->delete();
      }
      else
      {
        $aXVar->removeYm_m($this);
      }
    }
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Y0_n__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_n__m Attributes
  private $v;

  //Y0_n__m Associations
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
    if ($aXVar->indexOfY0_n__m($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aXVar->addY0_n__m($this);
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
    if ($aXVar->indexOfY0_n__m($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aXVar->removeY0_n__m($this);
      if (!$wasRemoved)
      {
        $this->xVar[$oldIndex] = $aXVar;
        ksort($this->xVar);
      }
    }
    $this->xVar = array_values($this->xVar);
    return $wasRemoved;
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
      $aXVar->removeY0_n__m($this);
    }
  }

}
?>
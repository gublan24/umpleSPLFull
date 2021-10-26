<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Ym_n__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ym_n__m_n Attributes
  private $v;

  //Ym_n__m_n Associations
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

  public static function minimumNumberOfXVar()
  {
    return 2;
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
    if ($aXVar->indexOfYm_n__m_n($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aXVar->addYm_n__m_n($this);
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
    if ($aXVar->indexOfYm_n__m_n($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aXVar->removeYm_n__m_n($this);
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
        $aNewXVar->addYm_n__m_n($this);
      }
    }

    foreach ($oldXVar as $anOldXVar)
    {
      $anOldXVar->removeYm_n__m_n($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function addXVarAt($aXVar, $index)
  {  
    $wasAdded = false;
    if($this->addXVar($aXVar))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfXVar()) { $index = $this->numberOfXVar() - 1; }
      array_splice($this->xVar, $this->indexOfXVar($aXVar), 1);
      array_splice($this->xVar, $index, 0, array($aXVar));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveXVarAt($aXVar, $index)
  {
    $wasAdded = false;
    if($this->indexOfXVar($aXVar) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfXVar()) { $index = $this->numberOfXVar() - 1; }
      array_splice($this->xVar, $this->indexOfXVar($aXVar), 1);
      array_splice($this->xVar, $index, 0, array($aXVar));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addXVarAt($aXVar, $index);
    }
    return $wasAdded;
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
      if ($aXVar->numberOfYm_n__m_n() <= Xm_n__m_n::minimumNumberOfYm_n__m_n())
      {
        $aXVar->delete();
      }
      else
      {
        $aXVar->removeYm_n__m_n($this);
      }
    }
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YR_0_n__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_n__star Attributes
  private $v;

  //YR_0_n__star Associations
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

  public static function minimumNumberOfZVar()
  {
    return 0;
  }

  public function addZVar($aZVar)
  {
    $wasAdded = false;
    if ($this->indexOfZVar($aZVar) !== -1) { return false; }
    $this->zVar[] = $aZVar;
    if ($aZVar->indexOfY_0_n__star($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aZVar->addY_0_n__star($this);
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

    $oldIndex = $this->indexOfZVar($aZVar);
    unset($this->zVar[$oldIndex]);
    if ($aZVar->indexOfY_0_n__star($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aZVar->removeY_0_n__star($this);
      if (!$wasRemoved)
      {
        $this->zVar[$oldIndex] = $aZVar;
        ksort($this->zVar);
      }
    }
    $this->zVar = array_values($this->zVar);
    return $wasRemoved;
  }

  public function addZVarAt($aZVar, $index)
  {  
    $wasAdded = false;
    if($this->addZVar($aZVar))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfZVar()) { $index = $this->numberOfZVar() - 1; }
      array_splice($this->zVar, $this->indexOfZVar($aZVar), 1);
      array_splice($this->zVar, $index, 0, array($aZVar));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveZVarAt($aZVar, $index)
  {
    $wasAdded = false;
    if($this->indexOfZVar($aZVar) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfZVar()) { $index = $this->numberOfZVar() - 1; }
      array_splice($this->zVar, $this->indexOfZVar($aZVar), 1);
      array_splice($this->zVar, $index, 0, array($aZVar));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addZVarAt($aZVar, $index);
    }
    return $wasAdded;
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
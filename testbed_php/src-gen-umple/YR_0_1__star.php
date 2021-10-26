<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YR_0_1__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_1__star Attributes
  private $v;

  //YR_0_1__star Associations
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
    $existingY_0_1__star = $aZVar->getY_0_1__star();
    if ($existingY_0_1__star == null)
    {
      $aZVar->setY_0_1__star($this);
    }
    elseif ($this !== $existingY_0_1__star)
    {
      $existingY_0_1__star->removeZVar($aZVar);
      $this->addZVar($aZVar);
    }
    else
    {
      $this->zVar[] = $aZVar;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeZVar($aZVar)
  {
    $wasRemoved = false;
    if ($this->indexOfZVar($aZVar) != -1)
    {
      unset($this->zVar[$this->indexOfZVar($aZVar)]);
      $this->zVar = array_values($this->zVar);
      if ($this === $aZVar->getY_0_1__star())
      {
        $aZVar->setY_0_1__star(null);
      }
      $wasRemoved = true;
    }
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
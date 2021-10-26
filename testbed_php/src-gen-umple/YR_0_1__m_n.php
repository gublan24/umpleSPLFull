<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YR_0_1__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_1__m_n Attributes
  private $v;

  //YR_0_1__m_n Associations
  private $zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($allZVar)
  {
    $this->v = 1;
    $this->zVar = array();
    $didAddZVar = $this->setZVar($allZVar);
    if (!$didAddZVar)
    {
      throw new Exception("Unable to create YR_0_1__m_n, must have 2 to 3 zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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
    return 2;
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
    $existingY_0_1__m_n = $aZVar->getY_0_1__m_n();
    if ($existingY_0_1__m_n != null && $existingY_0_1__m_n->numberOfZVar() <= self::minimumNumberOfZVar())
    {
      return $wasAdded;
    }
    else if ($existingY_0_1__m_n != null)
    {
      unset($existingY_0_1__m_n->zVar[$existingY_0_1__m_n->indexOfZVar($aZVar)]);
      $existingY_0_1__m_n->zVar = array_values($existingY_0_1__m_n->zVar);
    }
    $this->zVar[] = $aZVar;
    $this->setY_0_1__m_n($aZVar,$this);
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeZVar($aZVar)
  {
    $wasRemoved = false;
    if ($this->indexOfZVar($aZVar) != -1 && $this->numberOfZVar() > self::minimumNumberOfZVar())
    {
      unset($this->zVar[$this->indexOfZVar($aZVar)]);
      $this->zVar = array_values($this->zVar);
      $this->setY_0_1__m_n($aZVar,null);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function setZVar($newZVar)
  {
    $wasSet = false;
    if (count($newZVar) < self::minimumNumberOfZVar() || count($newZVar) > self::maximumNumberOfZVar())
    {
      return $wasSet;
    }

    $checkNewZVar = array();
    $y_0_1__m_nToNewZVar = array();
    foreach ($newZVar as $aZVar)
    {
      if (array_search($aZVar,$checkNewZVar) !== false)
      {
        return $wasSet;
      }
      else if ($aZVar->getY_0_1__m_n() != null && $this !== $aZVar->getY_0_1__m_n())
      {
        $existingY_0_1__m_n = $aZVar->getY_0_1__m_n();
        $existingSerializedY_0_1__m_n = serialize($existingY_0_1__m_n);
        if (!array_key_exists($existingSerializedY_0_1__m_n, $y_0_1__m_nToNewZVar))
        {
          $y_0_1__m_nToNewZVar[$existingSerializedY_0_1__m_n] = $existingY_0_1__m_n->numberOfZVar();
        }
        $nextCount = $y_0_1__m_nToNewZVar[$existingSerializedY_0_1__m_n] - 1;
        if ($nextCount < self::minimumnumberOfZVar())
        {
          return $wasSet;
        }
        $y_0_1__m_nToNewZVar[$existingSerializedY_0_1__m_n] = $nextCount;
      }
      $checkNewZVar[] = $aZVar;
    }

    foreach ($this->zVar as $orphan) 
    {
      $wasFound = false;
      foreach ($checkNewZVar as $fosterCare)
      {
        if ($orphan == $fosterCare)
        {
          $wasFound = true;
          break;
        }
      }
      
      if (!$wasFound)
      {
        $this->setY_0_1__m_n($orphan, null);
      }
    }

    $this->zVar = array();
    foreach ($newZVar as $aZVar)
    {
      if ($aZVar->getY_0_1__m_n() != null)
      {
        unset($aZVar->getY_0_1__m_n()->zVar[$aZVar->getY_0_1__m_n()->indexOfZVar($aZVar)]);
        $aZVar->getY_0_1__m_n()->zVar = array_values($aZVar->getY_0_1__m_n()->zVar);
      }
      $this->setY_0_1__m_n($aZVar, $this);
      $this->zVar[] = $aZVar;
    }
    $wasSet = true;
    return $wasSet;
  }

  private function setY_0_1__m_n($aZVar, $aY_0_1__m_n)
  {
    $aZVar->mentor = $aY_0_1__m_n;
    //$prop = new ReflectionProperty($aZVar, 'y_0_1__m_n');
    //$prop->setAccessible(true);
    //$prop->setValue($aZVar,$aY_0_1__m_n);
    //$prop->setAccessible(false);
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
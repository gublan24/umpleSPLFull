<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Y0_1__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_1__m_n Attributes
  private $v;

  //Y0_1__m_n Associations
  private $xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($allXVar)
  {
    $this->v = 1;
    $this->xVar = array();
    $didAddXVar = $this->setXVar($allXVar);
    if (!$didAddXVar)
    {
      throw new Exception("Unable to create Y0_1__m_n, must have 2 to 3 xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
    $existingY0_1__m_n = $aXVar->getY0_1__m_n();
    if ($existingY0_1__m_n != null && $existingY0_1__m_n->numberOfXVar() <= self::minimumNumberOfXVar())
    {
      return $wasAdded;
    }
    else if ($existingY0_1__m_n != null)
    {
      unset($existingY0_1__m_n->xVar[$existingY0_1__m_n->indexOfXVar($aXVar)]);
      $existingY0_1__m_n->xVar = array_values($existingY0_1__m_n->xVar);
    }
    $this->xVar[] = $aXVar;
    $this->setY0_1__m_n($aXVar,$this);
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeXVar($aXVar)
  {
    $wasRemoved = false;
    if ($this->indexOfXVar($aXVar) != -1 && $this->numberOfXVar() > self::minimumNumberOfXVar())
    {
      unset($this->xVar[$this->indexOfXVar($aXVar)]);
      $this->xVar = array_values($this->xVar);
      $this->setY0_1__m_n($aXVar,null);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function setXVar($newXVar)
  {
    $wasSet = false;
    if (count($newXVar) < self::minimumNumberOfXVar() || count($newXVar) > self::maximumNumberOfXVar())
    {
      return $wasSet;
    }

    $checkNewXVar = array();
    $y0_1__m_nToNewXVar = array();
    foreach ($newXVar as $aXVar)
    {
      if (array_search($aXVar,$checkNewXVar) !== false)
      {
        return $wasSet;
      }
      else if ($aXVar->getY0_1__m_n() != null && $this !== $aXVar->getY0_1__m_n())
      {
        $existingY0_1__m_n = $aXVar->getY0_1__m_n();
        $existingSerializedY0_1__m_n = serialize($existingY0_1__m_n);
        if (!array_key_exists($existingSerializedY0_1__m_n, $y0_1__m_nToNewXVar))
        {
          $y0_1__m_nToNewXVar[$existingSerializedY0_1__m_n] = $existingY0_1__m_n->numberOfXVar();
        }
        $nextCount = $y0_1__m_nToNewXVar[$existingSerializedY0_1__m_n] - 1;
        if ($nextCount < self::minimumnumberOfXVar())
        {
          return $wasSet;
        }
        $y0_1__m_nToNewXVar[$existingSerializedY0_1__m_n] = $nextCount;
      }
      $checkNewXVar[] = $aXVar;
    }

    foreach ($this->xVar as $orphan) 
    {
      $wasFound = false;
      foreach ($checkNewXVar as $fosterCare)
      {
        if ($orphan == $fosterCare)
        {
          $wasFound = true;
          break;
        }
      }
      
      if (!$wasFound)
      {
        $this->setY0_1__m_n($orphan, null);
      }
    }

    $this->xVar = array();
    foreach ($newXVar as $aXVar)
    {
      if ($aXVar->getY0_1__m_n() != null)
      {
        unset($aXVar->getY0_1__m_n()->xVar[$aXVar->getY0_1__m_n()->indexOfXVar($aXVar)]);
        $aXVar->getY0_1__m_n()->xVar = array_values($aXVar->getY0_1__m_n()->xVar);
      }
      $this->setY0_1__m_n($aXVar, $this);
      $this->xVar[] = $aXVar;
    }
    $wasSet = true;
    return $wasSet;
  }

  private function setY0_1__m_n($aXVar, $aY0_1__m_n)
  {
    $aXVar->mentor = $aY0_1__m_n;
    //$prop = new ReflectionProperty($aXVar, 'y0_1__m_n');
    //$prop->setAccessible(true);
    //$prop->setValue($aXVar,$aY0_1__m_n);
    //$prop->setAccessible(false);
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
    while( count($this->xVar) > 0 )
    {
      $this->xVar[0]->setY0_1__m_n(null);
      unset($this->xVar[0]);
      $this->xVar = array_values($this->xVar);
    }
    unset($this->xVar);
    $this->xVar = array();
  }

}
?>
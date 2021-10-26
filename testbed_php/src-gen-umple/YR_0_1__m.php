<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YR_0_1__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_1__m Attributes
  private $v;

  //YR_0_1__m Associations
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
      throw new Exception("Unable to create YR_0_1__m, must have 3 zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public function setZVar($newZVar)
  {
    $wasSet = false;
    $checkNewZVar = array();
    foreach ($newZVar as $aZVar)
    {
      if (array_search($aZVar,$checkNewZVar) !== false)
      {
        return $wasSet;
      }
      else if ($aZVar->getY_0_1__m() != null && $this !== $aZVar->getY_0_1__m())
      {
        return $wasSet;
      }
      $checkNewZVar[] = $aZVar;
    }

    if (count($checkNewZVar) != self::minimumNumberOfZVar())
    {
      return $wasSet;
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
        $this->setY_0_1__m($orphan, null);
      }
    }

    $this->zVar = array();
    foreach ($newZVar as $aZVar)
    {
      $this->setY_0_1__m($aZVar, $this);
      $this->zVar[] = $aZVar;
    }
    $wasSet = true;
    return $wasSet;
  }

  private function setY_0_1__m($aZVar, $aY_0_1__m)
  {
    $aZVar->mentor = $aY_0_1__m;
    //$prop = new ReflectionProperty($aZVar, 'y_0_1__m');
    //$prop->setAccessible(true);
    //$prop->setValue($aZVar,$aY_0_1__m);
    //$prop->setAccessible(false);
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
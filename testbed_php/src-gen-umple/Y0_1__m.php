<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Y0_1__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_1__m Attributes
  private $v;

  //Y0_1__m Associations
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
      throw new Exception("Unable to create Y0_1__m, must have 3 xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public function setXVar($newXVar)
  {
    $wasSet = false;
    $checkNewXVar = array();
    foreach ($newXVar as $aXVar)
    {
      if (array_search($aXVar,$checkNewXVar) !== false)
      {
        return $wasSet;
      }
      else if ($aXVar->getY0_1__m() != null && $this !== $aXVar->getY0_1__m())
      {
        return $wasSet;
      }
      $checkNewXVar[] = $aXVar;
    }

    if (count($checkNewXVar) != self::minimumNumberOfXVar())
    {
      return $wasSet;
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
        $this->setY0_1__m($orphan, null);
      }
    }

    $this->xVar = array();
    foreach ($newXVar as $aXVar)
    {
      $this->setY0_1__m($aXVar, $this);
      $this->xVar[] = $aXVar;
    }
    $wasSet = true;
    return $wasSet;
  }

  private function setY0_1__m($aXVar, $aY0_1__m)
  {
    $aXVar->mentor = $aY0_1__m;
    //$prop = new ReflectionProperty($aXVar, 'y0_1__m');
    //$prop->setAccessible(true);
    //$prop->setValue($aXVar,$aY0_1__m);
    //$prop->setAccessible(false);
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while( count($this->xVar) > 0 )
    {
      $this->xVar[0]->setY0_1__m(null);
      unset($this->xVar[0]);
      $this->xVar = array_values($this->xVar);
    }
    unset($this->xVar);
    $this->xVar = array();
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YR_0_1__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_1__1 Attributes
  private $v;

  //YR_0_1__1 Associations
  private $zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aZVar)
  {
    $this->v = 1;
    $didAddZVar = $this->setZVar($aZVar);
    if (!$didAddZVar)
    {
      throw new Exception("Unable to create y_0_1__1 due to zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public function getZVar()
  {
    return $this->zVar;
  }

  public function setZVar($aNewZVar)
  {
    $wasSet = false;
    if ($aNewZVar == null)
    {
      //Unable to setZVar to null, as y_0_1__1 must always be associated to a zVar
      return $wasSet;
    }
    
    $existingY_0_1__1 = $aNewZVar->getY_0_1__1();
    if ($existingY_0_1__1 != null && $this != $existingY_0_1__1)
    {
      //Unable to setZVar, the current zVar already has a y_0_1__1, which would be orphaned if it were re-assigned
      return $wasSet;
    }
    
    $anOldZVar = $this->zVar;
    $this->zVar = $aNewZVar;
    $this->zVar->setY_0_1__1($this);
    
    if ($anOldZVar != null)
    {
      $anOldZVar->setY_0_1__1(null);
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
    $existingZVar = $this->zVar;
    $this->zVar = null;
    if ($existingZVar != null)
    {
      $existingZVar->delete();
    }
  }

}
?>
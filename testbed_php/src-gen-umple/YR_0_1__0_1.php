<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YR_0_1__0_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_1__0_1 Attributes
  private $v;

  //YR_0_1__0_1 Associations
  private $zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->v = 1;
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

  public function hasZVar()
  {
    $has = $this->zVar != null;
    return $has;
  }

  public function setZVar($aNewZVar)
  {
    $wasSet = false;
    if ($aNewZVar == null)
    {
      $existingZVar = $this->zVar;
      $this->zVar = null;
      
      if ($existingZVar != null && $existingZVar->getY_0_1__0_1() != null)
      {
        $existingZVar->setY_0_1__0_1(null);
      }
      $wasSet = true;
      return $wasSet;
    }
    
    $currentZVar = $this->getZVar();
    if ($currentZVar != null && $currentZVar != $aNewZVar)
    {
      $currentZVar->setY_0_1__0_1(null);
    }
    
    $this->zVar = $aNewZVar;
    $existingY_0_1__0_1 = $aNewZVar->getY_0_1__0_1();
    
    if ($this != $existingY_0_1__0_1)
    {
      $aNewZVar->setY_0_1__0_1($this);
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
    
    if ($this->zVar != null)
    {
        $this->zVar->delete();
        $this->zVar = null;
    }
    
  }

}
?>
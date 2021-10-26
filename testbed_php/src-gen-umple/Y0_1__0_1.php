<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Y0_1__0_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_1__0_1 Attributes
  private $v;

  //Y0_1__0_1 Associations
  private $xVar;

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

  public function getXVar()
  {
    return $this->xVar;
  }

  public function hasXVar()
  {
    $has = $this->xVar != null;
    return $has;
  }

  public function setXVar($aNewXVar)
  {
    $wasSet = false;
    if ($aNewXVar == null)
    {
      $existingXVar = $this->xVar;
      $this->xVar = null;
      
      if ($existingXVar != null && $existingXVar->getY0_1__0_1() != null)
      {
        $existingXVar->setY0_1__0_1(null);
      }
      $wasSet = true;
      return $wasSet;
    }
    
    $currentXVar = $this->getXVar();
    if ($currentXVar != null && $currentXVar != $aNewXVar)
    {
      $currentXVar->setY0_1__0_1(null);
    }
    
    $this->xVar = $aNewXVar;
    $existingY0_1__0_1 = $aNewXVar->getY0_1__0_1();
    
    if ($this != $existingY0_1__0_1)
    {
      $aNewXVar->setY0_1__0_1($this);
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
    if ($this->xVar != null)
    {
      $this->xVar->setY0_1__0_1(null);
    }
  }

}
?>
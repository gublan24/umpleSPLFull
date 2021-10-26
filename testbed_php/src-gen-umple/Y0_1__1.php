<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Y0_1__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_1__1 Attributes
  private $v;

  //Y0_1__1 Associations
  private $xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aXVar)
  {
    $this->v = 1;
    $didAddXVar = $this->setXVar($aXVar);
    if (!$didAddXVar)
    {
      throw new Exception("Unable to create y0_1__1 due to xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public function getXVar()
  {
    return $this->xVar;
  }

  public function setXVar($aNewXVar)
  {
    $wasSet = false;
    if ($aNewXVar == null)
    {
      //Unable to setXVar to null, as y0_1__1 must always be associated to a xVar
      return $wasSet;
    }
    
    $existingY0_1__1 = $aNewXVar->getY0_1__1();
    if ($existingY0_1__1 != null && $this != $existingY0_1__1)
    {
      //Unable to setXVar, the current xVar already has a y0_1__1, which would be orphaned if it were re-assigned
      return $wasSet;
    }
    
    $anOldXVar = $this->xVar;
    $this->xVar = $aNewXVar;
    $this->xVar->setY0_1__1($this);
    
    if ($anOldXVar != null)
    {
      $anOldXVar->setY0_1__1(null);
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
    $existingXVar = $this->xVar;
    $this->xVar = null;
    if ($existingXVar != null)
    {
      $existingXVar->setY0_1__1(null);
    }
  }

}
?>
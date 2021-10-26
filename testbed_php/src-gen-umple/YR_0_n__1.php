<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YR_0_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_n__1 Attributes
  private $v;

  //YR_0_n__1 Associations
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
      throw new Exception("Unable to create y_0_n__1 due to zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public function setZVar($aZVar)
  {
    $wasSet = false;
    //Must provide zVar to y_0_n__1
    if ($aZVar == null)
    {
      return $wasSet;
    }

    //zVar already at maximum (3)
    if ($aZVar->numberOfY_0_n__1() >= Z_0_n__1::maximumNumberOfY_0_n__1())
    {
      return $wasSet;
    }
    
    $existingZVar = $this->zVar;
    $this->zVar = $aZVar;
    if ($existingZVar != null && $existingZVar != $aZVar)
    {
      $didRemove = $existingZVar->removeY_0_n__1($this);
      if (!$didRemove)
      {
        $this->zVar = $existingZVar;
        return $wasSet;
      }
    }
    $this->zVar->addY_0_n__1($this);
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
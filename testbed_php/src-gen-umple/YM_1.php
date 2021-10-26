<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YM_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YM_1 Attributes
  private $v;

  //YM_1 Associations
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
      throw new Exception("Unable to create ym_1 due to xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public function setXVar($aXVar)
  {
    $wasSet = false;
    //Must provide xVar to ym_1
    if ($aXVar == null)
    {
      return $wasSet;
    }

    //xVar already at maximum (3)
    if ($aXVar->numberOfYm_1() >= XM_1::maximumNumberOfYm_1())
    {
      return $wasSet;
    }
    
    $existingXVar = $this->xVar;
    $this->xVar = $aXVar;
    if ($existingXVar != null && $existingXVar != $aXVar)
    {
      $didRemove = $existingXVar->removeYm_1($this);
      if (!$didRemove)
      {
        $this->xVar = $existingXVar;
        return $wasSet;
      }
    }
    $this->xVar->addYm_1($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $placeholderXVar = $this->xVar;
    $this->xVar = null;
    $placeholderXVar->removeYm_1($this);
  }

}
?>
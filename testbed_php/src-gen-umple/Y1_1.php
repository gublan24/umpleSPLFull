<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Y1_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y1_1 Attributes
  private $v;

  //Y1_1 Associations
  private $xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aXVar = null)
  {
    if (func_num_args() == 0) { return; }

    $this->v = 1;
    if ($aXVar == null || $aXVar->getY1_1() != null)
    {
      throw new Exception("Unable to create Y1_1 due to aXVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $this->xVar = $aXVar;
  }
  public static function newInstance($aNumForXVar)
  {
    $thisInstance = new Y1_1();
    $thisInstance->v = 1;
    $thisInstance->xVar = new X1_1($aNumForXVar, $thisInstance);
    return $thisInstance;
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
      $existingXVar->delete();
    }
  }

}
?>
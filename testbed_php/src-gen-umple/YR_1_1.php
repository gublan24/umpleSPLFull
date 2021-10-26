<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class YR_1_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_1_1 Attributes
  private $v;

  //YR_1_1 Associations
  private $zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aZVar = null)
  {
    if (func_num_args() == 0) { return; }

    $this->v = 1;
    if ($aZVar == null || $aZVar->getY_1_1() != null)
    {
      throw new Exception("Unable to create YR_1_1 due to aZVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $this->zVar = $aZVar;
  }
  public static function newInstance($aNumForZVar)
  {
    $thisInstance = new YR_1_1();
    $thisInstance->v = 1;
    $thisInstance->zVar = new Z_1_1($aNumForZVar, $thisInstance);
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

  public function getZVar()
  {
    return $this->zVar;
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
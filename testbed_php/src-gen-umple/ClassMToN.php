<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class ClassMToN
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassMToN Associations
  private $classOtherclasses;

  //Helper Variables
  private $canSetClassOtherclasses;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($allClassOtherclasses)
  {
    $this->canSetClassOtherclasses = true;
    $this->classOtherclasses = array();
    $didAddClassOtherclasses = $this->setClassOtherclasses($allClassOtherclasses);
    if (!$didAddClassOtherclasses)
    {
      throw new Exception("Unable to create ClassMToN, must have 2 to 3 classOtherclasses. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getClassOtherclass_index($index)
  {
    $aClassOtherclass = $this->classOtherclasses[$index];
    return $aClassOtherclass;
  }

  public function getClassOtherclasses()
  {
    $newClassOtherclasses = $this->classOtherclasses;
    return $newClassOtherclasses;
  }

  public function numberOfClassOtherclasses()
  {
    $number = count($this->classOtherclasses);
    return $number;
  }

  public function hasClassOtherclasses()
  {
    $has = $this->numberOfClassOtherclasses() > 0;
    return $has;
  }

  public function indexOfClassOtherclass($aClassOtherclass)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->classOtherclasses as $classOtherclass)
    {
      if ($classOtherclass->equals($aClassOtherclass))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfClassOtherclasses()
  {
    return 2;
  }

  public static function maximumNumberOfClassOtherclasses()
  {
    return 3;
  }

  private function setClassOtherclasses($newClassOtherclasses)
  {
    $wasSet = false;
    if (!$this->canSetClassOtherclasses) { return false; }
    $this->canSetClassOtherclasses = false;
    $verifiedClassOtherclasses = array();
    foreach ($newClassOtherclasses as $aClassOtherclass)
    {
      if (array_search($aClassOtherclass,$verifiedClassOtherclasses) !== false)
      {
        continue;
      }
      $verifiedClassOtherclasses[] = $aClassOtherclass;
    }

    if (count($verifiedClassOtherclasses) != count($newClassOtherclasses) || count($verifiedClassOtherclasses) < self::minimumNumberOfClassOtherclasses()  || count($verifiedClassOtherclasses) > self::maximumNumberOfClassOtherclasses())
    {
      return $wasSet;
    }

    $this->classOtherclasses = $verifiedClassOtherclasses;
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
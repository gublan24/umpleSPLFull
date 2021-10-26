<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class AssociationClass
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationClass Associations
  private $associatedClassWithKey;

  //Helper Variables
  private $cachedHashCode;
  private $canSetAssociatedClassWithKey;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aAssociatedClassWithKey = null)
  {
    if (func_num_args() == 0) { return; }

    $this->cachedHashCode = -1;
    $this->canSetAssociatedClassWithKey = true;
    if ($aAssociatedClassWithKey == null || $aAssociatedClassWithKey->getAssociationClass() != null)
    {
      throw new Exception("Unable to create AssociationClass due to aAssociatedClassWithKey. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $this->associatedClassWithKey = $aAssociatedClassWithKey;
  }
  public static function newInstance($aIdForAssociatedClassWithKey)
  {
    $thisInstance = new AssociationClass();
    $thisInstance->associatedClassWithKey = new AssociatedClassWithKey($aIdForAssociatedClassWithKey, $thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getAssociatedClassWithKey()
  {
    return $this->associatedClassWithKey;
  }

  public function equals($compareTo)
  {
    if ($compareTo == null) { return false; }
    if (get_class($this) != get_class($compareTo)) { return false; }

    if ($this->associatedClassWithKey != $compareTo->associatedClassWithKey)
    {
      return false;
    }

    return true;
  }

  public function hashCode()
  {
    if ($this->cachedHashCode != -1)
    {
      return $this->cachedHashCode;
    }
    $this->cachedHashCode = 17;
    if ($this->associatedClassWithKey != null)
    {
      $this->cachedHashCode = $this->cachedHashCode * 23 + spl_object_hash($this->associatedClassWithKey);
    }
    else
    {
      $this->cachedHashCode = $this->cachedHashCode * 23;
    }

    $this->canSetAssociatedClassWithKey = false;
    return $this->cachedHashCode;
  }

  public function delete()
  {
    $existingAssociatedClassWithKey = $this->associatedClassWithKey;
    $this->associatedClassWithKey = null;
    if ($existingAssociatedClassWithKey != null)
    {
      $existingAssociatedClassWithKey->delete();
    }
  }

}
?>
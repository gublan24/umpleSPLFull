<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class AssociatedClassWithKey
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociatedClassWithKey Attributes
  private $id;

  //AssociatedClassWithKey Associations
  private $associationClass;
  private $associationClassManyKeys;

  //Helper Variables
  private $cachedHashCode;
  private $canSetId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aId = null, $aAssociationClass = null)
  {
    if (func_num_args() == 0) { return; }

    $this->cachedHashCode = -1;
    $this->canSetId = true;
    $this->id = $aId;
    if ($aAssociationClass == null || $aAssociationClass->getAssociatedClassWithKey() != null)
    {
      throw new Exception("Unable to create AssociatedClassWithKey due to aAssociationClass. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $this->associationClass = $aAssociationClass;
    $this->associationClassManyKeys = array();
  }
  public static function newInstance($aId)
  {
    $thisInstance = new AssociatedClassWithKey();
    $thisInstance->id = $aId;
    $thisInstance->associationClass = new AssociationClass($thisInstance);
    $this->associationClassManyKeys = array();
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setId($aId)
  {
    $wasSet = false;
    if (!$this->canSetId) { return false; }
    $this->id = $aId;
    $wasSet = true;
    return $wasSet;
  }

  public function getId()
  {
    return $this->id;
  }

  public function getAssociationClass()
  {
    return $this->associationClass;
  }

  public function getAssociationClassManyKey_index($index)
  {
    $aAssociationClassManyKey = $this->associationClassManyKeys[$index];
    return $aAssociationClassManyKey;
  }

  public function getAssociationClassManyKeys()
  {
    $newAssociationClassManyKeys = $this->associationClassManyKeys;
    return $newAssociationClassManyKeys;
  }

  public function numberOfAssociationClassManyKeys()
  {
    $number = count($this->associationClassManyKeys);
    return $number;
  }

  public function hasAssociationClassManyKeys()
  {
    $has = $this->numberOfAssociationClassManyKeys() > 0;
    return $has;
  }

  public function indexOfAssociationClassManyKey($aAssociationClassManyKey)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->associationClassManyKeys as $associationClassManyKey)
    {
      if ($associationClassManyKey->equals($aAssociationClassManyKey))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfAssociationClassManyKeys()
  {
    return 0;
  }

  public function addAssociationClassManyKey($aAssociationClassManyKey)
  {
    $wasAdded = false;
    if ($this->indexOfAssociationClassManyKey($aAssociationClassManyKey) !== -1) { return false; }
    $this->associationClassManyKeys[] = $aAssociationClassManyKey;
    if ($aAssociationClassManyKey->indexOfAssociatedClass($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aAssociationClassManyKey->addAssociatedClass($this);
      if (!$wasAdded)
      {
        array_pop($this->associationClassManyKeys);
      }
    }
    return $wasAdded;
  }

  public function removeAssociationClassManyKey($aAssociationClassManyKey)
  {
    $wasRemoved = false;
    if ($this->indexOfAssociationClassManyKey($aAssociationClassManyKey) == -1)
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfAssociationClassManyKey($aAssociationClassManyKey);
    unset($this->associationClassManyKeys[$oldIndex]);
    if ($aAssociationClassManyKey->indexOfAssociatedClass($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aAssociationClassManyKey->removeAssociatedClass($this);
      if (!$wasRemoved)
      {
        $this->associationClassManyKeys[$oldIndex] = $aAssociationClassManyKey;
        ksort($this->associationClassManyKeys);
      }
    }
    $this->associationClassManyKeys = array_values($this->associationClassManyKeys);
    return $wasRemoved;
  }

  public function addAssociationClassManyKeyAt($aAssociationClassManyKey, $index)
  {  
    $wasAdded = false;
    if($this->addAssociationClassManyKey($aAssociationClassManyKey))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfAssociationClassManyKeys()) { $index = $this->numberOfAssociationClassManyKeys() - 1; }
      array_splice($this->associationClassManyKeys, $this->indexOfAssociationClassManyKey($aAssociationClassManyKey), 1);
      array_splice($this->associationClassManyKeys, $index, 0, array($aAssociationClassManyKey));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveAssociationClassManyKeyAt($aAssociationClassManyKey, $index)
  {
    $wasAdded = false;
    if($this->indexOfAssociationClassManyKey($aAssociationClassManyKey) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfAssociationClassManyKeys()) { $index = $this->numberOfAssociationClassManyKeys() - 1; }
      array_splice($this->associationClassManyKeys, $this->indexOfAssociationClassManyKey($aAssociationClassManyKey), 1);
      array_splice($this->associationClassManyKeys, $index, 0, array($aAssociationClassManyKey));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addAssociationClassManyKeyAt($aAssociationClassManyKey, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    if ($compareTo == null) { return false; }
    if (get_class($this) != get_class($compareTo)) { return false; }

    if ($this->id != $compareTo->id)
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
    $this->cachedHashCode = $this->cachedHashCode * 23 + $this->id;

    $this->canSetId = false;
    return $this->cachedHashCode;
  }

  public function delete()
  {
    $existingAssociationClass = $this->associationClass;
    $this->associationClass = null;
    if ($existingAssociationClass != null)
    {
      $existingAssociationClass->delete();
    }
    $copyOfAssociationClassManyKeys = $this->associationClassManyKeys;
    $this->associationClassManyKeys = array();
    foreach ($copyOfAssociationClassManyKeys as $aAssociationClassManyKey)
    {
      $aAssociationClassManyKey->removeAssociatedClass($this);
    }
  }

}
?>
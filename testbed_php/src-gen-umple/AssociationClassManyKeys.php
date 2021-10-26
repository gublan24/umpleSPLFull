<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class AssociationClassManyKeys
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationClassManyKeys Associations
  private $associatedClasses;

  //Helper Variables
  private $cachedHashCode;
  private $canSetAssociatedClasses;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->cachedHashCode = -1;
    $this->canSetAssociatedClasses = true;
    $this->associatedClasses = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getAssociatedClass_index($index)
  {
    $aAssociatedClass = $this->associatedClasses[$index];
    return $aAssociatedClass;
  }

  public function getAssociatedClasses()
  {
    $newAssociatedClasses = $this->associatedClasses;
    return $newAssociatedClasses;
  }

  public function numberOfAssociatedClasses()
  {
    $number = count($this->associatedClasses);
    return $number;
  }

  public function hasAssociatedClasses()
  {
    $has = $this->numberOfAssociatedClasses() > 0;
    return $has;
  }

  public function indexOfAssociatedClass($aAssociatedClass)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->associatedClasses as $associatedClass)
    {
      if ($associatedClass->equals($aAssociatedClass))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfAssociatedClasses()
  {
    return 0;
  }

  public function addAssociatedClass($aAssociatedClass)
  {
    $wasAdded = false;
    if (!$this->canSetAssociatedClasses) { return false; }
    if ($this->indexOfAssociatedClass($aAssociatedClass) !== -1) { return false; }
    $this->associatedClasses[] = $aAssociatedClass;
    if ($aAssociatedClass->indexOfAssociationClassManyKey($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aAssociatedClass->addAssociationClassManyKey($this);
      if (!$wasAdded)
      {
        array_pop($this->associatedClasses);
      }
    }
    return $wasAdded;
  }

  public function removeAssociatedClass($aAssociatedClass)
  {
    $wasRemoved = false;
    if (!$this->canSetAssociatedClasses) { return false; }
    if ($this->indexOfAssociatedClass($aAssociatedClass) == -1)
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfAssociatedClass($aAssociatedClass);
    unset($this->associatedClasses[$oldIndex]);
    if ($aAssociatedClass->indexOfAssociationClassManyKey($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aAssociatedClass->removeAssociationClassManyKey($this);
      if (!$wasRemoved)
      {
        $this->associatedClasses[$oldIndex] = $aAssociatedClass;
        ksort($this->associatedClasses);
      }
    }
    $this->associatedClasses = array_values($this->associatedClasses);
    return $wasRemoved;
  }

  public function addAssociatedClassAt($aAssociatedClass, $index)
  {  
    $wasAdded = false;
    if($this->addAssociatedClass($aAssociatedClass))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfAssociatedClasses()) { $index = $this->numberOfAssociatedClasses() - 1; }
      array_splice($this->associatedClasses, $this->indexOfAssociatedClass($aAssociatedClass), 1);
      array_splice($this->associatedClasses, $index, 0, array($aAssociatedClass));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveAssociatedClassAt($aAssociatedClass, $index)
  {
    $wasAdded = false;
    if($this->indexOfAssociatedClass($aAssociatedClass) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfAssociatedClasses()) { $index = $this->numberOfAssociatedClasses() - 1; }
      array_splice($this->associatedClasses, $this->indexOfAssociatedClass($aAssociatedClass), 1);
      array_splice($this->associatedClasses, $index, 0, array($aAssociatedClass));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addAssociatedClassAt($aAssociatedClass, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    if ($compareTo == null) { return false; }
    if (get_class($this) != get_class($compareTo)) { return false; }

    if ($this->associatedClasses != $compareTo->associatedClasses)
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
    if ($this->associatedClasses != null)
    {
      $this->cachedHashCode = $this->cachedHashCode * 23 + spl_object_hash($this->associatedClasses);
    }
    else
    {
      $this->cachedHashCode = $this->cachedHashCode * 23;
    }

    $this->canSetAssociatedClasses = false;
    return $this->cachedHashCode;
  }

  public function delete()
  {
    $copyOfAssociatedClasses = $this->associatedClasses;
    $this->associatedClasses = array();
    foreach ($copyOfAssociatedClasses as $aAssociatedClass)
    {
      $aAssociatedClass->removeAssociationClassManyKey($this);
    }
  }

}
?>
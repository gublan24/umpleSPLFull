<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class SortedSerializableStudent
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SortedSerializableStudent Attributes
  private $id;
  private $name;

  //SortedSerializableStudent Associations
  private $sortedSerializableAcademy;
  private $sortedSerializableRegistrations;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aId, $aName, $aSortedSerializableAcademy)
  {
    $this->id = $aId;
    $this->name = $aName;
    $didAddSortedSerializableAcademy = $this->setSortedSerializableAcademy($aSortedSerializableAcademy);
    if (!$didAddSortedSerializableAcademy)
    {
      throw new Exception("Unable to create registrant due to sortedSerializableAcademy. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $this->sortedSerializableRegistrations = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setId($aId)
  {
    $wasSet = false;
    $this->id = $aId;
    $wasSet = true;
    return $wasSet;
  }

  public function setName($aName)
  {
    $wasSet = false;
    $this->name = $aName;
    $wasSet = true;
    return $wasSet;
  }

  public function getId()
  {
    return $this->id;
  }

  public function getName()
  {
    return $this->name;
  }

  public function getSortedSerializableAcademy()
  {
    return $this->sortedSerializableAcademy;
  }

  public function getSortedSerializableRegistration_index($index)
  {
    $aSortedSerializableRegistration = $this->sortedSerializableRegistrations[$index];
    return $aSortedSerializableRegistration;
  }

  public function getSortedSerializableRegistrations()
  {
    $newSortedSerializableRegistrations = $this->sortedSerializableRegistrations;
    return $newSortedSerializableRegistrations;
  }

  public function numberOfSortedSerializableRegistrations()
  {
    $number = count($this->sortedSerializableRegistrations);
    return $number;
  }

  public function hasSortedSerializableRegistrations()
  {
    $has = $this->numberOfSortedSerializableRegistrations() > 0;
    return $has;
  }

  public function indexOfSortedSerializableRegistration($aSortedSerializableRegistration)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->sortedSerializableRegistrations as $sortedSerializableRegistration)
    {
      if ($sortedSerializableRegistration->equals($aSortedSerializableRegistration))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function setSortedSerializableAcademy($aSortedSerializableAcademy)
  {
    $wasSet = false;
    if ($aSortedSerializableAcademy == null)
    {
      return $wasSet;
    }
    
    $existingSortedSerializableAcademy = $this->sortedSerializableAcademy;
    $this->sortedSerializableAcademy = $aSortedSerializableAcademy;
    if ($existingSortedSerializableAcademy != null && $existingSortedSerializableAcademy != $aSortedSerializableAcademy)
    {
      $existingSortedSerializableAcademy->removeRegistrant($this);
    }
    $this->sortedSerializableAcademy->addRegistrant($this);
    $wasSet = true;
    return $wasSet;
  }

  public static function minimumNumberOfSortedSerializableRegistrations()
  {
    return 0;
  }

  public function addSortedSerializableRegistrationVia($aSortedSerializableCourse)
  {
    return new SortedSerializableRegistration($this, $aSortedSerializableCourse);
  }

  public function addSortedSerializableRegistration($aSortedSerializableRegistration)
  {
    $wasAdded = false;
    if ($this->indexOfSortedSerializableRegistration($aSortedSerializableRegistration) !== -1) { return false; }
    $existingSortedSerializableStudent = $aSortedSerializableRegistration->getSortedSerializableStudent();
    $isNewSortedSerializableStudent = $existingSortedSerializableStudent != null && $this !== $existingSortedSerializableStudent;
    if ($isNewSortedSerializableStudent)
    {
      $aSortedSerializableRegistration->setSortedSerializableStudent($this);
    }
    else
    {
      $this->sortedSerializableRegistrations[] = $aSortedSerializableRegistration;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeSortedSerializableRegistration($aSortedSerializableRegistration)
  {
    $wasRemoved = false;
    //Unable to remove aSortedSerializableRegistration, as it must always have a sortedSerializableStudent
    if ($this !== $aSortedSerializableRegistration->getSortedSerializableStudent())
    {
      unset($this->sortedSerializableRegistrations[$this->indexOfSortedSerializableRegistration($aSortedSerializableRegistration)]);
      $this->sortedSerializableRegistrations = array_values($this->sortedSerializableRegistrations);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addSortedSerializableRegistrationAt($aSortedSerializableRegistration, $index)
  {  
    $wasAdded = false;
    if($this->addSortedSerializableRegistration($aSortedSerializableRegistration))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfSortedSerializableRegistrations()) { $index = $this->numberOfSortedSerializableRegistrations() - 1; }
      array_splice($this->sortedSerializableRegistrations, $this->indexOfSortedSerializableRegistration($aSortedSerializableRegistration), 1);
      array_splice($this->sortedSerializableRegistrations, $index, 0, array($aSortedSerializableRegistration));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveSortedSerializableRegistrationAt($aSortedSerializableRegistration, $index)
  {
    $wasAdded = false;
    if($this->indexOfSortedSerializableRegistration($aSortedSerializableRegistration) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfSortedSerializableRegistrations()) { $index = $this->numberOfSortedSerializableRegistrations() - 1; }
      array_splice($this->sortedSerializableRegistrations, $this->indexOfSortedSerializableRegistration($aSortedSerializableRegistration), 1);
      array_splice($this->sortedSerializableRegistrations, $index, 0, array($aSortedSerializableRegistration));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addSortedSerializableRegistrationAt($aSortedSerializableRegistration, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $placeholderSortedSerializableAcademy = $this->sortedSerializableAcademy;
    $this->sortedSerializableAcademy = null;
    $placeholderSortedSerializableAcademy->removeRegistrant($this);
    foreach ($this->sortedSerializableRegistrations as $aSortedSerializableRegistration)
    {
      $aSortedSerializableRegistration->delete();
    }
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class SortedSerializableCourse
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SortedSerializableCourse Attributes
  private $code;
  private $sortedSerializableRegistrationsPriority;

  //SortedSerializableCourse Associations
  private $sortedSerializableAcademy;
  private $sortedSerializableRegistrations;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aCode, $aSortedSerializableAcademy)
  {
    $this->code = $aCode;
    $this->sortedSerializableRegistrationsPriority = 
      function($x, $y)
      {
        return $x->getName() -
               $y->getName();
      };
    $didAddSortedSerializableAcademy = $this->setSortedSerializableAcademy($aSortedSerializableAcademy);
    if (!$didAddSortedSerializableAcademy)
    {
      throw new Exception("Unable to create sortedSerializableCourse due to sortedSerializableAcademy. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $this->sortedSerializableRegistrations = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setCode($aCode)
  {
    $wasSet = false;
    $this->code = $aCode;
    $wasSet = true;
    return $wasSet;
  }

  public function setSortedSerializableRegistrationsPriority($aSortedSerializableRegistrationsPriority)
  {
    $wasSet = false;
    $this->sortedSerializableRegistrationsPriority = $aSortedSerializableRegistrationsPriority;
    $wasSet = true;
    return $wasSet;
  }

  public function getCode()
  {
    return $this->code;
  }

  public function getSortedSerializableRegistrationsPriority()
  {
    return $this->sortedSerializableRegistrationsPriority;
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
      $existingSortedSerializableAcademy->removeSortedSerializableCourse($this);
    }
    $this->sortedSerializableAcademy->addSortedSerializableCourse($this);
    $wasSet = true;
    return $wasSet;
  }

  public static function minimumNumberOfSortedSerializableRegistrations()
  {
    return 0;
  }

  public function addSortedSerializableRegistrationVia($aSortedSerializableStudent)
  {
    return new SortedSerializableRegistration($aSortedSerializableStudent, $this);
  }

  public function addSortedSerializableRegistration($aSortedSerializableRegistration)
  {
    $wasAdded = false;
    if ($this->indexOfSortedSerializableRegistration($aSortedSerializableRegistration) !== -1) { return false; }
    $existingSortedSerializableCourse = $aSortedSerializableRegistration->getSortedSerializableCourse();
    $isNewSortedSerializableCourse = $existingSortedSerializableCourse != null && $this !== $existingSortedSerializableCourse;
    if ($isNewSortedSerializableCourse)
    {
      $aSortedSerializableRegistration->setSortedSerializableCourse($this);
    }
    else
    {
      $this->sortedSerializableRegistrations[] = $aSortedSerializableRegistration;
    }
    $wasAdded = true;
    if(wasAdded)
        usort($this->sortedSerializableRegistrations, $this->sortedSerializableRegistrationsPriority);
    
    return $wasAdded;
  }

  public function removeSortedSerializableRegistration($aSortedSerializableRegistration)
  {
    $wasRemoved = false;
    //Unable to remove aSortedSerializableRegistration, as it must always have a sortedSerializableCourse
    if ($this !== $aSortedSerializableRegistration->getSortedSerializableCourse())
    {
      unset($this->sortedSerializableRegistrations[$this->indexOfSortedSerializableRegistration($aSortedSerializableRegistration)]);
      $this->sortedSerializableRegistrations = array_values($this->sortedSerializableRegistrations);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $placeholderSortedSerializableAcademy = $this->sortedSerializableAcademy;
    $this->sortedSerializableAcademy = null;
    $placeholderSortedSerializableAcademy->removeSortedSerializableCourse($this);
    foreach ($this->sortedSerializableRegistrations as $aSortedSerializableRegistration)
    {
      $aSortedSerializableRegistration->delete();
    }
  }

}
?>
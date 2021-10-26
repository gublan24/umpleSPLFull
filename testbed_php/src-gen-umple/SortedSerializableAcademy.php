<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class SortedSerializableAcademy
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SortedSerializableAcademy Attributes
  private $sortedSerializableCoursesPriority;
  private $registrantsPriority;

  //SortedSerializableAcademy Associations
  private $sortedSerializableCourses;
  private $registrants;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->sortedSerializableCoursesPriority = 
      function($x, $y)
      {
        return $x->getCode() -
               $y->getCode();
      };
    $this->registrantsPriority = 
      function($x, $y)
      {
        return $x->getId() -
               $y->getId();
      };
    $this->sortedSerializableCourses = array();
    $this->registrants = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setSortedSerializableCoursesPriority($aSortedSerializableCoursesPriority)
  {
    $wasSet = false;
    $this->sortedSerializableCoursesPriority = $aSortedSerializableCoursesPriority;
    $wasSet = true;
    return $wasSet;
  }

  public function setRegistrantsPriority($aRegistrantsPriority)
  {
    $wasSet = false;
    $this->registrantsPriority = $aRegistrantsPriority;
    $wasSet = true;
    return $wasSet;
  }

  public function getSortedSerializableCoursesPriority()
  {
    return $this->sortedSerializableCoursesPriority;
  }

  public function getRegistrantsPriority()
  {
    return $this->registrantsPriority;
  }

  public function getSortedSerializableCourse_index($index)
  {
    $aSortedSerializableCourse = $this->sortedSerializableCourses[$index];
    return $aSortedSerializableCourse;
  }

  public function getSortedSerializableCourses()
  {
    $newSortedSerializableCourses = $this->sortedSerializableCourses;
    return $newSortedSerializableCourses;
  }

  public function numberOfSortedSerializableCourses()
  {
    $number = count($this->sortedSerializableCourses);
    return $number;
  }

  public function hasSortedSerializableCourses()
  {
    $has = $this->numberOfSortedSerializableCourses() > 0;
    return $has;
  }

  public function indexOfSortedSerializableCourse($aSortedSerializableCourse)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->sortedSerializableCourses as $sortedSerializableCourse)
    {
      if ($sortedSerializableCourse->equals($aSortedSerializableCourse))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getRegistrant_index($index)
  {
    $aRegistrant = $this->registrants[$index];
    return $aRegistrant;
  }

  public function getRegistrants()
  {
    $newRegistrants = $this->registrants;
    return $newRegistrants;
  }

  public function numberOfRegistrants()
  {
    $number = count($this->registrants);
    return $number;
  }

  public function hasRegistrants()
  {
    $has = $this->numberOfRegistrants() > 0;
    return $has;
  }

  public function indexOfRegistrant($aRegistrant)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->registrants as $registrant)
    {
      if ($registrant->equals($aRegistrant))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfSortedSerializableCourses()
  {
    return 0;
  }

  public function addSortedSerializableCourseVia($aCode)
  {
    return new SortedSerializableCourse($aCode, $this);
  }

  public function addSortedSerializableCourse($aSortedSerializableCourse)
  {
    $wasAdded = false;
    if ($this->indexOfSortedSerializableCourse($aSortedSerializableCourse) !== -1) { return false; }
    $existingSortedSerializableAcademy = $aSortedSerializableCourse->getSortedSerializableAcademy();
    $isNewSortedSerializableAcademy = $existingSortedSerializableAcademy != null && $this !== $existingSortedSerializableAcademy;
    if ($isNewSortedSerializableAcademy)
    {
      $aSortedSerializableCourse->setSortedSerializableAcademy($this);
    }
    else
    {
      $this->sortedSerializableCourses[] = $aSortedSerializableCourse;
    }
    $wasAdded = true;
    if(wasAdded)
        usort($this->sortedSerializableCourses, $this->sortedSerializableCoursesPriority);
    
    return $wasAdded;
  }

  public function removeSortedSerializableCourse($aSortedSerializableCourse)
  {
    $wasRemoved = false;
    //Unable to remove aSortedSerializableCourse, as it must always have a sortedSerializableAcademy
    if ($this !== $aSortedSerializableCourse->getSortedSerializableAcademy())
    {
      unset($this->sortedSerializableCourses[$this->indexOfSortedSerializableCourse($aSortedSerializableCourse)]);
      $this->sortedSerializableCourses = array_values($this->sortedSerializableCourses);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public static function minimumNumberOfRegistrants()
  {
    return 0;
  }

  public function addRegistrantVia($aId, $aName)
  {
    return new SortedSerializableStudent($aId, $aName, $this);
  }

  public function addRegistrant($aRegistrant)
  {
    $wasAdded = false;
    if ($this->indexOfRegistrant($aRegistrant) !== -1) { return false; }
    $existingSortedSerializableAcademy = $aRegistrant->getSortedSerializableAcademy();
    $isNewSortedSerializableAcademy = $existingSortedSerializableAcademy != null && $this !== $existingSortedSerializableAcademy;
    if ($isNewSortedSerializableAcademy)
    {
      $aRegistrant->setSortedSerializableAcademy($this);
    }
    else
    {
      $this->registrants[] = $aRegistrant;
    }
    $wasAdded = true;
    if(wasAdded)
        usort($this->registrants, $this->registrantsPriority);
    
    return $wasAdded;
  }

  public function removeRegistrant($aRegistrant)
  {
    $wasRemoved = false;
    //Unable to remove aRegistrant, as it must always have a sortedSerializableAcademy
    if ($this !== $aRegistrant->getSortedSerializableAcademy())
    {
      unset($this->registrants[$this->indexOfRegistrant($aRegistrant)]);
      $this->registrants = array_values($this->registrants);
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
    foreach ($this->sortedSerializableCourses as $aSortedSerializableCourse)
    {
      $aSortedSerializableCourse->delete();
    }
    foreach ($this->registrants as $aRegistrant)
    {
      $aRegistrant->delete();
    }
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class SortedSerializableRegistration
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SortedSerializableRegistration Associations
  private $sortedSerializableStudent;
  private $sortedSerializableCourse;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aSortedSerializableStudent, $aSortedSerializableCourse)
  {
    $didAddSortedSerializableStudent = $this->setSortedSerializableStudent($aSortedSerializableStudent);
    if (!$didAddSortedSerializableStudent)
    {
      throw new Exception("Unable to create sortedSerializableRegistration due to sortedSerializableStudent. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $didAddSortedSerializableCourse = $this->setSortedSerializableCourse($aSortedSerializableCourse);
    if (!$didAddSortedSerializableCourse)
    {
      throw new Exception("Unable to create sortedSerializableRegistration due to sortedSerializableCourse. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getName()
  {
    return getSortedSerializableStudent().getName();
  }

  public function getCode()
  {
    return getSortedSerializableCourse().getCode();
  }

  public function getSortedSerializableStudent()
  {
    return $this->sortedSerializableStudent;
  }

  public function getSortedSerializableCourse()
  {
    return $this->sortedSerializableCourse;
  }

  public function setSortedSerializableStudent($aSortedSerializableStudent)
  {
    $wasSet = false;
    if ($aSortedSerializableStudent == null)
    {
      return $wasSet;
    }
    
    $existingSortedSerializableStudent = $this->sortedSerializableStudent;
    $this->sortedSerializableStudent = $aSortedSerializableStudent;
    if ($existingSortedSerializableStudent != null && $existingSortedSerializableStudent != $aSortedSerializableStudent)
    {
      $existingSortedSerializableStudent->removeSortedSerializableRegistration($this);
    }
    $this->sortedSerializableStudent->addSortedSerializableRegistration($this);
    $wasSet = true;
    return $wasSet;
  }

  public function setSortedSerializableCourse($aSortedSerializableCourse)
  {
    $wasSet = false;
    if ($aSortedSerializableCourse == null)
    {
      return $wasSet;
    }
    
    $existingSortedSerializableCourse = $this->sortedSerializableCourse;
    $this->sortedSerializableCourse = $aSortedSerializableCourse;
    if ($existingSortedSerializableCourse != null && $existingSortedSerializableCourse != $aSortedSerializableCourse)
    {
      $existingSortedSerializableCourse->removeSortedSerializableRegistration($this);
    }
    $this->sortedSerializableCourse->addSortedSerializableRegistration($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $placeholderSortedSerializableStudent = $this->sortedSerializableStudent;
    $this->sortedSerializableStudent = null;
    $placeholderSortedSerializableStudent->removeSortedSerializableRegistration($this);
    $placeholderSortedSerializableCourse = $this->sortedSerializableCourse;
    $this->sortedSerializableCourse = null;
    $placeholderSortedSerializableCourse->removeSortedSerializableRegistration($this);
  }

}
?>
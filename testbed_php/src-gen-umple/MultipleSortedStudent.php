<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class MultipleSortedStudent
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MultipleSortedStudent Attributes
  private $id;
  private $name;
  private $multipleSortedRegistrationsPriority;

  //MultipleSortedStudent Associations
  private $multipleSortedAcademy;
  private $multipleSortedRegistrations;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aId, $aName, $aMultipleSortedAcademy)
  {
    $this->id = $aId;
    $this->name = $aName;
    $this->multipleSortedRegistrationsPriority = 
      function($x, $y)
      {
        return $x->getCode() -
               $y->getCode();
      };
    $didAddMultipleSortedAcademy = $this->setMultipleSortedAcademy($aMultipleSortedAcademy);
    if (!$didAddMultipleSortedAcademy)
    {
      throw new Exception("Unable to create registrant due to multipleSortedAcademy. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $this->multipleSortedRegistrations = array();
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

  public function setMultipleSortedRegistrationsPriority($aMultipleSortedRegistrationsPriority)
  {
    $wasSet = false;
    $this->multipleSortedRegistrationsPriority = $aMultipleSortedRegistrationsPriority;
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

  public function getMultipleSortedRegistrationsPriority()
  {
    return $this->multipleSortedRegistrationsPriority;
  }

  public function getMultipleSortedAcademy()
  {
    return $this->multipleSortedAcademy;
  }

  public function getMultipleSortedRegistration_index($index)
  {
    $aMultipleSortedRegistration = $this->multipleSortedRegistrations[$index];
    return $aMultipleSortedRegistration;
  }

  public function getMultipleSortedRegistrations()
  {
    $newMultipleSortedRegistrations = $this->multipleSortedRegistrations;
    return $newMultipleSortedRegistrations;
  }

  public function numberOfMultipleSortedRegistrations()
  {
    $number = count($this->multipleSortedRegistrations);
    return $number;
  }

  public function hasMultipleSortedRegistrations()
  {
    $has = $this->numberOfMultipleSortedRegistrations() > 0;
    return $has;
  }

  public function indexOfMultipleSortedRegistration($aMultipleSortedRegistration)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->multipleSortedRegistrations as $multipleSortedRegistration)
    {
      if ($multipleSortedRegistration->equals($aMultipleSortedRegistration))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function setMultipleSortedAcademy($aMultipleSortedAcademy)
  {
    $wasSet = false;
    if ($aMultipleSortedAcademy == null)
    {
      return $wasSet;
    }
    
    $existingMultipleSortedAcademy = $this->multipleSortedAcademy;
    $this->multipleSortedAcademy = $aMultipleSortedAcademy;
    if ($existingMultipleSortedAcademy != null && $existingMultipleSortedAcademy != $aMultipleSortedAcademy)
    {
      $existingMultipleSortedAcademy->removeRegistrant($this);
    }
    $this->multipleSortedAcademy->addRegistrant($this);
    $wasSet = true;
    return $wasSet;
  }

  public static function minimumNumberOfMultipleSortedRegistrations()
  {
    return 0;
  }

  public function addMultipleSortedRegistrationVia($aMultipleSortedCourse)
  {
    return new MultipleSortedRegistration($aMultipleSortedCourse, $this);
  }

  public function addMultipleSortedRegistration($aMultipleSortedRegistration)
  {
    $wasAdded = false;
    if ($this->indexOfMultipleSortedRegistration($aMultipleSortedRegistration) !== -1) { return false; }
    $existingMultipleSortedStudent = $aMultipleSortedRegistration->getMultipleSortedStudent();
    $isNewMultipleSortedStudent = $existingMultipleSortedStudent != null && $this !== $existingMultipleSortedStudent;
    if ($isNewMultipleSortedStudent)
    {
      $aMultipleSortedRegistration->setMultipleSortedStudent($this);
    }
    else
    {
      $this->multipleSortedRegistrations[] = $aMultipleSortedRegistration;
    }
    $wasAdded = true;
    if(wasAdded)
        usort($this->multipleSortedRegistrations, $this->multipleSortedRegistrationsPriority);
    
    return $wasAdded;
  }

  public function removeMultipleSortedRegistration($aMultipleSortedRegistration)
  {
    $wasRemoved = false;
    //Unable to remove aMultipleSortedRegistration, as it must always have a multipleSortedStudent
    if ($this !== $aMultipleSortedRegistration->getMultipleSortedStudent())
    {
      unset($this->multipleSortedRegistrations[$this->indexOfMultipleSortedRegistration($aMultipleSortedRegistration)]);
      $this->multipleSortedRegistrations = array_values($this->multipleSortedRegistrations);
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
    $placeholderMultipleSortedAcademy = $this->multipleSortedAcademy;
    $this->multipleSortedAcademy = null;
    $placeholderMultipleSortedAcademy->removeRegistrant($this);
    foreach ($this->multipleSortedRegistrations as $aMultipleSortedRegistration)
    {
      $aMultipleSortedRegistration->delete();
    }
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class ClassWithManySortedAssociations
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassWithManySortedAssociations Attributes
  private $studentCsPriority;
  private $studentALsPriority;

  //ClassWithManySortedAssociations Associations
  private $studentCs;
  private $studentALs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->studentCsPriority = 
      function($x, $y)
      {
        return $x->getId() -
               $y->getId();
      };
    $this->studentALsPriority = 
      function($x, $y)
      {
        return $x->getNumber() -
               $y->getNumber();
      };
    $this->studentCs = array();
    $this->studentALs = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setStudentCsPriority($aStudentCsPriority)
  {
    $wasSet = false;
    $this->studentCsPriority = $aStudentCsPriority;
    $wasSet = true;
    return $wasSet;
  }

  public function setStudentALsPriority($aStudentALsPriority)
  {
    $wasSet = false;
    $this->studentALsPriority = $aStudentALsPriority;
    $wasSet = true;
    return $wasSet;
  }

  public function getStudentCsPriority()
  {
    return $this->studentCsPriority;
  }

  public function getStudentALsPriority()
  {
    return $this->studentALsPriority;
  }

  public function getStudentC_index($index)
  {
    $aStudentC = $this->studentCs[$index];
    return $aStudentC;
  }

  public function getStudentCs()
  {
    $newStudentCs = $this->studentCs;
    return $newStudentCs;
  }

  public function numberOfStudentCs()
  {
    $number = count($this->studentCs);
    return $number;
  }

  public function hasStudentCs()
  {
    $has = $this->numberOfStudentCs() > 0;
    return $has;
  }

  public function indexOfStudentC($aStudentC)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->studentCs as $studentC)
    {
      if ($studentC->equals($aStudentC))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getStudentAL_index($index)
  {
    $aStudentAL = $this->studentALs[$index];
    return $aStudentAL;
  }

  public function getStudentALs()
  {
    $newStudentALs = $this->studentALs;
    return $newStudentALs;
  }

  public function numberOfStudentALs()
  {
    $number = count($this->studentALs);
    return $number;
  }

  public function hasStudentALs()
  {
    $has = $this->numberOfStudentALs() > 0;
    return $has;
  }

  public function indexOfStudentAL($aStudentAL)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->studentALs as $studentAL)
    {
      if ($studentAL->equals($aStudentAL))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfStudentCs()
  {
    return 0;
  }

  public function addStudentC($aStudentC)
  {
    $wasAdded = false;
    if ($this->indexOfStudentC($aStudentC) !== -1) { return false; }
    $this->studentCs[] = $aStudentC;
    $wasAdded = true;
    if(wasAdded)
        usort($this->studentCs, $this->studentCsPriority);
    
    return $wasAdded;
  }

  public function removeStudentC($aStudentC)
  {
    $wasRemoved = false;
    if ($this->indexOfStudentC($aStudentC) != -1)
    {
      unset($this->studentCs[$this->indexOfStudentC($aStudentC)]);
      $this->studentCs = array_values($this->studentCs);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public static function minimumNumberOfStudentALs()
  {
    return 0;
  }

  public function addStudentAL($aStudentAL)
  {
    $wasAdded = false;
    if ($this->indexOfStudentAL($aStudentAL) !== -1) { return false; }
    $this->studentALs[] = $aStudentAL;
    $wasAdded = true;
    if(wasAdded)
        usort($this->studentALs, $this->studentALsPriority);
    
    return $wasAdded;
  }

  public function removeStudentAL($aStudentAL)
  {
    $wasRemoved = false;
    if ($this->indexOfStudentAL($aStudentAL) != -1)
    {
      unset($this->studentALs[$this->indexOfStudentAL($aStudentAL)]);
      $this->studentALs = array_values($this->studentALs);
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
    $this->studentCs = array();
    $this->studentALs = array();
  }

}
?>
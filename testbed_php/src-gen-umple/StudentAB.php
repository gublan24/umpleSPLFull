<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class StudentAB
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentAB Attributes
  private $number;

  //StudentAB Associations
  private $program;
  private $mentors;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNumber)
  {
    $this->number = $aNumber;
    $this->mentors = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setNumber($aNumber)
  {
    $wasSet = false;
    $this->number = $aNumber;
    $wasSet = true;
    return $wasSet;
  }

  public function getNumber()
  {
    return $this->number;
  }

  public function getProgram()
  {
    return $this->program;
  }

  public function hasProgram()
  {
    $has = $this->program != null;
    return $has;
  }

  public function getMentor_index($index)
  {
    $aMentor = $this->mentors[$index];
    return $aMentor;
  }

  public function getMentors()
  {
    $newMentors = $this->mentors;
    return $newMentors;
  }

  public function numberOfMentors()
  {
    $number = count($this->mentors);
    return $number;
  }

  public function hasMentors()
  {
    $has = $this->numberOfMentors() > 0;
    return $has;
  }

  public function indexOfMentor($aMentor)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->mentors as $mentor)
    {
      if ($mentor->equals($aMentor))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function setProgram($aNewProgram)
  {
    $wasSet = false;
    if ($aNewProgram == null)
    {
      $existingProgram = $this->program;
      $this->program = null;
      
      if ($existingProgram != null && $existingProgram->getStudent() != null)
      {
        $existingProgram->setStudent(null);
      }
      $wasSet = true;
      return $wasSet;
    }
    
    $currentProgram = $this->getProgram();
    if ($currentProgram != null && $currentProgram != $aNewProgram)
    {
      $currentProgram->setStudent(null);
    }
    
    $this->program = $aNewProgram;
    $existingStudent = $aNewProgram->getStudent();
    
    if ($this != $existingStudent)
    {
      $aNewProgram->setStudent($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function isNumberOfMentorsValid()
  {
    $isValid = $this->numberOfMentors() >= self::minimumNumberOfMentors() && $this->numberOfMentors() <= self::maximumNumberOfMentors();
    return $isValid;
  }

  public static function minimumNumberOfMentors()
  {
    return 3;
  }

  public static function maximumNumberOfMentors()
  {
    return 5;
  }

  public function addMentor($aMentor)
  {
    $wasAdded = false;
    if ($this->indexOfMentor($aMentor) !== -1) { return false; }
    if ($this->numberOfMentors() >= self::maximumNumberOfMentors())
    {
      return $wasAdded;
    }

    $this->mentors[] = $aMentor;
    if ($aMentor->indexOfStudent($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aMentor->addStudent($this);
      if (!$wasAdded)
      {
        array_pop($this->mentors);
      }
    }
    return $wasAdded;
  }

  public function removeMentor($aMentor)
  {
    $wasRemoved = false;
    if ($this->indexOfMentor($aMentor) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfMentors() <= self::minimumNumberOfMentors())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfMentor($aMentor);
    unset($this->mentors[$oldIndex]);
    if ($aMentor->indexOfStudent($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aMentor->removeStudent($this);
      if (!$wasRemoved)
      {
        $this->mentors[$oldIndex] = $aMentor;
        ksort($this->mentors);
      }
    }
    $this->mentors = array_values($this->mentors);
    return $wasRemoved;
  }

  public function addMentorAt($aMentor, $index)
  {  
    $wasAdded = false;
    if($this->addMentor($aMentor))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfMentors()) { $index = $this->numberOfMentors() - 1; }
      array_splice($this->mentors, $this->indexOfMentor($aMentor), 1);
      array_splice($this->mentors, $index, 0, array($aMentor));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveMentorAt($aMentor, $index)
  {
    $wasAdded = false;
    if($this->indexOfMentor($aMentor) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfMentors()) { $index = $this->numberOfMentors() - 1; }
      array_splice($this->mentors, $this->indexOfMentor($aMentor), 1);
      array_splice($this->mentors, $index, 0, array($aMentor));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addMentorAt($aMentor, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    if ($this->program != null)
    {
      $this->program->setStudent(null);
    }
    $copyOfMentors = $this->mentors;
    $this->mentors = array();
    foreach ($copyOfMentors as $aMentor)
    {
      $aMentor->removeStudent($this);
    }
  }

}
?>
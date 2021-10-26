<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class MentorAR
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MentorAR Associations
  private $studentARs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($allStudentARs)
  {
    $this->studentARs = array();
    $didAddStudentARs = $this->setStudentARs($allStudentARs);
    if (!$didAddStudentARs)
    {
      throw new Exception("Unable to create MentorAR, must have at least 1 studentARs. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStudentAR_index($index)
  {
    $aStudentAR = $this->studentARs[$index];
    return $aStudentAR;
  }

  public function getStudentARs()
  {
    $newStudentARs = $this->studentARs;
    return $newStudentARs;
  }

  public function numberOfStudentARs()
  {
    $number = count($this->studentARs);
    return $number;
  }

  public function hasStudentARs()
  {
    $has = $this->numberOfStudentARs() > 0;
    return $has;
  }

  public function indexOfStudentAR($aStudentAR)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->studentARs as $studentAR)
    {
      if ($studentAR->equals($aStudentAR))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfStudentARs()
  {
    return 1;
  }

  public function addStudentAR($aStudentAR)
  {
    $wasAdded = false;
    if ($this->indexOfStudentAR($aStudentAR) !== -1) { return false; }
    $existingMentorAR = $aStudentAR->getMentorAR();
    if ($existingMentorAR != null && $existingMentorAR->numberOfStudentARs() <= self::minimumNumberOfStudentARs())
    {
      return $wasAdded;
    }
    else if ($existingMentorAR != null)
    {
      unset($existingMentorAR->studentARs[$existingMentorAR->indexOfStudentAR($aStudentAR)]);
      $existingMentorAR->studentARs = array_values($existingMentorAR->studentARs);
    }
    $this->studentARs[] = $aStudentAR;
    $this->setMentorAR($aStudentAR,$this);
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeStudentAR($aStudentAR)
  {
    $wasRemoved = false;
    if ($this->indexOfStudentAR($aStudentAR) != -1 && $this->numberOfStudentARs() > self::minimumNumberOfStudentARs())
    {
      unset($this->studentARs[$this->indexOfStudentAR($aStudentAR)]);
      $this->studentARs = array_values($this->studentARs);
      $this->setMentorAR($aStudentAR,null);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function setStudentARs($newStudentARs)
  {
    $wasSet = false;
    if (count($newStudentARs) < self::minimumNumberOfStudentARs())
    {
      return $wasSet;
    }

    $checkNewStudentARs = array();
    $mentorARToNewStudentARs = array();
    foreach ($newStudentARs as $aStudentAR)
    {
      if (array_search($aStudentAR,$checkNewStudentARs) !== false)
      {
        return $wasSet;
      }
      else if ($aStudentAR->getMentorAR() != null && $this !== $aStudentAR->getMentorAR())
      {
        $existingMentorAR = $aStudentAR->getMentorAR();
        $existingSerializedMentorAR = serialize($existingMentorAR);
        if (!array_key_exists($existingSerializedMentorAR, $mentorARToNewStudentARs))
        {
          $mentorARToNewStudentARs[$existingSerializedMentorAR] = $existingMentorAR->numberOfStudentARs();
        }
        $nextCount = $mentorARToNewStudentARs[$existingSerializedMentorAR] - 1;
        if ($nextCount < self::minimumnumberOfStudentARs())
        {
          return $wasSet;
        }
        $mentorARToNewStudentARs[$existingSerializedMentorAR] = $nextCount;
      }
      $checkNewStudentARs[] = $aStudentAR;
    }

    foreach ($this->studentARs as $orphan) 
    {
      $wasFound = false;
      foreach ($checkNewStudentARs as $fosterCare)
      {
        if ($orphan == $fosterCare)
        {
          $wasFound = true;
          break;
        }
      }
      
      if (!$wasFound)
      {
        $this->setMentorAR($orphan, null);
      }
    }

    $this->studentARs = array();
    foreach ($newStudentARs as $aStudentAR)
    {
      if ($aStudentAR->getMentorAR() != null)
      {
        unset($aStudentAR->getMentorAR()->studentARs[$aStudentAR->getMentorAR()->indexOfStudentAR($aStudentAR)]);
        $aStudentAR->getMentorAR()->studentARs = array_values($aStudentAR->getMentorAR()->studentARs);
      }
      $this->setMentorAR($aStudentAR, $this);
      $this->studentARs[] = $aStudentAR;
    }
    $wasSet = true;
    return $wasSet;
  }

  private function setMentorAR($aStudentAR, $aMentorAR)
  {
    $aStudentAR->mentor = $aMentorAR;
    //$prop = new ReflectionProperty($aStudentAR, 'mentorAR');
    //$prop->setAccessible(true);
    //$prop->setValue($aStudentAR,$aMentorAR);
    //$prop->setAccessible(false);
  }

  public function addStudentARAt($aStudentAR, $index)
  {  
    $wasAdded = false;
    if($this->addStudentAR($aStudentAR))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStudentARs()) { $index = $this->numberOfStudentARs() - 1; }
      array_splice($this->studentARs, $this->indexOfStudentAR($aStudentAR), 1);
      array_splice($this->studentARs, $index, 0, array($aStudentAR));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveStudentARAt($aStudentAR, $index)
  {
    $wasAdded = false;
    if($this->indexOfStudentAR($aStudentAR) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStudentARs()) { $index = $this->numberOfStudentARs() - 1; }
      array_splice($this->studentARs, $this->indexOfStudentAR($aStudentAR), 1);
      array_splice($this->studentARs, $index, 0, array($aStudentAR));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addStudentARAt($aStudentAR, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    foreach ($this->studentARs as $aStudentAR)
    {
      $this->setMentorAR($aStudentAR,null);
    }
    $this->studentARs = array();
  }

}
?>
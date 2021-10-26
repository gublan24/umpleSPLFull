<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class StudentAR
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentAR Associations
  public $mentorAR; //until PHP 5.3 (setAccessible)

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public function getMentorAR()
  {
    return $this->mentorAR;
  }

  public function hasMentorAR()
  {
    $has = $this->mentorAR != null;
    return $has;
  }

  public function setMentorAR($aMentorAR)
  {
    //
    // This source of this source generation is association_SetOptionalOneToMandatoryMany.jet
    // This set file assumes the generation of a maximumNumberOfXXX method does not exist because 
    // it's not required (No upper bound)
    //   

    $wasSet = false;
    
    $existingMentorAR = $this->mentorAR;

    if ($existingMentorAR == null)
    {
      if ($aMentorAR != null)
      {
        if ($aMentorAR->addStudentAR($this))
        {
          $existingMentorAR = $aMentorAR;
          $wasSet = true;
        }
      }
    } 
    else if ($existingMentorAR != null)
    {
      if ($aMentorAR == null)
      {
        if ($existingMentorAR->minimumNumberOfStudentARs() < $existingMentorAR->numberOfStudentARs())
        {
          $existingMentorAR->removeStudentAR($this);
          $existingMentorAR = $aMentorAR;  // aMentorAR == null
          $wasSet = true;
        }
      } 
      else
      {
        if ($existingMentorAR->minimumNumberOfStudentARs() < $existingMentorAR->numberOfStudentARs())
        {
          $existingMentorAR->removeStudentAR($this);
          $aMentorAR->addStudentAR($this);
          $existingMentorAR = $aMentorAR;
          $wasSet = true;
        }
      }
    }
    if ($wasSet)
    {
      $mentorAR = $existingMentorAR;
    }
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    if ($this->mentorAR != null)
    {
      if ($this->mentorAR->numberOfStudentARs() <= 1)
      {
        $this->mentorAR->delete();
      }
      else
      {
        $this->mentorAR->removeStudentAR($this);
      }
    }
  }

}
?>
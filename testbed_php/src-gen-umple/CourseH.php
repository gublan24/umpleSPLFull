<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class CourseH
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseH State Machines
  private static $StatusOn = 1;
  private static $StatusOff = 2;
  private static $StatusOnNull = 3;
  private static $StatusOnRunning = 4;
  private static $StatusOnRunningNull = 5;
  private static $StatusOnRunningPlay = 6;
  private static $StatusOffNull = 7;
  private static $StatusOffIdle = 8;
  private static $StatusOffFull = 9;
  private $status;
  private $statusOn;
  private $statusOnRunning;
  private $statusOff;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->setStatusOn(self::$StatusOnNull);
    $this->setStatusOnRunning(self::$StatusOnRunningNull);
    $this->setStatusOff(self::$StatusOffNull);
    $this->setStatus(self::$StatusOn);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStatusFullName()
  {
    $answer = $this->getStatus();
    if ($this->statusOn != self::$StatusOnNull) { $answer .= "." . $this->getStatusOn(); }
    if ($this->statusOnRunning != self::$StatusOnRunningNull) { $answer .= "." . $this->getStatusOnRunning(); }
    if ($this->statusOff != self::$StatusOffNull) { $answer .= "." . $this->getStatusOff(); }
    return $answer;
  }

  public function getStatus()
  {
    if ($this->status == self::$StatusOn) { return "StatusOn"; }
    elseif ($this->status == self::$StatusOff) { return "StatusOff"; }
    return null;
  }

  public function getStatusOn()
  {
    if ($this->statusOn == self::$StatusOnNull) { return "StatusOnNull"; }
    elseif ($this->statusOn == self::$StatusOnRunning) { return "StatusOnRunning"; }
    return null;
  }

  public function getStatusOnRunning()
  {
    if ($this->statusOnRunning == self::$StatusOnRunningNull) { return "StatusOnRunningNull"; }
    elseif ($this->statusOnRunning == self::$StatusOnRunningPlay) { return "StatusOnRunningPlay"; }
    return null;
  }

  public function getStatusOff()
  {
    if ($this->statusOff == self::$StatusOffNull) { return "StatusOffNull"; }
    elseif ($this->statusOff == self::$StatusOffIdle) { return "StatusOffIdle"; }
    elseif ($this->statusOff == self::$StatusOffFull) { return "StatusOffFull"; }
    return null;
  }

  public function flip()
  {
    $wasEventProcessed = false;
    
    $aStatus = $this->status;
    if ($aStatus == self::$StatusOn)
    {
      $this->exitStatus();
      $this->setStatus(self::$StatusOff);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function fill()
  {
    $wasEventProcessed = false;
    
    $aStatusOff = $this->statusOff;
    if ($aStatusOff == self::$StatusOffIdle)
    {
      $this->exitStatusOff();
      $this->setStatusOff(self::$StatusOffFull);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  private function exitStatus()
  {
    if ($this->status == self::$StatusOn)
    {
      $this->exitStatusOn();
    }
    elseif ($this->status == self::$StatusOff)
    {
      $this->exitStatusOff();
    }
  }

  private function setStatus($aStatus)
  {
    $this->status = $aStatus;

    // entry actions and do activities
    if ($this->status == self::$StatusOn)
    {
      if ($this->statusOn == self::$StatusOnNull) { $this->setStatusOn(self::$StatusOnRunning); }
    }
    elseif ($this->status == self::$StatusOff)
    {
      if ($this->statusOff == self::$StatusOffNull) { $this->setStatusOff(self::$StatusOffIdle); }
    }
  }

  private function exitStatusOn()
  {
    if ($this->statusOn == self::$StatusOnRunning)
    {
      $this->exitStatusOnRunning();
      $this->setStatusOn(self::$StatusOnNull);
    }
  }

  private function setStatusOn($aStatusOn)
  {
    $this->statusOn = $aStatusOn;
    if ($this->status != self::$StatusOn && $aStatusOn != self::$StatusOnNull) { $this->setStatus(self::$StatusOn); }

    // entry actions and do activities
    if ($this->statusOn == self::$StatusOnRunning)
    {
      if ($this->statusOnRunning == self::$StatusOnRunningNull) { $this->setStatusOnRunning(self::$StatusOnRunningPlay); }
    }
  }

  private function exitStatusOnRunning()
  {
    if ($this->statusOnRunning == self::$StatusOnRunningPlay)
    {
      $this->setStatusOnRunning(self::$StatusOnRunningNull);
    }
  }

  private function setStatusOnRunning($aStatusOnRunning)
  {
    $this->statusOnRunning = $aStatusOnRunning;
    if ($this->statusOn != self::$StatusOnRunning && $aStatusOnRunning != self::$StatusOnRunningNull) { $this->setStatusOn(self::$StatusOnRunning); }
  }

  private function exitStatusOff()
  {
    if ($this->statusOff == self::$StatusOffIdle)
    {
      $this->setStatusOff(self::$StatusOffNull);
    }
    elseif ($this->statusOff == self::$StatusOffFull)
    {
      $this->setStatusOff(self::$StatusOffNull);
    }
  }

  private function setStatusOff($aStatusOff)
  {
    $this->statusOff = $aStatusOff;
    if ($this->status != self::$StatusOff && $aStatusOff != self::$StatusOffNull) { $this->setStatus(self::$StatusOff); }
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
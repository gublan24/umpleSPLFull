<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class CourseG
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseG State Machines
  private static $StatusOn = 1;
  private static $StatusOff = 2;
  private static $StatusOnNull = 3;
  private static $StatusOnIdle = 4;
  private static $StatusOnRunning = 5;
  private $status;
  private $statusOn;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->setStatusOn(self::$StatusOnNull);
    $this->setStatus(self::$StatusOn);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStatusFullName()
  {
    $answer = $this->getStatus();
    if ($this->statusOn != self::$StatusOnNull) { $answer .= "." . $this->getStatusOn(); }
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
    elseif ($this->statusOn == self::$StatusOnIdle) { return "StatusOnIdle"; }
    elseif ($this->statusOn == self::$StatusOnRunning) { return "StatusOnRunning"; }
    return null;
  }

  public function turnOff()
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

  public function flip()
  {
    $wasEventProcessed = false;
    
    $aStatus = $this->status;
    $aStatusOn = $this->statusOn;
    if ($aStatus == self::$StatusOff)
    {
      $this->setStatusOn(self::$StatusOnIdle);
      $wasEventProcessed = true;
    }

    
    if ($aStatusOn == self::$StatusOnIdle)
    {
      $this->exitStatusOn();
      $this->setStatusOn(self::$StatusOnRunning);
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
  }

  private function setStatus($aStatus)
  {
    $this->status = $aStatus;

    // entry actions and do activities
    if ($this->status == self::$StatusOn)
    {
      if ($this->statusOn == self::$StatusOnNull) { $this->setStatusOn(self::$StatusOnIdle); }
    }
  }

  private function exitStatusOn()
  {
    if ($this->statusOn == self::$StatusOnIdle)
    {
      $this->setStatusOn(self::$StatusOnNull);
    }
    elseif ($this->statusOn == self::$StatusOnRunning)
    {
      $this->setStatusOn(self::$StatusOnNull);
    }
  }

  private function setStatusOn($aStatusOn)
  {
    $this->statusOn = $aStatusOn;
    if ($this->status != self::$StatusOn && $aStatusOn != self::$StatusOnNull) { $this->setStatus(self::$StatusOn); }
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class CourseF
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseF State Machines
  private static $StatusOff = 1;
  private static $StatusOn = 2;
  private static $StatusOnMotorIdleNull = 3;
  private static $StatusOnMotorIdleMotorIdle = 4;
  private static $StatusOnMotorIdleMotorRunning = 5;
  private static $StatusOnFanIdleNull = 6;
  private static $StatusOnFanIdleFanIdle = 7;
  private static $StatusOnFanIdleFanRunning = 8;
  private $status;
  private $statusOnMotorIdle;
  private $statusOnFanIdle;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->setStatusOnMotorIdle(self::$StatusOnMotorIdleNull);
    $this->setStatusOnFanIdle(self::$StatusOnFanIdleNull);
    $this->setStatus(self::$StatusOff);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStatusFullName()
  {
    $answer = $this->getStatus();
    if ($this->statusOnMotorIdle != self::$StatusOnMotorIdleNull) { $answer .= "." . $this->getStatusOnMotorIdle(); }
    if ($this->statusOnFanIdle != self::$StatusOnFanIdleNull) { $answer .= "." . $this->getStatusOnFanIdle(); }
    return $answer;
  }

  public function getStatus()
  {
    if ($this->status == self::$StatusOff) { return "StatusOff"; }
    elseif ($this->status == self::$StatusOn) { return "StatusOn"; }
    return null;
  }

  public function getStatusOnMotorIdle()
  {
    if ($this->statusOnMotorIdle == self::$StatusOnMotorIdleNull) { return "StatusOnMotorIdleNull"; }
    elseif ($this->statusOnMotorIdle == self::$StatusOnMotorIdleMotorIdle) { return "StatusOnMotorIdleMotorIdle"; }
    elseif ($this->statusOnMotorIdle == self::$StatusOnMotorIdleMotorRunning) { return "StatusOnMotorIdleMotorRunning"; }
    return null;
  }

  public function getStatusOnFanIdle()
  {
    if ($this->statusOnFanIdle == self::$StatusOnFanIdleNull) { return "StatusOnFanIdleNull"; }
    elseif ($this->statusOnFanIdle == self::$StatusOnFanIdleFanIdle) { return "StatusOnFanIdleFanIdle"; }
    elseif ($this->statusOnFanIdle == self::$StatusOnFanIdleFanRunning) { return "StatusOnFanIdleFanRunning"; }
    return null;
  }

  public function turnOn()
  {
    $wasEventProcessed = false;
    
    $aStatus = $this->status;
    if ($aStatus == self::$StatusOff)
    {
      $this->setStatus(self::$StatusOn);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
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
    
    $aStatusOnMotorIdle = $this->statusOnMotorIdle;
    if ($aStatusOnMotorIdle == self::$StatusOnMotorIdleMotorIdle)
    {
      $this->exitStatusOnMotorIdle();
      $this->setStatusOnMotorIdle(self::$StatusOnMotorIdleMotorRunning);
      $wasEventProcessed = true;
    }
    elseif ($aStatusOnMotorIdle == self::$StatusOnMotorIdleMotorRunning)
    {
      $this->exitStatusOnMotorIdle();
      $this->setStatusOnMotorIdle(self::$StatusOnMotorIdleMotorIdle);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function flup()
  {
    $wasEventProcessed = false;
    
    $aStatusOnMotorIdle = $this->statusOnMotorIdle;
    if ($aStatusOnMotorIdle == self::$StatusOnMotorIdleMotorIdle)
    {
      $this->exitStatusOnMotorIdle();
      $this->setStatus(self::$StatusOff);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function flop()
  {
    $wasEventProcessed = false;
    
    $aStatusOnFanIdle = $this->statusOnFanIdle;
    if ($aStatusOnFanIdle == self::$StatusOnFanIdleFanIdle)
    {
      $this->exitStatusOnFanIdle();
      $this->setStatusOnFanIdle(self::$StatusOnFanIdleFanRunning);
      $wasEventProcessed = true;
    }
    elseif ($aStatusOnFanIdle == self::$StatusOnFanIdleFanRunning)
    {
      $this->exitStatusOnFanIdle();
      $this->setStatusOnFanIdle(self::$StatusOnFanIdleFanIdle);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  private function exitStatus()
  {
    if ($this->status == self::$StatusOn)
    {
      $this->exitStatusOnMotorIdle();
      $this->exitStatusOnFanIdle();
    }
  }

  private function setStatus($aStatus)
  {
    $this->status = $aStatus;

    // entry actions and do activities
    if ($this->status == self::$StatusOn)
    {
      if ($this->statusOnMotorIdle == self::$StatusOnMotorIdleNull) { $this->setStatusOnMotorIdle(self::$StatusOnMotorIdleMotorIdle); }
      if ($this->statusOnFanIdle == self::$StatusOnFanIdleNull) { $this->setStatusOnFanIdle(self::$StatusOnFanIdleFanIdle); }
    }
  }

  private function exitStatusOnMotorIdle()
  {
    if ($this->statusOnMotorIdle == self::$StatusOnMotorIdleMotorIdle)
    {
      $this->setStatusOnMotorIdle(self::$StatusOnMotorIdleNull);
    }
    elseif ($this->statusOnMotorIdle == self::$StatusOnMotorIdleMotorRunning)
    {
      $this->setStatusOnMotorIdle(self::$StatusOnMotorIdleNull);
    }
  }

  private function setStatusOnMotorIdle($aStatusOnMotorIdle)
  {
    $this->statusOnMotorIdle = $aStatusOnMotorIdle;
    if ($this->status != self::$StatusOn && $aStatusOnMotorIdle != self::$StatusOnMotorIdleNull) { $this->setStatus(self::$StatusOn); }
  }

  private function exitStatusOnFanIdle()
  {
    if ($this->statusOnFanIdle == self::$StatusOnFanIdleFanIdle)
    {
      $this->setStatusOnFanIdle(self::$StatusOnFanIdleNull);
    }
    elseif ($this->statusOnFanIdle == self::$StatusOnFanIdleFanRunning)
    {
      $this->setStatusOnFanIdle(self::$StatusOnFanIdleNull);
    }
  }

  private function setStatusOnFanIdle($aStatusOnFanIdle)
  {
    $this->statusOnFanIdle = $aStatusOnFanIdle;
    if ($this->status != self::$StatusOn && $aStatusOnFanIdle != self::$StatusOnFanIdleNull) { $this->setStatus(self::$StatusOn); }
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class CourseL
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseL Attributes
  private $logs;

  //CourseL State Machines
  private static $StatusOn = 1;
  private static $StatusFinal = 2;
  private static $StatusOnMotorIdleNull = 3;
  private static $StatusOnMotorIdleMotorIdle = 4;
  private static $StatusOnFanIdleNull = 5;
  private static $StatusOnFanIdleFanIdle = 6;
  private $status;
  private $statusOnMotorIdle;
  private $statusOnFanIdle;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->logs = array();
    $this->setStatusOnMotorIdle(self::$StatusOnMotorIdleNull);
    $this->setStatusOnFanIdle(self::$StatusOnFanIdleNull);
    $this->setStatus(self::$StatusOn);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function addLog($aLog)
  {
    $wasAdded = false;
    $this->logs[] = $aLog;
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeLog($aLog)
  {
    $wasRemoved = false;
    unset($this->logs[$this->indexOfLog($aLog)]);
    $this->logs = array_values($this->logs);
    $wasRemoved = true;
    return $wasRemoved;
  }

  public function getLog($index)
  {
    $aLog = $this->logs[$index];
    return $aLog;
  }

  public function getLogs()
  {
    $newLogs = $this->logs;
    return $newLogs;
  }

  public function numberOfLogs()
  {
    $number = count($this->logs);
    return $number;
  }

  public function hasLogs()
  {
    $has = logs.size() > 0;
    return $has;
  }

  public function indexOfLog($aLog)
  {
    $rawAnswer = array_search($aLog,$this->logs);
    $index = $rawAnswer == null && $rawAnswer !== 0 ? -1 : $rawAnswer;
    return $index;
  }

  public function getStatusFullName()
  {
    $answer = $this->getStatus();
    if ($this->statusOnMotorIdle != self::$StatusOnMotorIdleNull) { $answer .= "." . $this->getStatusOnMotorIdle(); }
    if ($this->statusOnFanIdle != self::$StatusOnFanIdleNull) { $answer .= "." . $this->getStatusOnFanIdle(); }
    return $answer;
  }

  public function getStatus()
  {
    if ($this->status == self::$StatusOn) { return "StatusOn"; }
    elseif ($this->status == self::$StatusFinal) { return "StatusFinal"; }
    return null;
  }

  public function getStatusOnMotorIdle()
  {
    if ($this->statusOnMotorIdle == self::$StatusOnMotorIdleNull) { return "StatusOnMotorIdleNull"; }
    elseif ($this->statusOnMotorIdle == self::$StatusOnMotorIdleMotorIdle) { return "StatusOnMotorIdleMotorIdle"; }
    return null;
  }

  public function getStatusOnFanIdle()
  {
    if ($this->statusOnFanIdle == self::$StatusOnFanIdleNull) { return "StatusOnFanIdleNull"; }
    elseif ($this->statusOnFanIdle == self::$StatusOnFanIdleFanIdle) { return "StatusOnFanIdleFanIdle"; }
    return null;
  }

  public function flip()
  {
    $wasEventProcessed = false;
    
    $aStatusOnMotorIdle = $this->statusOnMotorIdle;
    if ($aStatusOnMotorIdle == self::$StatusOnMotorIdleMotorIdle)
    {
      $this->exitStatusOnMotorIdle();
      $this->setStatus(self::$StatusFinal);
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
      $this->setStatus(self::$StatusFinal);
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
    elseif ($this->status == self::$StatusFinal)
    {
      $this->delete();
    }
  }

  private function exitStatusOnMotorIdle()
  {
    if ($this->statusOnMotorIdle == self::$StatusOnMotorIdleMotorIdle)
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
  {
    // line 123 "../../../../src/TestHarnessStateMachinePhp.ump"
    $this->addLog("deleted");
    // END OF UMPLE AFTER INJECTION
  }

}
?>
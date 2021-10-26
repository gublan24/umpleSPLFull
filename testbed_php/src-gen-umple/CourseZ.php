<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class CourseZ
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseZ Attributes
  private $logFirstActive;
  private $logSecondActive;

  //CourseZ State Machines
  private static $StateMachine1TopLevel = 1;
  private static $StateMachine1TopLevelNull = 2;
  private static $StateMachine1TopLevelThread1 = 3;
  private $stateMachine1;
  private $stateMachine1TopLevel;

  private static $StateMachine2TopLevel = 1;
  private static $StateMachine2TopLevelNull = 2;
  private static $StateMachine2TopLevelThread1 = 3;
  private $stateMachine2;
  private $stateMachine2TopLevel;

  //CourseZ Do Activity Threads
  private $doActivityStateMachine1TopLevelThread1Thread = null;
  private $doActivityStateMachine2TopLevelThread1Thread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->logFirstActive = "";
    $this->logSecondActive = "";
    $this->setStateMachine1TopLevel(self::$StateMachine1TopLevelNull);
    $this->setStateMachine1(self::$StateMachine1TopLevel);
    $this->setStateMachine2TopLevel(self::$StateMachine2TopLevelNull);
    $this->setStateMachine2(self::$StateMachine2TopLevel);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setLogFirstActive($aLogFirstActive)
  {
    $wasSet = false;
    $this->logFirstActive = $aLogFirstActive;
    $wasSet = true;
    return $wasSet;
  }

  public function setLogSecondActive($aLogSecondActive)
  {
    $wasSet = false;
    $this->logSecondActive = $aLogSecondActive;
    $wasSet = true;
    return $wasSet;
  }

  public function getLogFirstActive()
  {
    return $this->logFirstActive;
  }

  public function getLogSecondActive()
  {
    return $this->logSecondActive;
  }

  public function getStateMachine1FullName()
  {
    $answer = $this->getStateMachine1();
    if ($this->stateMachine1TopLevel != self::$StateMachine1TopLevelNull) { $answer .= "." . $this->getStateMachine1TopLevel(); }
    return $answer;
  }

  public function getStateMachine2FullName()
  {
    $answer = $this->getStateMachine2();
    if ($this->stateMachine2TopLevel != self::$StateMachine2TopLevelNull) { $answer .= "." . $this->getStateMachine2TopLevel(); }
    return $answer;
  }

  public function getStateMachine1()
  {
    if ($this->stateMachine1 == self::$StateMachine1TopLevel) { return "StateMachine1TopLevel"; }
    return null;
  }

  public function getStateMachine2()
  {
    if ($this->stateMachine2 == self::$StateMachine2TopLevel) { return "StateMachine2TopLevel"; }
    return null;
  }

  public function getStateMachine1TopLevel()
  {
    if ($this->stateMachine1TopLevel == self::$StateMachine1TopLevelNull) { return "StateMachine1TopLevelNull"; }
    elseif ($this->stateMachine1TopLevel == self::$StateMachine1TopLevelThread1) { return "StateMachine1TopLevelThread1"; }
    return null;
  }

  public function getStateMachine2TopLevel()
  {
    if ($this->stateMachine2TopLevel == self::$StateMachine2TopLevelNull) { return "StateMachine2TopLevelNull"; }
    elseif ($this->stateMachine2TopLevel == self::$StateMachine2TopLevelThread1) { return "StateMachine2TopLevelThread1"; }
    return null;
  }

  private function exitStateMachine1()
  {
    if ($this->stateMachine1 == self::$StateMachine1TopLevel)
    {
      $this->exitStateMachine1TopLevel();
    }
  }

  private function setStateMachine1($aStateMachine1)
  {
    $this->stateMachine1 = $aStateMachine1;

    // entry actions and do activities
    if ($this->stateMachine1 == self::$StateMachine1TopLevel)
    {
      if ($this->stateMachine1TopLevel == self::$StateMachine1TopLevelNull) { $this->setStateMachine1TopLevel(self::$StateMachine1TopLevelThread1); }
    }
  }

  private function exitStateMachine2()
  {
    if ($this->stateMachine2 == self::$StateMachine2TopLevel)
    {
      $this->exitStateMachine2TopLevel();
    }
  }

  private function setStateMachine2($aStateMachine2)
  {
    $this->stateMachine2 = $aStateMachine2;

    // entry actions and do activities
    if ($this->stateMachine2 == self::$StateMachine2TopLevel)
    {
      if ($this->stateMachine2TopLevel == self::$StateMachine2TopLevelNull) { $this->setStateMachine2TopLevel(self::$StateMachine2TopLevelThread1); }
    }
  }

  private function exitStateMachine1TopLevel()
  {
    if ($this->stateMachine1TopLevel == self::$StateMachine1TopLevelThread1)
    {
      $this->setStateMachine1TopLevel(self::$StateMachine1TopLevelNull);
    }
  }

  private function setStateMachine1TopLevel($aStateMachine1TopLevel)
  {
    $this->stateMachine1TopLevel = $aStateMachine1TopLevel;
    if ($this->stateMachine1 != self::$StateMachine1TopLevel && $aStateMachine1TopLevel != self::$StateMachine1TopLevelNull) { $this->setStateMachine1(self::$StateMachine1TopLevel); }

    // entry actions and do activities
    if ($this->stateMachine1TopLevel == self::$StateMachine1TopLevelThread1)
    {
      logFirstActive = "First active";
    }
  }

  private function exitStateMachine2TopLevel()
  {
    if ($this->stateMachine2TopLevel == self::$StateMachine2TopLevelThread1)
    {
      $this->setStateMachine2TopLevel(self::$StateMachine2TopLevelNull);
    }
  }

  private function setStateMachine2TopLevel($aStateMachine2TopLevel)
  {
    $this->stateMachine2TopLevel = $aStateMachine2TopLevel;
    if ($this->stateMachine2 != self::$StateMachine2TopLevel && $aStateMachine2TopLevel != self::$StateMachine2TopLevelNull) { $this->setStateMachine2(self::$StateMachine2TopLevel); }

    // entry actions and do activities
    if ($this->stateMachine2TopLevel == self::$StateMachine2TopLevelThread1)
    {
      logSecondActive = "Second active";
    }
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
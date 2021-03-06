<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class CourseJ
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseJ State Machines
  private static $StatusS1 = 1;
  private static $StatusS2 = 2;
  private static $StatusS3 = 3;
  private static $StatusS1Null = 4;
  private static $StatusS1S1A = 5;
  private static $StatusS1S1B = 6;
  private static $StatusS1S1BNull = 7;
  private static $StatusS1S1BS1B1 = 8;
  private static $StatusS1S1BS1B2 = 9;
  private static $StatusS2Null = 10;
  private static $StatusS2S2A = 11;
  private static $StatusS2S2B = 12;
  private static $StatusS2S2C = 13;
  private $status;
  private $statusS1;
  private $statusS1S1B;
  private $statusS2;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->setStatusS1(self::$StatusS1Null);
    $this->setStatusS1S1B(self::$StatusS1S1BNull);
    $this->setStatusS2(self::$StatusS2Null);
    $this->setStatus(self::$StatusS1);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStatusFullName()
  {
    $answer = $this->getStatus();
    if ($this->statusS1 != self::$StatusS1Null) { $answer .= "." . $this->getStatusS1(); }
    if ($this->statusS1S1B != self::$StatusS1S1BNull) { $answer .= "." . $this->getStatusS1S1B(); }
    if ($this->statusS2 != self::$StatusS2Null) { $answer .= "." . $this->getStatusS2(); }
    return $answer;
  }

  public function getStatus()
  {
    if ($this->status == self::$StatusS1) { return "StatusS1"; }
    elseif ($this->status == self::$StatusS2) { return "StatusS2"; }
    elseif ($this->status == self::$StatusS3) { return "StatusS3"; }
    return null;
  }

  public function getStatusS1()
  {
    if ($this->statusS1 == self::$StatusS1Null) { return "StatusS1Null"; }
    elseif ($this->statusS1 == self::$StatusS1S1A) { return "StatusS1S1A"; }
    elseif ($this->statusS1 == self::$StatusS1S1B) { return "StatusS1S1B"; }
    return null;
  }

  public function getStatusS1S1B()
  {
    if ($this->statusS1S1B == self::$StatusS1S1BNull) { return "StatusS1S1BNull"; }
    elseif ($this->statusS1S1B == self::$StatusS1S1BS1B1) { return "StatusS1S1BS1B1"; }
    elseif ($this->statusS1S1B == self::$StatusS1S1BS1B2) { return "StatusS1S1BS1B2"; }
    return null;
  }

  public function getStatusS2()
  {
    if ($this->statusS2 == self::$StatusS2Null) { return "StatusS2Null"; }
    elseif ($this->statusS2 == self::$StatusS2S2A) { return "StatusS2S2A"; }
    elseif ($this->statusS2 == self::$StatusS2S2B) { return "StatusS2S2B"; }
    elseif ($this->statusS2 == self::$StatusS2S2C) { return "StatusS2S2C"; }
    return null;
  }

  public function e2()
  {
    $wasEventProcessed = false;
    
    $aStatus = $this->status;
    $aStatusS2 = $this->statusS2;
    if ($aStatus == self::$StatusS1)
    {
      $this->exitStatus();
      $this->setStatusS2(self::$StatusS2S2C);
      $wasEventProcessed = true;
    }
    elseif ($aStatus == self::$StatusS3)
    {
      $this->setStatus(self::$StatusS2);
      $wasEventProcessed = true;
    }

    
    if ($aStatusS2 == self::$StatusS2S2C)
    {
      $this->exitStatusS2();
      $this->setStatus(self::$StatusS3);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function e1()
  {
    $wasEventProcessed = false;
    
    $aStatus = $this->status;
    $aStatusS1 = $this->statusS1;
    $aStatusS1S1B = $this->statusS1S1B;
    $aStatusS2 = $this->statusS2;
    if ($aStatus == self::$StatusS3)
    {
      $this->setStatusS1(self::$StatusS1S1A);
      $wasEventProcessed = true;
    }

    
    if ($aStatusS1 == self::$StatusS1S1A)
    {
      $this->exitStatusS1();
      $this->setStatus(self::$StatusS2);
      $wasEventProcessed = true;
    }

    
    if ($aStatusS1S1B == self::$StatusS1S1BS1B2)
    {
      $this->exitStatusS1S1B();
      $this->setStatus(self::$StatusS3);
      $wasEventProcessed = true;
    }

    
    if ($aStatusS2 == self::$StatusS2S2A)
    {
      $this->exitStatusS2();
      $this->setStatus(self::$StatusS2);
      $wasEventProcessed = true;
    }
    elseif ($aStatusS2 == self::$StatusS2S2C)
    {
      $this->exitStatusS2();
      $this->setStatusS2(self::$StatusS2S2B);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function e3()
  {
    $wasEventProcessed = false;
    
    $aStatus = $this->status;
    $aStatusS1S1B = $this->statusS1S1B;
    $aStatusS2 = $this->statusS2;
    if ($aStatus == self::$StatusS3)
    {
      $this->setStatusS2(self::$StatusS2S2C);
      $wasEventProcessed = true;
    }

    
    if ($aStatusS1S1B == self::$StatusS1S1BS1B1)
    {
      $this->exitStatusS1S1B();
      $this->setStatusS2(self::$StatusS2S2B);
      $wasEventProcessed = true;
    }
    elseif ($aStatusS1S1B == self::$StatusS1S1BS1B2)
    {
      $this->exitStatusS1S1B();
      $this->setStatusS1(self::$StatusS1S1A);
      $wasEventProcessed = true;
    }

    
    if ($aStatusS2 == self::$StatusS2S2A)
    {
      $this->exitStatusS2();
      $this->setStatusS1S1B(self::$StatusS1S1BS1B1);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function e5()
  {
    $wasEventProcessed = false;
    
    $aStatus = $this->status;
    $aStatusS1 = $this->statusS1;
    $aStatusS2 = $this->statusS2;
    if ($aStatus == self::$StatusS3)
    {
      $this->setStatus(self::$StatusS1);
      $wasEventProcessed = true;
    }

    
    if ($aStatusS1 == self::$StatusS1S1B)
    {
      $this->exitStatusS1();
      $this->setStatusS1(self::$StatusS1S1A);
      $wasEventProcessed = true;
    }

    
    if ($aStatusS2 == self::$StatusS2S2C)
    {
      $this->exitStatusS2();
      $this->setStatus(self::$StatusS3);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function e4()
  {
    $wasEventProcessed = false;
    
    $aStatusS1S1B = $this->statusS1S1B;
    $aStatusS2 = $this->statusS2;
    if ($aStatusS1S1B == self::$StatusS1S1BS1B1)
    {
      $this->exitStatusS1S1B();
      $this->setStatusS1S1B(self::$StatusS1S1BS1B2);
      $wasEventProcessed = true;
    }
    elseif ($aStatusS1S1B == self::$StatusS1S1BS1B2)
    {
      $this->exitStatusS1S1B();
      $this->setStatusS1S1B(self::$StatusS1S1BS1B1);
      $wasEventProcessed = true;
    }

    
    if ($aStatusS2 == self::$StatusS2S2A)
    {
      $this->exitStatusS2();
      $this->setStatus(self::$StatusS1);
      $wasEventProcessed = true;
    }
    elseif ($aStatusS2 == self::$StatusS2S2B)
    {
      $this->exitStatusS2();
      $this->setStatusS2(self::$StatusS2S2A);
      $wasEventProcessed = true;
    }
    elseif ($aStatusS2 == self::$StatusS2S2C)
    {
      $this->exitStatusS2();
      $this->setStatusS2(self::$StatusS2S2B);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  private function exitStatus()
  {
    if ($this->status == self::$StatusS1)
    {
      $this->exitStatusS1();
    }
    elseif ($this->status == self::$StatusS2)
    {
      $this->exitStatusS2();
    }
  }

  private function setStatus($aStatus)
  {
    $this->status = $aStatus;

    // entry actions and do activities
    if ($this->status == self::$StatusS1)
    {
      if ($this->statusS1 == self::$StatusS1Null) { $this->setStatusS1(self::$StatusS1S1A); }
    }
    elseif ($this->status == self::$StatusS2)
    {
      if ($this->statusS2 == self::$StatusS2Null) { $this->setStatusS2(self::$StatusS2S2A); }
    }
  }

  private function exitStatusS1()
  {
    if ($this->statusS1 == self::$StatusS1S1A)
    {
      $this->setStatusS1(self::$StatusS1Null);
    }
    elseif ($this->statusS1 == self::$StatusS1S1B)
    {
      $this->exitStatusS1S1B();
      $this->setStatusS1(self::$StatusS1Null);
    }
  }

  private function setStatusS1($aStatusS1)
  {
    $this->statusS1 = $aStatusS1;
    if ($this->status != self::$StatusS1 && $aStatusS1 != self::$StatusS1Null) { $this->setStatus(self::$StatusS1); }

    // entry actions and do activities
    if ($this->statusS1 == self::$StatusS1S1B)
    {
      if ($this->statusS1S1B == self::$StatusS1S1BNull) { $this->setStatusS1S1B(self::$StatusS1S1BS1B1); }
    }
  }

  private function exitStatusS1S1B()
  {
    if ($this->statusS1S1B == self::$StatusS1S1BS1B1)
    {
      $this->setStatusS1S1B(self::$StatusS1S1BNull);
    }
    elseif ($this->statusS1S1B == self::$StatusS1S1BS1B2)
    {
      $this->setStatusS1S1B(self::$StatusS1S1BNull);
    }
  }

  private function setStatusS1S1B($aStatusS1S1B)
  {
    $this->statusS1S1B = $aStatusS1S1B;
    if ($this->statusS1 != self::$StatusS1S1B && $aStatusS1S1B != self::$StatusS1S1BNull) { $this->setStatusS1(self::$StatusS1S1B); }
  }

  private function exitStatusS2()
  {
    if ($this->statusS2 == self::$StatusS2S2A)
    {
      $this->setStatusS2(self::$StatusS2Null);
    }
    elseif ($this->statusS2 == self::$StatusS2S2B)
    {
      $this->setStatusS2(self::$StatusS2Null);
    }
    elseif ($this->statusS2 == self::$StatusS2S2C)
    {
      $this->setStatusS2(self::$StatusS2Null);
    }
  }

  private function setStatusS2($aStatusS2)
  {
    $this->statusS2 = $aStatusS2;
    if ($this->status != self::$StatusS2 && $aStatusS2 != self::$StatusS2Null) { $this->setStatus(self::$StatusS2); }
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
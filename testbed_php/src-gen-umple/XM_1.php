<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class XM_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //XM_1 Attributes
  private $num;

  //XM_1 Associations
  private $ym_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->ym_1 = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setNum($aNum)
  {
    $wasSet = false;
    $this->num = $aNum;
    $wasSet = true;
    return $wasSet;
  }

  public function getNum()
  {
    return $this->num;
  }

  public function getYm_1_index($index)
  {
    $aYm_1 = $this->ym_1[$index];
    return $aYm_1;
  }

  public function getYm_1()
  {
    $newYm_1 = $this->ym_1;
    return $newYm_1;
  }

  public function numberOfYm_1()
  {
    $number = count($this->ym_1);
    return $number;
  }

  public function hasYm_1()
  {
    $has = $this->numberOfYm_1() > 0;
    return $has;
  }

  public function indexOfYm_1($aYm_1)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->ym_1 as $ym_1)
    {
      if ($ym_1->equals($aYm_1))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfYm_1Valid()
  {
    $isValid = $this->numberOfYm_1() >= self::minimumNumberOfYm_1() && $this->numberOfYm_1() <= self::maximumNumberOfYm_1();
    return $isValid;
  }

  public static function requiredNumberOfYm_1()
  {
    return 3;
  }

  public static function minimumNumberOfYm_1()
  {
    return 3;
  }

  public static function maximumNumberOfYm_1()
  {
    return 3;
  }

  public function addYm_1Via()
  {
    if ($this->numberOfYm_1() >= self::maximumNumberOfYm_1())
    {
      return null;
    }
    else
    {
      return new YM_1($this);
    }
  }

  public function addYm_1($aYm_1)
  {
    $wasAdded = false;
    if ($this->indexOfYm_1($aYm_1) !== -1) { return false; }
    if ($this->numberOfYm_1() >= self::maximumNumberOfYm_1())
    {
      return $wasAdded;
    }

    $existingXVar = $aYm_1->getXVar();
    $isNewXVar = $existingXVar != null && $this !== $existingXVar;

    if ($isNewXVar && $existingXVar->numberOfYm_1() <= self::minimumNumberOfYm_1())
    {
      return $wasAdded;
    }

    if ($isNewXVar)
    {
      $aYm_1->setXVar($this);
    }
    else
    {
      $this->ym_1[] = $aYm_1;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeYm_1($aYm_1)
  {
    $wasRemoved = false;
    //Unable to remove aYm_1, as it must always have a xVar
    if ($this === $aYm_1->getXVar())
    {
      return $wasRemoved;
    }

    //xVar already at minimum (3)
    if ($this->numberOfYm_1() <= self::minimumNumberOfYm_1())
    {
      return $wasRemoved;
    }

    unset($this->ym_1[$this->indexOfYm_1($aYm_1)]);
    $this->ym_1 = array_values($this->ym_1);
    $wasRemoved = true;
    return $wasRemoved;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->ym_1) > 0)
    {
      $aYm_1 = $this->ym_1[count($this->ym_1) - 1];
      $aYm_1->delete();
      unset($this->ym_1[$this->indexOfYm_1($aYm_1)]);
      $this->ym_1 = array_values($this->ym_1);
    }
    
  }

}
?>
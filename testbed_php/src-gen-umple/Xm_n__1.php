<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Xm_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xm_n__1 Attributes
  private $num;

  //Xm_n__1 Associations
  private $ym_n__1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->ym_n__1 = array();
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

  public function getYm_n__1_index($index)
  {
    $aYm_n__1 = $this->ym_n__1[$index];
    return $aYm_n__1;
  }

  public function getYm_n__1()
  {
    $newYm_n__1 = $this->ym_n__1;
    return $newYm_n__1;
  }

  public function numberOfYm_n__1()
  {
    $number = count($this->ym_n__1);
    return $number;
  }

  public function hasYm_n__1()
  {
    $has = $this->numberOfYm_n__1() > 0;
    return $has;
  }

  public function indexOfYm_n__1($aYm_n__1)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->ym_n__1 as $ym_n__1)
    {
      if ($ym_n__1->equals($aYm_n__1))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfYm_n__1Valid()
  {
    $isValid = $this->numberOfYm_n__1() >= self::minimumNumberOfYm_n__1() && $this->numberOfYm_n__1() <= self::maximumNumberOfYm_n__1();
    return $isValid;
  }

  public static function minimumNumberOfYm_n__1()
  {
    return 2;
  }

  public static function maximumNumberOfYm_n__1()
  {
    return 3;
  }

  public function addYm_n__1Via()
  {
    if ($this->numberOfYm_n__1() >= self::maximumNumberOfYm_n__1())
    {
      return null;
    }
    else
    {
      return new Ym_n__1($this);
    }
  }

  public function addYm_n__1($aYm_n__1)
  {
    $wasAdded = false;
    if ($this->indexOfYm_n__1($aYm_n__1) !== -1) { return false; }
    if ($this->numberOfYm_n__1() >= self::maximumNumberOfYm_n__1())
    {
      return $wasAdded;
    }

    $existingXVar = $aYm_n__1->getXVar();
    $isNewXVar = $existingXVar != null && $this !== $existingXVar;

    if ($isNewXVar && $existingXVar->numberOfYm_n__1() <= self::minimumNumberOfYm_n__1())
    {
      return $wasAdded;
    }

    if ($isNewXVar)
    {
      $aYm_n__1->setXVar($this);
    }
    else
    {
      $this->ym_n__1[] = $aYm_n__1;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeYm_n__1($aYm_n__1)
  {
    $wasRemoved = false;
    //Unable to remove aYm_n__1, as it must always have a xVar
    if ($this === $aYm_n__1->getXVar())
    {
      return $wasRemoved;
    }

    //xVar already at minimum (2)
    if ($this->numberOfYm_n__1() <= self::minimumNumberOfYm_n__1())
    {
      return $wasRemoved;
    }

    unset($this->ym_n__1[$this->indexOfYm_n__1($aYm_n__1)]);
    $this->ym_n__1 = array_values($this->ym_n__1);
    $wasRemoved = true;
    return $wasRemoved;
  }

  public function addYm_n__1At($aYm_n__1, $index)
  {  
    $wasAdded = false;
    if($this->addYm_n__1($aYm_n__1))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfYm_n__1()) { $index = $this->numberOfYm_n__1() - 1; }
      array_splice($this->ym_n__1, $this->indexOfYm_n__1($aYm_n__1), 1);
      array_splice($this->ym_n__1, $index, 0, array($aYm_n__1));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveYm_n__1At($aYm_n__1, $index)
  {
    $wasAdded = false;
    if($this->indexOfYm_n__1($aYm_n__1) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfYm_n__1()) { $index = $this->numberOfYm_n__1() - 1; }
      array_splice($this->ym_n__1, $this->indexOfYm_n__1($aYm_n__1), 1);
      array_splice($this->ym_n__1, $index, 0, array($aYm_n__1));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addYm_n__1At($aYm_n__1, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->ym_n__1) > 0)
    {
      $aYm_n__1 = $this->ym_n__1[count($this->ym_n__1) - 1];
      $aYm_n__1->delete();
      unset($this->ym_n__1[$this->indexOfYm_n__1($aYm_n__1)]);
      $this->ym_n__1 = array_values($this->ym_n__1);
    }
    
  }

}
?>
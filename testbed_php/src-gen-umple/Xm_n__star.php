<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Xm_n__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xm_n__star Attributes
  private $num;

  //Xm_n__star Associations
  private $ym_n__star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum, $allYm_n__star)
  {
    $this->num = $aNum;
    $this->ym_n__star = array();
    $didAddYm_n__star = $this->setYm_n__star($allYm_n__star);
    if (!$didAddYm_n__star)
    {
      throw new Exception("Unable to create Xm_n__star, must have 2 to 3 ym_n__star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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

  public function getYm_n__star_index($index)
  {
    $aYm_n__star = $this->ym_n__star[$index];
    return $aYm_n__star;
  }

  public function getYm_n__star()
  {
    $newYm_n__star = $this->ym_n__star;
    return $newYm_n__star;
  }

  public function numberOfYm_n__star()
  {
    $number = count($this->ym_n__star);
    return $number;
  }

  public function hasYm_n__star()
  {
    $has = $this->numberOfYm_n__star() > 0;
    return $has;
  }

  public function indexOfYm_n__star($aYm_n__star)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->ym_n__star as $ym_n__star)
    {
      if ($ym_n__star->equals($aYm_n__star))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfYm_n__starValid()
  {
    $isValid = $this->numberOfYm_n__star() >= self::minimumNumberOfYm_n__star() && $this->numberOfYm_n__star() <= self::maximumNumberOfYm_n__star();
    return $isValid;
  }

  public static function minimumNumberOfYm_n__star()
  {
    return 2;
  }

  public static function maximumNumberOfYm_n__star()
  {
    return 3;
  }

  public function addYm_n__star($aYm_n__star)
  {
    $wasAdded = false;
    if ($this->indexOfYm_n__star($aYm_n__star) !== -1) { return false; }
    if ($this->numberOfYm_n__star() >= self::maximumNumberOfYm_n__star())
    {
      return $wasAdded;
    }

    $this->ym_n__star[] = $aYm_n__star;
    if ($aYm_n__star->indexOfXVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aYm_n__star->addXVar($this);
      if (!$wasAdded)
      {
        array_pop($this->ym_n__star);
      }
    }
    return $wasAdded;
  }

  public function removeYm_n__star($aYm_n__star)
  {
    $wasRemoved = false;
    if ($this->indexOfYm_n__star($aYm_n__star) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfYm_n__star() <= self::minimumNumberOfYm_n__star())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfYm_n__star($aYm_n__star);
    unset($this->ym_n__star[$oldIndex]);
    if ($aYm_n__star->indexOfXVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aYm_n__star->removeXVar($this);
      if (!$wasRemoved)
      {
        $this->ym_n__star[$oldIndex] = $aYm_n__star;
        ksort($this->ym_n__star);
      }
    }
    $this->ym_n__star = array_values($this->ym_n__star);
    return $wasRemoved;
  }

  public function setYm_n__star($newYm_n__star)
  {
    $wasSet = false;
    $verifiedYm_n__star = array();
    foreach ($newYm_n__star as $aYm_n__star)
    {
      if (array_search($aYm_n__star,$verifiedYm_n__star) !== false)
      {
        continue;
      }
      $verifiedYm_n__star[] = $aYm_n__star;
    }

    if (count($verifiedYm_n__star) != count($newYm_n__star) || count($verifiedYm_n__star) < self::minimumNumberOfYm_n__star() || count($verifiedYm_n__star) > self::maximumNumberOfYm_n__star())
    {
      return $wasSet;
    }

    $oldYm_n__star = $this->ym_n__star;
    $this->ym_n__star = array();
    foreach ($verifiedYm_n__star as $aNewYm_n__star)
    {
      $this->ym_n__star[] = $aNewYm_n__star;
      $removeIndex = array_search($aNewYm_n__star,$oldYm_n__star);
      if ($removeIndex !== false)
      {
        unset($oldYm_n__star[$removeIndex]);
        $oldYm_n__star = array_values($oldYm_n__star);
      }
      else
      {
        $aNewYm_n__star->addXVar($this);
      }
    }

    foreach ($oldYm_n__star as $anOldYm_n__star)
    {
      $anOldYm_n__star->removeXVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function addYm_n__starAt($aYm_n__star, $index)
  {  
    $wasAdded = false;
    if($this->addYm_n__star($aYm_n__star))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfYm_n__star()) { $index = $this->numberOfYm_n__star() - 1; }
      array_splice($this->ym_n__star, $this->indexOfYm_n__star($aYm_n__star), 1);
      array_splice($this->ym_n__star, $index, 0, array($aYm_n__star));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveYm_n__starAt($aYm_n__star, $index)
  {
    $wasAdded = false;
    if($this->indexOfYm_n__star($aYm_n__star) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfYm_n__star()) { $index = $this->numberOfYm_n__star() - 1; }
      array_splice($this->ym_n__star, $this->indexOfYm_n__star($aYm_n__star), 1);
      array_splice($this->ym_n__star, $index, 0, array($aYm_n__star));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addYm_n__starAt($aYm_n__star, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->ym_n__star) > 0)
    {
      $aYm_n__star = $this->ym_n__star[count($this->ym_n__star) - 1];
      $aYm_n__star->delete();
      unset($this->ym_n__star[$this->indexOfYm_n__star($aYm_n__star)]);
      $this->ym_n__star = array_values($this->ym_n__star);
    }
    
  }

}
?>
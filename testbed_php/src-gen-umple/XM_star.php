<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class XM_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //XM_star Attributes
  private $num;

  //XM_star Associations
  private $ym_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum, $allYm_star)
  {
    $this->num = $aNum;
    $this->ym_star = array();
    $didAddYm_star = $this->setYm_star($allYm_star);
    if (!$didAddYm_star)
    {
      throw new Exception("Unable to create XM_star, must have 3 ym_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public function getYm_star_index($index)
  {
    $aYm_star = $this->ym_star[$index];
    return $aYm_star;
  }

  public function getYm_star()
  {
    $newYm_star = $this->ym_star;
    return $newYm_star;
  }

  public function numberOfYm_star()
  {
    $number = count($this->ym_star);
    return $number;
  }

  public function hasYm_star()
  {
    $has = $this->numberOfYm_star() > 0;
    return $has;
  }

  public function indexOfYm_star($aYm_star)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->ym_star as $ym_star)
    {
      if ($ym_star->equals($aYm_star))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfYm_starValid()
  {
    $isValid = $this->numberOfYm_star() >= self::minimumNumberOfYm_star() && $this->numberOfYm_star() <= self::maximumNumberOfYm_star();
    return $isValid;
  }

  public static function requiredNumberOfYm_star()
  {
    return 3;
  }

  public static function minimumNumberOfYm_star()
  {
    return 3;
  }

  public static function maximumNumberOfYm_star()
  {
    return 3;
  }

  public function addYm_star($aYm_star)
  {
    $wasAdded = false;
    if ($this->indexOfYm_star($aYm_star) !== -1) { return false; }
    if ($this->numberOfYm_star() >= self::maximumNumberOfYm_star())
    {
      return $wasAdded;
    }

    $this->ym_star[] = $aYm_star;
    if ($aYm_star->indexOfXVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aYm_star->addXVar($this);
      if (!$wasAdded)
      {
        array_pop($this->ym_star);
      }
    }
    return $wasAdded;
  }

  public function removeYm_star($aYm_star)
  {
    $wasRemoved = false;
    if ($this->indexOfYm_star($aYm_star) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfYm_star() <= self::minimumNumberOfYm_star())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfYm_star($aYm_star);
    unset($this->ym_star[$oldIndex]);
    if ($aYm_star->indexOfXVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aYm_star->removeXVar($this);
      if (!$wasRemoved)
      {
        $this->ym_star[$oldIndex] = $aYm_star;
        ksort($this->ym_star);
      }
    }
    $this->ym_star = array_values($this->ym_star);
    return $wasRemoved;
  }

  public function setYm_star($newYm_star)
  {
    $wasSet = false;
    $verifiedYm_star = array();
    foreach ($newYm_star as $aYm_star)
    {
      if (array_search($aYm_star,$verifiedYm_star) !== false)
      {
        continue;
      }
      $verifiedYm_star[] = $aYm_star;
    }

    if (count($verifiedYm_star) != count($newYm_star) || count($verifiedYm_star) < self::minimumNumberOfYm_star() || count($verifiedYm_star) > self::maximumNumberOfYm_star())
    {
      return $wasSet;
    }

    $oldYm_star = $this->ym_star;
    $this->ym_star = array();
    foreach ($verifiedYm_star as $aNewYm_star)
    {
      $this->ym_star[] = $aNewYm_star;
      $removeIndex = array_search($aNewYm_star,$oldYm_star);
      if ($removeIndex !== false)
      {
        unset($oldYm_star[$removeIndex]);
        $oldYm_star = array_values($oldYm_star);
      }
      else
      {
        $aNewYm_star->addXVar($this);
      }
    }

    foreach ($oldYm_star as $anOldYm_star)
    {
      $anOldYm_star->removeXVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->ym_star) > 0)
    {
      $aYm_star = $this->ym_star[count($this->ym_star) - 1];
      $aYm_star->delete();
      unset($this->ym_star[$this->indexOfYm_star($aYm_star)]);
      $this->ym_star = array_values($this->ym_star);
    }
    
  }

}
?>
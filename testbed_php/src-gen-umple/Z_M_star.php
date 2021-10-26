<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_M_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_M_star Attributes
  private $num;

  //Z_M_star Associations
  private $y_m_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum, $allY_m_star)
  {
    $this->num = $aNum;
    $this->y_m_star = array();
    $didAddY_m_star = $this->setY_m_star($allY_m_star);
    if (!$didAddY_m_star)
    {
      throw new Exception("Unable to create Z_M_star, must have 3 y_m_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public function getY_m_star_index($index)
  {
    $aY_m_star = $this->y_m_star[$index];
    return $aY_m_star;
  }

  public function getY_m_star()
  {
    $newY_m_star = $this->y_m_star;
    return $newY_m_star;
  }

  public function numberOfY_m_star()
  {
    $number = count($this->y_m_star);
    return $number;
  }

  public function hasY_m_star()
  {
    $has = $this->numberOfY_m_star() > 0;
    return $has;
  }

  public function indexOfY_m_star($aY_m_star)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_m_star as $y_m_star)
    {
      if ($y_m_star->equals($aY_m_star))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfY_m_starValid()
  {
    $isValid = $this->numberOfY_m_star() >= self::minimumNumberOfY_m_star() && $this->numberOfY_m_star() <= self::maximumNumberOfY_m_star();
    return $isValid;
  }

  public static function requiredNumberOfY_m_star()
  {
    return 3;
  }

  public static function minimumNumberOfY_m_star()
  {
    return 3;
  }

  public static function maximumNumberOfY_m_star()
  {
    return 3;
  }

  public function addY_m_star($aY_m_star)
  {
    $wasAdded = false;
    if ($this->indexOfY_m_star($aY_m_star) !== -1) { return false; }
    if ($this->numberOfY_m_star() >= self::maximumNumberOfY_m_star())
    {
      return $wasAdded;
    }

    $this->y_m_star[] = $aY_m_star;
    if ($aY_m_star->indexOfZVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY_m_star->addZVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y_m_star);
      }
    }
    return $wasAdded;
  }

  public function removeY_m_star($aY_m_star)
  {
    $wasRemoved = false;
    if ($this->indexOfY_m_star($aY_m_star) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfY_m_star() <= self::minimumNumberOfY_m_star())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY_m_star($aY_m_star);
    unset($this->y_m_star[$oldIndex]);
    if ($aY_m_star->indexOfZVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY_m_star->removeZVar($this);
      if (!$wasRemoved)
      {
        $this->y_m_star[$oldIndex] = $aY_m_star;
        ksort($this->y_m_star);
      }
    }
    $this->y_m_star = array_values($this->y_m_star);
    return $wasRemoved;
  }

  public function setY_m_star($newY_m_star)
  {
    $wasSet = false;
    $verifiedY_m_star = array();
    foreach ($newY_m_star as $aY_m_star)
    {
      if (array_search($aY_m_star,$verifiedY_m_star) !== false)
      {
        continue;
      }
      $verifiedY_m_star[] = $aY_m_star;
    }

    if (count($verifiedY_m_star) != count($newY_m_star) || count($verifiedY_m_star) < self::minimumNumberOfY_m_star() || count($verifiedY_m_star) > self::maximumNumberOfY_m_star())
    {
      return $wasSet;
    }

    $oldY_m_star = $this->y_m_star;
    $this->y_m_star = array();
    foreach ($verifiedY_m_star as $aNewY_m_star)
    {
      $this->y_m_star[] = $aNewY_m_star;
      $removeIndex = array_search($aNewY_m_star,$oldY_m_star);
      if ($removeIndex !== false)
      {
        unset($oldY_m_star[$removeIndex]);
        $oldY_m_star = array_values($oldY_m_star);
      }
      else
      {
        $aNewY_m_star->addZVar($this);
      }
    }

    foreach ($oldY_m_star as $anOldY_m_star)
    {
      $anOldY_m_star->removeZVar($this);
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
    $copyOfY_m_star = $this->y_m_star;
    $this->y_m_star = array();
    foreach ($copyOfY_m_star as $aY_m_star)
    {
      $aY_m_star->removeZVar($this);
    }
  }

}
?>
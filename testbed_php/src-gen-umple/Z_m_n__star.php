<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_m_n__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_m_n__star Attributes
  private $num;

  //Z_m_n__star Associations
  private $y_m_n__star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum, $allY_m_n__star)
  {
    $this->num = $aNum;
    $this->y_m_n__star = array();
    $didAddY_m_n__star = $this->setY_m_n__star($allY_m_n__star);
    if (!$didAddY_m_n__star)
    {
      throw new Exception("Unable to create Z_m_n__star, must have 2 to 3 y_m_n__star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public function getY_m_n__star_index($index)
  {
    $aY_m_n__star = $this->y_m_n__star[$index];
    return $aY_m_n__star;
  }

  public function getY_m_n__star()
  {
    $newY_m_n__star = $this->y_m_n__star;
    return $newY_m_n__star;
  }

  public function numberOfY_m_n__star()
  {
    $number = count($this->y_m_n__star);
    return $number;
  }

  public function hasY_m_n__star()
  {
    $has = $this->numberOfY_m_n__star() > 0;
    return $has;
  }

  public function indexOfY_m_n__star($aY_m_n__star)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_m_n__star as $y_m_n__star)
    {
      if ($y_m_n__star->equals($aY_m_n__star))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function isNumberOfY_m_n__starValid()
  {
    $isValid = $this->numberOfY_m_n__star() >= self::minimumNumberOfY_m_n__star() && $this->numberOfY_m_n__star() <= self::maximumNumberOfY_m_n__star();
    return $isValid;
  }

  public static function minimumNumberOfY_m_n__star()
  {
    return 2;
  }

  public static function maximumNumberOfY_m_n__star()
  {
    return 3;
  }

  public function addY_m_n__star($aY_m_n__star)
  {
    $wasAdded = false;
    if ($this->indexOfY_m_n__star($aY_m_n__star) !== -1) { return false; }
    if ($this->numberOfY_m_n__star() >= self::maximumNumberOfY_m_n__star())
    {
      return $wasAdded;
    }

    $this->y_m_n__star[] = $aY_m_n__star;
    if ($aY_m_n__star->indexOfZVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY_m_n__star->addZVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y_m_n__star);
      }
    }
    return $wasAdded;
  }

  public function removeY_m_n__star($aY_m_n__star)
  {
    $wasRemoved = false;
    if ($this->indexOfY_m_n__star($aY_m_n__star) == -1)
    {
      return $wasRemoved;
    }

    if ($this->numberOfY_m_n__star() <= self::minimumNumberOfY_m_n__star())
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY_m_n__star($aY_m_n__star);
    unset($this->y_m_n__star[$oldIndex]);
    if ($aY_m_n__star->indexOfZVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY_m_n__star->removeZVar($this);
      if (!$wasRemoved)
      {
        $this->y_m_n__star[$oldIndex] = $aY_m_n__star;
        ksort($this->y_m_n__star);
      }
    }
    $this->y_m_n__star = array_values($this->y_m_n__star);
    return $wasRemoved;
  }

  public function setY_m_n__star($newY_m_n__star)
  {
    $wasSet = false;
    $verifiedY_m_n__star = array();
    foreach ($newY_m_n__star as $aY_m_n__star)
    {
      if (array_search($aY_m_n__star,$verifiedY_m_n__star) !== false)
      {
        continue;
      }
      $verifiedY_m_n__star[] = $aY_m_n__star;
    }

    if (count($verifiedY_m_n__star) != count($newY_m_n__star) || count($verifiedY_m_n__star) < self::minimumNumberOfY_m_n__star() || count($verifiedY_m_n__star) > self::maximumNumberOfY_m_n__star())
    {
      return $wasSet;
    }

    $oldY_m_n__star = $this->y_m_n__star;
    $this->y_m_n__star = array();
    foreach ($verifiedY_m_n__star as $aNewY_m_n__star)
    {
      $this->y_m_n__star[] = $aNewY_m_n__star;
      $removeIndex = array_search($aNewY_m_n__star,$oldY_m_n__star);
      if ($removeIndex !== false)
      {
        unset($oldY_m_n__star[$removeIndex]);
        $oldY_m_n__star = array_values($oldY_m_n__star);
      }
      else
      {
        $aNewY_m_n__star->addZVar($this);
      }
    }

    foreach ($oldY_m_n__star as $anOldY_m_n__star)
    {
      $anOldY_m_n__star->removeZVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function addY_m_n__starAt($aY_m_n__star, $index)
  {  
    $wasAdded = false;
    if($this->addY_m_n__star($aY_m_n__star))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_m_n__star()) { $index = $this->numberOfY_m_n__star() - 1; }
      array_splice($this->y_m_n__star, $this->indexOfY_m_n__star($aY_m_n__star), 1);
      array_splice($this->y_m_n__star, $index, 0, array($aY_m_n__star));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY_m_n__starAt($aY_m_n__star, $index)
  {
    $wasAdded = false;
    if($this->indexOfY_m_n__star($aY_m_n__star) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_m_n__star()) { $index = $this->numberOfY_m_n__star() - 1; }
      array_splice($this->y_m_n__star, $this->indexOfY_m_n__star($aY_m_n__star), 1);
      array_splice($this->y_m_n__star, $index, 0, array($aY_m_n__star));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY_m_n__starAt($aY_m_n__star, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $copyOfY_m_n__star = $this->y_m_n__star;
    $this->y_m_n__star = array();
    foreach ($copyOfY_m_n__star as $aY_m_n__star)
    {
      $aY_m_n__star->removeZVar($this);
    }
  }

}
?>
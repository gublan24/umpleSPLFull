<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_0_n__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_n__star Attributes
  private $num;

  //Z_0_n__star Associations
  private $y_0_n__star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y_0_n__star = array();
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

  public function getY_0_n__star_index($index)
  {
    $aY_0_n__star = $this->y_0_n__star[$index];
    return $aY_0_n__star;
  }

  public function getY_0_n__star()
  {
    $newY_0_n__star = $this->y_0_n__star;
    return $newY_0_n__star;
  }

  public function numberOfY_0_n__star()
  {
    $number = count($this->y_0_n__star);
    return $number;
  }

  public function hasY_0_n__star()
  {
    $has = $this->numberOfY_0_n__star() > 0;
    return $has;
  }

  public function indexOfY_0_n__star($aY_0_n__star)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_0_n__star as $y_0_n__star)
    {
      if ($y_0_n__star->equals($aY_0_n__star))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfY_0_n__star()
  {
    return 0;
  }

  public static function maximumNumberOfY_0_n__star()
  {
    return 3;
  }

  public function addY_0_n__star($aY_0_n__star)
  {
    $wasAdded = false;
    if ($this->indexOfY_0_n__star($aY_0_n__star) !== -1) { return false; }
    if ($this->numberOfY_0_n__star() >= self::maximumNumberOfY_0_n__star())
    {
      return $wasAdded;
    }

    $this->y_0_n__star[] = $aY_0_n__star;
    if ($aY_0_n__star->indexOfZVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY_0_n__star->addZVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y_0_n__star);
      }
    }
    return $wasAdded;
  }

  public function removeY_0_n__star($aY_0_n__star)
  {
    $wasRemoved = false;
    if ($this->indexOfY_0_n__star($aY_0_n__star) == -1)
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY_0_n__star($aY_0_n__star);
    unset($this->y_0_n__star[$oldIndex]);
    if ($aY_0_n__star->indexOfZVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY_0_n__star->removeZVar($this);
      if (!$wasRemoved)
      {
        $this->y_0_n__star[$oldIndex] = $aY_0_n__star;
        ksort($this->y_0_n__star);
      }
    }
    $this->y_0_n__star = array_values($this->y_0_n__star);
    return $wasRemoved;
  }

  public function setY_0_n__star($newY_0_n__star)
  {
    $wasSet = false;
    $verifiedY_0_n__star = array();
    foreach ($newY_0_n__star as $aY_0_n__star)
    {
      if (array_search($aY_0_n__star,$verifiedY_0_n__star) !== false)
      {
        continue;
      }
      $verifiedY_0_n__star[] = $aY_0_n__star;
    }

    if (count($verifiedY_0_n__star) != count($newY_0_n__star) || count($verifiedY_0_n__star) > self::maximumNumberOfY_0_n__star())
    {
      return $wasSet;
    }

    $oldY_0_n__star = $this->y_0_n__star;
    $this->y_0_n__star = array();
    foreach ($verifiedY_0_n__star as $aNewY_0_n__star)
    {
      $this->y_0_n__star[] = $aNewY_0_n__star;
      $removeIndex = array_search($aNewY_0_n__star,$oldY_0_n__star);
      if ($removeIndex !== false)
      {
        unset($oldY_0_n__star[$removeIndex]);
        $oldY_0_n__star = array_values($oldY_0_n__star);
      }
      else
      {
        $aNewY_0_n__star->addZVar($this);
      }
    }

    foreach ($oldY_0_n__star as $anOldY_0_n__star)
    {
      $anOldY_0_n__star->removeZVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function addY_0_n__starAt($aY_0_n__star, $index)
  {  
    $wasAdded = false;
    if($this->addY_0_n__star($aY_0_n__star))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_0_n__star()) { $index = $this->numberOfY_0_n__star() - 1; }
      array_splice($this->y_0_n__star, $this->indexOfY_0_n__star($aY_0_n__star), 1);
      array_splice($this->y_0_n__star, $index, 0, array($aY_0_n__star));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY_0_n__starAt($aY_0_n__star, $index)
  {
    $wasAdded = false;
    if($this->indexOfY_0_n__star($aY_0_n__star) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_0_n__star()) { $index = $this->numberOfY_0_n__star() - 1; }
      array_splice($this->y_0_n__star, $this->indexOfY_0_n__star($aY_0_n__star), 1);
      array_splice($this->y_0_n__star, $index, 0, array($aY_0_n__star));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY_0_n__starAt($aY_0_n__star, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $copyOfY_0_n__star = $this->y_0_n__star;
    $this->y_0_n__star = array();
    foreach ($copyOfY_0_n__star as $aY_0_n__star)
    {
      $aY_0_n__star->removeZVar($this);
    }
  }

}
?>
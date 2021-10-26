<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class X0_n__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_n__star Attributes
  private $num;

  //X0_n__star Associations
  private $y0_n__star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y0_n__star = array();
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

  public function getY0_n__star_index($index)
  {
    $aY0_n__star = $this->y0_n__star[$index];
    return $aY0_n__star;
  }

  public function getY0_n__star()
  {
    $newY0_n__star = $this->y0_n__star;
    return $newY0_n__star;
  }

  public function numberOfY0_n__star()
  {
    $number = count($this->y0_n__star);
    return $number;
  }

  public function hasY0_n__star()
  {
    $has = $this->numberOfY0_n__star() > 0;
    return $has;
  }

  public function indexOfY0_n__star($aY0_n__star)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y0_n__star as $y0_n__star)
    {
      if ($y0_n__star->equals($aY0_n__star))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfY0_n__star()
  {
    return 0;
  }

  public static function maximumNumberOfY0_n__star()
  {
    return 3;
  }

  public function addY0_n__star($aY0_n__star)
  {
    $wasAdded = false;
    if ($this->indexOfY0_n__star($aY0_n__star) !== -1) { return false; }
    if ($this->numberOfY0_n__star() >= self::maximumNumberOfY0_n__star())
    {
      return $wasAdded;
    }

    $this->y0_n__star[] = $aY0_n__star;
    if ($aY0_n__star->indexOfXVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY0_n__star->addXVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y0_n__star);
      }
    }
    return $wasAdded;
  }

  public function removeY0_n__star($aY0_n__star)
  {
    $wasRemoved = false;
    if ($this->indexOfY0_n__star($aY0_n__star) == -1)
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY0_n__star($aY0_n__star);
    unset($this->y0_n__star[$oldIndex]);
    if ($aY0_n__star->indexOfXVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY0_n__star->removeXVar($this);
      if (!$wasRemoved)
      {
        $this->y0_n__star[$oldIndex] = $aY0_n__star;
        ksort($this->y0_n__star);
      }
    }
    $this->y0_n__star = array_values($this->y0_n__star);
    return $wasRemoved;
  }

  public function setY0_n__star($newY0_n__star)
  {
    $wasSet = false;
    $verifiedY0_n__star = array();
    foreach ($newY0_n__star as $aY0_n__star)
    {
      if (array_search($aY0_n__star,$verifiedY0_n__star) !== false)
      {
        continue;
      }
      $verifiedY0_n__star[] = $aY0_n__star;
    }

    if (count($verifiedY0_n__star) != count($newY0_n__star) || count($verifiedY0_n__star) > self::maximumNumberOfY0_n__star())
    {
      return $wasSet;
    }

    $oldY0_n__star = $this->y0_n__star;
    $this->y0_n__star = array();
    foreach ($verifiedY0_n__star as $aNewY0_n__star)
    {
      $this->y0_n__star[] = $aNewY0_n__star;
      $removeIndex = array_search($aNewY0_n__star,$oldY0_n__star);
      if ($removeIndex !== false)
      {
        unset($oldY0_n__star[$removeIndex]);
        $oldY0_n__star = array_values($oldY0_n__star);
      }
      else
      {
        $aNewY0_n__star->addXVar($this);
      }
    }

    foreach ($oldY0_n__star as $anOldY0_n__star)
    {
      $anOldY0_n__star->removeXVar($this);
    }
    $wasSet = true;
    return $wasSet;
  }

  public function addY0_n__starAt($aY0_n__star, $index)
  {  
    $wasAdded = false;
    if($this->addY0_n__star($aY0_n__star))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY0_n__star()) { $index = $this->numberOfY0_n__star() - 1; }
      array_splice($this->y0_n__star, $this->indexOfY0_n__star($aY0_n__star), 1);
      array_splice($this->y0_n__star, $index, 0, array($aY0_n__star));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY0_n__starAt($aY0_n__star, $index)
  {
    $wasAdded = false;
    if($this->indexOfY0_n__star($aY0_n__star) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY0_n__star()) { $index = $this->numberOfY0_n__star() - 1; }
      array_splice($this->y0_n__star, $this->indexOfY0_n__star($aY0_n__star), 1);
      array_splice($this->y0_n__star, $index, 0, array($aY0_n__star));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY0_n__starAt($aY0_n__star, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->y0_n__star) > 0)
    {
      $aY0_n__star = $this->y0_n__star[count($this->y0_n__star) - 1];
      $aY0_n__star->delete();
      unset($this->y0_n__star[$this->indexOfY0_n__star($aY0_n__star)]);
      $this->y0_n__star = array_values($this->y0_n__star);
    }
    
  }

}
?>
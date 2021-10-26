<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Z_star_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_star_star Attributes
  private $num;

  //Z_star_star Associations
  private $y_star_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->y_star_star = array();
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

  public function getY_star_star_index($index)
  {
    $aY_star_star = $this->y_star_star[$index];
    return $aY_star_star;
  }

  public function getY_star_star()
  {
    $newY_star_star = $this->y_star_star;
    return $newY_star_star;
  }

  public function numberOfY_star_star()
  {
    $number = count($this->y_star_star);
    return $number;
  }

  public function hasY_star_star()
  {
    $has = $this->numberOfY_star_star() > 0;
    return $has;
  }

  public function indexOfY_star_star($aY_star_star)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->y_star_star as $y_star_star)
    {
      if ($y_star_star->equals($aY_star_star))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfY_star_star()
  {
    return 0;
  }

  public function addY_star_star($aY_star_star)
  {
    $wasAdded = false;
    if ($this->indexOfY_star_star($aY_star_star) !== -1) { return false; }
    $this->y_star_star[] = $aY_star_star;
    if ($aY_star_star->indexOfZVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aY_star_star->addZVar($this);
      if (!$wasAdded)
      {
        array_pop($this->y_star_star);
      }
    }
    return $wasAdded;
  }

  public function removeY_star_star($aY_star_star)
  {
    $wasRemoved = false;
    if ($this->indexOfY_star_star($aY_star_star) == -1)
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfY_star_star($aY_star_star);
    unset($this->y_star_star[$oldIndex]);
    if ($aY_star_star->indexOfZVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aY_star_star->removeZVar($this);
      if (!$wasRemoved)
      {
        $this->y_star_star[$oldIndex] = $aY_star_star;
        ksort($this->y_star_star);
      }
    }
    $this->y_star_star = array_values($this->y_star_star);
    return $wasRemoved;
  }

  public function addY_star_starAt($aY_star_star, $index)
  {  
    $wasAdded = false;
    if($this->addY_star_star($aY_star_star))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_star_star()) { $index = $this->numberOfY_star_star() - 1; }
      array_splice($this->y_star_star, $this->indexOfY_star_star($aY_star_star), 1);
      array_splice($this->y_star_star, $index, 0, array($aY_star_star));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveY_star_starAt($aY_star_star, $index)
  {
    $wasAdded = false;
    if($this->indexOfY_star_star($aY_star_star) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfY_star_star()) { $index = $this->numberOfY_star_star() - 1; }
      array_splice($this->y_star_star, $this->indexOfY_star_star($aY_star_star), 1);
      array_splice($this->y_star_star, $index, 0, array($aY_star_star));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addY_star_starAt($aY_star_star, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $copyOfY_star_star = $this->y_star_star;
    $this->y_star_star = array();
    foreach ($copyOfY_star_star as $aY_star_star)
    {
      $aY_star_star->removeZVar($this);
    }
  }

}
?>
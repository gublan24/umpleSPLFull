<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Xstar_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xstar_star Attributes
  private $num;

  //Xstar_star Associations
  private $ystar_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNum)
  {
    $this->num = $aNum;
    $this->ystar_star = array();
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

  public function getYstar_star_index($index)
  {
    $aYstar_star = $this->ystar_star[$index];
    return $aYstar_star;
  }

  public function getYstar_star()
  {
    $newYstar_star = $this->ystar_star;
    return $newYstar_star;
  }

  public function numberOfYstar_star()
  {
    $number = count($this->ystar_star);
    return $number;
  }

  public function hasYstar_star()
  {
    $has = $this->numberOfYstar_star() > 0;
    return $has;
  }

  public function indexOfYstar_star($aYstar_star)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->ystar_star as $ystar_star)
    {
      if ($ystar_star->equals($aYstar_star))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfYstar_star()
  {
    return 0;
  }

  public function addYstar_star($aYstar_star)
  {
    $wasAdded = false;
    if ($this->indexOfYstar_star($aYstar_star) !== -1) { return false; }
    $this->ystar_star[] = $aYstar_star;
    if ($aYstar_star->indexOfXVar($this) != -1)
    {
      $wasAdded = true;
    }
    else
    {
      $wasAdded = $aYstar_star->addXVar($this);
      if (!$wasAdded)
      {
        array_pop($this->ystar_star);
      }
    }
    return $wasAdded;
  }

  public function removeYstar_star($aYstar_star)
  {
    $wasRemoved = false;
    if ($this->indexOfYstar_star($aYstar_star) == -1)
    {
      return $wasRemoved;
    }

    $oldIndex = $this->indexOfYstar_star($aYstar_star);
    unset($this->ystar_star[$oldIndex]);
    if ($aYstar_star->indexOfXVar($this) == -1)
    {
      $wasRemoved = true;
    }
    else
    {
      $wasRemoved = $aYstar_star->removeXVar($this);
      if (!$wasRemoved)
      {
        $this->ystar_star[$oldIndex] = $aYstar_star;
        ksort($this->ystar_star);
      }
    }
    $this->ystar_star = array_values($this->ystar_star);
    return $wasRemoved;
  }

  public function addYstar_starAt($aYstar_star, $index)
  {  
    $wasAdded = false;
    if($this->addYstar_star($aYstar_star))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfYstar_star()) { $index = $this->numberOfYstar_star() - 1; }
      array_splice($this->ystar_star, $this->indexOfYstar_star($aYstar_star), 1);
      array_splice($this->ystar_star, $index, 0, array($aYstar_star));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveYstar_starAt($aYstar_star, $index)
  {
    $wasAdded = false;
    if($this->indexOfYstar_star($aYstar_star) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfYstar_star()) { $index = $this->numberOfYstar_star() - 1; }
      array_splice($this->ystar_star, $this->indexOfYstar_star($aYstar_star), 1);
      array_splice($this->ystar_star, $index, 0, array($aYstar_star));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addYstar_starAt($aYstar_star, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    while (count($this->ystar_star) > 0)
    {
      $aYstar_star = $this->ystar_star[count($this->ystar_star) - 1];
      $aYstar_star->delete();
      unset($this->ystar_star[$this->indexOfYstar_star($aYstar_star)]);
      $this->ystar_star = array_values($this->ystar_star);
    }
    
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Commuter
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Commuter Attributes
  private $name;

  //Commuter Associations
  private $seatings;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aName)
  {
    $this->name = $aName;
    $this->seatings = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setName($aName)
  {
    $wasSet = false;
    $this->name = $aName;
    $wasSet = true;
    return $wasSet;
  }

  public function getName()
  {
    return $this->name;
  }

  public function getSeating_index($index)
  {
    $aSeating = $this->seatings[$index];
    return $aSeating;
  }

  public function getSeatings()
  {
    $newSeatings = $this->seatings;
    return $newSeatings;
  }

  public function numberOfSeatings()
  {
    $number = count($this->seatings);
    return $number;
  }

  public function hasSeatings()
  {
    $has = $this->numberOfSeatings() > 0;
    return $has;
  }

  public function indexOfSeating($aSeating)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->seatings as $seating)
    {
      if ($seating->equals($aSeating))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfSeatings()
  {
    return 0;
  }

  public function addSeatingVia($aBus)
  {
    return new Seating($aBus, $this);
  }

  public function addSeating($aSeating)
  {
    $wasAdded = false;
    if ($this->indexOfSeating($aSeating) !== -1) { return false; }
    $existingCommuter = $aSeating->getCommuter();
    $isNewCommuter = $existingCommuter != null && $this !== $existingCommuter;
    if ($isNewCommuter)
    {
      $aSeating->setCommuter($this);
    }
    else
    {
      $this->seatings[] = $aSeating;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeSeating($aSeating)
  {
    $wasRemoved = false;
    //Unable to remove aSeating, as it must always have a commuter
    if ($this !== $aSeating->getCommuter())
    {
      unset($this->seatings[$this->indexOfSeating($aSeating)]);
      $this->seatings = array_values($this->seatings);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addSeatingAt($aSeating, $index)
  {  
    $wasAdded = false;
    if($this->addSeating($aSeating))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfSeatings()) { $index = $this->numberOfSeatings() - 1; }
      array_splice($this->seatings, $this->indexOfSeating($aSeating), 1);
      array_splice($this->seatings, $index, 0, array($aSeating));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveSeatingAt($aSeating, $index)
  {
    $wasAdded = false;
    if($this->indexOfSeating($aSeating) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfSeatings()) { $index = $this->numberOfSeatings() - 1; }
      array_splice($this->seatings, $this->indexOfSeating($aSeating), 1);
      array_splice($this->seatings, $index, 0, array($aSeating));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addSeatingAt($aSeating, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    foreach ($this->seatings as $aSeating)
    {
      $aSeating->delete();
    }
  }

}
?>
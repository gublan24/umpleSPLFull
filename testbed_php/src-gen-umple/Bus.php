<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Bus
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Bus Attributes
  private $number;

  //Bus Associations
  private $seatings;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNumber)
  {
    $this->number = $aNumber;
    $this->seatings = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setNumber($aNumber)
  {
    $wasSet = false;
    $this->number = $aNumber;
    $wasSet = true;
    return $wasSet;
  }

  public function getNumber()
  {
    return $this->number;
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

  public function addSeatingVia($aCommuter)
  {
    return new Seating($this, $aCommuter);
  }

  public function addSeating($aSeating)
  {
    $wasAdded = false;
    if ($this->indexOfSeating($aSeating) !== -1) { return false; }
    $existingBus = $aSeating->getBus();
    $isNewBus = $existingBus != null && $this !== $existingBus;
    if ($isNewBus)
    {
      $aSeating->setBus($this);
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
    //Unable to remove aSeating, as it must always have a bus
    if ($this !== $aSeating->getBus())
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
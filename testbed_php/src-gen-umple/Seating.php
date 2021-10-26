<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class Seating
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Seating Attributes
  private $seat;

  //Seating Associations
  private $bus;
  private $commuter;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aBus, $aCommuter)
  {
    $this->seat = NULL;
    $didAddBus = $this->setBus($aBus);
    if (!$didAddBus)
    {
      throw new Exception("Unable to create seating due to bus. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    $didAddCommuter = $this->setCommuter($aCommuter);
    if (!$didAddCommuter)
    {
      throw new Exception("Unable to create seating due to commuter. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setSeat($aSeat)
  {
    $wasSet = false;
    $this->seat = $aSeat;
    $wasSet = true;
    return $wasSet;
  }

  public function getSeat()
  {
    return $this->seat;
  }

  public function getBus()
  {
    return $this->bus;
  }

  public function getCommuter()
  {
    return $this->commuter;
  }

  public function setBus($aBus)
  {
    $wasSet = false;
    if ($aBus == null)
    {
      return $wasSet;
    }
    
    $existingBus = $this->bus;
    $this->bus = $aBus;
    if ($existingBus != null && $existingBus != $aBus)
    {
      $existingBus->removeSeating($this);
    }
    $this->bus->addSeating($this);
    $wasSet = true;
    return $wasSet;
  }

  public function setCommuter($aCommuter)
  {
    $wasSet = false;
    if ($aCommuter == null)
    {
      return $wasSet;
    }
    
    $existingCommuter = $this->commuter;
    $this->commuter = $aCommuter;
    if ($existingCommuter != null && $existingCommuter != $aCommuter)
    {
      $existingCommuter->removeSeating($this);
    }
    $this->commuter->addSeating($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $placeholderBus = $this->bus;
    $this->bus = null;
    $placeholderBus->removeSeating($this);
    $placeholderCommuter = $this->commuter;
    $this->commuter = null;
    $placeholderCommuter->removeSeating($this);
  }

}
?>
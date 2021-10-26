<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class DoorI extends DoorH
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Helper Variables
  private $cachedHashCode;
  private $canSetId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aId)
  {
    parent::__construct($aId);
    $this->cachedHashCode = -1;
    $this->canSetId = true;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function equals($compareTo)
  {
    if ($compareTo == null) { return false; }
    if (get_class($this) != get_class($compareTo)) { return false; }

    if ($this->id != $compareTo->id)
    {
      return false;
    }

    return true;
  }

  public function hashCode()
  {
    if ($this->cachedHashCode != -1)
    {
      return $this->cachedHashCode;
    }
    $this->cachedHashCode = 17;
    if ($this->id != null)
    {
      $this->cachedHashCode = $this->cachedHashCode * 23 + spl_object_hash($this->id);
    }
    else
    {
      $this->cachedHashCode = $this->cachedHashCode * 23;
    }

    $this->canSetId = false;
    return $this->cachedHashCode;
  }

  public function delete()
  {
    parent::delete();
  }

}
?>
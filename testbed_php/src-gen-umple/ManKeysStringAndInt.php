<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class ManKeysStringAndInt extends ManyStringAttributes
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ManKeysStringAndInt Attributes
  private $id;

  //Helper Variables
  private $cachedHashCode;
  private $canSetWorksString;
  private $canSetId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aId)
  {
    parent::__construct();
    $this->cachedHashCode = -1;
    $this->canSetWorksString = true;
    $this->canSetId = true;
    $this->id = $aId;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setId($aId)
  {
    $wasSet = false;
    if (!$this->canSetId) { return false; }
    $this->id = $aId;
    $wasSet = true;
    return $wasSet;
  }

  public function getId()
  {
    return $this->id;
  }

  public function equals($compareTo)
  {
    if ($compareTo == null) { return false; }
    if (get_class($this) != get_class($compareTo)) { return false; }

    if ($this->worksString != $compareTo->worksString)
    {
      return false;
    }

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
    if ($this->worksString != null)
    {
      $this->cachedHashCode = $this->cachedHashCode * 23 + spl_object_hash($this->worksString);
    }
    else
    {
      $this->cachedHashCode = $this->cachedHashCode * 23;
    }

    $this->cachedHashCode = $this->cachedHashCode * 23 + $this->id;

    $this->canSetWorksString = false;
    $this->canSetId = false;
    return $this->cachedHashCode;
  }

  public function delete()
  {
    parent::delete();
  }

}
?>
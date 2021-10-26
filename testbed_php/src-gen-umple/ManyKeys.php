<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class ManyKeys extends ManyAttribute
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Helper Variables
  private $cachedHashCode;
  private $canSetWorks;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    parent::__construct();
    $this->cachedHashCode = -1;
    $this->canSetWorks = true;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function equals($compareTo)
  {
    if ($compareTo == null) { return false; }
    if (get_class($this) != get_class($compareTo)) { return false; }

    if ($this->works != $compareTo->works)
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
    if ($this->works != null)
    {
      $this->cachedHashCode = $this->cachedHashCode * 23 + spl_object_hash($this->works);
    }
    else
    {
      $this->cachedHashCode = $this->cachedHashCode * 23;
    }

    $this->canSetWorks = false;
    return $this->cachedHashCode;
  }

  public function delete()
  {
    parent::delete();
  }

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class ManyStringAttributes
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ManyStringAttributes Attributes
  private $worksString;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->worksString = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function addWorksString($aWorksString)
  {
    $wasAdded = false;
    $this->worksString[] = $aWorksString;
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeWorksString($aWorksString)
  {
    $wasRemoved = false;
    unset($this->worksString[$this->indexOfWorksString($aWorksString)]);
    $this->worksString = array_values($this->worksString);
    $wasRemoved = true;
    return $wasRemoved;
  }

  public function getWorksString($index)
  {
    $aWorksString = $this->worksString[$index];
    return $aWorksString;
  }

  public function getWorksString()
  {
    $newWorksString = $this->worksString;
    return $newWorksString;
  }

  public function numberOfWorksString()
  {
    $number = count($this->worksString);
    return $number;
  }

  public function hasWorksString()
  {
    $has = worksString.size() > 0;
    return $has;
  }

  public function indexOfWorksString($aWorksString)
  {
    $rawAnswer = array_search($aWorksString,$this->worksString);
    $index = $rawAnswer == null && $rawAnswer !== 0 ? -1 : $rawAnswer;
    return $index;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
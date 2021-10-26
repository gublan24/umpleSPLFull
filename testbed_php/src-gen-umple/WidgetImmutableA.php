<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class WidgetImmutableA
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //WidgetImmutableA Attributes
  private $name;

  //WidgetImmutableA Associations
  private $widgetImmutableB;

  //Helper Variables
  private $canSetWidgetImmutableB;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aName, $aWidgetImmutableB)
  {
    $this->name = $aName;
    $this->canSetWidgetImmutableB = true;
    if (!$this->setWidgetImmutableB($aWidgetImmutableB))
    {
      throw new Exception("Unable to create WidgetImmutableA due to aWidgetImmutableB. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getName()
  {
    return $this->name;
  }

  public function getWidgetImmutableB()
  {
    return $this->widgetImmutableB;
  }

  private function setWidgetImmutableB($aNewWidgetImmutableB)
  {
    $wasSet = false;
    if (!$this->canSetWidgetImmutableB) { return false; }
    $this->canSetWidgetImmutableB = false;
    if ($aNewWidgetImmutableB != null)
    {
      $this->widgetImmutableB = $aNewWidgetImmutableB;
      $wasSet = true;
    }
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>
<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

class WidgetSubclass extends WidgetImmutableB
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //WidgetSubclass Attributes
  private $type;

  //WidgetSubclass Associations
  private $widgetImmutableBs;

  //Helper Variables
  private $canSetWidgetImmutableBs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aName, $aType, $allWidgetImmutableBs)
  {
    parent::__construct($aName);
    $this->type = $aType;
    $this->canSetWidgetImmutableBs = true;
    $this->widgetImmutableBs = array();
    $didAddWidgetImmutableBs = $this->setWidgetImmutableBs($allWidgetImmutableBs);
    if (!$didAddWidgetImmutableBs)
    {
      throw new Exception("Unable to create WidgetSubclass, must have 2 or fewer widgetImmutableBs, no duplicates. See http://manual.umple.org?RE001ViolationofImmutability.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getType()
  {
    return $this->type;
  }

  public function getWidgetImmutableB_index($index)
  {
    $aWidgetImmutableB = $this->widgetImmutableBs[$index];
    return $aWidgetImmutableB;
  }

  public function getWidgetImmutableBs()
  {
    $newWidgetImmutableBs = $this->widgetImmutableBs;
    return $newWidgetImmutableBs;
  }

  public function numberOfWidgetImmutableBs()
  {
    $number = count($this->widgetImmutableBs);
    return $number;
  }

  public function hasWidgetImmutableBs()
  {
    $has = $this->numberOfWidgetImmutableBs() > 0;
    return $has;
  }

  public function indexOfWidgetImmutableB($aWidgetImmutableB)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->widgetImmutableBs as $widgetImmutableB)
    {
      if ($widgetImmutableB->equals($aWidgetImmutableB))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfWidgetImmutableBs()
  {
    return 0;
  }

  public static function maximumNumberOfWidgetImmutableBs()
  {
    return 2;
  }

  private function setWidgetImmutableBs($newWidgetImmutableBs)
  {
    $wasSet = false;
    if (!$this->canSetWidgetImmutableBs) { return false; }
    $this->canSetWidgetImmutableBs = false;
    $verifiedWidgetImmutableBs = array();
    foreach ($newWidgetImmutableBs as $aWidgetImmutableB)
    {
      if (array_search($aWidgetImmutableB,$verifiedWidgetImmutableBs) !== false)
      {
        continue;
      }
      $verifiedWidgetImmutableBs[] = $aWidgetImmutableB;
    }

    if (count($verifiedWidgetImmutableBs) != count($newWidgetImmutableBs) || count($verifiedWidgetImmutableBs) > self::maximumNumberOfWidgetImmutableBs())
    {
      return $wasSet;
    }

    $this->widgetImmutableBs = $verifiedWidgetImmutableBs;
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    parent::delete();
  }

}
?>
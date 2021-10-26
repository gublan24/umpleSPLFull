# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAttributesTest
require 'date'
require 'time'

class DoorG


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #DoorG Attributes - for documentation purposes
  #attr_reader :floatNoF, :floatWithF, :doubleNoF, :doubleWithF, :doorId, :dateId, :timeId

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @floatNoF = 1.1
    @floatWithF = 1.2
    @doubleNoF = 1.3
    @doubleWithF = 1.4
    @can_set_doorId = true
    @dateId = nil
    @can_set_dateId = true
    @timeId = nil
    @can_set_timeId = true
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_floatNoF(a_floatNoF)
    was_set = false
    @floatNoF = a_floatNoF
    was_set = true
    was_set
  end

  def set_floatWithF(a_floatWithF)
    was_set = false
    @floatWithF = a_floatWithF
    was_set = true
    was_set
  end

  def set_doubleNoF(a_doubleNoF)
    was_set = false
    @doubleNoF = a_doubleNoF
    was_set = true
    was_set
  end

  def set_doubleWithF(a_doubleWithF)
    was_set = false
    @doubleWithF = a_doubleWithF
    was_set = true
    was_set
  end

  def set_doorId(a_doorId)
    was_set = false
    return false unless @can_set_doorId
    @can_set_doorId = false
    @doorId = a_doorId
    was_set = true
    was_set
  end

  def set_dateId(a_dateId)
    was_set = false
    return false unless @can_set_dateId
    @can_set_dateId = false
    @dateId = a_dateId
    was_set = true
    was_set
  end

  def set_timeId(a_timeId)
    was_set = false
    return false unless @can_set_timeId
    @can_set_timeId = false
    @timeId = a_timeId
    was_set = true
    was_set
  end

  def get_floatNoF
    @floatNoF
  end

  def get_floatWithF
    @floatWithF
  end

  def get_doubleNoF
    @doubleNoF
  end

  def get_doubleWithF
    @doubleWithF
  end

  def get_doorId
    @doorId
  end

  def get_dateId
    @dateId
  end

  def get_timeId
    @timeId
  end

  def delete
    @deleted = true
  end

end
end
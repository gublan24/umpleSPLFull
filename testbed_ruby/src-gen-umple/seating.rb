# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class Seating


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Seating Attributes - for documentation purposes
  #attr_reader :seat

  #Seating Associations - for documentation purposes
  #attr_reader :bus, :commuter

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_bus, a_commuter)
    @initialized = false
    @deleted = false
    @seat = nil
    @bus = nil
    did_add_bus = set_bus(a_bus)
    raise "Unable to create seating due to @bus. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_bus
    @commuter = nil
    did_add_commuter = set_commuter(a_commuter)
    raise "Unable to create seating due to @commuter. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_commuter
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_seat(a_seat)
    was_set = false
    @seat = a_seat
    was_set = true
    was_set
  end

  def get_seat
    @seat
  end

  def get_bus
    @bus
  end

  def get_commuter
    @commuter
  end

  def set_bus(a_bus)
    was_set = false
    if a_bus.nil?
      return was_set
    end

    existing_bus = @bus
    @bus = a_bus
    if !existing_bus.nil? and !existing_bus.eql?(a_bus)
      existing_bus.remove_seating(self)
    end
    @bus.add_seating(self)
    was_set = true
    was_set
  end

  def set_commuter(a_commuter)
    was_set = false
    if a_commuter.nil?
      return was_set
    end

    existing_commuter = @commuter
    @commuter = a_commuter
    if !existing_commuter.nil? and !existing_commuter.eql?(a_commuter)
      existing_commuter.remove_seating(self)
    end
    @commuter.add_seating(self)
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    @placeholder_bus = @bus
    @bus = nil
    @placeholder_bus.remove_seating(self)
    @placeholder_commuter = @commuter
    @commuter = nil
    @placeholder_commuter.remove_seating(self)
  end

end
end
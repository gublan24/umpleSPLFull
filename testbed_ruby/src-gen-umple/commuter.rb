# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class Commuter


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Commuter Attributes - for documentation purposes
  #attr_reader :name

  #Commuter Associations - for documentation purposes
  #attr_reader :seatings

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_name)
    @initialized = false
    @deleted = false
    @name = a_name
    @seatings = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_name(a_name)
    was_set = false
    @name = a_name
    was_set = true
    was_set
  end

  def get_name
    @name
  end

  def get_seating(index)
    a_seating = @seatings[index]
    a_seating
  end

  def get_seatings
    new_seatings = @seatings.dup
    new_seatings
  end

  def number_of_seatings
    number = @seatings.size
    number
  end

  def has_seatings
    has = @seatings.size > 0
    has
  end

  def index_of_seating(a_seating)
    index = @seatings.index(a_seating)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_seatings
    0
  end

  def add_seating(a_seating)
    was_added = false
    return false if index_of_seating(a_seating) != -1
    existing_commuter = a_seating.get_commuter
    is_new_commuter = (!existing_commuter.nil? and !existing_commuter.eql?(self))
    if is_new_commuter
      a_seating.set_commuter(self)
    else
      @seatings << a_seating
    end
    was_added = true
    was_added
  end

  def remove_seating(a_seating)
    was_removed = false
    # Unable to remove a_seating, as it must always have a commuter
    unless a_seating.get_commuter.eql?(self)
      @seatings.delete(a_seating)
      was_removed = true
    end
    was_removed
  end

  def add_seating_at(a_seating, index)
    was_added = false
    if add_seating(a_seating)
      if(index < 0)
        index = 0
      end
      if(index > number_of_seatings())
        index = number_of_seatings() - 1
      end
      @seatings.delete(a_seating)
      @seatings.insert(index, a_seating)
      was_added = true
    end
    was_added
  end

  def add_or_move_seating_at(a_seating, index)
    was_added = false
    if @seatings.include?(a_seating)
      if(index < 0)
        index = 0
      end
      if(index > number_of_seatings())
        index = number_of_seatings() - 1
      end
      @seatings.delete(a_seating)
      @seatings.insert(index, a_seating)
      was_added = true
    else
      was_added = add_seating_at(a_seating, index)
    end
    was_added
  end

  def delete
    @deleted = true
    @seatings.each do |a_seating|
      a_seating.delete
    end
  end

end
end
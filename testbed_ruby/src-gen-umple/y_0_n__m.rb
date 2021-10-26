# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Y0_n__m


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Y0_n__m Attributes - for documentation purposes
  #attr_reader :v

  #Y0_n__m Associations - for documentation purposes
  #attr_reader :xVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @v = 1
    @xVar = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_v(a_v)
    was_set = false
    @v = a_v
    was_set = true
    was_set
  end

  def get_v
    @v
  end

  def get_xVar(index)
    a_xVar = @xVar[index]
    a_xVar
  end

  def get_xVar
    new_xVar = @xVar.dup
    new_xVar
  end

  def number_of_xVar
    number = @xVar.size
    number
  end

  def has_xVar
    has = @xVar.size > 0
    has
  end

  def index_of_xVar(a_xVar)
    index = @xVar.index(a_xVar)
    index = -1 if index.nil?
    index
  end

  def is_number_of_xVar_valid
    is_valid = number_of_xVar >= Y0_n__m.minimum_number_of_xVar and number_of_xVar <= Y0_n__m.maximum_number_of_xVar
    is_valid
  end

  def self.required_number_of_xVar
    3
  end

  def self.minimum_number_of_xVar
    3
  end

  def self.maximum_number_of_xVar
    3
  end

  def add_xVar(a_xVar)
    was_added = false
    return false if index_of_xVar(a_xVar) != -1
    if number_of_xVar >= Y0_n__m.maximum_number_of_xVar
      return was_added
    end

    @xVar << a_xVar
    if a_xVar.index_of_y0_n__m(self) != -1
      was_added = true
    else
      was_added = a_xVar.add_y0_n__m(self)
      unless was_added
        @xVar.delete(a_xVar)
      end
    end
    was_added
  end

  def remove_xVar(a_xVar)
    was_removed = false
    unless @xVar.include?(a_xVar)
      return was_removed
    end

    if number_of_xVar <= Y0_n__m.minimum_number_of_xVar
      return was_removed
    end

    oldIndex = @xVar.index(a_xVar)
    @xVar.delete_at(oldIndex)
    if a_xVar.index_of_y0_n__m(self) == -1
      was_removed = true
    else
      was_removed = a_xVar.remove_y0_n__m(self)
      @xVar.insert(oldIndex,a_xVar) unless was_removed
    end
    was_removed
  end

  def delete
    @deleted = true
    copy_of_xVar = @xVar.dup
    @xVar.clear
    copy_of_xVar.each do |a_xVar|
      a_xVar.remove_y0_n__m(self)
    end
  end

end
end
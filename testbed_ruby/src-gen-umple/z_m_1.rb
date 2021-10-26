# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_M_1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_M_1 Attributes - for documentation purposes
  #attr_reader :num

  #Z_M_1 Associations - for documentation purposes
  #attr_reader :y_m_1

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_m_1 = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_num(a_num)
    was_set = false
    @num = a_num
    was_set = true
    was_set
  end

  def get_num
    @num
  end

  def get_y_m_1(index)
    a_y_m_1 = @y_m_1[index]
    a_y_m_1
  end

  def get_y_m_1
    new_y_m_1 = @y_m_1.dup
    new_y_m_1
  end

  def number_of_y_m_1
    number = @y_m_1.size
    number
  end

  def has_y_m_1
    has = @y_m_1.size > 0
    has
  end

  def index_of_y_m_1(a_y_m_1)
    index = @y_m_1.index(a_y_m_1)
    index = -1 if index.nil?
    index
  end

  def is_number_of_y_m_1_valid
    is_valid = number_of_y_m_1 >= Z_M_1.minimum_number_of_y_m_1 and number_of_y_m_1 <= Z_M_1.maximum_number_of_y_m_1
    is_valid
  end

  def self.required_number_of_y_m_1
    3
  end

  def self.minimum_number_of_y_m_1
    3
  end

  def self.maximum_number_of_y_m_1
    3
  end

  def add_y_m_1(a_y_m_1)
    was_added = false
    return false if index_of_y_m_1(a_y_m_1) != -1
    if number_of_y_m_1 >= Z_M_1.maximum_number_of_y_m_1
      return was_added
    end

    existing_zVar = a_y_m_1.get_zVar
    is_new_zVar = (!existing_zVar.nil? and !existing_zVar.eql?(self))

    if is_new_zVar and existing_zVar.number_of_y_m_1 <= Z_M_1.minimum_number_of_y_m_1
      return was_added
    end

    if is_new_zVar
      a_y_m_1.set_zVar(self)
    else
      @y_m_1 << a_y_m_1
    end
    was_added = true
    was_added
  end

  def remove_y_m_1(a_y_m_1)
    was_removed = false
    # Unable to remove a_y_m_1, as it must always have a zVar
    if a_y_m_1.get_zVar.eql?(self)
      return was_removed
    end

    # zVar already at minimum (3)
    if number_of_y_m_1 <= Z_M_1.minimum_number_of_y_m_1
      return was_removed
    end

    @y_m_1.delete(a_y_m_1)
    was_removed = true
    was_removed
  end

  def delete
    @deleted = true
    while @y_m_1.any? do
      curSize = @y_m_1.size
      @y_m_1[0].delete
      if curSize == @y_m_1.size
          @y_m_1.shift  # this deletes the first value in the array
      end
    end
    @y_m_1.clear
    
  end

end
end
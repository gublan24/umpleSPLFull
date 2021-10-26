# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class XM_1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #XM_1 Attributes - for documentation purposes
  #attr_reader :num

  #XM_1 Associations - for documentation purposes
  #attr_reader :ym_1

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @ym_1 = []
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

  def get_ym_1(index)
    a_ym_1 = @ym_1[index]
    a_ym_1
  end

  def get_ym_1
    new_ym_1 = @ym_1.dup
    new_ym_1
  end

  def number_of_ym_1
    number = @ym_1.size
    number
  end

  def has_ym_1
    has = @ym_1.size > 0
    has
  end

  def index_of_ym_1(a_ym_1)
    index = @ym_1.index(a_ym_1)
    index = -1 if index.nil?
    index
  end

  def is_number_of_ym_1_valid
    is_valid = number_of_ym_1 >= XM_1.minimum_number_of_ym_1 and number_of_ym_1 <= XM_1.maximum_number_of_ym_1
    is_valid
  end

  def self.required_number_of_ym_1
    3
  end

  def self.minimum_number_of_ym_1
    3
  end

  def self.maximum_number_of_ym_1
    3
  end

  def add_ym_1(a_ym_1)
    was_added = false
    return false if index_of_ym_1(a_ym_1) != -1
    if number_of_ym_1 >= XM_1.maximum_number_of_ym_1
      return was_added
    end

    existing_xVar = a_ym_1.get_xVar
    is_new_xVar = (!existing_xVar.nil? and !existing_xVar.eql?(self))

    if is_new_xVar and existing_xVar.number_of_ym_1 <= XM_1.minimum_number_of_ym_1
      return was_added
    end

    if is_new_xVar
      a_ym_1.set_xVar(self)
    else
      @ym_1 << a_ym_1
    end
    was_added = true
    was_added
  end

  def remove_ym_1(a_ym_1)
    was_removed = false
    # Unable to remove a_ym_1, as it must always have a xVar
    if a_ym_1.get_xVar.eql?(self)
      return was_removed
    end

    # xVar already at minimum (3)
    if number_of_ym_1 <= XM_1.minimum_number_of_ym_1
      return was_removed
    end

    @ym_1.delete(a_ym_1)
    was_removed = true
    was_removed
  end

  def delete
    @deleted = true
    while @ym_1.any? do
      curSize = @ym_1.size
      @ym_1[0].delete
      if curSize == @ym_1.size
          @ym_1.shift  # this deletes the first value in the array
      end
    end
    @ym_1.clear
    
  end

end
end
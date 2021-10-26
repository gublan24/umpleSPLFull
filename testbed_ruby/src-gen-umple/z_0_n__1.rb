# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_0_n__1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_0_n__1 Attributes - for documentation purposes
  #attr_reader :num

  #Z_0_n__1 Associations - for documentation purposes
  #attr_reader :y_0_n__1

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_0_n__1 = []
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

  def get_y_0_n__1(index)
    a_y_0_n__1 = @y_0_n__1[index]
    a_y_0_n__1
  end

  def get_y_0_n__1
    new_y_0_n__1 = @y_0_n__1.dup
    new_y_0_n__1
  end

  def number_of_y_0_n__1
    number = @y_0_n__1.size
    number
  end

  def has_y_0_n__1
    has = @y_0_n__1.size > 0
    has
  end

  def index_of_y_0_n__1(a_y_0_n__1)
    index = @y_0_n__1.index(a_y_0_n__1)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_y_0_n__1
    0
  end

  def self.maximum_number_of_y_0_n__1
    3
  end

  def add_y_0_n__1(a_y_0_n__1)
    was_added = false
    return false if index_of_y_0_n__1(a_y_0_n__1) != -1
    if number_of_y_0_n__1 >= Z_0_n__1.maximum_number_of_y_0_n__1
      return was_added
    end

    existing_zVar = a_y_0_n__1.get_zVar
    is_new_zVar = (!existing_zVar.nil? and !existing_zVar.eql?(self))
    if is_new_zVar
      a_y_0_n__1.set_zVar(self)
    else
      @y_0_n__1 << a_y_0_n__1
    end
    was_added = true
    was_added
  end

  def remove_y_0_n__1(a_y_0_n__1)
    was_removed = false
    # Unable to remove a_y_0_n__1, as it must always have a zVar
    unless a_y_0_n__1.get_zVar.eql?(self)
      @y_0_n__1.delete(a_y_0_n__1)
      was_removed = true
    end
    was_removed
  end

  def add_y_0_n__1_at(a_y_0_n__1, index)
    was_added = false
    if add_y_0_n__1(a_y_0_n__1)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_0_n__1())
        index = number_of_y_0_n__1() - 1
      end
      @y_0_n__1.delete(a_y_0_n__1)
      @y_0_n__1.insert(index, a_y_0_n__1)
      was_added = true
    end
    was_added
  end

  def add_or_move_y_0_n__1_at(a_y_0_n__1, index)
    was_added = false
    if @y_0_n__1.include?(a_y_0_n__1)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_0_n__1())
        index = number_of_y_0_n__1() - 1
      end
      @y_0_n__1.delete(a_y_0_n__1)
      @y_0_n__1.insert(index, a_y_0_n__1)
      was_added = true
    else
      was_added = add_y_0_n__1_at(a_y_0_n__1, index)
    end
    was_added
  end

  def delete
    @deleted = true
    while @y_0_n__1.any? do
      curSize = @y_0_n__1.size
      @y_0_n__1[0].delete
      if curSize == @y_0_n__1.size
          @y_0_n__1.shift  # this deletes the first value in the array
      end
    end
    @y_0_n__1.clear
    
  end

end
end
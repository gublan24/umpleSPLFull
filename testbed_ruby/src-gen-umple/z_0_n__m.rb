# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_0_n__m


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_0_n__m Attributes - for documentation purposes
  #attr_reader :num

  #Z_0_n__m Associations - for documentation purposes
  #attr_reader :y_0_n__m

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_0_n__m = []
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

  def get_y_0_n__m(index)
    a_y_0_n__m = @y_0_n__m[index]
    a_y_0_n__m
  end

  def get_y_0_n__m
    new_y_0_n__m = @y_0_n__m.dup
    new_y_0_n__m
  end

  def number_of_y_0_n__m
    number = @y_0_n__m.size
    number
  end

  def has_y_0_n__m
    has = @y_0_n__m.size > 0
    has
  end

  def index_of_y_0_n__m(a_y_0_n__m)
    index = @y_0_n__m.index(a_y_0_n__m)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_y_0_n__m
    0
  end

  def self.maximum_number_of_y_0_n__m
    3
  end

  def add_y_0_n__m(a_y_0_n__m)
    was_added = false
    return false if index_of_y_0_n__m(a_y_0_n__m) != -1
    if number_of_y_0_n__m >= Z_0_n__m.maximum_number_of_y_0_n__m
      return was_added
    end

    @y_0_n__m << a_y_0_n__m
    if a_y_0_n__m.index_of_zVar(self) != -1
      was_added = true
    else
      was_added = a_y_0_n__m.add_zVar(self)
      unless was_added
        @y_0_n__m.delete(a_y_0_n__m)
      end
    end
    was_added
  end

  def remove_y_0_n__m(a_y_0_n__m)
    was_removed = false
    unless @y_0_n__m.include?(a_y_0_n__m)
      return was_removed
    end

    oldIndex = @y_0_n__m.index(a_y_0_n__m)
    @y_0_n__m.delete_at(oldIndex)
    if a_y_0_n__m.index_of_zVar(self) == -1
      was_removed = true
    else
      was_removed = a_y_0_n__m.remove_zVar(self)
      @y_0_n__m.insert(oldIndex,a_y_0_n__m) unless was_removed
    end
    was_removed
  end

  def add_y_0_n__m_at(a_y_0_n__m, index)
    was_added = false
    if add_y_0_n__m(a_y_0_n__m)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_0_n__m())
        index = number_of_y_0_n__m() - 1
      end
      @y_0_n__m.delete(a_y_0_n__m)
      @y_0_n__m.insert(index, a_y_0_n__m)
      was_added = true
    end
    was_added
  end

  def add_or_move_y_0_n__m_at(a_y_0_n__m, index)
    was_added = false
    if @y_0_n__m.include?(a_y_0_n__m)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_0_n__m())
        index = number_of_y_0_n__m() - 1
      end
      @y_0_n__m.delete(a_y_0_n__m)
      @y_0_n__m.insert(index, a_y_0_n__m)
      was_added = true
    else
      was_added = add_y_0_n__m_at(a_y_0_n__m, index)
    end
    was_added
  end

  def delete
    @deleted = true
    copy_of_y_0_n__m = @y_0_n__m.dup
    @y_0_n__m.clear
    copy_of_y_0_n__m.each do |a_y_0_n__m|
      if a_y_0_n__m.number_of_zVar <= YR_0_n__m.minimum_number_of_zVar
        a_y_0_n__m.delete
      else
        a_y_0_n__m.remove_zVar(self)
      end
    end
  end

end
end
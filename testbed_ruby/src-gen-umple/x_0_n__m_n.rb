# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class X0_n__m_n


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #X0_n__m_n Attributes - for documentation purposes
  #attr_reader :num

  #X0_n__m_n Associations - for documentation purposes
  #attr_reader :y0_n__m_n

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y0_n__m_n = []
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

  def get_y0_n__m_n(index)
    a_y0_n__m_n = @y0_n__m_n[index]
    a_y0_n__m_n
  end

  def get_y0_n__m_n
    new_y0_n__m_n = @y0_n__m_n.dup
    new_y0_n__m_n
  end

  def number_of_y0_n__m_n
    number = @y0_n__m_n.size
    number
  end

  def has_y0_n__m_n
    has = @y0_n__m_n.size > 0
    has
  end

  def index_of_y0_n__m_n(a_y0_n__m_n)
    index = @y0_n__m_n.index(a_y0_n__m_n)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_y0_n__m_n
    0
  end

  def self.maximum_number_of_y0_n__m_n
    3
  end

  def add_y0_n__m_n(a_y0_n__m_n)
    was_added = false
    return false if index_of_y0_n__m_n(a_y0_n__m_n) != -1
    if number_of_y0_n__m_n >= X0_n__m_n.maximum_number_of_y0_n__m_n
      return was_added
    end

    @y0_n__m_n << a_y0_n__m_n
    if a_y0_n__m_n.index_of_xVar(self) != -1
      was_added = true
    else
      was_added = a_y0_n__m_n.add_xVar(self)
      unless was_added
        @y0_n__m_n.delete(a_y0_n__m_n)
      end
    end
    was_added
  end

  def remove_y0_n__m_n(a_y0_n__m_n)
    was_removed = false
    unless @y0_n__m_n.include?(a_y0_n__m_n)
      return was_removed
    end

    oldIndex = @y0_n__m_n.index(a_y0_n__m_n)
    @y0_n__m_n.delete_at(oldIndex)
    if a_y0_n__m_n.index_of_xVar(self) == -1
      was_removed = true
    else
      was_removed = a_y0_n__m_n.remove_xVar(self)
      @y0_n__m_n.insert(oldIndex,a_y0_n__m_n) unless was_removed
    end
    was_removed
  end

  def add_y0_n__m_n_at(a_y0_n__m_n, index)
    was_added = false
    if add_y0_n__m_n(a_y0_n__m_n)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y0_n__m_n())
        index = number_of_y0_n__m_n() - 1
      end
      @y0_n__m_n.delete(a_y0_n__m_n)
      @y0_n__m_n.insert(index, a_y0_n__m_n)
      was_added = true
    end
    was_added
  end

  def add_or_move_y0_n__m_n_at(a_y0_n__m_n, index)
    was_added = false
    if @y0_n__m_n.include?(a_y0_n__m_n)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y0_n__m_n())
        index = number_of_y0_n__m_n() - 1
      end
      @y0_n__m_n.delete(a_y0_n__m_n)
      @y0_n__m_n.insert(index, a_y0_n__m_n)
      was_added = true
    else
      was_added = add_y0_n__m_n_at(a_y0_n__m_n, index)
    end
    was_added
  end

  def delete
    @deleted = true
    while @y0_n__m_n.any? do
      curSize = @y0_n__m_n.size
      @y0_n__m_n[0].delete
      if curSize == @y0_n__m_n.size
          @y0_n__m_n.shift  # this deletes the first value in the array
      end
    end
    @y0_n__m_n.clear
    
  end

end
end
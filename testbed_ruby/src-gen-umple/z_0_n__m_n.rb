# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_0_n__m_n


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_0_n__m_n Attributes - for documentation purposes
  #attr_reader :num

  #Z_0_n__m_n Associations - for documentation purposes
  #attr_reader :y_0_n__m_n

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_0_n__m_n = []
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

  def get_y_0_n__m_n(index)
    a_y_0_n__m_n = @y_0_n__m_n[index]
    a_y_0_n__m_n
  end

  def get_y_0_n__m_n
    new_y_0_n__m_n = @y_0_n__m_n.dup
    new_y_0_n__m_n
  end

  def number_of_y_0_n__m_n
    number = @y_0_n__m_n.size
    number
  end

  def has_y_0_n__m_n
    has = @y_0_n__m_n.size > 0
    has
  end

  def index_of_y_0_n__m_n(a_y_0_n__m_n)
    index = @y_0_n__m_n.index(a_y_0_n__m_n)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_y_0_n__m_n
    0
  end

  def self.maximum_number_of_y_0_n__m_n
    3
  end

  def add_y_0_n__m_n(a_y_0_n__m_n)
    was_added = false
    return false if index_of_y_0_n__m_n(a_y_0_n__m_n) != -1
    if number_of_y_0_n__m_n >= Z_0_n__m_n.maximum_number_of_y_0_n__m_n
      return was_added
    end

    @y_0_n__m_n << a_y_0_n__m_n
    if a_y_0_n__m_n.index_of_zVar(self) != -1
      was_added = true
    else
      was_added = a_y_0_n__m_n.add_zVar(self)
      unless was_added
        @y_0_n__m_n.delete(a_y_0_n__m_n)
      end
    end
    was_added
  end

  def remove_y_0_n__m_n(a_y_0_n__m_n)
    was_removed = false
    unless @y_0_n__m_n.include?(a_y_0_n__m_n)
      return was_removed
    end

    oldIndex = @y_0_n__m_n.index(a_y_0_n__m_n)
    @y_0_n__m_n.delete_at(oldIndex)
    if a_y_0_n__m_n.index_of_zVar(self) == -1
      was_removed = true
    else
      was_removed = a_y_0_n__m_n.remove_zVar(self)
      @y_0_n__m_n.insert(oldIndex,a_y_0_n__m_n) unless was_removed
    end
    was_removed
  end

  def add_y_0_n__m_n_at(a_y_0_n__m_n, index)
    was_added = false
    if add_y_0_n__m_n(a_y_0_n__m_n)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_0_n__m_n())
        index = number_of_y_0_n__m_n() - 1
      end
      @y_0_n__m_n.delete(a_y_0_n__m_n)
      @y_0_n__m_n.insert(index, a_y_0_n__m_n)
      was_added = true
    end
    was_added
  end

  def add_or_move_y_0_n__m_n_at(a_y_0_n__m_n, index)
    was_added = false
    if @y_0_n__m_n.include?(a_y_0_n__m_n)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_0_n__m_n())
        index = number_of_y_0_n__m_n() - 1
      end
      @y_0_n__m_n.delete(a_y_0_n__m_n)
      @y_0_n__m_n.insert(index, a_y_0_n__m_n)
      was_added = true
    else
      was_added = add_y_0_n__m_n_at(a_y_0_n__m_n, index)
    end
    was_added
  end

  def delete
    @deleted = true
    copy_of_y_0_n__m_n = @y_0_n__m_n.dup
    @y_0_n__m_n.clear
    copy_of_y_0_n__m_n.each do |a_y_0_n__m_n|
      if a_y_0_n__m_n.number_of_zVar <= YR_0_n__m_n.minimum_number_of_zVar
        a_y_0_n__m_n.delete
      else
        a_y_0_n__m_n.remove_zVar(self)
      end
    end
  end

end
end
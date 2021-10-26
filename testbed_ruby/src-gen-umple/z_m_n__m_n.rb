# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_m_n__m_n


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_m_n__m_n Attributes - for documentation purposes
  #attr_reader :num

  #Z_m_n__m_n Associations - for documentation purposes
  #attr_reader :y_m_n__m_n

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_m_n__m_n = []
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

  def get_y_m_n__m_n(index)
    a_y_m_n__m_n = @y_m_n__m_n[index]
    a_y_m_n__m_n
  end

  def get_y_m_n__m_n
    new_y_m_n__m_n = @y_m_n__m_n.dup
    new_y_m_n__m_n
  end

  def number_of_y_m_n__m_n
    number = @y_m_n__m_n.size
    number
  end

  def has_y_m_n__m_n
    has = @y_m_n__m_n.size > 0
    has
  end

  def index_of_y_m_n__m_n(a_y_m_n__m_n)
    index = @y_m_n__m_n.index(a_y_m_n__m_n)
    index = -1 if index.nil?
    index
  end

  def is_number_of_y_m_n__m_n_valid
    is_valid = number_of_y_m_n__m_n >= Z_m_n__m_n.minimum_number_of_y_m_n__m_n and number_of_y_m_n__m_n <= Z_m_n__m_n.maximum_number_of_y_m_n__m_n
    is_valid
  end

  def self.minimum_number_of_y_m_n__m_n
    2
  end

  def self.maximum_number_of_y_m_n__m_n
    3
  end

  def add_y_m_n__m_n(a_y_m_n__m_n)
    was_added = false
    return false if index_of_y_m_n__m_n(a_y_m_n__m_n) != -1
    if number_of_y_m_n__m_n >= Z_m_n__m_n.maximum_number_of_y_m_n__m_n
      return was_added
    end

    @y_m_n__m_n << a_y_m_n__m_n
    if a_y_m_n__m_n.index_of_zVar(self) != -1
      was_added = true
    else
      was_added = a_y_m_n__m_n.add_zVar(self)
      unless was_added
        @y_m_n__m_n.delete(a_y_m_n__m_n)
      end
    end
    was_added
  end

  def remove_y_m_n__m_n(a_y_m_n__m_n)
    was_removed = false
    unless @y_m_n__m_n.include?(a_y_m_n__m_n)
      return was_removed
    end

    if number_of_y_m_n__m_n <= Z_m_n__m_n.minimum_number_of_y_m_n__m_n
      return was_removed
    end

    oldIndex = @y_m_n__m_n.index(a_y_m_n__m_n)
    @y_m_n__m_n.delete_at(oldIndex)
    if a_y_m_n__m_n.index_of_zVar(self) == -1
      was_removed = true
    else
      was_removed = a_y_m_n__m_n.remove_zVar(self)
      @y_m_n__m_n.insert(oldIndex,a_y_m_n__m_n) unless was_removed
    end
    was_removed
  end

  def set_y_m_n__m_n(new_y_m_n__m_n)
    was_set = false
    verified_y_m_n__m_n = []
    new_y_m_n__m_n.each do |a_y_m_n__m_n|
      next if (verified_y_m_n__m_n.include?(a_y_m_n__m_n)) 
      verified_y_m_n__m_n << a_y_m_n__m_n
    end

    if verified_y_m_n__m_n.size != new_y_m_n__m_n.length or verified_y_m_n__m_n.size < Z_m_n__m_n.minimum_number_of_y_m_n__m_n or verified_y_m_n__m_n.size() > Z_m_n__m_n.maximum_number_of_y_m_n__m_n
      return was_set
    end

    old_y_m_n__m_n = @y_m_n__m_n.dup
    @y_m_n__m_n.clear
    verified_y_m_n__m_n.each do |a_new_y_m_n__m_n|
      @y_m_n__m_n << a_new_y_m_n__m_n
      if old_y_m_n__m_n.include?(a_new_y_m_n__m_n)
        old_y_m_n__m_n.delete(a_new_y_m_n__m_n)
      else
        a_new_y_m_n__m_n.add_zVar(self)
      end
    end

    old_y_m_n__m_n.each do |an_old_y_m_n__m_n|
      an_old_y_m_n__m_n.remove_zVar(self)
    end
    was_set = true
    was_set
  end

  def add_y_m_n__m_n_at(a_y_m_n__m_n, index)
    was_added = false
    if add_y_m_n__m_n(a_y_m_n__m_n)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_m_n__m_n())
        index = number_of_y_m_n__m_n() - 1
      end
      @y_m_n__m_n.delete(a_y_m_n__m_n)
      @y_m_n__m_n.insert(index, a_y_m_n__m_n)
      was_added = true
    end
    was_added
  end

  def add_or_move_y_m_n__m_n_at(a_y_m_n__m_n, index)
    was_added = false
    if @y_m_n__m_n.include?(a_y_m_n__m_n)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_m_n__m_n())
        index = number_of_y_m_n__m_n() - 1
      end
      @y_m_n__m_n.delete(a_y_m_n__m_n)
      @y_m_n__m_n.insert(index, a_y_m_n__m_n)
      was_added = true
    else
      was_added = add_y_m_n__m_n_at(a_y_m_n__m_n, index)
    end
    was_added
  end

  def delete
    @deleted = true
    copy_of_y_m_n__m_n = @y_m_n__m_n.dup
    @y_m_n__m_n.clear
    copy_of_y_m_n__m_n.each do |a_y_m_n__m_n|
      if a_y_m_n__m_n.number_of_zVar <= YR_m_n__m_n.minimum_number_of_zVar
        a_y_m_n__m_n.delete
      else
        a_y_m_n__m_n.remove_zVar(self)
      end
    end
  end

end
end
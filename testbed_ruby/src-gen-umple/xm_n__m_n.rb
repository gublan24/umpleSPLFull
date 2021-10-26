# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Xm_n__m_n


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Xm_n__m_n Attributes - for documentation purposes
  #attr_reader :num

  #Xm_n__m_n Associations - for documentation purposes
  #attr_reader :ym_n__m_n

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @ym_n__m_n = []
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

  def get_ym_n__m_n(index)
    a_ym_n__m_n = @ym_n__m_n[index]
    a_ym_n__m_n
  end

  def get_ym_n__m_n
    new_ym_n__m_n = @ym_n__m_n.dup
    new_ym_n__m_n
  end

  def number_of_ym_n__m_n
    number = @ym_n__m_n.size
    number
  end

  def has_ym_n__m_n
    has = @ym_n__m_n.size > 0
    has
  end

  def index_of_ym_n__m_n(a_ym_n__m_n)
    index = @ym_n__m_n.index(a_ym_n__m_n)
    index = -1 if index.nil?
    index
  end

  def is_number_of_ym_n__m_n_valid
    is_valid = number_of_ym_n__m_n >= Xm_n__m_n.minimum_number_of_ym_n__m_n and number_of_ym_n__m_n <= Xm_n__m_n.maximum_number_of_ym_n__m_n
    is_valid
  end

  def self.minimum_number_of_ym_n__m_n
    2
  end

  def self.maximum_number_of_ym_n__m_n
    3
  end

  def add_ym_n__m_n(a_ym_n__m_n)
    was_added = false
    return false if index_of_ym_n__m_n(a_ym_n__m_n) != -1
    if number_of_ym_n__m_n >= Xm_n__m_n.maximum_number_of_ym_n__m_n
      return was_added
    end

    @ym_n__m_n << a_ym_n__m_n
    if a_ym_n__m_n.index_of_xVar(self) != -1
      was_added = true
    else
      was_added = a_ym_n__m_n.add_xVar(self)
      unless was_added
        @ym_n__m_n.delete(a_ym_n__m_n)
      end
    end
    was_added
  end

  def remove_ym_n__m_n(a_ym_n__m_n)
    was_removed = false
    unless @ym_n__m_n.include?(a_ym_n__m_n)
      return was_removed
    end

    if number_of_ym_n__m_n <= Xm_n__m_n.minimum_number_of_ym_n__m_n
      return was_removed
    end

    oldIndex = @ym_n__m_n.index(a_ym_n__m_n)
    @ym_n__m_n.delete_at(oldIndex)
    if a_ym_n__m_n.index_of_xVar(self) == -1
      was_removed = true
    else
      was_removed = a_ym_n__m_n.remove_xVar(self)
      @ym_n__m_n.insert(oldIndex,a_ym_n__m_n) unless was_removed
    end
    was_removed
  end

  def set_ym_n__m_n(new_ym_n__m_n)
    was_set = false
    verified_ym_n__m_n = []
    new_ym_n__m_n.each do |a_ym_n__m_n|
      next if (verified_ym_n__m_n.include?(a_ym_n__m_n)) 
      verified_ym_n__m_n << a_ym_n__m_n
    end

    if verified_ym_n__m_n.size != new_ym_n__m_n.length or verified_ym_n__m_n.size < Xm_n__m_n.minimum_number_of_ym_n__m_n or verified_ym_n__m_n.size() > Xm_n__m_n.maximum_number_of_ym_n__m_n
      return was_set
    end

    old_ym_n__m_n = @ym_n__m_n.dup
    @ym_n__m_n.clear
    verified_ym_n__m_n.each do |a_new_ym_n__m_n|
      @ym_n__m_n << a_new_ym_n__m_n
      if old_ym_n__m_n.include?(a_new_ym_n__m_n)
        old_ym_n__m_n.delete(a_new_ym_n__m_n)
      else
        a_new_ym_n__m_n.add_xVar(self)
      end
    end

    old_ym_n__m_n.each do |an_old_ym_n__m_n|
      an_old_ym_n__m_n.remove_xVar(self)
    end
    was_set = true
    was_set
  end

  def add_ym_n__m_n_at(a_ym_n__m_n, index)
    was_added = false
    if add_ym_n__m_n(a_ym_n__m_n)
      if(index < 0)
        index = 0
      end
      if(index > number_of_ym_n__m_n())
        index = number_of_ym_n__m_n() - 1
      end
      @ym_n__m_n.delete(a_ym_n__m_n)
      @ym_n__m_n.insert(index, a_ym_n__m_n)
      was_added = true
    end
    was_added
  end

  def add_or_move_ym_n__m_n_at(a_ym_n__m_n, index)
    was_added = false
    if @ym_n__m_n.include?(a_ym_n__m_n)
      if(index < 0)
        index = 0
      end
      if(index > number_of_ym_n__m_n())
        index = number_of_ym_n__m_n() - 1
      end
      @ym_n__m_n.delete(a_ym_n__m_n)
      @ym_n__m_n.insert(index, a_ym_n__m_n)
      was_added = true
    else
      was_added = add_ym_n__m_n_at(a_ym_n__m_n, index)
    end
    was_added
  end

  def delete
    @deleted = true
    while @ym_n__m_n.any? do
      curSize = @ym_n__m_n.size
      @ym_n__m_n[0].delete
      if curSize == @ym_n__m_n.size
          @ym_n__m_n.shift  # this deletes the first value in the array
      end
    end
    @ym_n__m_n.clear
    
  end

end
end
# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Xm_n__m


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Xm_n__m Attributes - for documentation purposes
  #attr_reader :num

  #Xm_n__m Associations - for documentation purposes
  #attr_reader :ym_n__m

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @ym_n__m = []
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

  def get_ym_n__m(index)
    a_ym_n__m = @ym_n__m[index]
    a_ym_n__m
  end

  def get_ym_n__m
    new_ym_n__m = @ym_n__m.dup
    new_ym_n__m
  end

  def number_of_ym_n__m
    number = @ym_n__m.size
    number
  end

  def has_ym_n__m
    has = @ym_n__m.size > 0
    has
  end

  def index_of_ym_n__m(a_ym_n__m)
    index = @ym_n__m.index(a_ym_n__m)
    index = -1 if index.nil?
    index
  end

  def is_number_of_ym_n__m_valid
    is_valid = number_of_ym_n__m >= Xm_n__m.minimum_number_of_ym_n__m and number_of_ym_n__m <= Xm_n__m.maximum_number_of_ym_n__m
    is_valid
  end

  def self.minimum_number_of_ym_n__m
    2
  end

  def self.maximum_number_of_ym_n__m
    3
  end

  def add_ym_n__m(a_ym_n__m)
    was_added = false
    return false if index_of_ym_n__m(a_ym_n__m) != -1
    if number_of_ym_n__m >= Xm_n__m.maximum_number_of_ym_n__m
      return was_added
    end

    @ym_n__m << a_ym_n__m
    if a_ym_n__m.index_of_xVar(self) != -1
      was_added = true
    else
      was_added = a_ym_n__m.add_xVar(self)
      unless was_added
        @ym_n__m.delete(a_ym_n__m)
      end
    end
    was_added
  end

  def remove_ym_n__m(a_ym_n__m)
    was_removed = false
    unless @ym_n__m.include?(a_ym_n__m)
      return was_removed
    end

    if number_of_ym_n__m <= Xm_n__m.minimum_number_of_ym_n__m
      return was_removed
    end

    oldIndex = @ym_n__m.index(a_ym_n__m)
    @ym_n__m.delete_at(oldIndex)
    if a_ym_n__m.index_of_xVar(self) == -1
      was_removed = true
    else
      was_removed = a_ym_n__m.remove_xVar(self)
      @ym_n__m.insert(oldIndex,a_ym_n__m) unless was_removed
    end
    was_removed
  end

  def set_ym_n__m(new_ym_n__m)
    was_set = false
    verified_ym_n__m = []
    new_ym_n__m.each do |a_ym_n__m|
      next if (verified_ym_n__m.include?(a_ym_n__m)) 
      verified_ym_n__m << a_ym_n__m
    end

    if verified_ym_n__m.size != new_ym_n__m.length or verified_ym_n__m.size < Xm_n__m.minimum_number_of_ym_n__m or verified_ym_n__m.size() > Xm_n__m.maximum_number_of_ym_n__m
      return was_set
    end

    old_ym_n__m = @ym_n__m.dup
    @ym_n__m.clear
    verified_ym_n__m.each do |a_new_ym_n__m|
      @ym_n__m << a_new_ym_n__m
      if old_ym_n__m.include?(a_new_ym_n__m)
        old_ym_n__m.delete(a_new_ym_n__m)
      else
        a_new_ym_n__m.add_xVar(self)
      end
    end

    old_ym_n__m.each do |an_old_ym_n__m|
      an_old_ym_n__m.remove_xVar(self)
    end
    was_set = true
    was_set
  end

  def add_ym_n__m_at(a_ym_n__m, index)
    was_added = false
    if add_ym_n__m(a_ym_n__m)
      if(index < 0)
        index = 0
      end
      if(index > number_of_ym_n__m())
        index = number_of_ym_n__m() - 1
      end
      @ym_n__m.delete(a_ym_n__m)
      @ym_n__m.insert(index, a_ym_n__m)
      was_added = true
    end
    was_added
  end

  def add_or_move_ym_n__m_at(a_ym_n__m, index)
    was_added = false
    if @ym_n__m.include?(a_ym_n__m)
      if(index < 0)
        index = 0
      end
      if(index > number_of_ym_n__m())
        index = number_of_ym_n__m() - 1
      end
      @ym_n__m.delete(a_ym_n__m)
      @ym_n__m.insert(index, a_ym_n__m)
      was_added = true
    else
      was_added = add_ym_n__m_at(a_ym_n__m, index)
    end
    was_added
  end

  def delete
    @deleted = true
    while @ym_n__m.any? do
      curSize = @ym_n__m.size
      @ym_n__m[0].delete
      if curSize == @ym_n__m.size
          @ym_n__m.shift  # this deletes the first value in the array
      end
    end
    @ym_n__m.clear
    
  end

end
end
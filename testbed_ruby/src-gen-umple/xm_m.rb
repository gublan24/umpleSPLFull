# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class XM_M


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #XM_M Attributes - for documentation purposes
  #attr_reader :num

  #XM_M Associations - for documentation purposes
  #attr_reader :ym_m

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @ym_m = []
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

  def get_ym_m(index)
    a_ym_m = @ym_m[index]
    a_ym_m
  end

  def get_ym_m
    new_ym_m = @ym_m.dup
    new_ym_m
  end

  def number_of_ym_m
    number = @ym_m.size
    number
  end

  def has_ym_m
    has = @ym_m.size > 0
    has
  end

  def index_of_ym_m(a_ym_m)
    index = @ym_m.index(a_ym_m)
    index = -1 if index.nil?
    index
  end

  def is_number_of_ym_m_valid
    is_valid = number_of_ym_m >= XM_M.minimum_number_of_ym_m and number_of_ym_m <= XM_M.maximum_number_of_ym_m
    is_valid
  end

  def self.required_number_of_ym_m
    3
  end

  def self.minimum_number_of_ym_m
    3
  end

  def self.maximum_number_of_ym_m
    3
  end

  def add_ym_m(a_ym_m)
    was_added = false
    return false if index_of_ym_m(a_ym_m) != -1
    if number_of_ym_m >= XM_M.maximum_number_of_ym_m
      return was_added
    end

    @ym_m << a_ym_m
    if a_ym_m.index_of_xVar(self) != -1
      was_added = true
    else
      was_added = a_ym_m.add_xVar(self)
      unless was_added
        @ym_m.delete(a_ym_m)
      end
    end
    was_added
  end

  def remove_ym_m(a_ym_m)
    was_removed = false
    unless @ym_m.include?(a_ym_m)
      return was_removed
    end

    if number_of_ym_m <= XM_M.minimum_number_of_ym_m
      return was_removed
    end

    oldIndex = @ym_m.index(a_ym_m)
    @ym_m.delete_at(oldIndex)
    if a_ym_m.index_of_xVar(self) == -1
      was_removed = true
    else
      was_removed = a_ym_m.remove_xVar(self)
      @ym_m.insert(oldIndex,a_ym_m) unless was_removed
    end
    was_removed
  end

  def set_ym_m(new_ym_m)
    was_set = false
    verified_ym_m = []
    new_ym_m.each do |a_ym_m|
      next if (verified_ym_m.include?(a_ym_m)) 
      verified_ym_m << a_ym_m
    end

    if verified_ym_m.size != new_ym_m.length or verified_ym_m.size < XM_M.minimum_number_of_ym_m or verified_ym_m.size() > XM_M.maximum_number_of_ym_m
      return was_set
    end

    old_ym_m = @ym_m.dup
    @ym_m.clear
    verified_ym_m.each do |a_new_ym_m|
      @ym_m << a_new_ym_m
      if old_ym_m.include?(a_new_ym_m)
        old_ym_m.delete(a_new_ym_m)
      else
        a_new_ym_m.add_xVar(self)
      end
    end

    old_ym_m.each do |an_old_ym_m|
      an_old_ym_m.remove_xVar(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    while @ym_m.any? do
      curSize = @ym_m.size
      @ym_m[0].delete
      if curSize == @ym_m.size
          @ym_m.shift  # this deletes the first value in the array
      end
    end
    @ym_m.clear
    
  end

end
end
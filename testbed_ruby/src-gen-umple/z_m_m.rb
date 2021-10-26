# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_M_M


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_M_M Attributes - for documentation purposes
  #attr_reader :num

  #Z_M_M Associations - for documentation purposes
  #attr_reader :y_m_m

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_m_m = []
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

  def get_y_m_m(index)
    a_y_m_m = @y_m_m[index]
    a_y_m_m
  end

  def get_y_m_m
    new_y_m_m = @y_m_m.dup
    new_y_m_m
  end

  def number_of_y_m_m
    number = @y_m_m.size
    number
  end

  def has_y_m_m
    has = @y_m_m.size > 0
    has
  end

  def index_of_y_m_m(a_y_m_m)
    index = @y_m_m.index(a_y_m_m)
    index = -1 if index.nil?
    index
  end

  def is_number_of_y_m_m_valid
    is_valid = number_of_y_m_m >= Z_M_M.minimum_number_of_y_m_m and number_of_y_m_m <= Z_M_M.maximum_number_of_y_m_m
    is_valid
  end

  def self.required_number_of_y_m_m
    3
  end

  def self.minimum_number_of_y_m_m
    3
  end

  def self.maximum_number_of_y_m_m
    3
  end

  def add_y_m_m(a_y_m_m)
    was_added = false
    return false if index_of_y_m_m(a_y_m_m) != -1
    if number_of_y_m_m >= Z_M_M.maximum_number_of_y_m_m
      return was_added
    end

    @y_m_m << a_y_m_m
    if a_y_m_m.index_of_zVar(self) != -1
      was_added = true
    else
      was_added = a_y_m_m.add_zVar(self)
      unless was_added
        @y_m_m.delete(a_y_m_m)
      end
    end
    was_added
  end

  def remove_y_m_m(a_y_m_m)
    was_removed = false
    unless @y_m_m.include?(a_y_m_m)
      return was_removed
    end

    if number_of_y_m_m <= Z_M_M.minimum_number_of_y_m_m
      return was_removed
    end

    oldIndex = @y_m_m.index(a_y_m_m)
    @y_m_m.delete_at(oldIndex)
    if a_y_m_m.index_of_zVar(self) == -1
      was_removed = true
    else
      was_removed = a_y_m_m.remove_zVar(self)
      @y_m_m.insert(oldIndex,a_y_m_m) unless was_removed
    end
    was_removed
  end

  def set_y_m_m(new_y_m_m)
    was_set = false
    verified_y_m_m = []
    new_y_m_m.each do |a_y_m_m|
      next if (verified_y_m_m.include?(a_y_m_m)) 
      verified_y_m_m << a_y_m_m
    end

    if verified_y_m_m.size != new_y_m_m.length or verified_y_m_m.size < Z_M_M.minimum_number_of_y_m_m or verified_y_m_m.size() > Z_M_M.maximum_number_of_y_m_m
      return was_set
    end

    old_y_m_m = @y_m_m.dup
    @y_m_m.clear
    verified_y_m_m.each do |a_new_y_m_m|
      @y_m_m << a_new_y_m_m
      if old_y_m_m.include?(a_new_y_m_m)
        old_y_m_m.delete(a_new_y_m_m)
      else
        a_new_y_m_m.add_zVar(self)
      end
    end

    old_y_m_m.each do |an_old_y_m_m|
      an_old_y_m_m.remove_zVar(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    copy_of_y_m_m = @y_m_m.dup
    @y_m_m.clear
    copy_of_y_m_m.each do |a_y_m_m|
      if a_y_m_m.number_of_zVar <= YR_M_M.minimum_number_of_zVar
        a_y_m_m.delete
      else
        a_y_m_m.remove_zVar(self)
      end
    end
  end

end
end
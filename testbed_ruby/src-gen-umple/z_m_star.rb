# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_M_star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_M_star Attributes - for documentation purposes
  #attr_reader :num

  #Z_M_star Associations - for documentation purposes
  #attr_reader :y_m_star

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num, all_y_m_star)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_m_star = []
    did_add_y_m_star = set_y_m_star(all_y_m_star)
    raise "Unable to create Z_M_star, must have 3 @y_m_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_y_m_star
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

  def get_y_m_star(index)
    a_y_m_star = @y_m_star[index]
    a_y_m_star
  end

  def get_y_m_star
    new_y_m_star = @y_m_star.dup
    new_y_m_star
  end

  def number_of_y_m_star
    number = @y_m_star.size
    number
  end

  def has_y_m_star
    has = @y_m_star.size > 0
    has
  end

  def index_of_y_m_star(a_y_m_star)
    index = @y_m_star.index(a_y_m_star)
    index = -1 if index.nil?
    index
  end

  def is_number_of_y_m_star_valid
    is_valid = number_of_y_m_star >= Z_M_star.minimum_number_of_y_m_star and number_of_y_m_star <= Z_M_star.maximum_number_of_y_m_star
    is_valid
  end

  def self.required_number_of_y_m_star
    3
  end

  def self.minimum_number_of_y_m_star
    3
  end

  def self.maximum_number_of_y_m_star
    3
  end

  def add_y_m_star(a_y_m_star)
    was_added = false
    return false if index_of_y_m_star(a_y_m_star) != -1
    if number_of_y_m_star >= Z_M_star.maximum_number_of_y_m_star
      return was_added
    end

    @y_m_star << a_y_m_star
    if a_y_m_star.index_of_zVar(self) != -1
      was_added = true
    else
      was_added = a_y_m_star.add_zVar(self)
      unless was_added
        @y_m_star.delete(a_y_m_star)
      end
    end
    was_added
  end

  def remove_y_m_star(a_y_m_star)
    was_removed = false
    unless @y_m_star.include?(a_y_m_star)
      return was_removed
    end

    if number_of_y_m_star <= Z_M_star.minimum_number_of_y_m_star
      return was_removed
    end

    oldIndex = @y_m_star.index(a_y_m_star)
    @y_m_star.delete_at(oldIndex)
    if a_y_m_star.index_of_zVar(self) == -1
      was_removed = true
    else
      was_removed = a_y_m_star.remove_zVar(self)
      @y_m_star.insert(oldIndex,a_y_m_star) unless was_removed
    end
    was_removed
  end

  def set_y_m_star(new_y_m_star)
    was_set = false
    verified_y_m_star = []
    new_y_m_star.each do |a_y_m_star|
      next if (verified_y_m_star.include?(a_y_m_star)) 
      verified_y_m_star << a_y_m_star
    end

    if verified_y_m_star.size != new_y_m_star.length or verified_y_m_star.size < Z_M_star.minimum_number_of_y_m_star or verified_y_m_star.size() > Z_M_star.maximum_number_of_y_m_star
      return was_set
    end

    old_y_m_star = @y_m_star.dup
    @y_m_star.clear
    verified_y_m_star.each do |a_new_y_m_star|
      @y_m_star << a_new_y_m_star
      if old_y_m_star.include?(a_new_y_m_star)
        old_y_m_star.delete(a_new_y_m_star)
      else
        a_new_y_m_star.add_zVar(self)
      end
    end

    old_y_m_star.each do |an_old_y_m_star|
      an_old_y_m_star.remove_zVar(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    copy_of_y_m_star = @y_m_star.dup
    @y_m_star.clear
    copy_of_y_m_star.each do |a_y_m_star|
      a_y_m_star.remove_zVar(self)
    end
  end

end
end
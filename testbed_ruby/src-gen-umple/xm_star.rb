# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class XM_star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #XM_star Attributes - for documentation purposes
  #attr_reader :num

  #XM_star Associations - for documentation purposes
  #attr_reader :ym_star

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num, all_ym_star)
    @initialized = false
    @deleted = false
    @num = a_num
    @ym_star = []
    did_add_ym_star = set_ym_star(all_ym_star)
    raise "Unable to create XM_star, must have 3 @ym_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_ym_star
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

  def get_ym_star(index)
    a_ym_star = @ym_star[index]
    a_ym_star
  end

  def get_ym_star
    new_ym_star = @ym_star.dup
    new_ym_star
  end

  def number_of_ym_star
    number = @ym_star.size
    number
  end

  def has_ym_star
    has = @ym_star.size > 0
    has
  end

  def index_of_ym_star(a_ym_star)
    index = @ym_star.index(a_ym_star)
    index = -1 if index.nil?
    index
  end

  def is_number_of_ym_star_valid
    is_valid = number_of_ym_star >= XM_star.minimum_number_of_ym_star and number_of_ym_star <= XM_star.maximum_number_of_ym_star
    is_valid
  end

  def self.required_number_of_ym_star
    3
  end

  def self.minimum_number_of_ym_star
    3
  end

  def self.maximum_number_of_ym_star
    3
  end

  def add_ym_star(a_ym_star)
    was_added = false
    return false if index_of_ym_star(a_ym_star) != -1
    if number_of_ym_star >= XM_star.maximum_number_of_ym_star
      return was_added
    end

    @ym_star << a_ym_star
    if a_ym_star.index_of_xVar(self) != -1
      was_added = true
    else
      was_added = a_ym_star.add_xVar(self)
      unless was_added
        @ym_star.delete(a_ym_star)
      end
    end
    was_added
  end

  def remove_ym_star(a_ym_star)
    was_removed = false
    unless @ym_star.include?(a_ym_star)
      return was_removed
    end

    if number_of_ym_star <= XM_star.minimum_number_of_ym_star
      return was_removed
    end

    oldIndex = @ym_star.index(a_ym_star)
    @ym_star.delete_at(oldIndex)
    if a_ym_star.index_of_xVar(self) == -1
      was_removed = true
    else
      was_removed = a_ym_star.remove_xVar(self)
      @ym_star.insert(oldIndex,a_ym_star) unless was_removed
    end
    was_removed
  end

  def set_ym_star(new_ym_star)
    was_set = false
    verified_ym_star = []
    new_ym_star.each do |a_ym_star|
      next if (verified_ym_star.include?(a_ym_star)) 
      verified_ym_star << a_ym_star
    end

    if verified_ym_star.size != new_ym_star.length or verified_ym_star.size < XM_star.minimum_number_of_ym_star or verified_ym_star.size() > XM_star.maximum_number_of_ym_star
      return was_set
    end

    old_ym_star = @ym_star.dup
    @ym_star.clear
    verified_ym_star.each do |a_new_ym_star|
      @ym_star << a_new_ym_star
      if old_ym_star.include?(a_new_ym_star)
        old_ym_star.delete(a_new_ym_star)
      else
        a_new_ym_star.add_xVar(self)
      end
    end

    old_ym_star.each do |an_old_ym_star|
      an_old_ym_star.remove_xVar(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    while @ym_star.any? do
      curSize = @ym_star.size
      @ym_star[0].delete
      if curSize == @ym_star.size
          @ym_star.shift  # this deletes the first value in the array
      end
    end
    @ym_star.clear
    
  end

end
end
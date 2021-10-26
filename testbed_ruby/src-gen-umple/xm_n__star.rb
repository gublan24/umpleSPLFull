# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Xm_n__star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Xm_n__star Attributes - for documentation purposes
  #attr_reader :num

  #Xm_n__star Associations - for documentation purposes
  #attr_reader :ym_n__star

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num, all_ym_n__star)
    @initialized = false
    @deleted = false
    @num = a_num
    @ym_n__star = []
    did_add_ym_n__star = set_ym_n__star(all_ym_n__star)
    raise "Unable to create Xm_n__star, must have 2 to 3 @ym_n__star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_ym_n__star
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

  def get_ym_n__star(index)
    a_ym_n__star = @ym_n__star[index]
    a_ym_n__star
  end

  def get_ym_n__star
    new_ym_n__star = @ym_n__star.dup
    new_ym_n__star
  end

  def number_of_ym_n__star
    number = @ym_n__star.size
    number
  end

  def has_ym_n__star
    has = @ym_n__star.size > 0
    has
  end

  def index_of_ym_n__star(a_ym_n__star)
    index = @ym_n__star.index(a_ym_n__star)
    index = -1 if index.nil?
    index
  end

  def is_number_of_ym_n__star_valid
    is_valid = number_of_ym_n__star >= Xm_n__star.minimum_number_of_ym_n__star and number_of_ym_n__star <= Xm_n__star.maximum_number_of_ym_n__star
    is_valid
  end

  def self.minimum_number_of_ym_n__star
    2
  end

  def self.maximum_number_of_ym_n__star
    3
  end

  def add_ym_n__star(a_ym_n__star)
    was_added = false
    return false if index_of_ym_n__star(a_ym_n__star) != -1
    if number_of_ym_n__star >= Xm_n__star.maximum_number_of_ym_n__star
      return was_added
    end

    @ym_n__star << a_ym_n__star
    if a_ym_n__star.index_of_xVar(self) != -1
      was_added = true
    else
      was_added = a_ym_n__star.add_xVar(self)
      unless was_added
        @ym_n__star.delete(a_ym_n__star)
      end
    end
    was_added
  end

  def remove_ym_n__star(a_ym_n__star)
    was_removed = false
    unless @ym_n__star.include?(a_ym_n__star)
      return was_removed
    end

    if number_of_ym_n__star <= Xm_n__star.minimum_number_of_ym_n__star
      return was_removed
    end

    oldIndex = @ym_n__star.index(a_ym_n__star)
    @ym_n__star.delete_at(oldIndex)
    if a_ym_n__star.index_of_xVar(self) == -1
      was_removed = true
    else
      was_removed = a_ym_n__star.remove_xVar(self)
      @ym_n__star.insert(oldIndex,a_ym_n__star) unless was_removed
    end
    was_removed
  end

  def set_ym_n__star(new_ym_n__star)
    was_set = false
    verified_ym_n__star = []
    new_ym_n__star.each do |a_ym_n__star|
      next if (verified_ym_n__star.include?(a_ym_n__star)) 
      verified_ym_n__star << a_ym_n__star
    end

    if verified_ym_n__star.size != new_ym_n__star.length or verified_ym_n__star.size < Xm_n__star.minimum_number_of_ym_n__star or verified_ym_n__star.size() > Xm_n__star.maximum_number_of_ym_n__star
      return was_set
    end

    old_ym_n__star = @ym_n__star.dup
    @ym_n__star.clear
    verified_ym_n__star.each do |a_new_ym_n__star|
      @ym_n__star << a_new_ym_n__star
      if old_ym_n__star.include?(a_new_ym_n__star)
        old_ym_n__star.delete(a_new_ym_n__star)
      else
        a_new_ym_n__star.add_xVar(self)
      end
    end

    old_ym_n__star.each do |an_old_ym_n__star|
      an_old_ym_n__star.remove_xVar(self)
    end
    was_set = true
    was_set
  end

  def add_ym_n__star_at(a_ym_n__star, index)
    was_added = false
    if add_ym_n__star(a_ym_n__star)
      if(index < 0)
        index = 0
      end
      if(index > number_of_ym_n__star())
        index = number_of_ym_n__star() - 1
      end
      @ym_n__star.delete(a_ym_n__star)
      @ym_n__star.insert(index, a_ym_n__star)
      was_added = true
    end
    was_added
  end

  def add_or_move_ym_n__star_at(a_ym_n__star, index)
    was_added = false
    if @ym_n__star.include?(a_ym_n__star)
      if(index < 0)
        index = 0
      end
      if(index > number_of_ym_n__star())
        index = number_of_ym_n__star() - 1
      end
      @ym_n__star.delete(a_ym_n__star)
      @ym_n__star.insert(index, a_ym_n__star)
      was_added = true
    else
      was_added = add_ym_n__star_at(a_ym_n__star, index)
    end
    was_added
  end

  def delete
    @deleted = true
    while @ym_n__star.any? do
      curSize = @ym_n__star.size
      @ym_n__star[0].delete
      if curSize == @ym_n__star.size
          @ym_n__star.shift  # this deletes the first value in the array
      end
    end
    @ym_n__star.clear
    
  end

end
end
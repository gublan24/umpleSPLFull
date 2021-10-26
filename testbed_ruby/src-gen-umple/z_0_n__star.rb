# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_0_n__star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_0_n__star Attributes - for documentation purposes
  #attr_reader :num

  #Z_0_n__star Associations - for documentation purposes
  #attr_reader :y_0_n__star

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_0_n__star = []
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

  def get_y_0_n__star(index)
    a_y_0_n__star = @y_0_n__star[index]
    a_y_0_n__star
  end

  def get_y_0_n__star
    new_y_0_n__star = @y_0_n__star.dup
    new_y_0_n__star
  end

  def number_of_y_0_n__star
    number = @y_0_n__star.size
    number
  end

  def has_y_0_n__star
    has = @y_0_n__star.size > 0
    has
  end

  def index_of_y_0_n__star(a_y_0_n__star)
    index = @y_0_n__star.index(a_y_0_n__star)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_y_0_n__star
    0
  end

  def self.maximum_number_of_y_0_n__star
    3
  end

  def add_y_0_n__star(a_y_0_n__star)
    was_added = false
    return false if index_of_y_0_n__star(a_y_0_n__star) != -1
    if number_of_y_0_n__star >= Z_0_n__star.maximum_number_of_y_0_n__star
      return was_added
    end

    @y_0_n__star << a_y_0_n__star
    if a_y_0_n__star.index_of_zVar(self) != -1
      was_added = true
    else
      was_added = a_y_0_n__star.add_zVar(self)
      unless was_added
        @y_0_n__star.delete(a_y_0_n__star)
      end
    end
    was_added
  end

  def remove_y_0_n__star(a_y_0_n__star)
    was_removed = false
    unless @y_0_n__star.include?(a_y_0_n__star)
      return was_removed
    end

    oldIndex = @y_0_n__star.index(a_y_0_n__star)
    @y_0_n__star.delete_at(oldIndex)
    if a_y_0_n__star.index_of_zVar(self) == -1
      was_removed = true
    else
      was_removed = a_y_0_n__star.remove_zVar(self)
      @y_0_n__star.insert(oldIndex,a_y_0_n__star) unless was_removed
    end
    was_removed
  end

  def set_y_0_n__star(new_y_0_n__star)
    was_set = false
    verified_y_0_n__star = []
    new_y_0_n__star.each do |a_y_0_n__star|
      next if (verified_y_0_n__star.include?(a_y_0_n__star))
      verified_y_0_n__star << a_y_0_n__star
    end

    if (verified_y_0_n__star.size != new_y_0_n__star.size or verified_y_0_n__star.size() > Z_0_n__star.maximum_number_of_y_0_n__star)
      return was_set
    end

    old_y_0_n__star = @y_0_n__star.dup
    @y_0_n__star.clear
    verified_y_0_n__star.each do |a_new_y_0_n__star|
      @y_0_n__star << a_new_y_0_n__star
      if (old_y_0_n__star.include?(a_new_y_0_n__star))
        old_y_0_n__star.delete(a_new_y_0_n__star)
      else
        a_new_y_0_n__star.add_zVar(self)
      end
    end

    old_y_0_n__star.each do |an_old_y_0_n__star|
      an_old_y_0_n__star.remove_zVar(self)
    end
    was_set = true
    was_set
  end

  def add_y_0_n__star_at(a_y_0_n__star, index)
    was_added = false
    if add_y_0_n__star(a_y_0_n__star)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_0_n__star())
        index = number_of_y_0_n__star() - 1
      end
      @y_0_n__star.delete(a_y_0_n__star)
      @y_0_n__star.insert(index, a_y_0_n__star)
      was_added = true
    end
    was_added
  end

  def add_or_move_y_0_n__star_at(a_y_0_n__star, index)
    was_added = false
    if @y_0_n__star.include?(a_y_0_n__star)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_0_n__star())
        index = number_of_y_0_n__star() - 1
      end
      @y_0_n__star.delete(a_y_0_n__star)
      @y_0_n__star.insert(index, a_y_0_n__star)
      was_added = true
    else
      was_added = add_y_0_n__star_at(a_y_0_n__star, index)
    end
    was_added
  end

  def delete
    @deleted = true
    copy_of_y_0_n__star = @y_0_n__star.dup
    @y_0_n__star.clear
    copy_of_y_0_n__star.each do |a_y_0_n__star|
      a_y_0_n__star.remove_zVar(self)
    end
  end

end
end
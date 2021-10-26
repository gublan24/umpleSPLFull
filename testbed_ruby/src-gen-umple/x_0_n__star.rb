# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class X0_n__star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #X0_n__star Attributes - for documentation purposes
  #attr_reader :num

  #X0_n__star Associations - for documentation purposes
  #attr_reader :y0_n__star

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y0_n__star = []
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

  def get_y0_n__star(index)
    a_y0_n__star = @y0_n__star[index]
    a_y0_n__star
  end

  def get_y0_n__star
    new_y0_n__star = @y0_n__star.dup
    new_y0_n__star
  end

  def number_of_y0_n__star
    number = @y0_n__star.size
    number
  end

  def has_y0_n__star
    has = @y0_n__star.size > 0
    has
  end

  def index_of_y0_n__star(a_y0_n__star)
    index = @y0_n__star.index(a_y0_n__star)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_y0_n__star
    0
  end

  def self.maximum_number_of_y0_n__star
    3
  end

  def add_y0_n__star(a_y0_n__star)
    was_added = false
    return false if index_of_y0_n__star(a_y0_n__star) != -1
    if number_of_y0_n__star >= X0_n__star.maximum_number_of_y0_n__star
      return was_added
    end

    @y0_n__star << a_y0_n__star
    if a_y0_n__star.index_of_xVar(self) != -1
      was_added = true
    else
      was_added = a_y0_n__star.add_xVar(self)
      unless was_added
        @y0_n__star.delete(a_y0_n__star)
      end
    end
    was_added
  end

  def remove_y0_n__star(a_y0_n__star)
    was_removed = false
    unless @y0_n__star.include?(a_y0_n__star)
      return was_removed
    end

    oldIndex = @y0_n__star.index(a_y0_n__star)
    @y0_n__star.delete_at(oldIndex)
    if a_y0_n__star.index_of_xVar(self) == -1
      was_removed = true
    else
      was_removed = a_y0_n__star.remove_xVar(self)
      @y0_n__star.insert(oldIndex,a_y0_n__star) unless was_removed
    end
    was_removed
  end

  def set_y0_n__star(new_y0_n__star)
    was_set = false
    verified_y0_n__star = []
    new_y0_n__star.each do |a_y0_n__star|
      next if (verified_y0_n__star.include?(a_y0_n__star))
      verified_y0_n__star << a_y0_n__star
    end

    if (verified_y0_n__star.size != new_y0_n__star.size or verified_y0_n__star.size() > X0_n__star.maximum_number_of_y0_n__star)
      return was_set
    end

    old_y0_n__star = @y0_n__star.dup
    @y0_n__star.clear
    verified_y0_n__star.each do |a_new_y0_n__star|
      @y0_n__star << a_new_y0_n__star
      if (old_y0_n__star.include?(a_new_y0_n__star))
        old_y0_n__star.delete(a_new_y0_n__star)
      else
        a_new_y0_n__star.add_xVar(self)
      end
    end

    old_y0_n__star.each do |an_old_y0_n__star|
      an_old_y0_n__star.remove_xVar(self)
    end
    was_set = true
    was_set
  end

  def add_y0_n__star_at(a_y0_n__star, index)
    was_added = false
    if add_y0_n__star(a_y0_n__star)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y0_n__star())
        index = number_of_y0_n__star() - 1
      end
      @y0_n__star.delete(a_y0_n__star)
      @y0_n__star.insert(index, a_y0_n__star)
      was_added = true
    end
    was_added
  end

  def add_or_move_y0_n__star_at(a_y0_n__star, index)
    was_added = false
    if @y0_n__star.include?(a_y0_n__star)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y0_n__star())
        index = number_of_y0_n__star() - 1
      end
      @y0_n__star.delete(a_y0_n__star)
      @y0_n__star.insert(index, a_y0_n__star)
      was_added = true
    else
      was_added = add_y0_n__star_at(a_y0_n__star, index)
    end
    was_added
  end

  def delete
    @deleted = true
    while @y0_n__star.any? do
      curSize = @y0_n__star.size
      @y0_n__star[0].delete
      if curSize == @y0_n__star.size
          @y0_n__star.shift  # this deletes the first value in the array
      end
    end
    @y0_n__star.clear
    
  end

end
end
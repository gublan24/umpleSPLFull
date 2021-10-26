# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_star_star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_star_star Attributes - for documentation purposes
  #attr_reader :num

  #Z_star_star Associations - for documentation purposes
  #attr_reader :y_star_star

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_star_star = []
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

  def get_y_star_star(index)
    a_y_star_star = @y_star_star[index]
    a_y_star_star
  end

  def get_y_star_star
    new_y_star_star = @y_star_star.dup
    new_y_star_star
  end

  def number_of_y_star_star
    number = @y_star_star.size
    number
  end

  def has_y_star_star
    has = @y_star_star.size > 0
    has
  end

  def index_of_y_star_star(a_y_star_star)
    index = @y_star_star.index(a_y_star_star)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_y_star_star
    0
  end

  def add_y_star_star(a_y_star_star)
    was_added = false
    return false if index_of_y_star_star(a_y_star_star) != -1
    @y_star_star << a_y_star_star
    if a_y_star_star.index_of_zVar(self) != -1
      was_added = true
    else
      was_added = a_y_star_star.add_zVar(self)
      unless was_added
        @y_star_star.delete(a_y_star_star)
      end
    end
    was_added
  end

  def remove_y_star_star(a_y_star_star)
    was_removed = false
    unless @y_star_star.include?(a_y_star_star)
      return was_removed
    end

    oldIndex = @y_star_star.index(a_y_star_star)
    @y_star_star.delete_at(oldIndex)
    if a_y_star_star.index_of_zVar(self) == -1
      was_removed = true
    else
      was_removed = a_y_star_star.remove_zVar(self)
      @y_star_star.insert(oldIndex,a_y_star_star) unless was_removed
    end
    was_removed
  end

  def add_y_star_star_at(a_y_star_star, index)
    was_added = false
    if add_y_star_star(a_y_star_star)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_star_star())
        index = number_of_y_star_star() - 1
      end
      @y_star_star.delete(a_y_star_star)
      @y_star_star.insert(index, a_y_star_star)
      was_added = true
    end
    was_added
  end

  def add_or_move_y_star_star_at(a_y_star_star, index)
    was_added = false
    if @y_star_star.include?(a_y_star_star)
      if(index < 0)
        index = 0
      end
      if(index > number_of_y_star_star())
        index = number_of_y_star_star() - 1
      end
      @y_star_star.delete(a_y_star_star)
      @y_star_star.insert(index, a_y_star_star)
      was_added = true
    else
      was_added = add_y_star_star_at(a_y_star_star, index)
    end
    was_added
  end

  def delete
    @deleted = true
    while @y_star_star.any? do
      curSize = @y_star_star.size
      @y_star_star[0].remove_zVar(self)
      if curSize == @y_star_star.size
          @y_star_star.shift  # this deletes the first value in the array
      end
    end
    @y_star_star.clear
  end

end
end
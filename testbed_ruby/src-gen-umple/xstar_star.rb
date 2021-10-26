# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Xstar_star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Xstar_star Attributes - for documentation purposes
  #attr_reader :num

  #Xstar_star Associations - for documentation purposes
  #attr_reader :ystar_star

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @ystar_star = []
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

  def get_ystar_star(index)
    a_ystar_star = @ystar_star[index]
    a_ystar_star
  end

  def get_ystar_star
    new_ystar_star = @ystar_star.dup
    new_ystar_star
  end

  def number_of_ystar_star
    number = @ystar_star.size
    number
  end

  def has_ystar_star
    has = @ystar_star.size > 0
    has
  end

  def index_of_ystar_star(a_ystar_star)
    index = @ystar_star.index(a_ystar_star)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_ystar_star
    0
  end

  def add_ystar_star(a_ystar_star)
    was_added = false
    return false if index_of_ystar_star(a_ystar_star) != -1
    @ystar_star << a_ystar_star
    if a_ystar_star.index_of_xVar(self) != -1
      was_added = true
    else
      was_added = a_ystar_star.add_xVar(self)
      unless was_added
        @ystar_star.delete(a_ystar_star)
      end
    end
    was_added
  end

  def remove_ystar_star(a_ystar_star)
    was_removed = false
    unless @ystar_star.include?(a_ystar_star)
      return was_removed
    end

    oldIndex = @ystar_star.index(a_ystar_star)
    @ystar_star.delete_at(oldIndex)
    if a_ystar_star.index_of_xVar(self) == -1
      was_removed = true
    else
      was_removed = a_ystar_star.remove_xVar(self)
      @ystar_star.insert(oldIndex,a_ystar_star) unless was_removed
    end
    was_removed
  end

  def add_ystar_star_at(a_ystar_star, index)
    was_added = false
    if add_ystar_star(a_ystar_star)
      if(index < 0)
        index = 0
      end
      if(index > number_of_ystar_star())
        index = number_of_ystar_star() - 1
      end
      @ystar_star.delete(a_ystar_star)
      @ystar_star.insert(index, a_ystar_star)
      was_added = true
    end
    was_added
  end

  def add_or_move_ystar_star_at(a_ystar_star, index)
    was_added = false
    if @ystar_star.include?(a_ystar_star)
      if(index < 0)
        index = 0
      end
      if(index > number_of_ystar_star())
        index = number_of_ystar_star() - 1
      end
      @ystar_star.delete(a_ystar_star)
      @ystar_star.insert(index, a_ystar_star)
      was_added = true
    else
      was_added = add_ystar_star_at(a_ystar_star, index)
    end
    was_added
  end

  def delete
    @deleted = true
    while @ystar_star.any? do
      curSize = @ystar_star.size
      @ystar_star[0].delete
      if curSize == @ystar_star.size
          @ystar_star.shift  # this deletes the first value in the array
      end
    end
    @ystar_star.clear
    
  end

end
end
# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Y1_star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Y1_star Attributes - for documentation purposes
  #attr_reader :v

  #Y1_star Associations - for documentation purposes
  #attr_reader :xVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @v = 1
    @xVar = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_v(a_v)
    was_set = false
    @v = a_v
    was_set = true
    was_set
  end

  def get_v
    @v
  end

  def get_xVar(index)
    a_xVar = @xVar[index]
    a_xVar
  end

  def get_xVar
    new_xVar = @xVar.dup
    new_xVar
  end

  def number_of_xVar
    number = @xVar.size
    number
  end

  def has_xVar
    has = @xVar.size > 0
    has
  end

  def index_of_xVar(a_xVar)
    index = @xVar.index(a_xVar)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_xVar
    0
  end

  def add_xVar(a_xVar)
    was_added = false
    return false if index_of_xVar(a_xVar) != -1
    existing_y1_star = a_xVar.get_y1_star
    is_new_y1_star = (!existing_y1_star.nil? and !existing_y1_star.eql?(self))
    if is_new_y1_star
      a_xVar.set_y1_star(self)
    else
      @xVar << a_xVar
    end
    was_added = true
    was_added
  end

  def remove_xVar(a_xVar)
    was_removed = false
    # Unable to remove a_xVar, as it must always have a y1_star
    unless a_xVar.get_y1_star.eql?(self)
      @xVar.delete(a_xVar)
      was_removed = true
    end
    was_removed
  end

  def add_xVar_at(a_xVar, index)
    was_added = false
    if add_xVar(a_xVar)
      if(index < 0)
        index = 0
      end
      if(index > number_of_xVar())
        index = number_of_xVar() - 1
      end
      @xVar.delete(a_xVar)
      @xVar.insert(index, a_xVar)
      was_added = true
    end
    was_added
  end

  def add_or_move_xVar_at(a_xVar, index)
    was_added = false
    if @xVar.include?(a_xVar)
      if(index < 0)
        index = 0
      end
      if(index > number_of_xVar())
        index = number_of_xVar() - 1
      end
      @xVar.delete(a_xVar)
      @xVar.insert(index, a_xVar)
      was_added = true
    else
      was_added = add_xVar_at(a_xVar, index)
    end
    was_added
  end

  def delete
    @deleted = true
    while @xVar.any? do
      curSize = @xVar.size
      @xVar[0].delete
      if curSize == @xVar.size
          @xVar.shift  # this deletes the first value in the array
      end
    end
    @xVar.clear
    
  end

end
end
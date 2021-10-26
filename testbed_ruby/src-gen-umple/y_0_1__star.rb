# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Y0_1__star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Y0_1__star Attributes - for documentation purposes
  #attr_reader :v

  #Y0_1__star Associations - for documentation purposes
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
    existing_y0_1__star = a_xVar.get_y0_1__star
    if existing_y0_1__star.nil?
      a_xVar.set_y0_1__star(self)
    elsif !existing_y0_1__star.eql?(self)
      existing_y0_1__star.remove_xVar(a_xVar)
      add_xVar(a_xVar)
    else
      @xVar << a_xVar
    end
    was_added = true
    was_added
  end

  def remove_xVar(a_xVar)
    was_removed = false
    if @xVar.include?(a_xVar)
      @xVar.delete(a_xVar)
      a_xVar.set_y0_1__star(nil)
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
      @xVar[0].instance_variable_set("@y0_1__star",nil)
      @xVar.shift  # this deletes the first value in the array
    end
    @xVar.clear    
  end

end
end
# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class YR_0_1__star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #YR_0_1__star Attributes - for documentation purposes
  #attr_reader :v

  #YR_0_1__star Associations - for documentation purposes
  #attr_reader :zVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @v = 1
    @zVar = []
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

  def get_zVar(index)
    a_zVar = @zVar[index]
    a_zVar
  end

  def get_zVar
    new_zVar = @zVar.dup
    new_zVar
  end

  def number_of_zVar
    number = @zVar.size
    number
  end

  def has_zVar
    has = @zVar.size > 0
    has
  end

  def index_of_zVar(a_zVar)
    index = @zVar.index(a_zVar)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_zVar
    0
  end

  def add_zVar(a_zVar)
    was_added = false
    return false if index_of_zVar(a_zVar) != -1
    existing_y_0_1__star = a_zVar.get_y_0_1__star
    if existing_y_0_1__star.nil?
      a_zVar.set_y_0_1__star(self)
    elsif !existing_y_0_1__star.eql?(self)
      existing_y_0_1__star.remove_zVar(a_zVar)
      add_zVar(a_zVar)
    else
      @zVar << a_zVar
    end
    was_added = true
    was_added
  end

  def remove_zVar(a_zVar)
    was_removed = false
    if @zVar.include?(a_zVar)
      @zVar.delete(a_zVar)
      a_zVar.set_y_0_1__star(nil)
      was_removed = true
    end
    was_removed
  end

  def add_zVar_at(a_zVar, index)
    was_added = false
    if add_zVar(a_zVar)
      if(index < 0)
        index = 0
      end
      if(index > number_of_zVar())
        index = number_of_zVar() - 1
      end
      @zVar.delete(a_zVar)
      @zVar.insert(index, a_zVar)
      was_added = true
    end
    was_added
  end

  def add_or_move_zVar_at(a_zVar, index)
    was_added = false
    if @zVar.include?(a_zVar)
      if(index < 0)
        index = 0
      end
      if(index > number_of_zVar())
        index = number_of_zVar() - 1
      end
      @zVar.delete(a_zVar)
      @zVar.insert(index, a_zVar)
      was_added = true
    else
      was_added = add_zVar_at(a_zVar, index)
    end
    was_added
  end

  def delete
    @deleted = true
    while @zVar.any? do
      curSize = @zVar.size
      @zVar[0].delete
      if curSize == @zVar.size
          @zVar.shift  # this deletes the first value in the array
      end
    end
    @zVar.clear
    
  end

end
end
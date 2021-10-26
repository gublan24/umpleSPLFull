# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class YR_M_M


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #YR_M_M Attributes - for documentation purposes
  #attr_reader :v

  #YR_M_M Associations - for documentation purposes
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

  def is_number_of_zVar_valid
    is_valid = number_of_zVar >= YR_M_M.minimum_number_of_zVar and number_of_zVar <= YR_M_M.maximum_number_of_zVar
    is_valid
  end

  def self.required_number_of_zVar
    3
  end

  def self.minimum_number_of_zVar
    3
  end

  def self.maximum_number_of_zVar
    3
  end

  def add_zVar(a_zVar)
    was_added = false
    return false if index_of_zVar(a_zVar) != -1
    if number_of_zVar >= YR_M_M.maximum_number_of_zVar
      return was_added
    end

    @zVar << a_zVar
    if a_zVar.index_of_y_m_m(self) != -1
      was_added = true
    else
      was_added = a_zVar.add_y_m_m(self)
      unless was_added
        @zVar.delete(a_zVar)
      end
    end
    was_added
  end

  def remove_zVar(a_zVar)
    was_removed = false
    unless @zVar.include?(a_zVar)
      return was_removed
    end

    if number_of_zVar <= YR_M_M.minimum_number_of_zVar
      return was_removed
    end

    oldIndex = @zVar.index(a_zVar)
    @zVar.delete_at(oldIndex)
    if a_zVar.index_of_y_m_m(self) == -1
      was_removed = true
    else
      was_removed = a_zVar.remove_y_m_m(self)
      @zVar.insert(oldIndex,a_zVar) unless was_removed
    end
    was_removed
  end

  def set_zVar(new_zVar)
    was_set = false
    verified_zVar = []
    new_zVar.each do |a_zVar|
      next if (verified_zVar.include?(a_zVar)) 
      verified_zVar << a_zVar
    end

    if verified_zVar.size != new_zVar.length or verified_zVar.size < YR_M_M.minimum_number_of_zVar or verified_zVar.size() > YR_M_M.maximum_number_of_zVar
      return was_set
    end

    old_zVar = @zVar.dup
    @zVar.clear
    verified_zVar.each do |a_new_zVar|
      @zVar << a_new_zVar
      if old_zVar.include?(a_new_zVar)
        old_zVar.delete(a_new_zVar)
      else
        a_new_zVar.add_y_m_m(self)
      end
    end

    old_zVar.each do |an_old_zVar|
      an_old_zVar.remove_y_m_m(self)
    end
    was_set = true
    was_set
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
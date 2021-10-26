# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Ym_n__m_n


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Ym_n__m_n Attributes - for documentation purposes
  #attr_reader :v

  #Ym_n__m_n Associations - for documentation purposes
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

  def is_number_of_xVar_valid
    is_valid = number_of_xVar >= Ym_n__m_n.minimum_number_of_xVar and number_of_xVar <= Ym_n__m_n.maximum_number_of_xVar
    is_valid
  end

  def self.minimum_number_of_xVar
    2
  end

  def self.maximum_number_of_xVar
    3
  end

  def add_xVar(a_xVar)
    was_added = false
    return false if index_of_xVar(a_xVar) != -1
    if number_of_xVar >= Ym_n__m_n.maximum_number_of_xVar
      return was_added
    end

    @xVar << a_xVar
    if a_xVar.index_of_ym_n__m_n(self) != -1
      was_added = true
    else
      was_added = a_xVar.add_ym_n__m_n(self)
      unless was_added
        @xVar.delete(a_xVar)
      end
    end
    was_added
  end

  def remove_xVar(a_xVar)
    was_removed = false
    unless @xVar.include?(a_xVar)
      return was_removed
    end

    if number_of_xVar <= Ym_n__m_n.minimum_number_of_xVar
      return was_removed
    end

    oldIndex = @xVar.index(a_xVar)
    @xVar.delete_at(oldIndex)
    if a_xVar.index_of_ym_n__m_n(self) == -1
      was_removed = true
    else
      was_removed = a_xVar.remove_ym_n__m_n(self)
      @xVar.insert(oldIndex,a_xVar) unless was_removed
    end
    was_removed
  end

  def set_xVar(new_xVar)
    was_set = false
    verified_xVar = []
    new_xVar.each do |a_xVar|
      next if (verified_xVar.include?(a_xVar)) 
      verified_xVar << a_xVar
    end

    if verified_xVar.size != new_xVar.length or verified_xVar.size < Ym_n__m_n.minimum_number_of_xVar or verified_xVar.size() > Ym_n__m_n.maximum_number_of_xVar
      return was_set
    end

    old_xVar = @xVar.dup
    @xVar.clear
    verified_xVar.each do |a_new_xVar|
      @xVar << a_new_xVar
      if old_xVar.include?(a_new_xVar)
        old_xVar.delete(a_new_xVar)
      else
        a_new_xVar.add_ym_n__m_n(self)
      end
    end

    old_xVar.each do |an_old_xVar|
      an_old_xVar.remove_ym_n__m_n(self)
    end
    was_set = true
    was_set
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
    copy_of_xVar = @xVar.dup
    @xVar.clear
    copy_of_xVar.each do |a_xVar|
      if a_xVar.number_of_ym_n__m_n <= Xm_n__m_n.minimum_number_of_ym_n__m_n
        a_xVar.delete
      else
        a_xVar.remove_ym_n__m_n(self)
      end
    end
  end

end
end
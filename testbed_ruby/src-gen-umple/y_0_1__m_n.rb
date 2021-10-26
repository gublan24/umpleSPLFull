# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Y0_1__m_n


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Y0_1__m_n Attributes - for documentation purposes
  #attr_reader :v

  #Y0_1__m_n Associations - for documentation purposes
  #attr_reader :xVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(all_xVar)
    @initialized = false
    @deleted = false
    @v = 1
    @xVar = []
    did_add_xVar = set_xVar(all_xVar)
    raise "Unable to create Y0_1__m_n, must have 2 to 3 @xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_xVar
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
    2
  end

  def self.maximum_number_of_xVar
    3
  end

  def add_xVar(a_xVar)
    was_added = false
    return false if index_of_xVar(a_xVar) != -1
    if number_of_xVar >= Y0_1__m_n.maximum_number_of_xVar
      return was_added
    end
    existing_y0_1__m_n = a_xVar.get_y0_1__m_n
    if !existing_y0_1__m_n.nil? and existing_y0_1__m_n.number_of_xVar <= Y0_1__m_n.minimum_number_of_xVar
      return was_added
    elsif !existing_y0_1__m_n.nil?
      existing_y0_1__m_n.instance_variable_get("@xVar").delete(a_xVar)
    end
    @xVar << a_xVar
    a_xVar.instance_variable_set("@y0_1__m_n",self)
    was_added = true
    was_added
  end

  def remove_xVar(a_xVar)
    was_removed = false
    if @xVar.include?(a_xVar) and number_of_xVar > Y0_1__m_n.minimum_number_of_xVar
      @xVar.delete(a_xVar)
      a_xVar.instance_variable_set("@y0_1__m_n",nil)
      was_removed = true
    end
    was_removed
  end

  def set_xVar(new_xVar)
    was_set = false
    if new_xVar.length < Y0_1__m_n.minimum_number_of_xVar or new_xVar.size > Y0_1__m_n.maximum_number_of_xVar
      return was_set
    end

    check_new_xVar = []
    y0_1__m_nToNewXVar = {}
    new_xVar.each do |a_xVar|
      if check_new_xVar.include?(a_xVar)
        return was_set
      elsif !a_xVar.get_y0_1__m_n.nil? and !a_xVar.get_y0_1__m_n.eql?(self)
        existing_y0_1__m_n = a_xVar.get_y0_1__m_n
        unless y0_1__m_nToNewXVar.has_key?(existing_y0_1__m_n)
          y0_1__m_nToNewXVar[existing_y0_1__m_n] = existing_y0_1__m_n.number_of_xVar
        end
        currentCount = y0_1__m_nToNewXVar[existing_y0_1__m_n]
        nextCount = currentCount - 1
        if nextCount < 2
          return was_set
        end
        y0_1__m_nToNewXVar[existing_y0_1__m_n] = nextCount
      end
      check_new_xVar << a_xVar
    end

    check_new_xVar.each do |a_xVar|
      @xVar.delete(a_xVar)
    end

    @xVar.each do |orphan|
      orphan.instance_variable_set("@y0_1__m_n",nil)
    end
    @xVar.clear
    new_xVar.each do |a_xVar|
      unless a_xVar.get_y0_1__m_n.nil?
        a_xVar.get_y0_1__m_n.instance_variable_get("@xVar").delete(a_xVar)
      end
      a_xVar.instance_variable_set("@y0_1__m_n",self)
      @xVar << a_xVar
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
    @xVar.each do |a_xVar|
      a_xVar.instance_variable_set("@y0_1__m_n",nil)
    end
    @xVar.clear
  end

end
end
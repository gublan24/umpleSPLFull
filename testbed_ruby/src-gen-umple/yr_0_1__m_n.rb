# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class YR_0_1__m_n


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #YR_0_1__m_n Attributes - for documentation purposes
  #attr_reader :v

  #YR_0_1__m_n Associations - for documentation purposes
  #attr_reader :zVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(all_zVar)
    @initialized = false
    @deleted = false
    @v = 1
    @zVar = []
    did_add_zVar = set_zVar(all_zVar)
    raise "Unable to create YR_0_1__m_n, must have 2 to 3 @zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_zVar
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
    2
  end

  def self.maximum_number_of_zVar
    3
  end

  def add_zVar(a_zVar)
    was_added = false
    return false if index_of_zVar(a_zVar) != -1
    if number_of_zVar >= YR_0_1__m_n.maximum_number_of_zVar
      return was_added
    end
    existing_y_0_1__m_n = a_zVar.get_y_0_1__m_n
    if !existing_y_0_1__m_n.nil? and existing_y_0_1__m_n.number_of_zVar <= YR_0_1__m_n.minimum_number_of_zVar
      return was_added
    elsif !existing_y_0_1__m_n.nil?
      existing_y_0_1__m_n.instance_variable_get("@zVar").delete(a_zVar)
    end
    @zVar << a_zVar
    a_zVar.instance_variable_set("@y_0_1__m_n",self)
    was_added = true
    was_added
  end

  def remove_zVar(a_zVar)
    was_removed = false
    if @zVar.include?(a_zVar) and number_of_zVar > YR_0_1__m_n.minimum_number_of_zVar
      @zVar.delete(a_zVar)
      a_zVar.instance_variable_set("@y_0_1__m_n",nil)
      was_removed = true
    end
    was_removed
  end

  def set_zVar(new_zVar)
    was_set = false
    if new_zVar.length < YR_0_1__m_n.minimum_number_of_zVar or new_zVar.size > YR_0_1__m_n.maximum_number_of_zVar
      return was_set
    end

    check_new_zVar = []
    y_0_1__m_nToNewZVar = {}
    new_zVar.each do |a_zVar|
      if check_new_zVar.include?(a_zVar)
        return was_set
      elsif !a_zVar.get_y_0_1__m_n.nil? and !a_zVar.get_y_0_1__m_n.eql?(self)
        existing_y_0_1__m_n = a_zVar.get_y_0_1__m_n
        unless y_0_1__m_nToNewZVar.has_key?(existing_y_0_1__m_n)
          y_0_1__m_nToNewZVar[existing_y_0_1__m_n] = existing_y_0_1__m_n.number_of_zVar
        end
        currentCount = y_0_1__m_nToNewZVar[existing_y_0_1__m_n]
        nextCount = currentCount - 1
        if nextCount < 2
          return was_set
        end
        y_0_1__m_nToNewZVar[existing_y_0_1__m_n] = nextCount
      end
      check_new_zVar << a_zVar
    end

    check_new_zVar.each do |a_zVar|
      @zVar.delete(a_zVar)
    end

    @zVar.each do |orphan|
      orphan.instance_variable_set("@y_0_1__m_n",nil)
    end
    @zVar.clear
    new_zVar.each do |a_zVar|
      unless a_zVar.get_y_0_1__m_n.nil?
        a_zVar.get_y_0_1__m_n.instance_variable_get("@zVar").delete(a_zVar)
      end
      a_zVar.instance_variable_set("@y_0_1__m_n",self)
      @zVar << a_zVar
    end
    was_set = true
    was_set
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
      if @zVar[0] != nil
          a_zVar = @zVar[0]
          @zVar[0] = nil
          a_zVar.delete
      end
      if curSize == @zVar.size
          @zVar.shift  # this deletes the first value in the array
      end
    end
    @zVar.clear
  end

end
end
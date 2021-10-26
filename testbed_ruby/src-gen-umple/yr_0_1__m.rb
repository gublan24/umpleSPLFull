# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class YR_0_1__m


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #YR_0_1__m Attributes - for documentation purposes
  #attr_reader :v

  #YR_0_1__m Associations - for documentation purposes
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
    raise "Unable to create YR_0_1__m, must have 3 @zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_zVar
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

  def self.required_number_of_zVar
    3
  end

  def self.minimum_number_of_zVar
    3
  end

  def self.maximum_number_of_zVar
    3
  end

  def set_zVar(new_zVar)
    was_set = false
    check_new_zVar = []
    new_zVar.each do |new_zVar|
      if check_new_zVar.include?(new_zVar)
        return was_set
      elsif !new_zVar.get_y_0_1__m.nil? and !new_zVar.get_y_0_1__m.eql?(self)
        return was_set
      end
      check_new_zVar << new_zVar
    end

    if check_new_zVar.size != YR_0_1__m.minimum_number_of_zVar
      return was_set
    end

    check_new_zVar.each do |a_zVar|
      @zVar.delete(a_zVar)
    end
    
    @zVar.each do |orphan|
      orphan.instance_variable_set("@y_0_1__m",nil)
    end
    @zVar.clear
    new_zVar.each do |new_zVar|
      new_zVar.instance_variable_set("@y_0_1__m",self)
      @zVar << new_zVar
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
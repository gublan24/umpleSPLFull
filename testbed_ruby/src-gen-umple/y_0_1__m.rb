# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Y0_1__m


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Y0_1__m Attributes - for documentation purposes
  #attr_reader :v

  #Y0_1__m Associations - for documentation purposes
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
    raise "Unable to create Y0_1__m, must have 3 @xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_xVar
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

  def self.required_number_of_xVar
    3
  end

  def self.minimum_number_of_xVar
    3
  end

  def self.maximum_number_of_xVar
    3
  end

  def set_xVar(new_xVar)
    was_set = false
    check_new_xVar = []
    new_xVar.each do |new_xVar|
      if check_new_xVar.include?(new_xVar)
        return was_set
      elsif !new_xVar.get_y0_1__m.nil? and !new_xVar.get_y0_1__m.eql?(self)
        return was_set
      end
      check_new_xVar << new_xVar
    end

    if check_new_xVar.size != Y0_1__m.minimum_number_of_xVar
      return was_set
    end

    check_new_xVar.each do |a_xVar|
      @xVar.delete(a_xVar)
    end
    
    @xVar.each do |orphan|
      orphan.instance_variable_set("@y0_1__m",nil)
    end
    @xVar.clear
    new_xVar.each do |new_xVar|
      new_xVar.instance_variable_set("@y0_1__m",self)
      @xVar << new_xVar
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    @xVar.each do |a_xVar|
      a_xVar.instance_variable_set("@y0_1__m",nil)
    end
    @xVar.clear
  end

end
end
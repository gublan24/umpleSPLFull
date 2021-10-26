# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Y1_1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Y1_1 Attributes - for documentation purposes
  #attr_reader :v

  #Y1_1 Associations - for documentation purposes
  #attr_reader :xVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_xVar)
    @initialized = false
    @deleted = false
    @v = 1
    @xVar = nil
    unless a_xVar.nil?
      @xVar = a_xVar
      a_xVar.instance_variable_set("@y1_1",self)
    end
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_v(a_v)
    was_set = false
    raise "Mandatory relationship with xVar not satisfied" if (@initialized and !@deleted and @xVar.nil?)
    @v = a_v
    was_set = true
    was_set
  end

  def get_v
    raise "Mandatory relationship with xVar not satisfied" if (@initialized and !@deleted and @xVar.nil?)
    @v
  end

  def get_xVar
    raise "Mandatory relationship with xVar not satisfied" if (@initialized and !@deleted and @xVar.nil?)
    @xVar
  end

  def delete
    @deleted = true
    raise "Mandatory relationship with xVar not satisfied" if (@initialized and !@deleted and @xVar.nil?)
    existing_xVar = @xVar
    @xVar = nil
    unless existing_xVar.nil?
      existing_xVar.delete
    end
  end

end
end
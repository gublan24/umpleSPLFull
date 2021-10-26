# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class YR_1_1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #YR_1_1 Attributes - for documentation purposes
  #attr_reader :v

  #YR_1_1 Associations - for documentation purposes
  #attr_reader :zVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_zVar)
    @initialized = false
    @deleted = false
    @v = 1
    @zVar = nil
    unless a_zVar.nil?
      @zVar = a_zVar
      a_zVar.instance_variable_set("@y_1_1",self)
    end
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_v(a_v)
    was_set = false
    raise "Mandatory relationship with zVar not satisfied" if (@initialized and !@deleted and @zVar.nil?)
    @v = a_v
    was_set = true
    was_set
  end

  def get_v
    raise "Mandatory relationship with zVar not satisfied" if (@initialized and !@deleted and @zVar.nil?)
    @v
  end

  def get_zVar
    raise "Mandatory relationship with zVar not satisfied" if (@initialized and !@deleted and @zVar.nil?)
    @zVar
  end

  def delete
    @deleted = true
    raise "Mandatory relationship with zVar not satisfied" if (@initialized and !@deleted and @zVar.nil?)
    existing_zVar = @zVar
    @zVar = nil
    unless existing_zVar.nil?
      existing_zVar.delete
    end
  end

end
end
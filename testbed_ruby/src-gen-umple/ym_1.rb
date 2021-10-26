# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class YM_1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #YM_1 Attributes - for documentation purposes
  #attr_reader :v

  #YM_1 Associations - for documentation purposes
  #attr_reader :xVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_xVar)
    @initialized = false
    @deleted = false
    @v = 1
    @xVar = nil
    did_add_xVar = set_xVar(a_xVar)
    raise "Unable to create ym_1 due to @xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_xVar
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

  def set_xVar(a_xVar)
    was_set = false
    raise "Mandatory relationship with xVar not satisfied" if (@initialized and !@deleted and @xVar.nil?)
    # Must provide @xVar to ym_1
    if a_xVar.nil?
      return was_set
    end

    # @xVar already at maximum (3)
    if a_xVar.number_of_ym_1 >= XM_1.maximum_number_of_ym_1
      return was_set
    end
    
    existing_xVar = @xVar
    @xVar = a_xVar
    if !existing_xVar.nil? and !existing_xVar.eql?(a_xVar)
      didRemove = existing_xVar.remove_ym_1(self)
      unless didRemove
        @xVar = existing_xVar
        return was_set
      end
    end
    @xVar.add_ym_1(self)
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    raise "Mandatory relationship with xVar not satisfied" if (@initialized and !@deleted and @xVar.nil?)
    @placeholder_xVar = @xVar
    @xVar = nil
    @placeholder_xVar.remove_ym_1(self)
  end

end
end
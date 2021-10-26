# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Y0_n__1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Y0_n__1 Attributes - for documentation purposes
  #attr_reader :v

  #Y0_n__1 Associations - for documentation purposes
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
    raise "Unable to create y0_n__1 due to @xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_xVar
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

  def get_xVar
    @xVar
  end

  def set_xVar(a_xVar)
    was_set = false
    # Must provide @xVar to y0_n__1
    if a_xVar.nil?
      return was_set
    end

    # @xVar already at maximum (3)
    if a_xVar.number_of_y0_n__1 >= X0_n__1.maximum_number_of_y0_n__1
      return was_set
    end
    
    existing_xVar = @xVar
    @xVar = a_xVar
    if !existing_xVar.nil? and !existing_xVar.eql?(a_xVar)
      didRemove = existing_xVar.remove_y0_n__1(self)
      unless didRemove
        @xVar = existing_xVar
        return was_set
      end
    end
    @xVar.add_y0_n__1(self)
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    @placeholder_xVar = @xVar
    @xVar = nil
    @placeholder_xVar.remove_y0_n__1(self)
  end

end
end
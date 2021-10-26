# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Y0_1__1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Y0_1__1 Attributes - for documentation purposes
  #attr_reader :v

  #Y0_1__1 Associations - for documentation purposes
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
    raise "Unable to create y0_1__1 due to @xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_xVar
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

  def set_xVar(a_new_xVar)
    was_set = false
    if a_new_xVar.nil?
      #Unable to set_xVar to nil, as y0_1__1 must always be associated to a @xVar
      return was_set
    end
    
    existing_y0_1__1 = a_new_xVar.get_y0_1__1
    if !existing_y0_1__1.nil? and !self.eql?(existing_y0_1__1)
      #Unable to set_xVar, the current @xVar already has a y0_1__1, which would be orphaned if it were re-assigned
      return was_set
    end
    
    an_old_xVar = @xVar
    @xVar = a_new_xVar
    @xVar.set_y0_1__1(self)

    unless an_old_xVar.nil?
      an_old_xVar.set_y0_1__1(nil)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    existing_xVar = @xVar
    @xVar = nil
    unless existing_xVar.nil?
      existing_xVar.set_y0_1__1(nil)
    end
  end

end
end
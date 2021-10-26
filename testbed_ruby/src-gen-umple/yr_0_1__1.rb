# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class YR_0_1__1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #YR_0_1__1 Attributes - for documentation purposes
  #attr_reader :v

  #YR_0_1__1 Associations - for documentation purposes
  #attr_reader :zVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_zVar)
    @initialized = false
    @deleted = false
    @v = 1
    @zVar = nil
    did_add_zVar = set_zVar(a_zVar)
    raise "Unable to create y_0_1__1 due to @zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_zVar
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

  def get_zVar
    @zVar
  end

  def set_zVar(a_new_zVar)
    was_set = false
    if a_new_zVar.nil?
      #Unable to set_zVar to nil, as y_0_1__1 must always be associated to a @zVar
      return was_set
    end
    
    existing_y_0_1__1 = a_new_zVar.get_y_0_1__1
    if !existing_y_0_1__1.nil? and !self.eql?(existing_y_0_1__1)
      #Unable to set_zVar, the current @zVar already has a y_0_1__1, which would be orphaned if it were re-assigned
      return was_set
    end
    
    an_old_zVar = @zVar
    @zVar = a_new_zVar
    @zVar.set_y_0_1__1(self)

    unless an_old_zVar.nil?
      an_old_zVar.set_y_0_1__1(nil)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    existing_zVar = @zVar
    @zVar = nil
    unless existing_zVar.nil?
      existing_zVar.delete
    end
  end

end
end
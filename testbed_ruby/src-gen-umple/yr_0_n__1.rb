# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class YR_0_n__1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #YR_0_n__1 Attributes - for documentation purposes
  #attr_reader :v

  #YR_0_n__1 Associations - for documentation purposes
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
    raise "Unable to create y_0_n__1 due to @zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_zVar
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

  def set_zVar(a_zVar)
    was_set = false
    # Must provide @zVar to y_0_n__1
    if a_zVar.nil?
      return was_set
    end

    # @zVar already at maximum (3)
    if a_zVar.number_of_y_0_n__1 >= Z_0_n__1.maximum_number_of_y_0_n__1
      return was_set
    end
    
    existing_zVar = @zVar
    @zVar = a_zVar
    if !existing_zVar.nil? and !existing_zVar.eql?(a_zVar)
      didRemove = existing_zVar.remove_y_0_n__1(self)
      unless didRemove
        @zVar = existing_zVar
        return was_set
      end
    end
    @zVar.add_y_0_n__1(self)
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
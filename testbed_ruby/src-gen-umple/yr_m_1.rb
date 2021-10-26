# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class YR_M_1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #YR_M_1 Attributes - for documentation purposes
  #attr_reader :v

  #YR_M_1 Associations - for documentation purposes
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
    raise "Unable to create y_m_1 due to @zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_zVar
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

  def set_zVar(a_zVar)
    was_set = false
    raise "Mandatory relationship with zVar not satisfied" if (@initialized and !@deleted and @zVar.nil?)
    # Must provide @zVar to y_m_1
    if a_zVar.nil?
      return was_set
    end

    # @zVar already at maximum (3)
    if a_zVar.number_of_y_m_1 >= Z_M_1.maximum_number_of_y_m_1
      return was_set
    end
    
    existing_zVar = @zVar
    @zVar = a_zVar
    if !existing_zVar.nil? and !existing_zVar.eql?(a_zVar)
      didRemove = existing_zVar.remove_y_m_1(self)
      unless didRemove
        @zVar = existing_zVar
        return was_set
      end
    end
    @zVar.add_y_m_1(self)
    was_set = true
    was_set
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
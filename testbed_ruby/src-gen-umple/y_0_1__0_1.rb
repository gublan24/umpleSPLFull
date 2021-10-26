# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Y0_1__0_1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Y0_1__0_1 Attributes - for documentation purposes
  #attr_reader :v

  #Y0_1__0_1 Associations - for documentation purposes
  #attr_reader :xVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @v = 1
    @xVar = nil
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

  def has_xVar
    has = !@xVar.nil?
    has
  end

  def set_xVar(a_new_xVar)
    was_set = false
    if a_new_xVar.nil?
      existing_xVar = @xVar
      @xVar = nil
      
      if !existing_xVar.nil? and !existing_xVar.get_y0_1__0_1.nil?
        existing_xVar.set_y0_1__0_1(nil)
      end
      was_set = true
      return was_set
    end

    current_xVar = self.get_xVar
    if !current_xVar.nil? and !current_xVar.eql?(a_new_xVar)
      current_xVar.set_y0_1__0_1(nil)
    end

    @xVar = a_new_xVar
    existing_y0_1__0_1 = a_new_xVar.get_y0_1__0_1

    unless self.eql?(existing_y0_1__0_1)
      a_new_xVar.set_y0_1__0_1(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    unless @xVar.nil?
      @xVar.set_y0_1__0_1(nil)
    end
  end

end
end
# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class YR_0_1__0_1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #YR_0_1__0_1 Attributes - for documentation purposes
  #attr_reader :v

  #YR_0_1__0_1 Associations - for documentation purposes
  #attr_reader :zVar

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @v = 1
    @zVar = nil
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

  def has_zVar
    has = !@zVar.nil?
    has
  end

  def set_zVar(a_new_zVar)
    was_set = false
    if a_new_zVar.nil?
      existing_zVar = @zVar
      @zVar = nil
      
      if !existing_zVar.nil? and !existing_zVar.get_y_0_1__0_1.nil?
        existing_zVar.set_y_0_1__0_1(nil)
      end
      was_set = true
      return was_set
    end

    current_zVar = self.get_zVar
    if !current_zVar.nil? and !current_zVar.eql?(a_new_zVar)
      current_zVar.set_y_0_1__0_1(nil)
    end

    @zVar = a_new_zVar
    existing_y_0_1__0_1 = a_new_zVar.get_y_0_1__0_1

    unless self.eql?(existing_y_0_1__0_1)
      a_new_zVar.set_y_0_1__0_1(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    
    if @zVar != nil
        @zVar.delete
        @zVar = nil
    end
    
  end

end
end
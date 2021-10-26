# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class X0_1__0_1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #X0_1__0_1 Attributes - for documentation purposes
  #attr_reader :num

  #X0_1__0_1 Associations - for documentation purposes
  #attr_reader :y0_1__0_1

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y0_1__0_1 = nil
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_num(a_num)
    was_set = false
    @num = a_num
    was_set = true
    was_set
  end

  def get_num
    @num
  end

  def get_y0_1__0_1
    @y0_1__0_1
  end

  def has_y0_1__0_1
    has = !@y0_1__0_1.nil?
    has
  end

  def set_y0_1__0_1(a_new_y0_1__0_1)
    was_set = false
    if a_new_y0_1__0_1.nil?
      existing_y0_1__0_1 = @y0_1__0_1
      @y0_1__0_1 = nil
      
      if !existing_y0_1__0_1.nil? and !existing_y0_1__0_1.get_xVar.nil?
        existing_y0_1__0_1.set_xVar(nil)
      end
      was_set = true
      return was_set
    end

    current_y0_1__0_1 = self.get_y0_1__0_1
    if !current_y0_1__0_1.nil? and !current_y0_1__0_1.eql?(a_new_y0_1__0_1)
      current_y0_1__0_1.set_xVar(nil)
    end

    @y0_1__0_1 = a_new_y0_1__0_1
    existing_xVar = a_new_y0_1__0_1.get_xVar

    unless self.eql?(existing_xVar)
      a_new_y0_1__0_1.set_xVar(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    
    if @y0_1__0_1 != nil
        @y0_1__0_1.delete
        @y0_1__0_1 = nil
    end
    
  end

end
end
# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class X0_1__1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #X0_1__1 Attributes - for documentation purposes
  #attr_reader :num

  #X0_1__1 Associations - for documentation purposes
  #attr_reader :y0_1__1

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y0_1__1 = nil
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

  def get_y0_1__1
    @y0_1__1
  end

  def has_y0_1__1
    has = !@y0_1__1.nil?
    has
  end

  def set_y0_1__1(a_new_y0_1__1)
    was_set = false
    if !@y0_1__1.nil? and !@y0_1__1.eql?(a_new_y0_1__1) and self.eql?(@y0_1__1.get_xVar)
      #Unable to set_y0_1__1, as existing @y0_1__1 would become an orphan
      return was_set
    end

    @y0_1__1 = a_new_y0_1__1
    an_old_xVar = !a_new_y0_1__1.nil? ? a_new_y0_1__1.get_xVar : nil

    unless self.eql?(an_old_xVar)
      unless an_old_xVar.nil?
        an_old_xVar.instance_variable_set("@y0_1__1",nil)
      end
      unless @y0_1__1.nil?
        @y0_1__1.set_xVar(self)
      end
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    
    if @y0_1__1 != nil
        @y0_1__1.delete
        @y0_1__1 = nil
    end
    
  end

end
end
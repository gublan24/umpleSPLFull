# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class X0_1__m


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #X0_1__m Attributes - for documentation purposes
  #attr_reader :num

  #X0_1__m Associations - for documentation purposes
  #attr_reader :y0_1__m

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y0_1__m = nil
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

  def get_y0_1__m
    @y0_1__m
  end

  def has_y0_1__m
    has = !@y0_1__m.nil?
    has
  end

  def delete
    @deleted = true
    
    if @y0_1__m != nil
        @y0_1__m.delete
        @y0_1__m = nil
    end
    
  end

end
end
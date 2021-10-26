# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class X0_1__0_n


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #X0_1__0_n Attributes - for documentation purposes
  #attr_reader :num

  #X0_1__0_n Associations - for documentation purposes
  #attr_reader :y0_1__0_n

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y0_1__0_n = nil
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

  def get_y0_1__0_n
    @y0_1__0_n
  end

  def has_y0_1__0_n
    has = !@y0_1__0_n.nil?
    has
  end

  def set_y0_1__0_n(a_y0_1__0_n)
    was_set = false
    if !a_y0_1__0_n.nil? and a_y0_1__0_n.number_of_xVar >= Y0_1__0_n.maximum_number_of_xVar
      return was_set
    end

    existing_y0_1__0_n = @y0_1__0_n
    @y0_1__0_n = a_y0_1__0_n
    if !existing_y0_1__0_n.nil? and !existing_y0_1__0_n.eql?(a_y0_1__0_n)
      existing_y0_1__0_n.remove_xVar(self)
    end
    unless a_y0_1__0_n.nil?
      a_y0_1__0_n.add_xVar(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    
    if @y0_1__0_n != nil
        @y0_1__0_n.delete
        @y0_1__0_n = nil
    end
    
  end

end
end
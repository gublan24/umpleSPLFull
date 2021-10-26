# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_0_1__0_n


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_0_1__0_n Attributes - for documentation purposes
  #attr_reader :num

  #Z_0_1__0_n Associations - for documentation purposes
  #attr_reader :y_0_1__0_n

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_0_1__0_n = nil
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

  def get_y_0_1__0_n
    @y_0_1__0_n
  end

  def has_y_0_1__0_n
    has = !@y_0_1__0_n.nil?
    has
  end

  def set_y_0_1__0_n(a_y_0_1__0_n)
    was_set = false
    if !a_y_0_1__0_n.nil? and a_y_0_1__0_n.number_of_zVar >= YR_0_1__0_n.maximum_number_of_zVar
      return was_set
    end

    existing_y_0_1__0_n = @y_0_1__0_n
    @y_0_1__0_n = a_y_0_1__0_n
    if !existing_y_0_1__0_n.nil? and !existing_y_0_1__0_n.eql?(a_y_0_1__0_n)
      existing_y_0_1__0_n.remove_zVar(self)
    end
    unless a_y_0_1__0_n.nil?
      a_y_0_1__0_n.add_zVar(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    unless @y_0_1__0_n.nil?
      @y_0_1__0_n.remove_zVar(self)
    end
  end

end
end
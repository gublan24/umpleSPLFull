# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class X1_1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #X1_1 Attributes - for documentation purposes
  #attr_reader :num

  #X1_1 Associations - for documentation purposes
  #attr_reader :y1_1

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num, a_y1_1)
    @initialized = false
    @deleted = false
    @num = a_num
    @y1_1 = nil
    unless a_y1_1.nil?
      @y1_1 = a_y1_1
      a_y1_1.instance_variable_set("@xVar",self)
    end
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_num(a_num)
    was_set = false
    raise "Mandatory relationship with y1_1 not satisfied" if (@initialized and !@deleted and @y1_1.nil?)
    @num = a_num
    was_set = true
    was_set
  end

  def get_num
    raise "Mandatory relationship with y1_1 not satisfied" if (@initialized and !@deleted and @y1_1.nil?)
    @num
  end

  def get_y1_1
    raise "Mandatory relationship with y1_1 not satisfied" if (@initialized and !@deleted and @y1_1.nil?)
    @y1_1
  end

  def delete
    @deleted = true
    raise "Mandatory relationship with y1_1 not satisfied" if (@initialized and !@deleted and @y1_1.nil?)
    existing_y1_1 = @y1_1
    @y1_1 = nil
    unless existing_y1_1.nil?
      existing_y1_1.delete
    end
  end

end
end
# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_0_1__star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_0_1__star Attributes - for documentation purposes
  #attr_reader :num

  #Z_0_1__star Associations - for documentation purposes
  #attr_reader :y_0_1__star

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_0_1__star = nil
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

  def get_y_0_1__star
    @y_0_1__star
  end

  def has_y_0_1__star
    has = !@y_0_1__star.nil?
    has
  end

  def set_y_0_1__star(a_y_0_1__star)
    was_set = false
    existing_y_0_1__star = @y_0_1__star
    @y_0_1__star = a_y_0_1__star
    if !existing_y_0_1__star.nil? and !existing_y_0_1__star.eql?(a_y_0_1__star)
      existing_y_0_1__star.remove_zVar(self)
    end
    unless a_y_0_1__star.nil?
      a_y_0_1__star.add_zVar(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    unless @y_0_1__star.nil?
      @y_0_1__star.remove_zVar(self)
    end
  end

end
end
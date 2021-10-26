# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_1_star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_1_star Attributes - for documentation purposes
  #attr_reader :num

  #Z_1_star Associations - for documentation purposes
  #attr_reader :y_1_star

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num, a_y_1_star)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_1_star = nil
    did_add_y_1_star = set_y_1_star(a_y_1_star)
    raise "Unable to create zVar due to @y_1_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_y_1_star
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

  def get_y_1_star
    @y_1_star
  end

  def set_y_1_star(a_y_1_star)
    was_set = false
    if a_y_1_star.nil?
      return was_set
    end

    existing_y_1_star = @y_1_star
    @y_1_star = a_y_1_star
    if !existing_y_1_star.nil? and !existing_y_1_star.eql?(a_y_1_star)
      existing_y_1_star.remove_zVar(self)
    end
    @y_1_star.add_zVar(self)
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    @placeholder_y_1_star = @y_1_star
    @y_1_star = nil
    @placeholder_y_1_star.remove_zVar(self)
  end

end
end
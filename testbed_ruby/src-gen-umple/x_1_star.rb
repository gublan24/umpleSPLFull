# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class X1_star


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #X1_star Attributes - for documentation purposes
  #attr_reader :num

  #X1_star Associations - for documentation purposes
  #attr_reader :y1_star

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num, a_y1_star)
    @initialized = false
    @deleted = false
    @num = a_num
    @y1_star = nil
    did_add_y1_star = set_y1_star(a_y1_star)
    raise "Unable to create xVar due to @y1_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_y1_star
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

  def get_y1_star
    @y1_star
  end

  def set_y1_star(a_y1_star)
    was_set = false
    if a_y1_star.nil?
      return was_set
    end

    existing_y1_star = @y1_star
    @y1_star = a_y1_star
    if !existing_y1_star.nil? and !existing_y1_star.eql?(a_y1_star)
      existing_y1_star.remove_xVar(self)
    end
    @y1_star.add_xVar(self)
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    existing_y1_star = @y1_star
    @y1_star = nil
    unless existing_y1_star.nil?
      existing_y1_star.delete
    end
  end

end
end
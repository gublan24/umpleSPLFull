# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruisePatternsTest

class ClassOptionalOne


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #ClassOptionalOne Associations - for documentation purposes
  #attr_reader :classOtherclass

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_classOtherclass)
    @initialized = false
    @deleted = false
    @can_set_classOtherclass = true
    set_classOtherclass(a_classOtherclass)
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def get_classOtherclass
    @classOtherclass
  end

  def has_classOtherclass
    has = !@classOtherclass.nil?
    has
  end

  def set_classOtherclass(a_new_classOtherclass)
    was_set = false
    return false unless @can_set_classOtherclass
    @can_set_classOtherclass = false
    @classOtherclass = a_new_classOtherclass
    was_set = true
    was_set
  end

  def delete
    @deleted = true
  end

end
end
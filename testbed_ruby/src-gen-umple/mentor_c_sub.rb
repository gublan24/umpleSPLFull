# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class MentorCSub < MentorC


  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_name)
    super(a_name)
    @initialized = false
    @deleted = false
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def delete
    @deleted = true
    super
  end

end
end
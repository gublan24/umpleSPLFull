# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAttributesTest

class BoatA


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #BoatA Attributes - for documentation purposes
  #attr_reader :age

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_age)
    @initialized = false
    @deleted = false
    @age = a_age
    if (a_age<=18) then
      raise RuntimeError, 'Please provide a valid age [age>18]'
    end
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_age(a_age)
    was_set = false
    if (a_age>18) then
    @age = a_age
    was_set = true
    end
    was_set
  end

  def get_age
    @age
  end

  def delete
    @deleted = true
  end

end
end
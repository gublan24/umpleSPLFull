# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruisePatternsTest

class WidgetImmutableB


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #WidgetImmutableB Attributes - for documentation purposes
  #attr_reader :name

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_name)
    @initialized = false
    @deleted = false
    @name = a_name
    @can_set_name = false
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def get_name
    @name
  end

  def delete
    @deleted = true
  end

end
end
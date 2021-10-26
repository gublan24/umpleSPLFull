# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAttributesTest

class ConstDefaultInterfaceObject < ConstDefaultInterface


  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def delete
    @deleted = true
  end

end
end
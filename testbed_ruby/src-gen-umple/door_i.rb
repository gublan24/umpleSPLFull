# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAttributesTest

class DoorI < DoorH


  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_id)
    super(a_id)
    @initialized = false
    @deleted = false
    @cachedHashCode = -1
    @can_set_id = true
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def eql?(obj)
    return false if obj.nil?
    return false unless self.class == obj.class

    compareTo = obj
    return false if (@id.nil? and !compareTo.instance_variable_get("@id").nil?)
    return false if (!@id.nil? and !@id.eql?(compareTo.instance_variable_get("@id")))
    true
  end

  def hash
    return @cachedHashCode unless @cachedHashCode == -1
    @cachedHashCode = 17
    if (!@id.nil?)
      @cachedHashCode = @cachedHashCode * 23 + @id.hash
    else
      @cachedHashCode = @cachedHashCode * 23
    end
    @can_set_id = false
    @cachedHashCode
  end

  def delete
    @deleted = true
    super
  end

end
end
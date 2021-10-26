# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class AssociationClass


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #AssociationClass Associations - for documentation purposes
  #attr_reader :associatedClassWithKey

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_associatedClassWithKey)
    @initialized = false
    @deleted = false
    @cachedHashCode = -1
    @can_set_associatedClassWithKey = true
    @associatedClassWithKey = nil
    unless a_associatedClassWithKey.nil?
      @associatedClassWithKey = a_associatedClassWithKey
      a_associatedClassWithKey.instance_variable_set("@associationClass",self)
    end
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def get_associatedClassWithKey
    raise "Mandatory relationship with associatedClassWithKey not satisfied" if (@initialized and !@deleted and @associatedClassWithKey.nil?)
    @associatedClassWithKey
  end

  def eql?(obj)
    return false if obj.nil?
    return false unless self.class == obj.class

    compareTo = obj
    return false if (@associatedClassWithKey.nil? and !compareTo.instance_variable_get("@associatedClassWithKey").nil?)
    return false if (!@associatedClassWithKey.nil? and !@associatedClassWithKey.eql?(compareTo.instance_variable_get("@associatedClassWithKey")))
    true
  end

  def hash
    return @cachedHashCode unless @cachedHashCode == -1
    @cachedHashCode = 17
    if (!@associatedClassWithKey.nil?)
      @cachedHashCode = @cachedHashCode * 23 + @associatedClassWithKey.hash
    else
      @cachedHashCode = @cachedHashCode * 23
    end
    @can_set_associatedClassWithKey = false
    @cachedHashCode
  end

  def delete
    @deleted = true
    raise "Mandatory relationship with associatedClassWithKey not satisfied" if (@initialized and !@deleted and @associatedClassWithKey.nil?)
    existing_associatedClassWithKey = @associatedClassWithKey
    @associatedClassWithKey = nil
    unless existing_associatedClassWithKey.nil?
      existing_associatedClassWithKey.delete
    end
  end

end
end
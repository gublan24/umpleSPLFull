# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAttributesTest

class ManKeysStringAndInt < ManyStringAttributes


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #ManKeysStringAndInt Attributes - for documentation purposes
  #attr_reader :id

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_id)
    super()
    @initialized = false
    @deleted = false
    @cachedHashCode = -1
    @can_set_worksString = true
    @can_set_id = true
    @id = a_id
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_id(a_id)
    was_set = false
    return false unless @can_set_id
    @id = a_id
    was_set = true
    was_set
  end

  def get_id
    @id
  end

  def eql?(obj)
    return false if obj.nil?
    return false unless self.class == obj.class

    compareTo = obj
    return false unless @worksString.size == compareTo.instance_variable_get("@worksString").size
    @worksString.each do |me|
      them = compareTo.instance_variable_get("@worksString").get(i)
      return false if (me.nil? and !them.nil?)
      return false if (!me.nil? and !me.eql?(them))
    end

    return false unless @id == compareTo.instance_variable_get("@id")
    true
  end

  def hash
    return @cachedHashCode unless @cachedHashCode == -1
    @cachedHashCode = 17
    if (!@worksString.nil?)
      @cachedHashCode = @cachedHashCode * 23 + @worksString.hash
    else
      @cachedHashCode = @cachedHashCode * 23
    end

    @cachedHashCode = @cachedHashCode * 23 + @id
    @can_set_worksString = false
    @can_set_id = false
    @cachedHashCode
  end

  def delete
    @deleted = true
    super
  end

end
end
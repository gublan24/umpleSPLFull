# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAttributesTest

class ManyKeys < ManyAttribute


  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    super()
    @initialized = false
    @deleted = false
    @cachedHashCode = -1
    @can_set_works = true
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def eql?(obj)
    return false if obj.nil?
    return false unless self.class == obj.class

    compareTo = obj
    return false unless @works.size == compareTo.instance_variable_get("@works").size
    @works.each do |me|
      them = compareTo.instance_variable_get("@works").get(i)
      return false if (me.nil? and !them.nil?)
      return false if (!me.nil? and !me.eql?(them))
    end
    true
  end

  def hash
    return @cachedHashCode unless @cachedHashCode == -1
    @cachedHashCode = 17
    if (!@works.nil?)
      @cachedHashCode = @cachedHashCode * 23 + @works.hash
    else
      @cachedHashCode = @cachedHashCode * 23
    end
    @can_set_works = false
    @cachedHashCode
  end

  def delete
    @deleted = true
    super
  end

end
end
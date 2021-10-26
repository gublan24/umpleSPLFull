# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class AssociationClassManyKeys


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #AssociationClassManyKeys Associations - for documentation purposes
  #attr_reader :associatedClasses

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @cachedHashCode = -1
    @can_set_associatedClasses = true
    @associatedClasses = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def get_associatedClass(index)
    a_associatedClass = @associatedClasses[index]
    a_associatedClass
  end

  def get_associatedClasses
    new_associatedClasses = @associatedClasses.dup
    new_associatedClasses
  end

  def number_of_associatedClasses
    number = @associatedClasses.size
    number
  end

  def has_associatedClasses
    has = @associatedClasses.size > 0
    has
  end

  def index_of_associatedClass(a_associatedClass)
    index = @associatedClasses.index(a_associatedClass)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_associatedClasses
    0
  end

  def add_associatedClass(a_associatedClass)
    was_added = false
    return false unless @can_set_associatedClasses
    return false if index_of_associatedClass(a_associatedClass) != -1
    @associatedClasses << a_associatedClass
    if a_associatedClass.index_of_associationClassManyKey(self) != -1
      was_added = true
    else
      was_added = a_associatedClass.add_associationClassManyKey(self)
      unless was_added
        @associatedClasses.delete(a_associatedClass)
      end
    end
    was_added
  end

  def remove_associatedClass(a_associatedClass)
    was_removed = false
    return false unless @can_set_associatedClasses
    unless @associatedClasses.include?(a_associatedClass)
      return was_removed
    end

    oldIndex = @associatedClasses.index(a_associatedClass)
    @associatedClasses.delete_at(oldIndex)
    if a_associatedClass.index_of_associationClassManyKey(self) == -1
      was_removed = true
    else
      was_removed = a_associatedClass.remove_associationClassManyKey(self)
      @associatedClasses.insert(oldIndex,a_associatedClass) unless was_removed
    end
    was_removed
  end

  def add_associatedClass_at(a_associatedClass, index)
    was_added = false
    if add_associatedClass(a_associatedClass)
      if(index < 0)
        index = 0
      end
      if(index > number_of_associatedClasses())
        index = number_of_associatedClasses() - 1
      end
      @associatedClasses.delete(a_associatedClass)
      @associatedClasses.insert(index, a_associatedClass)
      was_added = true
    end
    was_added
  end

  def add_or_move_associatedClass_at(a_associatedClass, index)
    was_added = false
    if @associatedClasses.include?(a_associatedClass)
      if(index < 0)
        index = 0
      end
      if(index > number_of_associatedClasses())
        index = number_of_associatedClasses() - 1
      end
      @associatedClasses.delete(a_associatedClass)
      @associatedClasses.insert(index, a_associatedClass)
      was_added = true
    else
      was_added = add_associatedClass_at(a_associatedClass, index)
    end
    was_added
  end

  def eql?(obj)
    return false if obj.nil?
    return false unless self.class == obj.class

    compareTo = obj
    return false unless @associatedClasses.size == compareTo.instance_variable_get("@associatedClasses").size
    @associatedClasses.each do |me|
      them = compareTo.instance_variable_get("@associatedClasses").get(i)
      return false if (me.nil? and !them.nil?)
      return false if (!me.nil? and !me.eql?(them))
    end
    true
  end

  def hash
    return @cachedHashCode unless @cachedHashCode == -1
    @cachedHashCode = 17
    if (!@associatedClasses.nil?)
      @cachedHashCode = @cachedHashCode * 23 + @associatedClasses.hash
    else
      @cachedHashCode = @cachedHashCode * 23
    end
    @can_set_associatedClasses = false
    @cachedHashCode
  end

  def delete
    @deleted = true
    copy_of_associatedClasses = @associatedClasses.dup
    @associatedClasses.clear
    copy_of_associatedClasses.each do |a_associatedClass|
      a_associatedClass.remove_associationClassManyKey(self)
    end
  end

end
end
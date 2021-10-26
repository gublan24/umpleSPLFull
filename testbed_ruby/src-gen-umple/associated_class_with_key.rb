# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class AssociatedClassWithKey


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #AssociatedClassWithKey Attributes - for documentation purposes
  #attr_reader :id

  #AssociatedClassWithKey Associations - for documentation purposes
  #attr_reader :associationClass, :associationClassManyKeys

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_id, a_associationClass)
    @initialized = false
    @deleted = false
    @cachedHashCode = -1
    @can_set_id = true
    @id = a_id
    @associationClass = nil
    unless a_associationClass.nil?
      @associationClass = a_associationClass
      a_associationClass.instance_variable_set("@associatedClassWithKey",self)
    end
    @associationClassManyKeys = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_id(a_id)
    was_set = false
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    return false unless @can_set_id
    @id = a_id
    was_set = true
    was_set
  end

  def get_id
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    @id
  end

  def get_associationClass
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    @associationClass
  end

  def get_associationClassManyKey(index)
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    a_associationClassManyKey = @associationClassManyKeys[index]
    a_associationClassManyKey
  end

  def get_associationClassManyKeys
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    new_associationClassManyKeys = @associationClassManyKeys.dup
    new_associationClassManyKeys
  end

  def number_of_associationClassManyKeys
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    number = @associationClassManyKeys.size
    number
  end

  def has_associationClassManyKeys
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    has = @associationClassManyKeys.size > 0
    has
  end

  def index_of_associationClassManyKey(a_associationClassManyKey)
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    index = @associationClassManyKeys.index(a_associationClassManyKey)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_associationClassManyKeys
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    minimum = 0
    minimum
  end

  def add_associationClassManyKey(a_associationClassManyKey)
    was_added = false
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    return false if index_of_associationClassManyKey(a_associationClassManyKey) != -1
    @associationClassManyKeys << a_associationClassManyKey
    if a_associationClassManyKey.index_of_associatedClass(self) != -1
      was_added = true
    else
      was_added = a_associationClassManyKey.add_associatedClass(self)
      unless was_added
        @associationClassManyKeys.delete(a_associationClassManyKey)
      end
    end
    was_added
  end

  def remove_associationClassManyKey(a_associationClassManyKey)
    was_removed = false
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    unless @associationClassManyKeys.include?(a_associationClassManyKey)
      return was_removed
    end

    oldIndex = @associationClassManyKeys.index(a_associationClassManyKey)
    @associationClassManyKeys.delete_at(oldIndex)
    if a_associationClassManyKey.index_of_associatedClass(self) == -1
      was_removed = true
    else
      was_removed = a_associationClassManyKey.remove_associatedClass(self)
      @associationClassManyKeys.insert(oldIndex,a_associationClassManyKey) unless was_removed
    end
    was_removed
  end

  def add_associationClassManyKey_at(a_associationClassManyKey, index)
    was_added = false
    if add_associationClassManyKey(a_associationClassManyKey)
      if(index < 0)
        index = 0
      end
      if(index > number_of_associationClassManyKeys())
        index = number_of_associationClassManyKeys() - 1
      end
      @associationClassManyKeys.delete(a_associationClassManyKey)
      @associationClassManyKeys.insert(index, a_associationClassManyKey)
      was_added = true
    end
    was_added
  end

  def add_or_move_associationClassManyKey_at(a_associationClassManyKey, index)
    was_added = false
    if @associationClassManyKeys.include?(a_associationClassManyKey)
      if(index < 0)
        index = 0
      end
      if(index > number_of_associationClassManyKeys())
        index = number_of_associationClassManyKeys() - 1
      end
      @associationClassManyKeys.delete(a_associationClassManyKey)
      @associationClassManyKeys.insert(index, a_associationClassManyKey)
      was_added = true
    else
      was_added = add_associationClassManyKey_at(a_associationClassManyKey, index)
    end
    was_added
  end

  def eql?(obj)
    return false if obj.nil?
    return false unless self.class == obj.class

    compareTo = obj
    return false unless @id == compareTo.instance_variable_get("@id")
    true
  end

  def hash
    return @cachedHashCode unless @cachedHashCode == -1
    @cachedHashCode = 17
    @cachedHashCode = @cachedHashCode * 23 + @id
    @can_set_id = false
    @cachedHashCode
  end

  def delete
    @deleted = true
    raise "Mandatory relationship with associationClass not satisfied" if (@initialized and !@deleted and @associationClass.nil?)
    existing_associationClass = @associationClass
    @associationClass = nil
    unless existing_associationClass.nil?
      existing_associationClass.delete
    end
    copy_of_associationClassManyKeys = @associationClassManyKeys.dup
    @associationClassManyKeys.clear
    copy_of_associationClassManyKeys.each do |a_associationClassManyKey|
      a_associationClassManyKey.remove_associatedClass(self)
    end
  end

end
end
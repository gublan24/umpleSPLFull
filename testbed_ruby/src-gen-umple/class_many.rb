# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruisePatternsTest

class ClassMany


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #ClassMany Associations - for documentation purposes
  #attr_reader :classOtherclasses

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(all_classOtherclasses)
    @initialized = false
    @deleted = false
    @can_set_classOtherclasses = true
    @classOtherclasses = []
    did_add_classOtherclasses = set_classOtherclasses(all_classOtherclasses)
    raise "Unable to create ClassMany, must not have duplicate @classOtherclasses. See http://manual.umple.org?RE001ViolationofImmutability.html" unless did_add_classOtherclasses
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def get_classOtherclass(index)
    a_classOtherclass = @classOtherclasses[index]
    a_classOtherclass
  end

  def get_classOtherclasses
    new_classOtherclasses = @classOtherclasses.dup
    new_classOtherclasses
  end

  def number_of_classOtherclasses
    number = @classOtherclasses.size
    number
  end

  def has_classOtherclasses
    has = @classOtherclasses.size > 0
    has
  end

  def index_of_classOtherclass(a_classOtherclass)
    index = @classOtherclasses.index(a_classOtherclass)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_classOtherclasses
    0
  end

  def set_classOtherclasses(new_classOtherclasses)
    was_set = false
    return false unless @can_set_classOtherclasses
    @can_set_classOtherclasses = false
    verified_classOtherclasses = []
    new_classOtherclasses.each do |a_classOtherclass|
      next if (verified_classOtherclasses.include?(a_classOtherclass))
      verified_classOtherclasses << a_classOtherclass
    end

    if verified_classOtherclasses.size != new_classOtherclasses.size
      return was_set
    end

    @classOtherclasses.clear
    verified_classOtherclasses.each do |a_classOtherclass|
      @classOtherclasses << a_classOtherclass
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
  end

end
end
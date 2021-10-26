# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class SortedSerializableCourse


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #SortedSerializableCourse Attributes - for documentation purposes
  #attr_reader :code, :sortedSerializableRegistrationsPriority

  #SortedSerializableCourse Associations - for documentation purposes
  #attr_reader :sortedSerializableAcademy, :sortedSerializableRegistrations

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_code, a_sortedSerializableAcademy)
    @initialized = false
    @deleted = false
    @code = a_code
    @sortedSerializableRegistrationsPriority = ""
    @sortedSerializableAcademy = nil
    did_add_sortedSerializableAcademy = set_sortedSerializableAcademy(a_sortedSerializableAcademy)
    raise "Unable to create sortedSerializableCourse due to @sortedSerializableAcademy. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_sortedSerializableAcademy
    @sortedSerializableRegistrations = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_code(a_code)
    was_set = false
    @code = a_code
    was_set = true
    was_set
  end

  def set_sortedSerializableRegistrationsPriority(a_sortedSerializableRegistrationsPriority)
    was_set = false
    @sortedSerializableRegistrationsPriority = a_sortedSerializableRegistrationsPriority
    was_set = true
    was_set
  end

  def get_code
    @code
  end

  def get_sortedSerializableRegistrationsPriority
    @sortedSerializableRegistrationsPriority
  end

  def get_sortedSerializableAcademy
    @sortedSerializableAcademy
  end

  def get_sortedSerializableRegistration(index)
    a_sortedSerializableRegistration = @sortedSerializableRegistrations[index]
    a_sortedSerializableRegistration
  end

  def get_sortedSerializableRegistrations
    new_sortedSerializableRegistrations = @sortedSerializableRegistrations.dup
    new_sortedSerializableRegistrations
  end

  def number_of_sortedSerializableRegistrations
    number = @sortedSerializableRegistrations.size
    number
  end

  def has_sortedSerializableRegistrations
    has = @sortedSerializableRegistrations.size > 0
    has
  end

  def index_of_sortedSerializableRegistration(a_sortedSerializableRegistration)
    index = @sortedSerializableRegistrations.index(a_sortedSerializableRegistration)
    index = -1 if index.nil?
    index
  end

  def set_sortedSerializableAcademy(a_sortedSerializableAcademy)
    was_set = false
    if a_sortedSerializableAcademy.nil?
      return was_set
    end

    existing_sortedSerializableAcademy = @sortedSerializableAcademy
    @sortedSerializableAcademy = a_sortedSerializableAcademy
    if !existing_sortedSerializableAcademy.nil? and !existing_sortedSerializableAcademy.eql?(a_sortedSerializableAcademy)
      existing_sortedSerializableAcademy.remove_sortedSerializableCourse(self)
    end
    @sortedSerializableAcademy.add_sortedSerializableCourse(self)
    was_set = true
    was_set
  end

  def self.minimum_number_of_sortedSerializableRegistrations
    0
  end

  def add_sortedSerializableRegistration(a_sortedSerializableRegistration)
    was_added = false
    return false if index_of_sortedSerializableRegistration(a_sortedSerializableRegistration) != -1
    existing_sortedSerializableCourse = a_sortedSerializableRegistration.get_sortedSerializableCourse
    is_new_sortedSerializableCourse = (!existing_sortedSerializableCourse.nil? and !existing_sortedSerializableCourse.eql?(self))
    if is_new_sortedSerializableCourse
      a_sortedSerializableRegistration.set_sortedSerializableCourse(self)
    else
      @sortedSerializableRegistrations << a_sortedSerializableRegistration
    end
    was_added = true
    @sortedSerializableRegistrations.sort! { |x, y| x.get_name() <=> y.get_name()} if wasAdded
    
    was_added
  end

  def remove_sortedSerializableRegistration(a_sortedSerializableRegistration)
    was_removed = false
    # Unable to remove a_sortedSerializableRegistration, as it must always have a sortedSerializableCourse
    unless a_sortedSerializableRegistration.get_sortedSerializableCourse.eql?(self)
      @sortedSerializableRegistrations.delete(a_sortedSerializableRegistration)
      was_removed = true
    end
    was_removed
  end


  def delete
    @deleted = true
    @placeholder_sortedSerializableAcademy = @sortedSerializableAcademy
    @sortedSerializableAcademy = nil
    @placeholder_sortedSerializableAcademy.remove_sortedSerializableCourse(self)
    @sortedSerializableRegistrations.each do |a_sortedSerializableRegistration|
      a_sortedSerializableRegistration.delete
    end
  end

end
end
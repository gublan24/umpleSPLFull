# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class SortedSerializableStudent


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #SortedSerializableStudent Attributes - for documentation purposes
  #attr_reader :id, :name

  #SortedSerializableStudent Associations - for documentation purposes
  #attr_reader :sortedSerializableAcademy, :sortedSerializableRegistrations

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_id, a_name, a_sortedSerializableAcademy)
    @initialized = false
    @deleted = false
    @id = a_id
    @name = a_name
    @sortedSerializableAcademy = nil
    did_add_sortedSerializableAcademy = set_sortedSerializableAcademy(a_sortedSerializableAcademy)
    raise "Unable to create registrant due to @sortedSerializableAcademy. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_sortedSerializableAcademy
    @sortedSerializableRegistrations = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_id(a_id)
    was_set = false
    @id = a_id
    was_set = true
    was_set
  end

  def set_name(a_name)
    was_set = false
    @name = a_name
    was_set = true
    was_set
  end

  def get_id
    @id
  end

  def get_name
    @name
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
      existing_sortedSerializableAcademy.remove_registrant(self)
    end
    @sortedSerializableAcademy.add_registrant(self)
    was_set = true
    was_set
  end

  def self.minimum_number_of_sortedSerializableRegistrations
    0
  end

  def add_sortedSerializableRegistration(a_sortedSerializableRegistration)
    was_added = false
    return false if index_of_sortedSerializableRegistration(a_sortedSerializableRegistration) != -1
    existing_sortedSerializableStudent = a_sortedSerializableRegistration.get_sortedSerializableStudent
    is_new_sortedSerializableStudent = (!existing_sortedSerializableStudent.nil? and !existing_sortedSerializableStudent.eql?(self))
    if is_new_sortedSerializableStudent
      a_sortedSerializableRegistration.set_sortedSerializableStudent(self)
    else
      @sortedSerializableRegistrations << a_sortedSerializableRegistration
    end
    was_added = true
    was_added
  end

  def remove_sortedSerializableRegistration(a_sortedSerializableRegistration)
    was_removed = false
    # Unable to remove a_sortedSerializableRegistration, as it must always have a sortedSerializableStudent
    unless a_sortedSerializableRegistration.get_sortedSerializableStudent.eql?(self)
      @sortedSerializableRegistrations.delete(a_sortedSerializableRegistration)
      was_removed = true
    end
    was_removed
  end

  def add_sortedSerializableRegistration_at(a_sortedSerializableRegistration, index)
    was_added = false
    if add_sortedSerializableRegistration(a_sortedSerializableRegistration)
      if(index < 0)
        index = 0
      end
      if(index > number_of_sortedSerializableRegistrations())
        index = number_of_sortedSerializableRegistrations() - 1
      end
      @sortedSerializableRegistrations.delete(a_sortedSerializableRegistration)
      @sortedSerializableRegistrations.insert(index, a_sortedSerializableRegistration)
      was_added = true
    end
    was_added
  end

  def add_or_move_sortedSerializableRegistration_at(a_sortedSerializableRegistration, index)
    was_added = false
    if @sortedSerializableRegistrations.include?(a_sortedSerializableRegistration)
      if(index < 0)
        index = 0
      end
      if(index > number_of_sortedSerializableRegistrations())
        index = number_of_sortedSerializableRegistrations() - 1
      end
      @sortedSerializableRegistrations.delete(a_sortedSerializableRegistration)
      @sortedSerializableRegistrations.insert(index, a_sortedSerializableRegistration)
      was_added = true
    else
      was_added = add_sortedSerializableRegistration_at(a_sortedSerializableRegistration, index)
    end
    was_added
  end

  def delete
    @deleted = true
    @placeholder_sortedSerializableAcademy = @sortedSerializableAcademy
    @sortedSerializableAcademy = nil
    @placeholder_sortedSerializableAcademy.remove_registrant(self)
    @sortedSerializableRegistrations.each do |a_sortedSerializableRegistration|
      a_sortedSerializableRegistration.delete
    end
  end

end
end
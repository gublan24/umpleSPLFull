# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class SortedSerializableRegistration


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #SortedSerializableRegistration Associations - for documentation purposes
  #attr_reader :sortedSerializableStudent, :sortedSerializableCourse

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_sortedSerializableStudent, a_sortedSerializableCourse)
    @initialized = false
    @deleted = false
    @sortedSerializableStudent = nil
    did_add_sortedSerializableStudent = set_sortedSerializableStudent(a_sortedSerializableStudent)
    raise "Unable to create sortedSerializableRegistration due to @sortedSerializableStudent. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_sortedSerializableStudent
    @sortedSerializableCourse = nil
    did_add_sortedSerializableCourse = set_sortedSerializableCourse(a_sortedSerializableCourse)
    raise "Unable to create sortedSerializableRegistration due to @sortedSerializableCourse. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_sortedSerializableCourse
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def get_name
    getSortedSerializableStudent().getName()
  end

  def get_code
    getSortedSerializableCourse().getCode()
  end

  def get_sortedSerializableStudent
    @sortedSerializableStudent
  end

  def get_sortedSerializableCourse
    @sortedSerializableCourse
  end

  def set_sortedSerializableStudent(a_sortedSerializableStudent)
    was_set = false
    if a_sortedSerializableStudent.nil?
      return was_set
    end

    existing_sortedSerializableStudent = @sortedSerializableStudent
    @sortedSerializableStudent = a_sortedSerializableStudent
    if !existing_sortedSerializableStudent.nil? and !existing_sortedSerializableStudent.eql?(a_sortedSerializableStudent)
      existing_sortedSerializableStudent.remove_sortedSerializableRegistration(self)
    end
    @sortedSerializableStudent.add_sortedSerializableRegistration(self)
    was_set = true
    was_set
  end

  def set_sortedSerializableCourse(a_sortedSerializableCourse)
    was_set = false
    if a_sortedSerializableCourse.nil?
      return was_set
    end

    existing_sortedSerializableCourse = @sortedSerializableCourse
    @sortedSerializableCourse = a_sortedSerializableCourse
    if !existing_sortedSerializableCourse.nil? and !existing_sortedSerializableCourse.eql?(a_sortedSerializableCourse)
      existing_sortedSerializableCourse.remove_sortedSerializableRegistration(self)
    end
    @sortedSerializableCourse.add_sortedSerializableRegistration(self)
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    @placeholder_sortedSerializableStudent = @sortedSerializableStudent
    @sortedSerializableStudent = nil
    @placeholder_sortedSerializableStudent.remove_sortedSerializableRegistration(self)
    @placeholder_sortedSerializableCourse = @sortedSerializableCourse
    @sortedSerializableCourse = nil
    @placeholder_sortedSerializableCourse.remove_sortedSerializableRegistration(self)
  end

end
end
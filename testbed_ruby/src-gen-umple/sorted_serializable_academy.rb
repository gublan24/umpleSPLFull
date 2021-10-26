# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class SortedSerializableAcademy


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #SortedSerializableAcademy Attributes - for documentation purposes
  #attr_reader :sortedSerializableCoursesPriority, :registrantsPriority

  #SortedSerializableAcademy Associations - for documentation purposes
  #attr_reader :sortedSerializableCourses, :registrants

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @sortedSerializableCoursesPriority = ""
    @registrantsPriority = ""
    @sortedSerializableCourses = []
    @registrants = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_sortedSerializableCoursesPriority(a_sortedSerializableCoursesPriority)
    was_set = false
    @sortedSerializableCoursesPriority = a_sortedSerializableCoursesPriority
    was_set = true
    was_set
  end

  def set_registrantsPriority(a_registrantsPriority)
    was_set = false
    @registrantsPriority = a_registrantsPriority
    was_set = true
    was_set
  end

  def get_sortedSerializableCoursesPriority
    @sortedSerializableCoursesPriority
  end

  def get_registrantsPriority
    @registrantsPriority
  end

  def get_sortedSerializableCourse(index)
    a_sortedSerializableCourse = @sortedSerializableCourses[index]
    a_sortedSerializableCourse
  end

  def get_sortedSerializableCourses
    new_sortedSerializableCourses = @sortedSerializableCourses.dup
    new_sortedSerializableCourses
  end

  def number_of_sortedSerializableCourses
    number = @sortedSerializableCourses.size
    number
  end

  def has_sortedSerializableCourses
    has = @sortedSerializableCourses.size > 0
    has
  end

  def index_of_sortedSerializableCourse(a_sortedSerializableCourse)
    index = @sortedSerializableCourses.index(a_sortedSerializableCourse)
    index = -1 if index.nil?
    index
  end

  def get_registrant(index)
    a_registrant = @registrants[index]
    a_registrant
  end

  def get_registrants
    new_registrants = @registrants.dup
    new_registrants
  end

  def number_of_registrants
    number = @registrants.size
    number
  end

  def has_registrants
    has = @registrants.size > 0
    has
  end

  def index_of_registrant(a_registrant)
    index = @registrants.index(a_registrant)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_sortedSerializableCourses
    0
  end

  def add_sortedSerializableCourse(a_sortedSerializableCourse)
    was_added = false
    return false if index_of_sortedSerializableCourse(a_sortedSerializableCourse) != -1
    existing_sortedSerializableAcademy = a_sortedSerializableCourse.get_sortedSerializableAcademy
    is_new_sortedSerializableAcademy = (!existing_sortedSerializableAcademy.nil? and !existing_sortedSerializableAcademy.eql?(self))
    if is_new_sortedSerializableAcademy
      a_sortedSerializableCourse.set_sortedSerializableAcademy(self)
    else
      @sortedSerializableCourses << a_sortedSerializableCourse
    end
    was_added = true
    @sortedSerializableCourses.sort! { |x, y| x.get_code() <=> y.get_code()} if wasAdded
    
    was_added
  end

  def remove_sortedSerializableCourse(a_sortedSerializableCourse)
    was_removed = false
    # Unable to remove a_sortedSerializableCourse, as it must always have a sortedSerializableAcademy
    unless a_sortedSerializableCourse.get_sortedSerializableAcademy.eql?(self)
      @sortedSerializableCourses.delete(a_sortedSerializableCourse)
      was_removed = true
    end
    was_removed
  end


  def self.minimum_number_of_registrants
    0
  end

  def add_registrant(a_registrant)
    was_added = false
    return false if index_of_registrant(a_registrant) != -1
    existing_sortedSerializableAcademy = a_registrant.get_sortedSerializableAcademy
    is_new_sortedSerializableAcademy = (!existing_sortedSerializableAcademy.nil? and !existing_sortedSerializableAcademy.eql?(self))
    if is_new_sortedSerializableAcademy
      a_registrant.set_sortedSerializableAcademy(self)
    else
      @registrants << a_registrant
    end
    was_added = true
    @registrants.sort! { |x, y| x.get_id() <=> y.get_id()} if wasAdded
    
    was_added
  end

  def remove_registrant(a_registrant)
    was_removed = false
    # Unable to remove a_registrant, as it must always have a sortedSerializableAcademy
    unless a_registrant.get_sortedSerializableAcademy.eql?(self)
      @registrants.delete(a_registrant)
      was_removed = true
    end
    was_removed
  end

  def delete
    @deleted = true
    @sortedSerializableCourses.each do |a_sortedSerializableCourse|
      a_sortedSerializableCourse.delete
    end
    @registrants.each do |a_registrant|
      a_registrant.delete
    end
  end

end
end
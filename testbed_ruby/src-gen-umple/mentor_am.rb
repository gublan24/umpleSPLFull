# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class MentorAM


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #MentorAM Attributes - for documentation purposes
  #attr_reader :name

  #MentorAM Associations - for documentation purposes
  #attr_reader :students

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_name)
    @initialized = false
    @deleted = false
    @name = a_name
    @students = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_name(a_name)
    was_set = false
    @name = a_name
    was_set = true
    was_set
  end

  def get_name
    @name
  end

  def get_student(index)
    a_student = @students[index]
    a_student
  end

  def get_students
    new_students = @students.dup
    new_students
  end

  def number_of_students
    number = @students.size
    number
  end

  def has_students
    has = @students.size > 0
    has
  end

  def index_of_student(a_student)
    index = @students.index(a_student)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_students
    0
  end

  def add_student(a_student)
    was_added = false
    return false if index_of_student(a_student) != -1
    existing_mentor = a_student.get_mentor
    if existing_mentor.nil?
      a_student.set_mentor(self)
    elsif !existing_mentor.eql?(self)
      existing_mentor.remove_student(a_student)
      add_student(a_student)
    else
      @students << a_student
    end
    was_added = true
    was_added
  end

  def remove_student(a_student)
    was_removed = false
    if @students.include?(a_student)
      @students.delete(a_student)
      a_student.set_mentor(nil)
      was_removed = true
    end
    was_removed
  end

  def add_student_at(a_student, index)
    was_added = false
    if add_student(a_student)
      if(index < 0)
        index = 0
      end
      if(index > number_of_students())
        index = number_of_students() - 1
      end
      @students.delete(a_student)
      @students.insert(index, a_student)
      was_added = true
    end
    was_added
  end

  def add_or_move_student_at(a_student, index)
    was_added = false
    if @students.include?(a_student)
      if(index < 0)
        index = 0
      end
      if(index > number_of_students())
        index = number_of_students() - 1
      end
      @students.delete(a_student)
      @students.insert(index, a_student)
      was_added = true
    else
      was_added = add_student_at(a_student, index)
    end
    was_added
  end

  def delete
    @deleted = true
    @students.each do |a_student|
      a_student.set_mentor(nil)
    end
  end

end
end
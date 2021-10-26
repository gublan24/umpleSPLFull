# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class StudentZ


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #StudentZ Attributes - for documentation purposes
  #attr_reader :number

  #StudentZ Associations - for documentation purposes
  #attr_reader :program, :mentor

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_number, a_mentor)
    @initialized = false
    @deleted = false
    @number = a_number
    @program = nil
    @mentor = nil
    did_add_mentor = set_mentor(a_mentor)
    raise "Unable to create student due to @mentor. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_mentor
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_number(a_number)
    was_set = false
    @number = a_number
    was_set = true
    was_set
  end

  def get_number
    @number
  end

  def get_program
    @program
  end

  def has_program
    has = !@program.nil?
    has
  end

  def get_mentor
    @mentor
  end

  def set_program(a_new_program)
    was_set = false
    if a_new_program.nil?
      existing_program = @program
      @program = nil
      
      if !existing_program.nil? and !existing_program.get_student.nil?
        existing_program.set_student(nil)
      end
      was_set = true
      return was_set
    end

    current_program = self.get_program
    if !current_program.nil? and !current_program.eql?(a_new_program)
      current_program.set_student(nil)
    end

    @program = a_new_program
    existing_student = a_new_program.get_student

    unless self.eql?(existing_student)
      a_new_program.set_student(self)
    end
    was_set = true
    was_set
  end

  def set_mentor(a_mentor)
    was_set = false
    # Must provide @mentor to student
    if a_mentor.nil?
      return was_set
    end

    # @mentor already at maximum (3)
    if a_mentor.number_of_students >= MentorZ.maximum_number_of_students
      return was_set
    end
    
    existing_mentor = @mentor
    @mentor = a_mentor
    if !existing_mentor.nil? and !existing_mentor.eql?(a_mentor)
      didRemove = existing_mentor.remove_student(self)
      unless didRemove
        @mentor = existing_mentor
        return was_set
      end
    end
    @mentor.add_student(self)
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    unless @program.nil?
      @program.set_student(nil)
    end
    @placeholder_mentor = @mentor
    @mentor = nil
    @placeholder_mentor.remove_student(self)
  end

end
end
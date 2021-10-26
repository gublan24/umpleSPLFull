# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class MentorA


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #MentorA Associations - for documentation purposes
  #attr_reader :student

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @student = nil
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def get_student
    @student
  end

  def has_student
    has = !@student.nil?
    has
  end

  def set_student(a_new_student)
    was_set = false
    if a_new_student.nil?
      existing_student = @student
      @student = nil
      
      if !existing_student.nil? and !existing_student.get_mentor.nil?
        existing_student.set_mentor(nil)
      end
      was_set = true
      return was_set
    end

    current_student = self.get_student
    if !current_student.nil? and !current_student.eql?(a_new_student)
      current_student.set_mentor(nil)
    end

    @student = a_new_student
    existing_mentor = a_new_student.get_mentor

    unless self.eql?(existing_mentor)
      a_new_student.set_mentor(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    unless @student.nil?
      @student.set_mentor(nil)
    end
  end

end
end
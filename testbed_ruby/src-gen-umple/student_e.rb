# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class StudentE


  #------------------------
  # STATIC VARIABLES
  #------------------------

  @@next_x = 1

  #------------------------
  # MEMBER VARIABLES
  #------------------------



  #Autounique Attributes - for documentation purposes
  #attr_reader x;

  #StudentE Associations - for documentation purposes
  #attr_reader :program, :mentor

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @x = @@next_x
    @@next_x += 1
    @program = nil
    @mentor = nil
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def get_x
    @x
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

  def has_mentor
    has = !@mentor.nil?
    has
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

  def delete
    @deleted = true
    unless @program.nil?
      @program.set_student(nil)
    end
    unless @mentor.nil?
      if @mentor.number_of_students <= 2
        @mentor.delete
      else
        @mentor.remove_student(self)
      end
    end
  end

end
end
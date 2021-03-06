# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class MentorH


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #MentorH Attributes - for documentation purposes
  #attr_reader :name

  #MentorH Associations - for documentation purposes
  #attr_reader :superMentor

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_name)
    @initialized = false
    @deleted = false
    @name = a_name
    @superMentor = nil
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

  def get_superMentor
    @superMentor
  end

  def has_superMentor
    has = !@superMentor.nil?
    has
  end

  def set_superMentor(a_new_superMentor)
    was_set = false
    if a_new_superMentor.nil?
      existing_superMentor = @superMentor
      @superMentor = nil
      
      if !existing_superMentor.nil? and !existing_superMentor.get_superMentor.nil?
        existing_superMentor.set_superMentor(nil)
      end
      was_set = true
      return was_set
    end

    current_superMentor = self.get_superMentor
    if !current_superMentor.nil? and !current_superMentor.eql?(a_new_superMentor)
      current_superMentor.set_superMentor(nil)
    end

    @superMentor = a_new_superMentor
    existing_superMentor = a_new_superMentor.get_superMentor

    unless self.eql?(existing_superMentor)
      a_new_superMentor.set_superMentor(self)
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    unless @superMentor.nil?
      @superMentor.set_superMentor(nil)
    end
  end

end
end
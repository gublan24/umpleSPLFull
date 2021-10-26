# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class MentorAR


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #MentorAR Associations - for documentation purposes
  #attr_reader :studentARs

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(all_studentARs)
    @initialized = false
    @deleted = false
    @studentARs = []
    did_add_studentARs = set_studentARs(all_studentARs)
    raise "Unable to create MentorAR, must have at least 1 @studentARs. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html" unless did_add_studentARs
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def get_studentAR(index)
    a_studentAR = @studentARs[index]
    a_studentAR
  end

  def get_studentARs
    new_studentARs = @studentARs.dup
    new_studentARs
  end

  def number_of_studentARs
    number = @studentARs.size
    number
  end

  def has_studentARs
    has = @studentARs.size > 0
    has
  end

  def index_of_studentAR(a_studentAR)
    index = @studentARs.index(a_studentAR)
    index = -1 if index.nil?
    index
  end

  def self.minimum_number_of_studentARs
    1
  end

  def add_studentAR(a_studentAR)
    was_added = false
    return false if index_of_studentAR(a_studentAR) != -1
    existing_mentorAR = a_studentAR.get_mentorAR
    if !existing_mentorAR.nil? and existing_mentorAR.number_of_studentARs <= MentorAR.minimum_number_of_studentARs
      return was_added
    elsif !existing_mentorAR.nil?
      existing_mentorAR.instance_variable_get("@studentARs").delete(a_studentAR)
    end
    @studentARs << a_studentAR
    a_studentAR.instance_variable_set("@mentorAR",self)
    was_added = true
    was_added
  end

  def remove_studentAR(a_studentAR)
    was_removed = false
    if @studentARs.include?(a_studentAR) and number_of_studentARs > MentorAR.minimum_number_of_studentARs
      @studentARs.delete(a_studentAR)
      a_studentAR.instance_variable_set("@mentorAR",nil)
      was_removed = true
    end
    was_removed
  end

  def set_studentARs(new_studentARs)
    was_set = false
    if new_studentARs.length < MentorAR.minimum_number_of_studentARs
      return was_set
    end

    check_new_studentARs = []
    mentorARToNewStudentARs = {}
    new_studentARs.each do |a_studentAR|
      if check_new_studentARs.include?(a_studentAR)
        return was_set
      elsif !a_studentAR.get_mentorAR.nil? and !a_studentAR.get_mentorAR.eql?(self)
        existing_mentorAR = a_studentAR.get_mentorAR
        unless mentorARToNewStudentARs.has_key?(existing_mentorAR)
          mentorARToNewStudentARs[existing_mentorAR] = existing_mentorAR.number_of_studentARs
        end
        currentCount = mentorARToNewStudentARs[existing_mentorAR]
        nextCount = currentCount - 1
        if nextCount < 1
          return was_set
        end
        mentorARToNewStudentARs[existing_mentorAR] = nextCount
      end
      check_new_studentARs << a_studentAR
    end

    check_new_studentARs.each do |a_studentAR|
      @studentARs.delete(a_studentAR)
    end

    @studentARs.each do |orphan|
      orphan.instance_variable_set("@mentorAR",nil)
    end
    @studentARs.clear
    new_studentARs.each do |a_studentAR|
      unless a_studentAR.get_mentorAR.nil?
        a_studentAR.get_mentorAR.instance_variable_get("@studentARs").delete(a_studentAR)
      end
      a_studentAR.instance_variable_set("@mentorAR",self)
      @studentARs << a_studentAR
    end
    was_set = true
    was_set
  end

  def add_studentAR_at(a_studentAR, index)
    was_added = false
    if add_studentAR(a_studentAR)
      if(index < 0)
        index = 0
      end
      if(index > number_of_studentARs())
        index = number_of_studentARs() - 1
      end
      @studentARs.delete(a_studentAR)
      @studentARs.insert(index, a_studentAR)
      was_added = true
    end
    was_added
  end

  def add_or_move_studentAR_at(a_studentAR, index)
    was_added = false
    if @studentARs.include?(a_studentAR)
      if(index < 0)
        index = 0
      end
      if(index > number_of_studentARs())
        index = number_of_studentARs() - 1
      end
      @studentARs.delete(a_studentAR)
      @studentARs.insert(index, a_studentAR)
      was_added = true
    else
      was_added = add_studentAR_at(a_studentAR, index)
    end
    was_added
  end

  def delete
    @deleted = true
    @studentARs.each do |a_studentAR|
      a_studentAR.instance_variable_set("@mentorAR",nil)
    end
    @studentARs.clear
  end

end
end
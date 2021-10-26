# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociations

class StudentAR


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #StudentAR Associations - for documentation purposes
  #attr_reader :mentorAR

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @mentorAR = nil
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def get_mentorAR
    @mentorAR
  end

  def has_mentorAR
    has = !@mentorAR.nil?
    has
  end

  def set_mentorAR(a_mentorAR)
    #
    # self source of self source generation is association_SetOptionalOneToMandatoryMany.jet
    # self set file assumes the generation of a maximumNumberOfXXX method does not exist because 
    # it's not required (No upper bound)
    #   
    
    wasSet = false
    
    existing_mentorAR = mentorAR;
    
    if existing_mentorAR.nil?
      if !a_mentorAR.nil
        if a_mentorAR.add_studentAR(self)
          existing_mentorAR = a_mentorAR
          wasSet = true
        end
      end
    elsif existing_mentorAR != null
      if a_mentorAR == null
        if existing_mentorAR.minimum_number_of_studentARs() < existing_mentorAR.number_of_studentARs()
          existing_mentorAR.remove_studentAR(self);
          existing_mentorAR = a_mentorAR;  # a_mentorAR == null
          wasSet = true;
        end
      else
        if existing_mentorAR.minimum_number_of_studentARs() < existing_mentorAR.number_of_studentARs()
          existing_mentorAR.remove_studentAR(self);
          a_mentorAR.add_studentAR(self);
          existing_mentorAR = a_mentorAR;
          wasSet = true;
        end
      end
    end
    
    if wasSet == true
      mentorAR = existing_mentorAR;
    end
    
    return wasSet;
  end

  def delete
    @deleted = true
    unless @mentorAR.nil?
      if @mentorAR.number_of_studentARs <= 1
        @mentorAR.delete
      else
        @mentorAR.remove_studentAR(self)
      end
    end
  end

end
end
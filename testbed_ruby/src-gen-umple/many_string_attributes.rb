# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAttributesTest

class ManyStringAttributes


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #ManyStringAttributes Attributes - for documentation purposes
  #attr_reader :worksString

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize()
    @initialized = false
    @deleted = false
    @worksString = []
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def add_worksString(a_worksString)
    was_added = false
    was_added = worksString << a_worksString
    was_added
  end

  def remove_worksString(a_worksString)
    was_removed = false
    was_removed = worksString.delete(a_worksString)
    was_removed
  end

  def get_worksString(index)
    a_worksString = worksString[index]
    a_worksString
  end

  def get_worksString
    String[] new_worksString = worksString.toArray(new String[worksString.size])
    new_worksString
  end

  def number_of_worksString
    number = worksString.size
    number;
  end

  def has_worksString
    has = worksString.size > 0
    has
  end

  def index_of_worksString(a_worksString)
    index = worksString.index(a_worksString)
    index = -1 if index.nil?
    index
  end

  def delete
    @deleted = true
  end

end
end
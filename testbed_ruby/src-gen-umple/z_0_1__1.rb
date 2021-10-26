# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_0_1__1


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_0_1__1 Attributes - for documentation purposes
  #attr_reader :num

  #Z_0_1__1 Associations - for documentation purposes
  #attr_reader :y_0_1__1

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_0_1__1 = nil
    @initialized = true
  end

  #------------------------
  # INTERFACE
  #------------------------

  def set_num(a_num)
    was_set = false
    @num = a_num
    was_set = true
    was_set
  end

  def get_num
    @num
  end

  def get_y_0_1__1
    @y_0_1__1
  end

  def has_y_0_1__1
    has = !@y_0_1__1.nil?
    has
  end

  def set_y_0_1__1(a_new_y_0_1__1)
    was_set = false
    if !@y_0_1__1.nil? and !@y_0_1__1.eql?(a_new_y_0_1__1) and self.eql?(@y_0_1__1.get_zVar)
      #Unable to set_y_0_1__1, as existing @y_0_1__1 would become an orphan
      return was_set
    end

    @y_0_1__1 = a_new_y_0_1__1
    an_old_zVar = !a_new_y_0_1__1.nil? ? a_new_y_0_1__1.get_zVar : nil

    unless self.eql?(an_old_zVar)
      unless an_old_zVar.nil?
        an_old_zVar.instance_variable_set("@y_0_1__1",nil)
      end
      unless @y_0_1__1.nil?
        @y_0_1__1.set_zVar(self)
      end
    end
    was_set = true
    was_set
  end

  def delete
    @deleted = true
    existing_y_0_1__1 = @y_0_1__1
    @y_0_1__1 = nil
    unless existing_y_0_1__1.nil?
      existing_y_0_1__1.delete
    end
  end

end
end
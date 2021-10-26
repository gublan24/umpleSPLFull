# PLEASE DO NOT EDIT THIS CODE
# This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!
# NOTE: Ruby generator is experimental and is missing some features available in
# in other Umple generated languages like Java or PHP

module CruiseAssociationsCompositions

class Z_0_1__m_n


  #------------------------
  # MEMBER VARIABLES
  #------------------------

  #Z_0_1__m_n Attributes - for documentation purposes
  #attr_reader :num

  #Z_0_1__m_n Associations - for documentation purposes
  #attr_reader :y_0_1__m_n

  #------------------------
  # CONSTRUCTOR
  #------------------------

  def initialize(a_num)
    @initialized = false
    @deleted = false
    @num = a_num
    @y_0_1__m_n = nil
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

  def get_y_0_1__m_n
    @y_0_1__m_n
  end

  def has_y_0_1__m_n
    has = !@y_0_1__m_n.nil?
    has
  end

  def delete
    @deleted = true
    if @y_0_1__m_n != nil
      if @y_0_1__m_n.number_of_zVar <= 2
        @y_0_1__m_n.delete
    @y_0_1__m_n = nil
      else
        a_y_0_1__m_n = @y_0_1__m_n.get_zVar
    a_y_0_1__m_n.delete(@y_0_1__m_n)
    @y_0_1__m_n = nil
      end
    end
  end

end
end
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * ConstraintLiterals encapulate raw data literals, such as strings, numbers and booleans, that do not have an model variable associated.
 * This will be a leaf in the constraint tree.
 */
// line 661 "../../../../src/Umple_CodeConstraint.ump"
// line 439 "../../../../src/Umple.ump"
public class ConstraintLiteral
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintLiteral Attributes
  private String value;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetValue;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintLiteral(String aValue)
  {
    cachedHashCode = -1;
    canSetValue = true;
    value = aValue;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    if (!canSetValue) { return false; }
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public String getValue()
  {
    return value;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    ConstraintLiteral compareTo = (ConstraintLiteral)obj;
  
    if (getValue() == null && compareTo.getValue() != null)
    {
      return false;
    }
    else if (getValue() != null && !getValue().equals(compareTo.getValue()))
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getValue() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getValue().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetValue = false;
    return cachedHashCode;
  }

  public void delete()
  {}

  // line 663 "../../../../src/Umple_CodeConstraint.ump"
   public String getType(){
    return "literal";
  }


  public String toString()
  {
    return super.toString() + "["+
            "value" + ":" + getValue()+ "]";
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * ConstraintUnassignedNames are names that were not recognized by the analysis, for example ConstraintMethodParameters are originally ConstraintUnassignedNames,
 * but are caught when they are added to the Precondition or Postcondition and a ConstraintMethodParameter is added instead of the ConstraintUnassignedName.
 */
// line 666 "../../../../src/Umple_CodeConstraint.ump"
// line 495 "../../../../src/Umple.ump"
public class ConstraintUnassignedName extends ConstraintNamed
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintUnassignedName Attributes
  private String value;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetValue;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintUnassignedName(String aValue)
  {
    super();
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

    ConstraintUnassignedName compareTo = (ConstraintUnassignedName)obj;
  
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
  {
    super.delete();
  }

  // line 670 "../../../../src/Umple_CodeConstraint.ump"
  public String getName(){
    return getValue();
  }

  // line 672 "../../../../src/Umple_CodeConstraint.ump"
   public String getType(){
    return "name";
  }


  public String toString()
  {
    return super.toString() + "["+
            "value" + ":" + getValue()+ "]";
  }
}
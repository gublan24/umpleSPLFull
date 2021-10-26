/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * ConstraintMethodParameters are there for Preconditions and Postconditions, they encapsulate the MethodParameter that the constraint is refering to
 * This will be a leaf on the constraint tree.
 */
// line 678 "../../../../src/Umple_CodeConstraint.ump"
// line 485 "../../../../src/Umple.ump"
public class ConstraintMethodParameter extends ConstraintNamed
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintMethodParameter Attributes
  private MethodParameter parameter;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetParameter;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintMethodParameter(MethodParameter aParameter)
  {
    super();
    cachedHashCode = -1;
    canSetParameter = true;
    parameter = aParameter;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setParameter(MethodParameter aParameter)
  {
    boolean wasSet = false;
    if (!canSetParameter) { return false; }
    parameter = aParameter;
    wasSet = true;
    return wasSet;
  }

  public MethodParameter getParameter()
  {
    return parameter;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    ConstraintMethodParameter compareTo = (ConstraintMethodParameter)obj;
  
    if (getParameter() == null && compareTo.getParameter() != null)
    {
      return false;
    }
    else if (getParameter() != null && !getParameter().equals(compareTo.getParameter()))
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
    if (getParameter() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getParameter().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetParameter = false;
    return cachedHashCode;
  }

  public void delete()
  {
    super.delete();
  }

  // line 682 "../../../../src/Umple_CodeConstraint.ump"
  public String getName(){
    return parameter==null?"":parameter.getName();
  }

  // line 684 "../../../../src/Umple_CodeConstraint.ump"
   public String getType(){
    return "method parameter";
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parameter" + "=" + (getParameter() != null ? !getParameter().equals(this)  ? getParameter().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
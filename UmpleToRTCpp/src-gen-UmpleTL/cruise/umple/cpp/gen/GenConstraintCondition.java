/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;

// line 163 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenConstraintCondition
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenConstraintCondition Attributes
  private String string;
  private String operator;
  private int priority;

  //GenConstraintCondition Associations
  private GenMethod method;
  private AbstractGenConstraint constraint;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenConstraintCondition()
  {
    string = null;
    operator = GenConstraintOperators.AND;
    priority = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setString(String aString)
  {
    boolean wasSet = false;
    string = aString;
    wasSet = true;
    return wasSet;
  }

  public boolean setOperator(String aOperator)
  {
    boolean wasSet = false;
    operator = aOperator;
    wasSet = true;
    return wasSet;
  }

  public boolean setPriority(int aPriority)
  {
    boolean wasSet = false;
    priority = aPriority;
    wasSet = true;
    return wasSet;
  }

  public String getString()
  {
    return string;
  }

  public String getOperator()
  {
    return operator;
  }

  public int getPriority()
  {
    return priority;
  }
  /* Code from template association_GetOne */
  public GenMethod getMethod()
  {
    return method;
  }

  public boolean hasMethod()
  {
    boolean has = method != null;
    return has;
  }
  /* Code from template association_GetOne */
  public AbstractGenConstraint getConstraint()
  {
    return constraint;
  }

  public boolean hasConstraint()
  {
    boolean has = constraint != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setMethod(GenMethod aMethod)
  {
    boolean wasSet = false;
    GenMethod existingMethod = method;
    method = aMethod;
    if (existingMethod != null && !existingMethod.equals(aMethod))
    {
      existingMethod.removeConstraintCondition(this);
    }
    if (aMethod != null)
    {
      aMethod.addConstraintCondition(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setConstraint(AbstractGenConstraint aConstraint)
  {
    boolean wasSet = false;
    AbstractGenConstraint existingConstraint = constraint;
    constraint = aConstraint;
    if (existingConstraint != null && !existingConstraint.equals(aConstraint))
    {
      existingConstraint.removeCondition(this);
    }
    if (aConstraint != null)
    {
      aConstraint.addCondition(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (method != null)
    {
      GenMethod placeholderMethod = method;
      this.method = null;
      placeholderMethod.removeConstraintCondition(this);
    }
    if (constraint != null)
    {
      AbstractGenConstraint placeholderConstraint = constraint;
      this.constraint = null;
      placeholderConstraint.removeCondition(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "string" + ":" + getString()+ "," +
            "operator" + ":" + getOperator()+ "," +
            "priority" + ":" + getPriority()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "method = "+(getMethod()!=null?Integer.toHexString(System.identityHashCode(getMethod())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "constraint = "+(getConstraint()!=null?Integer.toHexString(System.identityHashCode(getConstraint())):"null");
  }
}
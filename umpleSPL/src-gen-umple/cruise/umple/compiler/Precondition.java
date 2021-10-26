/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * The Preconditions are constraints on methods, restricting the method so that it does not process if the constraint is not satisfied.
 */
// line 325 "../../../../src/Umple_CodeConstraint.ump"
// line 400 "../../../../src/Umple.ump"
public class Precondition
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Precondition Associations
  private Method method;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Precondition(Method aMethod)
  {
    if (!setMethod(aMethod))
    {
      throw new RuntimeException("Unable to create Precondition due to aMethod. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Method getMethod()
  {
    return method;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setMethod(Method aNewMethod)
  {
    boolean wasSet = false;
    if (aNewMethod != null)
    {
      method = aNewMethod;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    method = null;
  }

  // line 329 "../../../../src/Umple_CodeConstraint.ump"
  public ConstraintTree createNew(){
    return new Precondition(method);
  }

  // line 334 "../../../../src/Umple_CodeConstraint.ump"
   public ConstraintVariable addElement(ConstraintVariable aElement){
    if(aElement instanceof ConstraintUnassignedName)
    {
      ConstraintUnassignedName name = (ConstraintUnassignedName)aElement;
      MethodParameter foundParameter = null;
      for(MethodParameter param:method.getMethodParameters())
      {
        if(param.getName().equals(name.getValue()))
        {
          foundParameter = param;
          break;
        }
      }
      if(foundParameter!=null)
      {
        aElement = new ConstraintMethodParameter(foundParameter);
      }
    }
    return super.addElement(aElement);
  }

}
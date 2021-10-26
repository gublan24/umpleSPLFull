/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;

/**
 * The Preconditions are constraints on methods, throughing an exception if the constraint is not sastisfied after the method has computed.
 */
// line 355 "../../../../src/Umple_CodeConstraint.ump"
// line 407 "../../../../src/Umple.ump"
public class Postcondition
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Postcondition Attributes
  private Position position;

  //Postcondition Associations
  private Method method;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Postcondition(Method aMethod)
  {
    if (!setMethod(aMethod))
    {
      throw new RuntimeException("Unable to create Postcondition due to aMethod. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public Position getPosition()
  {
    return position;
  }
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

  // line 359 "../../../../src/Umple_CodeConstraint.ump"
  public ConstraintTree createNew(){
    return new Postcondition(method);
  }

  // line 364 "../../../../src/Umple_CodeConstraint.ump"
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


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "method = "+(getMethod()!=null?Integer.toHexString(System.identityHashCode(getMethod())):"null");
  }
}
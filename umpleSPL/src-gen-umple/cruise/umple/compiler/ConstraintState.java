/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * ConstraintStates encapsulate the state data in a statemachine expression such as [sm is in state st], this is a leaf in the constraint tree/
 */
// line 737 "../../../../src/Umple_CodeConstraint.ump"
// line 505 "../../../../src/Umple.ump"
public class ConstraintState extends ConstraintNamed
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintState()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 741 "../../../../src/Umple_CodeConstraint.ump"
  public String getName(){
    return state==null?null:state.getName();
  }

  // line 743 "../../../../src/Umple_CodeConstraint.ump"
   public String getType(){
    return "state";
  }

}
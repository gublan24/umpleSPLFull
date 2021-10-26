/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * ConstraintStateMachines encapsulate the statemachine data in a statemachine expression such as [sm is in state st], this is a leaf in the constraint tree.
 */
// line 746 "../../../../src/Umple_CodeConstraint.ump"
// line 513 "../../../../src/Umple.ump"
public class ConstraintStateMachine extends ConstraintNamed
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintStateMachine()
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

  // line 750 "../../../../src/Umple_CodeConstraint.ump"
  public String getName(){
    return stateMachine==null?null:stateMachine.getName();
  }

  // line 752 "../../../../src/Umple_CodeConstraint.ump"
   public String getType(){
    return "statemachine";
  }

}
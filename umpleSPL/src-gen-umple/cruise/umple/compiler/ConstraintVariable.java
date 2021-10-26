/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.Iterator;

/**
 * ConstraintVariables encapsulate that data of one element in a ConstraintTree, making up the nodes of that tree.
 * For example: a<3
 * has the structure:   ConstraintTree
 * ConstraintOperator(<)
 * /            \
 * ConstraintTree     ConstraintNumberLiteral(3)
 * ConstraintAttribute(a)
 * where all the "Constraint" classes inherit from ConstraintVariable
 */
// line 688 "../../../../src/Umple_CodeConstraint.ump"
// line 366 "../../../../src/Umple.ump"
public abstract class ConstraintVariable implements Iterable<ConstraintVariable>
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintVariable()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 695 "../../../../src/Umple_CodeConstraint.ump"
  public String getValue(CodeTranslator gen){
    return gen.translate(getType(),this);
  }

  // line 698 "../../../../src/Umple_CodeConstraint.ump"
  public UmpleClassifier retrieveClassifier(){
    return null;
  }

  // line 703 "../../../../src/Umple_CodeConstraint.ump"
  public Iterator<ConstraintVariable> iterator(){
    final ConstraintVariable myself = this;
    return new Iterator<ConstraintVariable>()
    {
      boolean hasReturned;
      ConstraintVariable self;
      {
        hasReturned = false;
        self = myself;
      }
      public ConstraintVariable next()
      {
        if(hasReturned)
        {
          return null;
        }
        else
        {
          hasReturned = true;
          return self;
        }
      }
      public boolean hasNext()
      {
        return !hasReturned;
      }
      public void remove(){}
    };
  }

   public abstract String getType();

}
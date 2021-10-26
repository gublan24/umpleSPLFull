/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.compiler.*;
import cruise.umple.parser.Position;
import java.util.*;

// line 950 "../../../../src/Umple_CodeConstraint.ump"
public class ModelConstraintAttributeFromName extends ModelConstraint
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelConstraintAttributeFromName(Position aPosition)
  {
    super(aPosition);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 958 "../../../../src/Umple_CodeConstraint.ump"
   public ModelConstraintResult evaluate(UmpleClassifier uClassifier){
    ModelConstraintResult evaluation = super.evaluate(uClassifier);
    if(!evaluation.equals(ModelConstraint.SUCCESS))
    {
      return evaluation;
    }
    if(uClassifier instanceof UmpleClass)
    {
      UmpleClass uClass = null;
      if("this".equals(getSource()))
      {
        uClass = (UmpleClass)uClassifier;
        setSource(uClass.getName());
      }
      else
      {
        uClass = ((UmpleClass)uClassifier).getSourceModel().getUmpleClass(getSource());
      }
      if(uClass == null)
      {
        return new ModelConstraintResult(getPosition(),90,getTarget(),getSource());
      }
      return uClass.getAttribute(getTarget())!=null?ModelConstraint.SUCCESS:new ModelConstraintResult(getPosition(),90,getTarget(),getSource());
    }
    return ModelConstraint.SUCCESS;
  }

}
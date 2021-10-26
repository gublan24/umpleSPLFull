/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.compiler.*;
import cruise.umple.parser.Position;
import java.util.*;

// line 985 "../../../../src/Umple_CodeConstraint.ump"
public class ModelConstraintAttributeFromClass extends ModelConstraint
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelConstraintAttributeFromClass(Position aPosition)
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

  // line 993 "../../../../src/Umple_CodeConstraint.ump"
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
        setSource(uClassifier.getName());
      }

      uClass = ((UmpleClass)uClassifier).getSourceModel().getUmpleClass(getSource());
      if(uClass == null)
      {
        return new ModelConstraintResult(getPosition(),91,getTarget(),getSource());
      }

      for(Attribute attribute:uClass.getAttributes())
      {
        if(getTarget().equals(attribute.getType()))
        {
          return ModelConstraint.SUCCESS;
        }
        else {
          UmpleClass child = uClass.getSourceModel().getUmpleClass(attribute.getType());

          if(child!=null)
          {
            UmpleClass parent = child.getExtendsClass();
            while(child!=null)
            {
              if(child.getName().equals(getTarget()))
              {
                return ModelConstraint.SUCCESS;
              }
              UmpleClass temp = parent;
              parent = child.getExtendsClass();
              child = temp;
            }
          }
        }
      }
      return new ModelConstraintResult(getPosition(),91,getTarget(),getSource());
    }
    return ModelConstraint.SUCCESS;
  }

}
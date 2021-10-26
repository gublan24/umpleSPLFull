/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.compiler.*;
import cruise.umple.parser.Position;
import java.util.*;

// line 892 "../../../../src/Umple_CodeConstraint.ump"
public class ModelConstraintSubClass extends ModelConstraint
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelConstraintSubClass(Position aPosition)
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

  // line 900 "../../../../src/Umple_CodeConstraint.ump"
   public ModelConstraintResult evaluate(UmpleClassifier uClassifier){
    ModelConstraintResult evaluation = super.evaluate(uClassifier);
    if(!evaluation.equals(ModelConstraint.SUCCESS))
    {
      return evaluation;
    }
    if(uClassifier instanceof UmpleClass)
    {
      UmpleClass child = null;
      if("this".equals(getSource()))
      {
        child = (UmpleClass)uClassifier;
        setSource(child.getName());
      }
      else
      {
        child = ((UmpleClass)uClassifier).getSourceModel().getUmpleClass(getSource());
      }
      if(child == null)
      {
        return new ModelConstraintResult(getPosition(),92,getTarget(),getSource());
      }

      if(child!=null)
      {
        UmpleClass parent = child.getExtendsClass();
        while(child!=null)
        {
          if(child.getName().equals(getTarget()))
          {
            return ModelConstraint.SUCCESS;
          }
          for(UmpleInterface i:child.getParentInterface())
          {
            if(i.getName().equals(getTarget()))
            {
              return ModelConstraint.SUCCESS;
            }
          }
          UmpleClass temp = parent;
          parent = child.getExtendsClass();
          child = temp;
        }
      }
      return new ModelConstraintResult(getPosition(),92,getTarget(),getSource());
    }

    return ModelConstraint.SUCCESS;
  }

}
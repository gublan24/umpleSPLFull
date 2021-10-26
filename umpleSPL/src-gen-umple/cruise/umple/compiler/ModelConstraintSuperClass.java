/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.compiler.*;
import cruise.umple.parser.Position;
import java.util.*;

// line 838 "../../../../src/Umple_CodeConstraint.ump"
public class ModelConstraintSuperClass extends ModelConstraint
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelConstraintSuperClass(Position aPosition)
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

  // line 846 "../../../../src/Umple_CodeConstraint.ump"
   public ModelConstraintResult evaluate(UmpleClassifier uClassifier){
    ModelConstraintResult evaluation = super.evaluate(uClassifier);
    if(!evaluation.equals(ModelConstraint.SUCCESS))
    {
      return evaluation;
    }
    if("this".equals(getSource()))
    {
      setSource(uClassifier.getName());
    }
    if(uClassifier instanceof UmpleClass)
    {
      UmpleClass child = ((UmpleClass)uClassifier).getSourceModel().getUmpleClass(getTarget());

      if(child!=null)
      {
        UmpleClass parent = child.getExtendsClass();
        while(child!=null)
        {
          if(child.getName().equals(getSource()))
          {
            return ModelConstraint.SUCCESS;
          }
          UmpleClass temp = parent;
          parent = child.getExtendsClass();
          child = temp;
        }
      }
      else
      {
        if (child != null)
        {
		  for(UmpleInterface i:child.getParentInterface())
		  {
			if(i.getName().equals(getSource()))
			{
			   return ModelConstraint.SUCCESS;
			}
		  }
        }
      }
      return new ModelConstraintResult(getPosition(),93,getTarget(),getSource());
    }
    return ModelConstraint.SUCCESS;
  }

}
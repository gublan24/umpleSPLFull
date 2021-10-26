/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.compiler.*;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * Fragment source file: Umple_CodeConstraint.ump
 * Line : 879
 */
// line 437 "../../../../src/Association_refactored.ump"
public class ModelConstraintAssociation extends ModelConstraint
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModelConstraintAssociation Attributes
  private Multiplicity leftHandMultiplicity;
  private Multiplicity rightHandMultiplicity;
  private String type;
  private boolean left;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelConstraintAssociation(Position aPosition)
  {
    super(aPosition);
    leftHandMultiplicity = new Multiplicity();
    rightHandMultiplicity = new Multiplicity();
    type = "--";
    left = true;
    // line 447 "../../../../src/Association_refactored.ump"
    leftHandMultiplicity.setBound("*");
    // END OF UMPLE AFTER INJECTION
    // line 448 "../../../../src/Association_refactored.ump"
    rightHandMultiplicity.setBound("*");
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLeftHandMultiplicity(Multiplicity aLeftHandMultiplicity)
  {
    boolean wasSet = false;
    leftHandMultiplicity = aLeftHandMultiplicity;
    wasSet = true;
    return wasSet;
  }

  public boolean setRightHandMultiplicity(Multiplicity aRightHandMultiplicity)
  {
    boolean wasSet = false;
    rightHandMultiplicity = aRightHandMultiplicity;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setLeft(boolean aLeft)
  {
    boolean wasSet = false;
    left = aLeft;
    wasSet = true;
    return wasSet;
  }

  public Multiplicity getLeftHandMultiplicity()
  {
    return leftHandMultiplicity;
  }

  public Multiplicity getRightHandMultiplicity()
  {
    return rightHandMultiplicity;
  }

  public String getType()
  {
    return type;
  }

  public boolean getLeft()
  {
    return left;
  }

  public void delete()
  {
    super.delete();
  }

  // line 451 "../../../../src/Association_refactored.ump"
   public void addAssociationEnd(Multiplicity multiplicity){
    if(left)
      {
        leftHandMultiplicity = multiplicity;
      }
      else
      {
        rightHandMultiplicity = multiplicity;
      }
      left = false;
  }

  // line 463 "../../../../src/Association_refactored.ump"
   public void setAssociationType(String aType){
    type = aType;
      left = false;
  }

  // line 469 "../../../../src/Association_refactored.ump"
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
      if(type.equals("<-"))
      {
        String temp = getSource();
        setSource(getTarget());
        setTarget(temp);
        Multiplicity tempMultiplicity = rightHandMultiplicity;
        rightHandMultiplicity = leftHandMultiplicity;
        leftHandMultiplicity = tempMultiplicity;
      }
      if(uClassifier instanceof UmpleClass)
      {
        UmpleClass uClass = null;
        uClass = ((UmpleClass)uClassifier).getSourceModel().getUmpleClass(getSource());

        if(uClass == null)
        {
          return new ModelConstraintResult(getPosition(),94,getTarget(),getSource());
        }
        for(Association association:uClass.getAssociations())
        {
          AssociationEnd theirs = null;
          AssociationEnd mine = null;
          if(association.getEnd(0).getClassName().equals(uClass.getName()))
          {
            theirs = association.getEnd(1);
            mine = association.getEnd(0);
          }
          else if(association.getEnd(1).getClassName().equals(uClass.getName()))
          {
            theirs = association.getEnd(0);
            mine = association.getEnd(1);
          }

          if(!theirs.getClassName().equals(getTarget()))
          {
            boolean isNotMyConcern = true;
            UmpleClass child = ((UmpleClass)uClassifier).getSourceModel().getUmpleClass(theirs.getClassName());

            if(child!=null)
            {
              UmpleClass parent = child.getExtendsClass();
              while(child!=null)
              {
                if(child.getName().equals(getTarget()))
                {
                  isNotMyConcern = false;
                }
                UmpleClass temp = parent;
                parent = child.getExtendsClass();
                child = temp;
              }
            }
            if(isNotMyConcern)
            {
              continue;
            }
          }

          String tBound = theirs.getMultiplicity().getBound();

          Integer rMax = 0;
          Integer rMin = 0;

          if(rightHandMultiplicity.getBound()!=null)
          {
            rMax = Integer.parseInt(rightHandMultiplicity.getBound().replace("*",""+Integer.MAX_VALUE));
            rMin = Integer.parseInt(rightHandMultiplicity.getBound().replace("*","0"));
          }
          else
          {
            rMax = Integer.parseInt(rightHandMultiplicity.getMaximum().replace("*",""+Integer.MAX_VALUE));
            rMin = Integer.parseInt(rightHandMultiplicity.getMinimum().replace("*","0"));
          }

          if("*".equals(rightHandMultiplicity.getBound()))
          {
          }
          else if(tBound==null)
          {
            Integer tMin = Integer.parseInt(theirs.getMultiplicity().getMinimum().replace("*","0"));
            Integer tMax = Integer.parseInt(theirs.getMultiplicity().getMaximum().replace("*",""+Integer.MAX_VALUE));

            if(tMax>rMax||tMin<rMin)
            {
              continue;
            }
          }
          else
          {
            Integer itBound = Integer.parseInt(tBound.replace("*","0"));
            if(itBound>rMax||itBound<rMin)
            {
              continue;
            }
          }

          tBound = mine.getMultiplicity().getBound();

          Integer lMax = 0;
          Integer lMin = 0;

          if(leftHandMultiplicity.getBound()!=null)
          {
            lMax = Integer.parseInt(leftHandMultiplicity.getBound().replace("*",""+Integer.MAX_VALUE));
            lMin = Integer.parseInt(leftHandMultiplicity.getBound().replace("*","0"));
          }
          else
          {
            lMax = Integer.parseInt(leftHandMultiplicity.getMaximum().replace("*",""+Integer.MAX_VALUE));
            lMin = Integer.parseInt(leftHandMultiplicity.getMinimum().replace("*","0"));
          }

          if("*".equals(leftHandMultiplicity.getBound()))
          {
          }
          else if(tBound==null)
          {
            Integer tMin = Integer.parseInt(mine.getMultiplicity().getMinimum().replace("*","0"));
            Integer tMax = Integer.parseInt(mine.getMultiplicity().getMaximum().replace("*",""+Integer.MAX_VALUE));

            if(tMax>lMax||tMin<lMin)
            {
              continue;
            }
          }
          else
          {
            Integer itBound = Integer.parseInt(tBound.replace("*","0"));
            if(itBound>lMax||itBound<lMin)
            {
              continue;
            }
          }
          return ModelConstraint.SUCCESS;
        }
        
        
        return new ModelConstraintResult(getPosition(),94,getTarget(),getSource());
      }
      return ModelConstraint.SUCCESS;
  }


  public String toString()
  {
    return super.toString() + "["+
            "type" + ":" + getType()+ "," +
            "left" + ":" + getLeft()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "leftHandMultiplicity" + "=" + (getLeftHandMultiplicity() != null ? !getLeftHandMultiplicity().equals(this)  ? getLeftHandMultiplicity().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rightHandMultiplicity" + "=" + (getRightHandMultiplicity() != null ? !getRightHandMultiplicity().equals(this)  ? getRightHandMultiplicity().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
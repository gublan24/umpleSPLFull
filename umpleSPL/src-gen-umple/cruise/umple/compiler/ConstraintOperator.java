/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * ConstraintOperators encapsulate the branching of the constraint tree, where the branches occur at the operators, for example
 * [a<3&&b!="loved"]
 * the basic structure will look like
 * ConstraintOperator(&&)
 * /                        \
 * ConstraintOperator(<)                                ConstraintOperator(!=)
 * /            \                                      /                 \
 * ConstraintAttribute(a) ConstraintNumberLiteral(3)   ConstraintAttribute(b)  ConstraintLiteral("loved")
 * With the extra complication that ConstraintTrees parent everything that are not ConstraintLiterals
 */
// line 385 "../../../../src/Umple_CodeConstraint.ump"
// line 426 "../../../../src/Umple.ump"
public class ConstraintOperator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintOperator Attributes
  private String value;

  //ConstraintOperator Associations
  private List<ConstraintVariable> subConstraints;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetLeft;
  private boolean canSetRight;
  private boolean canSetValue;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintOperator(String aValue)
  {
    cachedHashCode = -1;
    canSetLeft = true;
    canSetRight = true;
    canSetValue = true;
    value = aValue;
    subConstraints = new ArrayList<ConstraintVariable>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    if (!canSetValue) { return false; }
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public String getValue()
  {
    return value;
  }

  public ConstraintVariable getLeft()
  {
    return numberOfSubConstraints()>0?getSubConstraint(0):null;
  }

  public ConstraintVariable getRight()
  {
    return numberOfSubConstraints()>1?getSubConstraint(1):null;
  }
  /* Code from template association_GetMany */
  public ConstraintVariable getSubConstraint(int index)
  {
    ConstraintVariable aSubConstraint = subConstraints.get(index);
    return aSubConstraint;
  }

  public List<ConstraintVariable> getSubConstraints()
  {
    List<ConstraintVariable> newSubConstraints = Collections.unmodifiableList(subConstraints);
    return newSubConstraints;
  }

  public int numberOfSubConstraints()
  {
    int number = subConstraints.size();
    return number;
  }

  public boolean hasSubConstraints()
  {
    boolean has = subConstraints.size() > 0;
    return has;
  }

  public int indexOfSubConstraint(ConstraintVariable aSubConstraint)
  {
    int index = subConstraints.indexOf(aSubConstraint);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSubConstraints()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfSubConstraints()
  {
    return 2;
  }
  /* Code from template association_AddUnidirectionalOptionalN */
  public boolean addSubConstraint(ConstraintVariable aSubConstraint)
  {
    boolean wasAdded = false;
    if (subConstraints.contains(aSubConstraint)) { return false; }
    if (numberOfSubConstraints() < maximumNumberOfSubConstraints())
    {
      subConstraints.add(aSubConstraint);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean removeSubConstraint(ConstraintVariable aSubConstraint)
  {
    boolean wasRemoved = false;
    if (subConstraints.contains(aSubConstraint))
    {
      subConstraints.remove(aSubConstraint);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalOptionalN */
  public boolean setSubConstraints(ConstraintVariable... newSubConstraints)
  {
    boolean wasSet = false;
    ArrayList<ConstraintVariable> verifiedSubConstraints = new ArrayList<ConstraintVariable>();
    for (ConstraintVariable aSubConstraint : newSubConstraints)
    {
      if (verifiedSubConstraints.contains(aSubConstraint))
      {
        continue;
      }
      verifiedSubConstraints.add(aSubConstraint);
    }

    if (verifiedSubConstraints.size() != newSubConstraints.length || verifiedSubConstraints.size() > maximumNumberOfSubConstraints())
    {
      return wasSet;
    }

    subConstraints.clear();
    subConstraints.addAll(verifiedSubConstraints);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSubConstraintAt(ConstraintVariable aSubConstraint, int index)
  {  
    boolean wasAdded = false;
    if(addSubConstraint(aSubConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubConstraints()) { index = numberOfSubConstraints() - 1; }
      subConstraints.remove(aSubConstraint);
      subConstraints.add(index, aSubConstraint);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSubConstraintAt(ConstraintVariable aSubConstraint, int index)
  {
    boolean wasAdded = false;
    if(subConstraints.contains(aSubConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubConstraints()) { index = numberOfSubConstraints() - 1; }
      subConstraints.remove(aSubConstraint);
      subConstraints.add(index, aSubConstraint);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSubConstraintAt(aSubConstraint, index);
    }
    return wasAdded;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    ConstraintOperator compareTo = (ConstraintOperator)obj;
  
    if (getLeft() == null && compareTo.getLeft() != null)
    {
      return false;
    }
    else if (getLeft() != null && !getLeft().equals(compareTo.getLeft()))
    {
      return false;
    }

    if (getRight() == null && compareTo.getRight() != null)
    {
      return false;
    }
    else if (getRight() != null && !getRight().equals(compareTo.getRight()))
    {
      return false;
    }

    if (getValue() == null && compareTo.getValue() != null)
    {
      return false;
    }
    else if (getValue() != null && !getValue().equals(compareTo.getValue()))
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getLeft() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getLeft().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getRight() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getRight().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getValue() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getValue().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetLeft = false;
    canSetRight = false;
    canSetValue = false;
    return cachedHashCode;
  }

  public void delete()
  {
    subConstraints.clear();
  }


  /**
   * Returns which kind of operator this is based on the number of operands it has.
   */
  // line 390 "../../../../src/Umple_CodeConstraint.ump"
   public String getType(){
    return numberOfSubConstraints()>0?numberOfSubConstraints()>1?"operatorTwo":"operatorOne":"operatorNone";
  }


  /**
   * Carefully adds the operand on one side of the operator or the other, for example string literals are added in front, regardless of how they are arranged in the inputted constraint
   * takes care of making sure cardinality calls the numberOf method, and if there is a number it puts it as the right operand(flipping ordinal operators)
   */
  // line 398 "../../../../src/Umple_CodeConstraint.ump"
   public void addOperand(ConstraintVariable variable){
    if(variable!=null)
    {
      if(variable instanceof ConstraintLiteral)
      {
        if(variable instanceof ConstraintNumberLiteral)
        {
          correctForPrimitive();
          subConstraints.add(variable);
        }
        else if(numberOfSubConstraints()>0)
        {
          subConstraints.add(0,variable);
        }
        else
        {
          subConstraints.add(variable);
        }

      }
      else
      {
        if(numberOfSubConstraints()==0&&value.contains("cardinality"))
        {
          correctForCardinality(variable);
        }
        if(numberOfSubConstraints()==1&&getLeft() instanceof ConstraintNumberLiteral)
        {
          subConstraints.add(0,variable);
          flip();
        }
        else
        {
          subConstraints.add(variable);
        }
      }
    }
  }


  /**
   * Tries to set associations so that they will use the numberOf method for the size.
   * @param variable to the corrected
   */
  // line 442 "../../../../src/Umple_CodeConstraint.ump"
   public void correctForCardinality(ConstraintVariable variable){
    if(variable == null)
    {
      return;
    }

    Label_Association_26: ;

    else if((variable instanceof ConstraintTree)&&((ConstraintTree)variable).getNumberOfElements()>0)
    {
      correctForCardinality(((ConstraintTree)variable).getRoot());
    }
    else if(variable instanceof ConstraintOperator)
    {
      correctForCardinality(((ConstraintOperator)variable).getRight());
    }
  }


  /**
   * switches the .equals() style method for the primitive == or !=
   */
  // line 464 "../../../../src/Umple_CodeConstraint.ump"
   public void correctForPrimitive(){
    if("object==".equals(value))
    {
      value = "==";
    }
    else if("object!=".equals(value))
    {
      value = "!=";
    }
  }


  /**
   * If the number is being put on the right, when it was originally on the left, the operator has to flip, '>' to '<' and '<' to '>'
   */
  // line 479 "../../../../src/Umple_CodeConstraint.ump"
   public void flip(){
    if(">=".equals(value))
    {
      value = "<=";
    }
    else if(">=".equals(value))
    {
      value = "<=";
    }
    else if("<".equals(value))
    {
      value = ">";
    }
    else if(">".equals(value))
    {
      value = "<";
    }
  }

  // line 499 "../../../../src/Umple_CodeConstraint.ump"
   public boolean isNegatable(){
    if(".".equals(value)||",".equals(value)||"".equals(value))
      {
        return false;
      }
      return true;
  }


  /**
   * If this method is reached by the negateVariable in ConstraintTree it means that the parent ConstraintTree doesn't have to display the negation, the operator will handle it instead.
   */
  // line 511 "../../../../src/Umple_CodeConstraint.ump"
   public boolean negate(){
    if ("".equals(value))
    {
      return false;
    }
    else if("object==".equals(value))
    {
      value = "object!=";
    }
    else if("object!=".equals(value))
    {
      value = "object==";
    }
    else if("==".equals(value))
    {
      value = "!=";
    }
    else if("!=".equals(value))
    {
      value = "==";
    }
    else if(">".equals(value))
    {
      value = "<=";
    }
    else if(">=".equals(value))
    {
      value = "<";
    }
    else if("<=".equals(value))
    {
      value = ">";
    }
    else if("<".equals(value))
    {
      value = ">=";
    }
    else if("cardinality==".equals(value))
    {
      value = "cardinality!=";
    }
    else if("cardinality!=".equals(value))
    {
      value = "cardinality==";
    }
    else if("cardinality>".equals(value))
    {
      value = "cardinality<=";
    }
    else if("cardinality>=".equals(value))
    {
      value = "cardinality<";
    }
    else if("cardinality<=".equals(value))
    {
      value = "cardinality>";
    }
    else if("cardinality<".equals(value))
    {
      value = "cardinality>=";
    }
    else if("&&".equals(value))
    {
      value = "||";
      return false;
    }
    else if("||".equals(value))
    {
      value = "&&";
      return false;
    }
    if(".".equals(value)||",".equals(value))
    {
      return false;
    }
    return true;
  }


  /**
   * Iterators over the left, then this, then the right.
   */
  // line 593 "../../../../src/Umple_CodeConstraint.ump"
   public Iterator<ConstraintVariable> iterator(){
    final ConstraintVariable myself = this;
    return new Iterator<ConstraintVariable>()
    {
      boolean hasReturnedSelf;
      Iterator<ConstraintVariable> currentIterator;
      ConstraintVariable self;
      {
        hasReturnedSelf = false;
        self = myself;
        if(getLeft()!=null)
        {
          currentIterator = getLeft().iterator();
        }
      }

      public ConstraintVariable next()
      {
        if(currentIterator == null||!currentIterator.hasNext())
        {
          if(getRight()!=null&&!hasReturnedSelf)
          {
            currentIterator = getRight().iterator();
          }
          else
          {
            currentIterator = null;
          }
          hasReturnedSelf = true;
          return self;
        }
        else
        {
          return currentIterator.next();
        }
      }
      public boolean hasNext()
      {
        return (currentIterator!=null&&currentIterator.hasNext())||!hasReturnedSelf;
      }
      public void remove(){}
    };
  }


  public String toString()
  {
    return super.toString() + "["+
            "value" + ":" + getValue()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "right" + "=" + (getRight() != null ? !getRight().equals(this)  ? getRight().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "left" + "=" + (getLeft() != null ? !getLeft().equals(this)  ? getLeft().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
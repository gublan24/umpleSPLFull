/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.Iterator;
import cruise.umple.compiler.*;
import cruise.umple.parser.Token;
import java.util.*;

/**
 * 
 * NEW CLASS****************************************
 * 
 * ConstraintTrees are a redundant class that are necessary because of lone constraints, i.e. [true] has to be handled, and does not contain an operator
 * If lone constraints didn't exist then the ConstraintTree class could be condensed into ConstraintOperator. One nice religation of responsibilities is that ConstraintTrees take care of the ! and () symbols, leaving the ConstraintOperator class to be more pure
 */
// line 16 "../../../../src/Umple_CodeConstraint.ump"
// line 1544 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
// line 372 "../../../../src/Umple.ump"
public class ConstraintTree
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintTree Attributes
  private ConstraintVariable root;
  private ConstraintOperator requestor;
  private TreeSet<String> names;
  private boolean shouldDisplayBrackets;
  private boolean displayNegation;
  private int numberOfElements;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetRoot;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintTree()
  {
    cachedHashCode = -1;
    canSetRoot = true;
    root = null;
    requestor = null;
    names = new TreeSet<String>();
    shouldDisplayBrackets = false;
    displayNegation = false;
    numberOfElements = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRoot(ConstraintVariable aRoot)
  {
    boolean wasSet = false;
    if (!canSetRoot) { return false; }
    root = aRoot;
    wasSet = true;
    return wasSet;
  }

  public boolean setRequestor(ConstraintOperator aRequestor)
  {
    boolean wasSet = false;
    requestor = aRequestor;
    wasSet = true;
    return wasSet;
  }

  public boolean setNames(TreeSet<String> aNames)
  {
    boolean wasSet = false;
    names = aNames;
    wasSet = true;
    return wasSet;
  }

  public boolean setShouldDisplayBrackets(boolean aShouldDisplayBrackets)
  {
    boolean wasSet = false;
    shouldDisplayBrackets = aShouldDisplayBrackets;
    wasSet = true;
    return wasSet;
  }

  public boolean setDisplayNegation(boolean aDisplayNegation)
  {
    boolean wasSet = false;
    displayNegation = aDisplayNegation;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumberOfElements(int aNumberOfElements)
  {
    boolean wasSet = false;
    numberOfElements = aNumberOfElements;
    wasSet = true;
    return wasSet;
  }

  public ConstraintVariable getRoot()
  {
    return root;
  }

  public ConstraintOperator getRequestor()
  {
    return requestor;
  }

  public TreeSet<String> getNames()
  {
    return names;
  }

  public boolean getShouldDisplayBrackets()
  {
    return shouldDisplayBrackets;
  }

  public boolean getDisplayNegation()
  {
    return displayNegation;
  }

  public boolean getDisplayBrackets()
  {
    return shouldDisplayBrackets||(displayNegation&&numberOfElements>1);
  }

  public int getNumberOfElements()
  {
    return numberOfElements;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    ConstraintTree compareTo = (ConstraintTree)obj;
  
    if (getRoot() == null && compareTo.getRoot() != null)
    {
      return false;
    }
    else if (getRoot() != null && !getRoot().equals(compareTo.getRoot()))
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
    if (getRoot() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getRoot().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetRoot = false;
    return cachedHashCode;
  }

  public void delete()
  {}


  /**
   * Used by trees to add all the elements of another tree to this tree
   * @param cv the constraint variable node to add to this tree(if it is a ConstraintTree it will add all of it's sub elements via the addElement method)
   */
  // line 24 "../../../../src/Umple_CodeConstraint.ump"
   public void addElementAll(ConstraintVariable cv){
    if(cv == null)
    {
      return;
    }
    else
    {
      addElement(cv);
    }
  }


  /**
   * Negates a sub variable of the ConstriantTree recursively trying to do as much as it can, setting this ConstraintTree to show the ! symbol if this is the deepest ConstraintTree
   * @param variable the sub constaint variable that is being negated. ConstraintOperators will call the negate method, ConstraintTrees will attempt to go deeper down the tree if that exists, trying to find a negatable target
   */
  // line 39 "../../../../src/Umple_CodeConstraint.ump"
   private boolean negateVariable(ConstraintVariable variable){
    boolean wasOperationNegatable = false;
    if((variable==null))
    {
      return false;
    }
    if(variable instanceof ConstraintOperator)
    {
      if(((ConstraintOperator)variable).isNegatable())
      {
        if(((ConstraintOperator)variable).negate())
        {
          return true;
        }
        else
        {
          boolean left = isNegateVariable(((ConstraintOperator)variable).getLeft());
          boolean right = isNegateVariable(((ConstraintOperator)variable).getRight());
          wasOperationNegatable = left&&right;
          if(wasOperationNegatable)
          {
           left = negateVariable(((ConstraintOperator)variable).getLeft());
           right = negateVariable(((ConstraintOperator)variable).getRight());            
          }
          else
          {
            ((ConstraintOperator)variable).negate();
          }
        }
      }
    }
    else if(variable instanceof ConstraintTree)
    {
      wasOperationNegatable = ((ConstraintTree)variable).negate();
    }
    else if(variable instanceof ConstraintLiteral||variable instanceof ConstraintUnassignedName)
    {
      return false;
    }

    if(!wasOperationNegatable)
    {
      displayNegation = !displayNegation;
      wasOperationNegatable=!wasOperationNegatable;
    }
    return wasOperationNegatable;
  }


  /**
   * To check if a subvariable of the ConstraintTree is negatable or not. Works like negateVariable but does not change the displayNegation.
   */
  // line 91 "../../../../src/Umple_CodeConstraint.ump"
   private boolean isNegateVariable(ConstraintVariable variable){
    boolean wasOperationNegatable = false;
    if((variable==null))
    {
      return false;
    }
    if(variable instanceof ConstraintOperator)
    {
      if(((ConstraintOperator)variable).isNegatable())
      {
        return true;
      }
    }
    else if(variable instanceof ConstraintTree)
    {
      wasOperationNegatable = ((ConstraintTree)variable).isNegatable();
    }
    else if(variable instanceof ConstraintLiteral||variable instanceof ConstraintUnassignedName)
    {
      return false;
    }
    if(displayNegation)
    {
      wasOperationNegatable=true;
    }
    return wasOperationNegatable;
  }


  /**
   * The public counterpart to the negateVariabe method, it negates this ConstraintTree's root, starting off the recursive decent into the negation of the tree
   */
  // line 126 "../../../../src/Umple_CodeConstraint.ump"
   public boolean negate(){
    return negateVariable(root);
  }


  /**
   * The public counterpart to the isNegateVariabe method, it checks negativability of this ConstraintTree's root, starting off the recursive decent into the negation of the tree
   */
  // line 133 "../../../../src/Umple_CodeConstraint.ump"
   public boolean isNegatable(){
    return isNegateVariable(root);
  }


  /**
   * Copies non-constraint data such as whether the tree should display the ! symbol and whether it should display ( ) around the treee
   */
  // line 141 "../../../../src/Umple_CodeConstraint.ump"
  public ConstraintTree clone(ConstraintTree tree){
    ConstraintTree aElement = createNew();
    aElement.setDisplayNegation(tree.getDisplayNegation());
    aElement.setShouldDisplayBrackets(tree.getShouldDisplayBrackets());
    return aElement;
  }


  /**
   * Creates a new instance of this class, it is used in clone and addElement in order to copy a tree so that there is a deep copy instead of a shallow one
   * This method needs to be overrided for sub classes of ConstaintTree to function properly.
   */
  // line 153 "../../../../src/Umple_CodeConstraint.ump"
  public ConstraintTree createNew(){
    return new ConstraintTree();
  }


  /**
   * Adds a node to the tree, the three modes are
   * - if nothing exists in the tree: set the element as the root
   * - if the element is an operator: add the root if it is not null as an operand to the operator, and set the operator to the root
   * - if there exists an operator: add the element as an operand to the operator.
   * @param element to be added to the tree
   */
  // line 165 "../../../../src/Umple_CodeConstraint.ump"
  public ConstraintVariable addElement(ConstraintVariable aElement){
    ++numberOfElements;
    ConstraintOperator operator = null;
    if(aElement instanceof ConstraintOperator)
    {
      operator = (ConstraintOperator)aElement;
      aElement = new ConstraintOperator(operator.getValue());
      addElementAll(operator.getLeft());
    }
    else if(aElement instanceof ConstraintTree)
    {
      ConstraintTree list = ((ConstraintTree)aElement);
      aElement = clone(list);
      ((ConstraintTree)aElement).addElementAll(list.getRoot());
    }
    if(aElement instanceof ConstraintOperator)
    {
      requestor = ((ConstraintOperator)aElement);
      requestor.addOperand(root);
      root = requestor;
    }
    else
    {
      if(requestor!=null)
      {
        requestor.addOperand(aElement);
        root = requestor;
        requestor = null;
      }
      else
      {
        root = aElement;
      }
      if(aElement instanceof ConstraintNamed)
      {
        if(!"this".equals(((ConstraintNamed)aElement).getName()))
        {
          names.add(((ConstraintNamed)aElement).getName());
        }
      }
      else if(aElement instanceof ConstraintTree)
      {
        names.addAll(((ConstraintTree)aElement).names);
      }
    }
    if(aElement instanceof ConstraintOperator)
    {
      addElementAll(operator.getRight());
    }
    return aElement;
  }


  /**
   * Whenever ConstraintTrees or named Constriants are added to the constraint tree, a record of that name is added to a set of names
   * This method pretty prints that set of names.
   */
  // line 222 "../../../../src/Umple_CodeConstraint.ump"
   public String getNamedNames(){
    StringBuilder builder = new StringBuilder();
    int i=0;
    String last = "";
    for(String name:names)
    {
      if(i>=names.size()-1)
      {
        last = name;
        break;
      }
      builder.append(name);
      if(names.size()>2)
      {
        builder.append(", ");
      }
      else builder.append(" ");
      ++i;
    }
    if(names.size()>1)builder.append("and ");
    builder.append(last);
    return builder.toString();
  }


  /**
   * Iterator method, override the method from the Iterable<Constraint> interface that all ConstraintVariables inherit from
   * Iterates over all of the root's elements, then returns itself
   */
  // line 251 "../../../../src/Umple_CodeConstraint.ump"
   public Iterator<ConstraintVariable> iterator(){
    final ConstraintTree myself = this;
    return new Iterator<ConstraintVariable>()
    {
      ConstraintTree self;
      boolean hasReturnedSelf;
      Iterator<ConstraintVariable> iterator;
      {
        self = myself;
        hasReturnedSelf = false;
        if(self.getRoot()!=null)
        {
          iterator = self.getRoot().iterator();
        }
      }
      public ConstraintVariable next()
      {
        if(iterator==null||!iterator.hasNext())
        {
          hasReturnedSelf = true;
          return self;
        }
        else
        {
          return iterator.next();
        }
      }
      public boolean hasNext()
      {
        return !hasReturnedSelf;
      }
      public void remove(){}
    };
  }


  /**
   * Mandatory type method for the SuperGenerator to distiguish easily between different ConstraintVariable types.
   */
  // line 288 "../../../../src/Umple_CodeConstraint.ump"
   public String getType(){
    return "complex";
  }


  /**
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ----------------------------------------------------------------------------
   * @author Vahdat
   * This comparison work properly currently for boolean operators. Developers must pay attention to parantheses.
   * TODO: please provide a comprehensive comparison
   */
  // line 1556 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   public boolean isEqualTo(ConstraintTree inConstraintTree){
    if (inConstraintTree==null) return false;
    if (getNumberOfElements()!=inConstraintTree.getNumberOfElements()) return false;  
    Collection<String>  lFirst = new ArrayList<String>(getNames());
    lFirst.removeAll(inConstraintTree.getNames());
    if(lFirst.size()>0) return false;
    if(getRoot() instanceof ConstraintOperator && inConstraintTree.getRoot() instanceof ConstraintOperator){
        ConstraintOperator mcOperator = (ConstraintOperator)getRoot();
        ConstraintOperator ccOperator = (ConstraintOperator)inConstraintTree.getRoot(); 
        if (!mcOperator.getValue().equals(  ccOperator.getValue() ) ) return false;
        ConstraintVariable mLeft= ((ConstraintOperator)getRoot()).getLeft();        
        ConstraintVariable mRight = ((ConstraintOperator)getRoot()).getRight();
        if ( !(mRight instanceof ConstraintLiteral)){
          mRight= ((ConstraintTree) ( ((ConstraintOperator)getRoot()).getRight() ) ).getRoot(); 
        } 
        ConstraintVariable cLeft= ((ConstraintOperator)inConstraintTree.getRoot()).getLeft();
        ConstraintVariable cRight = ((ConstraintOperator)inConstraintTree.getRoot()).getRight();
        if ( !(mRight instanceof ConstraintLiteral)){
          cRight= ((ConstraintTree) ( ((ConstraintOperator)inConstraintTree.getRoot()).getRight() ) ).getRoot();
        } 
        return compareBranches(mLeft,cLeft,cRight) && compareBranches(mRight,cLeft,cRight);
      }else if(getRoot() instanceof ConstraintLiteral&& inConstraintTree.getRoot() instanceof ConstraintLiteral){
        ConstraintLiteral mcLiteral = (ConstraintLiteral)getRoot();
        ConstraintLiteral ccLiteral = (ConstraintLiteral)inConstraintTree.getRoot();
        if (mcLiteral.getValue().equals(ccLiteral.getValue())) return true; else return false;
      }else if(getRoot() instanceof ConstraintNamed && inConstraintTree.getRoot() instanceof ConstraintNamed){
        ConstraintNamed mcNamed = (ConstraintNamed)getRoot();
        ConstraintNamed ccNamed = (ConstraintNamed)inConstraintTree.getRoot();
        if (mcNamed.getName().equals(ccNamed.getName())) return true; else return false;          
      }else if(getRoot() instanceof ConstraintUnassignedName && inConstraintTree.getRoot() instanceof ConstraintUnassignedName){
        ConstraintUnassignedName mcUnNamed = (ConstraintUnassignedName)getRoot();
        ConstraintUnassignedName ccUnNamed = (ConstraintUnassignedName)inConstraintTree.getRoot();
        if (mcUnNamed.getName().equals(ccUnNamed.getName())) return true; else return false;            
      }else if(getRoot() instanceof ConstraintTree && inConstraintTree.getRoot() instanceof ConstraintTree){
        ConstraintTree mcTree = (ConstraintTree)getRoot();
        ConstraintTree ccTree = (ConstraintTree)inConstraintTree.getRoot();
        return mcTree.isEqualTo(ccTree);
      } 
    return false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1599 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private Boolean compareBranches(ConstraintVariable mLeft, ConstraintVariable cLeft, ConstraintVariable cRight){
    //-----------------For ConstraintLiteral:
    if (mLeft instanceof ConstraintLiteral ){
      if ( cLeft instanceof ConstraintLiteral) {
        if( ((ConstraintLiteral)mLeft).getValue().equals(((ConstraintLiteral)cLeft).getValue()) ){
          return true;
        }
      } 
      if (cRight instanceof ConstraintLiteral){
        if(((ConstraintLiteral)mLeft).getValue().equals(((ConstraintLiteral)cRight).getValue()) ){
          return true;
        }     
      }
    }       
  //-----------------ConstraintUnassignedName:
  if (mLeft instanceof ConstraintUnassignedName ){
      if ( cLeft instanceof ConstraintUnassignedName) {
        if( ((ConstraintUnassignedName)mLeft).getName().equals(((ConstraintUnassignedName)cLeft).getName()) ){
          return true;
        }
      } 
      if (cRight instanceof ConstraintUnassignedName){
        if(((ConstraintUnassignedName)mLeft).getName().equals(((ConstraintUnassignedName)cRight).getName()) ){
          return true;
        }     
      }
    } 
    //-----------------For ConstraintNamed:
    if (mLeft instanceof ConstraintNamed ){
      if ( cLeft instanceof ConstraintNamed) {
        if( ((ConstraintNamed)mLeft).getName().equals(((ConstraintNamed)cLeft).getName()) ){
          return true;
        }
      } 
      if (cRight instanceof ConstraintNamed){
        if(((ConstraintNamed)mLeft).getName().equals(((ConstraintNamed)cRight).getName()) ){
          return true;
        }     
      }
    }       

    //-----------------For ConstraintTree:
    if (mLeft instanceof ConstraintTree ){
      if ( cLeft instanceof ConstraintTree) {
        if( ((ConstraintTree)mLeft).isEqualTo(((ConstraintTree)cLeft)) ){
          return true;
        }
      } 
      if (cRight instanceof ConstraintTree){
        if( ((ConstraintTree)mLeft).isEqualTo( (ConstraintTree)cRight) ){
          return true;
        }     
      }
    } 
    //-----------------For ConstraintOperator: 
    if (mLeft instanceof ConstraintOperator ){
      if ( cLeft instanceof ConstraintOperator) {
        if( ((ConstraintOperator)mLeft).getValue().equals(((ConstraintOperator)cLeft).getValue()) ){
          return true;
        }
      } 
      if (cRight instanceof ConstraintOperator){
        if(((ConstraintOperator)mLeft).getValue().equals(((ConstraintOperator)cRight).getValue()) ){
          return true;
        }     
      }
    } 
    return false;
  }


  public String toString()
  {
    return super.toString() + "["+
            "shouldDisplayBrackets" + ":" + getShouldDisplayBrackets()+ "," +
            "displayNegation" + ":" + getDisplayNegation()+ "," +
            "displayBrackets" + ":" + getDisplayBrackets()+ "," +
            "numberOfElements" + ":" + getNumberOfElements()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "root" + "=" + (getRoot() != null ? !getRoot().equals(this)  ? getRoot().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "requestor" + "=" + (getRequestor() != null ? !getRequestor().equals(this)  ? getRequestor().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "names" + "=" + (getNames() != null ? !getNames().equals(this)  ? getNames().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Token;
import cruise.umple.compiler.FeatureLink.FeatureConnectingOpType;

/**
 * This class used to represent the binary tree of require-statement argument 
 * Ex: require [A and B or C] will be formed as: 
 * ... or...  
 * ... and...      C
 * A           B
 */
// line 580 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
public class TokenTree
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TokenTree Attributes
  private Token nodeToken;
  private TokenTree parentTokenTree;
  private TokenTree leftTokenTree;
  private TokenTree rightTokenTree;
  private boolean isNegated;
  private boolean isOpt;
  private boolean isLinkingOperator;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TokenTree(Token aNodeToken)
  {
    nodeToken = aNodeToken;
    isNegated = false;
    isOpt = false;
    isLinkingOperator = false;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNodeToken(Token aNodeToken)
  {
    boolean wasSet = false;
    nodeToken = aNodeToken;
    wasSet = true;
    return wasSet;
  }

  public boolean setParentTokenTree(TokenTree aParentTokenTree)
  {
    boolean wasSet = false;
    parentTokenTree = aParentTokenTree;
    wasSet = true;
    return wasSet;
  }

  public boolean setLeftTokenTree(TokenTree aLeftTokenTree)
  {
    boolean wasSet = false;
    leftTokenTree = aLeftTokenTree;
    wasSet = true;
    return wasSet;
  }

  public boolean setRightTokenTree(TokenTree aRightTokenTree)
  {
    boolean wasSet = false;
    rightTokenTree = aRightTokenTree;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsNegated(boolean aIsNegated)
  {
    boolean wasSet = false;
    isNegated = aIsNegated;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsOpt(boolean aIsOpt)
  {
    boolean wasSet = false;
    isOpt = aIsOpt;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsLinkingOperator(boolean aIsLinkingOperator)
  {
    boolean wasSet = false;
    isLinkingOperator = aIsLinkingOperator;
    wasSet = true;
    return wasSet;
  }

  public Token getNodeToken()
  {
    return nodeToken;
  }

  public TokenTree getParentTokenTree()
  {
    return parentTokenTree;
  }

  public TokenTree getLeftTokenTree()
  {
    return leftTokenTree;
  }

  public TokenTree getRightTokenTree()
  {
    return rightTokenTree;
  }

  public boolean getIsNegated()
  {
    return isNegated;
  }

  public boolean getIsOpt()
  {
    return isOpt;
  }

  public boolean getIsLinkingOperator()
  {
    return isLinkingOperator;
  }

  public void delete()
  {}


  /**
   * This method replaces the current TokenTree with a new TokenTree.
   */
  // line 597 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public void replaceWith(TokenTree newTokenTree){
    this.setNodeToken(newTokenTree.getNodeToken());
  this.setLeftTokenTree(newTokenTree.getLeftTokenTree());
  this.setRightTokenTree(newTokenTree.getRightTokenTree());
  this.isLinkingOperator = newTokenTree.getIsLinkingOperator();
  this.isOpt = newTokenTree.getIsOpt();
  this.isNegated = newTokenTree.getIsNegated();
  }


  /**
   * This method selects the the connection operator type based on the type of the (linking) token.
   * If the type is not specified for the linking node, The default is Required.
   * It returns null if the node is termainl node.
   */
  // line 611 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public FeatureConnectingOpType getFeatureConnectionOpType(boolean isSubFeature){
    if(nodeToken != null )
  {
    String operator = nodeToken.getName();
    switch (operator) {
      case "and":
        return FeatureConnectingOpType.Conjunctive;
      case "or":
        return FeatureConnectingOpType.Disjunctive;
      case "xor":
        return FeatureConnectingOpType.XOR;
      case "multiplicityTerminal":
        return FeatureConnectingOpType.Multiplicity;
      case "opt":
        return FeatureConnectingOpType.Optional;
      case "not":
        return FeatureConnectingOpType.Exclude;
      default:
      {
        if(isSubFeature)
        return FeatureConnectingOpType.Mandatory;
        else
        return FeatureConnectingOpType.Include;
      }
     }
  }

  return null;
  }


  /**
   * This methods returens the priority of a node to move down in the binary tree.
   * high priority node moves down & low prioriy moves up 
   * not > and > xor > or > ROOT (Top of the tree)
   */
  // line 646 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public int getPriority(){
    String tokenName = nodeToken.getName();
    switch (tokenName)
    {
      case "and":
      return 3;
      case "xor":
      return 2;
      case "or":
      return 1;
      case "ROOT":
      return 0;
    }
    return -1; // lower priority, leaf nodes should not move
  }


  public String toString()
  {
    return super.toString() + "["+
            "isNegated" + ":" + getIsNegated()+ "," +
            "isOpt" + ":" + getIsOpt()+ "," +
            "isLinkingOperator" + ":" + getIsLinkingOperator()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "nodeToken" + "=" + (getNodeToken() != null ? !getNodeToken().equals(this)  ? getNodeToken().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "parentTokenTree" + "=" + (getParentTokenTree() != null ? !getParentTokenTree().equals(this)  ? getParentTokenTree().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "leftTokenTree" + "=" + (getLeftTokenTree() != null ? !getLeftTokenTree().equals(this)  ? getLeftTokenTree().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rightTokenTree" + "=" + (getRightTokenTree() != null ? !getRightTokenTree().equals(this)  ? getRightTokenTree().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
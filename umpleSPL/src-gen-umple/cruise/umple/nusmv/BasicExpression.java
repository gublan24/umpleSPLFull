/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 303 "../../../../src/NuSMVMetamodel.ump"
public class BasicExpression
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = " ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BasicExpression Attributes
  private String identifier;
  private boolean bracketed;
  private boolean displayNegation;

  //BasicExpression State Machines
  public enum Operator { AND, OR, XOR, XNOR, IMPLY, IFF, EQ, NE, LT, GT, LE, GE, NULL, NOT, MOD, PLUS, MUL, MINUS, DIV }
  private Operator operator;

  //BasicExpression Associations
  private List<BasicExpression> children;
  private BasicExpression parent;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BasicExpression(String aIdentifier)
  {
    identifier = aIdentifier;
    bracketed = false;
    displayNegation = false;
    children = new ArrayList<BasicExpression>();
    setOperator(Operator.AND);
    // line 311 "../../../../src/NuSMVMetamodel.ump"
    setBracketed(false);
    // END OF UMPLE AFTER INJECTION
    // line 312 "../../../../src/NuSMVMetamodel.ump"
    setDisplayNegation(false);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIdentifier(String aIdentifier)
  {
    boolean wasSet = false;
    identifier = aIdentifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setBracketed(boolean aBracketed)
  {
    boolean wasSet = false;
    bracketed = aBracketed;
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

  /**
   * Variable Declarations
   */
  public String getIdentifier()
  {
    return identifier;
  }

  public boolean getBracketed()
  {
    return bracketed;
  }

  public boolean getDisplayNegation()
  {
    return displayNegation;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isBracketed()
  {
    return bracketed;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDisplayNegation()
  {
    return displayNegation;
  }

  public String getOperatorFullName()
  {
    String answer = operator.toString();
    return answer;
  }

  public Operator getOperator()
  {
    return operator;
  }

  public boolean setOperator(Operator aOperator)
  {
    operator = aOperator;
    return true;
  }
  /* Code from template association_GetMany */
  public BasicExpression getChild(int index)
  {
    BasicExpression aChild = children.get(index);
    return aChild;
  }

  /**
   * Association definition
   */
  public List<BasicExpression> getChildren()
  {
    List<BasicExpression> newChildren = Collections.unmodifiableList(children);
    return newChildren;
  }

  public int numberOfChildren()
  {
    int number = children.size();
    return number;
  }

  public boolean hasChildren()
  {
    boolean has = children.size() > 0;
    return has;
  }

  public int indexOfChild(BasicExpression aChild)
  {
    int index = children.indexOf(aChild);
    return index;
  }
  /* Code from template association_GetOne */
  public BasicExpression getParent()
  {
    return parent;
  }

  public boolean hasParent()
  {
    boolean has = parent != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfChildren()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfChildren()
  {
    return 2;
  }
  /* Code from template association_AddOptionalNToOptionalOne */
  public boolean addChild(BasicExpression aChild)
  {
    boolean wasAdded = false;
    if (children.contains(aChild)) { return false; }
    if (numberOfChildren() >= maximumNumberOfChildren())
    {
      return wasAdded;
    }

    BasicExpression existingParent = aChild.getParent();
    if (existingParent == null)
    {
      aChild.setParent(this);
    }
    else if (!this.equals(existingParent))
    {
      existingParent.removeChild(aChild);
      addChild(aChild);
    }
    else
    {
      children.add(aChild);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeChild(BasicExpression aChild)
  {
    boolean wasRemoved = false;
    if (children.contains(aChild))
    {
      children.remove(aChild);
      aChild.setParent(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addChildAt(BasicExpression aChild, int index)
  {  
    boolean wasAdded = false;
    if(addChild(aChild))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChildren()) { index = numberOfChildren() - 1; }
      children.remove(aChild);
      children.add(index, aChild);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveChildAt(BasicExpression aChild, int index)
  {
    boolean wasAdded = false;
    if(children.contains(aChild))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChildren()) { index = numberOfChildren() - 1; }
      children.remove(aChild);
      children.add(index, aChild);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addChildAt(aChild, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToOptionalN */
  public boolean setParent(BasicExpression aParent)
  {
    boolean wasSet = false;
    if (aParent != null && aParent.numberOfChildren() >= BasicExpression.maximumNumberOfChildren())
    {
      return wasSet;
    }

    BasicExpression existingParent = parent;
    parent = aParent;
    if (existingParent != null && !existingParent.equals(aParent))
    {
      existingParent.removeChild(this);
    }
    if (aParent != null)
    {
      aParent.addChild(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !children.isEmpty() )
    {
      children.get(0).setParent(null);
    }
    if (parent != null)
    {
      BasicExpression placeholderParent = parent;
      this.parent = null;
      placeholderParent.removeChild(this);
    }
  }

  // line 315 "../../../../src/NuSMVMetamodel.ump"
   public String convertOperator(){
    String op = getOperatorFullName();
		switch( op ){
			case "AND" : 		return " & ";
			case "OR" :      		return " | ";
			case "XOR" :    	return " xor ";
			case "XNOR" : 	return " xnor ";
			case "IMPLY" : 	return " -> ";
			case "IFF" : 			return " <-> ";
			case "EQ" : 			return " = ";
			case "NE" : 			return " != ";
			case "LT" : 			return " < ";
			case "GT" : 			return " > ";
			case "LE" : 			return " <= ";
			case "GE" : 			return " >= ";
            case "MINUS" : 	return " - ";
            case "NOT" : 		return " ! ";
			case "MOD" : return " mod ";
			case "PLUS" : return " + ";
			case "MUL" : return " * ";
			case "DIV" : return " / ";
			
			default : 				return "";
		}
  }

  // line 340 "../../../../src/NuSMVMetamodel.ump"
   public String getExpression(){
    String op = convertOperator();
  		String temp = "";
		if(children.size() == 0)
      		return getIdentifier();
    	if(getChildren().size() == 1)
				if(getBracketed()) {
					temp += "( ";
					temp += getChildren().get(0) == null ? getChildren().get(1).getExpression() : getChildren().get(0).getExpression() + " )";
				}
      			else  
      				temp = getChildren().get(0) == null ? getChildren().get(1).getExpression() : getChildren().get(0).getExpression();
    	else
				if(getBracketed())
					temp = "( "+ getChildren().get(0).getExpression() + op + getChildren().get(1).getExpression()+" )";
      			else 
      				temp = getChildren().get(0).getExpression() + op + getChildren().get(1).getExpression();   	
      	if(getDisplayNegation())
      		return " !"+temp;
      	return temp;
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _toString(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(getExpression());

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String toString(){
        StringBuilder sb = new StringBuilder();
    return this._toString(0,sb).toString(); 
  }

}
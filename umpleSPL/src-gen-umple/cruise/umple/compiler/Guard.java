/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * A boolean condition that is checked when an event method is called
 * If the result is true the transition may be taken
 * 
 * NEW CLASS****************************************
 * 
 */
// line 213 "../../../../src/StateMachine.ump"
// line 895 "../../../../src/StateMachine_Code.ump"
// line 1893 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
public class Guard extends ConstraintTree
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Guard Attributes
  private Position position;
  private Position endPosition;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Guard()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setEndPosition(Position aEndPosition)
  {
    boolean wasSet = false;
    endPosition = aEndPosition;
    wasSet = true;
    return wasSet;
  }

  public Position getPosition()
  {
    return position;
  }

  public Position getEndPosition()
  {
    return endPosition;
  }

  public void delete()
  {
    super.delete();
  }

  // line 224 "../../../../src/StateMachine.ump"
   private ArrayDeque<String> expressionQueue(ConstraintOperator operator){
    ArrayDeque<String> tempNodes = new ArrayDeque<String>();
		ConstraintVariable left = operator.getLeft(), right = operator.getRight();

		if( left != null ) 
			add( left, tempNodes);
		
		if( operator != null ) {
			if( operator .getValue().equals("object==") )
				tempNodes.offer( "==" );
			else if( operator .getValue().equals("object!=") )
				tempNodes.offer( "!=" );
			else
				tempNodes.offer( operator .getValue() );
		}
		
		if( right != null ) 
			add(right, tempNodes);
		
		return tempNodes;
  }

  // line 246 "../../../../src/StateMachine.ump"
   private boolean add(ConstraintVariable element, ArrayDeque<String> nodes){
    if(element == null) return false;
		if( element instanceof ConstraintTree ) {
		
			ConstraintTree exprTree = (ConstraintTree) element; 
			ConstraintVariable root = exprTree.getRoot();
			if( exprTree.getDisplayNegation() )
				nodes.offer("!");
				
			if( exprTree.getShouldDisplayBrackets() )
				nodes.offer("(");
			
			if( root != null && root instanceof ConstraintOperator )
				for( String node : expressionQueue( (ConstraintOperator ) root ) )
					nodes.offer( node );
				
			else if( root != null && root instanceof ConstraintTree  ) {
						
				ArrayDeque<String> tempNodes = new ArrayDeque<String>();
				if( ((ConstraintTree) root).getDisplayNegation())
					nodes.offer("!");
				if( ((ConstraintTree) root).getDisplayBrackets())
					nodes.offer("(");
				ConstraintVariable newRoot = ((ConstraintTree) root).getRoot();
				add( newRoot, tempNodes);
				while( !tempNodes.isEmpty() )
					nodes.offer( tempNodes.poll() );
				if( ((ConstraintTree) root).getDisplayBrackets())
					nodes.offer(")");
			}
			
			else if( exprTree.getNumberOfElements() == 1 ){
        //Issue 1151 : Literal is added as root element
        if(exprTree.getRoot() instanceof ConstraintLiteral )
           nodes.offer(((ConstraintLiteral)exprTree.getRoot()).getValue());
        else 
				   nodes.offer(exprTree.getNames().first());
      }
			
			if( exprTree.getShouldDisplayBrackets() )
				nodes.add(")");
		}
		
		if( element instanceof ConstraintOperator )
			for( String node : expressionQueue( (ConstraintOperator) element ) )
				nodes.offer( node );
				
		if( element instanceof ConstraintNamed )
			nodes.offer( ((ConstraintNamed) element).getName() );
		
		if( element instanceof ConstraintLiteral ) 
			nodes.offer( ((ConstraintLiteral) element).getValue() );
			
		return true;
  }


  /**
   * This builds an expression queue (of String type) from this Guard object. These include negation, operators, variable names etc.
   */
  // line 303 "../../../../src/StateMachine.ump"
   public ArrayDeque<String> getQueuedExpression(){
    ArrayDeque<String> nodes = new ArrayDeque<String>();
		add( this, nodes ); 
		return nodes;
  }


  /**
   * checks the input string and reports if it is an operator or not
   */
  // line 310 "../../../../src/StateMachine.ump"
   private boolean isOperator(String variable){
    switch( variable ){
			case "+" : return true;
			case "-" : return true;
			case "*" : return true;
			case "/" : return true;
			case "%" : return true;
			case "&&" : return true;
			case "||" : return true;
			case "==" : return true;
			case "!=" : return true;
			case ">=" : return true;
			case "<=" : return true;
			case "<" : return true;
			case ">" : return true;
			case ">>" : return true;
			case "<<" : return true;
			case "+=" : return true;
			case "-=" : return true;
			case "*=" : return true;
			case "%=" : return true;
			case "/=" : return true;
			case ">>=" : return true;
			case "<<=" : return true;
			//case "^" : return true;
			default : return false;
		}
  }


  /**
   * This converts a guard expression into its equivalent string representation
   */
  // line 340 "../../../../src/StateMachine.ump"
   public String getExpression(){
    ArrayDeque<String> nodes = getQueuedExpression();
		String temp = "";//, lastVariable = "";
		if( this == null ) return temp;
		
		while( nodes.size() > 1) {
			String variable = nodes.poll();
			if( isOperator(variable) )
				temp += " "+ variable +" ";
			else
				temp += variable;
			//lastVariable = variable;
		}
		temp += nodes.poll();
		
		return temp;
  }

  // line 898 "../../../../src/StateMachine_Code.ump"
  public String getCondition(CodeTranslator gen){
    return gen.translate("Plain",this);
  }


  /**
   * Please maintain this method if you're going to add new features to Guards.
   * This code manually creates a clone of a Guards.
   */
  // line 1897 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   public Guard clone(){
    Guard guard  = new Guard();
  	//TODO: if we want to cover changing names of variables used in guard, I must modify this section to create new objects.
  	return guard;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition" + "=" + (getEndPosition() != null ? !getEndPosition().equals(this)  ? getEndPosition().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
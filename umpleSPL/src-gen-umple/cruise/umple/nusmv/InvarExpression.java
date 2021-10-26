/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 382 "../../../../src/NuSMVMetamodel.ump"
public class InvarExpression extends BasicExpression
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEXT_0 = " ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //InvarExpression Attributes
  private boolean qualified;

  //InvarExpression State Machines
  public enum InvarOperator { next }
  private InvarOperator invarOperator;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public InvarExpression(String aIdentifier)
  {
    super(aIdentifier);
    qualified = false;
    setInvarOperator(InvarOperator.next);
    // line 386 "../../../../src/NuSMVMetamodel.ump"
    setQualified(false);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setQualified(boolean aQualified)
  {
    boolean wasSet = false;
    qualified = aQualified;
    wasSet = true;
    return wasSet;
  }

  public boolean getQualified()
  {
    return qualified;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isQualified()
  {
    return qualified;
  }

  public String getInvarOperatorFullName()
  {
    String answer = invarOperator.toString();
    return answer;
  }

  public InvarOperator getInvarOperator()
  {
    return invarOperator;
  }

  public boolean setInvarOperator(InvarOperator aInvarOperator)
  {
    invarOperator = aInvarOperator;
    return true;
  }

  public void delete()
  {
    super.delete();
  }

  // line 389 "../../../../src/NuSMVMetamodel.ump"
   public String getExpression(){
    String op = convertOperator();
  		String temp = "";
		if(getChildren().size() == 0)
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
      		temp = " !"+temp;
      	if( qualified )
      		return getInvarOperatorFullName() + temp;
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
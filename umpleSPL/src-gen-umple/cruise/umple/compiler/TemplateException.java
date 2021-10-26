/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Token;
import cruise.umple.parser.Position;
import cruise.umple.parser.ErrorMessage;

/**
 * class TemplateException {
 * isA Exception;
 * Token token;
 * Integer errorCode;
 * String errMsg;
 * 
 * public TemplateException(Token aToken, int aErrorCode, String aErrMsg, Exception ex) {
 * super(aErrMsg, ex);
 * token = aToken;
 * errorCode = aErrorCode;
 * errMsg = aErrMsg;
 * }
 * public TemplateException(Token aToken, int aErrorCode, String aErrMsg) {
 * super(aErrMsg, null);
 * token = aToken;
 * errorCode = aErrorCode;
 * errMsg = aErrMsg;
 * }
 * }
 * 
 */
// line 82 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
public class TemplateException extends Exception
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TemplateException Attributes
  private Position position;
  private ErrorMessage errorMessage;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TemplateException(String aMessage, Exception aParent, Position aPosition, ErrorMessage aErrorMessage)
  {
    super(aMessage, aParent);
    position = aPosition;
    errorMessage = aErrorMessage;
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

  public boolean setErrorMessage(ErrorMessage aErrorMessage)
  {
    boolean wasSet = false;
    errorMessage = aErrorMessage;
    wasSet = true;
    return wasSet;
  }

  public Position getPosition()
  {
    return position;
  }

  public ErrorMessage getErrorMessage()
  {
    return errorMessage;
  }

  public void delete()
  {}

  // line 91 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
   public  TemplateException(Position aPosition, ErrorMessage aErrorMessage){
    super("", null);
	    position = aPosition;
	    errorMessage = aErrorMessage;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "errorMessage" + "=" + (getErrorMessage() != null ? !getErrorMessage().equals(this)  ? getErrorMessage().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
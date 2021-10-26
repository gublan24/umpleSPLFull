/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.compiler.Parser;
import cruise.umple.parser.Token;
import cruise.umple.parser.ErrorMessage;

/**
 * Abstraction for task parser to be analyzed.
 */
// line 35 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
public abstract class AnalysisParserTask implements AnalysisStub
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AnalysisParserTask Attributes
  private Parser parser;
  private Token token;
  private int errorCode;
  private String errMsg;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AnalysisParserTask(Parser aParser, Token aToken, int aErrorCode, String aErrMsg)
  {
    parser = aParser;
    token = aToken;
    errorCode = aErrorCode;
    errMsg = aErrMsg;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setParser(Parser aParser)
  {
    boolean wasSet = false;
    parser = aParser;
    wasSet = true;
    return wasSet;
  }

  public boolean setToken(Token aToken)
  {
    boolean wasSet = false;
    token = aToken;
    wasSet = true;
    return wasSet;
  }

  public boolean setErrorCode(int aErrorCode)
  {
    boolean wasSet = false;
    errorCode = aErrorCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setErrMsg(String aErrMsg)
  {
    boolean wasSet = false;
    errMsg = aErrMsg;
    wasSet = true;
    return wasSet;
  }

  public Parser getParser()
  {
    return parser;
  }

  public Token getToken()
  {
    return token;
  }

  public int getErrorCode()
  {
    return errorCode;
  }

  public String getErrMsg()
  {
    return errMsg;
  }

  public void delete()
  {}

  // line 48 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public void logError(){
    parser.getParseResult().setPosition(token.getPosition());
    	parser.getParseResult().addErrorMessage(new ErrorMessage(errorCode,token.getPosition(),errMsg));
  }


  public String toString()
  {
    return super.toString() + "["+
            "errorCode" + ":" + getErrorCode()+ "," +
            "errMsg" + ":" + getErrMsg()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parser" + "=" + (getParser() != null ? !getParser().equals(this)  ? getParser().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "token" + "=" + (getToken() != null ? !getToken().equals(this)  ? getToken().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser;
import java.util.*;

/**
 * Represents the results of parsing, such as if it was successful,
 * whether it had warnings, etc.
 */
// line 18 "../../../../src/ParseUtilities.ump"
// line 377 "../../../../src/ParseUtilities_Code.ump"
public class ParseResult
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ParseResult Attributes
  private boolean wasSuccess;
  private boolean hasWarnings;
  private boolean _acceptsErrors;

  //ParseResult Associations
  private Position position;
  private List<ErrorMessage> errorMessages;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ParseResult(boolean aWasSuccess)
  {
    wasSuccess = aWasSuccess;
    hasWarnings = false;
    _acceptsErrors = true;
    errorMessages = new ArrayList<ErrorMessage>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setWasSuccess(boolean aWasSuccess)
  {
    boolean wasSet = false;
    wasSuccess = aWasSuccess;
    wasSet = true;
    return wasSet;
  }

  public boolean setHasWarnings(boolean aHasWarnings)
  {
    boolean wasSet = false;
    hasWarnings = aHasWarnings;
    wasSet = true;
    return wasSet;
  }

  /**
   * Specifies whether or not the parsing was successful.
   */
  public boolean getWasSuccess()
  {
    return wasSuccess;
  }

  /**
   * Specifies whether or not the parsing has warnings.
   */
  public boolean getHasWarnings()
  {
    return hasWarnings;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isWasSuccess()
  {
    return wasSuccess;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isHasWarnings()
  {
    return hasWarnings;
  }
  /* Code from template association_GetOne */
  public Position getPosition()
  {
    return position;
  }

  public boolean hasPosition()
  {
    boolean has = position != null;
    return has;
  }
  /* Code from template association_GetMany */
  public ErrorMessage getErrorMessage(int index)
  {
    ErrorMessage aErrorMessage = errorMessages.get(index);
    return aErrorMessage;
  }

  /**
   * The error messages related to parsing.
   */
  public List<ErrorMessage> getErrorMessages()
  {
    List<ErrorMessage> newErrorMessages = Collections.unmodifiableList(errorMessages);
    return newErrorMessages;
  }

  public int numberOfErrorMessages()
  {
    int number = errorMessages.size();
    return number;
  }

  public boolean hasErrorMessages()
  {
    boolean has = errorMessages.size() > 0;
    return has;
  }

  public int indexOfErrorMessage(ErrorMessage aErrorMessage)
  {
    int index = errorMessages.indexOf(aErrorMessage);
    return index;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setPosition(Position aNewPosition)
  {
    boolean wasSet = false;
    position = aNewPosition;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfErrorMessages()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addErrorMessage(ErrorMessage aErrorMessage)
  {
    boolean wasAdded = false;
    // line 381 "../../../../src/ParseUtilities_Code.ump"
    if(!_acceptsErrors)
          return true; // This should technically return false
    // END OF UMPLE BEFORE INJECTION
    if (errorMessages.contains(aErrorMessage)) { return false; }
    errorMessages.add(aErrorMessage);
    wasAdded = true;
    // line 387 "../../../../src/ParseUtilities_Code.ump"
    // If the severity level is 1 then it's the most severe error
        // And we stop accepting errors (The parser may continue to parse,
        // as but we won't report any further errors, as they may be non-sensical)
        if(aErrorMessage.getErrorType().getSeverity() == 1){
          _acceptsErrors = false;
          wasSuccess = false;
        }
    
        // Otherwise, if the severity is 2, we may have an error, 
        // but we'll continue to compile and generate additional errors/warnings 
        else if(aErrorMessage.getErrorType().getSeverity() == 2)  
          wasSuccess = false;
    
        // Everything else must be a warning.
        else
          hasWarnings = true;
    // END OF UMPLE AFTER INJECTION
    return wasAdded;
  }

  public boolean removeErrorMessage(ErrorMessage aErrorMessage)
  {
    boolean wasRemoved = false;
    if (errorMessages.contains(aErrorMessage))
    {
      errorMessages.remove(aErrorMessage);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addErrorMessageAt(ErrorMessage aErrorMessage, int index)
  {  
    boolean wasAdded = false;
    if(addErrorMessage(aErrorMessage))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfErrorMessages()) { index = numberOfErrorMessages() - 1; }
      errorMessages.remove(aErrorMessage);
      errorMessages.add(index, aErrorMessage);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveErrorMessageAt(ErrorMessage aErrorMessage, int index)
  {
    boolean wasAdded = false;
    if(errorMessages.contains(aErrorMessage))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfErrorMessages()) { index = numberOfErrorMessages() - 1; }
      errorMessages.remove(aErrorMessage);
      errorMessages.add(index, aErrorMessage);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addErrorMessageAt(aErrorMessage, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    position = null;
    errorMessages.clear();
  }

  // line 407 "../../../../src/ParseUtilities_Code.ump"
   public String toString(){
    String ret = "";
    for(ErrorMessage em : errorMessages)
      ret += em.toString() + "\n";
    return ret;
  }

  // line 414 "../../../../src/ParseUtilities_Code.ump"
   private static  String sanitizeForJson(String input){
    String ret = "";
    for (int i=0; i<input.length(); i++)
    {
      switch(input.charAt(i))
      {
        case '\\':            
          ret += "\\\\";
          break;
        case  '"':
          ret += "\\\"";
          break;
        default:
          ret += input.charAt(i);
          break;
      }
    }
    return ret;
  }

  // line 435 "../../../../src/ParseUtilities_Code.ump"
   public String toJSON(){
    String ret = "{ \"results\" : [ ";
    boolean hasOne = false;
    for(ErrorMessage em : errorMessages)
    {
      ErrorType et = em.getErrorType();

      String line     = String.valueOf(em.getPosition().getLineNumber());
      String file     = sanitizeForJson(em.getPosition().getFilename());
      String message  = sanitizeForJson(em.getFormattedMessage());
      String severity = String.valueOf(et.getSeverity());
      String code     = String.valueOf(et.getErrorCode());
      String url      = sanitizeForJson(et.getErrorUrl());

      ret += "{ \"errorCode\" : \"" + code + "\",";
      ret += " \"severity\" : \"" +severity + "\", ";
      ret += "\"url\" : \"" + url + "\", ";
      ret += "\"line\" : \"" + line + "\", ";
      ret += "\"filename\" : \"" + file + "\", ";
      ret += "\"message\" : \"" + message.replace("\"", "\'") + "\"},";
      hasOne = true;
    }

    if(hasOne)
      ret = ret.substring(0, ret.length()-1);
    ret += "]}";
    return ret;
  }

}
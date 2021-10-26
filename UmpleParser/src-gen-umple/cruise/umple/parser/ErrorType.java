/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser;
import java.util.List;

/**
 * Represents an error type, which contains an error code, the severity of the error, etc.
 * Error data is read from the en.error file
 */
// line 54 "../../../../src/ParseUtilities.ump"
// line 498 "../../../../src/ParseUtilities_Code.ump"
public class ErrorType
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ErrorType Attributes
  private int errorCode;
  private int severity;
  private String errorFormat;
  private String errorUrl;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetErrorCode;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ErrorType(int aErrorCode, int aSeverity, String aErrorFormat, String aErrorUrl)
  {
    cachedHashCode = -1;
    canSetErrorCode = true;
    errorCode = aErrorCode;
    severity = aSeverity;
    errorFormat = aErrorFormat;
    errorUrl = aErrorUrl;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setErrorCode(int aErrorCode)
  {
    boolean wasSet = false;
    if (!canSetErrorCode) { return false; }
    errorCode = aErrorCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setSeverity(int aSeverity)
  {
    boolean wasSet = false;
    severity = aSeverity;
    wasSet = true;
    return wasSet;
  }

  public boolean setErrorFormat(String aErrorFormat)
  {
    boolean wasSet = false;
    errorFormat = aErrorFormat;
    wasSet = true;
    return wasSet;
  }

  public boolean setErrorUrl(String aErrorUrl)
  {
    boolean wasSet = false;
    errorUrl = aErrorUrl;
    wasSet = true;
    return wasSet;
  }

  /**
   * The error code.
   */
  public int getErrorCode()
  {
    return errorCode;
  }

  /**
   * The severity of the error.
   */
  public int getSeverity()
  {
    return severity;
  }

  public String getErrorFormat()
  {
    return errorFormat;
  }

  public String getErrorUrl()
  {
    return errorUrl;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    ErrorType compareTo = (ErrorType)obj;
  
    if (getErrorCode() != compareTo.getErrorCode())
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
    cachedHashCode = cachedHashCode * 23 + getErrorCode();

    canSetErrorCode = false;
    return cachedHashCode;
  }

  public void delete()
  {}


  /**
   * Formats error messages by replacing tokens {1}, {2}, ... with the 
   * corresponding positional arguments supplied in variables
   * 
   * @param format the string formatting statement
   * @param variables the variables to insert into the format
   * 
   * @return the formatted string
   */
  // line 513 "../../../../src/ParseUtilities_Code.ump"
   private static  String formatErrorMessage(String format, Object... variables){
    String result = format;
    for (int i=0; i<variables.length; ++i)
    {
      String toReplace = "{" + i + "}";
      String toReplaceWith = (variables[i] == null ? "" : variables[i].toString());
      result = result.replace(toReplace, toReplaceWith);
    }
    
    return result;
  }


  /**
   * Formats error messages by replacing tokens {1}, {2}, ... with the 
   * corresponding positional arguments supplied in arguments
   * 
   * @param arguments the arguments to insert into the tokens postion
   * 
   * @return the formatted string
   */
  // line 534 "../../../../src/ParseUtilities_Code.ump"
   public String format(List<String> arguments){
    return formatErrorMessage(errorFormat, arguments.toArray());
  }


  public String toString()
  {
    return super.toString() + "["+
            "errorCode" + ":" + getErrorCode()+ "," +
            "severity" + ":" + getSeverity()+ "," +
            "errorFormat" + ":" + getErrorFormat()+ "," +
            "errorUrl" + ":" + getErrorUrl()+ "]";
  }
}
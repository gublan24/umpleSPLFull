/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser;
import java.io.File;
import java.util.*;

/**
 * Represents an error message, typically used with parsing.
 */
// line 38 "../../../../src/ParseUtilities.ump"
// line 464 "../../../../src/ParseUtilities_Code.ump"
public class ErrorMessage
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ErrorMessage Attributes
  private List<String> parameters;

  //ErrorMessage Associations
  private ErrorType errorType;
  private Position position;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ErrorMessage(ErrorType aErrorType, Position aPosition)
  {
    parameters = new ArrayList<String>();
    if (!setErrorType(aErrorType))
    {
      throw new RuntimeException("Unable to create ErrorMessage due to aErrorType. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    if (!setPosition(aPosition))
    {
      throw new RuntimeException("Unable to create ErrorMessage due to aPosition. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addParameter(String aParameter)
  {
    boolean wasAdded = false;
    wasAdded = parameters.add(aParameter);
    return wasAdded;
  }

  public boolean removeParameter(String aParameter)
  {
    boolean wasRemoved = false;
    wasRemoved = parameters.remove(aParameter);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  public String getParameter(int index)
  {
    String aParameter = parameters.get(index);
    return aParameter;
  }

  public String[] getParameters()
  {
    String[] newParameters = parameters.toArray(new String[parameters.size()]);
    return newParameters;
  }

  public int numberOfParameters()
  {
    int number = parameters.size();
    return number;
  }

  public boolean hasParameters()
  {
    boolean has = parameters.size() > 0;
    return has;
  }

  public int indexOfParameter(String aParameter)
  {
    int index = parameters.indexOf(aParameter);
    return index;
  }
  /* Code from template association_GetOne */
  public ErrorType getErrorType()
  {
    return errorType;
  }
  /* Code from template association_GetOne */
  public Position getPosition()
  {
    return position;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setErrorType(ErrorType aNewErrorType)
  {
    boolean wasSet = false;
    if (aNewErrorType != null)
    {
      errorType = aNewErrorType;
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setPosition(Position aNewPosition)
  {
    boolean wasSet = false;
    if (aNewPosition != null)
    {
      position = aNewPosition;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    errorType = null;
    position = null;
  }

  // line 468 "../../../../src/ParseUtilities_Code.ump"
   public  ErrorMessage(int errorCode, Position pos, String... parameters){
    this(ErrorTypeSingleton.getInstance().getErrorTypeForCode(errorCode), pos);
    this.parameters = Arrays.asList(parameters);
  }

  // line 476 "../../../../src/ParseUtilities_Code.ump"
   public String getFormattedMessage(){
    return errorType.format(this.parameters);
  }

  // line 481 "../../../../src/ParseUtilities_Code.ump"
   private static  String stripLeadingPath(String filename){
    int index = 0;
    while(filename.indexOf(File.separatorChar, index) != -1)
      index = filename.indexOf(File.separatorChar, index) + 1;
    return filename.substring(index);
  }

  // line 489 "../../../../src/ParseUtilities_Code.ump"
   public String toString(){
    String sev = errorType.getSeverity() <= 2 ? "Error" : "Warning";
    String err = sev + " " + errorType.getErrorCode() + " on line " + this.position.getLineNumber();
    err += " of file \"" + stripLeadingPath(this.position.getFilename()) + "\":\n";
    err += errorType.format(this.parameters);
    return err.replace("\"", "\'");
  }

}
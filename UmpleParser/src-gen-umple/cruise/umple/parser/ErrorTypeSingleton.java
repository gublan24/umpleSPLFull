/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser;
import java.io.*;
import java.lang.IllegalStateException;
import java.util.*;

/**
 * Lists all the errors in the system
 */
// line 71 "../../../../src/ParseUtilities.ump"
// line 538 "../../../../src/ParseUtilities_Code.ump"
public class ErrorTypeSingleton
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static ErrorTypeSingleton theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ErrorTypeSingleton Associations
  private List<ErrorType> errorTypes;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private ErrorTypeSingleton()
  {
    errorTypes = new ArrayList<ErrorType>();
    // line 540 "../../../../src/ParseUtilities_Code.ump"
    init();
    // END OF UMPLE AFTER INJECTION
  }

  public static ErrorTypeSingleton getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new ErrorTypeSingleton();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public ErrorType getErrorType(int index)
  {
    ErrorType aErrorType = errorTypes.get(index);
    return aErrorType;
  }

  public List<ErrorType> getErrorTypes()
  {
    List<ErrorType> newErrorTypes = Collections.unmodifiableList(errorTypes);
    return newErrorTypes;
  }

  public int numberOfErrorTypes()
  {
    int number = errorTypes.size();
    return number;
  }

  public boolean hasErrorTypes()
  {
    boolean has = errorTypes.size() > 0;
    return has;
  }

  public int indexOfErrorType(ErrorType aErrorType)
  {
    int index = errorTypes.indexOf(aErrorType);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfErrorTypes()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addErrorType(ErrorType aErrorType)
  {
    boolean wasAdded = false;
    if (errorTypes.contains(aErrorType)) { return false; }
    errorTypes.add(aErrorType);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeErrorType(ErrorType aErrorType)
  {
    boolean wasRemoved = false;
    if (errorTypes.contains(aErrorType))
    {
      errorTypes.remove(aErrorType);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addErrorTypeAt(ErrorType aErrorType, int index)
  {  
    boolean wasAdded = false;
    if(addErrorType(aErrorType))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfErrorTypes()) { index = numberOfErrorTypes() - 1; }
      errorTypes.remove(aErrorType);
      errorTypes.add(index, aErrorType);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveErrorTypeAt(ErrorType aErrorType, int index)
  {
    boolean wasAdded = false;
    if(errorTypes.contains(aErrorType))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfErrorTypes()) { index = numberOfErrorTypes() - 1; }
      errorTypes.remove(aErrorType);
      errorTypes.add(index, aErrorType);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addErrorTypeAt(aErrorType, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    errorTypes.clear();
  }

  // line 544 "../../../../src/ParseUtilities_Code.ump"
   private void init(){
    String filename = "/en.error";
    String input = readFile(filename);
    parse(new TextParser(filename, input));
  }

  // line 551 "../../../../src/ParseUtilities_Code.ump"
   public String readFile(String filenameOrResourcePath){
    InputStream resourceStream = null;
    BufferedReader reader = null;
    String str = "";
    try
    {
      if ((new File(filenameOrResourcePath)).exists())
      {
        reader = new BufferedReader(new FileReader(filenameOrResourcePath));
      }
      else
      {
        resourceStream = getClass().getResourceAsStream(filenameOrResourcePath);
        reader = new BufferedReader(new InputStreamReader(resourceStream));
      }
      String line;
      while((line=reader.readLine())!=null)
        if(!line.startsWith("#")) str += line;
    }
    catch (Exception e)
    {
      str = null;
    }
    finally
    {
      if(reader != null){
        try{
          reader.close();
        }catch (IOException e){
          throw new IllegalStateException("Error closing reader");
        }
      }
      if(resourceStream != null){
        try{
          resourceStream.close();
        }catch (IOException e){
          throw new IllegalStateException("Error closing resourceStream");
        }
      }
    }    
    return str;
  }


  /**
   * Parse the error messages file (en.error etc.)
   */
  // line 596 "../../../../src/ParseUtilities_Code.ump"
   private boolean parse(TextParser textParser){
    while(textParser.peek() != null)
    {
      Position p = textParser.currentPosition();

      String code = textParser.nextUntil(false,":");
      textParser.nextAfter(false,":");

      String severity = textParser.nextUntil(false, ",");
      textParser.nextAfter(false,",");

      String url = textParser.nextUntil(false, ",");
      url = url.substring(1,url.length()-1);
      textParser.nextAfter(false,",");

      String formatString = textParser.nextUntil(false, ";");
      textParser.nextAfter(false,";");

      int codeInt;
      int severityInt;

      if(code == null || severity == null || url == null || formatString == null)
        throw new IllegalStateException("Error parsing error definitions (line " + p.getLineNumber()+")");

      try
      {
        codeInt = Integer.parseInt(code);
      }
      catch(NumberFormatException e)
      {
        throw new IllegalStateException("Error code must be an integer (line " + p.getLineNumber()+")");
      }

      try
      {
        severityInt = Integer.parseInt(severity);
      }
      catch(NumberFormatException e)
      {
        throw new IllegalStateException("Severity must be an integer between [1,5] (line " + p.getLineNumber()+")");
      }

      if(severityInt < 1 || severityInt > 5)
        throw new IllegalStateException("Severity must be an integer between [1,5] (line " + p.getLineNumber()+")");

      this.errorTypes.add(new ErrorType(codeInt, severityInt, formatString, url));
    }
    return true;
  }

  // line 647 "../../../../src/ParseUtilities_Code.ump"
   public void clear(){
    this.errorTypes = new ArrayList<ErrorType>();
  }

  // line 652 "../../../../src/ParseUtilities_Code.ump"
   public void reset(){
    clear();
    init();
  }

  // line 658 "../../../../src/ParseUtilities_Code.ump"
   public ErrorType getErrorTypeForCode(int code){
    for(ErrorType et : this.errorTypes)
      if(et.getErrorCode() == code)
        return et;

    return new ErrorType(-1, 0, "Unknown Umple Error #" + code + " : {0}", "");
  }

}
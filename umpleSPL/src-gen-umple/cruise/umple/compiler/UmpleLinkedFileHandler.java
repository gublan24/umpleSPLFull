/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.File;
import java.util.Base64;
import java.util.Base64.Decoder;
import cruise.umple.parser.analysis.LinkedFileHandler;

/**
 * This is the LinkedFileHandler for the Umple language. 
 * 
 * This handler takes all linked files and appends a series of 'use' statements
 * to the end of the current input of the main file. This is all done prior to 
 * parsing so that the statements get interpreted properly.
 */
// line 80 "../../../../src/UmpleInternalParser_CodeParserHandlers.ump"
public class UmpleLinkedFileHandler implements LinkedFileHandler
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleLinkedFileHandler()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 89 "../../../../src/UmpleInternalParser_CodeParserHandlers.ump"
   public String onFileLink(String input, File [] linkedFiles){
    for( File file : linkedFiles ){
      String theFileName = file.getPath();
      if(theFileName.startsWith("__UMPLE")) {
        byte[] decodedBytes = Base64.getDecoder().decode(theFileName.substring(7));
        // This is a direct Umple statement
        input += "\n"+(new String(decodedBytes));
      }
      else {
        // It is something that should be a use statement (file or mixset)
        input += "\nuse " + file.getPath() + ";";
      }
    }
    return input;
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
package cruise.umple.parser.analysis;
import java.io.File;
/**
 * This is a handler/delegate class that handles linked files supplied at 
 * compile time.
 * 
 * Override this class to provide custom implementations for to file linkage.
 */
// line 42 "../../../../../src/GrammarParsing.ump"
public interface LinkedFileHandler
{
  
  public String onFileLink( String input, File[] linkedFiles ) ;

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
package cruise.umple.parser.analysis;
import java.util.*;
import cruise.umple.parser.Token;
import cruise.umple.parser.rules.*;
/**
 * This type of action is used only with useStatements at the moment but their general idea is that the parser can do some action
 * whenever it successfully contructs a certain token.
 */
// line 136 "../../../../../src/GrammarParsing.ump"
public interface ParserAction
{
  
  public void onSuccess(Token token, ParserDataPackage data) ;

}
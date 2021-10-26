/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
package cruise.umple.compiler;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.Token;
// line 25 "../../../../src/UmpleParser.ump"
public interface UmpleParser
{
  
  public String toGrammar() ;

  public ParseResult parse(String ruleName, String codeToParse) ;

  public ParseResult analyze(boolean shouldGenerateCode) ;

  public Token getRootToken() ;

  public UmpleModel getModel() ;

  public boolean setModel(UmpleModel model) ;

  public ParseResult getParseResult() ;

  public boolean setFilename(String filename) ;

}
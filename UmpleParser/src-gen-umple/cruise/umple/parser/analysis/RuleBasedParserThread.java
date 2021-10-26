/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.analysis;
import java.util.*;
import cruise.umple.parser.Token;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.rules.*;

/**
 * This class is for parsing multiple files at the same time. What happens is that when a useStatement is found, a RuleBasedParserThread is
 * created. This thread then parses that file in parallel. Ordering is preserved by having the result of the parse being put within the
 * useStatement. So, in effect, a useStatement is the root to a file's tokens.
 */
// line 209 "../../../../../src/GrammarParsing.ump"
// line 695 "../../../../../src/GrammarParsing_Code.ump"
public class RuleBasedParserThread extends Thread
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RuleBasedParserThread Attributes
  private ChoiceRule root;
  private Token token;
  private String filename;
  private ParserDataPackage data;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RuleBasedParserThread(ChoiceRule aRoot, Token aToken, String aFilename, ParserDataPackage aData)
  {
    super();
    root = aRoot;
    token = aToken;
    filename = aFilename;
    data = aData;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRoot(ChoiceRule aRoot)
  {
    boolean wasSet = false;
    root = aRoot;
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

  public boolean setFilename(String aFilename)
  {
    boolean wasSet = false;
    filename = aFilename;
    wasSet = true;
    return wasSet;
  }

  public boolean setData(ParserDataPackage aData)
  {
    boolean wasSet = false;
    data = aData;
    wasSet = true;
    return wasSet;
  }

  /**
   * The root of the rule graph that will be used for parsing
   */
  public ChoiceRule getRoot()
  {
    return root;
  }

  /**
   * The root token which will be added to, after the parsing is complete
   */
  public Token getToken()
  {
    return token;
  }

  /**
   * The filename of the file that this Thread will parse
   */
  public String getFilename()
  {
    return filename;
  }

  /**
   * The data package of the previous parse, so that things like keys and the filenames already parsed can be passed along
   */
  public ParserDataPackage getData()
  {
    return data;
  }

  public void delete()
  {}


  /**
   * Each Thread will parse a separate file. When parsing is complete it will fill the useStatement token with the tokens computed from the
   * file which was parsed. This run method performs this function as well as initializes the data package which will be used during the parsing
   */
  // line 703 "../../../../../src/GrammarParsing_Code.ump"
   public void run(){
    HashMap<String,String[]> keys = data.getKeys();
    List<String> hasParsed = data.getHasParsed();
    ParseResult parseResult = data.getParseResult();
    data = new ParserDataPackage(filename, null);
    data.setKeys(keys);
    data.setHasParsed(hasParsed);
    data.setParseResult(parseResult);
    data.init(token.getPosition());
    Token temp = new Token("ROOT","");
    RuleBasedParser parser = new RuleBasedParser();
    data.setAnalyzer(parser.getAnalyzer());
    parser.parse(root,temp,filename,data);
    Token answer = parser.getRootToken();
    synchronized(token)
    {      
      if(answer!=null)
      {
        new ChoiceRule("").addAllTokens(token, answer);
      }
      token.notifyAll();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "filename" + ":" + getFilename()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "root" + "=" + (getRoot() != null ? !getRoot().equals(this)  ? getRoot().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "token" + "=" + (getToken() != null ? !getToken().equals(this)  ? getToken().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "data" + "=" + (getData() != null ? !getData().equals(this)  ? getData().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.analysis;
import java.io.*;
import java.util.*;
import cruise.umple.parser.rules.*;
import cruise.umple.parser.*;

/**
 * The rule based parser takes in umple grammar files and parses them into Rule objects(ChoiceRule, ChainRule, etc.). Really what happens is
 * that the rulebasedparser contstructs an initial rootToken that contains all the grammar rules, and then the grammaranalyzer turns those
 * into rules. Regardless, then we have a graph of rules which each has a parse function. The parse function is called on the root, and
 * the parsing begins. After that there is the cleanup, that is recovery if there was a failure or getting the rootToken and storing it
 * if not.
 */
// line 97 "../../../../../src/GrammarParsing.ump"
// line 96 "../../../../../src/GrammarParsing_Code.ump"
public class RuleBasedParser
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RuleBasedParser Attributes
  private Token rootToken;
  private ParseResult parseResult;
  private List<String> grammarFiles;

  //RuleBasedParser Associations
  private Position failedPosition;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RuleBasedParser()
  {
    rootToken = null;
    parseResult = null;
    grammarFiles = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRootToken(Token aRootToken)
  {
    boolean wasSet = false;
    rootToken = aRootToken;
    wasSet = true;
    return wasSet;
  }

  public boolean setParseResult(ParseResult aParseResult)
  {
    boolean wasSet = false;
    parseResult = aParseResult;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addGrammarFile(String aGrammarFile)
  {
    boolean wasAdded = false;
    wasAdded = grammarFiles.add(aGrammarFile);
    return wasAdded;
  }

  public boolean removeGrammarFile(String aGrammarFile)
  {
    boolean wasRemoved = false;
    wasRemoved = grammarFiles.remove(aGrammarFile);
    return wasRemoved;
  }

  /**
   * the Root Token that will be contain the result of the parse of the umple file
   */
  public Token getRootToken()
  {
    return rootToken;
  }

  /**
   * The parse's result, it will either have the value of success or failure, and should not be null after a parse
   */
  public ParseResult getParseResult()
  {
    return parseResult;
  }
  /* Code from template attribute_GetMany */
  public String getGrammarFile(int index)
  {
    String aGrammarFile = grammarFiles.get(index);
    return aGrammarFile;
  }

  public String[] getGrammarFiles()
  {
    String[] newGrammarFiles = grammarFiles.toArray(new String[grammarFiles.size()]);
    return newGrammarFiles;
  }

  public int numberOfGrammarFiles()
  {
    int number = grammarFiles.size();
    return number;
  }

  public boolean hasGrammarFiles()
  {
    boolean has = grammarFiles.size() > 0;
    return has;
  }

  public int indexOfGrammarFile(String aGrammarFile)
  {
    int index = grammarFiles.indexOf(aGrammarFile);
    return index;
  }
  /* Code from template association_GetOne */
  public Position getFailedPosition()
  {
    return failedPosition;
  }

  public boolean hasFailedPosition()
  {
    boolean has = failedPosition != null;
    return has;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setFailedPosition(Position aNewFailedPosition)
  {
    boolean wasSet = false;
    failedPosition = aNewFailedPosition;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    failedPosition = null;
  }

  // line 104 "../../../../../src/GrammarParsing_Code.ump"
   public static  GrammarAnalyzer getAnalyzer(){
    return analyzer;
  }

  // line 109 "../../../../../src/GrammarParsing_Code.ump"
   public Token getGRootToken(){
    return grootToken;
  }


  /**
   * This method helps to clean the string value of a token by tranforming an unicode character into its value. Such as semicolon "\u003B" into ";".
   * It supports \u003B ---> semicolon. This method can extended to support other unicode characters.
   */
  // line 118 "../../../../../src/GrammarParsing_Code.ump"
   private void cleanEscapeChars(Token token){
    if(token.getValue() != null)
    {
      if(token.is("value") && token.getValue().contains("\\u003B"))
        token.setValue(token.getValue().replace("\\u003B",";")); 
    } 
    for(Token subToken : token.getSubTokens())
    {
      cleanEscapeChars(subToken);
    }
  }


  /**
   * Takes a root rule and uses it to start parsing. The result will be put into the root token passed. The parsing will be performed
   * on the file. data is a DataPackage which needs to be initialized(using the init(Position)) before passing to this function.
   * The data package will contain miscellaneous data that will be computed throughout the parsing, such as FailPosition(if parsing fails)
   * and the location of couples(brackets and quotes).
   */
  // line 138 "../../../../../src/GrammarParsing_Code.ump"
   public void parse(ChoiceRule root, Token token, String filename, ParserDataPackage data){
    parsing++;
    data.setCouples(new HashMap<String,ParsingCouple>());
    BalancedRule.initialize(data.getInput(),data);
    int parseResult = root.parse(token, 0,data.getInput().length(),data.getInput(),data);
    if(parseResult==data.getInput().length())
    {
      cleanEscapeChars(token);cleanEscapeChars(token);
      setRootToken(token);
    }
    else
    {
      setRootToken(token);
      setFailedPosition(data.getPosition());
    }
    parsing--;
  }


  /**
   * Adds a parser action to operate on an action token of the specified name
   * 
   * @param name the name of the token to perform the action
   * @param action the ParserAction to perform
   */
  // line 162 "../../../../../src/GrammarParsing_Code.ump"
  public void addParserAction(String name, ParserAction action){
    actionedTokens.put(name,action);
  }

  // line 168 "../../../../../src/GrammarParsing_Code.ump"
   public void parse(ChoiceRule root, Token token, String filename, int line, ParserDataPackage data){
    parsing++;
    data.setCouples(new HashMap<String,ParsingCouple>());
    BalancedRule.initialize(data.getLine(line),data);
    int parseResult = root.parse(token, 0,data.getLine(line).length(),data.getLine(line),data);
    if(parseResult==data.getInput().length())
    {
      cleanEscapeChars(token);
      setRootToken(token);
    }
    else
    {
      setRootToken(token);
      setFailedPosition(data.getPosition());
    }
    parsing--;
  }

  // line 187 "../../../../../src/GrammarParsing_Code.ump"
   public void setupRules(){
    setupRules(true);
  }


  /**
   * 
   * After being passed all the grammar files by the UmpleInternalParser, this function is called to compute all the rules that are associated
   * to the umple language. For some reason this is computationally expensive, future implementations will hopefully be able to speed this up.
   */
  // line 196 "../../../../../src/GrammarParsing_Code.ump"
   public void setupRules(boolean forceParse){
    BufferedReader reader = null;
    InputStream resourceStream = null;
    boolean mustParse = true;
    try {
      File rulesfile = new File(new File("cruise.umple").getAbsolutePath()+File.separator+"bin"+File.separator+"rules.grammar");

      if(rulesfile.exists()&&rulesfile.canRead())
      {
        reader = new BufferedReader(new FileReader(rulesfile));
      }
      else
      {
        resourceStream = getClass().getResourceAsStream(File.separator+"rules.grammar");
        if(resourceStream == null)
        {
          mustParse = true;
          reader = null;
        }
        else
        {
          reader = new BufferedReader(new InputStreamReader(resourceStream));  
        }          
      }
      if(mustParse || forceParse)
      {
        readGrammarFiles();
        if(rulesfile.exists()&&rulesfile.canWrite()){
          rulesfile.delete();
        }
        /*
        if(!rulesfile.exists())
        {
          if(new File("cruise.umple"+File.separator+"bin"+File.separator+"umple_core.grammar").canWrite())
          {
            rulesfile.createNewFile();
          }
          if(!rulesfile.canWrite()){
            return;
          }
          BufferedWriter writer = new BufferedWriter(new FileWriter(rulesfile));
          writer.write("");
          writer.append(analyzer.getRules().get("$ROOT$").toDeclareString(new StringBuilder()));
          writer.append("//END DECLARE\n");
          analyzer.getRules().get("$ROOT$").resetDeclare();
          writer.append(analyzer.getRules().get("$ROOT$").toCannotBeString(new StringBuilder()));
          writer.append("//END CANNOTBE\n");
          analyzer.getRules().get("$ROOT$").resetDeclare();
          writer.append(analyzer.getRules().get("$ROOT$").toRedoRegexString(new StringBuilder()));
          writer.append("//END REDOREGEX\n");
          writer.close();

          analyzer.getRules().get("$ROOT$").resetDeclare();
        }
        */
      }
      else if(reader!=null)
      {
        String program = null;
        String currentLine = reader.readLine();
        if(analyzer==null)
        {
          analyzer = new GrammarAnalyzer();
          analyzer.setLinkedFileHandler(getLinkedFileHandler());
          analyzer.setAnalyzerGenerator(getAnalyzerGenerator());
          // Add all the parser actions to the analyzer
          for( Map.Entry<String,ParserAction> entry : actionedTokens.entrySet() ){
            analyzer.addParserAction(entry.getKey(), entry.getValue());
          }
        }

        analyzer.getKeys().put("{}", new String[]{"{","}"});    
        analyzer.getKeys().put("\"", new String[]{"\"","\""});
        analyzer.getKeys().put("<<!!>>", new String[]{"<<!","!>>"});    
        analyzer.getKeys().put("<<##>>", new String[]{"<<#","#>>"});
        analyzer.getKeys().put("<<=>>", new String[]{"<<=",">>"});    
        analyzer.getKeys().put("<</**/>>", new String[]{"<</*","*/>>"});
        analyzer.getKeys().put("<<$>>", new String[]{"<<$",">>"});
        analyzer.getKeys().put("<<@>>", new String[]{"<<@",">>"});

        while(currentLine!=null){    
          if(currentLine.equals("//END DECLARE")){
            currentLine = reader.readLine();
            break;
          }
          String value = reader.readLine();


          todeclare.put(currentLine,value);
          if(program==null){
            program = currentLine;          
          }
          currentLine = reader.readLine();
        }
        while(currentLine!=null)
        {
          if(currentLine.equals("//END CANNOTBE"))
          {
            currentLine = reader.readLine();
            break;
          }
          int colon = currentLine.indexOf(":");
          String name = currentLine.substring(0,colon);
          evaluate(name);
          ((Terminal)choicerules.get(name)).setCannotBe(currentLine.substring(colon+1));
          currentLine = reader.readLine();
        }
        while(currentLine!=null)
        {
          if(currentLine.equals("//END REDOREGEX"))
          {
            currentLine = reader.readLine();
            break;
          }
          int colon = currentLine.indexOf(":");
          String name = currentLine.substring(0,colon);
          int colon2 = currentLine.indexOf(":",colon+1);
          evaluate(name);
          String regex =((Terminal)choicerules.get(name)).getRegex();
          if(choicerules.get(name).getOptional())
          {
            regex = regex.substring(0,regex.length()-1);
          }
          ((Terminal)choicerules.get(name)).redoRegex(regex,currentLine.substring(colon2+1),Boolean.parseBoolean(currentLine.substring(colon+1,colon2)));
          currentLine = reader.readLine();
        }
        evaluate(program);
        analyzer.set("$ROOT$",choicerules.get(program));
        reader.close();
      }
    } 
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }


  /**
   * Takes a file and parses it, returning the ParseResult
   * 
   * @param file the file to parse
   * 
   * @return the result of this parsing as a ParseResult
   */
  // line 341 "../../../../../src/GrammarParsing_Code.ump"
   public ParseResult parse(File file, File [] linkedFiles){
    if(analyzer==null)
    {
      setupRules();
    }
    if( linkedFiles != null){
      analyzer.init(file, linkedFiles);
    }
    analyzer.execute();
    setRootToken(analyzer.getRootToken());
    cleanEscapeChars(analyzer.getRootToken());
    setParseResult(analyzer.getParseResult());
    return getParseResult();
  }


  /**
   * Takes a file and parses it, returning the ParseResult
   * 
   * @param file the file to parse
   * 
   * @return the result of this parsing as a ParseResult
   */
  // line 363 "../../../../../src/GrammarParsing_Code.ump"
   public ParseResult parse(File file){
    return parse(file, new File[0]);
  }

  // line 368 "../../../../../src/GrammarParsing_Code.ump"
   public ParseResult parse(String ruleName, String input){
    return parse(ruleName,input,"temp",null,0,0);
  }

  // line 373 "../../../../../src/GrammarParsing_Code.ump"
   public ParseResult parse(String ruleName, String input, String fileName, Position position, int lineNumber, int offset){
    if(analyzer==null)
    {
      setupRules();
    }
    analyzer.init(ruleName, input,fileName,position ,lineNumber, offset) ;   
    
    analyzer.execute();
    setRootToken(analyzer.getRootToken());
    cleanEscapeChars(analyzer.getRootToken());
    setParseResult(analyzer.getParseResult());
    return getParseResult();
  }

  // line 389 "../../../../../src/GrammarParsing_Code.ump"
   public static  boolean evaluate(String hash){
    String currentLine = todeclare.get(hash);
    if(currentLine==null)
    {
      return false;
    }
    String[] args = currentLine.split("[:]");
    String type = args[0];
    String name = args[1];
    if(type.equals("ChoiceRule"))
    {
      choicerules.put(hash,new ChoiceRule(name));
      if(name.equals("useStatement"))
      {
        choicerules.get(hash).setAction(analyzer.getActionedTokens().get("useStatement"));
      }
    }
    else if(type.equals("ChainRule"))
    {
      choicerules.put(hash,new ChainRule(name));
      
    }
    else if(type.equals("RepeatableRule"))
    {
      choicerules.put(hash,new RepeatableRule(name,Integer.parseInt(args[6]),Integer.parseInt(args[7])));
    }
    else if(type.equals("BalancedRule"))
    {
      BalancedRule rule = new BalancedRule(name,args[6],args[7]);
      rule.setNoSpaces("true".equals(args[8]));
      choicerules.put(hash,rule);
    }
    else if(type.equals("RootRule")){
      choicerules.put(hash,new RootRule(name));
    }
    else if(type.equals("Terminal"))
    {
      String regex = currentLine.substring(
        currentLine.indexOf(":",
          currentLine.indexOf(":",
            currentLine.indexOf(":",
              currentLine.indexOf(":",
                currentLine.indexOf(":",
                  currentLine.indexOf(":",
                    currentLine.indexOf(":",
                      currentLine.indexOf(":",
                        currentLine.indexOf(":",
                          currentLine.indexOf(":",
                            currentLine.indexOf(":")+1)+1)+1)+1)+1)+1)+1)+1)+1)+1)+1);
      Terminal terminal = null;
      if(args[9].equals("true"))
      {
        terminal = new Terminal(name,regex);
      }
      else
      {
        terminal = new Terminal(name,regex,args[10].equals("true"));
      }
      if(args[6].equals("true"))
      {
        terminal.onlyValue();
      }
      if(args[7].equals("true"))
      {
        terminal.setCanBeNull(true);
      }
      if(args[8].equals("true"))
      {
        terminal.cannotHaveNewline();
      }
      choicerules.put(hash,terminal);
    }
    choicerules.get(hash).setNegate(args[3].equals("true"));
    choicerules.get(hash).setOptional(args[4].equals("true"));
    try
    {
      choicerules.get(hash).setSubrules(args[5]);
    }
    catch(Exception e)
    {

    }
    if(analyzer.makeAnalyzer(choicerules.get(hash).getName()))
    {
      analyzer.addAnalyzerRule(choicerules.get(hash));
      analyzer.addAnalyzerFromStack();
      analyzer.setMustSetupAnalyzers(true);
    }
    
    for(int i=0;i<choicerules.get(hash).size();++i)
    {
      choicerules.get(hash).get(i);
    }
    return true;
  }

  // line 486 "../../../../../src/GrammarParsing_Code.ump"
  public void readGrammarFiles(){
    Terminal.space(" \\t");
    ChoiceRule rulename = new Terminal("rulename","[a-zA-Z0-9_]+",false);
    ChoiceRule definition = new RepeatableRule("definition",0,Integer.MAX_VALUE);
    ChoiceRule openbrace = new Terminal("openbrace","\\(",false).dontCare();
    ChoiceRule closebrace = new Terminal("closebrace","\\)",false).dontCare();
    ChoiceRule opencurl = new Terminal("opencurl","(\\{|\"|<<!|<</\\*|<<=|<<#|<<\\$|<<@)",false);
    ChoiceRule closecurl = new Terminal("closecurl","(\\}|\"|!>>|\\*/>>|>>|#>>|>>|>>)",false);
    ChoiceRule otherRule = new ChainRule("otherrule",new Terminal("open","\\Q[[\\E",false).dontCare(),rulename,new Terminal("close","\\Q]]\\E",false).dontCare()).dontCare();
    ChoiceRule spaceSeparated = new BalancedRule("token","[",
        new ChainRule("multi",
        new Terminal("premodifier","([~!=*]?[*]?)"),
        new Terminal("tokenname","([|][|]|[a-zA-Z0-9_,-]+)"),
        new Terminal("valuecolon","[:>]?",false),
        new Terminal("value",".*",false)).dontCare(),"]").dontCare();
    ChoiceRule options = new ChoiceRule("options",
        new ChainRule("braced",opencurl,definition,closecurl),
        new ChainRule("anonymousRule",openbrace,definition,closebrace, new Terminal("modifier","[*+?]?",false)),
        new ChainRule("otherrule",otherRule,new Terminal("modifier","[*+?]?",false)),
        new ChainRule("token",spaceSeparated,new Terminal("modifier","([*+?]?)")),
        new Terminal("separator","[|]",false),
        new Terminal("spaces","",true).dontCare(),
        new ChainRule("terminal",new Terminal("terminal","(\\Q-(\\E|\\Q-)\\E|^((?!"+((Terminal)opencurl).getRegex()+"|"+((Terminal)closecurl).getRegex()+"|\\s|\\(|\\)).)*)",false))).dontCare();

    definition.add(options);

    ChoiceRule rule = new ChoiceRule("rule",
        new ChainRule("layout",
            rulename,
            new Terminal("modifier","[-]?[#]?",false),
            new Terminal("colon","[:]",false).dontCare(),
            definition, new Terminal("newline", "[\\n]",false).dontCare()
            ).dontCare()
    );

    ChoiceRule root = rule;

    ParsingCouple.ignoreLevel = 1;
    Token rootToken = new Token("ROOT","");
    List<Thread> parsers = new ArrayList<Thread>();
    String[] keys = new String[]{"[","]"};
    rootToken = new Token("ROOT","");
    for(String filename:getGrammarFiles())
    {
      ParserDataPackage data = new ParserDataPackage(filename,getAnalyzer());
      data.getKeys().put("[]",keys);
      data.init(null);
      for(int i=0;i<data.numberOfLines();++i){
        if(!data.getLine(i).startsWith("//")&&!data.getLine(i).startsWith("\n")){
          parse(root,rootToken,filename,i, data);
        }
      }
    }
    analyzer = new GrammarAnalyzer();
    analyzer.setLinkedFileHandler(getLinkedFileHandler());
    analyzer.setAnalyzerGenerator(getAnalyzerGenerator());
    for( Map.Entry<String,ParserAction> entry : actionedTokens.entrySet() ){
      analyzer.addParserAction(entry.getKey(), entry.getValue());
    }
    analyzer.analyze(rootToken);
    analyzer.setupTerminals();
  }


  /**
   * retroactively change the linked file handler if an analyzer is already constructed
   */
  // line 550 "../../../../../src/GrammarParsing_Code.ump"
  public void setLinkedFileHandler(LinkedFileHandler aLinkedFileHandler){
    linkedFileHandler = aLinkedFileHandler;
    if( analyzer != null ){
      analyzer.setLinkedFileHandler(aLinkedFileHandler);
    }
  }

  // line 557 "../../../../../src/GrammarParsing_Code.ump"
  public LinkedFileHandler getLinkedFileHandler(){
    return linkedFileHandler;
  }


  /**
   * retroactively change the analyzer generator if an analyzer is already constructed
   */
  // line 562 "../../../../../src/GrammarParsing_Code.ump"
  public void setAnalyzerGenerator(AnalyzerGeneratorHandler aAnalyzerGenerator){
    analyzerGenerator = aAnalyzerGenerator;
    if( analyzer != null ){
      analyzer.setAnalyzerGenerator(analyzerGenerator);
    }
  }

  // line 569 "../../../../../src/GrammarParsing_Code.ump"
  public AnalyzerGeneratorHandler getAnalyzerGenerator(){
    return analyzerGenerator;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rootToken" + "=" + (getRootToken() != null ? !getRootToken().equals(this)  ? getRootToken().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "parseResult" + "=" + (getParseResult() != null ? !getParseResult().equals(this)  ? getParseResult().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "failedPosition = "+(getFailedPosition()!=null?Integer.toHexString(System.identityHashCode(getFailedPosition())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 104 "../../../../../src/GrammarParsing.ump"
  public static int parsing = 0 ;
// line 106 "../../../../../src/GrammarParsing.ump"
  public static HashMap<String,ChoiceRule> choicerules = new HashMap<String,ChoiceRule>() ;
// line 107 "../../../../../src/GrammarParsing.ump"
  private static HashMap<String,String> todeclare = new HashMap<String,String>() ;
// line 111 "../../../../../src/GrammarParsing.ump"
  private static Map<String,ParserAction> actionedTokens = new HashMap<String,ParserAction>() ;
// line 117 "../../../../../src/GrammarParsing.ump"
  static LinkedFileHandler linkedFileHandler = null ;
// line 120 "../../../../../src/GrammarParsing.ump"
  static AnalyzerGeneratorHandler analyzerGenerator = null ;
// line 99 "../../../../../src/GrammarParsing_Code.ump"
  private static GrammarAnalyzer analyzer = null ;
// line 100 "../../../../../src/GrammarParsing_Code.ump"
  private Token grootToken = null ;

  
}
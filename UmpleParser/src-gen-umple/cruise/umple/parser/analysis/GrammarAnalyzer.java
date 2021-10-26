/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.analysis;
import java.util.*;
import java.io.*;
import java.lang.reflect.*;
import cruise.umple.parser.rules.*;
import cruise.umple.parser.Position;
import cruise.umple.parser.Token;
import cruise.umple.parser.ParseResult;

/**
 * The grammar analayzer deals with first analyzing the root token of the grammar files, and constructing the rule graph for the grammar
 * then it has a execute function which will use the rule graph in the parsing of the umple file.
 */
// line 236 "../../../../../src/GrammarParsing.ump"
// line 733 "../../../../../src/GrammarParsing_Code.ump"
public class GrammarAnalyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GrammarAnalyzer Attributes
  private boolean done;
  private boolean first;
  private LinkedFileHandler linkedFileHandler;
  private AnalyzerGeneratorHandler analyzerGenerator;
  private HashMap<String,Object> global;
  private Token rootToken;
  private ParserDataPackage data;
  private Position failedPosition;
  private Getter<ChoiceRule> rules;
  private Getter<Stack<ChoiceRule>> stacks;
  private Getter<String> strings;
  private Getter<Integer> ints;
  private HashMap<String,ParserAction> actionedTokens;
  private HashMap<String,String[]> keys;
  private List<RuleBasedParserThread> threads;
  private File file;
  private String input;
  private boolean noSpaces;
  private Stack<Analyzer> analyzerStack;
  private Map<String,Analyzer> analyzerMap;
  private ParseResult parseResult;
  private List<Terminal> openTerminal;
  private List<Terminal> closeTerminal;
  private List<ChoiceRule> analyzerRules;
  private List<Analyzer> analyzers;
  private boolean mustSetupAnalyzers;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GrammarAnalyzer()
  {
    done = false;
    first = true;
    linkedFileHandler = null;
    analyzerGenerator = null;
    global = new HashMap<String,Object>();
    rootToken = null;
    data = null;
    failedPosition = null;
    rules = new Getter<ChoiceRule>();
    stacks = new Getter<Stack<ChoiceRule>>();
    strings = new Getter<String>();
    ints = new Getter<Integer>();
    actionedTokens = new HashMap<String,ParserAction>();
    keys = new HashMap<String,String[]>();
    threads = new ArrayList<RuleBasedParserThread>();
    file = null;
    input = null;
    noSpaces = false;
    analyzerStack = new Stack<Analyzer>();
    analyzerMap = new HashMap<String,Analyzer>();
    parseResult = null;
    openTerminal = new ArrayList<Terminal>();
    closeTerminal = new ArrayList<Terminal>();
    analyzerRules = new ArrayList<ChoiceRule>();
    analyzers = new ArrayList<Analyzer>();
    mustSetupAnalyzers = true;
    // line 738 "../../../../../src/GrammarParsing_Code.ump"
    set("anon_index",0);
        set("analyzer",this);
        set("stack",new Stack<ChoiceRule>());//new RuleStack());
        ChoiceRule root = new ChoiceRule("root");
        stacks.get("stack").push(root);
        // added extra space character issue 579 p{Z} matches non breaking space
        Terminal.space(" \\t\\n\\p{Z}"); 
        // Terminal.space(" \\t\\n");
        ParsingCouple.ignoreLevel = -1;
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDone(boolean aDone)
  {
    boolean wasSet = false;
    done = aDone;
    wasSet = true;
    return wasSet;
  }

  public boolean setFirst(boolean aFirst)
  {
    boolean wasSet = false;
    first = aFirst;
    wasSet = true;
    return wasSet;
  }

  public boolean setLinkedFileHandler(LinkedFileHandler aLinkedFileHandler)
  {
    boolean wasSet = false;
    linkedFileHandler = aLinkedFileHandler;
    wasSet = true;
    return wasSet;
  }

  public boolean setAnalyzerGenerator(AnalyzerGeneratorHandler aAnalyzerGenerator)
  {
    boolean wasSet = false;
    analyzerGenerator = aAnalyzerGenerator;
    wasSet = true;
    return wasSet;
  }

  public boolean setGlobal(HashMap<String,Object> aGlobal)
  {
    boolean wasSet = false;
    global = aGlobal;
    wasSet = true;
    return wasSet;
  }

  public boolean setRootToken(Token aRootToken)
  {
    boolean wasSet = false;
    rootToken = aRootToken;
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

  public boolean setFailedPosition(Position aFailedPosition)
  {
    boolean wasSet = false;
    failedPosition = aFailedPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setRules(Getter<ChoiceRule> aRules)
  {
    boolean wasSet = false;
    rules = aRules;
    wasSet = true;
    return wasSet;
  }

  public boolean setStacks(Getter<Stack<ChoiceRule>> aStacks)
  {
    boolean wasSet = false;
    stacks = aStacks;
    wasSet = true;
    return wasSet;
  }

  public boolean setStrings(Getter<String> aStrings)
  {
    boolean wasSet = false;
    strings = aStrings;
    wasSet = true;
    return wasSet;
  }

  public boolean setInts(Getter<Integer> aInts)
  {
    boolean wasSet = false;
    ints = aInts;
    wasSet = true;
    return wasSet;
  }

  public boolean setActionedTokens(HashMap<String,ParserAction> aActionedTokens)
  {
    boolean wasSet = false;
    actionedTokens = aActionedTokens;
    wasSet = true;
    return wasSet;
  }

  public boolean setKeys(HashMap<String,String[]> aKeys)
  {
    boolean wasSet = false;
    keys = aKeys;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addThread(RuleBasedParserThread aThread)
  {
    boolean wasAdded = false;
    wasAdded = threads.add(aThread);
    return wasAdded;
  }

  public boolean removeThread(RuleBasedParserThread aThread)
  {
    boolean wasRemoved = false;
    wasRemoved = threads.remove(aThread);
    return wasRemoved;
  }

  public boolean setFile(File aFile)
  {
    boolean wasSet = false;
    file = aFile;
    wasSet = true;
    return wasSet;
  }

  public boolean setInput(String aInput)
  {
    boolean wasSet = false;
    input = aInput;
    wasSet = true;
    return wasSet;
  }

  public boolean setNoSpaces(boolean aNoSpaces)
  {
    boolean wasSet = false;
    noSpaces = aNoSpaces;
    wasSet = true;
    return wasSet;
  }

  public boolean setAnalyzerStack(Stack<Analyzer> aAnalyzerStack)
  {
    boolean wasSet = false;
    analyzerStack = aAnalyzerStack;
    wasSet = true;
    return wasSet;
  }

  public boolean setAnalyzerMap(Map<String,Analyzer> aAnalyzerMap)
  {
    boolean wasSet = false;
    analyzerMap = aAnalyzerMap;
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
  public boolean addOpenTerminal(Terminal aOpenTerminal)
  {
    boolean wasAdded = false;
    wasAdded = openTerminal.add(aOpenTerminal);
    return wasAdded;
  }

  public boolean removeOpenTerminal(Terminal aOpenTerminal)
  {
    boolean wasRemoved = false;
    wasRemoved = openTerminal.remove(aOpenTerminal);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addCloseTerminal(Terminal aCloseTerminal)
  {
    boolean wasAdded = false;
    wasAdded = closeTerminal.add(aCloseTerminal);
    return wasAdded;
  }

  public boolean removeCloseTerminal(Terminal aCloseTerminal)
  {
    boolean wasRemoved = false;
    wasRemoved = closeTerminal.remove(aCloseTerminal);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addAnalyzerRule(ChoiceRule aAnalyzerRule)
  {
    boolean wasAdded = false;
    wasAdded = analyzerRules.add(aAnalyzerRule);
    return wasAdded;
  }

  public boolean removeAnalyzerRule(ChoiceRule aAnalyzerRule)
  {
    boolean wasRemoved = false;
    wasRemoved = analyzerRules.remove(aAnalyzerRule);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addAnalyzer(Analyzer aAnalyzer)
  {
    boolean wasAdded = false;
    wasAdded = analyzers.add(aAnalyzer);
    return wasAdded;
  }

  public boolean removeAnalyzer(Analyzer aAnalyzer)
  {
    boolean wasRemoved = false;
    wasRemoved = analyzers.remove(aAnalyzer);
    return wasRemoved;
  }

  public boolean setMustSetupAnalyzers(boolean aMustSetupAnalyzers)
  {
    boolean wasSet = false;
    mustSetupAnalyzers = aMustSetupAnalyzers;
    wasSet = true;
    return wasSet;
  }

  public boolean getDone()
  {
    return done;
  }

  public boolean getFirst()
  {
    return first;
  }

  /**
   * The handler for dealing with linked files
   */
  public LinkedFileHandler getLinkedFileHandler()
  {
    return linkedFileHandler;
  }

  /**
   * The handler to control generation of Analyzer objects at runtime
   */
  public AnalyzerGeneratorHandler getAnalyzerGenerator()
  {
    return analyzerGenerator;
  }

  /**
   * hashmap of global variables(local to the class, not local to methods)
   */
  public HashMap<String,Object> getGlobal()
  {
    return global;
  }

  /**
   * rootToken which will be the result of the parsing of the umple file passed
   */
  public Token getRootToken()
  {
    return rootToken;
  }

  /**
   * the data package used during the parsing.
   */
  public ParserDataPackage getData()
  {
    return data;
  }

  /**
   * the failed position, if there was one, it will remain null if the parse was successful
   */
  public Position getFailedPosition()
  {
    return failedPosition;
  }

  /**
   * Global variable getters and setters
   */
  public Getter<ChoiceRule> getRules()
  {
    return rules;
  }

  public Getter<Stack<ChoiceRule>> getStacks()
  {
    return stacks;
  }

  public Getter<String> getStrings()
  {
    return strings;
  }

  public Getter<Integer> getInts()
  {
    return ints;
  }

  /**
   * currently only implemented with useStatement as the only element of this hashmap, but it is extendable, should the need arise.
   */
  public HashMap<String,ParserAction> getActionedTokens()
  {
    return actionedTokens;
  }

  /**
   * The keys that will be used by the couples of this hash map
   */
  public HashMap<String,String[]> getKeys()
  {
    return keys;
  }
  /* Code from template attribute_GetMany */
  public RuleBasedParserThread getThread(int index)
  {
    RuleBasedParserThread aThread = threads.get(index);
    return aThread;
  }

  public RuleBasedParserThread[] getThreads()
  {
    RuleBasedParserThread[] newThreads = threads.toArray(new RuleBasedParserThread[threads.size()]);
    return newThreads;
  }

  public int numberOfThreads()
  {
    int number = threads.size();
    return number;
  }

  public boolean hasThreads()
  {
    boolean has = threads.size() > 0;
    return has;
  }

  public int indexOfThread(RuleBasedParserThread aThread)
  {
    int index = threads.indexOf(aThread);
    return index;
  }

  /**
   * Umple file that will be parsed(like Master.ump)
   */
  public File getFile()
  {
    return file;
  }

  /**
   * filename of the file to be parsed
   */
  public String getInput()
  {
    return input;
  }

  /**
   * if a balanced rule is created, it needs to know if the current context is nospaces or not
   */
  public boolean getNoSpaces()
  {
    return noSpaces;
  }

  public Stack<Analyzer> getAnalyzerStack()
  {
    return analyzerStack;
  }

  public Map<String,Analyzer> getAnalyzerMap()
  {
    return analyzerMap;
  }

  /**
   * resulting parse result from the parse
   */
  public ParseResult getParseResult()
  {
    return parseResult;
  }
  /* Code from template attribute_GetMany */
  public Terminal getOpenTerminal(int index)
  {
    Terminal aOpenTerminal = openTerminal.get(index);
    return aOpenTerminal;
  }

  public Terminal[] getOpenTerminal()
  {
    Terminal[] newOpenTerminal = openTerminal.toArray(new Terminal[openTerminal.size()]);
    return newOpenTerminal;
  }

  public int numberOfOpenTerminal()
  {
    int number = openTerminal.size();
    return number;
  }

  public boolean hasOpenTerminal()
  {
    boolean has = openTerminal.size() > 0;
    return has;
  }

  public int indexOfOpenTerminal(Terminal aOpenTerminal)
  {
    int index = openTerminal.indexOf(aOpenTerminal);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Terminal getCloseTerminal(int index)
  {
    Terminal aCloseTerminal = closeTerminal.get(index);
    return aCloseTerminal;
  }

  public Terminal[] getCloseTerminal()
  {
    Terminal[] newCloseTerminal = closeTerminal.toArray(new Terminal[closeTerminal.size()]);
    return newCloseTerminal;
  }

  public int numberOfCloseTerminal()
  {
    int number = closeTerminal.size();
    return number;
  }

  public boolean hasCloseTerminal()
  {
    boolean has = closeTerminal.size() > 0;
    return has;
  }

  public int indexOfCloseTerminal(Terminal aCloseTerminal)
  {
    int index = closeTerminal.indexOf(aCloseTerminal);
    return index;
  }
  /* Code from template attribute_GetMany */
  public ChoiceRule getAnalyzerRule(int index)
  {
    ChoiceRule aAnalyzerRule = analyzerRules.get(index);
    return aAnalyzerRule;
  }

  public ChoiceRule[] getAnalyzerRules()
  {
    ChoiceRule[] newAnalyzerRules = analyzerRules.toArray(new ChoiceRule[analyzerRules.size()]);
    return newAnalyzerRules;
  }

  public int numberOfAnalyzerRules()
  {
    int number = analyzerRules.size();
    return number;
  }

  public boolean hasAnalyzerRules()
  {
    boolean has = analyzerRules.size() > 0;
    return has;
  }

  public int indexOfAnalyzerRule(ChoiceRule aAnalyzerRule)
  {
    int index = analyzerRules.indexOf(aAnalyzerRule);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Analyzer getAnalyzer(int index)
  {
    Analyzer aAnalyzer = analyzers.get(index);
    return aAnalyzer;
  }

  public Analyzer[] getAnalyzers()
  {
    Analyzer[] newAnalyzers = analyzers.toArray(new Analyzer[analyzers.size()]);
    return newAnalyzers;
  }

  public int numberOfAnalyzers()
  {
    int number = analyzers.size();
    return number;
  }

  public boolean hasAnalyzers()
  {
    boolean has = analyzers.size() > 0;
    return has;
  }

  public int indexOfAnalyzer(Analyzer aAnalyzer)
  {
    int index = analyzers.indexOf(aAnalyzer);
    return index;
  }

  public boolean getMustSetupAnalyzers()
  {
    return mustSetupAnalyzers;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNoSpaces()
  {
    return noSpaces;
  }

  public void delete()
  {}


  /**
   * This funciton is used for putting things into the global hashmap that contains all objects
   */
  // line 267 "../../../../../src/GrammarParsing.ump"
   protected void set(String string, Object object){
    global.put(string, object);
  }


  /**
   * Adds a parser action to operate on an action token of the specified name
   * 
   * @param name the name of the token to perform the action
   * @param action the ParserAction to perform
   */
  // line 756 "../../../../../src/GrammarParsing_Code.ump"
  public void addParserAction(String name, ParserAction action){
    actionedTokens.put(name,action);
  }


  /**
   * Must be called before use with the execute function, this function sets up the file for parsing
   */
  // line 763 "../../../../../src/GrammarParsing_Code.ump"
   public void init(File file, File [] linkedFiles){
    setFile( file );
    input = file.getAbsolutePath();
    setData(new ParserDataPackage(input,this));
    getData().setKeys(keys);
    getData().init(null);
    getData().linkFiles( getLinkedFileHandler(), linkedFiles );
  }

  // line 772 "../../../../../src/GrammarParsing_Code.ump"
   public void init(String ruleName, String input){
    init(ruleName,input,"temp",null,0,0);
  }

  // line 776 "../../../../../src/GrammarParsing_Code.ump"
   public void init(String ruleName, String input, String fileName, Position usePosition, int lineNumber, int offset){
    this.input = input;
    setData(new ParserDataPackage(fileName,this));
    getData().setKeys(keys);
    getData().init(input,usePosition,lineNumber,offset);
  }


  /**
   * Performs the parsing on the umple file.
   */
  // line 786 "../../../../../src/GrammarParsing_Code.ump"
   public void execute(){
    setRootToken(new Token("ROOT",""));
    RuleBasedParser parser = new RuleBasedParser();
    parser.parse(rules.get("$ROOT$"),getRootToken(), input,getData());
    setRootToken(parser.getRootToken());
    while(threads.size()>0)
    {
      try 
      {
        RuleBasedParserThread thread = threads.remove(0);
        if(thread!=null)
        {
          thread.join();
        }
      } 
      catch (InterruptedException e)
      {
      }
    }
    setFailedPosition(parser.getFailedPosition());
    setParseResult(getData().getParseResult());
    if(mustSetupAnalyzers)
    {
      setupAnalyzers();
      mustSetupAnalyzers = false;
    }
  }


  /**
   * --Analyze Rule Methods
   * The rules token contains all the rules in a grammar file.
   */
  // line 818 "../../../../../src/GrammarParsing_Code.ump"
   public void rules(Token token){
    analyze(token);
  }

  // line 823 "../../../../../src/GrammarParsing_Code.ump"
   public boolean makeAnalyzer(String name){
    boolean wasMade = false;
    if(!getAnalyzerMap().containsKey(name)){
      Analyzer a = null;
      if( getAnalyzerGenerator() != null ){
        a = getAnalyzerGenerator().generateFromName(name);
      }
      if( a != null ){
        getAnalyzerMap().put(name,a);
        analyzerStack.push(a);
        wasMade = true;
      }
    }
    return wasMade;
  }


  /**
   * The rule token denotes the beginning of a rule definition.
   */
  // line 842 "../../../../../src/GrammarParsing_Code.ump"
   public void rule(Token token){
    if(rules.get(getValue(token,"rulename"))==null)
    {
      set(getValue(token,"rulename"),getFirst()?new RootRule(getValue(token,"rulename")):new ChoiceRule(getValue(token,"rulename")));
      if(getFirst())
      {
        set("$ROOT$",rules.get(getValue(token,"rulename")));
        setFirst(false);
      }
    }
    ChoiceRule self = rules.get(getValue(token,"rulename"));
    boolean hasAnalyzer = makeAnalyzer(self.getName());
    String modifier = getValue(token,"modifier");
    noSpaces = false;
    if(modifier!=null)
    {
      if(modifier.contains("-"))
      {
        self.dontCare();
      }
      if(modifier.contains("#"))
      {
        noSpaces = true;
      }
    }
    if(actionedTokens.get(self.getName())!=null)
    {
      self.setAction(actionedTokens.get(self.getName()));
    }
    stacks.get("stack").peek().add(self);
    stacks.get("stack").push(self);
    analyze(token);
    stacks.get("stack").pop();
    if(hasAnalyzer)
    {
      addAnalyzerFromStack();
      analyzerRules.add(self);
    }
  }

  // line 883 "../../../../../src/GrammarParsing_Code.ump"
   public void addAnalyzerFromStack(){
    analyzers.add(analyzerStack.pop());
  }


  /**
   * The definition token is used both for the rule definition, and anonymous rules(rules containsed within paratheses).
   */
  // line 890 "../../../../../src/GrammarParsing_Code.ump"
   public void definition(Token token){
    ChoiceRule self = new ChainRule("annoymous_multirule_"+ints.get("anon_index")).dontCare();
    set("anon_index",ints.get("anon_index")+1);
    stacks.get("stack").peek().add(self);
    stacks.get("stack").push(self);
    analyze(token);
    stacks.get("stack").pop();
  }


  /**
   * Otherrule tokens are for rule names within a definition, where the otherrule is defined elsewhere.
   */
  // line 903 "../../../../../src/GrammarParsing_Code.ump"
   public void otherrule(Token token){
    String modifier = getValue(token,"modifier");
    if(modifier!=null&&modifier.length()>0)
    {
      int start = 1;
      int end = 1;
      switch(getValue(token,"modifier").charAt(0))
      {
      case '*':
        start = 0;
        end = Integer.MAX_VALUE;
        break;
      case '?':
        start = 0;
        end = 1;
        break;
      case '+':
        start = 1;
        end = Integer.MAX_VALUE;
        break;
      }
      ChoiceRule star = new RepeatableRule("annoymous_starrule_"+ints.get("anon_index"),start,end).dontCare();
      set("anon_index",ints.get("anon_index")+1);
      stacks.get("stack").peek().add(star);
      stacks.get("stack").push(star);
    }

    if(rules.get(getValue(token,"rulename"))==null)
    {
      set(getValue(token,"rulename"),new ChoiceRule(getValue(token,"rulename")));
    }
    ChoiceRule self = rules.get(getValue(token,"rulename"));
    stacks.get("stack").peek().add(self);  
    if(modifier!=null&&modifier.length()>0)
    {
      stacks.get("stack").pop();
    }
   
    if(makeAnalyzer(self.getName()))
    {
      analyzers.add(analyzerStack.pop());
      analyzerRules.add(self);
    }
  }


  /**
   * Simple method to handle token values.
   */
  // line 951 "../../../../../src/GrammarParsing_Code.ump"
   public String getValue(Token token, String name){
    String value = null;
    for(Token sub:token.getSubTokens())
    {
      if(sub.is(name))
      {
        value = sub.getValue();
      }
    }
    return value;
  }


  /**
   * Terminals are keywords or syntax.
   */
  // line 967 "../../../../../src/GrammarParsing_Code.ump"
   public void terminal(Token token){
    String value = getValue(token,"terminal");
    value = value.replace("-(","(").replace("-)",")").replace("OPEN_ROUND_BRACKET","(").replace("CLOSE_ROUND_BRACKET",")");
    
    String regex = "\\Q"+value+"\\E";
    
    Terminal terminal = null;
    
    if(value.length()==0?false:(""+value.charAt(value.length()-1)).matches("[a-zA-Z]"))
    {
      terminal = new Terminal("anonymous_terminal_"+ints.get("anon_index"),"("+regex+"[a-zA-Z]?)",false);
      terminal.setCannotBe(regex+"[a-zA-Z]");
    }
    else
    {
      terminal = new Terminal("anonymous_terminal_"+ints.get("anon_index"),regex,false);
    }
    stacks.get("stack").peek().add(terminal.onlyValue());
    
    set("anon_index",ints.get("anon_index")+1);
  }


  /**
   * Tokens are of the form [{premodifier}tokenname{:value}] and denote a Terminal rule where the a Token is created with the value specified by some premodifier
   */
  // line 993 "../../../../../src/GrammarParsing_Code.ump"
   public void token(Token token){
    ChoiceRule terminal = null;
    String name = getValue(token,"tokenname");
    String premodifier = getValue(token,"premodifier");
    String modifier = getValue(token,"modifier");
    String value = getValue(token,"value");
    boolean makeTerminal = true;

    modifier = modifier==null?"":modifier;
    premodifier = premodifier==null?"":premodifier;
    value = value==null?"":value.replace("OPEN_ROUND_BRACKET","(").replace("CLOSE_ROUND_BRACKET",")");
    String regex;
    boolean post = false;
    if("-".equals(name)&&"||".equals(value))
    {
      name = "||";
      regex = "\\Q||\\E";
    }
    else if(name.contains(",")&&name.length()>1)
    {
      regex = "[^\\s\\{\\}\\(\\);,]+";
      String[] names = name.split(",");
      String[] numbers = value.split(",");
      for(int i=0;i<names.length;i++)
      {
        Terminal term = new Terminal(names[i],"("+regex+")"+(i<numbers.length?((numbers[i].equals("0"))?"":"?"):(i==0?"":"?")),false);
        stacks.get("stack").peek().add(term);    
      }
      return;
    }
    else
    {
      if("=".equals(premodifier))
      {
        if("".equals(value))
        {
          regex = "\\Q"+name+"\\E";
          String cannotBeRegex = "";
          value = name;
          if(value.length()==0?false:(""+value.charAt(value.length()-1)).matches("[a-zA-Z]"))
          {
            cannotBeRegex = regex+"[a-zA-Z]";
            regex += "[a-zA-Z]?";
          }
          terminal = new Terminal(name,"("+regex+")",false);
          if(!cannotBeRegex.equals(""))
          {
            ((Terminal)terminal).setCannotBe(cannotBeRegex);
          }          
          makeTerminal = false;
        }
        else
        {
          regex = value;
          Set<String> sorted = new TreeSet<String>(new Comparator<String>()
          {
            @Override
            public int compare(String o1, String o2)
            {  
              if (o1.length() > o2.length())
              {
                return -1;
              } 
              else if (o1.length() < o2.length())
              {
                return 1;
              }
              return o1.compareTo(o2);
           }
          });
          for(String val:regex.split("\\Q|\\E"))
          {
            sorted.add(val);
          }

          regex = "";
          String cannotBeRegex = "";
          String pipe = "";
          String pipe2 = "";
          for(String val:sorted)
          {
            if(val.length()==0?false:(""+val.charAt(val.length()-1)).matches("[a-zA-Z]"))
            {
              regex += pipe + "\\Q"+val+"\\E"+"[a-zA-Z]?";
              cannotBeRegex += pipe2 + "\\Q"+val+"\\E"+"[a-zA-Z]";
              pipe2 = "|";
            }
            else
            {
              regex += pipe + "\\Q"+val+"\\E";              
            }
            pipe = "|";
          }
          terminal = new Terminal(name,"("+regex+")",false);
          if(!cannotBeRegex.equals(""))
          {
            ((Terminal)terminal).setCannotBe(cannotBeRegex);
          }            
          
          makeTerminal = false;
        }
      }
      else if("~".equals(premodifier))
      {
        regex = "[a-zA-Z_]([a-zA-Z0-9_]|-[a-zA-Z0-9_])*([ \\t]*<(([^\\{\\}\\(\\);\\n\\[\\]>@]|\\[\\])*)>+)?";
      }
      else if("!".equals(premodifier))
      {
        regex = value;
      }
      else
      {
        regex = value;
        if(!"*".equals(premodifier)&&"".equals(value))
        {
          post = true;
        }
      }
    }
    if("**".equals(premodifier))
    {
      if(!"".equals(value))
      {
        regex = "^((?!"+value+").)*";
      }
      else
      {
        regex = ".*";
        post = true;
      }
    }
    else if("*".equals(premodifier))
    {
      regex = "([^\\n]*\\n\\s*)";
      ChoiceRule rule = stacks.get("stack").peek();
      if(rule.size()>0&&rule.get(0) instanceof Terminal)
      {
        ((Terminal)rule.get(0)).cannotHaveNewline();
      }
    }
    if(!"".equals(modifier))
    {
      regex = "("+regex+")"+modifier;
    }
    if(makeTerminal)
    {
      terminal = new Terminal(name,regex,false);
    }
    if("~".equals(premodifier))
    {
      closeTerminal.add((Terminal)terminal);
    }
    if("**".equals(premodifier))
    {
      terminal.setOptional(true);
      ((Terminal)terminal).setCanBeNull(true);
    }
    else if("*".equals(premodifier))
    {
      terminal = new Terminal(name,regex);
      terminal.setOptional(true);
    }
    if(post)
    {
      openTerminal.add((Terminal)terminal);
    }
    if(!"".equals(modifier))
    {
      int start = 1;
      int end = 1;
      switch(token.getValue("modifier").charAt(0))
      {
          case '*':
            start = 0;
            end = Integer.MAX_VALUE;
            break;
          case '?':
            start = 0;
            end = 1;
            break;
          case '+':
            start = 1;
            end = Integer.MAX_VALUE;
            break;
      }
      if(start==0)
      {
        terminal.setOptional(true);
      }
      terminal = new RepeatableRule("annoymous_starrule_"+ints.get("anon_index"),start,end,terminal).dontCare();
        set("anon_index",ints.get("anon_index")+1);
    }  
    stacks.get("stack").peek().add(terminal);
  }


  /**
   * These are rules that are specified within brackets, and are therefore not Tokenized.
   */
  // line 1192 "../../../../../src/GrammarParsing_Code.ump"
   public void anonymousRule(Token token){
    ChoiceRule rule = new ChoiceRule("annoymous_rule_"+ints.get("anon_index")).dontCare();
    set("anon_index",ints.get("anon_index")+1);
    int start = 1;
    int end = 1;
    String modifier = getValue(token,"modifier");
    if(modifier!=null&&modifier.length()>0)
    {
      switch(token.getValue("modifier").charAt(0))
      {
      case '*':
        start = 0;
        end = Integer.MAX_VALUE;
        break;
      case '?':
        start = 0;
        end = 1;
        break;
      case '+':
        start = 1;
        end = Integer.MAX_VALUE;
        break;
      }
    }
    ChoiceRule star = new RepeatableRule("annoymous_starrule_"+ints.get("anon_index"),start,end,rule).dontCare();
    set("anon_index",ints.get("anon_index")+1);

    stacks.get("stack").peek().add(star);
    stacks.get("stack").push(star);
    stacks.get("stack").push(rule);
    analyze(token);
    stacks.get("stack").pop();
    stacks.get("stack").pop();
  }


  /**
   * {} and "" are special couple characters and are handled by making a BalancedRule which will ensure that the { is paired with the proper } and so on
   */
  // line 1231 "../../../../../src/GrammarParsing_Code.ump"
   public void braced(Token token){
    ChoiceRule rule = new ChoiceRule("annoymous_rule_"+ints.get("anon_index")).dontCare();
    set("anon_index",ints.get("anon_index")+1);
    ChoiceRule multi = new ChainRule("annoymous_multirule_"+ints.get("anon_index")).dontCare();
    set("anon_index",ints.get("anon_index")+1);
    String open = getValue(token,"opencurl");
    String close = getValue(token,"closecurl");
    ChoiceRule couple = new BalancedRule("annoymous_braced_"+ints.get("anon_index"),
        open,
        rule,
        close).dontCare();
    couple.setNoSpaces(noSpaces);
    
    String key = open+close;
    if(!keys.containsKey(key))
    {
      keys.put(key,new String[]{open,close});
    }
    set("anon_index",ints.get("anon_index")+1);
    multi.add(couple);

    stacks.get("stack").peek().add(multi);
    stacks.get("stack").push(couple);
    stacks.get("stack").push(multi);
    stacks.get("stack").push(rule);
    analyze(token);
    stacks.get("stack").pop();
    stacks.get("stack").pop();
    stacks.get("stack").pop();
  }


  /**
   * The separator token denotes the | in a rule. It means that everything before a separator is contained within one Rule and everything
   * after the | is contained in a separate Rule. The parent to both of these rules is a ChoiceRule, meaning that each of the rules created
   * will be tried.
   */
  // line 1267 "../../../../../src/GrammarParsing_Code.ump"
   public void separator(Token token){
    stacks.get("stack").pop();
    ChoiceRule self = new ChainRule("annoymous_multirule_"+ints.get("anon_index")).dontCare();
    set("anon_index",ints.get("anon_index")+1);
    stacks.get("stack").peek().add(self);
    stacks.get("stack").push(self);
  }


  /**
   * There are some terminals that need to use their surroundings to determine what they can and cannot take on as values
   * this function iterates through all such terminals
   */
  // line 1280 "../../../../../src/GrammarParsing_Code.ump"
   public void setupTerminals(){
    for(Terminal terminal:openTerminal)
    {
      setupTerminal(terminal);
    }
    for(Terminal terminal:closeTerminal)
    {
      setupAlphanumericTerminal(terminal);
    }
  }


  /**
   * Similar to the setupTerminal function this function makes sure that an alphanumeric does not take a value that is the value of then next terminal
   * for instance if an association looks like * -- 1 Student sorted { }; the rolename is student not sorted.
   * This works also for having * -- 1 Student sorted sorted { }; which will be a sorted list of students called sorted. (i.e. if the next one is accounted for then everything proceeds as normal)
   */
  // line 1296 "../../../../../src/GrammarParsing_Code.ump"
   public void setupAlphanumericTerminal(Terminal terminal){
    ChoiceRule child = null;
    ChoiceRule parent = terminal;
    int index = 0;
    boolean optional = false;
    while(true)
    {
      child = parent;
      parent = parent.getParent();
      while(!(parent instanceof ChainRule)&&!(parent instanceof RepeatableRule))
      {
        child = parent;
        parent = parent.getParent();
        if(parent==null)
        {
          return;
        }
      }
      if(parent instanceof ChainRule)
      {
        index = parent.indexOf(child);
        if(index+1<parent.size())
        {
          optional = parent.get(index+1).isOptional();
          break;
        }
      }
      else if(parent instanceof RepeatableRule && ((RepeatableRule)parent).getMax()>1)
      {
        index = -1;
        optional = parent.isOptional();
        break;
      }
    }
    if(!"".equals(parent.get(index+1).getFirstValue()))
    {
      boolean shouldSet = false;
      for(String str:parent.get(index+1).getFirstValue().replace("\\Q", "").replace("\\E", "").split("|"))
      {
        if(str.matches(terminal.getRegex()))
        {
          shouldSet = true;
          break;
        }
      }
      if(shouldSet)
      {
        terminal.setCannotBe(parent.get(index+1).getFirstValue());
      }
    }
  }


  /**
   * Sets up the tokens with no premodifier to make sure they stop at the right place,
   * for instance [type] [=list[]]? should stop before the [], so the type only contains String, instead of String[]
   */
  // line 1354 "../../../../../src/GrammarParsing_Code.ump"
   public void setupTerminal(Terminal terminal){
    ChoiceRule child = null;
    ChoiceRule parent = terminal;
    int index = 0;
    boolean optional = false;
    String value = "";
    while(true)
    {
      child = parent;
      parent = parent.getParent();
      while(!(parent instanceof ChainRule)&&!(parent instanceof BalancedRule)&&!(parent instanceof RepeatableRule))
      {
        child = parent;
        parent = parent.getParent();
        if(parent==null)
        {
          return;
        }
      }
      if(parent instanceof ChainRule)
      {
        index = parent.indexOf(child);
        if(index+1<parent.size())
        {
          optional = parent.get(index+1).isOptional();
          
          if(parent.get(index+1).getFirstValue().equals(""))
          {
            value = "";
          }
          else if(parent.get(index+1).getFirstValue().charAt(parent.get(index+1).getFirstValue().length()-1)=='?')
          {
        value = parent.get(index+1).getFirstValue().substring(0,parent.get(index+1).getFirstValue().length()-1);
        }
        else
        {
          value = parent.get(index+1).getFirstValue();
        }
        /* 
        Future developements: if you have a rule [rule1] [rule2]? [rule3]?
                              then rule1 should be optionally delimited by rule2 and rule3
                              currently it is only delimited by rule2
                              the code below does this, except it does not work when the rule 3 is an alphanumeric
          if(optional)
          {
            index++;
            while(index+1<parent.size()&&parent.get(index).isOptional())
            {
              if(parent.get(index+1).getFirstValue().charAt(parent.get(index+1).getFirstValue().length()-1)=='?')
              {
            value += "|"+parent.get(index+1).getFirstValue().substring(0,parent.get(index+1).getFirstValue().length()-1);
            }
            else
            {
              value += "|"+parent.get(index+1).getFirstValue();
            }              
              index++;
            }
          }*/
          break;
        }
      }
      else if(parent instanceof BalancedRule)
      {
        if(!terminal.getRegex().equals(".*"))
        {
          terminal.redoRegex("[^\\s\\{\\}\\(\\);,]+");
        }
        return;
      }
      else if(!terminal.getRegex().equals(".*")&&parent instanceof RepeatableRule && ((RepeatableRule)parent).getMax()>1)
      {
        value = parent.get(0).getFirstValue();
        optional = parent.isOptional();
        break;
      }
    }
    if(terminal.getRegex().equals(".*"))
    {
      if(!"".equals(value))
      {
        terminal.redoRegex("^((?!"+value+").)*");
      }
    }
    else 
    {
      if(!"".equals(value))
      {
        value = value.replace(
             "[a-zA-Z_]([a-zA-Z0-9_]|-[a-zA-Z0-9_])*([ \\t]*<(([^\\{\\}\\(\\);\\n\\[\\]>]|\\[\\])*)>+)?",
             "\\s[a-zA-Z_]([a-zA-Z0-9_]|-[a-zA-Z0-9_])*([ \\t]*<(([^\\{\\}\\(\\);\\n\\[\\]>]|\\[\\])*)>+)?");

  value = value.replace(
             "[a-zA-Z_]([a-zA-Z0-9_]|-[a-zA-Z0-9_])*([ \\t]*<(([^\\{\\}\\(\\);\\n\\[\\]>@]|\\[\\])*)>+)?",
             "\\s[a-zA-Z_]([a-zA-Z0-9_]|-[a-zA-Z0-9_])*([ \\t]*<(([^\\{\\}\\(\\);\\n\\[\\@]>]|\\[\\])*)>+)?");
        
        terminal.redoRegex("([^\\s\\{\\}\\(\\);,<]|<[^>]*>+)+",
          value,
          optional);
      }
      else
      {
        terminal.redoRegex("[^\\s\\{\\}\\(\\);,]+");
      }
    }
  }

  // line 1462 "../../../../../src/GrammarParsing_Code.ump"
   public void analyze(Token tokens){
    for(Token token: tokens.getSubTokens())
    {
      if(token.is("rule"))
      {
        rule(token);
      }
      else if(token.is("definition"))
      {
        definition(token);
      }
      else if(token.is("otherrule"))
      {
        otherrule(token);
      }
      else if(token.is("anonymousRule"))
      {
        anonymousRule(token);
      }
      else if(token.is("token"))
      {
        this.token(token);
      }
      else if(token.is("separator"))
      {
        separator(token);
      }
      else if(token.is("terminal"))
      {
        terminal(token);
      }
      else if(token.is("braced"))
      {
        braced(token);
      }
    }
  }

  // line 1500 "../../../../../src/GrammarParsing_Code.ump"
   public List<Analyzer> setupAnalyzers(){
    for(int i=0;i<analyzerRules.size();++i)
    {
      List<ChoiceRule> checked = new ArrayList<ChoiceRule>();
      if(analyzerRules.get(i)!=null)
      {
        List<Analyzer> children = setupAnalyzers(analyzers.get(i), analyzerRules.get(i),checked);
      
        int size = -1;
        while(children.size()!=size)
        {
          size = children.size();
          if(analyzerRules.get(i)!=null)
          {
            children.addAll(setupAnalyzers(analyzers.get(i), analyzerRules.get(i),checked));
          }
        }
        for(Analyzer analyzer:children)
        {
          analyzers.get(i).addChild(analyzer);
        }
      }
    }
    return null;
  }

  // line 1527 "../../../../../src/GrammarParsing_Code.ump"
   public List<Analyzer> setupAnalyzers(Analyzer analyzer, ChoiceRule parent, List<ChoiceRule> checked){
    List<Analyzer> children = new ArrayList<Analyzer>();
    if(parent==null)return children;
    for(int i=0;i<parent.size();++i)
    {
      if(!checked.contains(parent.get(i)))
      {
        checked.add(parent.get(i));
        
        if(parent.get(i) instanceof Terminal)
        {
          if(makeAnalyzer(analyzer.getName()+parent.get(i).getName().substring(0,1).toUpperCase()+parent.get(i).getName().substring(1)))
          {
            Analyzer a = analyzerStack.pop();
            a.setName(parent.get(i).getName());
            children.add(a);
            analyzers.add(a);
            analyzerRules.add(parent.get(i));
          }
          else if(makeAnalyzer(parent.get(i).getName()))
          {
            Analyzer a = analyzerStack.pop();
            children.add(a);
            analyzers.add(a);
            analyzerRules.add(parent.get(i)); 
          }
          else if(analyzerRules.contains(parent.get(i)))
          {
            children.add(analyzers.get(analyzerRules.indexOf(parent.get(i))));
          }
        }
        else if(analyzerRules.contains(parent.get(i)))
        {
          children.add(analyzers.get(analyzerRules.indexOf(parent.get(i))));
        }
        else
        {
          children.addAll(setupAnalyzers(analyzer,parent.get(i),checked));
        }
      }
    }
    return children;
  }


  public String toString()
  {
    return super.toString() + "["+
            "done" + ":" + getDone()+ "," +
            "first" + ":" + getFirst()+ "," +
            "input" + ":" + getInput()+ "," +
            "noSpaces" + ":" + getNoSpaces()+ "," +
            "mustSetupAnalyzers" + ":" + getMustSetupAnalyzers()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "linkedFileHandler" + "=" + (getLinkedFileHandler() != null ? !getLinkedFileHandler().equals(this)  ? getLinkedFileHandler().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "analyzerGenerator" + "=" + (getAnalyzerGenerator() != null ? !getAnalyzerGenerator().equals(this)  ? getAnalyzerGenerator().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "global" + "=" + (getGlobal() != null ? !getGlobal().equals(this)  ? getGlobal().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rootToken" + "=" + (getRootToken() != null ? !getRootToken().equals(this)  ? getRootToken().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "data" + "=" + (getData() != null ? !getData().equals(this)  ? getData().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "failedPosition" + "=" + (getFailedPosition() != null ? !getFailedPosition().equals(this)  ? getFailedPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rules" + "=" + (getRules() != null ? !getRules().equals(this)  ? getRules().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "stacks" + "=" + (getStacks() != null ? !getStacks().equals(this)  ? getStacks().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "strings" + "=" + (getStrings() != null ? !getStrings().equals(this)  ? getStrings().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "ints" + "=" + (getInts() != null ? !getInts().equals(this)  ? getInts().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "actionedTokens" + "=" + (getActionedTokens() != null ? !getActionedTokens().equals(this)  ? getActionedTokens().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "keys" + "=" + (getKeys() != null ? !getKeys().equals(this)  ? getKeys().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "file" + "=" + (getFile() != null ? !getFile().equals(this)  ? getFile().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "analyzerStack" + "=" + (getAnalyzerStack() != null ? !getAnalyzerStack().equals(this)  ? getAnalyzerStack().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "analyzerMap" + "=" + (getAnalyzerMap() != null ? !getAnalyzerMap().equals(this)  ? getAnalyzerMap().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "parseResult" + "=" + (getParseResult() != null ? !getParseResult().equals(this)  ? getParseResult().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 250 "../../../../../src/GrammarParsing.ump"
  public class Getter<T> 
  {
    public Getter()
    {
    }
    @SuppressWarnings("unchecked")
    public T get(String name)
    {
      return ((T)global.get(name));
    }
  }

  
}
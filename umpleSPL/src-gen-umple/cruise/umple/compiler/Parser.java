/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.lang.IllegalStateException;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.Position;
import cruise.umple.parser.Token;
import cruise.umple.parser.TextParser;
import cruise.umple.parser.ErrorMessage;
import java.util.*;

/**
 * Parses an Umple file (.ump) based on grammar rules.
 * 
 * As parsing is going on "tokens" will be created and linked together in a hierarchy fashion based on what was parsed.
 */
// line 354 "../../../../src/Parser_Code.ump"
// line 81 "../../../../src/Parser.ump"
public class Parser
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Parser Attributes
  private String filename;
  private String name;
  private List<String> grammarRules;
  private ParseResult parseResult;
  private Position _curParsePos;
  private Token rootToken;

  //Parser Associations
  private List<Rule> rules;
  private List<Couple> couples;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Parser(String aName)
  {
    filename = null;
    name = aName;
    grammarRules = new ArrayList<String>();
    parseResult = new ParseResult(true);
    _curParsePos = null;
    rootToken = reset();
    rules = new ArrayList<Rule>();
    couples = new ArrayList<Couple>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFilename(String aFilename)
  {
    boolean wasSet = false;
    filename = aFilename;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addGrammarRule(String aGrammarRule)
  {
    boolean wasAdded = false;
    wasAdded = grammarRules.add(aGrammarRule);
    return wasAdded;
  }

  public boolean removeGrammarRule(String aGrammarRule)
  {
    boolean wasRemoved = false;
    wasRemoved = grammarRules.remove(aGrammarRule);
    return wasRemoved;
  }

  public boolean setParseResult(ParseResult aParseResult)
  {
    boolean wasSet = false;
    parseResult = aParseResult;
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

  /**
   * The Umple file (.ump) that will be parsed.
   */
  public String getFilename()
  {
    return filename;
  }

  /**
   * default 'program'
   */
  public String getName()
  {
    return name;
  }
  /* Code from template attribute_GetMany */
  public String getGrammarRule(int index)
  {
    String aGrammarRule = grammarRules.get(index);
    return aGrammarRule;
  }

  public String[] getGrammarRules()
  {
    String[] newGrammarRules = grammarRules.toArray(new String[grammarRules.size()]);
    return newGrammarRules;
  }

  public int numberOfGrammarRules()
  {
    int number = grammarRules.size();
    return number;
  }

  public boolean hasGrammarRules()
  {
    boolean has = grammarRules.size() > 0;
    return has;
  }

  public int indexOfGrammarRule(String aGrammarRule)
  {
    int index = grammarRules.indexOf(aGrammarRule);
    return index;
  }

  /**
   * The results of the parsing, and any errors/warning messages will be stored here.
   */
  public ParseResult getParseResult()
  {
    return parseResult;
  }

  /**
   * Every parser makes use of "tokens" that are built up based on what is parsed.  In the end it looks almost like a "tree".
   * This is the starting token for which everything will be built off of (sub-tokens).
   */
  public Token getRootToken()
  {
    return rootToken;
  }
  /* Code from template association_GetMany */
  public Rule getRule(int index)
  {
    Rule aRule = rules.get(index);
    return aRule;
  }

  /**
   * A parser can have many "rules", likewise each rule can be part of many "parsers"; hence many-to-many.
   */
  public List<Rule> getRules()
  {
    List<Rule> newRules = Collections.unmodifiableList(rules);
    return newRules;
  }

  public int numberOfRules()
  {
    int number = rules.size();
    return number;
  }

  public boolean hasRules()
  {
    boolean has = rules.size() > 0;
    return has;
  }

  public int indexOfRule(Rule aRule)
  {
    int index = rules.indexOf(aRule);
    return index;
  }
  /* Code from template association_GetMany */
  public Couple getCouple(int index)
  {
    Couple aCouple = couples.get(index);
    return aCouple;
  }

  public List<Couple> getCouples()
  {
    List<Couple> newCouples = Collections.unmodifiableList(couples);
    return newCouples;
  }

  public int numberOfCouples()
  {
    int number = couples.size();
    return number;
  }

  public boolean hasCouples()
  {
    boolean has = couples.size() > 0;
    return has;
  }

  public int indexOfCouple(Couple aCouple)
  {
    int index = couples.indexOf(aCouple);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRules()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addRule(Rule aRule)
  {
    boolean wasAdded = false;
    if (rules.contains(aRule)) { return false; }
    rules.add(aRule);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeRule(Rule aRule)
  {
    boolean wasRemoved = false;
    if (rules.contains(aRule))
    {
      rules.remove(aRule);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRuleAt(Rule aRule, int index)
  {  
    boolean wasAdded = false;
    if(addRule(aRule))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRules()) { index = numberOfRules() - 1; }
      rules.remove(aRule);
      rules.add(index, aRule);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRuleAt(Rule aRule, int index)
  {
    boolean wasAdded = false;
    if(rules.contains(aRule))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRules()) { index = numberOfRules() - 1; }
      rules.remove(aRule);
      rules.add(index, aRule);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRuleAt(aRule, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCouples()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addCouple(Couple aCouple)
  {
    boolean wasAdded = false;
    if (couples.contains(aCouple)) { return false; }
    couples.add(aCouple);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCouple(Couple aCouple)
  {
    boolean wasRemoved = false;
    if (couples.contains(aCouple))
    {
      couples.remove(aCouple);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCoupleAt(Couple aCouple, int index)
  {  
    boolean wasAdded = false;
    if(addCouple(aCouple))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCouples()) { index = numberOfCouples() - 1; }
      couples.remove(aCouple);
      couples.add(index, aCouple);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCoupleAt(Couple aCouple, int index)
  {
    boolean wasAdded = false;
    if(couples.contains(aCouple))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCouples()) { index = numberOfCouples() - 1; }
      couples.remove(aCouple);
      couples.add(index, aCouple);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCoupleAt(aCouple, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    rules.clear();
    couples.clear();
  }


  /**
   * Constructor.
   * 
   * @param aFilename The Umple file (.ump) that the parser will parse.
   * @param aName The name of the parser, typically "UmpleInternalParser" or "innerParser".
   */
  // line 364 "../../../../src/Parser_Code.ump"
   public  Parser(String aFilename, String aName){
    filename = aFilename;
    name = aName;
    grammarRules = new ArrayList<String>();
    parseResult = new ParseResult(true);
    rootToken = reset();
    rules = new ArrayList<Rule>();
    couples = new ArrayList<Couple>();
  }

  // line 376 "../../../../src/Parser_Code.ump"
   public Token reset(){
    rootToken = new Token(getName(),"ROOT", new Position(filename,1,0,0));
    return rootToken;
  }

  // line 382 "../../../../src/Parser_Code.ump"
   public Rule getRule(String ruleName){
    for (Rule r : rules)
    {
      if (r.getName().equals(ruleName))
      {
        return r;
      }
    }
    return null;
  }

  // line 394 "../../../../src/Parser_Code.ump"
   public String toString(){
    StringBuffer answer = new StringBuffer();
    toString(answer,rootToken);
    return answer.toString();
  }

  // line 401 "../../../../src/Parser_Code.ump"
   public String toGrammarNoStyle(){
    StringBuilder answer = new StringBuilder();
    for(String rule : grammarRules)
    {
      if (answer.length() > 0)
      {
        answer.append("<br />\n");
      }

      String cleanedUpRule = rule;
      cleanedUpRule = cleanedUpRule.replace("OPEN_ROUND_BRACKET", "-(");
      cleanedUpRule = cleanedUpRule.replace("CLOSE_ROUND_BRACKET", "-)");
      cleanedUpRule = cleanedUpRule.replace("DOUBLE_OR_BARS", "-||");
      answer.append(cleanedUpRule);
    }
    return answer.toString();
  }


  /**
   * Used to generate a nice html representation for the user manual
   */
  // line 421 "../../../../src/Parser_Code.ump"
   public String toGrammar(){
    return toGrammarParts("");
  }

  // line 427 "../../../../src/Parser_Code.ump"
   private String cleanupRule(String cleanedUpRule){
    int ruleLength = cleanedUpRule.length();
    // Ensure that rules with angle brackets appear correctly.
    cleanedUpRule = cleanedUpRule.replaceAll("<", "&lt;");
    cleanedUpRule = cleanedUpRule.replaceAll(">", "&gt;");
    
    // Replace all references to rules using [[ ]] with links to the rules 
    cleanedUpRule = cleanedUpRule.replaceAll("\\Q[[\\E([a-zA-Z_]*)\\Q]]\\E", "[[<a href=\"UmpleGrammar.html#$1\">$1</a>]]");
    
    // Colour all named identifiers such as [name] green
    cleanedUpRule = cleanedUpRule.replaceAll("(\\Q[\\E~?)([a-zA-Z_]+)\\Q]\\E", "$1<font color=\"green\">$2</font>]");
    
    // Colour all named identifiers such as "bound" in [!bound:\d+|[*]] green
    cleanedUpRule = cleanedUpRule.replaceAll("(\\Q[\\E!)([a-zA-Z_]+)\\Q:\\d+|[*]]\\E", "$1<font color=\"green\">$2</font>:\\\\d+|[*]]");       
    // Colour all named identifiers such as "bound" in [=bound:*] green
    cleanedUpRule = cleanedUpRule.replaceAll("(\\Q[\\E=)([a-zA-Z_]+)\\Q:*\\E", "$1<font color=\"green\">$2</font>:*");
    
    // Colour pairs of identifiers green (where one or both may be supplied
    cleanedUpRule = cleanedUpRule.replaceAll("(\\Q[\\E)([a-zA-Z_]+),([a-zA-Z_]+)", "$1<font color=\"green\">$2</font>,<font color=\"green\">$3</font>");
    
    // Colour constant strings (i.e. keywords) and explicit special characters red
    cleanedUpRule = cleanedUpRule.replaceAll("([(]|\\s)([a-zA-Z_{}.,:;\\-\\\"<>]+|/|//|/\\*|\\*/|\\[|\\])(\\s|$|[)])", "$1<font color=\"red\">$2</font>$3");

    // There are a couple of places with parens that need making red
    cleanedUpRule = cleanedUpRule.replaceAll("(\\s)([{}]|OPEN_ROUND_BRACKET)(\\s)", "$1<font color=\"red\">$2</font>$3");
    
    // Colour constant strings sets such as [=modifier:immutable|settable] red
    cleanedUpRule = cleanedUpRule.replaceAll("([\\[]=[a-zA-Z]*:|[|])([A-Za-z\\-+<>*]+)", "$1<font color=\"red\">$2</font>");
                
    // Colour special case [=list:[]] red
    cleanedUpRule = cleanedUpRule.replaceAll("([\\[]=[a-zA-Z]*:)\\Q[]\\E", "$1<font color=\"red\">[]</font>");
                
    // Colour special constants such as [=debug] red 
    cleanedUpRule = cleanedUpRule.replaceAll("[\\[]=([a-zA-Z_]*)[\\]]", "[=<font color=\"red\">$1</font>]");
    
    // Colour arbitrary text blocks dirty yellow [**stuff] or [**stuff:xx]
    cleanedUpRule = cleanedUpRule.replaceAll("[\\[][*][*]?([a-zA-Z_]*)([:].*)?[\\]]", "[**<font color=\"#AAAA22\">$1</font>$2]");

    // Revert changes made during rule parsing
    cleanedUpRule = cleanedUpRule.replace("OPEN_ROUND_BRACKET", "(");
    cleanedUpRule = cleanedUpRule.replace("CLOSE_ROUND_BRACKET", ")");
    cleanedUpRule = cleanedUpRule.replace("DOUBLE_OR_BARS", "||");

    
    // If long rule, then indent on any 'or'
    if(ruleLength > 80) {
      int currentLength = cleanedUpRule.length();
      // Replace ! in main rule
      cleanedUpRule = cleanedUpRule.replaceAll("\\s[|]\\s", "\n<br/>&nbsp;&nbsp;&nbsp;&nbsp| ");
      
      // Replace | in substrings if no changes made above
      if(currentLength == cleanedUpRule.length()) {
        cleanedUpRule = cleanedUpRule.replaceAll("[|]", "\n<br/>&nbsp;&nbsp;&nbsp;&nbsp|");
      }
    }
    
    return cleanedUpRule;
  }

  // line 487 "../../../../src/Parser_Code.ump"
   public String toGrammarParts(String rulesToOutput){
    StringBuilder answer = new StringBuilder();
    StringBuilder queuedComments = new StringBuilder();
    for(String rule : grammarRules)
    {
      // There are three possible 'rule' types

      // Blank line, do nothing except output any queued comments
      if (rule.length() == 0)
      {
        if (rulesToOutput.length() == 0) {  // only output for complete grammar
          answer.append(queuedComments.toString());
          answer.append("<br />\n");
        }
        queuedComments = new StringBuilder();  // throw away comments so far
      }
      else if (rule.length() >= 2 && rule.charAt(0) == '/' &&  rule.charAt(1) == '/')
      {
        // Comment - queue it for possible outputting when a space or non-comment is found
        // Skip items in the grammar marked 'TODO'
        if(!rule.matches("\\Q//TODO\\E.*"))
        {
          queuedComments.append("<br />\n<font color=\"brown\">");
          // Replace URLs in [* *] by links to them
          String commentInterior=rule.replaceAll("\\Q[*http\\E(.*)\\Q*]\\E","<a style=\"color: brown\" href=\"http$1\">http$1</a>");
          // Replace user manual refs by links to the local copy of the UM
          commentInterior=commentInterior.replaceAll("\\Q[*\\E(.*)\\Q*]\\E","<a style=\"color: brown\" href=\"$1.html\">$1</a>");
          queuedComments.append(commentInterior);
          queuedComments.append("</font>");
        }
      }
      else
      {
        // Should be a rule name, find name of it then format
        String[] splitRule = rule.split(":",2);
        if(splitRule[0].length() != 0) {
          // We seem to have a valid rule

          // Determine if there is a minus sign indicating a rule
          // whose name will not appear in the parse tree
          // or a hash symbol for a rule that eats all content
          int hasMinus = (splitRule[0]).charAt(splitRule[0].length()-2) == '-'? 1 : 0;
          int hasHash = (splitRule[0]).charAt(splitRule[0].length()-2) == '#'? 1 : 0;
          String ruleName = 
            (splitRule[0]).substring(0,(splitRule[0]).length()-1-hasMinus-hasHash);
          
          if(rulesToOutput.length() == 0 || rulesToOutput.contains("[["+ruleName+"]]"))
          {
            // We are to output the rule since we are outputting all
            // or it was listed in rulesToOutput
            String cleanedUpRule = cleanupRule(splitRule[1]);

            // Output the rule nicely

            // Start by outputting any queued comments (if there are any)
            answer.append(queuedComments.toString());                 
            
            answer.append("<br />\n<a name=\"");
            answer.append(ruleName);  // anchor to link to
            answer.append("\" ></a>"); 
          
            answer.append("<b><font color=\"#2E64FE\">");
            answer.append(ruleName);  // displayed name
            answer.append("</font></b>");

            if(hasMinus == 1) answer.append("-");
            if(hasHash == 1) answer.append("#");
            answer.append(" :");
            
            answer.append(cleanedUpRule);
            answer.append("<br />\n");
            
          } // End outputting rule
          queuedComments = new StringBuilder(); // clear them whether or not output
        }
        else {
          System.out.println("UNPROCESSABLE RULE in grammar when generating manual in Parser_Code.ump. Rule="+rule);
        }
      }
    } // end for loop of every line in the rule file
    return answer.toString();
  }


  /**
   * Output the parse tree. The code originally here has been refactored to Token class
   */
  // line 572 "../../../../src/Parser_Code.ump"
   public StringBuffer toString(StringBuffer stringSoFar, Token currentToken){
    return currentToken.toString(stringSoFar,rootToken);
  }

  // line 577 "../../../../src/Parser_Code.ump"
   public int addRulesInFile(String filenameOrResourcePath){
    InputStream resourceStream = null;
    String nextRule = null;
    BufferedReader reader = null;
    int numberOfRulesProcessed = 0;
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

      nextRule = null;
      do 
      {
        nextRule = reader.readLine();
        if (nextRule == null)
        {
          continue;
        }
        nextRule = nextRule.trim();
        if (nextRule.startsWith("//") || nextRule.startsWith("#") || nextRule.equals(""))
        {
          addGrammarRule(nextRule);
        }
        else
        {
          addRule(nextRule);
          numberOfRulesProcessed += 1;
        }
      } 
      while (nextRule != null);
    }
    catch (Exception e)
    {
        System.out.println("Exception processing grammar rule in"+filenameOrResourcePath+" Failing Rule Number = "+numberOfRulesProcessed+1+" Likely no space before colon or space after rule before -. \n Rule="+((nextRule==null)?"null":nextRule));
    }
    finally
    {
      if(reader != null){
        try{
          reader.close();
        }catch (IOException e){
          throw new IllegalStateException("Error closing reader", e);
        }
      }
      if(resourceStream != null){
        try{
          resourceStream.close();
        }catch (IOException e){
          throw new IllegalStateException("Error closing resourceStream", e);
        }
      }
    }
    return numberOfRulesProcessed;
  }

  // line 640 "../../../../src/Parser_Code.ump"
   public void addRule(String input){
    input = input.replace("-(","OPEN_ROUND_BRACKET");
    input = input.replace("-)","CLOSE_ROUND_BRACKET");
    input = input.replace("-||","DOUBLE_OR_BARS");

    grammarRules.add(input);
    TextParser ruleParser = new TextParser(input);
    String name = ruleParser.next();
    boolean shouldHide = false;
    if (name.endsWith("-"))
    {
      shouldHide = true;
      name = name.substring(0,name.length() - 1);
    }

    ruleParser.nextAt(":");
    int startIndex = ruleParser.previousIndex();

    int index = 0;
    Parser innerParser = new Parser("innerParser");
    while (ruleParser.lookFor("(",")",true) != null)
    {
      String anonymousRuleName = "anonymous::" + name + "::" + (++index);
      String anonymousRuleDefinition = ruleParser.name().substring(1,ruleParser.name().length() - 1).trim();
      innerParser.addRule(anonymousRuleName + "- : " + anonymousRuleDefinition);
      ruleParser.replace("[[" + anonymousRuleName + "]]");
    }
    ruleParser.reset(startIndex);
    ruleParser.nextAt(":");

    Rule newRule = new Rule(name);
    newRule.setShouldHide(shouldHide);
    while (ruleParser.nextUntil(false,"|") != null)
    {
      String definition = ruleParser.name();
      int innerStartIndex = ruleParser.previousIndex();
      while (isWithinVariable(definition))
      {
        ruleParser.nextAfter("]");
        ruleParser.nextUntil(false,"|");
        definition = ruleParser.extractFrom(innerStartIndex);
      }
      definition = definition.replace("OPEN_ROUND_BRACKET","(");
      definition = definition.replace("CLOSE_ROUND_BRACKET",")");
      definition = definition.replace("DOUBLE_OR_BARS","||");
      newRule.addDefinition(definition);
      ruleParser.nextAt("|");
    }
    rules.add(newRule);
    rules.addAll(innerParser.rules);
  }


  /**
   * 
   * Parses input based on a rule.
   * 
   * @param ruleName The rule to parse based on.
   * @param input The textual input to parse (such as that from the Umple file).
   * 
   * @return The result of the parsing.
   */
  // line 701 "../../../../src/Parser_Code.ump"
   public ParseResult parse(String ruleName, String input){
    // Create a new instance of a text parser to parse the input from the Umple file.
    TextParser inputParser = new TextParser(filename, input);

    // Initialize the parse result.
    parseResult.setPosition(inputParser.currentPosition());

    _curParsePos = inputParser.currentPosition();

    // Parse the input and store whether or not it was successful in doing so.  As its parsing it will build up a hierarchy of tokens.
    boolean didParse = parse(ruleName, inputParser, rootToken, 0);

    parseResult.setWasSuccess(didParse);

    return parseResult;
  }


  /**
   * 
   * Parses input initialized into a textual parser and builds up a tree-like structure of tokens representing what was parsed.
   * 
   * It is VERY important to know this method, as its extremely vital to where a significant amount of parsing is done.
   * 
   * @param ruleName The rule to begin parsing off of.
   * @param inputParser The textual parser that is initialized to start parsing input from a pre-determined Umple file.
   * @param parentToken The current token, that will be built off of.
   * @param level The level The current level the parser is at (related to the token tree).
   * 
   * @return True if the input was successfully parsed, false otherwise.
   */
  // line 731 "../../../../src/Parser_Code.ump"
   private boolean parse(String ruleName, TextParser inputParser, Token parentToken, int level, String... stopAts){
    // Go through each rule.
    for (Rule r : rules)
    {
      if (!r.getName().equals(ruleName))
      {
        continue;
      }

      // Create a new empty token that will later on be populated based on what is parsed as things get parsed and added to the token tree.
      Token currentToken = null;

      if (r.getShouldHide())
      {
        currentToken = parentToken;
      }
      else
      {
        currentToken = new Token(ruleName,"START_TOKEN",inputParser.currentPosition().copy()); 
      }

      // Go through each definition, from the current rule.
      for (String definition : r.getDefinitions())
      {
        int currentTokenSize = currentToken.numberOfSubTokens();

        // Assume the parsing will succeed and prove otherwise (if theres an error).
        boolean isSucceeding = true;

        // Store where the input parser currently is on the text so that if an error occurs later we can reset to this spot.
        int savedIndex = inputParser.currentIndex();

        RuleInstance instance = new RuleInstance(this);
        instance.configureDefinition(definition, stopAts);

        // As long as there are more sub parts to the rule, parse based on them.
        while (instance.hasMoreRuleParts())
        {
          Position startTokenPosition = inputParser.currentPosition().copy();

          // Store the current rule from the rule instance which will be used to determine how the parsing proceeds.
          RulePart part = instance.nextRulePart();

          String currentRule = part.getName();

          if (part.isStatic())
          {
            String inputValue = inputParser.nextAt(currentRule);
            if (inputValue == null)
            { 
              isSucceeding = false;
              break;
            }

            // Add what we just parsed (the value of what was parsed that was a "static") as a subtoken of our current token.
            // Essentially build up the token tree.
            currentToken.addSubToken(new Token(inputValue, "STATIC", startTokenPosition));

            // Update the parsers position in the input (from the textual parser) as well as store this information in the parsing result.
            _curParsePos = inputParser.currentPosition();
            parseResult.setPosition(inputParser.currentPosition());
          }
          // This is where most of the work is done, a variable is essentially any "content" of a rule/definition.
          // (ex. The rule could be an "inlineComment"  and the actual "part" (if its variable) is the content associated for it.
          else if (part.isVariable())
          {
            String value = null;
            int startIndex = inputParser.currentIndex();

            // Only proceed to check for an empty comment if it is possible that we could have just had one.
            if (startIndex >= 3 && currentRule.equals("*inlineComment"))
            {
              String lastThree = inputParser.getText().substring(startIndex - 3, startIndex);

              // Empty comment in the most basic form.  Ignore looking for a complete comment since there is none, go to next definition.
              if (lastThree.equals("//\n"))
              {
                continue;
              }
              // Empty comment with spaces.  Ignore looking for a complete comment since there is none, go to next definition.
              else if (lastThree.charAt(2) == '\n')
              {
                continue;
              }
            }

            // Only proceed to check for an empty multiLine comment if it is possible that we could have just had one.
            if (startIndex >= 2 && currentRule.equals("**multilineComment"))
            {
              boolean emptyMultiLineComment = false;

              String testString = inputParser.getText();

              // Starting where the input parser currently is, look ahead to see if this is an empty multiLine comment.
              for (int i = startIndex; i < testString.length() - 2 && emptyMultiLineComment == false; i++)
              {
                if (testString.substring(i, i + 2).equals("*/"))
                {
                  emptyMultiLineComment = true;
                }
                else if (!testString.substring(i, i + 1).equals("\n") && !testString.substring(i, i + 1).equals(" "))
                {
                  break;
                }
              }

              // Since an empty multiLine comment was found, ignore looking for a complete comment since there is none.
              if (emptyMultiLineComment) continue;
            }

            if (part.isToEndOfLine())
            {
              value = inputParser.nextLine();
            }
            else if (part.getNextIdentifiers().length > 0)
            {
              boolean stopAtSpace = !part.isMultiWord() && !part.hasInnerNames();
              boolean isAlphaNumeric = part.isAlphanumeric();
              value = inputParser.nextUntil(stopAtSpace, isAlphaNumeric, part.getNextIdentifiers());


              while (part.isMultiWord() && !isBalanced(value))
              {
                int internalIndex = inputParser.currentIndex();
                inputParser.nextAt(part.getNextIdentifiers());
                String nextValue = inputParser.nextUntil(stopAtSpace,part.getNextIdentifiers());

                if (inputParser.peekAt(part.getNextIdentifiers()) == null)
                {
                  inputParser.reset(internalIndex);
                  break;
                }

                value = inputParser.extractFrom(startIndex);
                if (nextValue == null && inputParser.peekAt(part.getNextIdentifiers()) == null)
                {
                  break;
                }
              }
            }
            else if (part.isMultiWord())
            {
              value = inputParser.nextUntil(false,(String[])null);
            }
            else
            {
              value = inputParser.next();
            }
            
            if (part.isEnum() && !part.isEnumValue(value))
            {
              value = null;
            }
            
            if (part.isRegex() && !part.regexMatches(value))
            {
              value = null;
            }
            if (part.hasInnerNames() && !part.isValidInnerValues(value))
            {
              value = null;
            }

            if (value == null && part.isOne())
            {
              isSucceeding = instance.removeOptionalPart();
              if (isSucceeding)
              {
                instance.resetRulePart();

                // Back up the textual parser to the saved index since something went wrong.
                restorePrevious(inputParser,savedIndex,currentToken,currentTokenSize);
                continue;
              }
              else
              {
                break;
              }
            }
            else if (value == null)
            {
              instance.removeRulePart(part);
              instance.resetRulePart();

              // Back up the textual parser to the saved index since something went wrong.
              restorePrevious(inputParser,savedIndex,currentToken,currentTokenSize);
              continue;
            }

            if (part.hasInnerNames())
            {
              RulePartValue[] allValues = part.getInnerValues(value);
              for (int innerI=0; innerI<allValues.length; innerI++)
              {
                String innerValue = allValues[innerI].getValue();
                if (innerValue == null)
                {
                  continue;
                }
                String innerName = allValues[innerI].getName();
                Position innerPosition = allValues[innerI].getPosition();

                // Update the token tree, create a new token based on what was just parsed and add it to the tree.
                currentToken.addSubToken(new Token(innerName,innerValue, startTokenPosition.add(innerPosition)));
              }
            }
            else
            {
              // Update the token tree, create a new token based on what was just parsed and add it to the tree.
              currentToken.addSubToken(new Token(part.getDisplayName(), value, startTokenPosition));
            }
          }
          else if (part.isRule())
          {
            if (part.isOne())
            {
              isSucceeding = parse(part.getName(),inputParser,currentToken,level+1,part.getNextIdentifiers());
            }
            else if (part.isOptional())
            {
              isSucceeding = true;
              boolean didParse = parse(part.getName(),inputParser,currentToken,level+1,part.getNextIdentifiers());
              if (!didParse)
              {
                instance.removeRulePart(part);
                instance.resetRulePart();

                // Back up the textual parser to the saved index since something went wrong.
                restorePrevious(inputParser,savedIndex,currentToken,currentTokenSize);
                continue;
              }
            }
            else if (part.isMany())
            {
              int maxFound = part.getMaximumPartsFound();
              if (maxFound == 0)
              {
                instance.removeRulePart(part);
                instance.resetRulePart();

                // Back up the textual parser to the saved index since something went wrong.
                restorePrevious(inputParser,savedIndex,currentToken,currentTokenSize);
                continue;
              }

              isSucceeding = true;
              int numberFoundSoFar = 0;
              while (part.isWithinLimits(numberFoundSoFar) && parse(part.getName(),inputParser,currentToken,level+1,part.getNextIdentifiers()))
              {
                numberFoundSoFar += 1;
              }
              part.setMaximumPartsFound(numberFoundSoFar - 2);
            }
          }
        }

        // If there is currently a problem parsing (error, etc) back up the textual input parser.
        if (!isSucceeding)
        {
          // Back up the textual parser to the saved index since something went wrong.
          restorePrevious(inputParser,savedIndex,currentToken,currentTokenSize);
        }
        else if (inputParser.peek() != null && level == 0)
        {
          String badWord = inputParser.peek();
          int messageNumber = 1500;
          // Back up the textual parser to the saved index since something went wrong.
          restorePrevious(inputParser,savedIndex,currentToken,currentTokenSize);

          // Since there was a critical error, store an error message in the parsing result.
          if("generate".equals(badWord) || "use".equals(badWord) || "strictness".equals(badWord) || "traceType".equals(badWord)) {
            messageNumber=1501;
          }
          else if("class".equals(badWord) || "association".equals(badWord) || "interface".equals(badWord) || "external".equals(badWord) || "associationClass".equals(badWord) || "stateMachine".equals(badWord)) {
            messageNumber=1502;
          }
          parseResult.addErrorMessage(new ErrorMessage(messageNumber, _curParsePos, badWord));

          return false;
        }
        // Otherwise if everything is okay we will add what we have parsed (which should be in a token by now) to the "parent/root" token.
        else
        {
          if (!r.getShouldHide())
          {
            // Update the token tree, add the current token to the parent.
            // but first, record the end position of the token for later analysis
            inputParser.backUpWhitespace();
            currentToken.setEndPosition(inputParser.currentPosition(false).copy());
            inputParser.skipWhitespace();
            
            parentToken.addSubToken(currentToken);

          }
          return true;
        }
      }
    }

    return false;
  }

  // line 1034 "../../../../src/Parser_Code.ump"
   private void restorePrevious(TextParser inputParser, int savedIndex, Token currentToken, int size){
    inputParser.reset(savedIndex);
    while (size < currentToken.numberOfSubTokens())
    {
      currentToken.remove(size);
    }
  }

  // line 1043 "../../../../src/Parser_Code.ump"
   private boolean isWithinVariable(String definition){
    int openBracket = definition.lastIndexOf("[");
    int closeBracket = definition.lastIndexOf("]");
    return openBracket > closeBracket;
  }


  /**
   * Return the location of the matched quote.
   */
  // line 1051 "../../../../src/Parser_Code.ump"
   private int findMatchingQuote(char [] chars, char quote, int start){
    if(chars[start] != quote) {
      return start;
    }
    int i;
    for(i = start + 1; i < chars.length && chars[i] != quote; i++) {
      if(chars[i] == '\\') {
        //Escape the next character
        i++;
      }
    }
    return i;
  }


  /**
   * Return the location of the next newline
   */
  // line 1066 "../../../../src/Parser_Code.ump"
   private int findNewline(char [] chars, int start){
    int i;
    for(i = start; i < chars.length && chars[i] != '\n'; i++) {}
    return i;
  }


  /**
   * Return the location of the closing c-style comment.
   */
  // line 1074 "../../../../src/Parser_Code.ump"
   private int findCloseComment(char [] chars, int start){
    int i;
    for(i = start; i < chars.length - 1 && !(chars[i] == '*' && chars[i+1] == '/'); i++) {}
    return i + 1;
  }

  // line 1081 "../../../../src/Parser_Code.ump"
   private boolean isBalanced(String input){
    if(input == null){
      return true;
    }
    int braces = 0;
    char[] chars = input.toCharArray();
    for(int i=0; i < chars.length; i++){
      if(chars[i]== '{' ){
        braces++;
      }
      else if(chars[i] == '}'){
        braces--;
      }
      else if(chars[i] == '\"' || chars[i] == '\''){
        i = findMatchingQuote(chars, chars[i], i);
        if(i == chars.length) {
          //Unclosed quote
          return false;
        }
      }
      else if(i < chars.length - 1 && chars[i] == '/'){
        if(chars[i+1] == '/'){
          i = findNewline(chars, i);
        }
        else if(chars[i+1] == '*'){
          i = findCloseComment(chars, i);
          if(i == chars.length) {
            //Unclosed comment
            return false;
          }
        }
      }
    }
    return braces == 0;
  }

  // line 1118 "../../../../src/Parser_Code.ump"
   public Token getToken(int index){
    return rootToken.getSubToken(index);
  }

  // line 1123 "../../../../src/Parser_Code.ump"
   public List<Token> getTokens(){
    return rootToken.getSubTokens();
  }

  // line 1128 "../../../../src/Parser_Code.ump"
   public int numberOfTokens(){
    return rootToken.numberOfSubTokens();
  }

  // line 1133 "../../../../src/Parser_Code.ump"
   public boolean hasTokens(){
    return numberOfTokens() > 0;
  }

  // line 1138 "../../../../src/Parser_Code.ump"
   public int indexOf(Token aToken){
    return rootToken.indexOfSubToken(aToken);
  }

}
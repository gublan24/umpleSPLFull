/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.rules;
import java.util.*;
import cruise.umple.parser.Token;
import cruise.umple.parser.Position;
import cruise.umple.parser.analysis.*;

/**
 * name : [[rule]] ( | [[rule]] )*
 * The basic parsing rule. Contains the neccassary components for most other parsing rules to function.
 * The basic structure is 1 -> * Rules.
 * Its own parse rule choses one of its sub-rules, and tries to parse that one(it does this in order, so it tries sub rule 0 first and 1 second and so on)
 * Parsing has three basic components, success of sub rules, token construction and then returning the new parse position
 * Success of subrules in the case of a Choice Rule is dependent on at least one sub rule being successful(not returning -1)
 */
// line 11 "../../../../../src/ParsingRules.ump"
// line 1 "../../../../../src/ParsingRules_Code.ump"
public class ChoiceRule
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ChoiceRule Attributes
  private String name;
  private boolean negate;
  private ParserAction action;
  private ChoiceRule parent;
  private List<ChoiceRule> rules;
  private boolean dontDelete;
  private boolean optional;
  private StringBuilder firstValueBuilder;
  private boolean declared;
  private boolean reset;
  private boolean noSpaces;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ChoiceRule(String aName)
  {
    name = aName;
    negate = false;
    action = null;
    parent = null;
    rules = new ArrayList<ChoiceRule>();
    dontDelete = false;
    optional = false;
    firstValueBuilder = null;
    declared = false;
    reset = false;
    noSpaces = false;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setNegate(boolean aNegate)
  {
    boolean wasSet = false;
    negate = aNegate;
    wasSet = true;
    return wasSet;
  }

  public boolean setAction(ParserAction aAction)
  {
    boolean wasSet = false;
    action = aAction;
    wasSet = true;
    return wasSet;
  }

  public boolean setParent(ChoiceRule aParent)
  {
    boolean wasSet = false;
    parent = aParent;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addRule(ChoiceRule aRule)
  {
    boolean wasAdded = false;
    wasAdded = rules.add(aRule);
    return wasAdded;
  }

  public boolean removeRule(ChoiceRule aRule)
  {
    boolean wasRemoved = false;
    wasRemoved = rules.remove(aRule);
    return wasRemoved;
  }

  public boolean setDontDelete(boolean aDontDelete)
  {
    boolean wasSet = false;
    dontDelete = aDontDelete;
    wasSet = true;
    return wasSet;
  }

  public boolean setOptional(boolean aOptional)
  {
    boolean wasSet = false;
    optional = aOptional;
    wasSet = true;
    return wasSet;
  }

  public boolean setFirstValueBuilder(StringBuilder aFirstValueBuilder)
  {
    boolean wasSet = false;
    firstValueBuilder = aFirstValueBuilder;
    wasSet = true;
    return wasSet;
  }

  public boolean setDeclared(boolean aDeclared)
  {
    boolean wasSet = false;
    declared = aDeclared;
    wasSet = true;
    return wasSet;
  }

  public boolean setReset(boolean aReset)
  {
    boolean wasSet = false;
    reset = aReset;
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

  public String getName()
  {
    return name;
  }

  public boolean getNegate()
  {
    return negate;
  }

  public ParserAction getAction()
  {
    return action;
  }

  public ChoiceRule getParent()
  {
    return parent;
  }
  /* Code from template attribute_GetMany */
  public ChoiceRule getRule(int index)
  {
    ChoiceRule aRule = rules.get(index);
    return aRule;
  }

  public ChoiceRule[] getRules()
  {
    ChoiceRule[] newRules = rules.toArray(new ChoiceRule[rules.size()]);
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

  public int indexOfRule(ChoiceRule aRule)
  {
    int index = rules.indexOf(aRule);
    return index;
  }

  public boolean getDontDelete()
  {
    return dontDelete;
  }

  public boolean getOptional()
  {
    return optional;
  }

  public StringBuilder getFirstValueBuilder()
  {
    return firstValueBuilder;
  }

  public boolean getDeclared()
  {
    return declared;
  }

  public boolean getReset()
  {
    return reset;
  }

  public boolean getNoSpaces()
  {
    return noSpaces;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNoSpaces()
  {
    return noSpaces;
  }

  public void delete()
  {}


  /**
   * For ease of use the ... is used here to help the user to input sub rules
   */
  // line 8 "../../../../../src/ParsingRules_Code.ump"
   public  ChoiceRule(String name, ChoiceRule... rules){
    this(name);
    for(ChoiceRule rule:rules)
    {
      this.add(rule);
    }
  }


  /**
   * Add sub rule
   */
  // line 19 "../../../../../src/ParsingRules_Code.ump"
   public boolean add(ChoiceRule rule){
    if(rule.parent==null)
    {
      rule.parent = this;
    }
    return rules.add(rule);
  }


  /**
   * Add sub rule at specific index
   */
  // line 30 "../../../../../src/ParsingRules_Code.ump"
   public void add(int i, ChoiceRule rule){
    if(rule.parent==null)
    {
      rule.parent = this;
    }
    rule.setNoSpaces(getNoSpaces());
    rules.add(i,rule);
  }


  /**
   * Get sub rule
   */
  // line 42 "../../../../../src/ParsingRules_Code.ump"
   public ChoiceRule get(int index){
    if(index<rules.size())
    {
      return rules.get(index);
    }
    if(subrules!=null)
    {
      synchronized(RuleBasedParser.choicerules)
      {
        if(RuleBasedParser.choicerules.get(subrules[index])!=null)
        {
          if(index==rules.size())
          {
            rules.add(RuleBasedParser.choicerules.get(subrules[index]));
          }
	      return RuleBasedParser.choicerules.get(subrules[index]);
	    }
	    else 
	    {
          RuleBasedParser.evaluate(subrules[index]);
          if(index==rules.size())
          {
            rules.add(RuleBasedParser.choicerules.get(subrules[index]));
          }
	      return RuleBasedParser.choicerules.get(subrules[index]);
	    }
	  }
	}
	else
	{
	  return null;
	}
  }


  /**
   * Remove sub rule at specific index
   */
  // line 79 "../../../../../src/ParsingRules_Code.ump"
   public ChoiceRule remove(int index){
    return rules.remove(index);
  }


  /**
   * Index of sub rule
   */
  // line 86 "../../../../../src/ParsingRules_Code.ump"
   public int indexOf(ChoiceRule rule){
    return rules.indexOf(rule);
  }


  /**
   * Remove sub rule
   */
  // line 93 "../../../../../src/ParsingRules_Code.ump"
   public void remove(ChoiceRule rule){
    rules.remove(rule);
  }


  /**
   * Size of sub rules.
   */
  // line 100 "../../../../../src/ParsingRules_Code.ump"
   public int size(){
    if(subrules!=null)
    {
      return subrules.length;
    }
    else 
    {
      return rules.size();
    }
  }


  /**
   * Adds the self token to the parent token with the proper positions set for the self token.
   */
  // line 114 "../../../../../src/ParsingRules_Code.ump"
   public void addToken(Token parent, Token self, int from, int end, ParserDataPackage data){
    parent.addSubToken(self);
    
    self.setPosition(findPosition(from,data));
    self.setEndPosition(findPosition(end,data));
  }


  /**
   * Given an offset this function constructs the Position object using the ParserDataPackage's linenumbers hashmap
   */
  // line 124 "../../../../../src/ParsingRules_Code.ump"
   public Position findPosition(int lookfor, ParserDataPackage data){
    String input = data.getInput();
	while(lookfor<input.length()-1&&(input.charAt(lookfor)+"").matches("\\s")){
		++lookfor;
	}
	if(lookfor>=input.length()){
	  lookfor=input.length()-1;
	}
    Set<Integer> keys = data.getLinenumbers().keySet();
    int offset = 0;
    int linenumber = 0;
    int offsetend = 0;
    int linenumberend = 0;
    int previous = 0;
    for(Integer key:keys)
    {
      if(key-1>=lookfor)
      {
        offset = lookfor-previous;
        linenumber = data.getLinenumbers().get(key);        
        break;
      }
      previous = key;
    }
    Boolean first = true;
    if(linenumber==0)
    {
      linenumber = 1;
      offset = lookfor;
      first = true;
    }
    return new Position(
        data.getFilename(),
        linenumber,
        offset,
        lookfor
        );
  }


  /**
   * For each sub token in the self token, this menthod adds it to the token Token
   */
  // line 166 "../../../../../src/ParsingRules_Code.ump"
   public void addAllTokens(Token token, Token self){
    for(int i=0;i<self.numberOfSubTokens();)
    {
      Token aSubToken = self.getSubToken(i);
      self.removeSubToken(aSubToken);
      token.addSubToken(aSubToken);
    }
  }


  /**
   * Tries to parse, if successful, will add a new Token to the token Token (if this rule is not negated). Returns the position where the parser
   * was able to get to. So, if the parse started at 9 and parsed the word "word" it would then be at 13 and would return that value.
   * If there is no sub rule which can parse the input, this function will return -1 to indicate a failure.
   */
  // line 180 "../../../../../src/ParsingRules_Code.ump"
   public int parse(Token token, int from, int max, String input, ParserDataPackage data){
    if(size()==0)
    {
      return from;
    }
    Token self = new Token(getName(),"START_TOKEN");
    for(int i=0;i<size();i++)
    {
      int parseResult = get(i).parse(self,from,max, input, data);
      if(parseResult!=-1)
      {
        if(!getNegate()&&from!=max)
        {
          addToken(token,self,from,parseResult,data);
        }
        else 
        {
          addAllTokens(token,self);
        }

        if(action!=null)
        {
          action.onSuccess(getNegate()?token:self,data);
        }
        return parseResult;
      }
      self = new Token(getName(),"START_TOKEN");
    }
    return -1;
  }


  /**
   * Don't cares are things like spaces and anonymous rules which are
   */
  // line 214 "../../../../../src/ParsingRules_Code.ump"
   public ChoiceRule dontCare(){
    negate = true;
    return this;
  }


  /**
   * Computes whether this Rule is optional or not by checking if any of the optional sub rules are optional
   */
  // line 222 "../../../../../src/ParsingRules_Code.ump"
   public boolean isOptional(){
    if(optional)
    {
      return true;
    }
    optional  = true;
    for(ChoiceRule rule:getRules())
    {
      if(rule.isOptional())
      {
        return true;
      }
    }
    optional = false;
    return false;
  }


  /**
   * This function works, however it never called because the recursive decent into the
   */
  // line 243 "../../../../../src/ParsingRules_Code.ump"
   public void optimize(){
    if(!dontDelete&&negate&&optimizeCondition())
    {
      int index = parent.indexOf(this);
      if(index!=-1)
      {
        parent.remove(index);
        parent.add(index,get(0));
      }
      else
      {
        dontDelete = true;
      }
    }
  }


  /**
   * This function is used in the optimize method to decide whether this rule should be deleted
   */
  // line 263 "../../../../../src/ParsingRules_Code.ump"
   public boolean optimizeCondition(){
    return size()==1;
  }


  /**
   * For finding the first value of the next terminal in the rule.
   * Within the context of a choice rule this means any of the choices are a possibility
   */
  // line 272 "../../../../../src/ParsingRules_Code.ump"
   public String getFirstValue(){
    if(firstValueBuilder!=null)
    {
      return firstValueBuilder.toString();
    }
    firstValueBuilder = new StringBuilder();
    String pipe = "";
    for(int i=0;i<size();i++)
    {
      firstValueBuilder.append(pipe+get(i).getFirstValue());
      pipe = "|";
    }
    return firstValueBuilder.toString();
  }

  // line 288 "../../../../../src/ParsingRules_Code.ump"
   public void resetDeclare(){
    if(reset)
    {
      return;
    }
    reset = true;
    for(ChoiceRule rule:getRules())
    {
      rule.resetDeclare();
    }
    declared = false;
    reset = false;
  }

  // line 302 "../../../../../src/ParsingRules_Code.ump"
   public StringBuilder toDeclareString(StringBuilder builder){
    if(declared)
    {
      return builder;
    }
    declared = true;
    builder.append(getName()+hashCode()+"\n");
    builder.append(getClass().getSimpleName()+":"+getName()+":"+getName()+hashCode()+":"+getNegate()+":"+isOptional()+":");
    String pipe = "";
    for(ChoiceRule rule:rules)
    {
      builder.append(pipe+rule.getName()+rule.hashCode());
      pipe = ",";
    }
    builder.append("\n");
    for(int i=0;i<size();i++)
    {
      get(i).toDeclareString(builder);
    }
    return builder;
  }

  // line 325 "../../../../../src/ParsingRules_Code.ump"
   public StringBuilder toRedoRegexString(StringBuilder builder){
    if(declared)
    {
      return builder;
    }
    declared = true;
    for(ChoiceRule rule:getRules())
    {
      rule.toRedoRegexString(builder);
    }
    return builder;
  }

  // line 339 "../../../../../src/ParsingRules_Code.ump"
   public StringBuilder toCannotBeString(StringBuilder builder){
    if(declared)
    {
      return builder;
    }
    declared = true;
    for(ChoiceRule rule:getRules())
    {
      rule.toCannotBeString(builder);
    }
    return builder;
  }

  // line 353 "../../../../../src/ParsingRules_Code.ump"
   public void setSubrules(String string){
    if(string!=null)
    {
	  subrules = string.split(",");
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "negate" + ":" + getNegate()+ "," +
            "dontDelete" + ":" + getDontDelete()+ "," +
            "optional" + ":" + getOptional()+ "," +
            "declared" + ":" + getDeclared()+ "," +
            "reset" + ":" + getReset()+ "," +
            "noSpaces" + ":" + getNoSpaces()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "action" + "=" + (getAction() != null ? !getAction().equals(this)  ? getAction().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "parent" + "=" + (getParent() != null ? !getParent().equals(this)  ? getParent().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "firstValueBuilder" + "=" + (getFirstValueBuilder() != null ? !getFirstValueBuilder().equals(this)  ? getFirstValueBuilder().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 28 "../../../../../src/ParsingRules.ump"
  private String[] subrules = null ;

  
}
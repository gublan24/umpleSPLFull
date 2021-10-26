/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.rules;
import java.util.*;
import java.util.regex.*;
import cruise.umple.parser.Token;
import cruise.umple.parser.analysis.*;

/**
 * Terminals are the only rules that actually don't use sub rules, instead, they use regex to compute whether there is a successful parse.
 * for example if the parse position is at "String name;" the terminal which was created with the ~ (alphanumeric) symbol, will parse the
 * String(excluding whitespace) and will return the position so that the next parse position will be "name;"
 */
// line 71 "../../../../../src/ParsingRules.ump"
// line 621 "../../../../../src/ParsingRules_Code.ump"
public class Terminal extends ChoiceRule
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Terminal Attributes
  private String regex;
  private String cannotBe;
  private Pattern cannotBePattern;
  private Pattern pattern;
  private Pattern pattern2;
  private boolean onlyValue;
  private boolean optional;
  private boolean lookBack;
  private boolean canBeNull;
  private boolean strictRegex;
  private boolean followingOptional;
  private String following;
  private boolean cannotHaveNewline;
  private boolean mustHaveSpaceFollowing;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Terminal(String aName, String aRegex)
  {
    super(aName);
    regex = aRegex;
    cannotBe = null;
    cannotBePattern = null;
    pattern = null;
    pattern2 = null;
    onlyValue = false;
    optional = false;
    lookBack = false;
    canBeNull = false;
    strictRegex = false;
    followingOptional = false;
    following = null;
    cannotHaveNewline = false;
    mustHaveSpaceFollowing = false;
    // line 640 "../../../../../src/ParsingRules_Code.ump"
    pattern = Pattern.compile("("+regex+").*",Pattern.DOTALL);
        strictRegex = true;
        mustHaveSpaceFollowing = false;
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRegex(String aRegex)
  {
    boolean wasSet = false;
    regex = aRegex;
    wasSet = true;
    return wasSet;
  }

  public boolean setCannotBe(String aCannotBe)
  {
    boolean wasSet = false;
    // line 647 "../../../../../src/ParsingRules_Code.ump"
    if(aCannotBe.equals(regex))
        {
    	  return false;
    	}
    // END OF UMPLE BEFORE INJECTION
    cannotBe = aCannotBe;
    wasSet = true;
    // line 655 "../../../../../src/ParsingRules_Code.ump"
    cannotBePattern = Pattern.compile("["+space+"]*("+cannotBe+")["+space+"]*.*",Pattern.DOTALL);
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setCannotBePattern(Pattern aCannotBePattern)
  {
    boolean wasSet = false;
    cannotBePattern = aCannotBePattern;
    wasSet = true;
    return wasSet;
  }

  public boolean setPattern(Pattern aPattern)
  {
    boolean wasSet = false;
    pattern = aPattern;
    wasSet = true;
    return wasSet;
  }

  public boolean setPattern2(Pattern aPattern2)
  {
    boolean wasSet = false;
    pattern2 = aPattern2;
    wasSet = true;
    return wasSet;
  }

  public boolean setOnlyValue(boolean aOnlyValue)
  {
    boolean wasSet = false;
    onlyValue = aOnlyValue;
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

  public boolean setLookBack(boolean aLookBack)
  {
    boolean wasSet = false;
    lookBack = aLookBack;
    wasSet = true;
    return wasSet;
  }

  public boolean setCanBeNull(boolean aCanBeNull)
  {
    boolean wasSet = false;
    canBeNull = aCanBeNull;
    wasSet = true;
    return wasSet;
  }

  public boolean setStrictRegex(boolean aStrictRegex)
  {
    boolean wasSet = false;
    strictRegex = aStrictRegex;
    wasSet = true;
    return wasSet;
  }

  public boolean setFollowingOptional(boolean aFollowingOptional)
  {
    boolean wasSet = false;
    followingOptional = aFollowingOptional;
    wasSet = true;
    return wasSet;
  }

  public boolean setFollowing(String aFollowing)
  {
    boolean wasSet = false;
    following = aFollowing;
    wasSet = true;
    return wasSet;
  }

  public boolean setCannotHaveNewline(boolean aCannotHaveNewline)
  {
    boolean wasSet = false;
    cannotHaveNewline = aCannotHaveNewline;
    wasSet = true;
    return wasSet;
  }

  public boolean setMustHaveSpaceFollowing(boolean aMustHaveSpaceFollowing)
  {
    boolean wasSet = false;
    mustHaveSpaceFollowing = aMustHaveSpaceFollowing;
    wasSet = true;
    return wasSet;
  }

  /**
   * the inner regex(i.e. not the whitespace considerations or the neccessary trailing .*
   */
  public String getRegex()
  {
    return regex;
  }

  /**
   * A regex which, if matched by the parse, will cause the terminal to return -1(Failure). This is useful for such cases as a rolename consuming the "sorted" token
   */
  public String getCannotBe()
  {
    return cannotBe;
  }

  /**
   * The pattern associated to the cannotBe attribute
   */
  public Pattern getCannotBePattern()
  {
    return cannotBePattern;
  }

  /**
   * The main pattern, which is checked first for passing
   */
  public Pattern getPattern()
  {
    return pattern;
  }

  /**
   * Usually null except in the case where you have a premodifier-less token [token] and then an optional rule of some kind, which means that the first parse should try to parse as if the second rule is present, that is the regex becomes regex+nextRule.getFirstValue()
   */
  public Pattern getPattern2()
  {
    return pattern2;
  }

  /**
   * If true this is a STATIC token, which are things like braces and keywords
   */
  public boolean getOnlyValue()
  {
    return onlyValue;
  }

  /**
   * isOptional will return this value for Terminal
   */
  public boolean getOptional()
  {
    return optional;
  }

  /**
   * (not used)
   */
  public boolean getLookBack()
  {
    return lookBack;
  }

  /**
   * for determining whether "" is an acceptable parse
   */
  public boolean getCanBeNull()
  {
    return canBeNull;
  }

  public boolean getStrictRegex()
  {
    return strictRegex;
  }

  public boolean getFollowingOptional()
  {
    return followingOptional;
  }

  public String getFollowing()
  {
    return following;
  }

  public boolean getCannotHaveNewline()
  {
    return cannotHaveNewline;
  }

  public boolean getMustHaveSpaceFollowing()
  {
    return mustHaveSpaceFollowing;
  }

  public void delete()
  {
    super.delete();
  }


  /**
   * mustSpace being true makes sure that there is a space after the regex, false means that there is optional space.
   */
  // line 628 "../../../../../src/ParsingRules_Code.ump"
   public  Terminal(String name, String regex, boolean mustSpace){
    super(name);
    this.regex = regex;

    pattern = Pattern.compile("(["+space+"]*("+regex+")["+space+"]"+(mustSpace?"+":"*")+").*",Pattern.DOTALL);
    strictRegex = false;
    mustHaveSpaceFollowing = mustSpace;
  }


  /**
   * Returns the result of the regex matching the input string. Where the parseResult is the futurthest including spaces.
   */
  // line 662 "../../../../../src/ParsingRules_Code.ump"
   public int parse(Token token, int from, int max, String input, ParserDataPackage data){
    Matcher matcher = getPattern().matcher(input.substring(from,max));
    if(matcher.matches())
    {
      String matched = matcher.group(canBeNull&&data.getNoSpaces()?1:2);
    
      if(cannotBe!=null&&matched.matches(cannotBe)&&!getCannotBePattern().matcher(input.substring(from+matcher.group(1).length(),max)).matches())
      {
        return -1;
      }
      if(!getNegate())
      {
        if(!matched.equals("")||(canBeNull&&!getName().equals("extraCode")))
        {
          matched = canBeNull&&data.getNoSpaces()?matched:matched.trim();
          Token tok = onlyValue?new Token(matched,"STATIC"):new Token(getName(),matched);
          addToken(token,tok,
              from,
              from+matcher.group(1).length(),data);
        }
      }
      return from+matcher.group(1).length();
    }
    else if(getPattern2()!=null)
    {
      matcher = getPattern2().matcher(input.substring(from,max));
      if(matcher.matches())
      {
        String matched = matcher.group(2);
        if(cannotBe!=null&&matched.matches(cannotBe)&&!getCannotBePattern().matcher(input.substring(from+matcher.group(1).length(),max)).matches())
        {
          return -1;
        }
        if(!getNegate())
        {
          if(!matched.equals("")||(canBeNull&&!getName().equals("extraCode")))
          {
            Token tok = onlyValue?new Token(matched.trim(),"STATIC"):new Token(getName(),matched.trim());
            addToken(token,tok,
                from,
                from+matcher.group(1).length(),data);
          }
        }
        return from+matcher.group(1).length();
      }
    }
    return -1;
  }


  /**
   * onlyValue is used for determining if the terminal is a token or a STATIC.
   */
  // line 715 "../../../../../src/ParsingRules_Code.ump"
   public ChoiceRule onlyValue(){
    onlyValue = true;
    return this;
  }


  /**
   * to set the space (for the grammar it's " \t", for the UmpleGrammar " \t\n"
   */
  // line 724 "../../../../../src/ParsingRules_Code.ump"
   public static  void space(String string){
    space = string;
  }


  /**
   * returns optional
   */
  // line 732 "../../../../../src/ParsingRules_Code.ump"
   public boolean isOptional(){
    return optional;
  }

  // line 737 "../../../../../src/ParsingRules_Code.ump"
   public String getFirstValue(){
    return regex;
  }


  /**
   * re-initializes the regex
   */
  // line 745 "../../../../../src/ParsingRules_Code.ump"
   public void redoRegex(String regex){
    this.regex = (isOptional()?"(":"")+regex+(isOptional()?")?":"");
    pattern = Pattern.compile("(["+space+"]*("+regex+")["+space+"]"+(mustHaveSpaceFollowing?"+":"*")+").*",Pattern.DOTALL);
  }


  /**
   * re-initializes the regex with a given value that can follow the regex(this value should be commuted with getFirstValue).
   */
  // line 754 "../../../../../src/ParsingRules_Code.ump"
   public void redoRegex(String regex, String following, boolean optional){
    followingOptional = optional;    
    this.following = following;  
    this.regex = (isOptional()?"(":"")+regex+(isOptional()?")?":"");	
    if(optional)
    {
      pattern2 = Pattern.compile("(["+space+"]*("+regex+")["+space+"]*).*",Pattern.DOTALL);
      	
    }  
    pattern = Pattern.compile("(["+space+"]*("+regex+")["+space+"]*)("+following+").*",Pattern.DOTALL);	
	if(isOptional())
	{
	  setCannotBe(following);
	}
  }


  /**
   * This function removes the argument string from the regex
   */
  // line 774 "../../../../../src/ParsingRules_Code.ump"
   public void cannotHaveNewline(){
    this.regex = regex.replace("\\n","");
    pattern = Pattern.compile("(["+space+"]*("+regex+")["+space.replace("\\n","")+"]*).*",Pattern.DOTALL);
    cannotHaveNewline = true;
  }

  // line 781 "../../../../../src/ParsingRules_Code.ump"
   public StringBuilder toDeclareString(StringBuilder builder){
    builder.append(getName()+hashCode()+"\n");
    builder.append(getClass().getSimpleName()+":"+getName()+":"+getName()+hashCode()+":"+getNegate()+":"+isOptional()+": :"+onlyValue+":"+canBeNull+":"+cannotHaveNewline+":"+strictRegex+":"+mustHaveSpaceFollowing+":"+regex+"\n");
    return builder;
  }

  // line 787 "../../../../../src/ParsingRules_Code.ump"
   public StringBuilder toRedoRegexString(StringBuilder builder){
    if(following!=null)
    {
      builder.append(getName()+hashCode()+":"+followingOptional+":"+following+"\n");
    }
    return builder;
  }

  // line 795 "../../../../../src/ParsingRules_Code.ump"
   public StringBuilder toCannotBeString(StringBuilder builder){
    if(cannotBe!=null)
    {
      builder.append(getName()+hashCode()+":"+cannotBe+"\n");
    }
    return builder;
  }


  public String toString()
  {
    return super.toString() + "["+
            "regex" + ":" + getRegex()+ "," +
            "cannotBe" + ":" + getCannotBe()+ "," +
            "onlyValue" + ":" + getOnlyValue()+ "," +
            "optional" + ":" + getOptional()+ "," +
            "lookBack" + ":" + getLookBack()+ "," +
            "canBeNull" + ":" + getCanBeNull()+ "," +
            "strictRegex" + ":" + getStrictRegex()+ "," +
            "followingOptional" + ":" + getFollowingOptional()+ "," +
            "following" + ":" + getFollowing()+ "," +
            "cannotHaveNewline" + ":" + getCannotHaveNewline()+ "," +
            "mustHaveSpaceFollowing" + ":" + getMustHaveSpaceFollowing()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "cannotBePattern" + "=" + (getCannotBePattern() != null ? !getCannotBePattern().equals(this)  ? getCannotBePattern().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "pattern" + "=" + (getPattern() != null ? !getPattern().equals(this)  ? getPattern().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "pattern2" + "=" + (getPattern2() != null ? !getPattern2().equals(this)  ? getPattern2().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 117 ../../../../../src/ParsingRules.ump
  static String space = " \\t";
  
}
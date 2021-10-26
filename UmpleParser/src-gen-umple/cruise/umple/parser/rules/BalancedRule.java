/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.rules;
import java.util.*;
import cruise.umple.parser.Token;
import cruise.umple.parser.analysis.*;

/**
 * Balanced rules ensure that braces are balanced, that is, that the corresponding brace is matched.
 * For example {a {b }c }d 'a' is matched with 'd' and 'b' is matched 'c' instead of a with c
 */
// line 135 "../../../../../src/ParsingRules.ump"
// line 803 "../../../../../src/ParsingRules_Code.ump"
public class BalancedRule extends ChoiceRule
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BalancedRule Attributes
  private String key;
  private String open;
  private String close;
  private ChoiceRule spacesTerminal;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BalancedRule(String aName)
  {
    super(aName);
    key = "";
    open = "";
    close = "";
    spacesTerminal = new Terminal("spaces","",false).dontCare();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setKey(String aKey)
  {
    boolean wasSet = false;
    key = aKey;
    wasSet = true;
    return wasSet;
  }

  public boolean setOpen(String aOpen)
  {
    boolean wasSet = false;
    open = aOpen;
    wasSet = true;
    return wasSet;
  }

  public boolean setClose(String aClose)
  {
    boolean wasSet = false;
    close = aClose;
    wasSet = true;
    return wasSet;
  }

  public boolean setSpacesTerminal(ChoiceRule aSpacesTerminal)
  {
    boolean wasSet = false;
    spacesTerminal = aSpacesTerminal;
    wasSet = true;
    return wasSet;
  }

  public String getKey()
  {
    return key;
  }

  public String getOpen()
  {
    return open;
  }

  public String getClose()
  {
    return close;
  }

  public ChoiceRule getSpacesTerminal()
  {
    return spacesTerminal;
  }

  public void delete()
  {
    super.delete();
  }


  /**
   * A balanced rule is of the form "open key" rule "close key", for example: { [[classDefinition]]* }
   * This constructor reflect's that form.
   */
  // line 811 "../../../../../src/ParsingRules_Code.ump"
   public  BalancedRule(String name, String open, ChoiceRule rule, String close){
    super(name, rule);
    key = open+close;
    spacesTerminal = new Terminal("spaces","",false).dontCare();
    this.open = open;
    this.close = close;
  }

  // line 820 "../../../../../src/ParsingRules_Code.ump"
   public  BalancedRule(String name, String open, String close){
    super(name);
	key = open+close;
	spacesTerminal = new Terminal("spaces","",false).dontCare();
	this.open = open;
    this.close = close;
  }


  /**
   * The parsing of the balanced rule is relies on the commuted couples from the ParserDataPackage.
   * The only thing that has to be respected is that there cannot be anything besides the couple's open string first so there cannot be whitespace for this parse to work
   * for example: "{ key }" would work, but " { key }" would not. trailing whitespace is accounted for.
   * This is the only rule that does not account for whitespace before it begins.
   */
  // line 835 "../../../../../src/ParsingRules_Code.ump"
   public int parse(Token token, int from, int to, String input, ParserDataPackage data){
    int index = data.getCouples().get(key).indexOfPositionFrom(from);
    boolean previousSpaceStatus = data.getNoSpaces();
    data.setNoSpaces(getNoSpaces());
    if(index!=-1)
    {
      
      Token self = getNegate()?token:new Token(getName(),"START_TOKEN");
      int from2 = Terminal.space.equals(" \\t")||getNoSpaces()?-1:spacesTerminal.parse(self, from+data.getCouples().get(key).getOpen().length(), to, input, data);
      if(from2==-1)
      {
        from2 = from+data.getCouples().get(key).getOpen().length();
      }
      Token open = new Token(data.getCouples().get(key).getOpen(),"STATIC");
      addToken(token,
        open,
        from,
        from+data.getCouples().get(key).getOpen().length(),
        data);
      int parseResult = get(0).parse(self,
          from2,
          data.getCouples().get(key).getPositionTo(index),
          input,
          data);
      if(parseResult!=-1&&parseResult==data.getCouples().get(key).getPositionTo(index))
      {
        int result = parseResult;
        parseResult = Terminal.space.equals(" \\t")||getNoSpaces()?-1:spacesTerminal.parse(self, parseResult+data.getCouples().get(key).getClose().length(), to, input, data);
        if(parseResult==-1)
        {
          parseResult = result+data.getCouples().get(key).getClose().length();
        }
        if(!getNegate())
        {
          addToken(token,
              self,
              from+data.getCouples().get(key).getOpen().length(),
              result,
              data);
        }
        else
        {
          //addAllTokens(token,self);
        }
        addToken(token,new Token(data.getCouples().get(key).getClose(),"STATIC"),result,result+1,data);
        data.setNoSpaces(previousSpaceStatus);
        return parseResult;
      }
      token.removeSubToken(open);
    }
    data.setNoSpaces(previousSpaceStatus);
    return -1;
  }


  /**
   * initializes the couples, and puts them into the data package
   */
  // line 893 "../../../../../src/ParsingRules_Code.ump"
   public static  void initialize(String input, ParserDataPackage data){
    data.setCouples(new HashMap<String,ParsingCouple>());
    for(String[] key:data.getKeys().values())
    {
      data.getCouples().put(key[0]+key[1],new ParsingCouple(key[0],key[1]).init(input));
    }
  }


  /**
   * Balanced rules are never optional, the way to make them optional is to use a Repeatable rule as their parent.
   */
  // line 905 "../../../../../src/ParsingRules_Code.ump"
   public boolean isOptional(){
    return false;
  }


  /**
   * the first value of the balanced rule must always be the open key
   */
  // line 913 "../../../../../src/ParsingRules_Code.ump"
   public String getFirstValue(){
    return "\\Q"+key.charAt(0)+"\\E";
  }

  // line 918 "../../../../../src/ParsingRules_Code.ump"
   public StringBuilder toDeclareString(StringBuilder builder){
    if(getDeclared())
    {
      return builder;
    }
    setDeclared(true);
    builder.append(getName()+hashCode()+"\n");
    builder.append(getClass().getSimpleName()+":"+getName()+":"+getName()+hashCode()+":"+getNegate()+":"+isOptional()+":");
    String pipe = "";
    for(ChoiceRule rule:getRules())
    {
      builder.append(pipe+rule.getName()+rule.hashCode());
      pipe = ",";
    }
    builder.append(":"+open+":"+close+":"+getNoSpaces()+"\n");
    get(0).toDeclareString(builder);
    return builder;
  }


  public String toString()
  {
    return super.toString() + "["+
            "key" + ":" + getKey()+ "," +
            "open" + ":" + getOpen()+ "," +
            "close" + ":" + getClose()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "spacesTerminal" + "=" + (getSpacesTerminal() != null ? !getSpacesTerminal().equals(this)  ? getSpacesTerminal().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
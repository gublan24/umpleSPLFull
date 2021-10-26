/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.rules;
import java.util.*;
import cruise.umple.parser.Token;
import cruise.umple.parser.analysis.*;

/**
 * name: [[rule]](option)
 * Repeatable rules are rules that are repeated sequencially one after the other in some form
 * option: ? means either the rule does not parse or it does once and only once, i.e. that it is made optional
 * means either the rule does not parse or it does any number of times
 * + means the rule must parse at least once, and can parse any number of times after
 */
// line 52 "../../../../../src/ParsingRules.ump"
// line 476 "../../../../../src/ParsingRules_Code.ump"
public class RepeatableRule extends ChoiceRule
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RepeatableRule Attributes
  private int min;
  private int max;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RepeatableRule(String aName, int aMin, int aMax)
  {
    super(aName);
    min = aMin;
    max = aMax;
    // line 492 "../../../../../src/ParsingRules_Code.ump"
    this.min = min;
        this.max = max;
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMin(int aMin)
  {
    boolean wasSet = false;
    min = aMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setMax(int aMax)
  {
    boolean wasSet = false;
    max = aMax;
    wasSet = true;
    return wasSet;
  }

  /**
   * the minimum number of times the subrule can be parsed for this rule to be successful
   */
  public int getMin()
  {
    return min;
  }

  /**
   * the maximum number of times the subrule should be considered to be able to parse(a max of 1 will not repeat more than once)
   */
  public int getMax()
  {
    return max;
  }

  public void delete()
  {
    super.delete();
  }


  /**
   * Takes one rule and the minimum number of repeats as well as the maximum
   */
  // line 483 "../../../../../src/ParsingRules_Code.ump"
   public  RepeatableRule(String name, int min, int max, ChoiceRule rule){
    super(name,rule);
    this.setMin(min);
    this.max = max;
  }


  /**
   * Tries to parse the subrule min<=times<=max.
   */
  // line 501 "../../../../../src/ParsingRules_Code.ump"
   public int parse(Token token, int from, int stop, String input, ParserDataPackage data){
    Token self = getNegate()?token:new Token(getName(),"START_TOKEN");
    ChoiceRule rule = this.get(0);
    int start = from;
    int end = from;
    int i=0;
    for(;i<max;i++)
    {
      int parseResult = rule.parse(self,end,stop,input,data);
      if(parseResult!=-1&&end!=parseResult)
      {    
        end = parseResult;
      }
      else 
      {
        break;
      }
    }
    if(i<getMin())
    {
      return -1;
    }
    else 
    {
      if(!getNegate()&&from!=end)
      {
        addToken(token,self,from,end,data);
      }
      return end;
    }
  }


  /**
   * returns true if optional, i.e. if the min is 0 or the sub rule is optional
   */
  // line 537 "../../../../../src/ParsingRules_Code.ump"
   public boolean isOptional(){
    return (this.min == 0);
  }


  /**
   * For optimization, this object will be removed if it has no sub rules.
   */
  // line 545 "../../../../../src/ParsingRules_Code.ump"
   public boolean optimizeCondition(){
    return size()==0;
  }


  /**
   * The size of a repeatable rule can be 0 or 1 and, therefore can have the value of either "" or the value of it's one and only rule
   */
  // line 553 "../../../../../src/ParsingRules_Code.ump"
   public String getFirstValue(){
    if(getFirstValueBuilder()!=null)
  {
    return getFirstValueBuilder().toString();
  }
  setFirstValueBuilder(new StringBuilder());
  for(int i=0;i<size();i++)
  {
    getFirstValueBuilder().append(get(i).getFirstValue());
  }
  return getFirstValueBuilder().toString();
  }

  // line 567 "../../../../../src/ParsingRules_Code.ump"
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
    builder.append(":"+min+":"+max+"\n");
    get(0).toDeclareString(builder);
    return builder;
  }


  public String toString()
  {
    return super.toString() + "["+
            "min" + ":" + getMin()+ "," +
            "max" + ":" + getMax()+ "]";
  }
}
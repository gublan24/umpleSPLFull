/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.rules;
import java.util.*;
import cruise.umple.parser.Token;
import cruise.umple.parser.analysis.*;

/**
 * name : [[rule]] [[rule]]*
 * Similar to the Choice rule, except all sub rules must be successful when parsing(similar to an 'and' being performed on a hypotheical "isSuccess" for each rule)
 * Because of the possibility for subrules to be optional, this Rule type must support back tracking, where after a failure, the rule will remove tokens from the growing return token when it needs to reconsider a sub rule as being parsable.
 */
// line 37 "../../../../../src/ParsingRules.ump"
// line 360 "../../../../../src/ParsingRules_Code.ump"
public class ChainRule extends ChoiceRule
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ChainRule(String aName)
  {
    super(aName);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }


  /**
   * Overriding the corresponding constructor
   */
  // line 367 "../../../../../src/ParsingRules_Code.ump"
   public  ChainRule(String name, ChoiceRule... rules){
    super(name,rules);
  }


  /**
   * If each of the subtokens positively parses then this method will return the result of the last parsed sub ruled.
   */
  // line 375 "../../../../../src/ParsingRules_Code.ump"
   public int parse(Token token, int from, int max, String input, ParserDataPackage data){
    if(size()==0)
    {
      return from;
    }
    Token self = getNegate()?token:new Token(getName(),"START_TOKEN");
    int start = from;
    int end = from;
    Stack<Integer> savedEnds = new Stack<Integer>();
    Stack<Integer> savedIds = new Stack<Integer>();
    Stack<Integer> savedSizes = new Stack<Integer>();
    
    for(int i=0;i<size();i++)
    {
      int beforeSize = self.numberOfSubTokens();
      int parseResult = get(i).parse(self,end,max, input, data);
      if(parseResult==-1)
      {
        if(savedEnds.isEmpty())
        {
          return -1;
        }
        else
        {
          end = savedEnds.pop();
          i = savedIds.pop();
          int size = savedSizes.pop();
          while(self.numberOfSubTokens()>size)
          {
            self.removeSubToken(self.getSubToken(size));
          }
        }
      }
      else 
      {
        if(get(i).isOptional())
        {
          savedEnds.push(end);
          savedIds.push(i);
          savedSizes.push(beforeSize);
        }
        end = parseResult;
        if(end>data.getFurthestGotten())
        {
          data.setPreviousFurthest(from);
          data.setFurthestGotten(end);
          data.setPosition(findPosition(end,data));
        }
      }
    }
    if(!getNegate()&&from!=end)
    {
      addToken(token,self,from,end,data);
    }
    return end;
  }


  /**
   * If there exists a subrule that is not optional, this function will return false, otherwise it will return true(i.e. all sub tokens are optional)
   */
  // line 436 "../../../../../src/ParsingRules_Code.ump"
   public boolean isOptional(){
    //TODO cache this value
    for(ChoiceRule rule:getRules())
    {
      if(!rule.isOptional())
      {
        return false;
      }
    }
    return true;
  }


  /**
   * Within the context of a chain rule this function means the very first rule's value, and if that rule is optional,
   * the or of the next one, and so on.
   */
  // line 453 "../../../../../src/ParsingRules_Code.ump"
   public String getFirstValue(){
    if(getFirstValueBuilder()!=null)
  {
    return getFirstValueBuilder().toString();
  }
  setFirstValueBuilder(new StringBuilder());
  String pipe = "";
  for(int i=0;i<size();i++)
  {
      getFirstValueBuilder().append(pipe+get(i).getFirstValue());
    if(!get(i).isOptional())
    {
      return getFirstValueBuilder().toString();
    }
    if(!getFirstValueBuilder().toString().equals(""))
    {
      pipe = "|";
    }
  }
  return getFirstValueBuilder().toString();
  }

}
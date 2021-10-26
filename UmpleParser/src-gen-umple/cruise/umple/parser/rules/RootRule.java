/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.rules;
import java.util.*;
import cruise.umple.parser.Token;
import cruise.umple.parser.analysis.*;

/**
 * The only difference between a root rule and a choice rule is that after parsing the parse position must be at the end of the file for this rule to pass
 */
// line 123 "../../../../../src/ParsingRules.ump"
// line 587 "../../../../../src/ParsingRules_Code.ump"
public class RootRule extends ChoiceRule
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RootRule(String aName)
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
   * For passing to super constructor.
   */
  // line 594 "../../../../../src/ParsingRules_Code.ump"
   public  RootRule(String name, ChoiceRule... rules){
    super(name,rules);
  }


  /**
   * Does exactly the same as the ChoiceRule, except it will return -1 if the parseResult was not the same as the input's length, i.e. it will fail if some of the file was not parsed.
   */
  // line 602 "../../../../../src/ParsingRules_Code.ump"
   public int parse(Token token, int from, int max, String input, ParserDataPackage data){
    Token self = new Token(getName(),"START_TOKEN");
    for(int i=0;i<this.size();++i)
    {
      int parseResult = get(i).parse(getNegate()?token:self,from, max, input, data);
      if(parseResult>=max)
      {
        if(!getNegate())
        {
          token.addSubToken(self);
        }
        return parseResult;
      }
      self = new Token(getName(),"START_TOKEN");
    }
    
    return -1;
  }

}
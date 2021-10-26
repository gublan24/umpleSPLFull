/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.rules;
import java.util.*;

/**
 * ParsingCouples are used by balanced rules to quickly find the corresponding brace. They are initialized at the begining of each file parsed
 * and are stored in the ParserDataPackage. They contain the character positions of each open brace and each close brace(when braces are the key)
 * so {{}} would have positionFrom = {1,2} and positionTo = {4,3}
 */
// line 153 "../../../../../src/ParsingRules.ump"
// line 937 "../../../../../src/ParsingRules_Code.ump"
public class ParsingCouple
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ParsingCouple Attributes
  private String open;
  private String close;
  private List<Integer> positionFrom;
  private List<Integer> positionTo;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ParsingCouple(String aOpen, String aClose)
  {
    open = aOpen;
    close = aClose;
    positionFrom = new ArrayList<Integer>();
    positionTo = new ArrayList<Integer>();
  }

  //------------------------
  // INTERFACE
  //------------------------

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
  /* Code from template attribute_SetMany */
  public boolean addPositionFrom(Integer aPositionFrom)
  {
    boolean wasAdded = false;
    wasAdded = positionFrom.add(aPositionFrom);
    return wasAdded;
  }

  public boolean removePositionFrom(Integer aPositionFrom)
  {
    boolean wasRemoved = false;
    wasRemoved = positionFrom.remove(aPositionFrom);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addPositionTo(Integer aPositionTo)
  {
    boolean wasAdded = false;
    wasAdded = positionTo.add(aPositionTo);
    return wasAdded;
  }

  public boolean removePositionTo(Integer aPositionTo)
  {
    boolean wasRemoved = false;
    wasRemoved = positionTo.remove(aPositionTo);
    return wasRemoved;
  }

  /**
   * The open key, a close brace or quote for example
   */
  public String getOpen()
  {
    return open;
  }

  /**
   * The close key, a close brace or quote for example
   */
  public String getClose()
  {
    return close;
  }
  /* Code from template attribute_GetMany */
  public Integer getPositionFrom(int index)
  {
    Integer aPositionFrom = positionFrom.get(index);
    return aPositionFrom;
  }

  public Integer[] getPositionFrom()
  {
    Integer[] newPositionFrom = positionFrom.toArray(new Integer[positionFrom.size()]);
    return newPositionFrom;
  }

  public int numberOfPositionFrom()
  {
    int number = positionFrom.size();
    return number;
  }

  public boolean hasPositionFrom()
  {
    boolean has = positionFrom.size() > 0;
    return has;
  }

  public int indexOfPositionFrom(Integer aPositionFrom)
  {
    int index = positionFrom.indexOf(aPositionFrom);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Integer getPositionTo(int index)
  {
    Integer aPositionTo = positionTo.get(index);
    return aPositionTo;
  }

  public Integer[] getPositionTo()
  {
    Integer[] newPositionTo = positionTo.toArray(new Integer[positionTo.size()]);
    return newPositionTo;
  }

  public int numberOfPositionTo()
  {
    int number = positionTo.size();
    return number;
  }

  public boolean hasPositionTo()
  {
    boolean has = positionTo.size() > 0;
    return has;
  }

  public int indexOfPositionTo(Integer aPositionTo)
  {
    int index = positionTo.indexOf(aPositionTo);
    return index;
  }

  public void delete()
  {}


  /**
   * Searches the input string for the key this couple protects.
   * If a key is found with a \ before it, it is not considered
   * 
   * if a key is found between // and \n it is not considered
   * if a key is found within " and " it is not considered
   * if a key is found between ' and ' it is not considered
   * 
   * if ever there is a need for say "\{" to happen, i.e. that \ is  terminal followed by { code } or something like that
   * then this function will need to be revised so that there can be conditional escaping(it would probably just be an attribute of the couple)
   * 
   * future plans also include refactoring this function so that all the couples are found on one pass through the input instead of having to re-initialize on every new input
   * 
   * The ignore level comes into play for instance if you have /*lvl0 /*lvl1 and you only want to hide lvl1 you would put the ignore level as 1
   */
  // line 955 "../../../../../src/ParsingRules_Code.ump"
   public ParsingCouple init(String input){
    int level = 0;
    String[] quoteLikeOpen = new String[] {"//","/*","\"","\'"};
    String[] quoteLikeClose = new String[] {"\n","*/","\"","\'"};
    String[] braceLikeOpen = new String[] {"<<!","<<#","<</*","<<=","<<$","<<@"};
    String[] braceLikeClose = new String[] {"!>>","#>>","*/>>",">>",">>",">>"}; 
    int quoteLikeIndex = -1;
    int braceLikeIndex = -1;
    boolean braceLike = false;
    for(int i=0;i<braceLikeOpen.length;++i)
    {
      if((braceLikeOpen[i]+braceLikeClose[i]).equals(open+close))
      {
        braceLike = true;
      }
    }
    boolean escaping = false;
    char[] chars = input.toCharArray();
    int size = input.length();
    List<Integer> levels = new ArrayList<Integer>();
    for(int i=0;i<size;++i)
    {
      //System.out.print(chars[i]+(quoteLikeIndex!=-1||braceLikeIndex!=-1?"("+quoteLikeIndex+","+braceLikeIndex+")":""));
      if(!escaping)
      {
        if(chars[i]=='\\')
        {
          escaping = true;
        }
        else if(quoteLikeIndex==-1&&(braceLikeIndex==-1||braceLike))
        {
          if(level>0&&(close.length()==1&&close.charAt(0)==(chars[i]))||(close.length()>1&&(i+close.length()<input.length()?input.substring(i,i+close.length()).matches("\\Q"+close+"\\E"):false)))
          {            
            level--;
            if(level<0)
            {
              level=0;
            }
            else
            {
              positionFrom.add(levels.get(level));
              positionTo.add(Integer.valueOf(i));
            }
            if(braceLikeIndex!=-1&&braceLikeClose[braceLikeIndex].equals(close))
            {
              braceLikeIndex = -1;
            }
            
            i+=close.length()-1;
          }            
          else if(braceLikeIndex==-1||braceLike) if((open.length()==1&&open.charAt(0)==(chars[i]))||open.length()>1&&(i+open.length()<input.length()?input.substring(i,i+open.length()).equals(open):false))
          {
            if(levels.size()<=level)
            {
              levels.add(i);
            }
            else 
            {
              levels.set(level, i);
            }
            level++;
            i+=open.length()-1;
          }            
          else if (level>ParsingCouple.ignoreLevel)
          {
            for(int j=0;j<braceLikeOpen.length;++j)
            {
              String brace = braceLikeOpen[j];
              if(i+brace.length()<input.length()?input.substring(i,i+brace.length()).equals(brace):false){
                i+=brace.length()-1;
                braceLikeIndex = j;
                break;
              }
            }
            if(braceLikeIndex==-1)
            {
              for(int j=0;j<quoteLikeOpen.length;++j)
              {
                String quoteLike = quoteLikeOpen[j];
                if(i+quoteLike.length()<input.length()?input.substring(i,i+quoteLike.length()).equals(quoteLike):false){
                  i+=quoteLike.length()-1;
                  quoteLikeIndex = j;
                  break;
                }
              }
            }         
          }
        }
        else if(braceLikeIndex!=-1)
        {
          if((i+braceLikeClose[braceLikeIndex].length()<input.length()?input.substring(i,i+braceLikeClose[braceLikeIndex].length()).equals(braceLikeClose[braceLikeIndex]):false))
          {
            if(level>0&&braceLikeClose[braceLikeIndex].equals(close))
            {
              level--;
              if(level<0)
              {
                level=0;
              }
              else
              {
                positionFrom.add(levels.get(level));
                positionTo.add(Integer.valueOf(i));
              }
            }          
            i+=braceLikeClose[braceLikeIndex].length()-1;
            braceLikeIndex = -1;
          }
        }          
        else if(quoteLikeIndex!=-1&&(i+quoteLikeClose[quoteLikeIndex].length()<input.length()?input.substring(i,i+quoteLikeClose[quoteLikeIndex].length()).equals(quoteLikeClose[quoteLikeIndex]):false))
        {
          if(level>0&&quoteLikeClose[quoteLikeIndex].equals(close))
          {
            level--;
            if(level<0)
            {
              level=0;
            }
            else
            {
              positionFrom.add(levels.get(level));
              positionTo.add(Integer.valueOf(i));
            }
          }
          quoteLikeIndex = -1;
        }        
        else {
          escaping = false;
        }      
      }
      else {
        escaping = false;
      }
      if(braceLikeIndex!=-1)quoteLikeIndex=-1;
    }
    return this;
  }

  // line 1094 "../../../../../src/ParsingRules_Code.ump"
   public int hashCode(){
    return open.hashCode()+close.hashCode();
  }


  public String toString()
  {
    return super.toString() + "["+
            "open" + ":" + getOpen()+ "," +
            "close" + ":" + getClose()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 157 "../../../../../src/ParsingRules.ump"
  public static int ignoreLevel = 0 ;

  
}
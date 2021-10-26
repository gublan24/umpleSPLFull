/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.analysis;
import java.util.*;
import java.io.*;
import cruise.umple.parser.Position;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.ErrorMessage;
import cruise.umple.parser.rules.*;

/**
 * ParserDataPackage is a structure which contains all the miscellaneous data during the parse. Most importantly it contains the linenumbers,
 * which are the linenumbers associated to the character numbers(or offsets) of a given \n. And couples which are initialized to be the character position
 * of the open and close of those couples, for example there is a couple for { and } which will matched {a {b }c }d 'a' with 'd' and 'b' with 'c'
 */
// line 150 "../../../../../src/GrammarParsing.ump"
// line 573 "../../../../../src/GrammarParsing_Code.ump"
public class ParserDataPackage
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ParserDataPackage Attributes
  private String filename;
  private String fullFileAddress;
  private GrammarAnalyzer analyzer;
  private String input;
  private int furthestGotten;
  private int previousFurthest;
  private ParseResult parseResult;
  private Position position;
  private HashMap<String,ParsingCouple> couples;
  private LinkedHashMap<Integer,Integer> linenumbers;
  private List<String> hasParsed;
  private HashMap<String,String[]> keys;
  private List<String> lines;
  private boolean noSpaces;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ParserDataPackage(String aFilename, GrammarAnalyzer aAnalyzer)
  {
    filename = aFilename;
    fullFileAddress = "";
    analyzer = aAnalyzer;
    input = "";
    furthestGotten = 0;
    previousFurthest = 0;
    parseResult = new ParseResult(true);
    position = new Position(aFilename,0,0,0);
    couples = new HashMap<String,ParsingCouple>();
    linenumbers = new LinkedHashMap<Integer,Integer>();
    hasParsed = new ArrayList<String>();
    keys = new HashMap<String,String[]>();
    lines = new ArrayList<String>();
    noSpaces = false;
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

  public boolean setFullFileAddress(String aFullFileAddress)
  {
    boolean wasSet = false;
    fullFileAddress = aFullFileAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setAnalyzer(GrammarAnalyzer aAnalyzer)
  {
    boolean wasSet = false;
    analyzer = aAnalyzer;
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

  public boolean setFurthestGotten(int aFurthestGotten)
  {
    boolean wasSet = false;
    furthestGotten = aFurthestGotten;
    wasSet = true;
    return wasSet;
  }

  public boolean setPreviousFurthest(int aPreviousFurthest)
  {
    boolean wasSet = false;
    previousFurthest = aPreviousFurthest;
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

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setCouples(HashMap<String,ParsingCouple> aCouples)
  {
    boolean wasSet = false;
    couples = aCouples;
    wasSet = true;
    return wasSet;
  }

  public boolean setLinenumbers(LinkedHashMap<Integer,Integer> aLinenumbers)
  {
    boolean wasSet = false;
    linenumbers = aLinenumbers;
    wasSet = true;
    return wasSet;
  }

  public boolean setHasParsed(List<String> aHasParsed)
  {
    boolean wasSet = false;
    hasParsed = aHasParsed;
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
  public boolean addLine(String aLine)
  {
    boolean wasAdded = false;
    wasAdded = lines.add(aLine);
    return wasAdded;
  }

  public boolean removeLine(String aLine)
  {
    boolean wasRemoved = false;
    wasRemoved = lines.remove(aLine);
    return wasRemoved;
  }

  public boolean setNoSpaces(boolean aNoSpaces)
  {
    boolean wasSet = false;
    noSpaces = aNoSpaces;
    wasSet = true;
    return wasSet;
  }

  /**
   * the filename of the file that is being parsed
   */
  public String getFilename()
  {
    return filename;
  }

  /**
   * This is used to save the full address of the fileName.
   */
  public String getFullFileAddress()
  {
    return fullFileAddress;
  }

  public GrammarAnalyzer getAnalyzer()
  {
    return analyzer;
  }

  /**
   * the string that is the file that is being parsed
   */
  public String getInput()
  {
    return input;
  }

  /**
   * for comparing the furthest position attained during the parse, represents the highest offset seen by this parserdatapackage object
   */
  public int getFurthestGotten()
  {
    return furthestGotten;
  }

  /**
   * for comparing the furthest position attained during the parse, represents the second highest offset seen by this parserdatapackage object
   */
  public int getPreviousFurthest()
  {
    return previousFurthest;
  }

  /**
   * for passing around errors
   */
  public ParseResult getParseResult()
  {
    return parseResult;
  }

  /**
   * keeps track of the furthest token position attained during the parse.
   */
  public Position getPosition()
  {
    return position;
  }

  /**
   * Associated to each key is a couple
   */
  public HashMap<String,ParsingCouple> getCouples()
  {
    return couples;
  }

  /**
   * a hashmap where the key represent the offset and the value represents the line number at that offset
   */
  public LinkedHashMap<Integer,Integer> getLinenumbers()
  {
    return linenumbers;
  }

  /**
   * List of filenames that have already been parsed
   */
  public List<String> getHasParsed()
  {
    return hasParsed;
  }

  /**
   * They keys for the different couples {} for example
   */
  public HashMap<String,String[]> getKeys()
  {
    return keys;
  }
  /* Code from template attribute_GetMany */
  public String getLine(int index)
  {
    String aLine = lines.get(index);
    return aLine;
  }

  public String[] getLines()
  {
    String[] newLines = lines.toArray(new String[lines.size()]);
    return newLines;
  }

  public int numberOfLines()
  {
    int number = lines.size();
    return number;
  }

  public boolean hasLines()
  {
    boolean has = lines.size() > 0;
    return has;
  }

  public int indexOfLine(String aLine)
  {
    int index = lines.indexOf(aLine);
    return index;
  }

  /**
   * carries the context of the "no spaces" rule
   */
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
   * The passed Position can be null if this method was not invoked using a useStatement.
   * It takes a file and reads it, it also initializes the couples which will be used for this file.
   */
  // line 581 "../../../../../src/GrammarParsing_Code.ump"
   public void init(Position usePosition){
    String file = filename;
    fullFileAddress = filename;
    filename = file.split("\\Q"+File.separator+"\\E")[file.split("\\Q"+File.separator+"\\E").length-1];
    int offset = 0;
    int linenumber = 0;
    linenumbers = new LinkedHashMap<Integer,Integer>();
    BufferedReader reader = null;
    InputStream resourceStream = null;
    try {
      if ((new File(file)).exists())
      {
        reader = new BufferedReader(new FileReader(file));
      }
      else
      {
        String resourceToLoad=file;
        if(file.contains("lib:")) {
          resourceToLoad = "/"+file.substring(file.indexOf("lib:")+4);
        }
        resourceStream = getClass().getResourceAsStream(resourceToLoad);
        reader = new BufferedReader(new InputStreamReader(resourceStream));
      }
      String line = reader.readLine();
      StringBuilder input2 = new StringBuilder();
      while(line!=null)
      {
        linenumbers.put(offset, linenumber);
        offset+=line.length()+1;
        linenumber++;
        lines.add(line+"\n");
        input2.append(line+"\n");
        line = reader.readLine();
      }
      input = input2.toString();
    }
    catch(NullPointerException n)
    {
      // Special case when we don't want to read a file
      if(filename.equals("dummy__.ump")) {
        input="";
      }
      else {
        this.getParseResult().addErrorMessage(new ErrorMessage(1510,usePosition==null?new Position(filename,1,0,0):usePosition,filename));
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    } 
    finally 
    {
      try 
      {
        reader.close();
      } 
      catch(NullPointerException n)
      {        
      } 
      catch (IOException e)
      {      
        e.printStackTrace();
      }
    }
  }


  /**
   * Links files together at compile-time, provided a handler and the filenames.
   * 
   * Note: This has no effect if the handler is null
   */
  // line 652 "../../../../../src/GrammarParsing_Code.ump"
   public void linkFiles(LinkedFileHandler handler, File [] linkedFiles){
    if( handler != null ){
      input = handler.onFileLink( input, linkedFiles );
    }
  }

  // line 659 "../../../../../src/GrammarParsing_Code.ump"
   public void init(String rawinput, Position usePosition, int linenumber, int offset){
    linenumbers = new LinkedHashMap<Integer,Integer>();
    try {
      for(String line:rawinput.split("\\n"))
      {
        linenumbers.put(offset, linenumber);
        offset+=line.length()+1;
        linenumber++;
        input += line+"\n";
      }
    }
    catch(NullPointerException n)
    {
      if(this.getParseResult()==null)
      {
        this.setParseResult(new ParseResult(false));
      }
      // Special case when we don't want to read a file
      if(filename.equals("dummy__.ump")) {
        input="";
      }
      else {
        this.getParseResult().addErrorMessage(new ErrorMessage(1510,usePosition==null?new Position(filename,1,0,0):usePosition,filename));
      }
    }
    couples = new HashMap<String,ParsingCouple>();    
    BalancedRule.initialize(input,this);
  }


  public String toString()
  {
    return super.toString() + "["+
            "filename" + ":" + getFilename()+ "," +
            "fullFileAddress" + ":" + getFullFileAddress()+ "," +
            "input" + ":" + getInput()+ "," +
            "furthestGotten" + ":" + getFurthestGotten()+ "," +
            "previousFurthest" + ":" + getPreviousFurthest()+ "," +
            "noSpaces" + ":" + getNoSpaces()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "analyzer" + "=" + (getAnalyzer() != null ? !getAnalyzer().equals(this)  ? getAnalyzer().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "parseResult" + "=" + (getParseResult() != null ? !getParseResult().equals(this)  ? getParseResult().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "couples" + "=" + (getCouples() != null ? !getCouples().equals(this)  ? getCouples().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "linenumbers" + "=" + (getLinenumbers() != null ? !getLinenumbers().equals(this)  ? getLinenumbers().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "hasParsed" + "=" + (getHasParsed() != null ? !getHasParsed().equals(this)  ? getHasParsed().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "keys" + "=" + (getKeys() != null ? !getKeys().equals(this)  ? getKeys().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
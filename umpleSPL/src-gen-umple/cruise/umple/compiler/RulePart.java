/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.TextParser;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * Part of a grammar rule
 */
// line 70 "../../../../src/Parser_Code.ump"
// line 57 "../../../../src/Parser.ump"
public class RulePart
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RulePart Attributes
  private String name;
  private String multiplicity;
  private List<String> nextIdentifiers;
  private int maximumPartsFound;

  //RulePart State Machines
  public enum Type { Static, Variable, Rule }
  private Type type;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RulePart(String aName, String aMultiplicity)
  {
    name = aName;
    multiplicity = aMultiplicity;
    nextIdentifiers = new ArrayList<String>();
    maximumPartsFound = -1;
    setType(Type.Static);
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

  public boolean setMultiplicity(String aMultiplicity)
  {
    boolean wasSet = false;
    multiplicity = aMultiplicity;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addNextIdentifier(String aNextIdentifier)
  {
    boolean wasAdded = false;
    // line 72 "../../../../src/Parser.ump"
    if (aNextIdentifier == null) { return false; }
    // END OF UMPLE BEFORE INJECTION
    wasAdded = nextIdentifiers.add(aNextIdentifier);
    return wasAdded;
  }

  public boolean removeNextIdentifier(String aNextIdentifier)
  {
    boolean wasRemoved = false;
    wasRemoved = nextIdentifiers.remove(aNextIdentifier);
    return wasRemoved;
  }

  public boolean setMaximumPartsFound(int aMaximumPartsFound)
  {
    boolean wasSet = false;
    maximumPartsFound = aMaximumPartsFound;
    wasSet = true;
    return wasSet;
  }

  /**
   * The name of the rule part.
   */
  public String getName()
  {
    return name;
  }

  public String getMultiplicity()
  {
    // line 73 "../../../../src/Parser.ump"
    if (multiplicity == null) { return "1"; }
    // END OF UMPLE BEFORE INJECTION
    return multiplicity;
  }
  /* Code from template attribute_GetMany */
  public String getNextIdentifier(int index)
  {
    String aNextIdentifier = nextIdentifiers.get(index);
    return aNextIdentifier;
  }

  public String[] getNextIdentifiers()
  {
    String[] newNextIdentifiers = nextIdentifiers.toArray(new String[nextIdentifiers.size()]);
    return newNextIdentifiers;
  }

  public int numberOfNextIdentifiers()
  {
    int number = nextIdentifiers.size();
    return number;
  }

  public boolean hasNextIdentifiers()
  {
    boolean has = nextIdentifiers.size() > 0;
    return has;
  }

  public int indexOfNextIdentifier(String aNextIdentifier)
  {
    int index = nextIdentifiers.indexOf(aNextIdentifier);
    return index;
  }

  public int getMaximumPartsFound()
  {
    return maximumPartsFound;
  }

  public String getTypeFullName()
  {
    String answer = type.toString();
    return answer;
  }

  public Type getType()
  {
    return type;
  }

  public boolean setType(Type aType)
  {
    type = aType;
    return true;
  }

  public void delete()
  {}

  // line 75 "../../../../src/Parser_Code.ump"
   public boolean isWithinLimits(int numberSoFar){
    return getMaximumPartsFound() == -1 || numberSoFar < getMaximumPartsFound();
  }

  // line 80 "../../../../src/Parser_Code.ump"
   public String getDisplayName(){
    if (isEnum())
    {
      TextParser parser = new TextParser(name);
      parser.nextAt("=");
      return parser.nextUntil(":");
    }
    else if (isRegex())
    {
      TextParser parser = new TextParser(name);
      parser.nextAt("!");
      return parser.nextUntil(":");
    }
    else if (isToEndOfLine())
    {
      return name.substring(1);
    }
    else if (isMultiWord())
    {
      return name.substring(2);
    }
    else if (isAlphanumeric()) {
      return name.substring(1);
    }
    else
    {
      return name;
    }
  }

  // line 111 "../../../../src/Parser_Code.ump"
   public void removeNextIdentifiers(){
    nextIdentifiers.clear();
  }

  // line 116 "../../../../src/Parser_Code.ump"
   public String[] getInnerNames(){
    if (!hasInnerNames())
    {
      return new String[0];
    }

    TextParser parser = new TextParser(name);
    parser.load(parser.nextUntil(">"));
    ArrayList<String> allNames = new ArrayList<String>();


    while(parser.nextUntil(",") != null)
    {
      allNames.add(parser.name());
      parser.nextAt(",");
    }
    return allNames.toArray(new String[allNames.size()]);
  }

  // line 136 "../../../../src/Parser_Code.ump"
   public boolean isValidInnerValues(String value){
    if (value == null)
    {
      return false;
    }
    TextParser parser = new TextParser(value);
    int number = 0;
    while (parser.next() != null)
    {
      number++;
    }
    return number > 0 && number <= getInnerNames().length;
  }

  // line 151 "../../../../src/Parser_Code.ump"
   public RulePartValue[] getInnerValues(String value){
    if (!hasInnerNames())
    {
      return new RulePartValue[0];
    }

    String[] allNames = getInnerNames();
    RulePartValue[] allRulePartValues = new RulePartValue[allNames.length];

    for (int i=0; i<allNames.length; i++)
    {
      allRulePartValues[i] = new RulePartValue();
      allRulePartValues[i].setName(allNames[i]);
    }


    if (value == null)
    {
      return allRulePartValues;
    }

    ArrayList<String> allUnorderedValues = new ArrayList<String>();
    ArrayList<Position> allUnorderedPositions = new ArrayList<Position>();

    TextParser parser = new TextParser(value);
    while(parser.peek() != null)
    {
      allUnorderedPositions.add(parser.currentPosition().copy());
      allUnorderedValues.add(parser.next());
    }

    int[] allValueIndicies = new int[allNames.length];

    TextParser namesParser = new TextParser(name);
    namesParser.nextUntil(">");
    namesParser.nextAt(">");
    for (int i=0; i<allValueIndicies.length; i++)
    {
      String nextOrderText = namesParser.nextUntil(",");
      int next = nextOrderText == null ? i : Integer.parseInt(nextOrderText);
      namesParser.nextAt(",");
      allValueIndicies[i] = next;
    }

    int maximumIndex = allUnorderedValues.size() - 1;
    int unorderedIndex = 0;
    for (int i=0; i<allValueIndicies.length; i++)
    {
      int currentIndex = allValueIndicies[i];
      String orderedValue = currentIndex <= maximumIndex ? allUnorderedValues.get(unorderedIndex) : null;
      Position orderedPosition = currentIndex <= maximumIndex ? allUnorderedPositions.get(unorderedIndex++) : null;

      allRulePartValues[i].setValue(orderedValue);
      allRulePartValues[i].setPosition(orderedPosition);
    }

    return allRulePartValues;
  }

  // line 211 "../../../../src/Parser_Code.ump"
   public boolean hasInnerNames(){
    return getName() != null && getName().indexOf(",") != -1;
  }

  // line 216 "../../../../src/Parser_Code.ump"
   public boolean isStatic(){
    return Type.Static.equals(getType());
  }

  // line 221 "../../../../src/Parser_Code.ump"
   public boolean isMultiWord(){
    return getName().startsWith("**");
  }

  // line 226 "../../../../src/Parser_Code.ump"
   public boolean isToEndOfLine(){
    return !isMultiWord() && getName().startsWith("*");
  }

  // line 230 "../../../../src/Parser_Code.ump"
   public boolean isAlphanumeric(){
    return getName().startsWith("~");
  }

  // line 236 "../../../../src/Parser_Code.ump"
   public boolean isVariable(){
    return Type.Variable.equals(getType());
  }

  // line 241 "../../../../src/Parser_Code.ump"
   public boolean isEnum(){
    return isVariable() && name != null && name.startsWith("=");
  }

  // line 245 "../../../../src/Parser_Code.ump"
   public boolean isRegex(){
    return isVariable() && name != null && name.startsWith("!");
  }

  // line 249 "../../../../src/Parser_Code.ump"
   public String getRegex(){
    if (name == null)
    {
      return null;
    }

    TextParser parser = new TextParser(name);
    parser.nextAfter(":");

    if (parser.peek() == null)
    {
      return null;
    }
    return parser.nextLine();
  }

  // line 266 "../../../../src/Parser_Code.ump"
   public String[] getEnums(){
    if (name == null)
    {
      return new String[0];
    }

    TextParser parser = new TextParser(name);
    parser.nextAfter(":");

    if (parser.peek() == null)
    {
      return new String[] {getDisplayName()}; 
    }

    ArrayList<String> allEnums = new ArrayList<String>();
    while (parser.nextUntil("|") != null)
    {
      allEnums.add(parser.name());
      parser.nextAt("|");
    }
    return allEnums.toArray(new String[allEnums.size()]);
  }

  // line 290 "../../../../src/Parser_Code.ump"
   public boolean isEnumValue(String input){
    if (!isEnum() || input == null)
    {
      return false;
    }

    for (String aEnum : getEnums())
    {
      if (aEnum.equals(input))
      {
        return true;
      }
    }
    return false;
  }

  // line 306 "../../../../src/Parser_Code.ump"
   public boolean regexMatches(String input){
    String regex = getRegex();
    if (regex == null || input == null || !isRegex())
    {
      return false;
    }
    return input.matches(regex);
  }

  // line 316 "../../../../src/Parser_Code.ump"
   public boolean isRule(){
    return Type.Rule.equals(getType());
  }

  // line 322 "../../../../src/Parser_Code.ump"
   public boolean isOne(){
    return "1".equals(getMultiplicity());
  }

  // line 327 "../../../../src/Parser_Code.ump"
   public boolean isOptional(){
    return "?".equals(getMultiplicity());
  }

  // line 332 "../../../../src/Parser_Code.ump"
   public boolean isMany(){
    return "*".equals(getMultiplicity());
  }

  // line 337 "../../../../src/Parser_Code.ump"
   public boolean isAnonymous(){
    return getName().startsWith("anonymous::");
  }

  // line 342 "../../../../src/Parser_Code.ump"
   public String toString(){
    StringBuffer answer = new StringBuffer();
    answer.append("Nexts:");
    for (int i=0; i<nextIdentifiers.size(); i++)
    {
      answer.append("[" + nextIdentifiers.get(i) + "]");
    }
    answer.append("\n");
    return answer.toString();
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser;
import java.util.regex.*;
import java.util.*;

/**
 * Fundamental to all parsing, used in conjunction with rules and their definitions.
 * As parsing is taking place these will indicate what is currently being looked for
 * (such as a class definition or attribute) and helps to keep
 * track of the positions that the input parser parsed things at.
 * Copyright: All contributers to the Umple Project
 * 
 * This file is made available subject to the open source license found at:
 * http://umple.org/license
 */
// line 86 "../../../../src/ParseUtilities.ump"
// line 10 "../../../../src/ParseUtilities_Code.ump"
public class Token
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Token Attributes
  private String name;
  private String value;

  //Token Associations
  private List<Token> subTokens;
  private Position position;
  private Position endPosition;
  private Token parentToken;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Token(String aName, String aValue)
  {
    name = aName;
    value = aValue;
    subTokens = new ArrayList<Token>();
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

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  /**
   * The name of the token.
   */
  public String getName()
  {
    // line 97 "../../../../src/ParseUtilities.ump"
    if (name == null) { return ""; }
    // END OF UMPLE BEFORE INJECTION
    return name;
  }

  /**
   * The value of the token.
   */
  public String getValue()
  {
    // line 98 "../../../../src/ParseUtilities.ump"
    if (value == null) { return ""; }
    // END OF UMPLE BEFORE INJECTION
    return value;
  }
  /* Code from template association_GetMany */
  public Token getSubToken(int index)
  {
    Token aSubToken = subTokens.get(index);
    return aSubToken;
  }

  public List<Token> getSubTokens()
  {
    List<Token> newSubTokens = Collections.unmodifiableList(subTokens);
    return newSubTokens;
  }

  public int numberOfSubTokens()
  {
    int number = subTokens.size();
    return number;
  }

  public boolean hasSubTokens()
  {
    boolean has = subTokens.size() > 0;
    return has;
  }

  public int indexOfSubToken(Token aSubToken)
  {
    int index = subTokens.indexOf(aSubToken);
    return index;
  }
  /* Code from template association_GetOne */
  public Position getPosition()
  {
    return position;
  }

  public boolean hasPosition()
  {
    boolean has = position != null;
    return has;
  }
  /* Code from template association_GetOne */
  public Position getEndPosition()
  {
    return endPosition;
  }

  public boolean hasEndPosition()
  {
    boolean has = endPosition != null;
    return has;
  }
  /* Code from template association_GetOne */
  public Token getParentToken()
  {
    return parentToken;
  }

  public boolean hasParentToken()
  {
    boolean has = parentToken != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSubTokens()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addSubToken(Token aSubToken)
  {
    boolean wasAdded = false;
    if (subTokens.contains(aSubToken)) { return false; }
    Token existingParentToken = aSubToken.getParentToken();
    if (existingParentToken == null)
    {
      aSubToken.setParentToken(this);
    }
    else if (!this.equals(existingParentToken))
    {
      existingParentToken.removeSubToken(aSubToken);
      addSubToken(aSubToken);
    }
    else
    {
      subTokens.add(aSubToken);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeSubToken(Token aSubToken)
  {
    boolean wasRemoved = false;
    if (subTokens.contains(aSubToken))
    {
      subTokens.remove(aSubToken);
      aSubToken.setParentToken(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSubTokenAt(Token aSubToken, int index)
  {  
    boolean wasAdded = false;
    if(addSubToken(aSubToken))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubTokens()) { index = numberOfSubTokens() - 1; }
      subTokens.remove(aSubToken);
      subTokens.add(index, aSubToken);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSubTokenAt(Token aSubToken, int index)
  {
    boolean wasAdded = false;
    if(subTokens.contains(aSubToken))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubTokens()) { index = numberOfSubTokens() - 1; }
      subTokens.remove(aSubToken);
      subTokens.add(index, aSubToken);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSubTokenAt(aSubToken, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setPosition(Position aNewPosition)
  {
    boolean wasSet = false;
    // line 100 "../../../../src/ParseUtilities.ump"
    String tFilename = position == null ? aNewPosition.getFilename() : position.getFilename();
    // END OF UMPLE BEFORE INJECTION
    position = aNewPosition;
    wasSet = true;
    // line 101 "../../../../src/ParseUtilities.ump"
    position.setFilename(tFilename);
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setEndPosition(Position aNewEndPosition)
  {
    boolean wasSet = false;
    endPosition = aNewEndPosition;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setParentToken(Token aParentToken)
  {
    boolean wasSet = false;
    Token existingParentToken = parentToken;
    parentToken = aParentToken;
    if (existingParentToken != null && !existingParentToken.equals(aParentToken))
    {
      existingParentToken.removeSubToken(this);
    }
    if (aParentToken != null)
    {
      aParentToken.addSubToken(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !subTokens.isEmpty() )
    {
      subTokens.get(0).setParentToken(null);
    }
    position = null;
    endPosition = null;
    if (parentToken != null)
    {
      Token placeholderParentToken = parentToken;
      this.parentToken = null;
      placeholderParentToken.removeSubToken(this);
    }
  }

  // line 15 "../../../../src/ParseUtilities_Code.ump"
   public  Token(String aName, String aValue, Position aPosition){
    this(aName,aValue);
    setPosition(aPosition);
  }

  // line 20 "../../../../src/ParseUtilities_Code.ump"
   public static  boolean isValidIdentifier(String identifier, String prefix){
    String _prefix = "^" + prefix;
    String body = "[a-zA-Z0-9_]*$";
    String expression = _prefix + body;
    if(Pattern.matches(expression, identifier)){
    	return true;
    }
    return false;
  }

  // line 30 "../../../../src/ParseUtilities_Code.ump"
   public static  boolean isValidIdentifier(String identifier){
    return isValidIdentifier(identifier, "[a-zA-Z_]");
  }

  // line 35 "../../../../src/ParseUtilities_Code.ump"
   public void addSubToken(int index, Token aSubToken){
    subTokens.add(index,aSubToken);
  }

  // line 40 "../../../../src/ParseUtilities_Code.ump"
   public Position getPosition(String tokenName){
    Token t = getSubToken(tokenName);
    if (t != null)
    {
      return t.getPosition();
    }
    else
    {
      return null;
    }
  }

  // line 53 "../../../../src/ParseUtilities_Code.ump"
   public int getInnerLength(){
    if ("START_TOKEN".equals(getValue()))
    {
      return getLength(); 
    }
    else if (isStatic())
    {
      return getName().length();
    }
    else
    {
      return getValue().length();
    }
  }

  // line 69 "../../../../src/ParseUtilities_Code.ump"
   public int getLength(){
    if (getParentToken() != null)
    {
      Token parent = getParentToken();
      Token grandParent = parent.getParentToken();
      int startOffset = this.getPosition().getOffset();
      int myIndex = getParentToken().indexOfSubToken(this);
      int nextIndex = myIndex + 1;

      boolean hasMoreSiblings = nextIndex < getParentToken().numberOfSubTokens();

      if (hasMoreSiblings)
      {
        return parent.getSubToken(nextIndex).getPosition().getOffset() - startOffset;
      }
      else 
      {
        if (grandParent != null)
        {
          int myParentIndex = grandParent.indexOfSubToken(parent);
          int nextParentIndex = myParentIndex + 1;
          boolean hasMoreParentSiblings = nextParentIndex < grandParent.numberOfSubTokens();
          if (hasMoreParentSiblings)
          {
            return grandParent.getSubToken(nextParentIndex).getPosition().getOffset() - startOffset;
          }
        }
        Token currentToken = this;
        Token lastToken = this;
        while (currentToken.numberOfSubTokens() > 0)
        {
          lastToken = currentToken.getSubToken(currentToken.numberOfSubTokens() - 1);
          currentToken = lastToken;
        }
        return lastToken.getPosition().getOffset() + lastToken.getValue().length() - getPosition().getOffset();
      }
    }
    else if (numberOfSubTokens() == 0)
    {
      return getValue().length();
    }
    else
    {
      Token currentParent = this;
      Token lastSubToken = null;
      while (currentParent.numberOfSubTokens() > 0)
      {
        lastSubToken = currentParent.getSubToken(currentParent.numberOfSubTokens() - 1);
        currentParent = lastSubToken;
      }
      return lastSubToken.getPosition().getOffset() + lastSubToken.getValue().length() - getPosition().getOffset();  
    }
  }

  // line 124 "../../../../src/ParseUtilities_Code.ump"
   public int getIntValue(String tokenName){
    return getIntValue(tokenName,0);
  }

  // line 129 "../../../../src/ParseUtilities_Code.ump"
   public int getIntValue(String tokenName, int defaultIfInvalid){
    String value = getValue(tokenName);
    if (value == null)
    {
      return defaultIfInvalid;
    }
    else
    {
      try
      {
        return Integer.parseInt(value);
      }
      catch (NumberFormatException e)
      {
        return defaultIfInvalid;
      }
    }
  }

  // line 149 "../../../../src/ParseUtilities_Code.ump"
   public Token getSubToken(String tokenName, int offset){
    if (is(tokenName))
    {
      return this;
    }
    else
    {
      int currentOffset = 0;
      for (Token t : subTokens)
      {
        if (t.is(tokenName))
        {
          if (currentOffset == offset)
          {
            return t;  
          }
          currentOffset += 1;  
        }
      }
    }
    return null;
  }

  // line 173 "../../../../src/ParseUtilities_Code.ump"
   public Token getSubToken(String tokenName){
    return getSubToken(tokenName,0);
  }


  /**
   * Get the value of the named subtoken
   */
  // line 179 "../../../../src/ParseUtilities_Code.ump"
   public String getValue(String tokenName){
    // line 98 "../../../../src/ParseUtilities.ump"
    if (value == null) { return ""; }
    // END OF UMPLE BEFORE INJECTION
    Token t = getSubToken(tokenName);
    if (t != null)
    {
      return t.getValue();
    }
    else
    {
      // This should be "", as getValue() returns "" by default
      return null;
    }
  }

  // line 193 "../../../../src/ParseUtilities_Code.ump"
   public boolean is(String aName){
    return getName().equals(aName) && !isStatic();
  }

  // line 198 "../../../../src/ParseUtilities_Code.ump"
   public boolean isStatic(String aName){
    return getName().equals(aName) && isStatic();
  }

  // line 203 "../../../../src/ParseUtilities_Code.ump"
   public boolean isStatic(){
    return "STATIC".equals(getValue());
  }

  // line 208 "../../../../src/ParseUtilities_Code.ump"
   public boolean isValue(String compareTo){
    return getValue().equals(compareTo);
  }

  // line 213 "../../../../src/ParseUtilities_Code.ump"
   public void remove(int index){
    if (index < 0 || index >= subTokens.size())
    {
      return;
    }
    subTokens.remove(index);
  }

  // line 222 "../../../../src/ParseUtilities_Code.ump"
   public String toString(){
    StringBuffer answer = new StringBuffer();
    toString(answer,null);
    return answer.toString();
  }


  /**
   * Code refactored from Parser class to Token class
   */
  // line 230 "../../../../src/ParseUtilities_Code.ump"
   public StringBuffer toString(StringBuffer stringSoFar, Token parserRoot){
    if ("START_TOKEN".equals(getValue()))
    {
      stringSoFar.append("[" + getName() + "]");
    }
    else if ("STATIC".equals(getValue()))
    {
      //ignore
    }
    else if (parserRoot == null || !this.equals(parserRoot))
    {
      stringSoFar.append("[" + getName() + ":" + getValue() + "]");
    }

    for(Token subToken : getSubTokens())
    {
      subToken.toString(stringSoFar,null);
    }
    return stringSoFar;
  }


  /**
   * Set name to flattened string of all child sub-tokens and remove them
   */
  // line 253 "../../../../src/ParseUtilities_Code.ump"
   public void flatten(){
    StringBuffer answer = new StringBuffer();
    flattenValues(answer);
    setValue(answer.toString());
    subTokens.clear();
  }


  /**
   * Return string buffer with flattened value of tokens
   */
  // line 262 "../../../../src/ParseUtilities_Code.ump"
   public StringBuffer flattenValues(StringBuffer stringSoFar){
    if ("START_TOKEN".equals(getValue()))
    {
      //ignore
    }
    else if ("STATIC".equals(getValue()))
    {
      stringSoFar.append(getName());
    }
    else
    {
      stringSoFar.append(getValue());
    }
    for(Token subToken : getSubTokens())
    {
      subToken.flattenValues(stringSoFar);
    }
    return stringSoFar;
  }


  /**
   * Recursively flattens a particular token name from bottom up
   */
  // line 284 "../../../../src/ParseUtilities_Code.ump"
   public void flattenNameRecursive(String tokenName){
    for (Token t : subTokens)
    {
      t.flattenNameRecursive(tokenName);
    }

    if (is(tokenName)) {
      flatten();
    }
  }


  /**
   * Return a copy of the current token with all its SubTokens
   * Removes all SubTokens from the current Token and sets new name and value
   */
  // line 297 "../../../../src/ParseUtilities_Code.ump"
   public Token detach(String newName, String newValue){
    Token nToken = this.shallowCopy();
    setName(newName);
    setValue(newValue);
    ArrayList<Token> subTokenList = new ArrayList<Token>(subTokens);
    for(Token t : subTokenList)
    {
      nToken.addSubToken(t);
      this.removeSubToken(t);
    }
    return nToken;
  }

  // line 310 "../../../../src/ParseUtilities_Code.ump"
   public Token copy(){
    Token nToken = shallowCopy();
    for (Token t : subTokens)
    {
      nToken.addSubToken(t.copy());    
    }
    return nToken;
  }

  // line 320 "../../../../src/ParseUtilities_Code.ump"
   private Token shallowCopy(){
    Token nToken = new Token(this.getName()+"", this.getValue()+"");
    if (getPosition() != null)
    {
      nToken.setPosition(getPosition().copy());      
    }
    if (getEndPosition() != null)
    {
      nToken.setEndPosition(getEndPosition().copy());
    }
    return nToken;
  }


  /**
   * for issue#1521
   */
  // line 335 "../../../../src/ParseUtilities_Code.ump"
   public boolean removeSubTokenNotSetParentToken(Token aSubToken){
    boolean wasRemoved = false;
    if (subTokens.contains(aSubToken))
    {
      subTokens.remove(aSubToken);
      //aSubToken.setParentToken(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser;
import java.nio.file.*;

/**
 * Used to indicate the coordinates of a position when parsing.  This is done by keeping track of the
 * filename, the line number and the corresponding offset on that line number.
 */
// line 108 "../../../../src/ParseUtilities.ump"
// line 346 "../../../../src/ParseUtilities_Code.ump"
public class Position
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Position Attributes
  private String filename;
  private int lineNumber;
  private int characterOffset;
  private int offset;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetFilename;
  private boolean canSetLineNumber;
  private boolean canSetCharacterOffset;
  private boolean canSetOffset;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Position(String aFilename, int aLineNumber, int aCharacterOffset, int aOffset)
  {
    cachedHashCode = -1;
    canSetFilename = true;
    canSetLineNumber = true;
    canSetCharacterOffset = true;
    canSetOffset = true;
    filename = aFilename;
    lineNumber = aLineNumber;
    characterOffset = aCharacterOffset;
    offset = aOffset;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFilename(String aFilename)
  {
    boolean wasSet = false;
    if (!canSetFilename) { return false; }
    filename = aFilename;
    wasSet = true;
    return wasSet;
  }

  public boolean setLineNumber(int aLineNumber)
  {
    boolean wasSet = false;
    if (!canSetLineNumber) { return false; }
    lineNumber = aLineNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setCharacterOffset(int aCharacterOffset)
  {
    boolean wasSet = false;
    if (!canSetCharacterOffset) { return false; }
    characterOffset = aCharacterOffset;
    wasSet = true;
    return wasSet;
  }

  public boolean setOffset(int aOffset)
  {
    boolean wasSet = false;
    if (!canSetOffset) { return false; }
    offset = aOffset;
    wasSet = true;
    return wasSet;
  }

  /**
   * The filename of the position.
   */
  public String getFilename()
  {
    return filename;
  }

  /**
   * The line number of the position.
   */
  public int getLineNumber()
  {
    return lineNumber;
  }

  /**
   * The character offset of the position.
   */
  public int getCharacterOffset()
  {
    return characterOffset;
  }

  /**
   * The offset of the position.
   */
  public int getOffset()
  {
    return offset;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Position compareTo = (Position)obj;
  
    if (getFilename() == null && compareTo.getFilename() != null)
    {
      return false;
    }
    else if (getFilename() != null && !getFilename().equals(compareTo.getFilename()))
    {
      return false;
    }

    if (getLineNumber() != compareTo.getLineNumber())
    {
      return false;
    }

    if (getCharacterOffset() != compareTo.getCharacterOffset())
    {
      return false;
    }

    if (getOffset() != compareTo.getOffset())
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getFilename() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getFilename().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    cachedHashCode = cachedHashCode * 23 + getLineNumber();

    cachedHashCode = cachedHashCode * 23 + getCharacterOffset();

    cachedHashCode = cachedHashCode * 23 + getOffset();

    canSetFilename = false;
    canSetLineNumber = false;
    canSetCharacterOffset = false;
    canSetOffset = false;
    return cachedHashCode;
  }

  public void delete()
  {}

  // line 352 "../../../../src/ParseUtilities_Code.ump"
   public  Position(int aLineNumber, int aCharacterOffset, int aOffset){
    this(null, aLineNumber, aCharacterOffset, aOffset);
  }

  // line 357 "../../../../src/ParseUtilities_Code.ump"
   public Position copy(){
    return new Position(filename,lineNumber,characterOffset,offset);
  }

  // line 362 "../../../../src/ParseUtilities_Code.ump"
   public Position add(Position more){
    String tfile = filename == null ? more.getFilename() : filename;
    return new Position(filename, getLineNumber() + more.getLineNumber() - 1, getCharacterOffset() + more.getCharacterOffset(), getOffset() + more.getOffset());
  }


  /**
   * extract the line number of the position
   */
  // line 368 "../../../../src/ParseUtilities_Code.ump"
   public int getLineNum(){
    return getLineNumber();
  }

  // line 373 "../../../../src/ParseUtilities_Code.ump"
   public String toString(){
    return "[" + getLineNumber() + "," + getCharacterOffset() + "]";
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * Fragment source file: Umple.ump
 * Line : 166
 * An UmpleElement is one of the top-level items found in an Umple model
 * Currently it has one subclass, UmpleClassifier
 * 
 */
// line 153 "../../../../src/Trait_refactored.ump"
// line 118 "../../../../src/Umple.ump"
// line 368 "../../../../src/Umple_Code.ump"
public class UmpleElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleElement Attributes
  private String name;
  private String modifier;
  private boolean hasMainMethod;
  private List<String> namespaces;
  private NameSpace nameSpace;
  private String packageName;

  /**
   * The code associated with the Umple element.
   */
  private ExtraCode extraCode;
  private boolean isInternal;
  private Coordinate coordinates;
  private String displayColor;

  //UmpleElement Associations
  private List<Position> positions;
  private List<Position> endPositions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleElement(String aName)
  {
    name = aName;
    modifier = null;
    hasMainMethod = false;
    namespaces = new ArrayList<String>();
    nameSpace = new NameSpace("",new Position("", 0, 0, 0));
    packageName = "";
    extraCode = new ExtraCode();
    isInternal = false;
    coordinates = new Coordinate(-1,-1,-1,-1);
    displayColor = "";
    positions = new ArrayList<Position>();
    endPositions = new ArrayList<Position>();
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

  public boolean setModifier(String aModifier)
  {
    boolean wasSet = false;
    modifier = aModifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setHasMainMethod(boolean aHasMainMethod)
  {
    boolean wasSet = false;
    hasMainMethod = aHasMainMethod;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addNamespace(String aNamespace)
  {
    boolean wasAdded = false;
    wasAdded = namespaces.add(aNamespace);
    return wasAdded;
  }

  public boolean removeNamespace(String aNamespace)
  {
    boolean wasRemoved = false;
    wasRemoved = namespaces.remove(aNamespace);
    return wasRemoved;
  }

  public boolean setNameSpace(NameSpace aNameSpace)
  {
    boolean wasSet = false;
    nameSpace = aNameSpace;
    wasSet = true;
    return wasSet;
  }

  public boolean setPackageName(String aPackageName)
  {
    boolean wasSet = false;
    // line 152 "../../../../src/Umple.ump"
    if (aPackageName == null) { return false; }
    // END OF UMPLE BEFORE INJECTION
    packageName = aPackageName;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInternal(boolean aIsInternal)
  {
    boolean wasSet = false;
    isInternal = aIsInternal;
    wasSet = true;
    return wasSet;
  }

  public boolean setCoordinates(Coordinate aCoordinates)
  {
    boolean wasSet = false;
    coordinates = aCoordinates;
    wasSet = true;
    return wasSet;
  }

  public boolean setDisplayColor(String aDisplayColor)
  {
    boolean wasSet = false;
    displayColor = aDisplayColor;
    wasSet = true;
    return wasSet;
  }

  /**
   * The name of the Umple element.
   */
  public String getName()
  {
    return name;
  }

  /**
   * The modifier associated with the Umple element.
   */
  public String getModifier()
  {
    return modifier;
  }

  public boolean getHasMainMethod()
  {
    return hasMainMethod;
  }
  /* Code from template attribute_GetMany */
  public String getNamespace(int index)
  {
    String aNamespace = namespaces.get(index);
    return aNamespace;
  }

  public String[] getNamespaces()
  {
    String[] newNamespaces = namespaces.toArray(new String[namespaces.size()]);
    return newNamespaces;
  }

  public int numberOfNamespaces()
  {
    int number = namespaces.size();
    return number;
  }

  public boolean hasNamespaces()
  {
    boolean has = namespaces.size() > 0;
    return has;
  }

  public int indexOfNamespace(String aNamespace)
  {
    int index = namespaces.indexOf(aNamespace);
    return index;
  }

  public NameSpace getNameSpace()
  {
    return nameSpace;
  }

  public String getPackageName()
  {
    return packageName;
  }

  /**
   * Specifies whether or not the Umple element is internal.
   */
  public boolean getIsInternal()
  {
    return isInternal;
  }

  /**
   * Specifies the position of this Umple element (ex. The UmpleOnline diagram).
   */
  public Coordinate getCoordinates()
  {
    return coordinates;
  }

  /**
   * Specifies the display color of this element
   */
  public String getDisplayColor()
  {
    return displayColor;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isHasMainMethod()
  {
    return hasMainMethod;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInternal()
  {
    return isInternal;
  }
  /* Code from template association_GetMany */
  public Position getPosition(int index)
  {
    Position aPosition = positions.get(index);
    return aPosition;
  }

  /**
   * The position(s) of the element in the source code, used in debugging
   * may have multiple positions in the case of mixins
   */
  public List<Position> getPositions()
  {
    List<Position> newPositions = Collections.unmodifiableList(positions);
    return newPositions;
  }

  public int numberOfPositions()
  {
    int number = positions.size();
    return number;
  }

  public boolean hasPositions()
  {
    boolean has = positions.size() > 0;
    return has;
  }

  public int indexOfPosition(Position aPosition)
  {
    int index = positions.indexOf(aPosition);
    return index;
  }
  /* Code from template association_GetMany */
  public Position getEndPosition(int index)
  {
    Position aEndPosition = endPositions.get(index);
    return aEndPosition;
  }

  /**
   * Kept aligned with positions
   */
  public List<Position> getEndPositions()
  {
    List<Position> newEndPositions = Collections.unmodifiableList(endPositions);
    return newEndPositions;
  }

  public int numberOfEndPositions()
  {
    int number = endPositions.size();
    return number;
  }

  public boolean hasEndPositions()
  {
    boolean has = endPositions.size() > 0;
    return has;
  }

  public int indexOfEndPosition(Position aEndPosition)
  {
    int index = endPositions.indexOf(aEndPosition);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPositions()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addPosition(Position aPosition)
  {
    boolean wasAdded = false;
    if (positions.contains(aPosition)) { return false; }
    positions.add(aPosition);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePosition(Position aPosition)
  {
    boolean wasRemoved = false;
    if (positions.contains(aPosition))
    {
      positions.remove(aPosition);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPositionAt(Position aPosition, int index)
  {  
    boolean wasAdded = false;
    if(addPosition(aPosition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPositions()) { index = numberOfPositions() - 1; }
      positions.remove(aPosition);
      positions.add(index, aPosition);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePositionAt(Position aPosition, int index)
  {
    boolean wasAdded = false;
    if(positions.contains(aPosition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPositions()) { index = numberOfPositions() - 1; }
      positions.remove(aPosition);
      positions.add(index, aPosition);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPositionAt(aPosition, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEndPositions()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addEndPosition(Position aEndPosition)
  {
    boolean wasAdded = false;
    if (endPositions.contains(aEndPosition)) { return false; }
    endPositions.add(aEndPosition);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEndPosition(Position aEndPosition)
  {
    boolean wasRemoved = false;
    if (endPositions.contains(aEndPosition))
    {
      endPositions.remove(aEndPosition);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEndPositionAt(Position aEndPosition, int index)
  {  
    boolean wasAdded = false;
    if(addEndPosition(aEndPosition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEndPositions()) { index = numberOfEndPositions() - 1; }
      endPositions.remove(aEndPosition);
      endPositions.add(index, aEndPosition);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEndPositionAt(Position aEndPosition, int index)
  {
    boolean wasAdded = false;
    if(endPositions.contains(aEndPosition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEndPositions()) { index = numberOfEndPositions() - 1; }
      endPositions.remove(aEndPosition);
      endPositions.add(index, aEndPosition);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEndPositionAt(aEndPosition, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    positions.clear();
    endPositions.clear();
  }

  // line 153 "../../../../src/Trait_refactored.ump"
  public boolean isUmpleTrait(){
    return false;
  }


  /**
   * Methods to distinguish the subclass types
   */
  // line 155 "../../../../src/Umple.ump"
  public boolean isUmpleClass(){
    return false;
  }

  // line 156 "../../../../src/Umple.ump"
  public boolean isUmpleInterface(){
    return false;
  }

  // line 372 "../../../../src/Umple_Code.ump"
   public void appendExtraCode(String newCode){
    appendExtraCode(newCode,true);
  }

  // line 377 "../../../../src/Umple_Code.ump"
   public void resetExtraCode(){
    extraCode = new ExtraCode();
  }

  // line 382 "../../../../src/Umple_Code.ump"
   public void appendExtraCode(String newCode, boolean addNewline){
    if (newCode == null)
    {
      return;
    }
    if (extraCode.getHasCode() && addNewline)
    {
      newCode = System.getProperty("line.separator") + newCode;
    }
    extraCode.appendExtraCode(newCode);
  }

  // line 395 "../../../../src/Umple_Code.ump"
   public void appendExtraCode(boolean flag, CodeBlock cb){
    extraCode.appendExtraCode(cb);
  }

  // line 400 "../../../../src/Umple_Code.ump"
   public boolean hasExtraCode(){
    return extraCode.getHasCode();
  }

  // line 405 "../../../../src/Umple_Code.ump"
   public String getExtraCode(){
    return extraCode.getExtraCode();
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "modifier" + ":" + getModifier()+ "," +
            "hasMainMethod" + ":" + getHasMainMethod()+ "," +
            "packageName" + ":" + getPackageName()+ "," +
            "isInternal" + ":" + getIsInternal()+ "," +
            "displayColor" + ":" + getDisplayColor()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "nameSpace" + "=" + (getNameSpace() != null ? !getNameSpace().equals(this)  ? getNameSpace().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "coordinates" + "=" + (getCoordinates() != null ? !getCoordinates().equals(this)  ? getCoordinates().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
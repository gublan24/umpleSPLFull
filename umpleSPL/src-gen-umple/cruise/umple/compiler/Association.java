/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * Represents an association, typically between two Umple classes (1-1, 1-*, *-1, etc).
 * An association in UML/Umple represents a relationship that exists at run time
 * where instances of one class reference the other, and (if bidirectional) instance
 * of the other class reference the first cass.
 * The number of references is governed by the Multiplicity at each AssociationEnd
 */
// line 8 "../../../../src/Umple_CodeAssociation.ump"
// line 971 "../../../../src/Umple.ump"
public class Association
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Association Attributes
  private String name;
  private boolean isLeftNavigable;
  private boolean isRightNavigable;
  private boolean isLeftComposition;
  private boolean isRightComposition;
  private List<Coordinate> positions;
  private Position tokenPosition;
  private Position tokenEndPosition;
  private boolean immutable;
  private boolean isSpecialized;
  private boolean isSpecialization;
  private String commonClassName;

  //Association State Machines
  public enum Source { none, fTrait }
  private Source source;

  //Association Associations
  private List<AssociationEnd> ends;
  private List<Association> specializedAssociations;
  private Association specializedFrom;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Association(boolean aIsLeftNavigable, boolean aIsRightNavigable, boolean aIsLeftComposition, boolean aIsRightComposition, AssociationEnd... allEnds)
  {
    name = null;
    isLeftNavigable = aIsLeftNavigable;
    isRightNavigable = aIsRightNavigable;
    isLeftComposition = aIsLeftComposition;
    isRightComposition = aIsRightComposition;
    positions = new ArrayList<Coordinate>();
    tokenPosition = null;
    tokenEndPosition = null;
    immutable = false;
    isSpecialized = false;
    isSpecialization = false;
    commonClassName = "";
    ends = new ArrayList<AssociationEnd>();
    boolean didAddEnds = setEnds(allEnds);
    if (!didAddEnds)
    {
      throw new RuntimeException("Unable to create Association, must have 2 ends. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    specializedAssociations = new ArrayList<Association>();
    setSource(Source.none);
    // line 1004 "../../../../src/Umple.ump"
    this.setLeftAndRight();
    // END OF UMPLE AFTER INJECTION
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

  public boolean setIsLeftNavigable(boolean aIsLeftNavigable)
  {
    boolean wasSet = false;
    isLeftNavigable = aIsLeftNavigable;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsRightNavigable(boolean aIsRightNavigable)
  {
    boolean wasSet = false;
    isRightNavigable = aIsRightNavigable;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsLeftComposition(boolean aIsLeftComposition)
  {
    boolean wasSet = false;
    isLeftComposition = aIsLeftComposition;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsRightComposition(boolean aIsRightComposition)
  {
    boolean wasSet = false;
    isRightComposition = aIsRightComposition;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addPosition(Coordinate aPosition)
  {
    boolean wasAdded = false;
    wasAdded = positions.add(aPosition);
    return wasAdded;
  }

  public boolean removePosition(Coordinate aPosition)
  {
    boolean wasRemoved = false;
    wasRemoved = positions.remove(aPosition);
    return wasRemoved;
  }

  public boolean setTokenPosition(Position aTokenPosition)
  {
    boolean wasSet = false;
    tokenPosition = aTokenPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setTokenEndPosition(Position aTokenEndPosition)
  {
    boolean wasSet = false;
    tokenEndPosition = aTokenEndPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsSpecialized(boolean aIsSpecialized)
  {
    boolean wasSet = false;
    isSpecialized = aIsSpecialized;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsSpecialization(boolean aIsSpecialization)
  {
    boolean wasSet = false;
    isSpecialization = aIsSpecialization;
    wasSet = true;
    return wasSet;
  }

  public boolean setCommonClassName(String aCommonClassName)
  {
    boolean wasSet = false;
    commonClassName = aCommonClassName;
    wasSet = true;
    return wasSet;
  }

  /**
   * The name of the association.
   */
  public String getName()
  {
    // line 1003 "../../../../src/Umple.ump"
    if (!isNamed()) { return this.deriveName(); }
    // END OF UMPLE BEFORE INJECTION
    return name;
  }

  public boolean getIsLeftNavigable()
  {
    return isLeftNavigable;
  }

  public boolean getIsRightNavigable()
  {
    return isRightNavigable;
  }

  public boolean getIsLeftComposition()
  {
    return isLeftComposition;
  }

  public boolean getIsRightComposition()
  {
    return isRightComposition;
  }
  /* Code from template attribute_GetMany */
  public Coordinate getPosition(int index)
  {
    Coordinate aPosition = positions.get(index);
    return aPosition;
  }

  public Coordinate[] getPositions()
  {
    Coordinate[] newPositions = positions.toArray(new Coordinate[positions.size()]);
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

  public int indexOfPosition(Coordinate aPosition)
  {
    int index = positions.indexOf(aPosition);
    return index;
  }

  public Position getTokenPosition()
  {
    return tokenPosition;
  }

  public Position getTokenEndPosition()
  {
    return tokenEndPosition;
  }

  public boolean getNamed()
  {
    return name != null && !"".equals(name);
  }

  public boolean getIsSpecialized()
  {
    return isSpecialized;
  }

  public boolean getIsSpecialization()
  {
    return isSpecialization;
  }

  /**
   * name of the class this association shares with its parent
   */
  public String getCommonClassName()
  {
    return commonClassName;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsLeftNavigable()
  {
    return isLeftNavigable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsRightNavigable()
  {
    return isRightNavigable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsLeftComposition()
  {
    return isLeftComposition;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsRightComposition()
  {
    return isRightComposition;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isNamed()
  {
    return name != null && !"".equals(name);
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsSpecialized()
  {
    return isSpecialized;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsSpecialization()
  {
    return isSpecialization;
  }

  public String getSourceFullName()
  {
    String answer = source.toString();
    return answer;
  }

  public Source getSource()
  {
    return source;
  }

  public boolean setSource(Source aSource)
  {
    source = aSource;
    return true;
  }
  /* Code from template association_GetMany */
  public AssociationEnd getEnd(int index)
  {
    AssociationEnd aEnd = ends.get(index);
    return aEnd;
  }

  public List<AssociationEnd> getEnds()
  {
    List<AssociationEnd> newEnds = Collections.unmodifiableList(ends);
    return newEnds;
  }

  public int numberOfEnds()
  {
    int number = ends.size();
    return number;
  }

  public boolean hasEnds()
  {
    boolean has = ends.size() > 0;
    return has;
  }

  public int indexOfEnd(AssociationEnd aEnd)
  {
    int index = ends.indexOf(aEnd);
    return index;
  }
  /* Code from template association_GetMany */
  public Association getSpecializedAssociation(int index)
  {
    Association aSpecializedAssociation = specializedAssociations.get(index);
    return aSpecializedAssociation;
  }

  /**
   * code for specialized associations
   * the 0..1 parent -- * specializedAssociations is the code to handle the following:
   * parent denotes which association this one is tightening
   * specializedAssociations is a list of associations that have specialized this "parent" one
   */
  public List<Association> getSpecializedAssociations()
  {
    List<Association> newSpecializedAssociations = Collections.unmodifiableList(specializedAssociations);
    return newSpecializedAssociations;
  }

  public int numberOfSpecializedAssociations()
  {
    int number = specializedAssociations.size();
    return number;
  }

  public boolean hasSpecializedAssociations()
  {
    boolean has = specializedAssociations.size() > 0;
    return has;
  }

  public int indexOfSpecializedAssociation(Association aSpecializedAssociation)
  {
    int index = specializedAssociations.indexOf(aSpecializedAssociation);
    return index;
  }
  /* Code from template association_GetOne */
  public Association getSpecializedFrom()
  {
    return specializedFrom;
  }

  public boolean hasSpecializedFrom()
  {
    boolean has = specializedFrom != null;
    return has;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfEnds()
  {
    return 2;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEnds()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfEnds()
  {
    return 2;
  }
  /* Code from template association_SetNToOptionalOne */
  public boolean setEnds(AssociationEnd... newEnds)
  {
    boolean wasSet = false;
    ArrayList<AssociationEnd> checkNewEnds = new ArrayList<AssociationEnd>();
    for (AssociationEnd aEnd : newEnds)
    {
      if (checkNewEnds.contains(aEnd))
      {
        return wasSet;
      }
      else if (aEnd.getAssociation() != null && !this.equals(aEnd.getAssociation()))
      {
        return wasSet;
      }
      checkNewEnds.add(aEnd);
    }

    if (checkNewEnds.size() != minimumNumberOfEnds())
    {
      return wasSet;
    }

    ends.removeAll(checkNewEnds);
    
    for (AssociationEnd orphan : ends)
    {
      setAssociation(orphan, null);
    }
    ends.clear();
    for (AssociationEnd aEnd : newEnds)
    {
      setAssociation(aEnd, this);
      ends.add(aEnd);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setAssociation(AssociationEnd aEnd, Association aAssociation)
  {
    try
    {
      java.lang.reflect.Field mentorField = aEnd.getClass().getDeclaredField("association");
      mentorField.setAccessible(true);
      mentorField.set(aEnd, aAssociation);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aAssociation to aEnd", e);
    }
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSpecializedAssociations()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addSpecializedAssociation(Association aSpecializedAssociation)
  {
    boolean wasAdded = false;
    if (specializedAssociations.contains(aSpecializedAssociation)) { return false; }
    Association existingSpecializedFrom = aSpecializedAssociation.getSpecializedFrom();
    if (existingSpecializedFrom == null)
    {
      aSpecializedAssociation.setSpecializedFrom(this);
    }
    else if (!this.equals(existingSpecializedFrom))
    {
      existingSpecializedFrom.removeSpecializedAssociation(aSpecializedAssociation);
      addSpecializedAssociation(aSpecializedAssociation);
    }
    else
    {
      specializedAssociations.add(aSpecializedAssociation);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeSpecializedAssociation(Association aSpecializedAssociation)
  {
    boolean wasRemoved = false;
    if (specializedAssociations.contains(aSpecializedAssociation))
    {
      specializedAssociations.remove(aSpecializedAssociation);
      aSpecializedAssociation.setSpecializedFrom(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSpecializedAssociationAt(Association aSpecializedAssociation, int index)
  {  
    boolean wasAdded = false;
    if(addSpecializedAssociation(aSpecializedAssociation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSpecializedAssociations()) { index = numberOfSpecializedAssociations() - 1; }
      specializedAssociations.remove(aSpecializedAssociation);
      specializedAssociations.add(index, aSpecializedAssociation);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSpecializedAssociationAt(Association aSpecializedAssociation, int index)
  {
    boolean wasAdded = false;
    if(specializedAssociations.contains(aSpecializedAssociation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSpecializedAssociations()) { index = numberOfSpecializedAssociations() - 1; }
      specializedAssociations.remove(aSpecializedAssociation);
      specializedAssociations.add(index, aSpecializedAssociation);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSpecializedAssociationAt(aSpecializedAssociation, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setSpecializedFrom(Association aSpecializedFrom)
  {
    boolean wasSet = false;
    Association existingSpecializedFrom = specializedFrom;
    specializedFrom = aSpecializedFrom;
    if (existingSpecializedFrom != null && !existingSpecializedFrom.equals(aSpecializedFrom))
    {
      existingSpecializedFrom.removeSpecializedAssociation(this);
    }
    if (aSpecializedFrom != null)
    {
      aSpecializedFrom.addSpecializedAssociation(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    for(AssociationEnd aEnd : ends)
    {
      setAssociation(aEnd,null);
    }
    ends.clear();
    while( !specializedAssociations.isEmpty() )
    {
      specializedAssociations.get(0).setSpecializedFrom(null);
    }
    if (specializedFrom != null)
    {
      Association placeholderSpecializedFrom = specializedFrom;
      this.specializedFrom = null;
      placeholderSpecializedFrom.removeSpecializedAssociation(this);
    }
  }

  // line 11 "../../../../src/Umple_CodeAssociation.ump"
   public  Association(Association another){
    //Association Attributes
	  this.name = another.getName();
	  this.isLeftNavigable = another.getIsLeftNavigable();
	  this.isRightNavigable = another.getIsRightNavigable();
	  this.isLeftComposition = another.getIsLeftComposition();
	  this.isRightComposition = another.getIsRightComposition();
	  this.positions = new ArrayList<Coordinate>();
	  for (Coordinate coordinate : another.getPositions()) {
		this.positions.add(coordinate);
	  }
	  this.tokenPosition = another.getTokenPosition();
	  this.tokenEndPosition = another.getTokenEndPosition();
	  this.immutable = another.immutable;

	  //Association Associations
	  this.ends = new ArrayList<AssociationEnd>();
	  for (AssociationEnd associationEnd : another.getEnds()) {
		  this.ends.add(new AssociationEnd(associationEnd));
	  }
  }

  // line 34 "../../../../src/Umple_CodeAssociation.ump"
   public void setLeftAndRight(){
    String name = this.getName();

    int underscore = name.indexOf("__");
    String nameOne = name.substring(0,underscore);
    String nameTwo = name.substring(underscore + "__".length(), name.length());

    if (nameOne.compareTo(nameTwo) > 0)
    {

    }
  }

  // line 49 "../../../../src/Umple_CodeAssociation.ump"
   public int whoIsInvalid(){
    if (!getIsLeftNavigable() || !getIsRightNavigable())
    {
      return -1;
    }

    if (getEnd(0).getClassName().equals(getEnd(1).getClassName()))
    {
      if (getEnd(0).getMultiplicity().getLowerBound() != 0)
      {
        return 0;
      }
      else if (getEnd(1).getMultiplicity().getLowerBound() != 0)
      {
        return 1;
      }
    }
    return -1;
  }

  // line 70 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isValid(){
    return whoIsInvalid() == -1;
  }

  // line 75 "../../../../src/Umple_CodeAssociation.ump"
   public String getArrowString(){
    String arrow = "--";
    if (getIsLeftComposition() && !getIsRightComposition() && getIsLeftNavigable() && getIsRightNavigable()) {
    	arrow = "<@>-";
    }
    else if (!getIsLeftComposition() && getIsRightComposition() && getIsLeftNavigable() && getIsRightNavigable()) {
    	arrow = "-<@>";
    }
    else if ( (!getIsLeftNavigable() || !getIsRightNavigable()) && (getIsLeftComposition() || getIsRightComposition())) {
    	arrow = "><";
    }
    else if (getIsRightComposition() && getIsLeftComposition())
    {
      arrow = "><";
    }
    else if (getIsLeftNavigable() && !getIsRightNavigable())
    {
      arrow = "<-";
    }
    else if (!getIsLeftNavigable() && getIsRightNavigable())
    {
      arrow = "->";
    }
    else if (!getIsLeftNavigable() && !getIsRightNavigable())
    {
      arrow = "><";
    }

    return arrow;
  }

  // line 107 "../../../../src/Umple_CodeAssociation.ump"
   public String toGenericString(){
    String leftSide = getEnd(0).toGenericString();
    String rightSide = getEnd(1).toGenericString();


    if (leftSide.equals("n") && rightSide.equals("n") && !getEnd(0).toSimpleString().equals(getEnd(1).toSimpleString()))
    {
      return cruise.umple.util.StringFormatter.format("n {0} m",getArrowString());
    }
    else
    {
      return cruise.umple.util.StringFormatter.format("{0} {1} {2}",leftSide,getArrowString(),rightSide);
    }
  }

  // line 123 "../../../../src/Umple_CodeAssociation.ump"
   public String deriveName(){
    AssociationEnd firstEnd = this.getEnd(0);
    AssociationEnd secondEnd = this.getEnd(1);

    String firstClassName = firstEnd.getClassName();
    String secondClassName = secondEnd.getClassName();

    String firstRole = firstEnd.getDisplayRoleName().equals("") ? "" : ":" + firstEnd.getDisplayRoleName();
    String secondRole = secondEnd.getDisplayRoleName().equals("") ? "" : ":" + secondEnd.getDisplayRoleName();

    if (firstClassName.compareTo(secondClassName) <= 0)
    {
      return firstClassName + firstRole + "__" + secondClassName + secondRole;
    }
    else
    {
      return secondClassName + secondRole + "__" + firstClassName + firstRole;
    }
  }

  // line 144 "../../../../src/Umple_CodeAssociation.ump"
   public void setImmutable(){
    this.immutable = true;
  }

  // line 149 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isImmutable(){
    return this.immutable;
  }

  // line 153 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isComposition(){
    return this.isLeftComposition || this.isRightComposition;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "isLeftNavigable" + ":" + getIsLeftNavigable()+ "," +
            "isRightNavigable" + ":" + getIsRightNavigable()+ "," +
            "isLeftComposition" + ":" + getIsLeftComposition()+ "," +
            "isRightComposition" + ":" + getIsRightComposition()+ "," +
            "named" + ":" + getNamed()+ "," +
            "isSpecialized" + ":" + getIsSpecialized()+ "," +
            "isSpecialization" + ":" + getIsSpecialization()+ "," +
            "commonClassName" + ":" + getCommonClassName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "tokenPosition" + "=" + (getTokenPosition() != null ? !getTokenPosition().equals(this)  ? getTokenPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "tokenEndPosition" + "=" + (getTokenEndPosition() != null ? !getTokenEndPosition().equals(this)  ? getTokenEndPosition().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
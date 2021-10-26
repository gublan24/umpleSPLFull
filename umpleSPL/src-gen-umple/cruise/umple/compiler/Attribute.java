/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * ---------------------------------------------------------------------------------------------
 * ------------------------------------class end------------------------------------------------
 * ---------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------
 * ------------------------------------class start----------------------------------------------
 * ---------------------------------------------------------------------------------------------
 * Fragment source file: Umple.ump
 * Line : 1004
 * Represents an attribute.
 * An attribute is more abstract than an instance variable / property in that
 * it can be derived, and have various other modifiers such as being
 * initialized, lazy (does not appear in constructor and must be initialized
 * after construction), etc.
 */
// line 277 "../../../../src/Umple_Code_Trait.ump"
// line 3 "../../../../src/Umple_CodeAttribute.ump"
// line 27 "../../../../src/Trace_refactored.ump"
// line 915 "../../../../src/Umple.ump"
public class Attribute extends UmpleVariable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Attribute Attributes
  private boolean isAutounique;
  private boolean isUnique;
  private boolean isList;
  private boolean isDerived;
  private boolean isInternalTransient;
  private CodeBlock codeblock;
  private boolean isLazy;
  private boolean isRefinement;
  private boolean isIvar;

  //Attribute State Machines
  public enum Source { none, fTrait }
  private Source source;

  //Attribute Associations
  private List<Comment> comments;
  private Position position;
  private Position endPosition;
  private UmpleClass umpleClass;
  private UmpleTrait umpleTrait;
  private List<TraceRecord> traceRecords;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Attribute(String aName, String aType, String aModifier, String aValue, boolean aIsAutounique, UmpleClass aUmpleClass)
  {
    super(aName, aType, aModifier, aValue);
    isAutounique = aIsAutounique;
    isUnique = false;
    isList = false;
    isDerived = false;
    isInternalTransient = false;
    codeblock = new CodeBlock();
    isLazy = false;
    isRefinement = false;
    isIvar = false;
    comments = new ArrayList<Comment>();
    boolean didAddUmpleClass = setUmpleClass(aUmpleClass);
    if (!didAddUmpleClass)
    {
      throw new RuntimeException("Unable to create attribute due to umpleClass. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    traceRecords = new ArrayList<TraceRecord>();
    setSource(Source.none);
    // line 939 "../../../../src/Umple.ump"
    codeblock.setCode(normalizeValue(aType,aValue));
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsAutounique(boolean aIsAutounique)
  {
    boolean wasSet = false;
    isAutounique = aIsAutounique;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsUnique(boolean aIsUnique)
  {
    boolean wasSet = false;
    isUnique = aIsUnique;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsList(boolean aIsList)
  {
    boolean wasSet = false;
    isList = aIsList;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDerived(boolean aIsDerived)
  {
    boolean wasSet = false;
    isDerived = aIsDerived;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInternalTransient(boolean aIsInternalTransient)
  {
    boolean wasSet = false;
    isInternalTransient = aIsInternalTransient;
    wasSet = true;
    return wasSet;
  }

  public boolean setCodeblock(CodeBlock aCodeblock)
  {
    boolean wasSet = false;
    codeblock = aCodeblock;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsLazy(boolean aIsLazy)
  {
    boolean wasSet = false;
    isLazy = aIsLazy;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsRefinement(boolean aIsRefinement)
  {
    boolean wasSet = false;
    isRefinement = aIsRefinement;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsIvar(boolean aIsIvar)
  {
    boolean wasSet = false;
    isIvar = aIsIvar;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_Set_subclass */
  public boolean setType(String aType)
  {
    boolean wasSet = false;
    // line 940 "../../../../src/Umple.ump"
    codeblock.setCode(normalizeValue(aType,getValue()));
    // END OF UMPLE BEFORE INJECTION
      wasSet = super.setType(aType);
    // line 941 "../../../../src/Umple.ump"
    setValue(getValue());
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  /**
   * Specifies whether or not the method parameter is auto unique.
   * TODO: should default to false, but constructors would need updating
   */
  public boolean getIsAutounique()
  {
    return isAutounique;
  }

  /**
   * Specifies whether or not the attribute is unique.
   */
  public boolean getIsUnique()
  {
    return isUnique;
  }

  /**
   * Specifies whether or not the method parameter is a list.
   */
  public boolean getIsList()
  {
    return isList;
  }

  /**
   * Specifies whether or not the method parameter is derived.
   */
  public boolean getIsDerived()
  {
    return isDerived;
  }

  /**
   * Specifies whether or not the method parameter is internalTransient.
   */
  public boolean getIsInternalTransient()
  {
    return isInternalTransient;
  }

  public CodeBlock getCodeblock()
  {
    return codeblock;
  }

  /**
   * Specifies whether or not the method parameter is lazy.
   */
  public boolean getIsLazy()
  {
    return isLazy;
  }

  public boolean getIsRefinement()
  {
    return isRefinement;
  }

  /**
   * Specifies whether or not the method parameter is ivar.
   */
  public boolean getIsIvar()
  {
    return isIvar;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsAutounique()
  {
    return isAutounique;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsUnique()
  {
    return isUnique;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsList()
  {
    return isList;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsDerived()
  {
    return isDerived;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInternalTransient()
  {
    return isInternalTransient;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsLazy()
  {
    return isLazy;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsRefinement()
  {
    return isRefinement;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsIvar()
  {
    return isIvar;
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
  public Comment getComment(int index)
  {
    Comment aComment = comments.get(index);
    return aComment;
  }

  /**
   * The comments associated with the attribute (such as the Javadoc above it).
   */
  public List<Comment> getComments()
  {
    List<Comment> newComments = Collections.unmodifiableList(comments);
    return newComments;
  }

  public int numberOfComments()
  {
    int number = comments.size();
    return number;
  }

  public boolean hasComments()
  {
    boolean has = comments.size() > 0;
    return has;
  }

  public int indexOfComment(Comment aComment)
  {
    int index = comments.indexOf(aComment);
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
  public UmpleClass getUmpleClass()
  {
    return umpleClass;
  }
  /* Code from template association_GetOne */
  public UmpleTrait getUmpleTrait()
  {
    return umpleTrait;
  }

  public boolean hasUmpleTrait()
  {
    boolean has = umpleTrait != null;
    return has;
  }
  /* Code from template association_GetMany */
  public TraceRecord getTraceRecord(int index)
  {
    TraceRecord aTraceRecord = traceRecords.get(index);
    return aTraceRecord;
  }

  public List<TraceRecord> getTraceRecords()
  {
    List<TraceRecord> newTraceRecords = Collections.unmodifiableList(traceRecords);
    return newTraceRecords;
  }

  public int numberOfTraceRecords()
  {
    int number = traceRecords.size();
    return number;
  }

  public boolean hasTraceRecords()
  {
    boolean has = traceRecords.size() > 0;
    return has;
  }

  public int indexOfTraceRecord(TraceRecord aTraceRecord)
  {
    int index = traceRecords.indexOf(aTraceRecord);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfComments()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addComment(Comment aComment)
  {
    boolean wasAdded = false;
    if (comments.contains(aComment)) { return false; }
    comments.add(aComment);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeComment(Comment aComment)
  {
    boolean wasRemoved = false;
    if (comments.contains(aComment))
    {
      comments.remove(aComment);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCommentAt(Comment aComment, int index)
  {  
    boolean wasAdded = false;
    if(addComment(aComment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfComments()) { index = numberOfComments() - 1; }
      comments.remove(aComment);
      comments.add(index, aComment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCommentAt(Comment aComment, int index)
  {
    boolean wasAdded = false;
    if(comments.contains(aComment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfComments()) { index = numberOfComments() - 1; }
      comments.remove(aComment);
      comments.add(index, aComment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCommentAt(aComment, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setPosition(Position aNewPosition)
  {
    boolean wasSet = false;
    position = aNewPosition;
    wasSet = true;
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
  /* Code from template association_SetOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    if (aUmpleClass == null)
    {
      return wasSet;
    }

    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeAttribute(this);
    }
    umpleClass.addAttribute(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleTrait(UmpleTrait aUmpleTrait)
  {
    boolean wasSet = false;
    UmpleTrait existingUmpleTrait = umpleTrait;
    umpleTrait = aUmpleTrait;
    if (existingUmpleTrait != null && !existingUmpleTrait.equals(aUmpleTrait))
    {
      existingUmpleTrait.removeAttribute(this);
    }
    if (aUmpleTrait != null)
    {
      aUmpleTrait.addAttribute(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTraceRecords()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addTraceRecord(TraceRecord aTraceRecord)
  {
    boolean wasAdded = false;
    if (traceRecords.contains(aTraceRecord)) { return false; }
    traceRecords.add(aTraceRecord);
    if (aTraceRecord.indexOfAttribute(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aTraceRecord.addAttribute(this);
      if (!wasAdded)
      {
        traceRecords.remove(aTraceRecord);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeTraceRecord(TraceRecord aTraceRecord)
  {
    boolean wasRemoved = false;
    if (!traceRecords.contains(aTraceRecord))
    {
      return wasRemoved;
    }

    int oldIndex = traceRecords.indexOf(aTraceRecord);
    traceRecords.remove(oldIndex);
    if (aTraceRecord.indexOfAttribute(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aTraceRecord.removeAttribute(this);
      if (!wasRemoved)
      {
        traceRecords.add(oldIndex,aTraceRecord);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTraceRecordAt(TraceRecord aTraceRecord, int index)
  {  
    boolean wasAdded = false;
    if(addTraceRecord(aTraceRecord))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTraceRecords()) { index = numberOfTraceRecords() - 1; }
      traceRecords.remove(aTraceRecord);
      traceRecords.add(index, aTraceRecord);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTraceRecordAt(TraceRecord aTraceRecord, int index)
  {
    boolean wasAdded = false;
    if(traceRecords.contains(aTraceRecord))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTraceRecords()) { index = numberOfTraceRecords() - 1; }
      traceRecords.remove(aTraceRecord);
      traceRecords.add(index, aTraceRecord);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTraceRecordAt(aTraceRecord, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    // line 28 "../../../../src/Trace_refactored.ump"
    if (traceRecords == null) {
            traceRecords = new ArrayList<TraceRecord>();
          }
    // END OF UMPLE BEFORE INJECTION
    comments.clear();
    position = null;
    endPosition = null;
    UmpleClass placeholderUmpleClass = umpleClass;
    this.umpleClass = null;
    if(placeholderUmpleClass != null)
    {
      placeholderUmpleClass.removeAttribute(this);
    }
    if (umpleTrait != null)
    {
      UmpleTrait placeholderUmpleTrait = umpleTrait;
      this.umpleTrait = null;
      placeholderUmpleTrait.removeAttribute(this);
    }
    ArrayList<TraceRecord> copyOfTraceRecords = new ArrayList<TraceRecord>(traceRecords);
    traceRecords.clear();
    for(TraceRecord aTraceRecord : copyOfTraceRecords)
    {
      aTraceRecord.removeAttribute(this);
    }
    super.delete();
  }

  // line 281 "../../../../src/Umple_Code_Trait.ump"
   public  Attribute(String aName, String aType, String aModifier, String aValue, boolean aIsAutounique, UmpleTrait aUmpleTrait){
    super(aName, aType, aModifier, aValue);
    isAutounique = aIsAutounique;
    isUnique = false;
    isList = false;
    isDerived = false;
    codeblock = null;
    isLazy = false;
    comments = new ArrayList<Comment>();
    boolean didAddUmpleTrait = setUmpleTrait(aUmpleTrait);
    if (!didAddUmpleTrait)
    {
      throw new RuntimeException("Unable to create attribute due to umpleTrait");
    }
    //TODO The following lines should be removed or used correctly for UmpleTrait;
    // line 569 "../../../../src/Umple.ump"
    codeblock = aValue!=null ? new CodeBlock(aValue) : new CodeBlock();
  }

  // line 6 "../../../../src/Umple_CodeAttribute.ump"
   public  Attribute(Attribute another){
    super(another.getName(), another.getType(), another.getModifier(), another.getValue());
  	isAutounique = another.getIsAutounique() ;
	isUnique = another.getIsUnique();
	isList = another.getIsList();
	isDerived = another.getIsDerived();
	codeblock = another.getCodeblock();
	isLazy = another.getIsLazy();
	//Attribute Associations
	comments = new ArrayList<Comment>(); // Create a deep copy of comments.
  for (Comment comment : another.getComments())
  {
    comments.add(new Comment(comment));
  }
	position = another.getPosition();
	endPosition = another.getEndPosition();
	umpleClass = another.getUmpleClass();
	umpleTrait = another.getUmpleTrait();
  }

  // line 27 "../../../../src/Umple_CodeAttribute.ump"
   public boolean isConstant(){
    return "const".equals(getModifier());
  }

  // line 32 "../../../../src/Umple_CodeAttribute.ump"
   public boolean isPrimitive(){
    return getType() == null || "String".equals(getType()) || "Integer".equals(getType()) || "Double".equals(getType()) || "Boolean".equals(getType()) || "Date".equals(getType()) || "Time".equals(getType());
  }

  // line 38 "../../../../src/Umple_CodeAttribute.ump"
   public boolean isImmutable(){
    boolean varIsImmutable = super.isImmutable();
    boolean classIsImmutable = (this.getUmpleClass() == null) ? false : getUmpleClass().isImmutable();

    return (varIsImmutable || classIsImmutable);
  }

  // line 46 "../../../../src/Umple_CodeAttribute.ump"
   public boolean isInternal(){
    return "internal".equals(getModifier());
  }

  // line 51 "../../../../src/Umple_CodeAttribute.ump"
   public boolean isSettable(){
    return "settable".equals(getModifier());
  }

  // line 56 "../../../../src/Umple_CodeAttribute.ump"
   public boolean isDefaulted(){
    return "defaulted".equals(getModifier());
  }

  // line 61 "../../../../src/Umple_CodeAttribute.ump"
   public String getValue(){
    String possibleValue = codeblock.getCode();
    return "".equals(possibleValue) ? super.getValue() : possibleValue;
  }

  // line 67 "../../../../src/Umple_CodeAttribute.ump"
   public boolean setValue(String aValue){
    aValue = normalizeValue(getType(),aValue);
    codeblock.setCode(aValue);
    return super.setValue(aValue);
  }

  // line 74 "../../../../src/Umple_CodeAttribute.ump"
   public boolean setValue(String lang, String code){
    codeblock.setCode(lang,code);
    return true;
  }

  // line 80 "../../../../src/Umple_CodeAttribute.ump"
   public String getFullType(){
    return this.getType() + (this.getIsList() ? "[]" : "");
  }

  // line 85 "../../../../src/Umple_CodeAttribute.ump"
   public ArrayList<String> getMethodNames(){
    ArrayList<String> methodNames = new ArrayList<String>();      
    String attributeCapitalizedName = this.getUpperCaseName();
    if (!this.isIsList())
    {
      if(!this.isInternal())
      {
        methodNames.add("get" + attributeCapitalizedName);
      }
      if(this.isIsLazy() || this.isSettable() || this.isDefaulted())
      {
        methodNames.add("set" + attributeCapitalizedName);
      }
      if(this.isDefaulted()) 
      {
        methodNames.add("reset" + attributeCapitalizedName);
        methodNames.add("getDefault" + attributeCapitalizedName);
      }
      if(this.getType() != null && this.getType().equals("Boolean"))
      {
        methodNames.add("is" + attributeCapitalizedName);
      }
    }
    else 
    {
      String singularName = getUmpleClass().getSourceModel().getGlossary().getSingular(this.getName());
      String singularCapitalizedName = singularName.substring(0, 1).toUpperCase() + singularName.substring(1);

      if(!this.isInternal())
      {
        methodNames.add("get" + singularCapitalizedName);
        methodNames.add("get" + attributeCapitalizedName);
        methodNames.add("numberOf" + attributeCapitalizedName);
        methodNames.add("has" + attributeCapitalizedName);
        methodNames.add("indexOf" + singularCapitalizedName);
      }
      if(this.isIsLazy() || this.isSettable() || this.isDefaulted())
      {
        methodNames.add("add" + singularCapitalizedName);
        methodNames.add("remove" + singularCapitalizedName);
      }
    }
    return methodNames;
  }


  public String toString()
  {
    return super.toString() + "["+
            "isAutounique" + ":" + getIsAutounique()+ "," +
            "isUnique" + ":" + getIsUnique()+ "," +
            "isList" + ":" + getIsList()+ "," +
            "isDerived" + ":" + getIsDerived()+ "," +
            "isInternalTransient" + ":" + getIsInternalTransient()+ "," +
            "isLazy" + ":" + getIsLazy()+ "," +
            "isRefinement" + ":" + getIsRefinement()+ "," +
            "isIvar" + ":" + getIsIvar()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "codeblock" + "=" + (getCodeblock() != null ? !getCodeblock().equals(this)  ? getCodeblock().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "position = "+(getPosition()!=null?Integer.toHexString(System.identityHashCode(getPosition())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition = "+(getEndPosition()!=null?Integer.toHexString(System.identityHashCode(getEndPosition())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleTrait = "+(getUmpleTrait()!=null?Integer.toHexString(System.identityHashCode(getUmpleTrait())):"null");
  }
}
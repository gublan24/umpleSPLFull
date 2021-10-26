/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * In Umple_Code.ump: Methods for testing various complex properties
 * An association variable represents one of the variables used to represent
 * an association. In a two-directional association (navigable) there would
 * be one of these in each associated class.
 * 
 * See also AssociationEnd
 * 
 * TODO: Code smell. Should be replaced by the 'otherEnd' of the AssociationEnd
 */
// line 305 "../../../../src/Umple_CodeAssociation.ump"
// line 1050 "../../../../src/Umple.ump"
// line 55 "../../../../src/Trace_Code.ump"
public class AssociationVariable extends UmpleVariable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationVariable Attributes
  private Multiplicity multiplicity;
  private boolean isNavigable;
  private boolean isComposition;
  private String priority;
  private AssociationVariable specializedFromVariable;
  private boolean isSpecialized;
  private boolean isSpecialization;
  private String commonClassName;
  private String superClassName;
  private int relevantEnd;
  private boolean needsSuperCode;
  private boolean needsCommonCode;
  private boolean mulChangedToOne;
  private String scName;
  private boolean mulChangedToN;
  private boolean reqSetCode;

  //AssociationVariable Associations
  private AssociationVariable relatedAssociation;
  private List<Comment> comments;
  private UmpleClass umpleClass;
  private UmpleTrait umpleTrait;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssociationVariable(String aName, String aType, String aModifier, String aValue, Multiplicity aMultiplicity, boolean aIsNavigable)
  {
    super(aName, aType, aModifier, aValue);
    multiplicity = aMultiplicity;
    isNavigable = aIsNavigable;
    isComposition = false;
    priority = "";
    specializedFromVariable = null;
    isSpecialized = false;
    isSpecialization = false;
    commonClassName = "";
    superClassName = "";
    relevantEnd = 0;
    needsSuperCode = false;
    needsCommonCode = false;
    mulChangedToOne = false;
    scName = "";
    mulChangedToN = false;
    reqSetCode = false;
    comments = new ArrayList<Comment>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMultiplicity(Multiplicity aMultiplicity)
  {
    boolean wasSet = false;
    multiplicity = aMultiplicity;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsComposition(boolean aIsComposition)
  {
    boolean wasSet = false;
    isComposition = aIsComposition;
    wasSet = true;
    return wasSet;
  }

  public boolean setPriority(String aPriority)
  {
    boolean wasSet = false;
    priority = aPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setSpecializedFromVariable(AssociationVariable aSpecializedFromVariable)
  {
    boolean wasSet = false;
    specializedFromVariable = aSpecializedFromVariable;
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

  public boolean setSuperClassName(String aSuperClassName)
  {
    boolean wasSet = false;
    superClassName = aSuperClassName;
    wasSet = true;
    return wasSet;
  }

  public boolean setRelevantEnd(int aRelevantEnd)
  {
    boolean wasSet = false;
    relevantEnd = aRelevantEnd;
    wasSet = true;
    return wasSet;
  }

  public boolean setNeedsSuperCode(boolean aNeedsSuperCode)
  {
    boolean wasSet = false;
    needsSuperCode = aNeedsSuperCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setNeedsCommonCode(boolean aNeedsCommonCode)
  {
    boolean wasSet = false;
    needsCommonCode = aNeedsCommonCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setMulChangedToOne(boolean aMulChangedToOne)
  {
    boolean wasSet = false;
    mulChangedToOne = aMulChangedToOne;
    wasSet = true;
    return wasSet;
  }

  public boolean setScName(String aScName)
  {
    boolean wasSet = false;
    scName = aScName;
    wasSet = true;
    return wasSet;
  }

  public boolean setMulChangedToN(boolean aMulChangedToN)
  {
    boolean wasSet = false;
    mulChangedToN = aMulChangedToN;
    wasSet = true;
    return wasSet;
  }

  public boolean setReqSetCode(boolean aReqSetCode)
  {
    boolean wasSet = false;
    reqSetCode = aReqSetCode;
    wasSet = true;
    return wasSet;
  }

  public Multiplicity getMultiplicity()
  {
    return multiplicity;
  }

  public boolean getIsNavigable()
  {
    return isNavigable;
  }

  public boolean getIsComposition()
  {
    return isComposition;
  }

  public String getPriority()
  {
    return priority;
  }

  /**
   * specialized from this association variable
   */
  public AssociationVariable getSpecializedFromVariable()
  {
    return specializedFromVariable;
  }

  /**
   * code relevant to specialization of associations
   * is it ever specialized?
   */
  public boolean getIsSpecialized()
  {
    return isSpecialized;
  }

  /**
   * is it a specialization of another?
   */
  public boolean getIsSpecialization()
  {
    return isSpecialization;
  }

  public String getCommonClassName()
  {
    return commonClassName;
  }

  public String getSuperClassName()
  {
    return superClassName;
  }

  /**
   * 0 to ensure that everything doesn't break
   */
  public int getRelevantEnd()
  {
    return relevantEnd;
  }

  public boolean getNeedsSuperCode()
  {
    return needsSuperCode;
  }

  public boolean getNeedsCommonCode()
  {
    return needsCommonCode;
  }

  public boolean getMulChangedToOne()
  {
    return mulChangedToOne;
  }

  public String getScName()
  {
    return scName;
  }

  public boolean getMulChangedToN()
  {
    return mulChangedToN;
  }

  public boolean getReqSetCode()
  {
    return reqSetCode;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsNavigable()
  {
    return isNavigable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsComposition()
  {
    return isComposition;
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
  /* Code from template attribute_IsBoolean */
  public boolean isNeedsSuperCode()
  {
    return needsSuperCode;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNeedsCommonCode()
  {
    return needsCommonCode;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isMulChangedToOne()
  {
    return mulChangedToOne;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isMulChangedToN()
  {
    return mulChangedToN;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isReqSetCode()
  {
    return reqSetCode;
  }
  /* Code from template association_GetOne */
  public AssociationVariable getRelatedAssociation()
  {
    return relatedAssociation;
  }

  public boolean hasRelatedAssociation()
  {
    boolean has = relatedAssociation != null;
    return has;
  }
  /* Code from template association_GetMany */
  public Comment getComment(int index)
  {
    Comment aComment = comments.get(index);
    return aComment;
  }

  /**
   * The comments associated with the association (such as the Javadoc above it).
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
  public UmpleClass getUmpleClass()
  {
    return umpleClass;
  }

  public boolean hasUmpleClass()
  {
    boolean has = umpleClass != null;
    return has;
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
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setRelatedAssociation(AssociationVariable aNewRelatedAssociation)
  {
    boolean wasSet = false;
    // line 1081 "../../../../src/Umple.ump"
    if(!canBeRelatedAssociation(aNewRelatedAssociation)) { return false; }
    // END OF UMPLE BEFORE INJECTION
    if (aNewRelatedAssociation == null)
    {
      AssociationVariable existingRelatedAssociation = relatedAssociation;
      relatedAssociation = null;
      
      if (existingRelatedAssociation != null && existingRelatedAssociation.getRelatedAssociation() != null)
      {
        existingRelatedAssociation.setRelatedAssociation(null);
      }
      wasSet = true;
      return wasSet;
    }

    AssociationVariable currentRelatedAssociation = getRelatedAssociation();
    if (currentRelatedAssociation != null && !currentRelatedAssociation.equals(aNewRelatedAssociation))
    {
      currentRelatedAssociation.setRelatedAssociation(null);
    }

    relatedAssociation = aNewRelatedAssociation;
    AssociationVariable existingRelatedAssociation = aNewRelatedAssociation.getRelatedAssociation();

    if (!equals(existingRelatedAssociation))
    {
      aNewRelatedAssociation.setRelatedAssociation(this);
    }
    wasSet = true;
    return wasSet;
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
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    // line 1079 "../../../../src/Umple.ump"
    if ((aUmpleClass != null) && !aUmpleClass.immutabilityAssociationRulesSatisfied(this, aUmpleClass.isImmutable())) { return false; }
    // END OF UMPLE BEFORE INJECTION
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeAssociationVariable(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addAssociationVariable(this);
    }
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
      existingUmpleTrait.removeAssociationVariable(this);
    }
    if (aUmpleTrait != null)
    {
      aUmpleTrait.addAssociationVariable(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (relatedAssociation != null)
    {
      relatedAssociation.setRelatedAssociation(null);
    }
    comments.clear();
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeAssociationVariable(this);
    }
    if (umpleTrait != null)
    {
      UmpleTrait placeholderUmpleTrait = umpleTrait;
      this.umpleTrait = null;
      placeholderUmpleTrait.removeAssociationVariable(this);
    }
    super.delete();
  }

  // line 308 "../../../../src/Umple_CodeAssociation.ump"
   public  AssociationVariable(AssociationVariable another){
    super(another.getName(), another.getType(),another.getModifier(), another.getValue());
	  //AssociationVariable Attributes
	  this.multiplicity = another.getMultiplicity();
	  this.isNavigable = another.getIsNavigable();
	  this.priority  = another.getPriority();

	  //AssociationVariable Associations
	  this.relatedAssociation = null;
	  this.comments = new ArrayList<Comment>();
	  for (Comment comment : another.getComments()) {
		  this.comments.add(comment);
	  }

	  this.umpleClass = another.getUmpleClass();
	  this.umpleTrait = another.getUmpleTrait();
	  //Helper Variables
	  //this.canSetIsNavigable = another.canSetIsNavigable;
  }

  // line 329 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isReflexive(){
    return getRelatedAssociation() != null && getType().equals(getRelatedAssociation().getType());
  }

  // line 334 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isSymmetricReflexive(){
    return getRelatedAssociation() != null && "symmetricreflexive".equals(getModifier());
  }

  // line 339 "../../../../src/Umple_CodeAssociation.ump"
   public void configureRelatedAssociation(AssociationVariable newRelatedAssociation){
    if (newRelatedAssociation == null || !getType().equals(newRelatedAssociation.getType()))
    {
      setRelatedAssociation(newRelatedAssociation);
    }
    else
    {
      multiplicity.minimizeRange(newRelatedAssociation.getMultiplicity());
      setRelatedAssociation(this);
    }
  }

  // line 351 "../../../../src/Umple_CodeAssociation.ump"
   public void setOneDirectionalRelatedAssociation(AssociationVariable other){
    //for inheritance use

    relatedAssociation = other;
    isNavigable = true;
  }

  // line 359 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isTwoDirectionalAssociation(AssociationVariable other){
    //for inheritance use

    if (!other.hasRelatedAssociation() || relatedAssociation == null)
      return false;
    return other.getRelatedAssociation().equals(relatedAssociation);
  }

  // line 369 "../../../../src/Umple_CodeAssociation.ump"
   public static  int min(int first, int second){
    return first == -1 ? second : second == -1 ? first : Math.min(first, second);
  }

  // line 374 "../../../../src/Umple_CodeAssociation.ump"
   public static  int max(int first, int second){
    return first == -1 ? first : second == -1 ? second : Math.max(first, second);
  }

  // line 379 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isMany(){
    return multiplicity.getUpperBound() == -1 || multiplicity.getUpperBound() > 1;
  }

  // line 384 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isOptionalN(){
    return multiplicity.getLowerBound() == 0 && multiplicity.getUpperBound() > 1;
  }

  // line 389 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isOne(){
    return multiplicity.getUpperBound() == 1;
  }

  // line 394 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isOnlyOne(){
    return multiplicity.getUpperBound() == 1 && multiplicity.getLowerBound() == 1;
  }

  // line 399 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isOptionalOne(){
    return multiplicity.getUpperBound() == 1 && multiplicity.getLowerBound() == 0;
  }

  // line 404 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isOptionalMany(){
    return multiplicity.getLowerBound() == 0 && isMany();
  }

  // line 409 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isUpperBounded(){
    return multiplicity.getUpperBound() >= 0;
  }

  // line 414 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isN(){
    return multiplicity.getLowerBound() > 1 && multiplicity.getLowerBound() == multiplicity.getUpperBound();
  }

  // line 419 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isMN(){
    return multiplicity.getLowerBound() > 0 && (multiplicity.getUpperBound() > multiplicity.getLowerBound() || multiplicity.getUpperBound() == -1);
  }

  // line 424 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isMStar(){
    return multiplicity.getLowerBound() > 0 && multiplicity.getUpperBound() == -1;
  }

  // line 429 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isStar(){
    return multiplicity.getUpperBound() == -1;
  }

  // line 434 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isMandatory(){
    return multiplicity.getLowerBound() > 0;
  }

  // line 439 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isMandatoryOne(){
    return multiplicity.getLowerBound() == 1 && multiplicity.getUpperBound() == 1;
  }

  // line 444 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isMandatoryMany(){
    return multiplicity.getLowerBound() > 0 && isMany();
  }

  // line 449 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isImmutable(){
    AssociationVariable related = getRelatedAssociation();
    Boolean relatedAssocIsImmutable = (related == null) ? false : "immutable".equals(related.getModifier());

    Boolean myUmpleClassIsImmutable =
      (getIsNavigable() && getUmpleClass() != null) ? getUmpleClass().isImmutable() : false;
    Boolean yourUmpleClassIsImmutable =
      (related != null && related.getIsNavigable() && related.getUmpleClass() != null) ? related.getUmpleClass().isImmutable() : false;

    return (super.isImmutable() || relatedAssocIsImmutable
        || myUmpleClassIsImmutable || yourUmpleClassIsImmutable);
  }

  // line 463 "../../../../src/Umple_CodeAssociation.ump"
   public boolean setImmutable(){
    boolean wasSet = false;
    if (canBeImmutable())
    {
      setModifier("immutable");
      wasSet = true;
    }
    return wasSet;
  }

  // line 474 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isSorted(){
    return !priority.equals("");
  }

  // line 479 "../../../../src/Umple_CodeAssociation.ump"
   private boolean canBeImmutable(){
    AssociationVariable related = getRelatedAssociation();
    if (related == null) { return true; }

    boolean canBe = true;
    if (getIsNavigable() && related.getIsNavigable())
    {
      canBe = false;
    }
    else if (related.getIsNavigable() && (umpleClass != null) && !umpleClass.isImmutable())
    {
      canBe = false;
    }
    else if (getIsNavigable() && (related.getUmpleClass() != null) && !related.getUmpleClass().isImmutable())
    {
      canBe = false;
    }
    return canBe;
  }

  // line 500 "../../../../src/Umple_CodeAssociation.ump"
   private boolean canBeRelatedAssociation(AssociationVariable related){
    if (related == null)
    {
      return true;
    }
    Boolean myUmpleClassIsImmutable = (getUmpleClass() != null) ? getUmpleClass().isImmutable() : false;
    Boolean yourUmpleClassIsImmutable = (related.getUmpleClass() != null) ? related.getUmpleClass().isImmutable() : false;

    return UmpleClass.immutabilityAssociationRulesSatisfied(this, umpleClass, myUmpleClassIsImmutable,
        related, related.getUmpleClass(), yourUmpleClassIsImmutable);
  }

  // line 513 "../../../../src/Umple_CodeAssociation.ump"
   public ArrayList<String> getMethodNames(){
    if(!getIsNavigable())
    {
      return new ArrayList<String>();
    }

    ArrayList<String> methodNames = new ArrayList<String>();      
    String attributeCapitalizedName = this.getUpperCaseName();

    String singularName = getUmpleClass().getSourceModel().getGlossary().getSingular(this.getName());
    String singularCapitalizedName = singularName.substring(0, 1).toUpperCase() + singularName.substring(1);

    if(isMany())
    {
      methodNames.add("get" + singularCapitalizedName);
      methodNames.add("get" + attributeCapitalizedName);
      methodNames.add("numberOf" + attributeCapitalizedName);
      methodNames.add("has" + attributeCapitalizedName);
      methodNames.add("indexOf" + singularCapitalizedName);
      methodNames.add("minimumNumberOf" + attributeCapitalizedName);
      methodNames.add("add" + singularCapitalizedName);
      methodNames.add("add" + singularCapitalizedName + "At");
      methodNames.add("addOrMove" + singularCapitalizedName + "At");
      methodNames.add("remove" + singularCapitalizedName);
    }
    else
    {
      methodNames.add("get" + attributeCapitalizedName);
      methodNames.add("set" + attributeCapitalizedName);
    }
    
    return methodNames;
  }

  // line 58 "../../../../src/Trace_Code.ump"
   public List<TraceItem> getTraced(String method, UmpleClass uClass){
    ArrayList<TraceItem> traceItems = new ArrayList<TraceItem>();

		for(TraceDirective td: uClass.getAllTraceDirectives())
		{

			Label_Association_31: ;
		}

		return traceItems;
  }


  public String toString()
  {
    return super.toString() + "["+
            "isNavigable" + ":" + getIsNavigable()+ "," +
            "isComposition" + ":" + getIsComposition()+ "," +
            "priority" + ":" + getPriority()+ "," +
            "isSpecialized" + ":" + getIsSpecialized()+ "," +
            "isSpecialization" + ":" + getIsSpecialization()+ "," +
            "commonClassName" + ":" + getCommonClassName()+ "," +
            "superClassName" + ":" + getSuperClassName()+ "," +
            "relevantEnd" + ":" + getRelevantEnd()+ "," +
            "needsSuperCode" + ":" + getNeedsSuperCode()+ "," +
            "needsCommonCode" + ":" + getNeedsCommonCode()+ "," +
            "mulChangedToOne" + ":" + getMulChangedToOne()+ "," +
            "scName" + ":" + getScName()+ "," +
            "mulChangedToN" + ":" + getMulChangedToN()+ "," +
            "reqSetCode" + ":" + getReqSetCode()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "multiplicity" + "=" + (getMultiplicity() != null ? !getMultiplicity().equals(this)  ? getMultiplicity().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "specializedFromVariable" + "=" + (getSpecializedFromVariable() != null ? !getSpecializedFromVariable().equals(this)  ? getSpecializedFromVariable().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "relatedAssociation = "+(getRelatedAssociation()!=null?Integer.toHexString(System.identityHashCode(getRelatedAssociation())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleTrait = "+(getUmpleTrait()!=null?Integer.toHexString(System.identityHashCode(getUmpleTrait())):"null");
  }
}
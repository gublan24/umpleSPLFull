/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * In Umple_Code.ump: Methods for computing compound properties
 * An association end represents one logical end of an association
 * 
 * See also AssociationVariable
 * TODO: Code smell referenceToClassName is a duplication, can access via the association
 * Create a derived attribute otherend (the other AssociationEnd)
 */
// line 160 "../../../../src/Umple_CodeAssociation.ump"
// line 1014 "../../../../src/Umple.ump"
public class AssociationEnd
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationEnd Attributes
  private String roleName;
  private String className;
  private String modifier;
  private String referenceToClassName;
  private Multiplicity multiplicity;
  private boolean isDefaultRoleName;
  private String priority;
  private String superClassName;
  private boolean needsCommonCode;
  private boolean needsSuperCode;
  private boolean mulChangedToOne;
  private boolean mulChangedToN;
  private boolean reqSetCode;

  //AssociationEnd Associations
  private Association association;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetMultiplicity;
  private boolean canSetRoleName;
  private boolean canSetClassName;
  private boolean canSetModifier;
  private boolean canSetReferenceToClassName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssociationEnd(String aRoleName, String aClassName, String aModifier, String aReferenceToClassName, Multiplicity aMultiplicity)
  {
    cachedHashCode = -1;
    canSetMultiplicity = true;
    canSetRoleName = true;
    canSetClassName = true;
    canSetModifier = true;
    canSetReferenceToClassName = true;
    roleName = aRoleName;
    className = aClassName;
    modifier = aModifier;
    referenceToClassName = aReferenceToClassName;
    multiplicity = aMultiplicity;
    isDefaultRoleName = false;
    priority = "";
    superClassName = "";
    needsCommonCode = false;
    needsSuperCode = false;
    mulChangedToOne = false;
    mulChangedToN = false;
    reqSetCode = false;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRoleName(String aRoleName)
  {
    boolean wasSet = false;
    if (!canSetRoleName) { return false; }
    roleName = aRoleName;
    wasSet = true;
    return wasSet;
  }

  public boolean setClassName(String aClassName)
  {
    boolean wasSet = false;
    if (!canSetClassName) { return false; }
    className = aClassName;
    wasSet = true;
    return wasSet;
  }

  public boolean setModifier(String aModifier)
  {
    boolean wasSet = false;
    if (!canSetModifier) { return false; }
    modifier = aModifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setReferenceToClassName(String aReferenceToClassName)
  {
    boolean wasSet = false;
    if (!canSetReferenceToClassName) { return false; }
    referenceToClassName = aReferenceToClassName;
    wasSet = true;
    return wasSet;
  }

  public boolean setMultiplicity(Multiplicity aMultiplicity)
  {
    boolean wasSet = false;
    if (!canSetMultiplicity) { return false; }
    multiplicity = aMultiplicity;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDefaultRoleName(boolean aIsDefaultRoleName)
  {
    boolean wasSet = false;
    isDefaultRoleName = aIsDefaultRoleName;
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

  public boolean setSuperClassName(String aSuperClassName)
  {
    boolean wasSet = false;
    superClassName = aSuperClassName;
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

  public boolean setNeedsSuperCode(boolean aNeedsSuperCode)
  {
    boolean wasSet = false;
    needsSuperCode = aNeedsSuperCode;
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

  public String getRoleName()
  {
    // line 1035 "../../../../src/Umple.ump"
    if (roleName == null) { return ""; }
    // END OF UMPLE BEFORE INJECTION
    return roleName;
  }

  public String getClassName()
  {
    // line 1036 "../../../../src/Umple.ump"
    if (className == null) { return ""; }
    // END OF UMPLE BEFORE INJECTION
    return className;
  }

  /**
   * potential enum 'internal'
   */
  public String getModifier()
  {
    // line 1037 "../../../../src/Umple.ump"
    if (modifier == null || "".equals(modifier)) { return "internal"; }
    // END OF UMPLE BEFORE INJECTION
    return modifier;
  }

  public String getReferenceToClassName()
  {
    // line 1038 "../../../../src/Umple.ump"
    if (referenceToClassName == null) { return ""; }
    // END OF UMPLE BEFORE INJECTION
    return referenceToClassName;
  }

  public Multiplicity getMultiplicity()
  {
    return multiplicity;
  }

  public boolean getIsDefaultRoleName()
  {
    return isDefaultRoleName;
  }

  public String getPriority()
  {
    return priority;
  }

  /**
   * relevant to specializations
   */
  public String getSuperClassName()
  {
    return superClassName;
  }

  public boolean getNeedsCommonCode()
  {
    return needsCommonCode;
  }

  public boolean getNeedsSuperCode()
  {
    return needsSuperCode;
  }

  public boolean getMulChangedToOne()
  {
    return mulChangedToOne;
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
  public boolean isIsDefaultRoleName()
  {
    return isDefaultRoleName;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNeedsCommonCode()
  {
    return needsCommonCode;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNeedsSuperCode()
  {
    return needsSuperCode;
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
  public Association getAssociation()
  {
    return association;
  }

  public boolean hasAssociation()
  {
    boolean has = association != null;
    return has;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    AssociationEnd compareTo = (AssociationEnd)obj;
  
    if (getMultiplicity() == null && compareTo.getMultiplicity() != null)
    {
      return false;
    }
    else if (getMultiplicity() != null && !getMultiplicity().equals(compareTo.getMultiplicity()))
    {
      return false;
    }

    if (getRoleName() == null && compareTo.getRoleName() != null)
    {
      return false;
    }
    else if (getRoleName() != null && !getRoleName().equals(compareTo.getRoleName()))
    {
      return false;
    }

    if (getClassName() == null && compareTo.getClassName() != null)
    {
      return false;
    }
    else if (getClassName() != null && !getClassName().equals(compareTo.getClassName()))
    {
      return false;
    }

    if (getModifier() == null && compareTo.getModifier() != null)
    {
      return false;
    }
    else if (getModifier() != null && !getModifier().equals(compareTo.getModifier()))
    {
      return false;
    }

    if (getReferenceToClassName() == null && compareTo.getReferenceToClassName() != null)
    {
      return false;
    }
    else if (getReferenceToClassName() != null && !getReferenceToClassName().equals(compareTo.getReferenceToClassName()))
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
    if (getMultiplicity() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getMultiplicity().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getRoleName() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getRoleName().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getClassName() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getClassName().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getModifier() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getModifier().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getReferenceToClassName() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getReferenceToClassName().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetMultiplicity = false;
    canSetRoleName = false;
    canSetClassName = false;
    canSetModifier = false;
    canSetReferenceToClassName = false;
    return cachedHashCode;
  }

  public void delete()
  {
    if (association != null)
    {
      association.delete();
    }
  }

  // line 164 "../../../../src/Umple_CodeAssociation.ump"
   public  AssociationEnd(AssociationEnd another){
    //AssociationEnd Attributes
  	this.roleName = another.getRoleName();
  	this.className = another.getClassName();
  	this.modifier = another.getModifier();
  	this.referenceToClassName = another.getReferenceToClassName();
  	this.multiplicity = another.getMultiplicity();
  	this.isDefaultRoleName = another.getIsDefaultRoleName();
  	this.priority = another.getPriority();

  	//AssociationEnd Associations
  	this.association = another.getAssociation();

  	//Helper Variables
  	this.cachedHashCode = another.cachedHashCode;
  	this.canSetMultiplicity = another.canSetMultiplicity;
  	this.canSetRoleName = another.canSetRoleName;
	this.canSetClassName = another.canSetClassName;
	this.canSetModifier = another.canSetModifier;
	this.canSetReferenceToClassName = another.canSetReferenceToClassName;
  }

  // line 188 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isNavigable(){
    return !getModifier().toLowerCase().equals("nonnavigable");
  }

  // line 193 "../../../../src/Umple_CodeAssociation.ump"
   public String getLowerBoundString(){
    return getMultiplicity().getLowerBound() == -1 ? "*" : getMultiplicity().getLowerBound() + "";
  }

  // line 198 "../../../../src/Umple_CodeAssociation.ump"
   public String getUpperBoundString(){
    return getMultiplicity().getUpperBound() == -1 ? "*" : getMultiplicity().getUpperBound() + "";
  }

  // line 203 "../../../../src/Umple_CodeAssociation.ump"
   public String getDisplayRoleName(){
    return isDefaultRoleName ? "" : getRoleName();
  }

  // line 208 "../../../../src/Umple_CodeAssociation.ump"
   public String toSimpleString(){
    if (getMultiplicity().getLowerBound() == 0 && getMultiplicity().getUpperBound() == MULT_MANY)
    {
      return formatEnd(getMultiplicity().getUpperBound());
    }
    else if (getMultiplicity().getLowerBound() == MULT_MANY && getMultiplicity().getUpperBound() == MULT_MANY)
    {
      return formatEnd(getMultiplicity().getLowerBound()) + ".." + formatEnd(getMultiplicity().getUpperBound());
    }
    else if (getMultiplicity().getLowerBound() == getMultiplicity().getUpperBound())
    {
      return formatEnd(getMultiplicity().getLowerBound());
    }
    else
    {
      return formatEnd(getMultiplicity().getLowerBound()) + ".." + formatEnd(getMultiplicity().getUpperBound());
    }
  }

  // line 228 "../../../../src/Umple_CodeAssociation.ump"
   public String toGenericString(){
    if (getMultiplicity().getLowerBound() == 0 && getMultiplicity().getUpperBound() == MULT_MANY)
    {
      return formatEnd(getMultiplicity().getUpperBound());
    }
    else if (getMultiplicity().getLowerBound() == MULT_MANY && getMultiplicity().getUpperBound() == MULT_MANY)
    {
      return formatEnd(getMultiplicity().getLowerBound()) + ".." + formatEnd(getMultiplicity().getUpperBound());
    }
    else if (getMultiplicity().getLowerBound() == getMultiplicity().getUpperBound())
    {
      return formatGenericEnd(getMultiplicity().getLowerBound(),"n");
    }
    else if (getMultiplicity().getLowerBound() == 0 || getMultiplicity().getLowerBound() == 1)
    {
      return getMultiplicity().getLowerBound() + ".." + formatGenericEnd(getMultiplicity().getUpperBound(),"n");
    }
    else
    {
      return formatGenericEnd(getMultiplicity().getLowerBound(),"n") + ".." + formatGenericEnd(getMultiplicity().getUpperBound(),"m");
    }
  }

  // line 252 "../../../../src/Umple_CodeAssociation.ump"
   public String toString(){
    String asText = "";

    if (!getModifier().equals("internal"))
    {
      asText += getModifier() + " " + asText;
    }
    asText += toSimpleString();

    if (getRoleName().length() > 0)
    {
      asText += " [" + roleName + "]";
    }

    if (getClassName().length() > 0)
    {
      asText += " " + className;
    }

    if (getReferenceToClassName().length() > 0)
    {
      asText += " -- " + referenceToClassName;
    }

    return asText;
  }

  // line 280 "../../../../src/Umple_CodeAssociation.ump"
   private String formatEnd(int aValue){
    return aValue == MULT_MANY ? "*" : aValue + "";
  }

  // line 286 "../../../../src/Umple_CodeAssociation.ump"
   private String formatGenericEnd(int aValue, String defaultIfNotOneOrMany){
    if (aValue == MULT_MANY)
    {
      return "*";
    }
    else if (aValue == 0 || aValue == 1)
    {
      return aValue + "";
    }
    else
    {
      return defaultIfNotOneOrMany;
    }
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 184 "../../../../src/Umple_CodeAssociation.ump"
  private static int MULT_MANY = -1 ;

  
}
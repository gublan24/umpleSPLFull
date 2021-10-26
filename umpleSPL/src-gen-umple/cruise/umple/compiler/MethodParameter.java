/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * 
 * NEW CLASS****************************************
 * 
 * Represents a parameter in a method and its various forms.
 */
// line 203 "../../../../src/Umple_CodeMethod.ump"
// line 1854 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
// line 336 "../../../../src/Umple.ump"
public class MethodParameter extends UmpleVariable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MethodParameter Attributes
  private boolean isAutounique;
  private boolean isList;
  private boolean isDerived;
  private boolean isLazy;
  private boolean isIvar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MethodParameter(String aName, String aType, String aModifier, String aValue, boolean aIsAutounique)
  {
    super(aName, aType, aModifier, aValue);
    isAutounique = aIsAutounique;
    isList = false;
    isDerived = false;
    isLazy = false;
    isIvar = false;
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

  public boolean setIsLazy(boolean aIsLazy)
  {
    boolean wasSet = false;
    isLazy = aIsLazy;
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

  /**
   * Specifies whether or not the method parameter is auto unique.
   * TODO: should default to false, but constructors would need updating
   */
  public boolean getIsAutounique()
  {
    return isAutounique;
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
   * Specifies whether or not the method parameter is lazy.
   */
  public boolean getIsLazy()
  {
    return isLazy;
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
  public boolean isIsLazy()
  {
    return isLazy;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsIvar()
  {
    return isIvar;
  }

  public void delete()
  {
    super.delete();
  }


  /**
   * 
   * This is for cloning
   * Note: This code doesn't cover deep cloning. It's a combination of  shallow and deep cloning
   */
  // line 210 "../../../../src/Umple_CodeMethod.ump"
   public  MethodParameter(MethodParameter another){
    super(another.getName(), another.getType(), another.getModifier(), another.getValue());
	this.isAutounique = another.getIsAutounique();
	this.isList = another.getIsList();
	this.isDerived = another.getIsDerived();
	this.isLazy = another.getIsLazy();
  }

  // line 218 "../../../../src/Umple_CodeMethod.ump"
   public String getFullType(){
    return this.getType() + (this.getIsList() ? "[]" : "");
  }


  /**
   * Please maintain this method if you're going to add new features to MethodParameters.
   * This code manually creates a clone of a MethodParameters.
   */
  // line 1859 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
  public MethodParameter clone(){
    MethodParameter mp = new MethodParameter(getName(),getType(),getModifier(),getValue(),getIsAutounique());
		mp.isAutounique = getIsAutounique();
		mp.isList = getIsList();
		mp.isDerived = getIsDerived();
		mp.isLazy = getIsLazy();
		mp.isIvar = getIsIvar();
		return mp;
  }


  public String toString()
  {
    return super.toString() + "["+
            "isAutounique" + ":" + getIsAutounique()+ "," +
            "isList" + ":" + getIsList()+ "," +
            "isDerived" + ":" + getIsDerived()+ "," +
            "isLazy" + ":" + getIsLazy()+ "," +
            "isIvar" + ":" + getIsIvar()+ "]";
  }
}
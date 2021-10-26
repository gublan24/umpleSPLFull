/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;

// line 24 "../../../../../UmpleTLTemplates/Associations.ump"
// line 37 "../../../../../UmpleTLTemplates/Associations.ump"
public class GenAssociationEnd
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenAssociationEnd Attributes
  private String name;
  private String type;
  private String role;
  private String roles;
  private boolean navigable;
  private int lowerBound;
  private int upperBound;
  private GenAssociation association;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenAssociationEnd(String aName, String aType, String aRole, String aRoles, boolean aNavigable)
  {
    name = aName;
    type = aType;
    role = aRole;
    roles = aRoles;
    navigable = aNavigable;
    lowerBound = 0;
    upperBound = 0;
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

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setRole(String aRole)
  {
    boolean wasSet = false;
    role = aRole;
    wasSet = true;
    return wasSet;
  }

  public boolean setRoles(String aRoles)
  {
    boolean wasSet = false;
    roles = aRoles;
    wasSet = true;
    return wasSet;
  }

  public boolean setNavigable(boolean aNavigable)
  {
    boolean wasSet = false;
    navigable = aNavigable;
    wasSet = true;
    return wasSet;
  }

  public boolean setLowerBound(int aLowerBound)
  {
    boolean wasSet = false;
    lowerBound = aLowerBound;
    wasSet = true;
    return wasSet;
  }

  public boolean setUpperBound(int aUpperBound)
  {
    boolean wasSet = false;
    upperBound = aUpperBound;
    wasSet = true;
    return wasSet;
  }

  public boolean setAssociation(GenAssociation aAssociation)
  {
    boolean wasSet = false;
    association = aAssociation;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getType()
  {
    return type;
  }

  public String getRole()
  {
    return role;
  }

  public String getRoles()
  {
    return roles;
  }

  public boolean getNavigable()
  {
    return navigable;
  }

  public int getLowerBound()
  {
    return lowerBound;
  }

  public int getUpperBound()
  {
    return upperBound;
  }

  public GenAssociation getAssociation()
  {
    return association;
  }

  public boolean getUseMinimum()
  {
    return lowerBound>0 && isNavigable();
  }

  public boolean getUseMaximum()
  {
    return upperBound>1 && upperBound!=-1 && isNavigable();
  }

  public boolean getMany()
  {
    return upperBound==-1|| upperBound>1;
  }

  public boolean getOptional()
  {
    return upperBound==1&& lowerBound==0;
  }

  /**
   * 0..1 -- 0..4 Relation1;
   */

  public boolean getRangedOptional()
  {
    return upperBound>1&& upperBound!=-1&& lowerBound==0&& upperBound!=lowerBound;
  }

  /**
   * 0..1 -- 1..* Relation6;
   */

  public boolean getRangedUnbound()
  {
    return upperBound==-1&& lowerBound>=1;
  }

  /**
   * 0..1 -- 1..4 Relation5;	0..1 -- 2..4 Relation7;   	Not:	0..1 -- 1..* Relation6;
   */

  public boolean getRangedMandatory()
  {
    return upperBound>1&& upperBound!=-1&& lowerBound>0&& upperBound!=lowerBound;
  }

  public boolean getOne()
  {
    return upperBound==1&& lowerBound==1;
  }

  /**
   * Looking for whatever -- 4; whatever -- 8; not: whatever -- 1; whatever -- *
   */

  public boolean getFixed()
  {
    return upperBound>1&& lowerBound== upperBound;
  }

  public boolean getUnbound()
  {
    return upperBound==-1&& lowerBound==0;
  }

  public boolean getDirected()
  {
    return !navigable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNavigable()
  {
    return navigable;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isUseMinimum()
  {
    return lowerBound>0 && isNavigable();
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isUseMaximum()
  {
    return upperBound>1 && upperBound!=-1 && isNavigable();
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isMany()
  {
    return upperBound==-1|| upperBound>1;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isOptional()
  {
    return upperBound==1&& lowerBound==0;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isRangedOptional()
  {
    return upperBound>1&& upperBound!=-1&& lowerBound==0&& upperBound!=lowerBound;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isRangedUnbound()
  {
    return upperBound==-1&& lowerBound>=1;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isRangedMandatory()
  {
    return upperBound>1&& upperBound!=-1&& lowerBound>0&& upperBound!=lowerBound;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isOne()
  {
    return upperBound==1&& lowerBound==1;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isFixed()
  {
    return upperBound>1&& lowerBound== upperBound;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isUnbound()
  {
    return upperBound==-1&& lowerBound==0;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isDirected()
  {
    return !navigable;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "type" + ":" + getType()+ "," +
            "role" + ":" + getRole()+ "," +
            "roles" + ":" + getRoles()+ "," +
            "navigable" + ":" + getNavigable()+ "," +
            "lowerBound" + ":" + getLowerBound()+ "," +
            "upperBound" + ":" + getUpperBound()+ "," +
            "useMinimum" + ":" + getUseMinimum()+ "," +
            "useMaximum" + ":" + getUseMaximum()+ "," +
            "many" + ":" + getMany()+ "," +
            "optional" + ":" + getOptional()+ "," +
            "rangedOptional" + ":" + getRangedOptional()+ "," +
            "rangedUnbound" + ":" + getRangedUnbound()+ "," +
            "rangedMandatory" + ":" + getRangedMandatory()+ "," +
            "one" + ":" + getOne()+ "," +
            "fixed" + ":" + getFixed()+ "," +
            "unbound" + ":" + getUnbound()+ "," +
            "directed" + ":" + getDirected()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "association" + "=" + (getAssociation() != null ? !getAssociation().equals(this)  ? getAssociation().toString().replaceAll("  ","    ") : "this" : "null");
  }
}
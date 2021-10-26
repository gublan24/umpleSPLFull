/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;

// line 185 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenPort
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String DIRECTION_IN = "in";
  public static final String DIRECTION_OUT = "out";
  public static final String DIRECTION_BOTH = "both";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenPort Attributes
  private String name;
  private String type;
  private String direction;

  //GenPort Associations
  private GenClass owner;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenPort()
  {
    name = null;
    type = null;
    direction = null;
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

  public boolean setDirection(String aDirection)
  {
    boolean wasSet = false;
    direction = aDirection;
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

  public String getDirection()
  {
    return direction;
  }

  public boolean getComplex()
  {
    return getOwner().getGenPackage().isObject(type);
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isComplex()
  {
    return getOwner().getGenPackage().isObject(type);
  }
  /* Code from template association_GetOne */
  public GenClass getOwner()
  {
    return owner;
  }

  public boolean hasOwner()
  {
    boolean has = owner != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setOwner(GenClass aOwner)
  {
    boolean wasSet = false;
    GenClass existingOwner = owner;
    owner = aOwner;
    if (existingOwner != null && !existingOwner.equals(aOwner))
    {
      existingOwner.removePort(this);
    }
    if (aOwner != null)
    {
      aOwner.addPort(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (owner != null)
    {
      GenClass placeholderOwner = owner;
      this.owner = null;
      placeholderOwner.removePort(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "type" + ":" + getType()+ "," +
            "direction" + ":" + getDirection()+ "," +
            "complex" + ":" + getComplex()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "owner = "+(getOwner()!=null?Integer.toHexString(System.identityHashCode(getOwner())):"null");
  }
}
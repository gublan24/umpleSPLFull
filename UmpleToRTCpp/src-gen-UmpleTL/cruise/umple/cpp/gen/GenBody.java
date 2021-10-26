/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.io.Serializable;

// line 1309 "../../../../../UmpleTLTemplates/Core.ump"
public class GenBody extends AbstractGenBody implements java.io.Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String PRE_BLOCK = "preBlock";
  public static final String BLOCK = "block";
  public static final String BEFORE = "before";
  public static final String AFTER = "after";
  public static final String POST_BLOCK = "postBlock";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenBody Associations
  private GenClass genClass;
  private GenMethod genMethod;
  private GenMethod defaultBodyOwner;
  private GenClass ownerGenBody;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenBody(String aBody)
  {
    super(aBody);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public GenClass getGenClass()
  {
    return genClass;
  }

  public boolean hasGenClass()
  {
    boolean has = genClass != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenMethod getGenMethod()
  {
    return genMethod;
  }

  public boolean hasGenMethod()
  {
    boolean has = genMethod != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenMethod getDefaultBodyOwner()
  {
    return defaultBodyOwner;
  }

  public boolean hasDefaultBodyOwner()
  {
    boolean has = defaultBodyOwner != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenClass getOwnerGenBody()
  {
    return ownerGenBody;
  }

  public boolean hasOwnerGenBody()
  {
    boolean has = ownerGenBody != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenClass(GenClass aGenClass)
  {
    boolean wasSet = false;
    GenClass existingGenClass = genClass;
    genClass = aGenClass;
    if (existingGenClass != null && !existingGenClass.equals(aGenClass))
    {
      existingGenClass.removePredefinition(this);
    }
    if (aGenClass != null)
    {
      aGenClass.addPredefinition(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenMethod(GenMethod aGenMethod)
  {
    boolean wasSet = false;
    GenMethod existingGenMethod = genMethod;
    genMethod = aGenMethod;
    if (existingGenMethod != null && !existingGenMethod.equals(aGenMethod))
    {
      existingGenMethod.removeBody(this);
    }
    if (aGenMethod != null)
    {
      aGenMethod.addBody(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setDefaultBodyOwner(GenMethod aDefaultBodyOwner)
  {
    boolean wasSet = false;
    GenMethod existingDefaultBodyOwner = defaultBodyOwner;
    defaultBodyOwner = aDefaultBodyOwner;
    if (existingDefaultBodyOwner != null && !existingDefaultBodyOwner.equals(aDefaultBodyOwner))
    {
      existingDefaultBodyOwner.removeDefaultImplementation(this);
    }
    if (aDefaultBodyOwner != null)
    {
      aDefaultBodyOwner.addDefaultImplementation(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setOwnerGenBody(GenClass aOwnerGenBody)
  {
    boolean wasSet = false;
    GenClass existingOwnerGenBody = ownerGenBody;
    ownerGenBody = aOwnerGenBody;
    if (existingOwnerGenBody != null && !existingOwnerGenBody.equals(aOwnerGenBody))
    {
      existingOwnerGenBody.removeConstructorContent(this);
    }
    if (aOwnerGenBody != null)
    {
      aOwnerGenBody.addConstructorContent(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (genClass != null)
    {
      GenClass placeholderGenClass = genClass;
      this.genClass = null;
      placeholderGenClass.removePredefinition(this);
    }
    if (genMethod != null)
    {
      GenMethod placeholderGenMethod = genMethod;
      this.genMethod = null;
      placeholderGenMethod.removeBody(this);
    }
    if (defaultBodyOwner != null)
    {
      GenMethod placeholderDefaultBodyOwner = defaultBodyOwner;
      this.defaultBodyOwner = null;
      placeholderDefaultBodyOwner.removeDefaultImplementation(this);
    }
    if (ownerGenBody != null)
    {
      GenClass placeholderOwnerGenBody = ownerGenBody;
      this.ownerGenBody = null;
      placeholderOwnerGenBody.removeConstructorContent(this);
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "genClass = "+(getGenClass()!=null?Integer.toHexString(System.identityHashCode(getGenClass())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "genMethod = "+(getGenMethod()!=null?Integer.toHexString(System.identityHashCode(getGenMethod())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "defaultBodyOwner = "+(getDefaultBodyOwner()!=null?Integer.toHexString(System.identityHashCode(getDefaultBodyOwner())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "ownerGenBody = "+(getOwnerGenBody()!=null?Integer.toHexString(System.identityHashCode(getOwnerGenBody())):"null");
  }
}
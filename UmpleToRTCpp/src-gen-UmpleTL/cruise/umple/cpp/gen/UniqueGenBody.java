/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.io.Serializable;

// line 1344 "../../../../../UmpleTLTemplates/Core.ump"
public class UniqueGenBody extends GenBody implements java.io.Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UniqueGenBody Attributes
  private String id;

  //UniqueGenBody Associations
  private GenPackage genPackage;
  private GenPackage externalPackage;
  private GenClass ownerUniqueGenBody;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UniqueGenBody(String aBody, String aId)
  {
    super(aBody);
    cachedHashCode = -1;
    canSetId = true;
    id = aId;
    // line 1350 "../../../../../UmpleTLTemplates/Core.ump"
    if(id== null){
    			setId(getBody());
    		}
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    if (!canSetId) { return false; }
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public String getId()
  {
    return id;
  }
  /* Code from template association_GetOne */
  public GenPackage getGenPackage()
  {
    return genPackage;
  }

  public boolean hasGenPackage()
  {
    boolean has = genPackage != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenPackage getExternalPackage()
  {
    return externalPackage;
  }

  public boolean hasExternalPackage()
  {
    boolean has = externalPackage != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenClass getOwnerUniqueGenBody()
  {
    return ownerUniqueGenBody;
  }

  public boolean hasOwnerUniqueGenBody()
  {
    boolean has = ownerUniqueGenBody != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenPackage(GenPackage aGenPackage)
  {
    boolean wasSet = false;
    GenPackage existingGenPackage = genPackage;
    genPackage = aGenPackage;
    if (existingGenPackage != null && !existingGenPackage.equals(aGenPackage))
    {
      existingGenPackage.removePredefinition(this);
    }
    if (aGenPackage != null)
    {
      aGenPackage.addPredefinition(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setExternalPackage(GenPackage aExternalPackage)
  {
    boolean wasSet = false;
    GenPackage existingExternalPackage = externalPackage;
    externalPackage = aExternalPackage;
    if (existingExternalPackage != null && !existingExternalPackage.equals(aExternalPackage))
    {
      existingExternalPackage.removeExternalDefinition(this);
    }
    if (aExternalPackage != null)
    {
      aExternalPackage.addExternalDefinition(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setOwnerUniqueGenBody(GenClass aOwnerUniqueGenBody)
  {
    boolean wasSet = false;
    GenClass existingOwnerUniqueGenBody = ownerUniqueGenBody;
    ownerUniqueGenBody = aOwnerUniqueGenBody;
    if (existingOwnerUniqueGenBody != null && !existingOwnerUniqueGenBody.equals(aOwnerUniqueGenBody))
    {
      existingOwnerUniqueGenBody.removeUniqueConstructorContent(this);
    }
    if (aOwnerUniqueGenBody != null)
    {
      aOwnerUniqueGenBody.addUniqueConstructorContent(this);
    }
    wasSet = true;
    return wasSet;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    UniqueGenBody compareTo = (UniqueGenBody)obj;
  
    if (getId() == null && compareTo.getId() != null)
    {
      return false;
    }
    else if (getId() != null && !getId().equals(compareTo.getId()))
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
    if (getId() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getId().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetId = false;
    return cachedHashCode;
  }

  public void delete()
  {
    if (genPackage != null)
    {
      GenPackage placeholderGenPackage = genPackage;
      this.genPackage = null;
      placeholderGenPackage.removePredefinition(this);
    }
    if (externalPackage != null)
    {
      GenPackage placeholderExternalPackage = externalPackage;
      this.externalPackage = null;
      placeholderExternalPackage.removeExternalDefinition(this);
    }
    if (ownerUniqueGenBody != null)
    {
      GenClass placeholderOwnerUniqueGenBody = ownerUniqueGenBody;
      this.ownerUniqueGenBody = null;
      placeholderOwnerUniqueGenBody.removeUniqueConstructorContent(this);
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "genPackage = "+(getGenPackage()!=null?Integer.toHexString(System.identityHashCode(getGenPackage())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "externalPackage = "+(getExternalPackage()!=null?Integer.toHexString(System.identityHashCode(getExternalPackage())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "ownerUniqueGenBody = "+(getOwnerUniqueGenBody()!=null?Integer.toHexString(System.identityHashCode(getOwnerUniqueGenBody())):"null");
  }
}
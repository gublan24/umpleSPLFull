/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.io.Serializable;

// line 1340 "../../../../../UmpleTLTemplates/Core.ump"
public class GenRequirement extends AbstractGenBody implements java.io.Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenRequirement Associations
  private GenClass genClass;
  private GenMethod genMethod;
  private GenStruct genStruct;
  private GenAssociation genAssociation;
  private GenField genField;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenRequirement(String aBody)
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
  public GenStruct getGenStruct()
  {
    return genStruct;
  }

  public boolean hasGenStruct()
  {
    boolean has = genStruct != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenAssociation getGenAssociation()
  {
    return genAssociation;
  }

  public boolean hasGenAssociation()
  {
    boolean has = genAssociation != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenField getGenField()
  {
    return genField;
  }

  public boolean hasGenField()
  {
    boolean has = genField != null;
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
      existingGenClass.removeRequirement(this);
    }
    if (aGenClass != null)
    {
      aGenClass.addRequirement(this);
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
      existingGenMethod.removeRequirement(this);
    }
    if (aGenMethod != null)
    {
      aGenMethod.addRequirement(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenStruct(GenStruct aGenStruct)
  {
    boolean wasSet = false;
    GenStruct existingGenStruct = genStruct;
    genStruct = aGenStruct;
    if (existingGenStruct != null && !existingGenStruct.equals(aGenStruct))
    {
      existingGenStruct.removeRequirement(this);
    }
    if (aGenStruct != null)
    {
      aGenStruct.addRequirement(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenAssociation(GenAssociation aGenAssociation)
  {
    boolean wasSet = false;
    GenAssociation existingGenAssociation = genAssociation;
    genAssociation = aGenAssociation;
    if (existingGenAssociation != null && !existingGenAssociation.equals(aGenAssociation))
    {
      existingGenAssociation.removeRequirement(this);
    }
    if (aGenAssociation != null)
    {
      aGenAssociation.addRequirement(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenField(GenField aGenField)
  {
    boolean wasSet = false;
    GenField existingGenField = genField;
    genField = aGenField;
    if (existingGenField != null && !existingGenField.equals(aGenField))
    {
      existingGenField.removeRequirement(this);
    }
    if (aGenField != null)
    {
      aGenField.addRequirement(this);
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
      placeholderGenClass.removeRequirement(this);
    }
    if (genMethod != null)
    {
      GenMethod placeholderGenMethod = genMethod;
      this.genMethod = null;
      placeholderGenMethod.removeRequirement(this);
    }
    if (genStruct != null)
    {
      GenStruct placeholderGenStruct = genStruct;
      this.genStruct = null;
      placeholderGenStruct.removeRequirement(this);
    }
    if (genAssociation != null)
    {
      GenAssociation placeholderGenAssociation = genAssociation;
      this.genAssociation = null;
      placeholderGenAssociation.removeRequirement(this);
    }
    if (genField != null)
    {
      GenField placeholderGenField = genField;
      this.genField = null;
      placeholderGenField.removeRequirement(this);
    }
    super.delete();
  }

}
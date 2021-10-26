/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.*;
import java.io.Serializable;

// line 197 "../../../../../UmpleTLTemplates/Attributes.ump"
public class ActiveGenMethd extends GenMethod
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ActiveGenMethd Attributes
  private String baseName;
  private String inverseMethod;

  //ActiveGenMethd Associations
  private GenClass definitionClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ActiveGenMethd()
  {
    super();
    baseName = null;
    inverseMethod = null;
    // line 204 "../../../../../UmpleTLTemplates/Attributes.ump"
    setBaseName(getName());
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setBaseName(String aBaseName)
  {
    boolean wasSet = false;
    baseName = aBaseName;
    wasSet = true;
    return wasSet;
  }

  public boolean setInverseMethod(String aInverseMethod)
  {
    boolean wasSet = false;
    inverseMethod = aInverseMethod;
    wasSet = true;
    return wasSet;
  }

  public String getBaseName()
  {
    return baseName;
  }

  public String getInverseMethod()
  {
    return inverseMethod;
  }
  /* Code from template association_GetOne */
  public GenClass getDefinitionClass()
  {
    return definitionClass;
  }

  public boolean hasDefinitionClass()
  {
    boolean has = definitionClass != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setDefinitionClass(GenClass aDefinitionClass)
  {
    boolean wasSet = false;
    GenClass existingDefinitionClass = definitionClass;
    definitionClass = aDefinitionClass;
    if (existingDefinitionClass != null && !existingDefinitionClass.equals(aDefinitionClass))
    {
      existingDefinitionClass.removeRelatedActiveMethod(this);
    }
    if (aDefinitionClass != null)
    {
      aDefinitionClass.addRelatedActiveMethod(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (definitionClass != null)
    {
      GenClass placeholderDefinitionClass = definitionClass;
      this.definitionClass = null;
      placeholderDefinitionClass.removeRelatedActiveMethod(this);
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "baseName" + ":" + getBaseName()+ "," +
            "inverseMethod" + ":" + getInverseMethod()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "definitionClass = "+(getDefinitionClass()!=null?Integer.toHexString(System.identityHashCode(getDefinitionClass())):"null");
  }
}
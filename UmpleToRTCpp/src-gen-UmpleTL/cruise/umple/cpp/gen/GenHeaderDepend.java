/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.io.Serializable;

// line 1469 "../../../../../UmpleTLTemplates/Core.ump"
public class GenHeaderDepend extends GenDepend implements java.io.Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenHeaderDepend Associations
  private GenClass genHeaderDependClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenHeaderDepend(String aName)
  {
    super(aName);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public GenClass getGenHeaderDependClass()
  {
    return genHeaderDependClass;
  }

  public boolean hasGenHeaderDependClass()
  {
    boolean has = genHeaderDependClass != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenHeaderDependClass(GenClass aGenHeaderDependClass)
  {
    boolean wasSet = false;
    GenClass existingGenHeaderDependClass = genHeaderDependClass;
    genHeaderDependClass = aGenHeaderDependClass;
    if (existingGenHeaderDependClass != null && !existingGenHeaderDependClass.equals(aGenHeaderDependClass))
    {
      existingGenHeaderDependClass.removeHeaderDependency(this);
    }
    if (aGenHeaderDependClass != null)
    {
      aGenHeaderDependClass.addHeaderDependency(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (genHeaderDependClass != null)
    {
      GenClass placeholderGenHeaderDependClass = genHeaderDependClass;
      this.genHeaderDependClass = null;
      placeholderGenHeaderDependClass.removeHeaderDependency(this);
    }
    super.delete();
  }

}
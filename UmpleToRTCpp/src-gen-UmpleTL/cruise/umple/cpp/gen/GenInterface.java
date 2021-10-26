/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.io.Serializable;
import java.util.*;

// line 544 "../../../../../UmpleTLTemplates/Core.ump"
public class GenInterface extends GenClass implements java.io.Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenInterface Associations
  private GenClass genClassInterface;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenInterface()
  {
    super();
    // line 547 "../../../../../UmpleTLTemplates/Core.ump"
    setIsAbstract(true);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public GenClass getGenClassInterface()
  {
    return genClassInterface;
  }

  public boolean hasGenClassInterface()
  {
    boolean has = genClassInterface != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenClassInterface(GenClass aGenClassInterface)
  {
    boolean wasSet = false;
    GenClass existingGenClassInterface = genClassInterface;
    genClassInterface = aGenClassInterface;
    if (existingGenClassInterface != null && !existingGenClassInterface.equals(aGenClassInterface))
    {
      existingGenClassInterface.removeInterface(this);
    }
    if (aGenClassInterface != null)
    {
      aGenClassInterface.addInterface(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (genClassInterface != null)
    {
      GenClass placeholderGenClassInterface = genClassInterface;
      this.genClassInterface = null;
      placeholderGenClassInterface.removeInterface(this);
    }
    super.delete();
  }

}
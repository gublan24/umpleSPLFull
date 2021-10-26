/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.*;
import java.io.Serializable;

// line 177 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenComplexPort extends GenField
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenComplexPort Associations
  private GenClass owner;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenComplexPort()
  {
    super();
    // line 180 "../../../../../UmpleTLTemplates/Attributes.ump"
    setGeneratable(false);
    		setIsComparable(false);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------
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
      existingOwner.removeComplexPort(this);
    }
    if (aOwner != null)
    {
      aOwner.addComplexPort(this);
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
      placeholderOwner.removeComplexPort(this);
    }
    super.delete();
  }

}
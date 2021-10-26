/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.*;

// line 540 "../../../../../UmpleTLTemplates/Core.ump"
public class GenParentMethodParameter extends GenMethodParameter
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenParentMethodParameter Associations
  private GenConstructor genParentMethodContr;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenParentMethodParameter(String aType, String aName)
  {
    super(aType, aName);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public GenConstructor getGenParentMethodContr()
  {
    return genParentMethodContr;
  }

  public boolean hasGenParentMethodContr()
  {
    boolean has = genParentMethodContr != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenParentMethodContr(GenConstructor aGenParentMethodContr)
  {
    boolean wasSet = false;
    GenConstructor existingGenParentMethodContr = genParentMethodContr;
    genParentMethodContr = aGenParentMethodContr;
    if (existingGenParentMethodContr != null && !existingGenParentMethodContr.equals(aGenParentMethodContr))
    {
      existingGenParentMethodContr.removeParentParameter(this);
    }
    if (aGenParentMethodContr != null)
    {
      aGenParentMethodContr.addParentParameter(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (genParentMethodContr != null)
    {
      GenConstructor placeholderGenParentMethodContr = genParentMethodContr;
      this.genParentMethodContr = null;
      placeholderGenParentMethodContr.removeParentParameter(this);
    }
    super.delete();
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.io.Serializable;

/**
 * /////////////////////////////////////////////
 */
// line 41 "../../../../../UmpleTLTemplates/Core.ump"
public class GenSpecializedDefinition implements java.io.Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenSpecializedDefinition Attributes
  private String content;
  private int priority;

  //GenSpecializedDefinition Associations
  private GenClass genClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenSpecializedDefinition(String aContent)
  {
    content = aContent;
    priority = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setContent(String aContent)
  {
    boolean wasSet = false;
    content = aContent;
    wasSet = true;
    return wasSet;
  }

  public boolean setPriority(int aPriority)
  {
    boolean wasSet = false;
    priority = aPriority;
    wasSet = true;
    return wasSet;
  }

  public String getContent()
  {
    return content;
  }

  public int getPriority()
  {
    return priority;
  }
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
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenClass(GenClass aGenClass)
  {
    boolean wasSet = false;
    GenClass existingGenClass = genClass;
    genClass = aGenClass;
    if (existingGenClass != null && !existingGenClass.equals(aGenClass))
    {
      existingGenClass.removeSpecializedDefinition(this);
    }
    if (aGenClass != null)
    {
      aGenClass.addSpecializedDefinition(this);
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
      placeholderGenClass.removeSpecializedDefinition(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "content" + ":" + getContent()+ "," +
            "priority" + ":" + getPriority()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "genClass = "+(getGenClass()!=null?Integer.toHexString(System.identityHashCode(getGenClass())):"null");
  }
}
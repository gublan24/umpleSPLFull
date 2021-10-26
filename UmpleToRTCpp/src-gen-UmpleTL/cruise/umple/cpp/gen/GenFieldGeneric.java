/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;

// line 1274 "../../../../../UmpleTLTemplates/Core.ump"
public class GenFieldGeneric
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenFieldGeneric Attributes
  private String type;
  private int priority;

  //GenFieldGeneric Associations
  private GenField genField;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenFieldGeneric(String aType)
  {
    type = aType;
    priority = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
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

  public String getType()
  {
    return type;
  }

  public int getPriority()
  {
    return priority;
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
  public boolean setGenField(GenField aGenField)
  {
    boolean wasSet = false;
    GenField existingGenField = genField;
    genField = aGenField;
    if (existingGenField != null && !existingGenField.equals(aGenField))
    {
      existingGenField.removeGeneric(this);
    }
    if (aGenField != null)
    {
      aGenField.addGeneric(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (genField != null)
    {
      GenField placeholderGenField = genField;
      this.genField = null;
      placeholderGenField.removeGeneric(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "type" + ":" + getType()+ "," +
            "priority" + ":" + getPriority()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "genField = "+(getGenField()!=null?Integer.toHexString(System.identityHashCode(getGenField())):"null");
  }
}
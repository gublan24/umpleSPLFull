/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;

/**
 * /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * CPP-specfific
 */
// line 1388 "../../../../../UmpleTLTemplates/Core.ump"
public class GenFieldInitializer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenFieldInitializer Attributes
  private String value;
  private int priority;

  //GenFieldInitializer Associations
  private MemberInitializer memberInitializer;
  private GenField genField;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenFieldInitializer(String aValue)
  {
    value = aValue;
    priority = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
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

  public String getValue()
  {
    return value;
  }

  public int getPriority()
  {
    return priority;
  }
  /* Code from template association_GetOne */
  public MemberInitializer getMemberInitializer()
  {
    return memberInitializer;
  }

  public boolean hasMemberInitializer()
  {
    boolean has = memberInitializer != null;
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
  public boolean setMemberInitializer(MemberInitializer aMemberInitializer)
  {
    boolean wasSet = false;
    MemberInitializer existingMemberInitializer = memberInitializer;
    memberInitializer = aMemberInitializer;
    if (existingMemberInitializer != null && !existingMemberInitializer.equals(aMemberInitializer))
    {
      existingMemberInitializer.removeInitializer(this);
    }
    if (aMemberInitializer != null)
    {
      aMemberInitializer.addInitializer(this);
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
      existingGenField.removeInitializer(this);
    }
    if (aGenField != null)
    {
      aGenField.addInitializer(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (memberInitializer != null)
    {
      MemberInitializer placeholderMemberInitializer = memberInitializer;
      this.memberInitializer = null;
      placeholderMemberInitializer.removeInitializer(this);
    }
    if (genField != null)
    {
      GenField placeholderGenField = genField;
      this.genField = null;
      placeholderGenField.removeInitializer(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "value" + ":" + getValue()+ "," +
            "priority" + ":" + getPriority()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "memberInitializer = "+(getMemberInitializer()!=null?Integer.toHexString(System.identityHashCode(getMemberInitializer())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "genField = "+(getGenField()!=null?Integer.toHexString(System.identityHashCode(getGenField())):"null");
  }
}
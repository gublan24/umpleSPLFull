/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.io.Serializable;

// line 95 "../../../../../UmpleTLTemplates/Core.ump"
public class GenEnumEntry implements java.io.Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenEnumEntry Attributes
  private String name;
  private int priority;

  //GenEnumEntry Associations
  private GenEnum genEnum;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenEnumEntry(String aName)
  {
    cachedHashCode = -1;
    canSetName = true;
    name = aName;
    priority = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    if (!canSetName) { return false; }
    name = aName;
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

  public String getName()
  {
    return name;
  }

  public int getPriority()
  {
    return priority;
  }
  /* Code from template association_GetOne */
  public GenEnum getGenEnum()
  {
    return genEnum;
  }

  public boolean hasGenEnum()
  {
    boolean has = genEnum != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenEnum(GenEnum aGenEnum)
  {
    boolean wasSet = false;
    GenEnum existingGenEnum = genEnum;
    genEnum = aGenEnum;
    if (existingGenEnum != null && !existingGenEnum.equals(aGenEnum))
    {
      existingGenEnum.removeEntry(this);
    }
    if (aGenEnum != null)
    {
      aGenEnum.addEntry(this);
    }
    wasSet = true;
    return wasSet;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    GenEnumEntry compareTo = (GenEnumEntry)obj;
  
    if (getName() == null && compareTo.getName() != null)
    {
      return false;
    }
    else if (getName() != null && !getName().equals(compareTo.getName()))
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
    if (getName() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getName().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetName = false;
    return cachedHashCode;
  }

  public void delete()
  {
    if (genEnum != null)
    {
      GenEnum placeholderGenEnum = genEnum;
      this.genEnum = null;
      placeholderGenEnum.removeEntry(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "priority" + ":" + getPriority()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "genEnum = "+(getGenEnum()!=null?Integer.toHexString(System.identityHashCode(getGenEnum())):"null");
  }
}
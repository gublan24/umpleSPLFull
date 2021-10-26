/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * A depend relationship indicates a package on which this class depends
 * 
 */
// line 857 "../../../../src/Umple.ump"
// line 351 "../../../../src/Umple_Code.ump"
public class Depend
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Depend Attributes
  private String name;
  private boolean isInternal;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Depend(String aName)
  {
    cachedHashCode = -1;
    canSetName = true;
    name = aName;
    isInternal = false;
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

  public boolean setIsInternal(boolean aIsInternal)
  {
    boolean wasSet = false;
    isInternal = aIsInternal;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public boolean getIsInternal()
  {
    return isInternal;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInternal()
  {
    return isInternal;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Depend compareTo = (Depend)obj;
  
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
  {}

  // line 355 "../../../../src/Umple_Code.ump"
   public String getPackageName(){
    if (name == null || "".equals(name))
    {
      return "";
    }
    int dotIndex = name.lastIndexOf(".");
    return dotIndex >= 0 ? name.substring(0,dotIndex) : name;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "isInternal" + ":" + getIsInternal()+ "]";
  }
}
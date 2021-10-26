/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;

// line 156 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenConstraintVariable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenConstraintVariable Attributes
  private String name;
  private boolean plural;
  private int priority;

  //GenConstraintVariable Associations
  private AbstractGenConstraint constraint;
  private AbstractGenConstraint listenerOwner;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenConstraintVariable()
  {
    cachedHashCode = -1;
    canSetName = true;
    name = null;
    plural = false;
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

  public boolean setPlural(boolean aPlural)
  {
    boolean wasSet = false;
    plural = aPlural;
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

  public boolean getPlural()
  {
    return plural;
  }

  public int getPriority()
  {
    return priority;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isPlural()
  {
    return plural;
  }
  /* Code from template association_GetOne */
  public AbstractGenConstraint getConstraint()
  {
    return constraint;
  }

  public boolean hasConstraint()
  {
    boolean has = constraint != null;
    return has;
  }
  /* Code from template association_GetOne */
  public AbstractGenConstraint getListenerOwner()
  {
    return listenerOwner;
  }

  public boolean hasListenerOwner()
  {
    boolean has = listenerOwner != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setConstraint(AbstractGenConstraint aConstraint)
  {
    boolean wasSet = false;
    AbstractGenConstraint existingConstraint = constraint;
    constraint = aConstraint;
    if (existingConstraint != null && !existingConstraint.equals(aConstraint))
    {
      existingConstraint.removeVariable(this);
    }
    if (aConstraint != null)
    {
      aConstraint.addVariable(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setListenerOwner(AbstractGenConstraint aListenerOwner)
  {
    boolean wasSet = false;
    AbstractGenConstraint existingListenerOwner = listenerOwner;
    listenerOwner = aListenerOwner;
    if (existingListenerOwner != null && !existingListenerOwner.equals(aListenerOwner))
    {
      existingListenerOwner.removeListener(this);
    }
    if (aListenerOwner != null)
    {
      aListenerOwner.addListener(this);
    }
    wasSet = true;
    return wasSet;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    GenConstraintVariable compareTo = (GenConstraintVariable)obj;
  
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
    if (constraint != null)
    {
      AbstractGenConstraint placeholderConstraint = constraint;
      this.constraint = null;
      placeholderConstraint.removeVariable(this);
    }
    if (listenerOwner != null)
    {
      AbstractGenConstraint placeholderListenerOwner = listenerOwner;
      this.listenerOwner = null;
      placeholderListenerOwner.removeListener(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "plural" + ":" + getPlural()+ "," +
            "priority" + ":" + getPriority()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "constraint = "+(getConstraint()!=null?Integer.toHexString(System.identityHashCode(getConstraint())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "listenerOwner = "+(getListenerOwner()!=null?Integer.toHexString(System.identityHashCode(getListenerOwner())):"null");
  }
}
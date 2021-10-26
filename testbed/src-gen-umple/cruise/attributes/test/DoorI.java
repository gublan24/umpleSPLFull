/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;

// line 66 "../../../../src/TestHarnessAttributes.ump"
public class DoorI extends DoorH
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DoorI(String aId)
  {
    super(aId);
    cachedHashCode = -1;
    canSetId = true;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    DoorI compareTo = (DoorI)obj;
  
    if (getId() == null && compareTo.getId() != null)
    {
      return false;
    }
    else if (getId() != null && !getId().equals(compareTo.getId()))
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
    if (getId() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getId().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetId = false;
    return cachedHashCode;
  }

  public void delete()
  {
    super.delete();
  }

}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;

// line 14 "../../../../src/TestHarnessAttributes.ump"
public class DoorB
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorB Attributes
  private int id;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DoorB(int aId)
  {
    cachedHashCode = -1;
    canSetId = true;
    id = aId;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(int aId)
  {
    boolean wasSet = false;
    if (!canSetId) { return false; }
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public int getId()
  {
    return id;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    DoorB compareTo = (DoorB)obj;
  
    if (getId() != compareTo.getId())
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
    cachedHashCode = cachedHashCode * 23 + getId();

    canSetId = false;
    return cachedHashCode;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "]";
  }
}
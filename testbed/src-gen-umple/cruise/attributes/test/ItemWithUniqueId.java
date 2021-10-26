/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;
import java.util.*;

// line 134 "../../../../src/TestHarnessAttributes.ump"
public class ItemWithUniqueId
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static Map<String, ItemWithUniqueId> itemwithuniqueidsById = new HashMap<String, ItemWithUniqueId>();

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ItemWithUniqueId Attributes
  private String id;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ItemWithUniqueId(String aId)
  {
    if (!setId(aId))
    {
      throw new RuntimeException("Cannot create due to duplicate id. See http://manual.umple.org?RE003ViolationofUniqueness.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    String anOldId = getId();
    if (anOldId != null && anOldId.equals(aId)) {
      return true;
    }
    if (hasWithId(aId)) {
      return wasSet;
    }
    id = aId;
    wasSet = true;
    if (anOldId != null) {
      itemwithuniqueidsById.remove(anOldId);
    }
    itemwithuniqueidsById.put(aId, this);
    return wasSet;
  }

  public String getId()
  {
    return id;
  }
  /* Code from template attribute_GetUnique */
  public static ItemWithUniqueId getWithId(String aId)
  {
    return itemwithuniqueidsById.get(aId);
  }
  /* Code from template attribute_HasUnique */
  public static boolean hasWithId(String aId)
  {
    return getWithId(aId) != null;
  }

  public void delete()
  {
    itemwithuniqueidsById.remove(getId());
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "]";
  }
}
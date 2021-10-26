/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;

// line 61 "../../../../src/TestHarnessAttributes.ump"
public class DoorH
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorH Attributes
  private String id;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DoorH(String aId)
  {
    id = aId;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public String getId()
  {
    return id;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "]";
  }
}
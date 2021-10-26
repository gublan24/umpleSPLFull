/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 235 "../../../../src/Structure.ump"
public class MessageField
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MessageField Attributes
  private String name;
  private String type;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MessageField(String aName, String aType)
  {
    name = aName;
    type = aType;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getType()
  {
    return type;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "type" + ":" + getType()+ "]";
  }
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 12 "../../../../src/Generator_CodeStructureDiagram.ump"
public class PairDescriptor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PairDescriptor Attributes
  private String id;
  private String value;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PairDescriptor(String aId, String aValue)
  {
    id = aId;
    value = aValue;
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

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public String getId()
  {
    return id;
  }

  public String getValue()
  {
    return value;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "value" + ":" + getValue()+ "]";
  }
}
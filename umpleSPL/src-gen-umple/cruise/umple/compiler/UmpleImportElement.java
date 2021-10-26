/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Defines import prototype for package, class, interface 
 * and associations
 */
// line 125 "../../../../src/UmpleImport.ump"
public abstract class UmpleImportElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleImportElement Attributes
  private String id;
  private String name;
  private StringBuilder umpleBuilder;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleImportElement(String aId, String aName)
  {
    id = aId;
    name = aName;
    umpleBuilder = new StringBuilder();
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

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setUmpleBuilder(StringBuilder aUmpleBuilder)
  {
    boolean wasSet = false;
    umpleBuilder = aUmpleBuilder;
    wasSet = true;
    return wasSet;
  }

  /**
   * identifier from xmi
   */
  public String getId()
  {
    return id;
  }

  /**
   * name attribute from xmi
   */
  public String getName()
  {
    return name;
  }

  public StringBuilder getUmpleBuilder()
  {
    return umpleBuilder;
  }

  public void delete()
  {}

  public abstract String generateUmple();


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleBuilder" + "=" + (getUmpleBuilder() != null ? !getUmpleBuilder().equals(this)  ? getUmpleBuilder().toString().replaceAll("  ","    ") : "this" : "null");
  }
}